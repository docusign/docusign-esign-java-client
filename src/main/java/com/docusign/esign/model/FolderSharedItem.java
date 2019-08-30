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
 * FolderSharedItem
 */

public class FolderSharedItem {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private UserInfo owner = null;

  @JsonProperty("parentFolderId")
  private String parentFolderId = null;

  @JsonProperty("parentFolderUri")
  private String parentFolderUri = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("sharedGroups")
  private java.util.List<MemberGroupSharedItem> sharedGroups = new java.util.ArrayList<MemberGroupSharedItem>();

  @JsonProperty("sharedUsers")
  private java.util.List<UserSharedItem> sharedUsers = new java.util.ArrayList<UserSharedItem>();

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("user")
  private UserInfo user = null;

  public FolderSharedItem errorDetails(ErrorDetails errorDetails) {
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

  public FolderSharedItem folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * 
   * @return folderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public FolderSharedItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FolderSharedItem owner(UserInfo owner) {
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

  public FolderSharedItem parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

   /**
   * 
   * @return parentFolderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public FolderSharedItem parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }

   /**
   * 
   * @return parentFolderUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentFolderUri() {
    return parentFolderUri;
  }

  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }

  public FolderSharedItem shared(String shared) {
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

  public FolderSharedItem sharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
    return this;
  }

  public FolderSharedItem addSharedGroupsItem(MemberGroupSharedItem sharedGroupsItem) {
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

  public FolderSharedItem sharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }

  public FolderSharedItem addSharedUsersItem(UserSharedItem sharedUsersItem) {
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

  public FolderSharedItem uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public FolderSharedItem user(UserInfo user) {
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
    FolderSharedItem folderSharedItem = (FolderSharedItem) o;
    return Objects.equals(this.errorDetails, folderSharedItem.errorDetails) &&
        Objects.equals(this.folderId, folderSharedItem.folderId) &&
        Objects.equals(this.name, folderSharedItem.name) &&
        Objects.equals(this.owner, folderSharedItem.owner) &&
        Objects.equals(this.parentFolderId, folderSharedItem.parentFolderId) &&
        Objects.equals(this.parentFolderUri, folderSharedItem.parentFolderUri) &&
        Objects.equals(this.shared, folderSharedItem.shared) &&
        Objects.equals(this.sharedGroups, folderSharedItem.sharedGroups) &&
        Objects.equals(this.sharedUsers, folderSharedItem.sharedUsers) &&
        Objects.equals(this.uri, folderSharedItem.uri) &&
        Objects.equals(this.user, folderSharedItem.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, folderId, name, owner, parentFolderId, parentFolderUri, shared, sharedGroups, sharedUsers, uri, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderSharedItem {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedGroups: ").append(toIndentedString(sharedGroups)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

