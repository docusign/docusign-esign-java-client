package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberGroupSharedItem;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.UserSharedItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class TemplateSharedItem   {
  
  private ErrorDetails errorDetails = null;
  private UserInfo owner = null;
  private String shared = null;
  private java.util.List<MemberGroupSharedItem> sharedGroups = new java.util.ArrayList<MemberGroupSharedItem>();
  private java.util.List<UserSharedItem> sharedUsers = new java.util.ArrayList<UserSharedItem>();
  private String templateId = null;
  private String templateName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public UserInfo getOwner() {
    return owner;
  }
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedGroups")
  public java.util.List<MemberGroupSharedItem> getSharedGroups() {
    return sharedGroups;
  }
  public void setSharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedUsers")
  public java.util.List<UserSharedItem> getSharedUsers() {
    return sharedUsers;
  }
  public void setSharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("templateName")
  public String getTemplateName() {
    return templateName;
  }
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
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

    return true && Objects.equals(errorDetails, templateSharedItem.errorDetails) &&
        Objects.equals(owner, templateSharedItem.owner) &&
        Objects.equals(shared, templateSharedItem.shared) &&
        Objects.equals(sharedGroups, templateSharedItem.sharedGroups) &&
        Objects.equals(sharedUsers, templateSharedItem.sharedUsers) &&
        Objects.equals(templateId, templateSharedItem.templateId) &&
        Objects.equals(templateName, templateSharedItem.templateName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, owner, shared, sharedGroups, sharedUsers, templateId, templateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSharedItem {\n");
    
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (owner != null)
      sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    if (sharedGroups != null)
      sb.append("    sharedGroups: ").append(toIndentedString(sharedGroups)).append("\n");
    if (sharedUsers != null)
      sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    if (templateId != null)
      sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    if (templateName != null)
      sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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

