// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api-original.proto

package org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf;

/**
 * <pre>
 * Request for the Publish and PublishStream RPC method.
 * </pre>
 *
 * Protobuf type {@code eventbus.v1.PublishRequest}
 */
public final class PublishRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:eventbus.v1.PublishRequest)
    PublishRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishRequest.newBuilder() to construct.
  private PublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishRequest() {
    topicName_ = "";
    events_ = java.util.Collections.emptyList();
    authRefresh_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublishRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PubSubProto.internal_static_eventbus_v1_PublishRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PubSubProto.internal_static_eventbus_v1_PublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PublishRequest.class, Builder.class);
  }

  public static final int TOPIC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object topicName_ = "";
  /**
   * <pre>
   * Topic to publish on
   * </pre>
   *
   * <code>string topic_name = 1;</code>
   * @return The topicName.
   */
  @Override
  public String getTopicName() {
    Object ref = topicName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Topic to publish on
   * </pre>
   *
   * <code>string topic_name = 1;</code>
   * @return The bytes for topicName.
   */
  @Override
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    Object ref = topicName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ProducerEvent> events_;
  /**
   * <pre>
   * Batch of ProducerEvent(s) to send
   * </pre>
   *
   * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
   */
  @Override
  public java.util.List<ProducerEvent> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * Batch of ProducerEvent(s) to send
   * </pre>
   *
   * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
   */
  @Override
  public java.util.List<? extends ProducerEventOrBuilder>
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * Batch of ProducerEvent(s) to send
   * </pre>
   *
   * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
   */
  @Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * Batch of ProducerEvent(s) to send
   * </pre>
   *
   * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
   */
  @Override
  public ProducerEvent getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * Batch of ProducerEvent(s) to send
   * </pre>
   *
   * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
   */
  @Override
  public ProducerEventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }

  public static final int AUTH_REFRESH_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile Object authRefresh_ = "";
  /**
   * <pre>
   * For internal Salesforce use only.
   * </pre>
   *
   * <code>string auth_refresh = 3;</code>
   * @return The authRefresh.
   */
  @Override
  public String getAuthRefresh() {
    Object ref = authRefresh_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      authRefresh_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * For internal Salesforce use only.
   * </pre>
   *
   * <code>string auth_refresh = 3;</code>
   * @return The bytes for authRefresh.
   */
  @Override
  public com.google.protobuf.ByteString
      getAuthRefreshBytes() {
    Object ref = authRefresh_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      authRefresh_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicName_);
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(2, events_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authRefresh_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, authRefresh_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topicName_);
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, events_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authRefresh_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, authRefresh_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof PublishRequest)) {
      return super.equals(obj);
    }
    PublishRequest other = (PublishRequest) obj;

    if (!getTopicName()
        .equals(other.getTopicName())) return false;
    if (!getEventsList()
        .equals(other.getEventsList())) return false;
    if (!getAuthRefresh()
        .equals(other.getAuthRefresh())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (37 * hash) + AUTH_REFRESH_FIELD_NUMBER;
    hash = (53 * hash) + getAuthRefresh().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PublishRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PublishRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PublishRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PublishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PublishRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PublishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PublishRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(PublishRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for the Publish and PublishStream RPC method.
   * </pre>
   *
   * Protobuf type {@code eventbus.v1.PublishRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:eventbus.v1.PublishRequest)
          PublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PubSubProto.internal_static_eventbus_v1_PublishRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PubSubProto.internal_static_eventbus_v1_PublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PublishRequest.class, Builder.class);
    }

    // Construct using com.salesforce.eventbus.protobuf.PublishRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topicName_ = "";
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      authRefresh_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PubSubProto.internal_static_eventbus_v1_PublishRequest_descriptor;
    }

    @Override
    public PublishRequest getDefaultInstanceForType() {
      return PublishRequest.getDefaultInstance();
    }

    @Override
    public PublishRequest build() {
      PublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PublishRequest buildPartial() {
      PublishRequest result = new PublishRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(PublishRequest result) {
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
    }

    private void buildPartial0(PublishRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topicName_ = topicName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.authRefresh_ = authRefresh_;
      }
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof PublishRequest) {
        return mergeFrom((PublishRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PublishRequest other) {
      if (other == PublishRequest.getDefaultInstance()) return this;
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000002);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
      }
      if (!other.getAuthRefresh().isEmpty()) {
        authRefresh_ = other.authRefresh_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              topicName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ProducerEvent m =
                  input.readMessage(
                      ProducerEvent.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              authRefresh_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private Object topicName_ = "";
    /**
     * <pre>
     * Topic to publish on
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return The topicName.
     */
    public String getTopicName() {
      Object ref = topicName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Topic to publish on
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return The bytes for topicName.
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Topic to publish on
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      topicName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Topic to publish on
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      topicName_ = getDefaultInstance().getTopicName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Topic to publish on
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @param value The bytes for topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topicName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<ProducerEvent> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        events_ = new java.util.ArrayList<ProducerEvent>(events_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            ProducerEvent, ProducerEvent.Builder, ProducerEventOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public java.util.List<ProducerEvent> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public ProducerEvent getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder setEvents(
        int index, ProducerEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder setEvents(
        int index, ProducerEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder addEvents(ProducerEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder addEvents(
        int index, ProducerEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder addEvents(
        ProducerEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder addEvents(
        int index, ProducerEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder addAllEvents(
        Iterable<? extends ProducerEvent> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public ProducerEvent.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public ProducerEventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public java.util.List<? extends ProducerEventOrBuilder>
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public ProducerEvent.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          ProducerEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public ProducerEvent.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, ProducerEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Batch of ProducerEvent(s) to send
     * </pre>
     *
     * <code>repeated .eventbus.v1.ProducerEvent events = 2;</code>
     */
    public java.util.List<ProducerEvent.Builder>
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            ProducerEvent, ProducerEvent.Builder, ProducerEventOrBuilder>
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                ProducerEvent, ProducerEvent.Builder, ProducerEventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }

    private Object authRefresh_ = "";
    /**
     * <pre>
     * For internal Salesforce use only.
     * </pre>
     *
     * <code>string auth_refresh = 3;</code>
     * @return The authRefresh.
     */
    public String getAuthRefresh() {
      Object ref = authRefresh_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        authRefresh_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * For internal Salesforce use only.
     * </pre>
     *
     * <code>string auth_refresh = 3;</code>
     * @return The bytes for authRefresh.
     */
    public com.google.protobuf.ByteString
        getAuthRefreshBytes() {
      Object ref = authRefresh_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        authRefresh_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * For internal Salesforce use only.
     * </pre>
     *
     * <code>string auth_refresh = 3;</code>
     * @param value The authRefresh to set.
     * @return This builder for chaining.
     */
    public Builder setAuthRefresh(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      authRefresh_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For internal Salesforce use only.
     * </pre>
     *
     * <code>string auth_refresh = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthRefresh() {
      authRefresh_ = getDefaultInstance().getAuthRefresh();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For internal Salesforce use only.
     * </pre>
     *
     * <code>string auth_refresh = 3;</code>
     * @param value The bytes for authRefresh to set.
     * @return This builder for chaining.
     */
    public Builder setAuthRefreshBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      authRefresh_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:eventbus.v1.PublishRequest)
  }

  // @@protoc_insertion_point(class_scope:eventbus.v1.PublishRequest)
  private static final PublishRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PublishRequest();
  }

  public static PublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishRequest>
      PARSER = new com.google.protobuf.AbstractParser<PublishRequest>() {
    @Override
    public PublishRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PublishRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PublishRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public PublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

