package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberGroupSharedItem;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.UserSharedItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateSharedItem
 */

public class TemplateSharedItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("owner")
  private UserInfo owner = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("sharedGroups")
  private java.util.List<MemberGroupSharedItem> sharedGroups = new java.util.ArrayList<MemberGroupSharedItem>();

  @JsonProperty("sharedUsers")
  private java.util.List<UserSharedItem> sharedUsers = new java.util.ArrayList<UserSharedItem>();

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templateName")
  private String templateName = null;

  public TemplateSharedItem errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public TemplateSharedItem owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInfo getOwner() {
    return owner;
  }

  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  public TemplateSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public TemplateSharedItem sharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
    return this;
  }

  public TemplateSharedItem addSharedGroupsItem(MemberGroupSharedItem sharedGroupsItem) {
    this.sharedGroups.add(sharedGroupsItem);
    return this;
  }

   /**
   * 
   * @return sharedGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<MemberGroupSharedItem> getSharedGroups() {
    return sharedGroups;
  }

  public void setSharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
  }

  public TemplateSharedItem sharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }

  public TemplateSharedItem addSharedUsersItem(UserSharedItem sharedUsersItem) {
    this.sharedUsers.add(sharedUsersItem);
    return this;
  }

   /**
   * 
   * @return sharedUsers
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<UserSharedItem> getSharedUsers() {
    return sharedUsers;
  }

  public void setSharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  public TemplateSharedItem templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateSharedItem templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * 
   * @return templateName
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.errorDetails, templateSharedItem.errorDetails) &&
        Objects.equals(this.owner, templateSharedItem.owner) &&
        Objects.equals(this.shared, templateSharedItem.shared) &&
        Objects.equals(this.sharedGroups, templateSharedItem.sharedGroups) &&
        Objects.equals(this.sharedUsers, templateSharedItem.sharedUsers) &&
        Objects.equals(this.templateId, templateSharedItem.templateId) &&
        Objects.equals(this.templateName, templateSharedItem.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, owner, shared, sharedGroups, sharedUsers, templateId, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSharedItem {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedGroups: ").append(toIndentedString(sharedGroups)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

