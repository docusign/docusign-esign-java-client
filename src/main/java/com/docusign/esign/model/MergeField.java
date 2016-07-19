package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information for transfering values between Salesforce data fields and DocuSign Tabs.
 **/

@ApiModel(description = "Contains information for transfering values between Salesforce data fields and DocuSign Tabs.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class MergeField   {
  
  private String configurationType = null;
  private String path = null;
  private String writeBack = null;
  private String allowSenderToEdit = null;
  private String row = null;

  
  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   **/
  public MergeField configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  @JsonProperty("configurationType")
  public String getConfigurationType() {
    return configurationType;
  }
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  
  /**
   * Sets the object associated with the custom tab. Currently this is the Salesforce Object.
   **/
  public MergeField path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the object associated with the custom tab. Currently this is the Salesforce Object.")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   * When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.
   **/
  public MergeField writeBack(String writeBack) {
    this.writeBack = writeBack;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.")
  @JsonProperty("writeBack")
  public String getWriteBack() {
    return writeBack;
  }
  public void setWriteBack(String writeBack) {
    this.writeBack = writeBack;
  }

  
  /**
   * When set to **true**, the sender can modify the value of the custom tab during the sending process.
   **/
  public MergeField allowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender can modify the value of the custom tab during the sending process.")
  @JsonProperty("allowSenderToEdit")
  public String getAllowSenderToEdit() {
    return allowSenderToEdit;
  }
  public void setAllowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
  }

  
  /**
   * Specifies the row number in a Salesforce table that the merge field value corresponds to.
   **/
  public MergeField row(String row) {
    this.row = row;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the row number in a Salesforce table that the merge field value corresponds to.")
  @JsonProperty("row")
  public String getRow() {
    return row;
  }
  public void setRow(String row) {
    this.row = row;
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
    return Objects.equals(this.configurationType, mergeField.configurationType) &&
        Objects.equals(this.path, mergeField.path) &&
        Objects.equals(this.writeBack, mergeField.writeBack) &&
        Objects.equals(this.allowSenderToEdit, mergeField.allowSenderToEdit) &&
        Objects.equals(this.row, mergeField.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationType, path, writeBack, allowSenderToEdit, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    writeBack: ").append(toIndentedString(writeBack)).append("\n");
    sb.append("    allowSenderToEdit: ").append(toIndentedString(allowSenderToEdit)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

