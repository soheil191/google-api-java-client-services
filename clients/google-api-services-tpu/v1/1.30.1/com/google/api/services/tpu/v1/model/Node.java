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

package com.google.api.services.tpu.v1.model;

/**
 * A TPU instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Node extends com.google.api.client.json.GenericJson {

  /**
   * The type of hardware accelerators associated with this node. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorType;

  /**
   * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be
   * a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block
   * would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block conflicts with any
   * subnetworks in the user's provided network, or the provided network is peered with another
   * network that is using that CIDR block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cidrBlock;

  /**
   * Output only. The time when the node was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The health status of the TPU node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String health;

  /**
   * Output only. If this field is populated, it contains a description of why the TPU Node is
   * unhealthy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthDescription;

  /**
   * Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as
   * visible to Compute Engine instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * Resource labels to represent user-provided metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The immutable name of the TPU
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute
   * Engine network inside of the project on which this API has been activated. If none is provided,
   * "default" will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Output only. The network endpoints where TPU workers can be accessed and sent work. It is
   * recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkEndpoint> networkEndpoints;

  static {
    // hack to force ProGuard to consider NetworkEndpoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NetworkEndpoint.class);
  }

  /**
   * Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as
   * visible to Compute Engine instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String port;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SchedulingConfig schedulingConfig;

  /**
   * Output only. The service account used to run the tensor flow services within the node. To share
   * resources, including Google Cloud Storage data, with the Tensorflow job running in the Node,
   * this account must have permissions to that data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. The current state for the TPU Node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The version of Tensorflow running in the Node. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tensorflowVersion;

  /**
   * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering
   * should be set up before provisioning the node. If this field is set, cidr_block field should
   * not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC
   * networks, the node must be created with this this field enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useServiceNetworking;

  /**
   * The type of hardware accelerators associated with this node. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorType() {
    return acceleratorType;
  }

  /**
   * The type of hardware accelerators associated with this node. Required.
   * @param acceleratorType acceleratorType or {@code null} for none
   */
  public Node setAcceleratorType(java.lang.String acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  /**
   * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be
   * a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block
   * would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block conflicts with any
   * subnetworks in the user's provided network, or the provided network is peered with another
   * network that is using that CIDR block.
   * @return value or {@code null} for none
   */
  public java.lang.String getCidrBlock() {
    return cidrBlock;
  }

  /**
   * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be
   * a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block
   * would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block conflicts with any
   * subnetworks in the user's provided network, or the provided network is peered with another
   * network that is using that CIDR block.
   * @param cidrBlock cidrBlock or {@code null} for none
   */
  public Node setCidrBlock(java.lang.String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

  /**
   * Output only. The time when the node was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the node was created.
   * @param createTime createTime or {@code null} for none
   */
  public Node setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * @param description description or {@code null} for none
   */
  public Node setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The health status of the TPU node.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealth() {
    return health;
  }

  /**
   * The health status of the TPU node.
   * @param health health or {@code null} for none
   */
  public Node setHealth(java.lang.String health) {
    this.health = health;
    return this;
  }

  /**
   * Output only. If this field is populated, it contains a description of why the TPU Node is
   * unhealthy.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthDescription() {
    return healthDescription;
  }

  /**
   * Output only. If this field is populated, it contains a description of why the TPU Node is
   * unhealthy.
   * @param healthDescription healthDescription or {@code null} for none
   */
  public Node setHealthDescription(java.lang.String healthDescription) {
    this.healthDescription = healthDescription;
    return this;
  }

  /**
   * Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as
   * visible to Compute Engine instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as
   * visible to Compute Engine instances.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public Node setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Resource labels to represent user-provided metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Resource labels to represent user-provided metadata.
   * @param labels labels or {@code null} for none
   */
  public Node setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The immutable name of the TPU
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The immutable name of the TPU
   * @param name name or {@code null} for none
   */
  public Node setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute
   * Engine network inside of the project on which this API has been activated. If none is provided,
   * "default" will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute
   * Engine network inside of the project on which this API has been activated. If none is provided,
   * "default" will be used.
   * @param network network or {@code null} for none
   */
  public Node setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Output only. The network endpoints where TPU workers can be accessed and sent work. It is
   * recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkEndpoint> getNetworkEndpoints() {
    return networkEndpoints;
  }

  /**
   * Output only. The network endpoints where TPU workers can be accessed and sent work. It is
   * recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
   * @param networkEndpoints networkEndpoints or {@code null} for none
   */
  public Node setNetworkEndpoints(java.util.List<NetworkEndpoint> networkEndpoints) {
    this.networkEndpoints = networkEndpoints;
    return this;
  }

  /**
   * Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as
   * visible to Compute Engine instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getPort() {
    return port;
  }

  /**
   * Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as
   * visible to Compute Engine instances.
   * @param port port or {@code null} for none
   */
  public Node setPort(java.lang.String port) {
    this.port = port;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SchedulingConfig getSchedulingConfig() {
    return schedulingConfig;
  }

  /**
   * @param schedulingConfig schedulingConfig or {@code null} for none
   */
  public Node setSchedulingConfig(SchedulingConfig schedulingConfig) {
    this.schedulingConfig = schedulingConfig;
    return this;
  }

  /**
   * Output only. The service account used to run the tensor flow services within the node. To share
   * resources, including Google Cloud Storage data, with the Tensorflow job running in the Node,
   * this account must have permissions to that data.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Output only. The service account used to run the tensor flow services within the node. To share
   * resources, including Google Cloud Storage data, with the Tensorflow job running in the Node,
   * this account must have permissions to that data.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Node setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. The current state for the TPU Node.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state for the TPU Node.
   * @param state state or {@code null} for none
   */
  public Node setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The version of Tensorflow running in the Node. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getTensorflowVersion() {
    return tensorflowVersion;
  }

  /**
   * The version of Tensorflow running in the Node. Required.
   * @param tensorflowVersion tensorflowVersion or {@code null} for none
   */
  public Node setTensorflowVersion(java.lang.String tensorflowVersion) {
    this.tensorflowVersion = tensorflowVersion;
    return this;
  }

  /**
   * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering
   * should be set up before provisioning the node. If this field is set, cidr_block field should
   * not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC
   * networks, the node must be created with this this field enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseServiceNetworking() {
    return useServiceNetworking;
  }

  /**
   * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering
   * should be set up before provisioning the node. If this field is set, cidr_block field should
   * not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC
   * networks, the node must be created with this this field enabled.
   * @param useServiceNetworking useServiceNetworking or {@code null} for none
   */
  public Node setUseServiceNetworking(java.lang.Boolean useServiceNetworking) {
    this.useServiceNetworking = useServiceNetworking;
    return this;
  }

  @Override
  public Node set(String fieldName, Object value) {
    return (Node) super.set(fieldName, value);
  }

  @Override
  public Node clone() {
    return (Node) super.clone();
  }

}
