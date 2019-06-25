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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * Response to list all photos that belong to a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPhotosResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of photos. The pageSize field in the request determines the number of items returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Photo> photos;

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListPhotosResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of photos. The pageSize field in the request determines the number of items returned.
   * @return value or {@code null} for none
   */
  public java.util.List<Photo> getPhotos() {
    return photos;
  }

  /**
   * List of photos. The pageSize field in the request determines the number of items returned.
   * @param photos photos or {@code null} for none
   */
  public ListPhotosResponse setPhotos(java.util.List<Photo> photos) {
    this.photos = photos;
    return this;
  }

  @Override
  public ListPhotosResponse set(String fieldName, Object value) {
    return (ListPhotosResponse) super.set(fieldName, value);
  }

  @Override
  public ListPhotosResponse clone() {
    return (ListPhotosResponse) super.clone();
  }

}
