// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/customer_negative_criterion_service.proto

package com.google.ads.googleads.v3.services;

public final class CustomerNegativeCriterionServiceProto {
  private CustomerNegativeCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetCustomerNegativeCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetCustomerNegativeCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_CustomerNegativeCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_CustomerNegativeCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v3/services/custo" +
      "mer_negative_criterion_service.proto\022 go" +
      "ogle.ads.googleads.v3.services\032Cgoogle/a" +
      "ds/googleads/v3/resources/customer_negat" +
      "ive_criterion.proto\032\034google/api/annotati" +
      "ons.proto\032\027google/api/client.proto\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\032\027google/rpc/status.proto\"" +
      "x\n#GetCustomerNegativeCriterionRequest\022Q" +
      "\n\rresource_name\030\001 \001(\tB:\340A\002\372A4\n2googleads" +
      ".googleapis.com/CustomerNegativeCriterio" +
      "n\"\320\001\n%MutateCustomerNegativeCriteriaRequ" +
      "est\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022]\n\noperati" +
      "ons\030\002 \003(\0132D.google.ads.googleads.v3.serv" +
      "ices.CustomerNegativeCriterionOperationB" +
      "\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidat" +
      "e_only\030\004 \001(\010\"\223\001\n\"CustomerNegativeCriteri" +
      "onOperation\022N\n\006create\030\001 \001(\0132<.google.ads" +
      ".googleads.v3.resources.CustomerNegative" +
      "CriterionH\000\022\020\n\006remove\030\002 \001(\tH\000B\013\n\toperati" +
      "on\"\264\001\n&MutateCustomerNegativeCriteriaRes" +
      "ponse\0221\n\025partial_failure_error\030\003 \001(\0132\022.g" +
      "oogle.rpc.Status\022W\n\007results\030\002 \003(\0132F.goog" +
      "le.ads.googleads.v3.services.MutateCusto" +
      "merNegativeCriteriaResult\"=\n$MutateCusto" +
      "merNegativeCriteriaResult\022\025\n\rresource_na" +
      "me\030\001 \001(\t2\322\004\n CustomerNegativeCriterionSe" +
      "rvice\022\367\001\n\034GetCustomerNegativeCriterion\022E" +
      ".google.ads.googleads.v3.services.GetCus" +
      "tomerNegativeCriterionRequest\032<.google.a" +
      "ds.googleads.v3.resources.CustomerNegati" +
      "veCriterion\"R\202\323\344\223\002<\022:/v3/{resource_name=" +
      "customers/*/customerNegativeCriteria/*}\332" +
      "A\rresource_name\022\226\002\n\036MutateCustomerNegati" +
      "veCriteria\022G.google.ads.googleads.v3.ser" +
      "vices.MutateCustomerNegativeCriteriaRequ" +
      "est\032H.google.ads.googleads.v3.services.M" +
      "utateCustomerNegativeCriteriaResponse\"a\202" +
      "\323\344\223\002B\"=/v3/customers/{customer_id=*}/cus" +
      "tomerNegativeCriteria:mutate:\001*\332A\026custom" +
      "er_id,operations\032\033\312A\030googleads.googleapi" +
      "s.comB\214\002\n$com.google.ads.googleads.v3.se" +
      "rvicesB%CustomerNegativeCriterionService" +
      "ProtoP\001ZHgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v3/services;service" +
      "s\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Servic" +
      "es\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$" +
      "Google::Ads::GoogleAds::V3::Servicesb\006pr" +
      "oto3"
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
          com.google.ads.googleads.v3.resources.CustomerNegativeCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetCustomerNegativeCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetCustomerNegativeCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetCustomerNegativeCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_CustomerNegativeCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_CustomerNegativeCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_CustomerNegativeCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateCustomerNegativeCriteriaResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.CustomerNegativeCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
