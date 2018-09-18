package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information for transfering values between Salesforce data fields and DocuSign Tabs.
 */
@ApiModel(description = "Contains information for transfering values between Salesforce data fields and DocuSign Tabs.")

public class MergeField {
  @JsonProperty("allowSenderToEdit")
  private String allowSenderToEdit = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("row")
  private String row = null;

  @JsonProperty("writeBack")
  private String writeBack = null;

  public MergeField allowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
    return this;
  }

   /**
   * When set to **true**, the sender can modify the value of the custom tab during the sending process.
   * @return allowSenderToEdit
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender can modify the value of the custom tab during the sending process.")
  public String getAllowSenderToEdit() {
    return allowSenderToEdit;
  }

  public void setAllowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
  }

  public MergeField configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   * @return configurationType
  **/
  @ApiModelProperty(example = "null", value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  public MergeField path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Sets the object associated with the custom tab. Currently this is the Salesforce Object.
   * @return path
  **/
  @ApiModelProperty(example = "null", value = "Sets the object associated with the custom tab. Currently this is the Salesforce Object.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MergeField row(String row) {
    this.row = row;
    return this;
  }

   /**
   * Specifies the row number in a Salesforce table that the merge field value corresponds to.
   * @return row
  **/
  @ApiModelProperty(example = "null", value = "Specifies the row number in a Salesforce table that the merge field value corresponds to.")
  public String getRow() {
    return row;
  }

  public void setRow(String row) {
    this.row = row;
  }

  public MergeField writeBack(String writeBack) {
    this.writeBack = writeBack;
    return this;
  }

   /**
   * When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.
   * @return writeBack
  **/
  @ApiModelProperty(example = "null", value = "When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.")
  public String getWriteBack() {
    return writeBack;
  }

  public void setWriteBack(String writeBack) {
    this.writeBack = writeBack;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeField mergeField = (MergeField) o;
    return Objects.equals(this.allowSenderToEdit, mergeField.allowSenderToEdit) &&
        Objects.equals(this.configurationType, mergeField.configurationType) &&
        Objects.equals(this.path, mergeField.path) &&
        Objects.equals(this.row, mergeField.row) &&
        Objects.equals(this.writeBack, mergeField.writeBack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSenderToEdit, configurationType, path, row, writeBack);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    sb.append("    allowSenderToEdit: ").append(toIndentedString(allowSenderToEdit)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    writeBack: ").append(toIndentedString(writeBack)).append("\n");
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

