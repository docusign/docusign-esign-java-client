package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberGroupSharedItem;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.UserSharedItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateSharedItem   {
  
  private String templateId = null;
  private String templateName = null;
  private UserInfo owner = null;
  private java.util.List<UserSharedItem> sharedUsers = new java.util.ArrayList<UserSharedItem>();
  private java.util.List<MemberGroupSharedItem> sharedGroups = new java.util.ArrayList<MemberGroupSharedItem>();
  private String shared = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   **/
  public TemplateSharedItem templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  public TemplateSharedItem templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("templateName")
  public String getTemplateName() {
    return templateName;
  }
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  
  /**
   **/
  public TemplateSharedItem owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public UserInfo getOwner() {
    return owner;
  }
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  
  /**
   * 
   **/
  public TemplateSharedItem sharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedUsers")
  public java.util.List<UserSharedItem> getSharedUsers() {
    return sharedUsers;
  }
  public void setSharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  
  /**
   * 
   **/
  public TemplateSharedItem sharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharedGroups")
  public java.util.List<MemberGroupSharedItem> getSharedGroups() {
    return sharedGroups;
  }
  public void setSharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  public TemplateSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   **/
  public TemplateSharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSharedItem templateSharedItem = (TemplateSharedItem) o;
    return Objects.equals(this.templateId, templateSharedItem.templateId) &&
        Objects.equals(this.templateName, templateSharedItem.templateName) &&
        Objects.equals(this.owner, templateSharedItem.owner) &&
        Objects.equals(this.sharedUsers, templateSharedItem.sharedUsers) &&
        Objects.equals(this.sharedGroups, templateSharedItem.sharedGroups) &&
        Objects.equals(this.shared, templateSharedItem.shared) &&
        Objects.equals(this.errorDetails, templateSharedItem.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateName, owner, sharedUsers, sharedGroups, shared, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSharedItem {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    sharedGroups: ").append(toIndentedString(sharedGroups)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

