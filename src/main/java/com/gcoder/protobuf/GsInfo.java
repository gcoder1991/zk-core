// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.gcoder.protobuf;

/**
 * Protobuf type {@code zookeeper.protobuf.GsInfo}
 */
public  final class GsInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zookeeper.protobuf.GsInfo)
    GsInfoOrBuilder {
  // Use GsInfo.newBuilder() to construct.
  private GsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GsInfo() {
    startTime_ = 0L;
    operator_ = "";
    pid_ = "";
    hostAddress_ = "";
    enable_ = false;
    numLimit_ = 0;
    numOnline_ = 0;
    version_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GsInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            startTime_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            operator_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            pid_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            hostAddress_ = s;
            break;
          }
          case 40: {

            enable_ = input.readBool();
            break;
          }
          case 48: {

            numLimit_ = input.readInt32();
            break;
          }
          case 56: {

            numOnline_ = input.readInt32();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gcoder.protobuf.metadataProto.internal_static_zookeeper_protobuf_GsInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gcoder.protobuf.metadataProto.internal_static_zookeeper_protobuf_GsInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gcoder.protobuf.GsInfo.class, com.gcoder.protobuf.GsInfo.Builder.class);
  }

  public static final int STARTTIME_FIELD_NUMBER = 1;
  private long startTime_;
  /**
   * <pre>
   * 启动时间
   * </pre>
   *
   * <code>int64 startTime = 1;</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int OPERATOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object operator_;
  /**
   * <pre>
   * 操作人
   * </pre>
   *
   * <code>string operator = 2;</code>
   */
  public java.lang.String getOperator() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operator_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 操作人
   * </pre>
   *
   * <code>string operator = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOperatorBytes() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PID_FIELD_NUMBER = 3;
  private volatile java.lang.Object pid_;
  /**
   * <pre>
   * 进程号
   * </pre>
   *
   * <code>string pid = 3;</code>
   */
  public java.lang.String getPid() {
    java.lang.Object ref = pid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 进程号
   * </pre>
   *
   * <code>string pid = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPidBytes() {
    java.lang.Object ref = pid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOSTADDRESS_FIELD_NUMBER = 4;
  private volatile java.lang.Object hostAddress_;
  /**
   * <pre>
   * 主机地址
   * </pre>
   *
   * <code>string hostAddress = 4;</code>
   */
  public java.lang.String getHostAddress() {
    java.lang.Object ref = hostAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 主机地址
   * </pre>
   *
   * <code>string hostAddress = 4;</code>
   */
  public com.google.protobuf.ByteString
      getHostAddressBytes() {
    java.lang.Object ref = hostAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLE_FIELD_NUMBER = 5;
  private boolean enable_;
  /**
   * <pre>
   * 是否可用
   * </pre>
   *
   * <code>bool enable = 5;</code>
   */
  public boolean getEnable() {
    return enable_;
  }

  public static final int NUMLIMIT_FIELD_NUMBER = 6;
  private int numLimit_;
  /**
   * <pre>
   * 人数上限
   * </pre>
   *
   * <code>int32 numLimit = 6;</code>
   */
  public int getNumLimit() {
    return numLimit_;
  }

  public static final int NUMONLINE_FIELD_NUMBER = 7;
  private int numOnline_;
  /**
   * <pre>
   * 在线人数
   * </pre>
   *
   * <code>int32 numOnline = 7;</code>
   */
  public int getNumOnline() {
    return numOnline_;
  }

  public static final int VERSION_FIELD_NUMBER = 8;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * 服务器版本
   * </pre>
   *
   * <code>string version = 8;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 服务器版本
   * </pre>
   *
   * <code>string version = 8;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startTime_ != 0L) {
      output.writeInt64(1, startTime_);
    }
    if (!getOperatorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operator_);
    }
    if (!getPidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pid_);
    }
    if (!getHostAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, hostAddress_);
    }
    if (enable_ != false) {
      output.writeBool(5, enable_);
    }
    if (numLimit_ != 0) {
      output.writeInt32(6, numLimit_);
    }
    if (numOnline_ != 0) {
      output.writeInt32(7, numOnline_);
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, version_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, startTime_);
    }
    if (!getOperatorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operator_);
    }
    if (!getPidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pid_);
    }
    if (!getHostAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, hostAddress_);
    }
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, enable_);
    }
    if (numLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, numLimit_);
    }
    if (numOnline_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, numOnline_);
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, version_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.gcoder.protobuf.GsInfo)) {
      return super.equals(obj);
    }
    com.gcoder.protobuf.GsInfo other = (com.gcoder.protobuf.GsInfo) obj;

    boolean result = true;
    result = result && (getStartTime()
        == other.getStartTime());
    result = result && getOperator()
        .equals(other.getOperator());
    result = result && getPid()
        .equals(other.getPid());
    result = result && getHostAddress()
        .equals(other.getHostAddress());
    result = result && (getEnable()
        == other.getEnable());
    result = result && (getNumLimit()
        == other.getNumLimit());
    result = result && (getNumOnline()
        == other.getNumOnline());
    result = result && getVersion()
        .equals(other.getVersion());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + getOperator().hashCode();
    hash = (37 * hash) + PID_FIELD_NUMBER;
    hash = (53 * hash) + getPid().hashCode();
    hash = (37 * hash) + HOSTADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getHostAddress().hashCode();
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnable());
    hash = (37 * hash) + NUMLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getNumLimit();
    hash = (37 * hash) + NUMONLINE_FIELD_NUMBER;
    hash = (53 * hash) + getNumOnline();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gcoder.protobuf.GsInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gcoder.protobuf.GsInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gcoder.protobuf.GsInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gcoder.protobuf.GsInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gcoder.protobuf.GsInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code zookeeper.protobuf.GsInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zookeeper.protobuf.GsInfo)
      com.gcoder.protobuf.GsInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gcoder.protobuf.metadataProto.internal_static_zookeeper_protobuf_GsInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gcoder.protobuf.metadataProto.internal_static_zookeeper_protobuf_GsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gcoder.protobuf.GsInfo.class, com.gcoder.protobuf.GsInfo.Builder.class);
    }

    // Construct using com.gcoder.protobuf.GsInfo.newBuilder()
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
    public Builder clear() {
      super.clear();
      startTime_ = 0L;

      operator_ = "";

      pid_ = "";

      hostAddress_ = "";

      enable_ = false;

      numLimit_ = 0;

      numOnline_ = 0;

      version_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gcoder.protobuf.metadataProto.internal_static_zookeeper_protobuf_GsInfo_descriptor;
    }

    public com.gcoder.protobuf.GsInfo getDefaultInstanceForType() {
      return com.gcoder.protobuf.GsInfo.getDefaultInstance();
    }

    public com.gcoder.protobuf.GsInfo build() {
      com.gcoder.protobuf.GsInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gcoder.protobuf.GsInfo buildPartial() {
      com.gcoder.protobuf.GsInfo result = new com.gcoder.protobuf.GsInfo(this);
      result.startTime_ = startTime_;
      result.operator_ = operator_;
      result.pid_ = pid_;
      result.hostAddress_ = hostAddress_;
      result.enable_ = enable_;
      result.numLimit_ = numLimit_;
      result.numOnline_ = numOnline_;
      result.version_ = version_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gcoder.protobuf.GsInfo) {
        return mergeFrom((com.gcoder.protobuf.GsInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gcoder.protobuf.GsInfo other) {
      if (other == com.gcoder.protobuf.GsInfo.getDefaultInstance()) return this;
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (!other.getOperator().isEmpty()) {
        operator_ = other.operator_;
        onChanged();
      }
      if (!other.getPid().isEmpty()) {
        pid_ = other.pid_;
        onChanged();
      }
      if (!other.getHostAddress().isEmpty()) {
        hostAddress_ = other.hostAddress_;
        onChanged();
      }
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
      }
      if (other.getNumLimit() != 0) {
        setNumLimit(other.getNumLimit());
      }
      if (other.getNumOnline() != 0) {
        setNumOnline(other.getNumOnline());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gcoder.protobuf.GsInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gcoder.protobuf.GsInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startTime_ ;
    /**
     * <pre>
     * 启动时间
     * </pre>
     *
     * <code>int64 startTime = 1;</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <pre>
     * 启动时间
     * </pre>
     *
     * <code>int64 startTime = 1;</code>
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 启动时间
     * </pre>
     *
     * <code>int64 startTime = 1;</code>
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object operator_ = "";
    /**
     * <pre>
     * 操作人
     * </pre>
     *
     * <code>string operator = 2;</code>
     */
    public java.lang.String getOperator() {
      java.lang.Object ref = operator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 操作人
     * </pre>
     *
     * <code>string operator = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOperatorBytes() {
      java.lang.Object ref = operator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 操作人
     * </pre>
     *
     * <code>string operator = 2;</code>
     */
    public Builder setOperator(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 操作人
     * </pre>
     *
     * <code>string operator = 2;</code>
     */
    public Builder clearOperator() {
      
      operator_ = getDefaultInstance().getOperator();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 操作人
     * </pre>
     *
     * <code>string operator = 2;</code>
     */
    public Builder setOperatorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operator_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pid_ = "";
    /**
     * <pre>
     * 进程号
     * </pre>
     *
     * <code>string pid = 3;</code>
     */
    public java.lang.String getPid() {
      java.lang.Object ref = pid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 进程号
     * </pre>
     *
     * <code>string pid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPidBytes() {
      java.lang.Object ref = pid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 进程号
     * </pre>
     *
     * <code>string pid = 3;</code>
     */
    public Builder setPid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 进程号
     * </pre>
     *
     * <code>string pid = 3;</code>
     */
    public Builder clearPid() {
      
      pid_ = getDefaultInstance().getPid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 进程号
     * </pre>
     *
     * <code>string pid = 3;</code>
     */
    public Builder setPidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hostAddress_ = "";
    /**
     * <pre>
     * 主机地址
     * </pre>
     *
     * <code>string hostAddress = 4;</code>
     */
    public java.lang.String getHostAddress() {
      java.lang.Object ref = hostAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 主机地址
     * </pre>
     *
     * <code>string hostAddress = 4;</code>
     */
    public com.google.protobuf.ByteString
        getHostAddressBytes() {
      java.lang.Object ref = hostAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 主机地址
     * </pre>
     *
     * <code>string hostAddress = 4;</code>
     */
    public Builder setHostAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主机地址
     * </pre>
     *
     * <code>string hostAddress = 4;</code>
     */
    public Builder clearHostAddress() {
      
      hostAddress_ = getDefaultInstance().getHostAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主机地址
     * </pre>
     *
     * <code>string hostAddress = 4;</code>
     */
    public Builder setHostAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostAddress_ = value;
      onChanged();
      return this;
    }

    private boolean enable_ ;
    /**
     * <pre>
     * 是否可用
     * </pre>
     *
     * <code>bool enable = 5;</code>
     */
    public boolean getEnable() {
      return enable_;
    }
    /**
     * <pre>
     * 是否可用
     * </pre>
     *
     * <code>bool enable = 5;</code>
     */
    public Builder setEnable(boolean value) {
      
      enable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否可用
     * </pre>
     *
     * <code>bool enable = 5;</code>
     */
    public Builder clearEnable() {
      
      enable_ = false;
      onChanged();
      return this;
    }

    private int numLimit_ ;
    /**
     * <pre>
     * 人数上限
     * </pre>
     *
     * <code>int32 numLimit = 6;</code>
     */
    public int getNumLimit() {
      return numLimit_;
    }
    /**
     * <pre>
     * 人数上限
     * </pre>
     *
     * <code>int32 numLimit = 6;</code>
     */
    public Builder setNumLimit(int value) {
      
      numLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 人数上限
     * </pre>
     *
     * <code>int32 numLimit = 6;</code>
     */
    public Builder clearNumLimit() {
      
      numLimit_ = 0;
      onChanged();
      return this;
    }

    private int numOnline_ ;
    /**
     * <pre>
     * 在线人数
     * </pre>
     *
     * <code>int32 numOnline = 7;</code>
     */
    public int getNumOnline() {
      return numOnline_;
    }
    /**
     * <pre>
     * 在线人数
     * </pre>
     *
     * <code>int32 numOnline = 7;</code>
     */
    public Builder setNumOnline(int value) {
      
      numOnline_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 在线人数
     * </pre>
     *
     * <code>int32 numOnline = 7;</code>
     */
    public Builder clearNumOnline() {
      
      numOnline_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * 服务器版本
     * </pre>
     *
     * <code>string version = 8;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 服务器版本
     * </pre>
     *
     * <code>string version = 8;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 服务器版本
     * </pre>
     *
     * <code>string version = 8;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服务器版本
     * </pre>
     *
     * <code>string version = 8;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服务器版本
     * </pre>
     *
     * <code>string version = 8;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zookeeper.protobuf.GsInfo)
  }

  // @@protoc_insertion_point(class_scope:zookeeper.protobuf.GsInfo)
  private static final com.gcoder.protobuf.GsInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gcoder.protobuf.GsInfo();
  }

  public static com.gcoder.protobuf.GsInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GsInfo>
      PARSER = new com.google.protobuf.AbstractParser<GsInfo>() {
    public GsInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GsInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GsInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GsInfo> getParserForType() {
    return PARSER;
  }

  public com.gcoder.protobuf.GsInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

