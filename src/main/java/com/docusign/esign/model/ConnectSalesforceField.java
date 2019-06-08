package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectSalesforceField
 */

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

  public ConnectSalesforceField dsAttribute(String dsAttribute) {
    this.dsAttribute = dsAttribute;
    return this;
  }

   /**
   * 
   * @return dsAttribute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDsAttribute() {
    return dsAttribute;
  }

  public void setDsAttribute(String dsAttribute) {
    this.dsAttribute = dsAttribute;
  }

  public ConnectSalesforceField dsLink(String dsLink) {
    this.dsLink = dsLink;
    return this;
  }

   /**
   * 
   * @return dsLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDsLink() {
    return dsLink;
  }

  public void setDsLink(String dsLink) {
    this.dsLink = dsLink;
  }

  public ConnectSalesforceField dsNode(String dsNode) {
    this.dsNode = dsNode;
    return this;
  }

   /**
   * 
   * @return dsNode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDsNode() {
    return dsNode;
  }

  public void setDsNode(String dsNode) {
    this.dsNode = dsNode;
  }

  public ConnectSalesforceField id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectSalesforceField sfField(String sfField) {
    this.sfField = sfField;
    return this;
  }

   /**
   * 
   * @return sfField
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSfField() {
    return sfField;
  }

  public void setSfField(String sfField) {
    this.sfField = sfField;
  }

  public ConnectSalesforceField sfFieldName(String sfFieldName) {
    this.sfFieldName = sfFieldName;
    return this;
  }

   /**
   * 
   * @return sfFieldName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSfFieldName() {
    return sfFieldName;
  }

  public void setSfFieldName(String sfFieldName) {
    this.sfFieldName = sfFieldName;
  }

  public ConnectSalesforceField sfFolder(String sfFolder) {
    this.sfFolder = sfFolder;
    return this;
  }

   /**
   * 
   * @return sfFolder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSfFolder() {
    return sfFolder;
  }

  public void setSfFolder(String sfFolder) {
    this.sfFolder = sfFolder;
  }

  public ConnectSalesforceField sfLockedValue(String sfLockedValue) {
    this.sfLockedValue = sfLockedValue;
    return this;
  }

   /**
   * 
   * @return sfLockedValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSfLockedValue() {
    return sfLockedValue;
  }

  public void setSfLockedValue(String sfLockedValue) {
    this.sfLockedValue = sfLockedValue;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(dsAttribute, dsLink, dsNode, id, sfField, sfFieldName, sfFolder, sfLockedValue);
  }


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

