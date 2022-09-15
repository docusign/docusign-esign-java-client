package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.FolderSharedItem;
import com.docusign.esign.model.SharedItem;
import com.docusign.esign.model.TemplateSharedItem;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about shared items..
 *
 */
@ApiModel(description = "Information about shared items.")

public class MemberSharedItems {
  @JsonProperty("envelopes")
  private java.util.List<SharedItem> envelopes = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("folders")
  private java.util.List<FolderSharedItem> folders = null;

  @JsonProperty("templates")
  private java.util.List<TemplateSharedItem> templates = null;

  @JsonProperty("user")
  private UserInfo user = null;


  /**
   * envelopes.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems envelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  /**
   * addEnvelopesItem.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems addEnvelopesItem(SharedItem envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new java.util.ArrayList<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * .
   * @return envelopes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SharedItem> getEnvelopes() {
    return envelopes;
  }

  /**
   * setEnvelopes.
   **/
  public void setEnvelopes(java.util.List<SharedItem> envelopes) {
    this.envelopes = envelopes;
  }


  /**
   * errorDetails.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and ignored in requests..
   * @return errorDetails
   **/
  @ApiModelProperty(value = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * folders.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems folders(java.util.List<FolderSharedItem> folders) {
    this.folders = folders;
    return this;
  }
  
  /**
   * addFoldersItem.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems addFoldersItem(FolderSharedItem foldersItem) {
    if (this.folders == null) {
      this.folders = new java.util.ArrayList<>();
    }
    this.folders.add(foldersItem);
    return this;
  }

  /**
   * .
   * @return folders
   **/
  @ApiModelProperty(value = "")
  public java.util.List<FolderSharedItem> getFolders() {
    return folders;
  }

  /**
   * setFolders.
   **/
  public void setFolders(java.util.List<FolderSharedItem> folders) {
    this.folders = folders;
  }


  /**
   * templates.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems templates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
    return this;
  }
  
  /**
   * addTemplatesItem.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems addTemplatesItem(TemplateSharedItem templatesItem) {
    if (this.templates == null) {
      this.templates = new java.util.ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * .
   * @return templates
   **/
  @ApiModelProperty(value = "")
  public java.util.List<TemplateSharedItem> getTemplates() {
    return templates;
  }

  /**
   * setTemplates.
   **/
  public void setTemplates(java.util.List<TemplateSharedItem> templates) {
    this.templates = templates;
  }


  /**
   * user.
   *
   * @return MemberSharedItems
   **/
  public MemberSharedItems user(UserInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Information about the user requesting sharing information..
   * @return user
   **/
  @ApiModelProperty(value = "Information about the user requesting sharing information.")
  public UserInfo getUser() {
    return user;
  }

  /**
   * setUser.
   **/
  public void setUser(UserInfo user) {
    this.user = user;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopes, errorDetails, folders, templates, user);
  }


  /**
   * Converts the given object to string.
   */
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

