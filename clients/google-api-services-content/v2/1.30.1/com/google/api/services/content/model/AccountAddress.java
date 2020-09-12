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

package com.google.api.services.content.model;

/**
 * Model definition for AccountAddress.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountAddress extends com.google.api.client.json.GenericJson {

  /**
   * CLDR country code (e.g. "US"). This value cannot be set for a sub-account of an MCA. All MCA
   * sub-accounts inherit the country of their parent MCA.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * City, town or commune. May also include dependent localities or sublocalities (e.g.
   * neighborhoods or suburbs).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * Postal code or ZIP (e.g. "94043").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * Top-level administrative subdivision of the country. For example, a state like California
   * ("CA") or a province like Quebec ("QC").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Street-level part of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streetAddress;

  /**
   * CLDR country code (e.g. "US"). This value cannot be set for a sub-account of an MCA. All MCA
   * sub-accounts inherit the country of their parent MCA.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * CLDR country code (e.g. "US"). This value cannot be set for a sub-account of an MCA. All MCA
   * sub-accounts inherit the country of their parent MCA.
   * @param country country or {@code null} for none
   */
  public AccountAddress setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * City, town or commune. May also include dependent localities or sublocalities (e.g.
   * neighborhoods or suburbs).
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * City, town or commune. May also include dependent localities or sublocalities (e.g.
   * neighborhoods or suburbs).
   * @param locality locality or {@code null} for none
   */
  public AccountAddress setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Postal code or ZIP (e.g. "94043").
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * Postal code or ZIP (e.g. "94043").
   * @param postalCode postalCode or {@code null} for none
   */
  public AccountAddress setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Top-level administrative subdivision of the country. For example, a state like California
   * ("CA") or a province like Quebec ("QC").
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Top-level administrative subdivision of the country. For example, a state like California
   * ("CA") or a province like Quebec ("QC").
   * @param region region or {@code null} for none
   */
  public AccountAddress setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Street-level part of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getStreetAddress() {
    return streetAddress;
  }

  /**
   * Street-level part of the address.
   * @param streetAddress streetAddress or {@code null} for none
   */
  public AccountAddress setStreetAddress(java.lang.String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  @Override
  public AccountAddress set(String fieldName, Object value) {
    return (AccountAddress) super.set(fieldName, value);
  }

  @Override
  public AccountAddress clone() {
    return (AccountAddress) super.clone();
  }

}
