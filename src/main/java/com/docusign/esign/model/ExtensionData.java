package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectedData;
import com.docusign.esign.model.ConnectionInstance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ExtensionData.
 *
 */

public class ExtensionData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("actionContract")
  private String actionContract = null;

  @JsonProperty("actionInputKey")
  private String actionInputKey = null;

  @JsonProperty("actionName")
  private String actionName = null;

  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("applicationName")
  private String applicationName = null;

  @JsonProperty("connectedFieldsData")
  private ConnectedData connectedFieldsData = null;

  @JsonProperty("connectionInstances")
  private java.util.List<ConnectionInstance> connectionInstances = null;

  @JsonProperty("extensionContract")
  private String extensionContract = null;

  @JsonProperty("extensionGroupId")
  private String extensionGroupId = null;

  @JsonProperty("extensionName")
  private String extensionName = null;

  @JsonProperty("extensionPolicy")
  private String extensionPolicy = null;

  @JsonProperty("publisherName")
  private String publisherName = null;

  @JsonProperty("requiredForExtension")
  private String requiredForExtension = null;


  /**
   * actionContract.
   *
   * @return ExtensionData
   **/
  public ExtensionData actionContract(String actionContract) {
    this.actionContract = actionContract;
    return this;
  }

  /**
   * .
   * @return actionContract
   **/
  @Schema(description = "")
  public String getActionContract() {
    return actionContract;
  }

  /**
   * setActionContract.
   **/
  public void setActionContract(String actionContract) {
    this.actionContract = actionContract;
  }


  /**
   * actionInputKey.
   *
   * @return ExtensionData
   **/
  public ExtensionData actionInputKey(String actionInputKey) {
    this.actionInputKey = actionInputKey;
    return this;
  }

  /**
   * .
   * @return actionInputKey
   **/
  @Schema(description = "")
  public String getActionInputKey() {
    return actionInputKey;
  }

  /**
   * setActionInputKey.
   **/
  public void setActionInputKey(String actionInputKey) {
    this.actionInputKey = actionInputKey;
  }


  /**
   * actionName.
   *
   * @return ExtensionData
   **/
  public ExtensionData actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

  /**
   * .
   * @return actionName
   **/
  @Schema(description = "")
  public String getActionName() {
    return actionName;
  }

  /**
   * setActionName.
   **/
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  /**
   * applicationId.
   *
   * @return ExtensionData
   **/
  public ExtensionData applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * .
   * @return applicationId
   **/
  @Schema(description = "")
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * setApplicationId.
   **/
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  /**
   * applicationName.
   *
   * @return ExtensionData
   **/
  public ExtensionData applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * .
   * @return applicationName
   **/
  @Schema(description = "")
  public String getApplicationName() {
    return applicationName;
  }

  /**
   * setApplicationName.
   **/
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  /**
   * connectedFieldsData.
   *
   * @return ExtensionData
   **/
  public ExtensionData connectedFieldsData(ConnectedData connectedFieldsData) {
    this.connectedFieldsData = connectedFieldsData;
    return this;
  }

  /**
   * .
   * @return connectedFieldsData
   **/
  @Schema(description = "")
  public ConnectedData getConnectedFieldsData() {
    return connectedFieldsData;
  }

  /**
   * setConnectedFieldsData.
   **/
  public void setConnectedFieldsData(ConnectedData connectedFieldsData) {
    this.connectedFieldsData = connectedFieldsData;
  }


  /**
   * connectionInstances.
   *
   * @return ExtensionData
   **/
  public ExtensionData connectionInstances(java.util.List<ConnectionInstance> connectionInstances) {
    this.connectionInstances = connectionInstances;
    return this;
  }
  
  /**
   * addConnectionInstancesItem.
   *
   * @return ExtensionData
   **/
  public ExtensionData addConnectionInstancesItem(ConnectionInstance connectionInstancesItem) {
    if (this.connectionInstances == null) {
      this.connectionInstances = new java.util.ArrayList<>();
    }
    this.connectionInstances.add(connectionInstancesItem);
    return this;
  }

  /**
   * .
   * @return connectionInstances
   **/
  @Schema(description = "")
  public java.util.List<ConnectionInstance> getConnectionInstances() {
    return connectionInstances;
  }

  /**
   * setConnectionInstances.
   **/
  public void setConnectionInstances(java.util.List<ConnectionInstance> connectionInstances) {
    this.connectionInstances = connectionInstances;
  }


  /**
   * extensionContract.
   *
   * @return ExtensionData
   **/
  public ExtensionData extensionContract(String extensionContract) {
    this.extensionContract = extensionContract;
    return this;
  }

  /**
   * .
   * @return extensionContract
   **/
  @Schema(description = "")
  public String getExtensionContract() {
    return extensionContract;
  }

  /**
   * setExtensionContract.
   **/
  public void setExtensionContract(String extensionContract) {
    this.extensionContract = extensionContract;
  }


  /**
   * extensionGroupId.
   *
   * @return ExtensionData
   **/
  public ExtensionData extensionGroupId(String extensionGroupId) {
    this.extensionGroupId = extensionGroupId;
    return this;
  }

  /**
   * .
   * @return extensionGroupId
   **/
  @Schema(description = "")
  public String getExtensionGroupId() {
    return extensionGroupId;
  }

  /**
   * setExtensionGroupId.
   **/
  public void setExtensionGroupId(String extensionGroupId) {
    this.extensionGroupId = extensionGroupId;
  }


  /**
   * extensionName.
   *
   * @return ExtensionData
   **/
  public ExtensionData extensionName(String extensionName) {
    this.extensionName = extensionName;
    return this;
  }

  /**
   * .
   * @return extensionName
   **/
  @Schema(description = "")
  public String getExtensionName() {
    return extensionName;
  }

  /**
   * setExtensionName.
   **/
  public void setExtensionName(String extensionName) {
    this.extensionName = extensionName;
  }


  /**
   * extensionPolicy.
   *
   * @return ExtensionData
   **/
  public ExtensionData extensionPolicy(String extensionPolicy) {
    this.extensionPolicy = extensionPolicy;
    return this;
  }

  /**
   * .
   * @return extensionPolicy
   **/
  @Schema(description = "")
  public String getExtensionPolicy() {
    return extensionPolicy;
  }

  /**
   * setExtensionPolicy.
   **/
  public void setExtensionPolicy(String extensionPolicy) {
    this.extensionPolicy = extensionPolicy;
  }


  /**
   * publisherName.
   *
   * @return ExtensionData
   **/
  public ExtensionData publisherName(String publisherName) {
    this.publisherName = publisherName;
    return this;
  }

  /**
   * .
   * @return publisherName
   **/
  @Schema(description = "")
  public String getPublisherName() {
    return publisherName;
  }

  /**
   * setPublisherName.
   **/
  public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;
  }


  /**
   * requiredForExtension.
   *
   * @return ExtensionData
   **/
  public ExtensionData requiredForExtension(String requiredForExtension) {
    this.requiredForExtension = requiredForExtension;
    return this;
  }

  /**
   * .
   * @return requiredForExtension
   **/
  @Schema(description = "")
  public String getRequiredForExtension() {
    return requiredForExtension;
  }

  /**
   * setRequiredForExtension.
   **/
  public void setRequiredForExtension(String requiredForExtension) {
    this.requiredForExtension = requiredForExtension;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionData extensionData = (ExtensionData) o;
    return Objects.equals(this.actionContract, extensionData.actionContract) &&
        Objects.equals(this.actionInputKey, extensionData.actionInputKey) &&
        Objects.equals(this.actionName, extensionData.actionName) &&
        Objects.equals(this.applicationId, extensionData.applicationId) &&
        Objects.equals(this.applicationName, extensionData.applicationName) &&
        Objects.equals(this.connectedFieldsData, extensionData.connectedFieldsData) &&
        Objects.equals(this.connectionInstances, extensionData.connectionInstances) &&
        Objects.equals(this.extensionContract, extensionData.extensionContract) &&
        Objects.equals(this.extensionGroupId, extensionData.extensionGroupId) &&
        Objects.equals(this.extensionName, extensionData.extensionName) &&
        Objects.equals(this.extensionPolicy, extensionData.extensionPolicy) &&
        Objects.equals(this.publisherName, extensionData.publisherName) &&
        Objects.equals(this.requiredForExtension, extensionData.requiredForExtension);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(actionContract, actionInputKey, actionName, applicationId, applicationName, connectedFieldsData, connectionInstances, extensionContract, extensionGroupId, extensionName, extensionPolicy, publisherName, requiredForExtension);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionData {\n");
    
    sb.append("    actionContract: ").append(toIndentedString(actionContract)).append("\n");
    sb.append("    actionInputKey: ").append(toIndentedString(actionInputKey)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    connectedFieldsData: ").append(toIndentedString(connectedFieldsData)).append("\n");
    sb.append("    connectionInstances: ").append(toIndentedString(connectionInstances)).append("\n");
    sb.append("    extensionContract: ").append(toIndentedString(extensionContract)).append("\n");
    sb.append("    extensionGroupId: ").append(toIndentedString(extensionGroupId)).append("\n");
    sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
    sb.append("    extensionPolicy: ").append(toIndentedString(extensionPolicy)).append("\n");
    sb.append("    publisherName: ").append(toIndentedString(publisherName)).append("\n");
    sb.append("    requiredForExtension: ").append(toIndentedString(requiredForExtension)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

