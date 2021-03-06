// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/customer_client.proto

package com.google.ads.googleads.v2.resources;

public final class CustomerClientProto {
  private CustomerClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CustomerClient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CustomerClient_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v2/resources/cust" +
      "omer_client.proto\022!google.ads.googleads." +
      "v2.resources\032\036google/protobuf/wrappers.p" +
      "roto\032\034google/api/annotations.proto\"\334\003\n\016C" +
      "ustomerClient\022\025\n\rresource_name\030\001 \001(\t\0225\n\017" +
      "client_customer\030\003 \001(\0132\034.google.protobuf." +
      "StringValue\022*\n\006hidden\030\004 \001(\0132\032.google.pro" +
      "tobuf.BoolValue\022*\n\005level\030\005 \001(\0132\033.google." +
      "protobuf.Int64Value\022/\n\ttime_zone\030\006 \001(\0132\034" +
      ".google.protobuf.StringValue\0220\n\014test_acc" +
      "ount\030\007 \001(\0132\032.google.protobuf.BoolValue\022+" +
      "\n\007manager\030\010 \001(\0132\032.google.protobuf.BoolVa" +
      "lue\0226\n\020descriptive_name\030\t \001(\0132\034.google.p" +
      "rotobuf.StringValue\0223\n\rcurrency_code\030\n \001" +
      "(\0132\034.google.protobuf.StringValue\022\'\n\002id\030\013" +
      " \001(\0132\033.google.protobuf.Int64ValueB\200\002\n%co" +
      "m.google.ads.googleads.v2.resourcesB\023Cus" +
      "tomerClientProtoP\001ZJgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v2/resou" +
      "rces;resources\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V2.Resources\312\002!Google\\Ads\\GoogleAds\\" +
      "V2\\Resources\352\002%Google::Ads::GoogleAds::V" +
      "2::Resourcesb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_CustomerClient_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CustomerClient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CustomerClient_descriptor,
        new java.lang.String[] { "ResourceName", "ClientCustomer", "Hidden", "Level", "TimeZone", "TestAccount", "Manager", "DescriptiveName", "CurrencyCode", "Id", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
