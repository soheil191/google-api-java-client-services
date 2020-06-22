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

package com.google.api.services.compute.model;

/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must
 * be specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallPolicyRuleMatcher extends com.google.api.client.json.GenericJson {

  /**
   * CIDR IP address range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destIpRanges;

  /**
   * Pairs of IP protocols and ports that the rule should match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirewallPolicyRuleMatcherLayer4Config> layer4Configs;

  /**
   * CIDR IP address range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> srcIpRanges;

  /**
   * CIDR IP address range.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestIpRanges() {
    return destIpRanges;
  }

  /**
   * CIDR IP address range.
   * @param destIpRanges destIpRanges or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setDestIpRanges(java.util.List<java.lang.String> destIpRanges) {
    this.destIpRanges = destIpRanges;
    return this;
  }

  /**
   * Pairs of IP protocols and ports that the rule should match.
   * @return value or {@code null} for none
   */
  public java.util.List<FirewallPolicyRuleMatcherLayer4Config> getLayer4Configs() {
    return layer4Configs;
  }

  /**
   * Pairs of IP protocols and ports that the rule should match.
   * @param layer4Configs layer4Configs or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setLayer4Configs(java.util.List<FirewallPolicyRuleMatcherLayer4Config> layer4Configs) {
    this.layer4Configs = layer4Configs;
    return this;
  }

  /**
   * CIDR IP address range.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSrcIpRanges() {
    return srcIpRanges;
  }

  /**
   * CIDR IP address range.
   * @param srcIpRanges srcIpRanges or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setSrcIpRanges(java.util.List<java.lang.String> srcIpRanges) {
    this.srcIpRanges = srcIpRanges;
    return this;
  }

  @Override
  public FirewallPolicyRuleMatcher set(String fieldName, Object value) {
    return (FirewallPolicyRuleMatcher) super.set(fieldName, value);
  }

  @Override
  public FirewallPolicyRuleMatcher clone() {
    return (FirewallPolicyRuleMatcher) super.clone();
  }

}
