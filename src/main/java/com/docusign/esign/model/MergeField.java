package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class MergeField   {
  
  private String configurationType = null;
  private String _path = null;
  private String writeBack = null;
  private String allowSenderToEdit = null;
  private String row = null;

  
  /**
   * If mergeField's are being used, specifies the type of the mergeFied. Currently, only **salesforce** is supported.
   **/
  
  @ApiModelProperty(value = "If mergeField's are being used, specifies the type of the mergeFied. Currently, only **salesforce** is supported.")
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
   * The row number in a Salesforce table that the merge field value corresponds to.
   **/
  
  @ApiModelProperty(value = "The row number in a Salesforce table that the merge field value corresponds to.")
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

    return true && Objects.equals(configurationType, mergeField.configurationType) &&
        Objects.equals(_path, mergeField._path) &&
        Objects.equals(writeBack, mergeField.writeBack) &&
        Objects.equals(allowSenderToEdit, mergeField.allowSenderToEdit) &&
        Objects.equals(row, mergeField.row)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationType, _path, writeBack, allowSenderToEdit, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    _path: ").append(toIndentedString(_path)).append("\n");
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

