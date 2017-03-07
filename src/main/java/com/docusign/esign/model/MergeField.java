package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information for transfering values between Salesforce data fields and DocuSign Tabs.
 **/

@ApiModel(description = "Contains information for transfering values between Salesforce data fields and DocuSign Tabs.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class MergeField   {
  
  private String allowSenderToEdit = null;
  private String configurationType = null;
  private String _path = null;
  private String row = null;
  private String writeBack = null;

  
  /**
   * When set to **true**, the sender can modify the value of the custom tab during the sending process.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender can modify the value of the custom tab during the sending process.")
  @JsonProperty("allowSenderToEdit")
  public String getAllowSenderToEdit() {
    return allowSenderToEdit;
  }
  public void setAllowSenderToEdit(String allowSenderToEdit) {
    this.allowSenderToEdit = allowSenderToEdit;
  }

  
  /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   **/
  
  @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
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
  
  @ApiModelProperty(value = "Sets the object associated with the custom tab. Currently this is the Salesforce Object.")
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }
  public void setPath(String _path) {
    this._path = _path;
  }

  
  /**
   * Specifies the row number in a Salesforce table that the merge field value corresponds to.
   **/
  
  @ApiModelProperty(value = "Specifies the row number in a Salesforce table that the merge field value corresponds to.")
  @JsonProperty("row")
  public String getRow() {
    return row;
  }
  public void setRow(String row) {
    this.row = row;
  }

  
  /**
   * When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.
   **/
  
  @ApiModelProperty(value = "When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.")
  @JsonProperty("writeBack")
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

    return true && Objects.equals(allowSenderToEdit, mergeField.allowSenderToEdit) &&
        Objects.equals(configurationType, mergeField.configurationType) &&
        Objects.equals(_path, mergeField._path) &&
        Objects.equals(row, mergeField.row) &&
        Objects.equals(writeBack, mergeField.writeBack)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSenderToEdit, configurationType, _path, row, writeBack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    if (allowSenderToEdit != null)
      sb.append("    allowSenderToEdit: ").append(toIndentedString(allowSenderToEdit)).append("\n");
    if (configurationType != null)
      sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    if (_path != null)
      sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
    if (row != null)
      sb.append("    row: ").append(toIndentedString(row)).append("\n");
    if (writeBack != null)
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

