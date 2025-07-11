// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api-original.proto

package org.wso2.carbon.inbound.sf.pubsub.com.salesforce.eventbus.protobuf;

/**
 * <pre>
 * Response for the Subscribe streaming RPC method. This returns ConsumerEvent(s).
 * If there are no events to deliver, the server sends an empty batch fetch response with the latest replay ID. The
 * empty fetch response is sent within 270 seconds. An empty fetch response provides a periodic keepalive from the
 * server and the latest replay ID.
 * </pre>
 *
 * Protobuf type {@code eventbus.v1.FetchResponse}
 */
public final class FetchResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:eventbus.v1.FetchResponse)
    FetchResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchResponse.newBuilder() to construct.
  private FetchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchResponse() {
    events_ = java.util.Collections.emptyList();
    latestReplayId_ = com.google.protobuf.ByteString.EMPTY;
    rpcId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new FetchResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PubSubProto.internal_static_eventbus_v1_FetchResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PubSubProto.internal_static_eventbus_v1_FetchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FetchResponse.class, Builder.class);
  }

  public static final int EVENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ConsumerEvent> events_;
  /**
   * <pre>
   * Received events for subscription for client consumption
   * </pre>
   *
   * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
   */
  @Override
  public java.util.List<ConsumerEvent> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * Received events for subscription for client consumption
   * </pre>
   *
   * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
   */
  @Override
  public java.util.List<? extends ConsumerEventOrBuilder>
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * Received events for subscription for client consumption
   * </pre>
   *
   * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
   */
  @Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * Received events for subscription for client consumption
   * </pre>
   *
   * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
   */
  @Override
  public ConsumerEvent getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * Received events for subscription for client consumption
   * </pre>
   *
   * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
   */
  @Override
  public ConsumerEventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }

  public static final int LATEST_REPLAY_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString latestReplayId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Latest replay ID of a subscription. Enables clients with an updated replay value so that they can keep track
   * of their last consumed replay. Clients will not have to start a subscription at a very old replay in the case where a resubscribe is necessary.
   * </pre>
   *
   * <code>bytes latest_replay_id = 2;</code>
   * @return The latestReplayId.
   */
  @Override
  public com.google.protobuf.ByteString getLatestReplayId() {
    return latestReplayId_;
  }

  public static final int RPC_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile Object rpcId_ = "";
  /**
   * <pre>
   * RPC ID used to trace errors.
   * </pre>
   *
   * <code>string rpc_id = 3;</code>
   * @return The rpcId.
   */
  @Override
  public String getRpcId() {
    Object ref = rpcId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      rpcId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * RPC ID used to trace errors.
   * </pre>
   *
   * <code>string rpc_id = 3;</code>
   * @return The bytes for rpcId.
   */
  @Override
  public com.google.protobuf.ByteString
      getRpcIdBytes() {
    Object ref = rpcId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      rpcId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PENDING_NUM_REQUESTED_FIELD_NUMBER = 4;
  private int pendingNumRequested_ = 0;
  /**
   * <pre>
   * Number of remaining events to be delivered to the client for a Subscribe RPC call.
   * </pre>
   *
   * <code>int32 pending_num_requested = 4;</code>
   * @return The pendingNumRequested.
   */
  @Override
  public int getPendingNumRequested() {
    return pendingNumRequested_;
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
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(1, events_.get(i));
    }
    if (!latestReplayId_.isEmpty()) {
      output.writeBytes(2, latestReplayId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rpcId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rpcId_);
    }
    if (pendingNumRequested_ != 0) {
      output.writeInt32(4, pendingNumRequested_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, events_.get(i));
    }
    if (!latestReplayId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, latestReplayId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rpcId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rpcId_);
    }
    if (pendingNumRequested_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pendingNumRequested_);
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
    if (!(obj instanceof FetchResponse)) {
      return super.equals(obj);
    }
    FetchResponse other = (FetchResponse) obj;

    if (!getEventsList()
        .equals(other.getEventsList())) return false;
    if (!getLatestReplayId()
        .equals(other.getLatestReplayId())) return false;
    if (!getRpcId()
        .equals(other.getRpcId())) return false;
    if (getPendingNumRequested()
        != other.getPendingNumRequested()) return false;
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
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (37 * hash) + LATEST_REPLAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLatestReplayId().hashCode();
    hash = (37 * hash) + RPC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRpcId().hashCode();
    hash = (37 * hash) + PENDING_NUM_REQUESTED_FIELD_NUMBER;
    hash = (53 * hash) + getPendingNumRequested();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FetchResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FetchResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FetchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FetchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FetchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FetchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FetchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FetchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FetchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FetchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FetchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FetchResponse parseFrom(
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
  public static Builder newBuilder(FetchResponse prototype) {
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
   * Response for the Subscribe streaming RPC method. This returns ConsumerEvent(s).
   * If there are no events to deliver, the server sends an empty batch fetch response with the latest replay ID. The
   * empty fetch response is sent within 270 seconds. An empty fetch response provides a periodic keepalive from the
   * server and the latest replay ID.
   * </pre>
   *
   * Protobuf type {@code eventbus.v1.FetchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:eventbus.v1.FetchResponse)
          FetchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PubSubProto.internal_static_eventbus_v1_FetchResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PubSubProto.internal_static_eventbus_v1_FetchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FetchResponse.class, Builder.class);
    }

    // Construct using com.salesforce.eventbus.protobuf.FetchResponse.newBuilder()
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
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      latestReplayId_ = com.google.protobuf.ByteString.EMPTY;
      rpcId_ = "";
      pendingNumRequested_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PubSubProto.internal_static_eventbus_v1_FetchResponse_descriptor;
    }

    @Override
    public FetchResponse getDefaultInstanceForType() {
      return FetchResponse.getDefaultInstance();
    }

    @Override
    public FetchResponse build() {
      FetchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public FetchResponse buildPartial() {
      FetchResponse result = new FetchResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(FetchResponse result) {
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
    }

    private void buildPartial0(FetchResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.latestReplayId_ = latestReplayId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rpcId_ = rpcId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pendingNumRequested_ = pendingNumRequested_;
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
      if (other instanceof FetchResponse) {
        return mergeFrom((FetchResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FetchResponse other) {
      if (other == FetchResponse.getDefaultInstance()) return this;
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
      }
      if (other.getLatestReplayId() != com.google.protobuf.ByteString.EMPTY) {
        setLatestReplayId(other.getLatestReplayId());
      }
      if (!other.getRpcId().isEmpty()) {
        rpcId_ = other.rpcId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPendingNumRequested() != 0) {
        setPendingNumRequested(other.getPendingNumRequested());
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
              ConsumerEvent m =
                  input.readMessage(
                      ConsumerEvent.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              latestReplayId_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              rpcId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              pendingNumRequested_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.util.List<ConsumerEvent> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new java.util.ArrayList<ConsumerEvent>(events_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            ConsumerEvent, ConsumerEvent.Builder, ConsumerEventOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public java.util.List<ConsumerEvent> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public ConsumerEvent getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder setEvents(
        int index, ConsumerEvent value) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder setEvents(
        int index, ConsumerEvent.Builder builderForValue) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder addEvents(ConsumerEvent value) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder addEvents(
        int index, ConsumerEvent value) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder addEvents(
        ConsumerEvent.Builder builderForValue) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder addEvents(
        int index, ConsumerEvent.Builder builderForValue) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder addAllEvents(
        Iterable<? extends ConsumerEvent> values) {
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
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
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public ConsumerEvent.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public ConsumerEventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public java.util.List<? extends ConsumerEventOrBuilder>
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public ConsumerEvent.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          ConsumerEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public ConsumerEvent.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, ConsumerEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Received events for subscription for client consumption
     * </pre>
     *
     * <code>repeated .eventbus.v1.ConsumerEvent events = 1;</code>
     */
    public java.util.List<ConsumerEvent.Builder>
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            ConsumerEvent, ConsumerEvent.Builder, ConsumerEventOrBuilder>
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                ConsumerEvent, ConsumerEvent.Builder, ConsumerEventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }

    private com.google.protobuf.ByteString latestReplayId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Latest replay ID of a subscription. Enables clients with an updated replay value so that they can keep track
     * of their last consumed replay. Clients will not have to start a subscription at a very old replay in the case where a resubscribe is necessary.
     * </pre>
     *
     * <code>bytes latest_replay_id = 2;</code>
     * @return The latestReplayId.
     */
    @Override
    public com.google.protobuf.ByteString getLatestReplayId() {
      return latestReplayId_;
    }
    /**
     * <pre>
     * Latest replay ID of a subscription. Enables clients with an updated replay value so that they can keep track
     * of their last consumed replay. Clients will not have to start a subscription at a very old replay in the case where a resubscribe is necessary.
     * </pre>
     *
     * <code>bytes latest_replay_id = 2;</code>
     * @param value The latestReplayId to set.
     * @return This builder for chaining.
     */
    public Builder setLatestReplayId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      latestReplayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latest replay ID of a subscription. Enables clients with an updated replay value so that they can keep track
     * of their last consumed replay. Clients will not have to start a subscription at a very old replay in the case where a resubscribe is necessary.
     * </pre>
     *
     * <code>bytes latest_replay_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatestReplayId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      latestReplayId_ = getDefaultInstance().getLatestReplayId();
      onChanged();
      return this;
    }

    private Object rpcId_ = "";
    /**
     * <pre>
     * RPC ID used to trace errors.
     * </pre>
     *
     * <code>string rpc_id = 3;</code>
     * @return The rpcId.
     */
    public String getRpcId() {
      Object ref = rpcId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        rpcId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * RPC ID used to trace errors.
     * </pre>
     *
     * <code>string rpc_id = 3;</code>
     * @return The bytes for rpcId.
     */
    public com.google.protobuf.ByteString
        getRpcIdBytes() {
      Object ref = rpcId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        rpcId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * RPC ID used to trace errors.
     * </pre>
     *
     * <code>string rpc_id = 3;</code>
     * @param value The rpcId to set.
     * @return This builder for chaining.
     */
    public Builder setRpcId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      rpcId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * RPC ID used to trace errors.
     * </pre>
     *
     * <code>string rpc_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRpcId() {
      rpcId_ = getDefaultInstance().getRpcId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * RPC ID used to trace errors.
     * </pre>
     *
     * <code>string rpc_id = 3;</code>
     * @param value The bytes for rpcId to set.
     * @return This builder for chaining.
     */
    public Builder setRpcIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rpcId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int pendingNumRequested_ ;
    /**
     * <pre>
     * Number of remaining events to be delivered to the client for a Subscribe RPC call.
     * </pre>
     *
     * <code>int32 pending_num_requested = 4;</code>
     * @return The pendingNumRequested.
     */
    @Override
    public int getPendingNumRequested() {
      return pendingNumRequested_;
    }
    /**
     * <pre>
     * Number of remaining events to be delivered to the client for a Subscribe RPC call.
     * </pre>
     *
     * <code>int32 pending_num_requested = 4;</code>
     * @param value The pendingNumRequested to set.
     * @return This builder for chaining.
     */
    public Builder setPendingNumRequested(int value) {
      
      pendingNumRequested_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of remaining events to be delivered to the client for a Subscribe RPC call.
     * </pre>
     *
     * <code>int32 pending_num_requested = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPendingNumRequested() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pendingNumRequested_ = 0;
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


    // @@protoc_insertion_point(builder_scope:eventbus.v1.FetchResponse)
  }

  // @@protoc_insertion_point(class_scope:eventbus.v1.FetchResponse)
  private static final FetchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FetchResponse();
  }

  public static FetchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchResponse>
      PARSER = new com.google.protobuf.AbstractParser<FetchResponse>() {
    @Override
    public FetchResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FetchResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public FetchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

