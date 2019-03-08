// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/extensions.proto

package com.google.ads.googleads.v1.common;

public final class ExtensionsProto {
  private ExtensionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_AppFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_AppFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_CallFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_CallFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_CalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_CalloutFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_TextMessageFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_TextMessageFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_PriceFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_PriceFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_PriceOffer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_PriceOffer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_PromotionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_PromotionFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_StructuredSnippetFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_StructuredSnippetFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_common_SitelinkFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_common_SitelinkFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v1/common/extensi" +
      "ons.proto\022\036google.ads.googleads.v1.commo" +
      "n\0325google/ads/googleads/v1/common/custom" +
      "_parameter.proto\0320google/ads/googleads/v" +
      "1/common/feed_common.proto\032-google/ads/g" +
      "oogleads/v1/enums/app_store.proto\032Cgoogl" +
      "e/ads/googleads/v1/enums/call_conversion" +
      "_reporting_state.proto\032Cgoogle/ads/googl" +
      "eads/v1/enums/price_extension_price_qual" +
      "ifier.proto\032>google/ads/googleads/v1/enu" +
      "ms/price_extension_price_unit.proto\0328goo" +
      "gle/ads/googleads/v1/enums/price_extensi" +
      "on_type.proto\032Igoogle/ads/googleads/v1/e" +
      "nums/promotion_extension_discount_modifi" +
      "er.proto\032@google/ads/googleads/v1/enums/" +
      "promotion_extension_occasion.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\345\003\n\013AppFeedItem\022/\n\tlink" +
      "_text\030\001 \001(\0132\034.google.protobuf.StringValu" +
      "e\022,\n\006app_id\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022G\n\tapp_store\030\003 \001(\01624.google.ads." +
      "googleads.v1.enums.AppStoreEnum.AppStore" +
      "\0220\n\nfinal_urls\030\004 \003(\0132\034.google.protobuf.S" +
      "tringValue\0227\n\021final_mobile_urls\030\005 \003(\0132\034." +
      "google.protobuf.StringValue\022;\n\025tracking_" +
      "url_template\030\006 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022N\n\025url_custom_parameters\030\007 \003(\0132" +
      "/.google.ads.googleads.v1.common.CustomP" +
      "arameter\0226\n\020final_url_suffix\030\010 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\"\276\003\n\014CallFeedIte" +
      "m\0222\n\014phone_number\030\001 \001(\0132\034.google.protobu" +
      "f.StringValue\0222\n\014country_code\030\002 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\0229\n\025call_tracki" +
      "ng_enabled\030\003 \001(\0132\032.google.protobuf.BoolV" +
      "alue\022<\n\026call_conversion_action\030\004 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022E\n!call_conve" +
      "rsion_tracking_disabled\030\005 \001(\0132\032.google.p" +
      "rotobuf.BoolValue\022\205\001\n\037call_conversion_re" +
      "porting_state\030\006 \001(\0162\\.google.ads.googlea" +
      "ds.v1.enums.CallConversionReportingState" +
      "Enum.CallConversionReportingState\"E\n\017Cal" +
      "loutFeedItem\0222\n\014callout_text\030\001 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\"\224\002\n\023TextMessage" +
      "FeedItem\0223\n\rbusiness_name\030\001 \001(\0132\034.google" +
      ".protobuf.StringValue\0222\n\014country_code\030\002 " +
      "\001(\0132\034.google.protobuf.StringValue\0222\n\014pho" +
      "ne_number\030\003 \001(\0132\034.google.protobuf.String" +
      "Value\022*\n\004text\030\004 \001(\0132\034.google.protobuf.St" +
      "ringValue\0224\n\016extension_text\030\005 \001(\0132\034.goog" +
      "le.protobuf.StringValue\"\315\003\n\rPriceFeedIte" +
      "m\022V\n\004type\030\001 \001(\0162H.google.ads.googleads.v" +
      "1.enums.PriceExtensionTypeEnum.PriceExte" +
      "nsionType\022u\n\017price_qualifier\030\002 \001(\0162\\.goo" +
      "gle.ads.googleads.v1.enums.PriceExtensio" +
      "nPriceQualifierEnum.PriceExtensionPriceQ" +
      "ualifier\022;\n\025tracking_url_template\030\003 \001(\0132" +
      "\034.google.protobuf.StringValue\0223\n\rlanguag" +
      "e_code\030\004 \001(\0132\034.google.protobuf.StringVal" +
      "ue\022C\n\017price_offerings\030\005 \003(\0132*.google.ads" +
      ".googleads.v1.common.PriceOffer\0226\n\020final" +
      "_url_suffix\030\006 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\"\360\002\n\nPriceOffer\022,\n\006header\030\001 \001(\0132\034" +
      ".google.protobuf.StringValue\0221\n\013descript" +
      "ion\030\002 \001(\0132\034.google.protobuf.StringValue\022" +
      "4\n\005price\030\003 \001(\0132%.google.ads.googleads.v1" +
      ".common.Money\022`\n\004unit\030\004 \001(\0162R.google.ads" +
      ".googleads.v1.enums.PriceExtensionPriceU" +
      "nitEnum.PriceExtensionPriceUnit\0220\n\nfinal" +
      "_urls\030\005 \003(\0132\034.google.protobuf.StringValu" +
      "e\0227\n\021final_mobile_urls\030\006 \003(\0132\034.google.pr" +
      "otobuf.StringValue\"\262\010\n\021PromotionFeedItem" +
      "\0226\n\020promotion_target\030\001 \001(\0132\034.google.prot" +
      "obuf.StringValue\022\203\001\n\021discount_modifier\030\002" +
      " \001(\0162h.google.ads.googleads.v1.enums.Pro" +
      "motionExtensionDiscountModifierEnum.Prom" +
      "otionExtensionDiscountModifier\022:\n\024promot" +
      "ion_start_date\030\007 \001(\0132\034.google.protobuf.S" +
      "tringValue\0228\n\022promotion_end_date\030\010 \001(\0132\034" +
      ".google.protobuf.StringValue\022j\n\010occasion" +
      "\030\t \001(\0162X.google.ads.googleads.v1.enums.P" +
      "romotionExtensionOccasionEnum.PromotionE" +
      "xtensionOccasion\0220\n\nfinal_urls\030\n \003(\0132\034.g" +
      "oogle.protobuf.StringValue\0227\n\021final_mobi" +
      "le_urls\030\013 \003(\0132\034.google.protobuf.StringVa" +
      "lue\022;\n\025tracking_url_template\030\014 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022N\n\025url_custom_p" +
      "arameters\030\r \003(\0132/.google.ads.googleads.v" +
      "1.common.CustomParameter\0226\n\020final_url_su" +
      "ffix\030\016 \001(\0132\034.google.protobuf.StringValue" +
      "\0223\n\rlanguage_code\030\017 \001(\0132\034.google.protobu" +
      "f.StringValue\0222\n\013percent_off\030\003 \001(\0132\033.goo" +
      "gle.protobuf.Int64ValueH\000\022A\n\020money_amoun" +
      "t_off\030\004 \001(\0132%.google.ads.googleads.v1.co" +
      "mmon.MoneyH\000\0226\n\016promotion_code\030\005 \001(\0132\034.g" +
      "oogle.protobuf.StringValueH\001\022C\n\022orders_o" +
      "ver_amount\030\006 \001(\0132%.google.ads.googleads." +
      "v1.common.MoneyH\001B\017\n\rdiscount_typeB\023\n\021pr" +
      "omotion_trigger\"w\n\031StructuredSnippetFeed" +
      "Item\022,\n\006header\030\001 \001(\0132\034.google.protobuf.S" +
      "tringValue\022,\n\006values\030\002 \003(\0132\034.google.prot" +
      "obuf.StringValue\"\315\003\n\020SitelinkFeedItem\022/\n" +
      "\tlink_text\030\001 \001(\0132\034.google.protobuf.Strin" +
      "gValue\022+\n\005line1\030\002 \001(\0132\034.google.protobuf." +
      "StringValue\022+\n\005line2\030\003 \001(\0132\034.google.prot" +
      "obuf.StringValue\0220\n\nfinal_urls\030\004 \003(\0132\034.g" +
      "oogle.protobuf.StringValue\0227\n\021final_mobi" +
      "le_urls\030\005 \003(\0132\034.google.protobuf.StringVa" +
      "lue\022;\n\025tracking_url_template\030\006 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022N\n\025url_custom_p" +
      "arameters\030\007 \003(\0132/.google.ads.googleads.v" +
      "1.common.CustomParameter\0226\n\020final_url_su" +
      "ffix\030\010 \001(\0132\034.google.protobuf.StringValue" +
      "B\352\001\n\"com.google.ads.googleads.v1.commonB" +
      "\017ExtensionsProtoP\001ZDgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v1/commo" +
      "n;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V1" +
      ".Common\312\002\036Google\\Ads\\GoogleAds\\V1\\Common" +
      "\352\002\"Google::Ads::GoogleAds::V1::Commonb\006p" +
      "roto3"
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
          com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v1.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AppStoreProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.CallConversionReportingStateProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PriceExtensionPriceQualifierProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PriceExtensionPriceUnitProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PriceExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PromotionExtensionDiscountModifierProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.PromotionExtensionOccasionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_common_AppFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_common_AppFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_AppFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "AppId", "AppStore", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v1_common_CallFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_common_CallFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_CallFeedItem_descriptor,
        new java.lang.String[] { "PhoneNumber", "CountryCode", "CallTrackingEnabled", "CallConversionAction", "CallConversionTrackingDisabled", "CallConversionReportingState", });
    internal_static_google_ads_googleads_v1_common_CalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_common_CalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_CalloutFeedItem_descriptor,
        new java.lang.String[] { "CalloutText", });
    internal_static_google_ads_googleads_v1_common_TextMessageFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_common_TextMessageFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_TextMessageFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "CountryCode", "PhoneNumber", "Text", "ExtensionText", });
    internal_static_google_ads_googleads_v1_common_PriceFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_common_PriceFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_PriceFeedItem_descriptor,
        new java.lang.String[] { "Type", "PriceQualifier", "TrackingUrlTemplate", "LanguageCode", "PriceOfferings", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v1_common_PriceOffer_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v1_common_PriceOffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_PriceOffer_descriptor,
        new java.lang.String[] { "Header", "Description", "Price", "Unit", "FinalUrls", "FinalMobileUrls", });
    internal_static_google_ads_googleads_v1_common_PromotionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v1_common_PromotionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_PromotionFeedItem_descriptor,
        new java.lang.String[] { "PromotionTarget", "DiscountModifier", "PromotionStartDate", "PromotionEndDate", "Occasion", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LanguageCode", "PercentOff", "MoneyAmountOff", "PromotionCode", "OrdersOverAmount", "DiscountType", "PromotionTrigger", });
    internal_static_google_ads_googleads_v1_common_StructuredSnippetFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v1_common_StructuredSnippetFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_StructuredSnippetFeedItem_descriptor,
        new java.lang.String[] { "Header", "Values", });
    internal_static_google_ads_googleads_v1_common_SitelinkFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v1_common_SitelinkFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_common_SitelinkFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "Line1", "Line2", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", });
    com.google.ads.googleads.v1.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v1.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AppStoreProto.getDescriptor();
    com.google.ads.googleads.v1.enums.CallConversionReportingStateProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PriceExtensionPriceQualifierProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PriceExtensionPriceUnitProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PriceExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PromotionExtensionDiscountModifierProto.getDescriptor();
    com.google.ads.googleads.v1.enums.PromotionExtensionOccasionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}