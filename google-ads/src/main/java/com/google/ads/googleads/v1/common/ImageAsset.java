// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/asset_types.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * An Image asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.ImageAsset}
 */
public  final class ImageAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.ImageAsset)
    ImageAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageAsset.newBuilder() to construct.
  private ImageAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageAsset() {
    mimeType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageAsset(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            com.google.protobuf.BytesValue.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.google.protobuf.BytesValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (fileSize_ != null) {
              subBuilder = fileSize_.toBuilder();
            }
            fileSize_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fileSize_);
              fileSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            mimeType_ = rawValue;
            break;
          }
          case 34: {
            com.google.ads.googleads.v1.common.ImageDimension.Builder subBuilder = null;
            if (fullSize_ != null) {
              subBuilder = fullSize_.toBuilder();
            }
            fullSize_ = input.readMessage(com.google.ads.googleads.v1.common.ImageDimension.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fullSize_);
              fullSize_ = subBuilder.buildPartial();
            }

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
    return com.google.ads.googleads.v1.common.AssetTypesProto.internal_static_google_ads_googleads_v1_common_ImageAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.AssetTypesProto.internal_static_google_ads_googleads_v1_common_ImageAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.ImageAsset.class, com.google.ads.googleads.v1.common.ImageAsset.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.BytesValue data_;
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  public com.google.protobuf.BytesValue getData() {
    return data_ == null ? com.google.protobuf.BytesValue.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  public com.google.protobuf.BytesValueOrBuilder getDataOrBuilder() {
    return getData();
  }

  public static final int FILE_SIZE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value fileSize_;
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 2;</code>
   */
  public boolean hasFileSize() {
    return fileSize_ != null;
  }
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 2;</code>
   */
  public com.google.protobuf.Int64Value getFileSize() {
    return fileSize_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : fileSize_;
  }
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value file_size = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getFileSizeOrBuilder() {
    return getFileSize();
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 3;
  private int mimeType_;
  /**
   * <pre>
   * MIME type of the image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
   */
  public int getMimeTypeValue() {
    return mimeType_;
  }
  /**
   * <pre>
   * MIME type of the image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
   */
  public com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType getMimeType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType result = com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType.valueOf(mimeType_);
    return result == null ? com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType.UNRECOGNIZED : result;
  }

  public static final int FULL_SIZE_FIELD_NUMBER = 4;
  private com.google.ads.googleads.v1.common.ImageDimension fullSize_;
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
   */
  public boolean hasFullSize() {
    return fullSize_ != null;
  }
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
   */
  public com.google.ads.googleads.v1.common.ImageDimension getFullSize() {
    return fullSize_ == null ? com.google.ads.googleads.v1.common.ImageDimension.getDefaultInstance() : fullSize_;
  }
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
   */
  public com.google.ads.googleads.v1.common.ImageDimensionOrBuilder getFullSizeOrBuilder() {
    return getFullSize();
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
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    if (fileSize_ != null) {
      output.writeMessage(2, getFileSize());
    }
    if (mimeType_ != com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, mimeType_);
    }
    if (fullSize_ != null) {
      output.writeMessage(4, getFullSize());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
    }
    if (fileSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFileSize());
    }
    if (mimeType_ != com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, mimeType_);
    }
    if (fullSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFullSize());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.ImageAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.ImageAsset other = (com.google.ads.googleads.v1.common.ImageAsset) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (hasFileSize() != other.hasFileSize()) return false;
    if (hasFileSize()) {
      if (!getFileSize()
          .equals(other.getFileSize())) return false;
    }
    if (mimeType_ != other.mimeType_) return false;
    if (hasFullSize() != other.hasFullSize()) return false;
    if (hasFullSize()) {
      if (!getFullSize()
          .equals(other.getFullSize())) return false;
    }
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    if (hasFileSize()) {
      hash = (37 * hash) + FILE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getFileSize().hashCode();
    }
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + mimeType_;
    if (hasFullSize()) {
      hash = (37 * hash) + FULL_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getFullSize().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ImageAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.ImageAsset prototype) {
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
   * <pre>
   * An Image asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.ImageAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.ImageAsset)
      com.google.ads.googleads.v1.common.ImageAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.AssetTypesProto.internal_static_google_ads_googleads_v1_common_ImageAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.AssetTypesProto.internal_static_google_ads_googleads_v1_common_ImageAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.ImageAsset.class, com.google.ads.googleads.v1.common.ImageAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.ImageAsset.newBuilder()
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
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      if (fileSizeBuilder_ == null) {
        fileSize_ = null;
      } else {
        fileSize_ = null;
        fileSizeBuilder_ = null;
      }
      mimeType_ = 0;

      if (fullSizeBuilder_ == null) {
        fullSize_ = null;
      } else {
        fullSize_ = null;
        fullSizeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.AssetTypesProto.internal_static_google_ads_googleads_v1_common_ImageAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ImageAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.ImageAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ImageAsset build() {
      com.google.ads.googleads.v1.common.ImageAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ImageAsset buildPartial() {
      com.google.ads.googleads.v1.common.ImageAsset result = new com.google.ads.googleads.v1.common.ImageAsset(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      if (fileSizeBuilder_ == null) {
        result.fileSize_ = fileSize_;
      } else {
        result.fileSize_ = fileSizeBuilder_.build();
      }
      result.mimeType_ = mimeType_;
      if (fullSizeBuilder_ == null) {
        result.fullSize_ = fullSize_;
      } else {
        result.fullSize_ = fullSizeBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v1.common.ImageAsset) {
        return mergeFrom((com.google.ads.googleads.v1.common.ImageAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.ImageAsset other) {
      if (other == com.google.ads.googleads.v1.common.ImageAsset.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
      }
      if (other.hasFileSize()) {
        mergeFileSize(other.getFileSize());
      }
      if (other.mimeType_ != 0) {
        setMimeTypeValue(other.getMimeTypeValue());
      }
      if (other.hasFullSize()) {
        mergeFullSize(other.getFullSize());
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
      com.google.ads.googleads.v1.common.ImageAsset parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.ImageAsset) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BytesValue data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder> dataBuilder_;
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public com.google.protobuf.BytesValue getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.google.protobuf.BytesValue.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder setData(com.google.protobuf.BytesValue value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder setData(
        com.google.protobuf.BytesValue.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder mergeData(com.google.protobuf.BytesValue value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.google.protobuf.BytesValue.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public com.google.protobuf.BytesValue.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    public com.google.protobuf.BytesValueOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.google.protobuf.BytesValue.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>.google.protobuf.BytesValue data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BytesValue, com.google.protobuf.BytesValue.Builder, com.google.protobuf.BytesValueOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    private com.google.protobuf.Int64Value fileSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> fileSizeBuilder_;
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public boolean hasFileSize() {
      return fileSizeBuilder_ != null || fileSize_ != null;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public com.google.protobuf.Int64Value getFileSize() {
      if (fileSizeBuilder_ == null) {
        return fileSize_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : fileSize_;
      } else {
        return fileSizeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public Builder setFileSize(com.google.protobuf.Int64Value value) {
      if (fileSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fileSize_ = value;
        onChanged();
      } else {
        fileSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public Builder setFileSize(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (fileSizeBuilder_ == null) {
        fileSize_ = builderForValue.build();
        onChanged();
      } else {
        fileSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public Builder mergeFileSize(com.google.protobuf.Int64Value value) {
      if (fileSizeBuilder_ == null) {
        if (fileSize_ != null) {
          fileSize_ =
            com.google.protobuf.Int64Value.newBuilder(fileSize_).mergeFrom(value).buildPartial();
        } else {
          fileSize_ = value;
        }
        onChanged();
      } else {
        fileSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public Builder clearFileSize() {
      if (fileSizeBuilder_ == null) {
        fileSize_ = null;
        onChanged();
      } else {
        fileSize_ = null;
        fileSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getFileSizeBuilder() {
      
      onChanged();
      return getFileSizeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getFileSizeOrBuilder() {
      if (fileSizeBuilder_ != null) {
        return fileSizeBuilder_.getMessageOrBuilder();
      } else {
        return fileSize_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : fileSize_;
      }
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value file_size = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getFileSizeFieldBuilder() {
      if (fileSizeBuilder_ == null) {
        fileSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getFileSize(),
                getParentForChildren(),
                isClean());
        fileSize_ = null;
      }
      return fileSizeBuilder_;
    }

    private int mimeType_ = 0;
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     */
    public int getMimeTypeValue() {
      return mimeType_;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     */
    public Builder setMimeTypeValue(int value) {
      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     */
    public com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType getMimeType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType result = com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType.valueOf(mimeType_);
      return result == null ? com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     */
    public Builder setMimeType(com.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mimeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     */
    public Builder clearMimeType() {
      
      mimeType_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v1.common.ImageDimension fullSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.common.ImageDimension, com.google.ads.googleads.v1.common.ImageDimension.Builder, com.google.ads.googleads.v1.common.ImageDimensionOrBuilder> fullSizeBuilder_;
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public boolean hasFullSize() {
      return fullSizeBuilder_ != null || fullSize_ != null;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public com.google.ads.googleads.v1.common.ImageDimension getFullSize() {
      if (fullSizeBuilder_ == null) {
        return fullSize_ == null ? com.google.ads.googleads.v1.common.ImageDimension.getDefaultInstance() : fullSize_;
      } else {
        return fullSizeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public Builder setFullSize(com.google.ads.googleads.v1.common.ImageDimension value) {
      if (fullSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fullSize_ = value;
        onChanged();
      } else {
        fullSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public Builder setFullSize(
        com.google.ads.googleads.v1.common.ImageDimension.Builder builderForValue) {
      if (fullSizeBuilder_ == null) {
        fullSize_ = builderForValue.build();
        onChanged();
      } else {
        fullSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public Builder mergeFullSize(com.google.ads.googleads.v1.common.ImageDimension value) {
      if (fullSizeBuilder_ == null) {
        if (fullSize_ != null) {
          fullSize_ =
            com.google.ads.googleads.v1.common.ImageDimension.newBuilder(fullSize_).mergeFrom(value).buildPartial();
        } else {
          fullSize_ = value;
        }
        onChanged();
      } else {
        fullSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public Builder clearFullSize() {
      if (fullSizeBuilder_ == null) {
        fullSize_ = null;
        onChanged();
      } else {
        fullSize_ = null;
        fullSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public com.google.ads.googleads.v1.common.ImageDimension.Builder getFullSizeBuilder() {
      
      onChanged();
      return getFullSizeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    public com.google.ads.googleads.v1.common.ImageDimensionOrBuilder getFullSizeOrBuilder() {
      if (fullSizeBuilder_ != null) {
        return fullSizeBuilder_.getMessageOrBuilder();
      } else {
        return fullSize_ == null ?
            com.google.ads.googleads.v1.common.ImageDimension.getDefaultInstance() : fullSize_;
      }
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.common.ImageDimension full_size = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v1.common.ImageDimension, com.google.ads.googleads.v1.common.ImageDimension.Builder, com.google.ads.googleads.v1.common.ImageDimensionOrBuilder> 
        getFullSizeFieldBuilder() {
      if (fullSizeBuilder_ == null) {
        fullSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v1.common.ImageDimension, com.google.ads.googleads.v1.common.ImageDimension.Builder, com.google.ads.googleads.v1.common.ImageDimensionOrBuilder>(
                getFullSize(),
                getParentForChildren(),
                isClean());
        fullSize_ = null;
      }
      return fullSizeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.ImageAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.ImageAsset)
  private static final com.google.ads.googleads.v1.common.ImageAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.ImageAsset();
  }

  public static com.google.ads.googleads.v1.common.ImageAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageAsset>
      PARSER = new com.google.protobuf.AbstractParser<ImageAsset>() {
    @java.lang.Override
    public ImageAsset parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageAsset(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.ImageAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

