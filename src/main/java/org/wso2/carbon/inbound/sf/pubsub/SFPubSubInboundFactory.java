/*
 *  Copyright (c) 2025, WSO2 LLC. (https://www.wso2.com).
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.wso2.carbon.inbound.sf.pubsub;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.apache.synapse.MessageContext;
import org.apache.synapse.config.Entry;
import org.apache.synapse.core.SynapseEnvironment;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.registry.AbstractRegistry;
import org.apache.synapse.util.InlineExpressionUtil;
import org.json.JSONArray;
import org.wso2.carbon.connector.core.ConnectException;
import org.wso2.carbon.inbound.endpoint.protocol.generic.GenericPollingConsumer;
import org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf.PubSubGrpc;
import org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf.ReplayPreset;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Logger;

import java.util.concurrent.TimeUnit;

import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.DEVELOPER_NAME;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.MANAGE_SUBSCRIPTION;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.NUM_REQUESTED;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.PORT_NUMBER;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.REGISTRY_PATH;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.REPLAY_ID;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.REPLAY_ID_PREFIX;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.REPLAY_PRESET;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.RETRIEVE_WITH_LAST_REPLAY_ID;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.RPC_METHOD;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.SF_HEADERS;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.SF_PASSWORD;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.SF_SECURITY_TOKEN;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.SF_USERNAME;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.SUBSCRIBE;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.SUBSCRIPTION_ID;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.TLS_ENABLED;
import static org.wso2.carbon.inbound.sf.pubsub.SFConstants.TOPIC_NAME;

/**
 * This class is responsible for managing the inbound connection to Salesforce Pub/Sub API.
 * It handles subscribing to topics and managing subscriptions.
 */
public class SFPubSubInboundFactory  extends GenericPollingConsumer {
    private static final Logger LOGGER = Logger.getLogger(SFPubSubInboundFactory.class.getName());
    private final String topicName;
    private int replayPreset;
    private final int numRequested;
    private ByteString replayId;
    private final String server;
    private final String port;
    private final String headers;
    private final String username;
    private final String password;
    private final String securityToken;
    private final boolean tlsEnabled;
    private PubSubGrpc.PubSubStub asyncStub = null;
    private ManagedChannel channel = null;
    private final String subscription_id;
    private final String developer_name;
    private final String rpcMethod;
    private static boolean nextPolling = false;
    private PubSubGrpc.PubSubBlockingStub blockingStub = null;
    private final boolean isRetrieveWithLastReplayId;
    private final AbstractRegistry registry;

    public SFPubSubInboundFactory(Properties properties, String name, SynapseEnvironment synapseEnvironment,
                                  long scanInterval, String injectingSeq, String onErrorSeq, boolean coordination,
                                  boolean sequential) {
        super(properties, name, synapseEnvironment, scanInterval, injectingSeq, onErrorSeq, coordination, sequential);
        this.topicName = properties.getProperty(TOPIC_NAME);
        this.replayPreset = getReplayPresetType(properties.getProperty(REPLAY_PRESET));
        this.numRequested = TypeConverter.convert(properties.getProperty(NUM_REQUESTED), Integer.class);
        this.replayId = properties.getProperty(REPLAY_ID) == null? null :
                ByteString.copyFrom(TypeConverter.convert(properties.getProperty(REPLAY_ID), byte[].class));
        this.server = properties.getProperty(SFConstants.SF_SERVER);
        this.port = properties.getProperty(PORT_NUMBER);
        this.headers = properties.getProperty(SF_HEADERS);
        this.username = properties.getProperty(SF_USERNAME);
        this.password = properties.getProperty(SF_PASSWORD);
        this.securityToken = properties.getProperty(SF_SECURITY_TOKEN);
        this.tlsEnabled = Boolean.parseBoolean(properties.getProperty(TLS_ENABLED));
        this.rpcMethod = properties.getProperty(RPC_METHOD);
        this.subscription_id = properties.getProperty(SUBSCRIPTION_ID);
        this.developer_name = properties.getProperty(DEVELOPER_NAME);
        this.isRetrieveWithLastReplayId = Boolean.parseBoolean(properties.getProperty(RETRIEVE_WITH_LAST_REPLAY_ID));
        this.registry = (AbstractRegistry) synapseEnvironment.getSynapseConfiguration().getRegistry();

    }

    @Override
    public Object poll() {
        if(nextPolling || (channel != null && (!channel.isTerminated() || !channel.isShutdown()))) {
            return null;
        }
        String registryPath = REGISTRY_PATH;
        if (isRetrieveWithLastReplayId) {
            String resourcePath = registryPath + "/" + name;
                Object registryResource = registry.getResource(new Entry(resourcePath), null);
                if (registryResource != null) {
                    Properties resourceProperties = registry.getResourceProperties(resourcePath);
                    assert resourceProperties != null;
                    String lastReplayId = resourceProperties.getProperty(REPLAY_ID_PREFIX);
                    if (lastReplayId != null) {
                        byte[] decodedBytes = Base64.getDecoder().decode(lastReplayId);
                        replayId = ByteString.copyFrom(decodedBytes);
                        replayPreset = ReplayPreset.CUSTOM_VALUE;
                    }
                }
        }
        MessageContext msgCtx = createMessageContext();
        int portInt = Integer.parseInt(port);
        String target = server + ":" + portInt;
        Metadata metadata;

        // Create a gRPC channel
        if (asyncStub == null) {
            try {
                metadata = headers != null ? getHeaderMetadata(headers, msgCtx): null;
            } catch (ConnectException e) {
                throw new RuntimeException(e);
            }
            if ( username != null && password != null) {
                BasicAuthLogin basicAuthLogin = new BasicAuthLogin();
                BasicAuthLogin.LoginResponse loginResponse;
                try {
                    metadata = metadata == null? new Metadata(): metadata;
                    loginResponse = basicAuthLogin.login(username, password, securityToken,
                            "https://login.salesforce.com/services/Soap/u/61.0");
                    metadata.put(Metadata.Key.of("accessToken", Metadata.ASCII_STRING_MARSHALLER), loginResponse.sessionId);
                    metadata.put(Metadata.Key.of("instanceUrl", Metadata.ASCII_STRING_MARSHALLER), loginResponse.instanceUrl);
                    metadata.put(Metadata.Key.of("tenantId", Metadata.ASCII_STRING_MARSHALLER), loginResponse.tenantId);
                }  catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                channel = createChannel(target, tlsEnabled, metadata);
                asyncStub = PubSubGrpc.newStub(channel);
                blockingStub = PubSubGrpc.newBlockingStub(channel);
            } catch (ConnectException e) {
                throw new RuntimeException(e);
            }
        }

        if (rpcMethod.equals(SUBSCRIBE)) {
            LOGGER.info("gRPC subscribe method is called with topic: " + topicName);
            Subscribe subscribe = new Subscribe(topicName, replayPreset, numRequested, replayId,
                    synapseEnvironment, injectingSeq, sequential, blockingStub, registryPath, name,
                    isRetrieveWithLastReplayId);
            subscribe.subscribe(msgCtx, asyncStub);
            nextPolling = subscribe.isActive();
            replayId = subscribe.getReplayId();
            replayPreset = ReplayPreset.CUSTOM_VALUE;
        } else if (rpcMethod.equals(MANAGE_SUBSCRIPTION)) {
            ManageSubscribe manageSubscribe = new ManageSubscribe(subscription_id, developer_name, numRequested, injectingSeq, sequential,
                    synapseEnvironment, msgCtx);
            manageSubscribe.manageSubscription(asyncStub);
        }
        return null;
    }

    public int getReplayPresetType(String replayPreset) {
        if (replayPreset == null || replayPreset.isEmpty()) {
            return ReplayPreset.EARLIEST_VALUE;
        }
        switch (replayPreset.toUpperCase()) {
            case "LATEST":
                return ReplayPreset.LATEST_VALUE;
            case "CUSTOM":
                return ReplayPreset.CUSTOM_VALUE;
            default:
                return ReplayPreset.EARLIEST_VALUE;
        }
    }

    private ManagedChannel createChannel(String target, boolean useSecure, Metadata metadata) throws ConnectException {
        try {
            if (useSecure && metadata != null) {
                LOGGER.info("gRPC secure channel is created with metadata:"+ target);
                return  NettyChannelBuilder.forTarget(target)
                        .useTransportSecurity()
                        .intercept(new MetadataInterceptor(metadata))
                        .keepAliveTime(30, TimeUnit.SECONDS)
                        .keepAliveTimeout(10, TimeUnit.SECONDS)
                        .keepAliveWithoutCalls(true)
                        .build();
            } else if (useSecure){
                LOGGER.info("gRPC secure channel is created:"+ target);
                return NettyChannelBuilder.forTarget(target)
                        .useTransportSecurity()
                        .keepAliveTime(30, TimeUnit.SECONDS)
                        .keepAliveTimeout(10, TimeUnit.SECONDS)
                        .keepAliveWithoutCalls(true)
                        .build();
            } else if (metadata != null) {
                LOGGER.info("gRPC channel is created with metadata:"+ target);
                return NettyChannelBuilder.forTarget(target)
                        .usePlaintext()
                        .intercept(new MetadataInterceptor(metadata))
                        .keepAliveTime(30, TimeUnit.SECONDS)
                        .keepAliveTimeout(10, TimeUnit.SECONDS)
                        .keepAliveWithoutCalls(true)
                        .build();
            } else {
                LOGGER.info("gRPC channel is created:"+ target);
                return NettyChannelBuilder.forTarget(target)
                        .usePlaintext()
                        .keepAliveTime(30, TimeUnit.SECONDS)
                        .keepAliveTimeout(10, TimeUnit.SECONDS)
                        .keepAliveWithoutCalls(true)
                        .build();
            }
        } catch (Exception e) {
            throw new ConnectException("Failed to create channel: " + e.getMessage());
        }
    }
    private  Metadata getHeaderMetadata(String headers, MessageContext messageContext) throws ConnectException {
        // Extract metadata from JSON
        Metadata metadata = new Metadata();
        JSONArray headerSet;
        try {
            headers = InlineExpressionUtil.processInLineSynapseExpressionTemplate(messageContext, headers);
            headerSet = new JSONArray(headers);
        } catch (Exception e) {
            throw new ConnectException("Error parsing JSON headers: " + e.getMessage());
        }
        for (int i = 0; i < headerSet.length(); i++) {
            JSONArray row = headerSet.getJSONArray(i);

            if (row.length() >= 2) {
                String key = row.getString(0);
                String value = row.getString(1);
                metadata.put(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER), value);
            }
        }
        return metadata;
    }

    /**
     * Create the message context.
     */
    private MessageContext createMessageContext() {
        MessageContext msgCtx = this.synapseEnvironment.createMessageContext();
        org.apache.axis2.context.MessageContext axis2MsgCtx = ((Axis2MessageContext) msgCtx).getAxis2MessageContext();
        axis2MsgCtx.setServerSide(true);
        axis2MsgCtx.setMessageID(String.valueOf(UUID.randomUUID()));
        return msgCtx;
    }

    private void createFile (String filePath) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs();
        if(!file.exists()) {
            file.createNewFile();
        }
    }
}
