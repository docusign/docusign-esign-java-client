package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object is used to match a DocuSign field to a Salesforce field so that
 * Docusign can send information to your Salesforce account..
 *
 */
@Schema(description = "This object is used to match a DocuSign field to a Salesforce field so that Docusign can send information to your Salesforce account.")

public class ConnectSalesforceField {
  @JsonProperty("dsAttribute")
  private String dsAttribute = null;

  @JsonProperty("dsLink")
  private String dsLink = null;

  @JsonProperty("dsNode")
  private String dsNode = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("sfField")
  private String sfField = null;

  @JsonProperty("sfFieldName")
  private String sfFieldName = null;

  @JsonProperty("sfFolder")
  private String sfFolder = null;

  @JsonProperty("sfLockedValue")
  private String sfLockedValue = null;

  /**
   * dsAttribute.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField dsAttribute(String dsAttribute) {
    this.dsAttribute = dsAttribute;
    return this;
  }

  /**
   * .
   * 
   * @return dsAttribute
   **/
  @Schema(description = "")
  public String getDsAttribute() {
    return dsAttribute;
  }

  /**
   * setDsAttribute.
   **/
  public void setDsAttribute(String dsAttribute) {
    this.dsAttribute = dsAttribute;
  }

  /**
   * dsLink.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField dsLink(String dsLink) {
    this.dsLink = dsLink;
    return this;
  }

  /**
   * .
   * 
   * @return dsLink
   **/
  @Schema(description = "")
  public String getDsLink() {
    return dsLink;
  }

  /**
   * setDsLink.
   **/
  public void setDsLink(String dsLink) {
    this.dsLink = dsLink;
  }

  /**
   * dsNode.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField dsNode(String dsNode) {
    this.dsNode = dsNode;
    return this;
  }

  /**
   * .
   * 
   * @return dsNode
   **/
  @Schema(description = "")
  public String getDsNode() {
    return dsNode;
  }

  /**
   * setDsNode.
   **/
  public void setDsNode(String dsNode) {
    this.dsNode = dsNode;
  }

  /**
   * id.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField id(String id) {
    this.id = id;
    return this;
  }

  /**
   * .
   * 
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * sfField.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField sfField(String sfField) {
    this.sfField = sfField;
    return this;
  }

  /**
   * .
   * 
   * @return sfField
   **/
  @Schema(description = "")
  public String getSfField() {
    return sfField;
  }

  /**
   * setSfField.
   **/
  public void setSfField(String sfField) {
    this.sfField = sfField;
  }

  /**
   * sfFieldName.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField sfFieldName(String sfFieldName) {
    this.sfFieldName = sfFieldName;
    return this;
  }

  /**
   * .
   * 
   * @return sfFieldName
   **/
  @Schema(description = "")
  public String getSfFieldName() {
    return sfFieldName;
  }

  /**
   * setSfFieldName.
   **/
  public void setSfFieldName(String sfFieldName) {
    this.sfFieldName = sfFieldName;
  }

  /**
   * sfFolder.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField sfFolder(String sfFolder) {
    this.sfFolder = sfFolder;
    return this;
  }

  /**
   * .
   * 
   * @return sfFolder
   **/
  @Schema(description = "")
  public String getSfFolder() {
    return sfFolder;
  }

  /**
   * setSfFolder.
   **/
  public void setSfFolder(String sfFolder) {
    this.sfFolder = sfFolder;
  }

  /**
   * sfLockedValue.
   *
   * @return ConnectSalesforceField
   **/
  public ConnectSalesforceField sfLockedValue(String sfLockedValue) {
    this.sfLockedValue = sfLockedValue;
    return this;
  }

  /**
   * .
   * 
   * @return sfLockedValue
   **/
  @Schema(description = "")
  public String getSfLockedValue() {
    return sfLockedValue;
  }

  /**
   * setSfLockedValue.
   **/
  public void setSfLockedValue(String sfLockedValue) {
    this.sfLockedValue = sfLockedValue;
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
    ConnectSalesforceField connectSalesforceField = (ConnectSalesforceField) o;
    return Objects.equals(this.dsAttribute, connectSalesforceField.dsAttribute) &&
        Objects.equals(this.dsLink, connectSalesforceField.dsLink) &&
        Objects.equals(this.dsNode, connectSalesforceField.dsNode) &&
        Objects.equals(this.id, connectSalesforceField.id) &&
        Objects.equals(this.sfField, connectSalesforceField.sfField) &&
        Objects.equals(this.sfFieldName, connectSalesforceField.sfFieldName) &&
        Objects.equals(this.sfFolder, connectSalesforceField.sfFolder) &&
        Objects.equals(this.sfLockedValue, connectSalesforceField.sfLockedValue);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dsAttribute, dsLink, dsNode, id, sfField, sfFieldName, sfFolder, sfLockedValue);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectSalesforceField {\n");

    sb.append("    dsAttribute: ").append(toIndentedString(dsAttribute)).append("\n");
    sb.append("    dsLink: ").append(toIndentedString(dsLink)).append("\n");
    sb.append("    dsNode: ").append(toIndentedString(dsNode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sfField: ").append(toIndentedString(sfField)).append("\n");
    sb.append("    sfFieldName: ").append(toIndentedString(sfFieldName)).append("\n");
    sb.append("    sfFolder: ").append(toIndentedString(sfFolder)).append("\n");
    sb.append("    sfLockedValue: ").append(toIndentedString(sfLockedValue)).append("\n");
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
