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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * Autoscaling Policy config associated with the cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The autoscaling policy used by the cluster.Only resource names including projectid
   * and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[proj
   * ect_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
   * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the
   * policy must be in the same project and Dataproc region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyUri;

  /**
   * Optional. The autoscaling policy used by the cluster.Only resource names including projectid
   * and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[proj
   * ect_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
   * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the
   * policy must be in the same project and Dataproc region.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyUri() {
    return policyUri;
  }

  /**
   * Optional. The autoscaling policy used by the cluster.Only resource names including projectid
   * and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[proj
   * ect_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
   * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the
   * policy must be in the same project and Dataproc region.
   * @param policyUri policyUri or {@code null} for none
   */
  public AutoscalingConfig setPolicyUri(java.lang.String policyUri) {
    this.policyUri = policyUri;
    return this;
  }

  @Override
  public AutoscalingConfig set(String fieldName, Object value) {
    return (AutoscalingConfig) super.set(fieldName, value);
  }

  @Override
  public AutoscalingConfig clone() {
    return (AutoscalingConfig) super.clone();
  }

}
