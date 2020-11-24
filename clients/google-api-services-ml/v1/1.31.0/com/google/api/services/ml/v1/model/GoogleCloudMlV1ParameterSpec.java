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

package com.google.api.services.ml.v1.model;

/**
 * Represents a single hyperparameter to optimize.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1ParameterSpec extends com.google.api.client.json.GenericJson {

  /**
   * Required if type is `CATEGORICAL`. The list of possible categories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> categoricalValues;

  /**
   * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly
   * increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and
   * 4.0. This list should not contain more than 1,000 values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> discreteValues;

  /**
   * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`.
   * This value should be integers if type is `INTEGER`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxValue;

  /**
   * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`.
   * This value should be integers if type is INTEGER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minValue;

  /**
   * Required. The parameter name must be unique amongst all ParameterConfigs in a
   * HyperparameterSpec message. E.g., "learning_rate".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parameterName;

  /**
   * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical
   * parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g.,
   * `UNIT_LINEAR_SCALE`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scaleType;

  /**
   * Required. The type of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required if type is `CATEGORICAL`. The list of possible categories.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCategoricalValues() {
    return categoricalValues;
  }

  /**
   * Required if type is `CATEGORICAL`. The list of possible categories.
   * @param categoricalValues categoricalValues or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setCategoricalValues(java.util.List<java.lang.String> categoricalValues) {
    this.categoricalValues = categoricalValues;
    return this;
  }

  /**
   * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly
   * increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and
   * 4.0. This list should not contain more than 1,000 values.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getDiscreteValues() {
    return discreteValues;
  }

  /**
   * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly
   * increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and
   * 4.0. This list should not contain more than 1,000 values.
   * @param discreteValues discreteValues or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setDiscreteValues(java.util.List<java.lang.Double> discreteValues) {
    this.discreteValues = discreteValues;
    return this;
  }

  /**
   * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`.
   * This value should be integers if type is `INTEGER`.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxValue() {
    return maxValue;
  }

  /**
   * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`.
   * This value should be integers if type is `INTEGER`.
   * @param maxValue maxValue or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setMaxValue(java.lang.Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`.
   * This value should be integers if type is INTEGER.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinValue() {
    return minValue;
  }

  /**
   * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`.
   * This value should be integers if type is INTEGER.
   * @param minValue minValue or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setMinValue(java.lang.Double minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Required. The parameter name must be unique amongst all ParameterConfigs in a
   * HyperparameterSpec message. E.g., "learning_rate".
   * @return value or {@code null} for none
   */
  public java.lang.String getParameterName() {
    return parameterName;
  }

  /**
   * Required. The parameter name must be unique amongst all ParameterConfigs in a
   * HyperparameterSpec message. E.g., "learning_rate".
   * @param parameterName parameterName or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setParameterName(java.lang.String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  /**
   * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical
   * parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g.,
   * `UNIT_LINEAR_SCALE`).
   * @return value or {@code null} for none
   */
  public java.lang.String getScaleType() {
    return scaleType;
  }

  /**
   * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical
   * parameters. Some kind of scaling is strongly recommended for real or integral parameters (e.g.,
   * `UNIT_LINEAR_SCALE`).
   * @param scaleType scaleType or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setScaleType(java.lang.String scaleType) {
    this.scaleType = scaleType;
    return this;
  }

  /**
   * Required. The type of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of the parameter.
   * @param type type or {@code null} for none
   */
  public GoogleCloudMlV1ParameterSpec setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudMlV1ParameterSpec set(String fieldName, Object value) {
    return (GoogleCloudMlV1ParameterSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1ParameterSpec clone() {
    return (GoogleCloudMlV1ParameterSpec) super.clone();
  }

}
