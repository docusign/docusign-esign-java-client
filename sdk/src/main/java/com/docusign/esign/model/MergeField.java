package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class MergeField   {
  
  private String configurationType = null;
  private String path = null;
  private String writeBack = null;
  private String allowSenderToEdit = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
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
    return path;
  }
  public void setPath(String path) {
    this.path = path;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeField mergeField = (MergeField) o;
    return Objects.equals(configurationType, mergeField.configurationType) &&
        Objects.equals(path, mergeField.path) &&
        Objects.equals(writeBack, mergeField.writeBack) &&
        Objects.equals(allowSenderToEdit, mergeField.allowSenderToEdit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationType, path, writeBack, allowSenderToEdit);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeField {\n");
    
    sb.append("    configurationType: ").append(StringUtil.toIndentedString(configurationType)).append("\n");
    sb.append("    path: ").append(StringUtil.toIndentedString(path)).append("\n");
    sb.append("    writeBack: ").append(StringUtil.toIndentedString(writeBack)).append("\n");
    sb.append("    allowSenderToEdit: ").append(StringUtil.toIndentedString(allowSenderToEdit)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
