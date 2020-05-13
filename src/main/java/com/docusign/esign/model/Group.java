package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Group
 */

public class Group {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupType")
  private String groupType = null;

  @JsonProperty("permissionProfileId")
  private String permissionProfileId = null;

  @JsonProperty("users")
  private java.util.List<UserInfo> users = null;

  @JsonProperty("usersCount")
  private String usersCount = null;

  public Group errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Group groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The DocuSign group ID for the group.
   * @return groupId
  **/
  @ApiModelProperty(value = "The DocuSign group ID for the group.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public Group groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group.
   * @return groupName
  **/
  @ApiModelProperty(value = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Group groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * The group type.
   * @return groupType
  **/
  @ApiModelProperty(value = "The group type.")
  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public Group permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

   /**
   * The ID of the permission profile associated with the group.
   * @return permissionProfileId
  **/
  @ApiModelProperty(value = "The ID of the permission profile associated with the group.")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  public Group users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }

  public Group addUsersItem(UserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<UserInfo>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<UserInfo> users) {
    this.users = users;
  }

  public Group usersCount(String usersCount) {
    this.usersCount = usersCount;
    return this;
  }

   /**
   * 
   * @return usersCount
  **/
  @ApiModelProperty(value = "")
  public String getUsersCount() {
    return usersCount;
  }

  public void setUsersCount(String usersCount) {
    this.usersCount = usersCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.errorDetails, group.errorDetails) &&
        Objects.equals(this.groupId, group.groupId) &&
        Objects.equals(this.groupName, group.groupName) &&
        Objects.equals(this.groupType, group.groupType) &&
        Objects.equals(this.permissionProfileId, group.permissionProfileId) &&
        Objects.equals(this.users, group.users) &&
        Objects.equals(this.usersCount, group.usersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, groupId, groupName, groupType, permissionProfileId, users, usersCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    usersCount: ").append(toIndentedString(usersCount)).append("\n");
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

