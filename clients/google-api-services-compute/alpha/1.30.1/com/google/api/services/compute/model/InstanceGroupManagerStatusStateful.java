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
 * Model definition for InstanceGroupManagerStatusStateful.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupManagerStatusStateful extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration,
   * that is, if you have configured any items in a stateful policy or in per-instance configs. The
   * group might report that it has no stateful config even when there is still some preserved state
   * on a managed instance, for example, if you have deleted all PICs but not yet applied those
   * deletions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasStatefulConfig;

  /**
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration,
   * that is, if you have configured any items in a stateful policy or in per-instance configs. The
   * group might report that it has no stateful config even when there is still some preserved state
   * on a managed instance, for example, if you have deleted all PICs but not yet applied those
   * deletions. This field is deprecated in favor of has_stateful_config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isStateful;

  /**
   * [Output Only] Status of per-instance configs on the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupManagerStatusStatefulPerInstanceConfigs perInstanceConfigs;

  /**
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration,
   * that is, if you have configured any items in a stateful policy or in per-instance configs. The
   * group might report that it has no stateful config even when there is still some preserved state
   * on a managed instance, for example, if you have deleted all PICs but not yet applied those
   * deletions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasStatefulConfig() {
    return hasStatefulConfig;
  }

  /**
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration,
   * that is, if you have configured any items in a stateful policy or in per-instance configs. The
   * group might report that it has no stateful config even when there is still some preserved state
   * on a managed instance, for example, if you have deleted all PICs but not yet applied those
   * deletions.
   * @param hasStatefulConfig hasStatefulConfig or {@code null} for none
   */
  public InstanceGroupManagerStatusStateful setHasStatefulConfig(java.lang.Boolean hasStatefulConfig) {
    this.hasStatefulConfig = hasStatefulConfig;
    return this;
  }

  /**
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration,
   * that is, if you have configured any items in a stateful policy or in per-instance configs. The
   * group might report that it has no stateful config even when there is still some preserved state
   * on a managed instance, for example, if you have deleted all PICs but not yet applied those
   * deletions. This field is deprecated in favor of has_stateful_config.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsStateful() {
    return isStateful;
  }

  /**
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration,
   * that is, if you have configured any items in a stateful policy or in per-instance configs. The
   * group might report that it has no stateful config even when there is still some preserved state
   * on a managed instance, for example, if you have deleted all PICs but not yet applied those
   * deletions. This field is deprecated in favor of has_stateful_config.
   * @param isStateful isStateful or {@code null} for none
   */
  public InstanceGroupManagerStatusStateful setIsStateful(java.lang.Boolean isStateful) {
    this.isStateful = isStateful;
    return this;
  }

  /**
   * [Output Only] Status of per-instance configs on the instance.
   * @return value or {@code null} for none
   */
  public InstanceGroupManagerStatusStatefulPerInstanceConfigs getPerInstanceConfigs() {
    return perInstanceConfigs;
  }

  /**
   * [Output Only] Status of per-instance configs on the instance.
   * @param perInstanceConfigs perInstanceConfigs or {@code null} for none
   */
  public InstanceGroupManagerStatusStateful setPerInstanceConfigs(InstanceGroupManagerStatusStatefulPerInstanceConfigs perInstanceConfigs) {
    this.perInstanceConfigs = perInstanceConfigs;
    return this;
  }

  @Override
  public InstanceGroupManagerStatusStateful set(String fieldName, Object value) {
    return (InstanceGroupManagerStatusStateful) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupManagerStatusStateful clone() {
    return (InstanceGroupManagerStatusStateful) super.clone();
  }

}
