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
 * Specifies the size of the creative.
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
public final class CreativeSize extends com.google.api.client.json.GenericJson {

  /**
   * What formats are allowed by the publisher. If this repeated field is empty then all formats are
   * allowed. E.g., if this field contains AllowedFormatType.AUDIO then the publisher only allows an
   * audio ad (without any video).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedFormats;

  /**
   * For video creatives specifies the sizes of companion ads (if present). Companion sizes may be
   * filled in only when creative_size_type = VIDEO
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Size> companionSizes;

  static {
    // hack to force ProGuard to consider Size used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Size.class);
  }

  /**
   * The creative size type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeSizeType;

  /**
   * The native template for this creative. It will have a value only if creative_size_type =
   * CreativeSizeType.NATIVE. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nativeTemplate;

  /**
   * For regular or video creative size type, specifies the size of the creative
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size size;

  /**
   * The type of skippable ad for this creative. It will have a value only if creative_size_type =
   * CreativeSizeType.VIDEO.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skippableAdType;

  /**
   * What formats are allowed by the publisher. If this repeated field is empty then all formats are
   * allowed. E.g., if this field contains AllowedFormatType.AUDIO then the publisher only allows an
   * audio ad (without any video).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedFormats() {
    return allowedFormats;
  }

  /**
   * What formats are allowed by the publisher. If this repeated field is empty then all formats are
   * allowed. E.g., if this field contains AllowedFormatType.AUDIO then the publisher only allows an
   * audio ad (without any video).
   * @param allowedFormats allowedFormats or {@code null} for none
   */
  public CreativeSize setAllowedFormats(java.util.List<java.lang.String> allowedFormats) {
    this.allowedFormats = allowedFormats;
    return this;
  }

  /**
   * For video creatives specifies the sizes of companion ads (if present). Companion sizes may be
   * filled in only when creative_size_type = VIDEO
   * @return value or {@code null} for none
   */
  public java.util.List<Size> getCompanionSizes() {
    return companionSizes;
  }

  /**
   * For video creatives specifies the sizes of companion ads (if present). Companion sizes may be
   * filled in only when creative_size_type = VIDEO
   * @param companionSizes companionSizes or {@code null} for none
   */
  public CreativeSize setCompanionSizes(java.util.List<Size> companionSizes) {
    this.companionSizes = companionSizes;
    return this;
  }

  /**
   * The creative size type.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeSizeType() {
    return creativeSizeType;
  }

  /**
   * The creative size type.
   * @param creativeSizeType creativeSizeType or {@code null} for none
   */
  public CreativeSize setCreativeSizeType(java.lang.String creativeSizeType) {
    this.creativeSizeType = creativeSizeType;
    return this;
  }

  /**
   * The native template for this creative. It will have a value only if creative_size_type =
   * CreativeSizeType.NATIVE. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getNativeTemplate() {
    return nativeTemplate;
  }

  /**
   * The native template for this creative. It will have a value only if creative_size_type =
   * CreativeSizeType.NATIVE. @OutputOnly
   * @param nativeTemplate nativeTemplate or {@code null} for none
   */
  public CreativeSize setNativeTemplate(java.lang.String nativeTemplate) {
    this.nativeTemplate = nativeTemplate;
    return this;
  }

  /**
   * For regular or video creative size type, specifies the size of the creative
   * @return value or {@code null} for none
   */
  public Size getSize() {
    return size;
  }

  /**
   * For regular or video creative size type, specifies the size of the creative
   * @param size size or {@code null} for none
   */
  public CreativeSize setSize(Size size) {
    this.size = size;
    return this;
  }

  /**
   * The type of skippable ad for this creative. It will have a value only if creative_size_type =
   * CreativeSizeType.VIDEO.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkippableAdType() {
    return skippableAdType;
  }

  /**
   * The type of skippable ad for this creative. It will have a value only if creative_size_type =
   * CreativeSizeType.VIDEO.
   * @param skippableAdType skippableAdType or {@code null} for none
   */
  public CreativeSize setSkippableAdType(java.lang.String skippableAdType) {
    this.skippableAdType = skippableAdType;
    return this;
  }

  @Override
  public CreativeSize set(String fieldName, Object value) {
    return (CreativeSize) super.set(fieldName, value);
  }

  @Override
  public CreativeSize clone() {
    return (CreativeSize) super.clone();
  }

}
