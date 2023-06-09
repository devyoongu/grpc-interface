// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CallJob.proto

package org.posicube.grpc;

/**
 * Protobuf type {@code CallJobGrpcRequest}
 */
public final class CallJobGrpcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CallJobGrpcRequest)
    CallJobGrpcRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallJobGrpcRequest.newBuilder() to construct.
  private CallJobGrpcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallJobGrpcRequest() {
    customerId_ = "";
    customerData_ = "";
    rawData_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CallJobGrpcRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CallJobGrpcRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            customerData_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            rawData_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.posicube.grpc.CallJobProto.internal_static_CallJobGrpcRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.posicube.grpc.CallJobProto.internal_static_CallJobGrpcRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.posicube.grpc.CallJobGrpcRequest.class, org.posicube.grpc.CallJobGrpcRequest.Builder.class);
  }

  public static final int CUSTOMERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <code>string customerId = 1;</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <code>string customerId = 1;</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMERDATA_FIELD_NUMBER = 2;
  private volatile java.lang.Object customerData_;
  /**
   * <code>string customerData = 2;</code>
   * @return The customerData.
   */
  @java.lang.Override
  public java.lang.String getCustomerData() {
    java.lang.Object ref = customerData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerData_ = s;
      return s;
    }
  }
  /**
   * <code>string customerData = 2;</code>
   * @return The bytes for customerData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerDataBytes() {
    java.lang.Object ref = customerData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RAWDATA_FIELD_NUMBER = 3;
  private volatile java.lang.Object rawData_;
  /**
   * <code>string rawData = 3;</code>
   * @return The rawData.
   */
  @java.lang.Override
  public java.lang.String getRawData() {
    java.lang.Object ref = rawData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawData_ = s;
      return s;
    }
  }
  /**
   * <code>string rawData = 3;</code>
   * @return The bytes for rawData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawDataBytes() {
    java.lang.Object ref = rawData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!getCustomerDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customerData_);
    }
    if (!getRawDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rawData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!getCustomerDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customerData_);
    }
    if (!getRawDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rawData_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.posicube.grpc.CallJobGrpcRequest)) {
      return super.equals(obj);
    }
    org.posicube.grpc.CallJobGrpcRequest other = (org.posicube.grpc.CallJobGrpcRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getCustomerData()
        .equals(other.getCustomerData())) return false;
    if (!getRawData()
        .equals(other.getRawData())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMERID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + CUSTOMERDATA_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerData().hashCode();
    hash = (37 * hash) + RAWDATA_FIELD_NUMBER;
    hash = (53 * hash) + getRawData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.posicube.grpc.CallJobGrpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.posicube.grpc.CallJobGrpcRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CallJobGrpcRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CallJobGrpcRequest)
      org.posicube.grpc.CallJobGrpcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.posicube.grpc.CallJobProto.internal_static_CallJobGrpcRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.posicube.grpc.CallJobProto.internal_static_CallJobGrpcRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.posicube.grpc.CallJobGrpcRequest.class, org.posicube.grpc.CallJobGrpcRequest.Builder.class);
    }

    // Construct using org.posicube.grpc.CallJobGrpcRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      customerId_ = "";

      customerData_ = "";

      rawData_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.posicube.grpc.CallJobProto.internal_static_CallJobGrpcRequest_descriptor;
    }

    @java.lang.Override
    public org.posicube.grpc.CallJobGrpcRequest getDefaultInstanceForType() {
      return org.posicube.grpc.CallJobGrpcRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.posicube.grpc.CallJobGrpcRequest build() {
      org.posicube.grpc.CallJobGrpcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.posicube.grpc.CallJobGrpcRequest buildPartial() {
      org.posicube.grpc.CallJobGrpcRequest result = new org.posicube.grpc.CallJobGrpcRequest(this);
      result.customerId_ = customerId_;
      result.customerData_ = customerData_;
      result.rawData_ = rawData_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.posicube.grpc.CallJobGrpcRequest) {
        return mergeFrom((org.posicube.grpc.CallJobGrpcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.posicube.grpc.CallJobGrpcRequest other) {
      if (other == org.posicube.grpc.CallJobGrpcRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (!other.getCustomerData().isEmpty()) {
        customerData_ = other.customerData_;
        onChanged();
      }
      if (!other.getRawData().isEmpty()) {
        rawData_ = other.rawData_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.posicube.grpc.CallJobGrpcRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.posicube.grpc.CallJobGrpcRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <code>string customerId = 1;</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerId = 1;</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerId = 1;</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <code>string customerId = 1;</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerData_ = "";
    /**
     * <code>string customerData = 2;</code>
     * @return The customerData.
     */
    public java.lang.String getCustomerData() {
      java.lang.Object ref = customerData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerData = 2;</code>
     * @return The bytes for customerData.
     */
    public com.google.protobuf.ByteString
        getCustomerDataBytes() {
      java.lang.Object ref = customerData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerData = 2;</code>
     * @param value The customerData to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerData = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerData() {
      
      customerData_ = getDefaultInstance().getCustomerData();
      onChanged();
      return this;
    }
    /**
     * <code>string customerData = 2;</code>
     * @param value The bytes for customerData to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerData_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object rawData_ = "";
    /**
     * <code>string rawData = 3;</code>
     * @return The rawData.
     */
    public java.lang.String getRawData() {
      java.lang.Object ref = rawData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rawData = 3;</code>
     * @return The bytes for rawData.
     */
    public com.google.protobuf.ByteString
        getRawDataBytes() {
      java.lang.Object ref = rawData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rawData = 3;</code>
     * @param value The rawData to set.
     * @return This builder for chaining.
     */
    public Builder setRawData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string rawData = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRawData() {
      
      rawData_ = getDefaultInstance().getRawData();
      onChanged();
      return this;
    }
    /**
     * <code>string rawData = 3;</code>
     * @param value The bytes for rawData to set.
     * @return This builder for chaining.
     */
    public Builder setRawDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rawData_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CallJobGrpcRequest)
  }

  // @@protoc_insertion_point(class_scope:CallJobGrpcRequest)
  private static final org.posicube.grpc.CallJobGrpcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.posicube.grpc.CallJobGrpcRequest();
  }

  public static org.posicube.grpc.CallJobGrpcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallJobGrpcRequest>
      PARSER = new com.google.protobuf.AbstractParser<CallJobGrpcRequest>() {
    @java.lang.Override
    public CallJobGrpcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CallJobGrpcRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CallJobGrpcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallJobGrpcRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.posicube.grpc.CallJobGrpcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

