// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.shoppingads;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.common.ListingScopeInfo;
import com.google.ads.googleads.v3.common.ProductBrandInfo;
import com.google.ads.googleads.v3.common.ProductCustomAttributeInfo;
import com.google.ads.googleads.v3.common.ProductTypeInfo;
import com.google.ads.googleads.v3.enums.ProductCustomAttributeIndexEnum.ProductCustomAttributeIndex;
import com.google.ads.googleads.v3.enums.ProductTypeLevelEnum.ProductTypeLevel;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.CampaignCriterion;
import com.google.ads.googleads.v3.resources.CampaignName;
import com.google.ads.googleads.v3.services.CampaignCriterionOperation;
import com.google.ads.googleads.v3.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v3.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v3.services.MutateCampaignCriterionResult;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a shopping listing scope to a shopping campaign. The example will construct and add a new
 * listing scope which will act as the inventory filter for the campaign. The campaign will only
 * advertise products that match the following requirements:
 *
 * <ul>
 *   <li>Brand is "google"
 *   <li>Custom label 0 is "top_selling_products"
 *   <li>Product type (level 1) is "electronics"
 *   <li>Product type (level 2) is "smartphones"
 * </ul>
 *
 * Only one listing scope is allowed per campaign. Remove any existing listing scopes before running
 * this example.
 */
public class AddListingScope {

  private static class AddListingScopeParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    AddListingScopeParams params = new AddListingScopeParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddListingScope().runExample(googleAdsClient, params.customerId, params.campaignId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignId the campaign ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    String campaignResourceName =
        CampaignName.format(Long.toString(customerId), Long.toString(campaignId));

    // Creates a campaign criterion to store the listing scope.
    CampaignCriterion.Builder campaignCriterionBuilder =
        CampaignCriterion.newBuilder().setCampaign(StringValue.of(campaignResourceName));

    // A listing scope allows you to filter the products that will be included in a given campaign.
    // You can specify multiple dimensions with conditions that must be met for a product to be
    // included in a campaign.
    // A typical ListingScope might only have a few dimensions. This example demonstrates a range of
    // different dimensions you could use.
    ListingScopeInfo.Builder listingScopeBuilder =
        campaignCriterionBuilder.getListingScopeBuilder();

    // Creates a ProductBrand dimension set to "google".
    listingScopeBuilder
        .addDimensionsBuilder()
        .setProductBrand(
            ProductBrandInfo.newBuilder()
                .setValue(StringValue.newBuilder().setValue("google").build()));

    // Creates a ProductCustomAttribute dimension for INDEX0 set to "top_selling_products".
    listingScopeBuilder
        .addDimensionsBuilder()
        .setProductCustomAttribute(
            ProductCustomAttributeInfo.newBuilder()
                .setIndex(ProductCustomAttributeIndex.INDEX0)
                .setValue(StringValue.of("top_selling_products"))
                .build());

    // Creates a ProductType dimension for LEVEL1 set to "electronics".
    listingScopeBuilder
        .addDimensionsBuilder()
        .setProductType(
            ProductTypeInfo.newBuilder()
                .setLevel(ProductTypeLevel.LEVEL1)
                .setValue(StringValue.of("electronics"))
                .build());

    // Creates a ProductType dimension for LEVEL2 set to "smartphones".
    listingScopeBuilder
        .addDimensionsBuilder()
        .setProductType(
            ProductTypeInfo.newBuilder()
                .setLevel(ProductTypeLevel.LEVEL2)
                .setValue(StringValue.of("smartphones"))
                .build());

    // Create a new campaign criterion containing the listingScope on the campaign.
    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      // Calls the mutate method to add the campaign criterion.
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId),
              ImmutableList.of(
                  CampaignCriterionOperation.newBuilder()
                      .setCreate(campaignCriterionBuilder)
                      .build()));
      System.out.printf("Added %d campaign criteria:%n", response.getResultsCount());
      for (MutateCampaignCriterionResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}
