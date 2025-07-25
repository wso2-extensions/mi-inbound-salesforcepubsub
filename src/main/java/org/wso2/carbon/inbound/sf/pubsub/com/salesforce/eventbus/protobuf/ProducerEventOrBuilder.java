// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api-original.proto

package org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf;

public interface ProducerEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:eventbus.v1.ProducerEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Either a user-provided ID or a system generated guid
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
  /**
   * <pre>
   * Either a user-provided ID or a system generated guid
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Schema fingerprint for this event which is hash of the schema
   * </pre>
   *
   * <code>string schema_id = 2;</code>
   * @return The schemaId.
   */
  String getSchemaId();
  /**
   * <pre>
   * Schema fingerprint for this event which is hash of the schema
   * </pre>
   *
   * <code>string schema_id = 2;</code>
   * @return The bytes for schemaId.
   */
  com.google.protobuf.ByteString
      getSchemaIdBytes();

  /**
   * <pre>
   * The message data field
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <pre>
   * Reserved for future use. Key-value pairs of headers.
   * </pre>
   *
   * <code>repeated .eventbus.v1.EventHeader headers = 4;</code>
   */
  java.util.List<EventHeader>
      getHeadersList();
  /**
   * <pre>
   * Reserved for future use. Key-value pairs of headers.
   * </pre>
   *
   * <code>repeated .eventbus.v1.EventHeader headers = 4;</code>
   */
  EventHeader getHeaders(int index);
  /**
   * <pre>
   * Reserved for future use. Key-value pairs of headers.
   * </pre>
   *
   * <code>repeated .eventbus.v1.EventHeader headers = 4;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * Reserved for future use. Key-value pairs of headers.
   * </pre>
   *
   * <code>repeated .eventbus.v1.EventHeader headers = 4;</code>
   */
  java.util.List<? extends EventHeaderOrBuilder>
      getHeadersOrBuilderList();
  /**
   * <pre>
   * Reserved for future use. Key-value pairs of headers.
   * </pre>
   *
   * <code>repeated .eventbus.v1.EventHeader headers = 4;</code>
   */
  EventHeaderOrBuilder getHeadersOrBuilder(
      int index);
}
