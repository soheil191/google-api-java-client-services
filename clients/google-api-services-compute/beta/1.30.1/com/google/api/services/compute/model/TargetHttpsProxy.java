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
 * Represents a Target HTTPS Proxy resource.
 *
 * Google Compute Engine has two Target HTTPS Proxy resources:
 *
 * * [Global](/compute/docs/reference/rest/{$api_version}/targetHttpsProxies) *
 * [Regional](/compute/docs/reference/rest/{$api_version}/regionTargetHttpsProxies)
 *
 * A target HTTPS proxy is a component of GCP HTTPS load balancers.
 *
 * * targetHttpsProxies are used by external HTTPS load balancers. * regionTargetHttpsProxies are
 * used by internal HTTPS load balancers.
 *
 * Forwarding rules reference a target HTTPS proxy, and the target proxy then references a URL map.
 * For more information, read Using Target Proxies and  Forwarding rule concepts. (== resource_for
 * {$api_version}.targetHttpsProxies ==) (== resource_for {$api_version}.regionTargetHttpsProxies
 * ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetHttpsProxy extends com.google.api.client.json.GenericJson {

  /**
   * [Deprecated] Use serverTlsPolicy instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authentication;

  /**
   * [Deprecated] Use authorizationPolicy instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorization;

  /**
   * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how
   * the proxy should authorize inbound traffic. If left blank, access will not be restricted by an
   * authorization policy. Refer to the AuthorizationPolicy resource for additional details.
   * authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules
   * with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorizationPolicy;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This field only applies when the loadBalancingScheme is INTERNAL_SELF_MANAGED. When set to true
   * the Envoy binds on the IP address specified by the forwarding rule. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean proxyBind;

  /**
   * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines
   * whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE,
   * ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used.
   * - When quic-override is set to ENABLE, the load balancer uses QUIC when possible.  - When quic-
   * override is set to DISABLE, the load balancer doesn't use QUIC.  - If the quic-override flag is
   * not specified, NONE is implied. -
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quicOverride;

  /**
   * [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not
   * applicable to global TargetHttpsProxies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the
   * proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global
   * TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to
   * INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverTlsPolicy;

  /**
   * URLs to SslCertificate resources that are used to authenticate connections between users and
   * the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   * up to 15 SSL certificates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sslCertificates;

  /**
   * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not
   * set, the TargetHttpsProxy resource has no SSL policy configured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sslPolicy;

  /**
   * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL
   * to the BackendService. For example, the following are all valid URLs for specifying a URL map:
   * - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map  -
   * projects/project/global/urlMaps/url-map  - global/urlMaps/url-map
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String urlMap;

  /**
   * [Deprecated] Use serverTlsPolicy instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthentication() {
    return authentication;
  }

  /**
   * [Deprecated] Use serverTlsPolicy instead.
   * @param authentication authentication or {@code null} for none
   */
  public TargetHttpsProxy setAuthentication(java.lang.String authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * [Deprecated] Use authorizationPolicy instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorization() {
    return authorization;
  }

  /**
   * [Deprecated] Use authorizationPolicy instead.
   * @param authorization authorization or {@code null} for none
   */
  public TargetHttpsProxy setAuthorization(java.lang.String authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how
   * the proxy should authorize inbound traffic. If left blank, access will not be restricted by an
   * authorization policy. Refer to the AuthorizationPolicy resource for additional details.
   * authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules
   * with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorizationPolicy() {
    return authorizationPolicy;
  }

  /**
   * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how
   * the proxy should authorize inbound traffic. If left blank, access will not be restricted by an
   * authorization policy. Refer to the AuthorizationPolicy resource for additional details.
   * authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules
   * with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * @param authorizationPolicy authorizationPolicy or {@code null} for none
   */
  public TargetHttpsProxy setAuthorizationPolicy(java.lang.String authorizationPolicy) {
    this.authorizationPolicy = authorizationPolicy;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public TargetHttpsProxy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public TargetHttpsProxy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public TargetHttpsProxy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
   * @param kind kind or {@code null} for none
   */
  public TargetHttpsProxy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public TargetHttpsProxy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This field only applies when the loadBalancingScheme is INTERNAL_SELF_MANAGED. When set to true
   * the Envoy binds on the IP address specified by the forwarding rule. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProxyBind() {
    return proxyBind;
  }

  /**
   * This field only applies when the loadBalancingScheme is INTERNAL_SELF_MANAGED. When set to true
   * the Envoy binds on the IP address specified by the forwarding rule. Default is false.
   * @param proxyBind proxyBind or {@code null} for none
   */
  public TargetHttpsProxy setProxyBind(java.lang.Boolean proxyBind) {
    this.proxyBind = proxyBind;
    return this;
  }

  /**
   * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines
   * whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE,
   * ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used.
   * - When quic-override is set to ENABLE, the load balancer uses QUIC when possible.  - When quic-
   * override is set to DISABLE, the load balancer doesn't use QUIC.  - If the quic-override flag is
   * not specified, NONE is implied. -
   * @return value or {@code null} for none
   */
  public java.lang.String getQuicOverride() {
    return quicOverride;
  }

  /**
   * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines
   * whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE,
   * ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used.
   * - When quic-override is set to ENABLE, the load balancer uses QUIC when possible.  - When quic-
   * override is set to DISABLE, the load balancer doesn't use QUIC.  - If the quic-override flag is
   * not specified, NONE is implied. -
   * @param quicOverride quicOverride or {@code null} for none
   */
  public TargetHttpsProxy setQuicOverride(java.lang.String quicOverride) {
    this.quicOverride = quicOverride;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not
   * applicable to global TargetHttpsProxies.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional TargetHttpsProxy resides. This field is not
   * applicable to global TargetHttpsProxies.
   * @param region region or {@code null} for none
   */
  public TargetHttpsProxy setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public TargetHttpsProxy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the
   * proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global
   * TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to
   * INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerTlsPolicy() {
    return serverTlsPolicy;
  }

  /**
   * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the
   * proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global
   * TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to
   * INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted.
   * @param serverTlsPolicy serverTlsPolicy or {@code null} for none
   */
  public TargetHttpsProxy setServerTlsPolicy(java.lang.String serverTlsPolicy) {
    this.serverTlsPolicy = serverTlsPolicy;
    return this;
  }

  /**
   * URLs to SslCertificate resources that are used to authenticate connections between users and
   * the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   * up to 15 SSL certificates.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSslCertificates() {
    return sslCertificates;
  }

  /**
   * URLs to SslCertificate resources that are used to authenticate connections between users and
   * the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   * up to 15 SSL certificates.
   * @param sslCertificates sslCertificates or {@code null} for none
   */
  public TargetHttpsProxy setSslCertificates(java.util.List<java.lang.String> sslCertificates) {
    this.sslCertificates = sslCertificates;
    return this;
  }

  /**
   * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not
   * set, the TargetHttpsProxy resource has no SSL policy configured.
   * @return value or {@code null} for none
   */
  public java.lang.String getSslPolicy() {
    return sslPolicy;
  }

  /**
   * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not
   * set, the TargetHttpsProxy resource has no SSL policy configured.
   * @param sslPolicy sslPolicy or {@code null} for none
   */
  public TargetHttpsProxy setSslPolicy(java.lang.String sslPolicy) {
    this.sslPolicy = sslPolicy;
    return this;
  }

  /**
   * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL
   * to the BackendService. For example, the following are all valid URLs for specifying a URL map:
   * - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map  -
   * projects/project/global/urlMaps/url-map  - global/urlMaps/url-map
   * @return value or {@code null} for none
   */
  public java.lang.String getUrlMap() {
    return urlMap;
  }

  /**
   * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL
   * to the BackendService. For example, the following are all valid URLs for specifying a URL map:
   * - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map  -
   * projects/project/global/urlMaps/url-map  - global/urlMaps/url-map
   * @param urlMap urlMap or {@code null} for none
   */
  public TargetHttpsProxy setUrlMap(java.lang.String urlMap) {
    this.urlMap = urlMap;
    return this;
  }

  @Override
  public TargetHttpsProxy set(String fieldName, Object value) {
    return (TargetHttpsProxy) super.set(fieldName, value);
  }

  @Override
  public TargetHttpsProxy clone() {
    return (TargetHttpsProxy) super.clone();
  }

}
