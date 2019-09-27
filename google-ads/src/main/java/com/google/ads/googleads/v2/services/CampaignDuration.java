// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/reach_plan_service.proto

package com.google.ads.googleads.v2.services;

/**
 * <pre>
 * The duration of a planned campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.services.CampaignDuration}
 */
public  final class CampaignDuration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.services.CampaignDuration)
    CampaignDurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignDuration.newBuilder() to construct.
  private CampaignDuration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignDuration() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CampaignDuration(
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
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (durationInDays_ != null) {
              subBuilder = durationInDays_.toBuilder();
            }
            durationInDays_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(durationInDays_);
              durationInDays_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_CampaignDuration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_CampaignDuration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.services.CampaignDuration.class, com.google.ads.googleads.v2.services.CampaignDuration.Builder.class);
  }

  public static final int DURATION_IN_DAYS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value durationInDays_;
  /**
   * <pre>
   * The duration value in days.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
   */
  public boolean hasDurationInDays() {
    return durationInDays_ != null;
  }
  /**
   * <pre>
   * The duration value in days.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
   */
  public com.google.protobuf.Int32Value getDurationInDays() {
    return durationInDays_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : durationInDays_;
  }
  /**
   * <pre>
   * The duration value in days.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getDurationInDaysOrBuilder() {
    return getDurationInDays();
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
    if (durationInDays_ != null) {
      output.writeMessage(1, getDurationInDays());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (durationInDays_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDurationInDays());
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
    if (!(obj instanceof com.google.ads.googleads.v2.services.CampaignDuration)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.services.CampaignDuration other = (com.google.ads.googleads.v2.services.CampaignDuration) obj;

    if (hasDurationInDays() != other.hasDurationInDays()) return false;
    if (hasDurationInDays()) {
      if (!getDurationInDays()
          .equals(other.getDurationInDays())) return false;
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
    if (hasDurationInDays()) {
      hash = (37 * hash) + DURATION_IN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getDurationInDays().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.services.CampaignDuration parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.services.CampaignDuration prototype) {
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
   * The duration of a planned campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.services.CampaignDuration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.services.CampaignDuration)
      com.google.ads.googleads.v2.services.CampaignDurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_CampaignDuration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_CampaignDuration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.services.CampaignDuration.class, com.google.ads.googleads.v2.services.CampaignDuration.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.services.CampaignDuration.newBuilder()
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
      if (durationInDaysBuilder_ == null) {
        durationInDays_ = null;
      } else {
        durationInDays_ = null;
        durationInDaysBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v2_services_CampaignDuration_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.CampaignDuration getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.services.CampaignDuration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.CampaignDuration build() {
      com.google.ads.googleads.v2.services.CampaignDuration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.services.CampaignDuration buildPartial() {
      com.google.ads.googleads.v2.services.CampaignDuration result = new com.google.ads.googleads.v2.services.CampaignDuration(this);
      if (durationInDaysBuilder_ == null) {
        result.durationInDays_ = durationInDays_;
      } else {
        result.durationInDays_ = durationInDaysBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.services.CampaignDuration) {
        return mergeFrom((com.google.ads.googleads.v2.services.CampaignDuration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.services.CampaignDuration other) {
      if (other == com.google.ads.googleads.v2.services.CampaignDuration.getDefaultInstance()) return this;
      if (other.hasDurationInDays()) {
        mergeDurationInDays(other.getDurationInDays());
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
      com.google.ads.googleads.v2.services.CampaignDuration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.services.CampaignDuration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int32Value durationInDays_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> durationInDaysBuilder_;
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public boolean hasDurationInDays() {
      return durationInDaysBuilder_ != null || durationInDays_ != null;
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public com.google.protobuf.Int32Value getDurationInDays() {
      if (durationInDaysBuilder_ == null) {
        return durationInDays_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : durationInDays_;
      } else {
        return durationInDaysBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public Builder setDurationInDays(com.google.protobuf.Int32Value value) {
      if (durationInDaysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        durationInDays_ = value;
        onChanged();
      } else {
        durationInDaysBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public Builder setDurationInDays(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (durationInDaysBuilder_ == null) {
        durationInDays_ = builderForValue.build();
        onChanged();
      } else {
        durationInDaysBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public Builder mergeDurationInDays(com.google.protobuf.Int32Value value) {
      if (durationInDaysBuilder_ == null) {
        if (durationInDays_ != null) {
          durationInDays_ =
            com.google.protobuf.Int32Value.newBuilder(durationInDays_).mergeFrom(value).buildPartial();
        } else {
          durationInDays_ = value;
        }
        onChanged();
      } else {
        durationInDaysBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public Builder clearDurationInDays() {
      if (durationInDaysBuilder_ == null) {
        durationInDays_ = null;
        onChanged();
      } else {
        durationInDays_ = null;
        durationInDaysBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public com.google.protobuf.Int32Value.Builder getDurationInDaysBuilder() {
      
      onChanged();
      return getDurationInDaysFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getDurationInDaysOrBuilder() {
      if (durationInDaysBuilder_ != null) {
        return durationInDaysBuilder_.getMessageOrBuilder();
      } else {
        return durationInDays_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : durationInDays_;
      }
    }
    /**
     * <pre>
     * The duration value in days.
     * </pre>
     *
     * <code>.google.protobuf.Int32Value duration_in_days = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getDurationInDaysFieldBuilder() {
      if (durationInDaysBuilder_ == null) {
        durationInDaysBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getDurationInDays(),
                getParentForChildren(),
                isClean());
        durationInDays_ = null;
      }
      return durationInDaysBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.services.CampaignDuration)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.CampaignDuration)
  private static final com.google.ads.googleads.v2.services.CampaignDuration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.services.CampaignDuration();
  }

  public static com.google.ads.googleads.v2.services.CampaignDuration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignDuration>
      PARSER = new com.google.protobuf.AbstractParser<CampaignDuration>() {
    @java.lang.Override
    public CampaignDuration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CampaignDuration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CampaignDuration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignDuration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.services.CampaignDuration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
