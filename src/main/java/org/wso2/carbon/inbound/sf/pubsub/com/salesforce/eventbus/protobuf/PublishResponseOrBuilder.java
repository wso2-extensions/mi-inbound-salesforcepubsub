// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api-original.proto

package org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf;

public interface PublishResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:eventbus.v1.PublishResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Publish results
   * </pre>
   *
   * <code>repeated .eventbus.v1.PublishResult results = 1;</code>
   */
  java.util.List<PublishResult>
      getResultsList();
  /**
   * <pre>
   * Publish results
   * </pre>
   *
   * <code>repeated .eventbus.v1.PublishResult results = 1;</code>
   */
  PublishResult getResults(int index);
  /**
   * <pre>
   * Publish results
   * </pre>
   *
   * <code>repeated .eventbus.v1.PublishResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Publish results
   * </pre>
   *
   * <code>repeated .eventbus.v1.PublishResult results = 1;</code>
   */
  java.util.List<? extends PublishResultOrBuilder>
      getResultsOrBuilderList();
  /**
   * <pre>
   * Publish results
   * </pre>
   *
   * <code>repeated .eventbus.v1.PublishResult results = 1;</code>
   */
  PublishResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Schema fingerprint for this event, which is a hash of the schema
   * </pre>
   *
   * <code>string schema_id = 2;</code>
   * @return The schemaId.
   */
  String getSchemaId();
  /**
   * <pre>
   * Schema fingerprint for this event, which is a hash of the schema
   * </pre>
   *
   * <code>string schema_id = 2;</code>
   * @return The bytes for schemaId.
   */
  com.google.protobuf.ByteString
      getSchemaIdBytes();

  /**
   * <pre>
   * RPC ID used to trace errors.
   * </pre>
   *
   * <code>string rpc_id = 3;</code>
   * @return The rpcId.
   */
  String getRpcId();
  /**
   * <pre>
   * RPC ID used to trace errors.
   * </pre>
   *
   * <code>string rpc_id = 3;</code>
   * @return The bytes for rpcId.
   */
  com.google.protobuf.ByteString
      getRpcIdBytes();
}
