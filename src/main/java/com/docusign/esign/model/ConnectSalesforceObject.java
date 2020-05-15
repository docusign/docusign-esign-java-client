package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectSalesforceField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectSalesforceObject
 */

public class ConnectSalesforceObject {
  @JsonProperty("active")
  private String active = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("insert")
  private String insert = null;

  @JsonProperty("onCompleteOnly")
  private String onCompleteOnly = null;

  @JsonProperty("selectFields")
  private java.util.List<ConnectSalesforceField> selectFields = null;

  @JsonProperty("sfObject")
  private String sfObject = null;

  @JsonProperty("sfObjectName")
  private String sfObjectName = null;

  @JsonProperty("updateFields")
  private java.util.List<ConnectSalesforceField> updateFields = null;

  public ConnectSalesforceObject active(String active) {
    this.active = active;
    return this;
  }

   /**
   * 
   * @return active
  **/
  @ApiModelProperty(value = "")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public ConnectSalesforceObject description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectSalesforceObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectSalesforceObject insert(String insert) {
    this.insert = insert;
    return this;
  }

   /**
   * 
   * @return insert
  **/
  @ApiModelProperty(value = "")
  public String getInsert() {
    return insert;
  }

  public void setInsert(String insert) {
    this.insert = insert;
  }

  public ConnectSalesforceObject onCompleteOnly(String onCompleteOnly) {
    this.onCompleteOnly = onCompleteOnly;
    return this;
  }

   /**
   * 
   * @return onCompleteOnly
  **/
  @ApiModelProperty(value = "")
  public String getOnCompleteOnly() {
    return onCompleteOnly;
  }

  public void setOnCompleteOnly(String onCompleteOnly) {
    this.onCompleteOnly = onCompleteOnly;
  }

  public ConnectSalesforceObject selectFields(java.util.List<ConnectSalesforceField> selectFields) {
    this.selectFields = selectFields;
    return this;
  }

  public ConnectSalesforceObject addSelectFieldsItem(ConnectSalesforceField selectFieldsItem) {
    if (this.selectFields == null) {
      this.selectFields = new java.util.ArrayList<ConnectSalesforceField>();
    }
    this.selectFields.add(selectFieldsItem);
    return this;
  }

   /**
   * 
   * @return selectFields
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ConnectSalesforceField> getSelectFields() {
    return selectFields;
  }

  public void setSelectFields(java.util.List<ConnectSalesforceField> selectFields) {
    this.selectFields = selectFields;
  }

  public ConnectSalesforceObject sfObject(String sfObject) {
    this.sfObject = sfObject;
    return this;
  }

   /**
   * 
   * @return sfObject
  **/
  @ApiModelProperty(value = "")
  public String getSfObject() {
    return sfObject;
  }

  public void setSfObject(String sfObject) {
    this.sfObject = sfObject;
  }

  public ConnectSalesforceObject sfObjectName(String sfObjectName) {
    this.sfObjectName = sfObjectName;
    return this;
  }

   /**
   * 
   * @return sfObjectName
  **/
  @ApiModelProperty(value = "")
  public String getSfObjectName() {
    return sfObjectName;
  }

  public void setSfObjectName(String sfObjectName) {
    this.sfObjectName = sfObjectName;
  }

  public ConnectSalesforceObject updateFields(java.util.List<ConnectSalesforceField> updateFields) {
    this.updateFields = updateFields;
    return this;
  }

  public ConnectSalesforceObject addUpdateFieldsItem(ConnectSalesforceField updateFieldsItem) {
    if (this.updateFields == null) {
      this.updateFields = new java.util.ArrayList<ConnectSalesforceField>();
    }
    this.updateFields.add(updateFieldsItem);
    return this;
  }

   /**
   * 
   * @return updateFields
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ConnectSalesforceField> getUpdateFields() {
    return updateFields;
  }

  public void setUpdateFields(java.util.List<ConnectSalesforceField> updateFields) {
    this.updateFields = updateFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectSalesforceObject connectSalesforceObject = (ConnectSalesforceObject) o;
    return Objects.equals(this.active, connectSalesforceObject.active) &&
        Objects.equals(this.description, connectSalesforceObject.description) &&
        Objects.equals(this.id, connectSalesforceObject.id) &&
        Objects.equals(this.insert, connectSalesforceObject.insert) &&
        Objects.equals(this.onCompleteOnly, connectSalesforceObject.onCompleteOnly) &&
        Objects.equals(this.selectFields, connectSalesforceObject.selectFields) &&
        Objects.equals(this.sfObject, connectSalesforceObject.sfObject) &&
        Objects.equals(this.sfObjectName, connectSalesforceObject.sfObjectName) &&
        Objects.equals(this.updateFields, connectSalesforceObject.updateFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, description, id, insert, onCompleteOnly, selectFields, sfObject, sfObjectName, updateFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectSalesforceObject {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insert: ").append(toIndentedString(insert)).append("\n");
    sb.append("    onCompleteOnly: ").append(toIndentedString(onCompleteOnly)).append("\n");
    sb.append("    selectFields: ").append(toIndentedString(selectFields)).append("\n");
    sb.append("    sfObject: ").append(toIndentedString(sfObject)).append("\n");
    sb.append("    sfObjectName: ").append(toIndentedString(sfObjectName)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
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

