package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConnectUserObject. */
public class ConnectUserObject {
  @JsonProperty("configurationtype")
  private String configurationtype = null;

  @JsonProperty("connectId")
  private String connectId = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("hasAccess")
  private String hasAccess = null;

  @JsonProperty("senderSearchableItems")
  private java.util.List<String> senderSearchableItems = null;

  /**
   * configurationtype.
   *
   * @return ConnectUserObject
   */
  public ConnectUserObject configurationtype(String configurationtype) {
    this.configurationtype = configurationtype;
    return this;
  }

  /**
   * If merge field's are being used, specifies the type of the merge field. The only supported
   * value is **salesforce**..
   *
   * @return configurationtype
   */
  @ApiModelProperty(
      value =
          "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationtype() {
    return configurationtype;
  }

  /** setConfigurationtype. */
  public void setConfigurationtype(String configurationtype) {
    this.configurationtype = configurationtype;
  }

  /**
   * connectId.
   *
   * @return ConnectUserObject
   */
  public ConnectUserObject connectId(String connectId) {
    this.connectId = connectId;
    return this;
  }

  /**
   * .
   *
   * @return connectId
   */
  @ApiModelProperty(value = "")
  public String getConnectId() {
    return connectId;
  }

  /** setConnectId. */
  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }

  /**
   * enabled.
   *
   * @return ConnectUserObject
   */
  public ConnectUserObject enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * .
   *
   * @return enabled
   */
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  /** setEnabled. */
  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  /**
   * hasAccess.
   *
   * @return ConnectUserObject
   */
  public ConnectUserObject hasAccess(String hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * .
   *
   * @return hasAccess
   */
  @ApiModelProperty(value = "")
  public String getHasAccess() {
    return hasAccess;
  }

  /** setHasAccess. */
  public void setHasAccess(String hasAccess) {
    this.hasAccess = hasAccess;
  }

  /**
   * senderSearchableItems.
   *
   * @return ConnectUserObject
   */
  public ConnectUserObject senderSearchableItems(java.util.List<String> senderSearchableItems) {
    this.senderSearchableItems = senderSearchableItems;
    return this;
  }

  /**
   * addSenderSearchableItemsItem.
   *
   * @return ConnectUserObject
   */
  public ConnectUserObject addSenderSearchableItemsItem(String senderSearchableItemsItem) {
    if (this.senderSearchableItems == null) {
      this.senderSearchableItems = new java.util.ArrayList<>();
    }
    this.senderSearchableItems.add(senderSearchableItemsItem);
    return this;
  }

  /**
   * .
   *
   * @return senderSearchableItems
   */
  @ApiModelProperty(value = "")
  public java.util.List<String> getSenderSearchableItems() {
    return senderSearchableItems;
  }

  /** setSenderSearchableItems. */
  public void setSenderSearchableItems(java.util.List<String> senderSearchableItems) {
    this.senderSearchableItems = senderSearchableItems;
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
    ConnectUserObject connectUserObject = (ConnectUserObject) o;
    return Objects.equals(this.configurationtype, connectUserObject.configurationtype)
        && Objects.equals(this.connectId, connectUserObject.connectId)
        && Objects.equals(this.enabled, connectUserObject.enabled)
        && Objects.equals(this.hasAccess, connectUserObject.hasAccess)
        && Objects.equals(this.senderSearchableItems, connectUserObject.senderSearchableItems);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(configurationtype, connectId, enabled, hasAccess, senderSearchableItems);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectUserObject {\n");

    sb.append("    configurationtype: ").append(toIndentedString(configurationtype)).append("\n");
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    senderSearchableItems: ")
        .append(toIndentedString(senderSearchableItems))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
