package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MemberGroupSharedItem;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.UserSharedItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FolderSharedItem.
 *
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
  private java.util.List<MemberGroupSharedItem> sharedGroups = null;

  @JsonProperty("sharedUsers")
  private java.util.List<UserSharedItem> sharedUsers = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("user")
  private UserInfo user = null;


  /**
   * errorDetails.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem errorDetails(ErrorDetails errorDetails) {
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
   * folderId.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * .
   * @return folderId
   **/
  @ApiModelProperty(value = "")
  public String getFolderId() {
    return folderId;
  }

  /**
   * setFolderId.
   **/
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  /**
   * name.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * owner.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Information about the user who owns the folder..
   * @return owner
   **/
  @ApiModelProperty(value = "Information about the user who owns the folder.")
  public UserInfo getOwner() {
    return owner;
  }

  /**
   * setOwner.
   **/
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }


  /**
   * parentFolderId.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

  /**
   * .
   * @return parentFolderId
   **/
  @ApiModelProperty(value = "")
  public String getParentFolderId() {
    return parentFolderId;
  }

  /**
   * setParentFolderId.
   **/
  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }


  /**
   * parentFolderUri.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }

  /**
   * .
   * @return parentFolderUri
   **/
  @ApiModelProperty(value = "")
  public String getParentFolderUri() {
    return parentFolderUri;
  }

  /**
   * setParentFolderUri.
   **/
  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }


  /**
   * shared.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * @return shared
   **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /**
   * setShared.
   **/
  public void setShared(String shared) {
    this.shared = shared;
  }


  /**
   * sharedGroups.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem sharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
    return this;
  }
  
  /**
   * addSharedGroupsItem.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem addSharedGroupsItem(MemberGroupSharedItem sharedGroupsItem) {
    if (this.sharedGroups == null) {
      this.sharedGroups = new java.util.ArrayList<>();
    }
    this.sharedGroups.add(sharedGroupsItem);
    return this;
  }

  /**
   * .
   * @return sharedGroups
   **/
  @ApiModelProperty(value = "")
  public java.util.List<MemberGroupSharedItem> getSharedGroups() {
    return sharedGroups;
  }

  /**
   * setSharedGroups.
   **/
  public void setSharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
    this.sharedGroups = sharedGroups;
  }


  /**
   * sharedUsers.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem sharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }
  
  /**
   * addSharedUsersItem.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem addSharedUsersItem(UserSharedItem sharedUsersItem) {
    if (this.sharedUsers == null) {
      this.sharedUsers = new java.util.ArrayList<>();
    }
    this.sharedUsers.add(sharedUsersItem);
    return this;
  }

  /**
   * .
   * @return sharedUsers
   **/
  @ApiModelProperty(value = "")
  public java.util.List<UserSharedItem> getSharedUsers() {
    return sharedUsers;
  }

  /**
   * setSharedUsers.
   **/
  public void setSharedUsers(java.util.List<UserSharedItem> sharedUsers) {
    this.sharedUsers = sharedUsers;
  }


  /**
   * uri.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * user.
   *
   * @return FolderSharedItem
   **/
  public FolderSharedItem user(UserInfo user) {
    this.user = user;
    return this;
  }

  /**
   * Information about the user associated with the folder..
   * @return user
   **/
  @ApiModelProperty(value = "Information about the user associated with the folder.")
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, folderId, name, owner, parentFolderId, parentFolderUri, shared, sharedGroups, sharedUsers, uri, user);
  }


  /**
   * Converts the given object to string.
   */
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

