package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FolderSharedItem;
import com.docusign.esign.model.SharedItem;
import com.docusign.esign.model.TemplateSharedItem;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MemberSharedItems
 */

public class MemberSharedItems {
  @JsonProperty("envelopes")
  private java.util.List<SharedItem> envelopes = new java.util.ArrayList<SharedItem>();

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("folders")
  private java.util.List<FolderSharedItem> folders = new java.util.ArrayList<FolderSharedItem>();

  @JsonProperty("templates")
  private java.util.List<TemplateSharedItem> templates = new java.util.ArrayList<TemplateSharedItem>();

  @JsonProperty("user")
  private UserInfo user = null;

  public MemberSharedItems envelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  public MemberSharedItems addEnvelopesItem(SharedItem envelopesItem) {
    this.envelopes.add(envelopesItem);
    return this;
  }

   /**
   * 
   * @return envelopes
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<SharedItem> getEnvelopes() {
    return envelopes;
  }

  public void setEnvelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
  }

  public MemberSharedItems errorDetails(ErrorDetails errorDetails) {
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

  public MemberSharedItems folders(java.util.List<FolderSharedItem> folders) {
    this.folders = folders;
    return this;
  }

  public MemberSharedItems addFoldersItem(FolderSharedItem foldersItem) {
    this.folders.add(foldersItem);
    return this;
  }

   /**
   * 
   * @return folders
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<FolderSharedItem> getFolders() {
    return folders;
  }

  public void setFolders(java.util.List<FolderSharedItem> folders) {
    this.folders = folders;
  }

  public MemberSharedItems templates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
    return this;
  }

  public MemberSharedItems addTemplatesItem(TemplateSharedItem templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * 
   * @return templates
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<TemplateSharedItem> getTemplates() {
    return templates;
  }

  public void setTemplates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
  }

  public MemberSharedItems user(UserInfo user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInfo getUser() {
    return user;
  }

  public void setUser(UserInfo user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSharedItems memberSharedItems = (MemberSharedItems) o;
    return Objects.equals(this.envelopes, memberSharedItems.envelopes) &&
        Objects.equals(this.errorDetails, memberSharedItems.errorDetails) &&
        Objects.equals(this.folders, memberSharedItems.folders) &&
        Objects.equals(this.templates, memberSharedItems.templates) &&
        Objects.equals(this.user, memberSharedItems.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopes, errorDetails, folders, templates, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSharedItems {\n");
    
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

