// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api-original.proto

package org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf;

/**
 * <pre>
 * Represents an event that is consumed in a subscriber client.
 * In addition to the fields in ProducerEvent, ConsumerEvent has the replay_id field.
 * </pre>
 *
 * Protobuf type {@code eventbus.v1.ConsumerEvent}
 */
public final class ConsumerEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:eventbus.v1.ConsumerEvent)
    ConsumerEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsumerEvent.newBuilder() to construct.
  private ConsumerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsumerEvent() {
    replayId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsumerEvent();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PubSubProto.internal_static_eventbus_v1_ConsumerEvent_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PubSubProto.internal_static_eventbus_v1_ConsumerEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ConsumerEvent.class, Builder.class);
  }

  public static final int EVENT_FIELD_NUMBER = 1;
  private ProducerEvent event_;
  /**
   * <pre>
   * The event with fields identical to ProducerEvent
   * </pre>
   *
   * <code>.eventbus.v1.ProducerEvent event = 1;</code>
   * @return Whether the event field is set.
   */
  @Override
  public boolean hasEvent() {
    return event_ != null;
  }
  /**
   * <pre>
   * The event with fields identical to ProducerEvent
   * </pre>
   *
   * <code>.eventbus.v1.ProducerEvent event = 1;</code>
   * @return The event.
   */
  @Override
  public ProducerEvent getEvent() {
    return event_ == null ? ProducerEvent.getDefaultInstance() : event_;
  }
  /**
   * <pre>
   * The event with fields identical to ProducerEvent
   * </pre>
   *
   * <code>.eventbus.v1.ProducerEvent event = 1;</code>
   */
  @Override
  public ProducerEventOrBuilder getEventOrBuilder() {
    return event_ == null ? ProducerEvent.getDefaultInstance() : event_;
  }

  public static final int REPLAY_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString replayId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * The replay ID of the event.
   * A subscriber app can store the replay ID. When the app restarts, it can resume subscription
   * starting from events in the event bus after the event with that replay ID.
   * </pre>
   *
   * <code>bytes replay_id = 2;</code>
   * @return The replayId.
   */
  @Override
  public com.google.protobuf.ByteString getReplayId() {
    return replayId_;
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
    if (event_ != null) {
      output.writeMessage(1, getEvent());
    }
    if (!replayId_.isEmpty()) {
      output.writeBytes(2, replayId_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (event_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEvent());
    }
    if (!replayId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, replayId_);
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
    if (!(obj instanceof ConsumerEvent)) {
      return super.equals(obj);
    }
    ConsumerEvent other = (ConsumerEvent) obj;

    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent()
          .equals(other.getEvent())) return false;
    }
    if (!getReplayId()
        .equals(other.getReplayId())) return false;
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
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    hash = (37 * hash) + REPLAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReplayId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ConsumerEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsumerEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsumerEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsumerEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsumerEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsumerEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsumerEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConsumerEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConsumerEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ConsumerEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConsumerEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConsumerEvent parseFrom(
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
  public static Builder newBuilder(ConsumerEvent prototype) {
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
   * Represents an event that is consumed in a subscriber client.
   * In addition to the fields in ProducerEvent, ConsumerEvent has the replay_id field.
   * </pre>
   *
   * Protobuf type {@code eventbus.v1.ConsumerEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:eventbus.v1.ConsumerEvent)
          ConsumerEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PubSubProto.internal_static_eventbus_v1_ConsumerEvent_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PubSubProto.internal_static_eventbus_v1_ConsumerEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConsumerEvent.class, Builder.class);
    }

    // Construct using com.salesforce.eventbus.protobuf.ConsumerEvent.newBuilder()
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
      event_ = null;
      if (eventBuilder_ != null) {
        eventBuilder_.dispose();
        eventBuilder_ = null;
      }
      replayId_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PubSubProto.internal_static_eventbus_v1_ConsumerEvent_descriptor;
    }

    @Override
    public ConsumerEvent getDefaultInstanceForType() {
      return ConsumerEvent.getDefaultInstance();
    }

    @Override
    public ConsumerEvent build() {
      ConsumerEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ConsumerEvent buildPartial() {
      ConsumerEvent result = new ConsumerEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ConsumerEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.event_ = eventBuilder_ == null
            ? event_
            : eventBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.replayId_ = replayId_;
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
      if (other instanceof ConsumerEvent) {
        return mergeFrom((ConsumerEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ConsumerEvent other) {
      if (other == ConsumerEvent.getDefaultInstance()) return this;
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
      }
      if (other.getReplayId() != com.google.protobuf.ByteString.EMPTY) {
        setReplayId(other.getReplayId());
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
              input.readMessage(
                  getEventFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              replayId_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private ProducerEvent event_;
    private com.google.protobuf.SingleFieldBuilderV3<
            ProducerEvent, ProducerEvent.Builder, ProducerEventOrBuilder> eventBuilder_;
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     * @return The event.
     */
    public ProducerEvent getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null ? ProducerEvent.getDefaultInstance() : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    public Builder setEvent(ProducerEvent value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
      } else {
        eventBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    public Builder setEvent(
        ProducerEvent.Builder builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    public Builder mergeEvent(ProducerEvent value) {
      if (eventBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          event_ != null &&
          event_ != ProducerEvent.getDefaultInstance()) {
          getEventBuilder().mergeFrom(value);
        } else {
          event_ = value;
        }
      } else {
        eventBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    public Builder clearEvent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      event_ = null;
      if (eventBuilder_ != null) {
        eventBuilder_.dispose();
        eventBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    public ProducerEvent.Builder getEventBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    public ProducerEventOrBuilder getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null ?
            ProducerEvent.getDefaultInstance() : event_;
      }
    }
    /**
     * <pre>
     * The event with fields identical to ProducerEvent
     * </pre>
     *
     * <code>.eventbus.v1.ProducerEvent event = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            ProducerEvent, ProducerEvent.Builder, ProducerEventOrBuilder>
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                ProducerEvent, ProducerEvent.Builder, ProducerEventOrBuilder>(
                getEvent(),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
    }

    private com.google.protobuf.ByteString replayId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The replay ID of the event.
     * A subscriber app can store the replay ID. When the app restarts, it can resume subscription
     * starting from events in the event bus after the event with that replay ID.
     * </pre>
     *
     * <code>bytes replay_id = 2;</code>
     * @return The replayId.
     */
    @Override
    public com.google.protobuf.ByteString getReplayId() {
      return replayId_;
    }
    /**
     * <pre>
     * The replay ID of the event.
     * A subscriber app can store the replay ID. When the app restarts, it can resume subscription
     * starting from events in the event bus after the event with that replay ID.
     * </pre>
     *
     * <code>bytes replay_id = 2;</code>
     * @param value The replayId to set.
     * @return This builder for chaining.
     */
    public Builder setReplayId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      replayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The replay ID of the event.
     * A subscriber app can store the replay ID. When the app restarts, it can resume subscription
     * starting from events in the event bus after the event with that replay ID.
     * </pre>
     *
     * <code>bytes replay_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplayId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      replayId_ = getDefaultInstance().getReplayId();
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


    // @@protoc_insertion_point(builder_scope:eventbus.v1.ConsumerEvent)
  }

  // @@protoc_insertion_point(class_scope:eventbus.v1.ConsumerEvent)
  private static final ConsumerEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ConsumerEvent();
  }

  public static ConsumerEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumerEvent>
      PARSER = new com.google.protobuf.AbstractParser<ConsumerEvent>() {
    @Override
    public ConsumerEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConsumerEvent> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ConsumerEvent> getParserForType() {
    return PARSER;
  }

  @Override
  public ConsumerEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

