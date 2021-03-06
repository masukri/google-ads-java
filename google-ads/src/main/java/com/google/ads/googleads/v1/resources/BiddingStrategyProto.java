// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/bidding_strategy.proto

package com.google.ads.googleads.v1.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v1/resources/bidd" +
      "ing_strategy.proto\022!google.ads.googleads" +
      ".v1.resources\032,google/ads/googleads/v1/c" +
      "ommon/bidding.proto\032;google/ads/googlead" +
      "s/v1/enums/bidding_strategy_status.proto" +
      "\0329google/ads/googleads/v1/enums/bidding_" +
      "strategy_type.proto\032\036google/protobuf/wra" +
      "ppers.proto\032\034google/api/annotations.prot" +
      "o\"\301\007\n\017BiddingStrategy\022\025\n\rresource_name\030\001" +
      " \001(\t\022\'\n\002id\030\003 \001(\0132\033.google.protobuf.Int64" +
      "Value\022*\n\004name\030\004 \001(\0132\034.google.protobuf.St" +
      "ringValue\022^\n\006status\030\017 \001(\0162N.google.ads.g" +
      "oogleads.v1.enums.BiddingStrategyStatusE" +
      "num.BiddingStrategyStatus\022X\n\004type\030\005 \001(\0162" +
      "J.google.ads.googleads.v1.enums.BiddingS" +
      "trategyTypeEnum.BiddingStrategyType\0223\n\016c" +
      "ampaign_count\030\r \001(\0132\033.google.protobuf.In" +
      "t64Value\022?\n\032non_removed_campaign_count\030\016" +
      " \001(\0132\033.google.protobuf.Int64Value\022C\n\014enh" +
      "anced_cpc\030\007 \001(\0132+.google.ads.googleads.v" +
      "1.common.EnhancedCpcH\000\022L\n\021page_one_promo" +
      "ted\030\010 \001(\0132/.google.ads.googleads.v1.comm" +
      "on.PageOnePromotedH\000\022?\n\ntarget_cpa\030\t \001(\013" +
      "2).google.ads.googleads.v1.common.Target" +
      "CpaH\000\022X\n\027target_impression_share\0300 \001(\01325" +
      ".google.ads.googleads.v1.common.TargetIm" +
      "pressionShareH\000\022R\n\024target_outrank_share\030" +
      "\n \001(\01322.google.ads.googleads.v1.common.T" +
      "argetOutrankShareH\000\022A\n\013target_roas\030\013 \001(\013" +
      "2*.google.ads.googleads.v1.common.Target" +
      "RoasH\000\022C\n\014target_spend\030\014 \001(\0132+.google.ad" +
      "s.googleads.v1.common.TargetSpendH\000B\010\n\006s" +
      "chemeB\201\002\n%com.google.ads.googleads.v1.re" +
      "sourcesB\024BiddingStrategyProtoP\001ZJgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v1/resources;resources\242\002\003GAA\252\002!Goog" +
      "le.Ads.GoogleAds.V1.Resources\312\002!Google\\A" +
      "ds\\GoogleAds\\V1\\Resources\352\002%Google::Ads:" +
      ":GoogleAds::V1::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BiddingStrategyStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "CampaignCount", "NonRemovedCampaignCount", "EnhancedCpc", "PageOnePromoted", "TargetCpa", "TargetImpressionShare", "TargetOutrankShare", "TargetRoas", "TargetSpend", "Scheme", });
    com.google.ads.googleads.v1.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BiddingStrategyStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
