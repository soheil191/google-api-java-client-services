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
 * Terms for Preferred Deals. Note that Preferred Deals cannot be created via the API at this time,
 * but can be returned in a get or list request.
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
public final class NonGuaranteedFixedPriceTerms extends com.google.api.client.json.GenericJson {

  /**
   * Fixed price for the specified buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PricePerBuyer> fixedPrices;

  static {
    // hack to force ProGuard to consider PricePerBuyer used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PricePerBuyer.class);
  }

  /**
   * Fixed price for the specified buyer.
   * @return value or {@code null} for none
   */
  public java.util.List<PricePerBuyer> getFixedPrices() {
    return fixedPrices;
  }

  /**
   * Fixed price for the specified buyer.
   * @param fixedPrices fixedPrices or {@code null} for none
   */
  public NonGuaranteedFixedPriceTerms setFixedPrices(java.util.List<PricePerBuyer> fixedPrices) {
    this.fixedPrices = fixedPrices;
    return this;
  }

  @Override
  public NonGuaranteedFixedPriceTerms set(String fieldName, Object value) {
    return (NonGuaranteedFixedPriceTerms) super.set(fieldName, value);
  }

  @Override
  public NonGuaranteedFixedPriceTerms clone() {
    return (NonGuaranteedFixedPriceTerms) super.clone();
  }

}
