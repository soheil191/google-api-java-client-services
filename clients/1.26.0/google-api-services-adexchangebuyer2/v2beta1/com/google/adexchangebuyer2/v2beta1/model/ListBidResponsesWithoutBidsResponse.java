/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * Response message for listing all reasons that bid responses were considered to have no applicable
 * bids.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListBidResponsesWithoutBidsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of rows, with counts of bid responses without bids aggregated by status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BidResponseWithoutBidsStatusRow> bidResponseWithoutBidsStatusRows;

  static {
    // hack to force ProGuard to consider BidResponseWithoutBidsStatusRow used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BidResponseWithoutBidsStatusRow.class);
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the
   * ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call to the
   * bidResponsesWithoutBids.list method to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of rows, with counts of bid responses without bids aggregated by status.
   * @return value or {@code null} for none
   */
  public java.util.List<BidResponseWithoutBidsStatusRow> getBidResponseWithoutBidsStatusRows() {
    return bidResponseWithoutBidsStatusRows;
  }

  /**
   * List of rows, with counts of bid responses without bids aggregated by status.
   * @param bidResponseWithoutBidsStatusRows bidResponseWithoutBidsStatusRows or {@code null} for none
   */
  public ListBidResponsesWithoutBidsResponse setBidResponseWithoutBidsStatusRows(java.util.List<BidResponseWithoutBidsStatusRow> bidResponseWithoutBidsStatusRows) {
    this.bidResponseWithoutBidsStatusRows = bidResponseWithoutBidsStatusRows;
    return this;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the
   * ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call to the
   * bidResponsesWithoutBids.list method to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the
   * ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call to the
   * bidResponsesWithoutBids.list method to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListBidResponsesWithoutBidsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListBidResponsesWithoutBidsResponse set(String fieldName, Object value) {
    return (ListBidResponsesWithoutBidsResponse) super.set(fieldName, value);
  }

  @Override
  public ListBidResponsesWithoutBidsResponse clone() {
    return (ListBidResponsesWithoutBidsResponse) super.clone();
  }

}
