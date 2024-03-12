package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains information about a group..
 *
 */
@Schema(description = "This object contains information about a group.")

public class Group {
  @JsonProperty("accessType")
  private String accessType = null;

  @JsonProperty("dsGroupId")
  private String dsGroupId = null;

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


  /**
   * accessType.
   *
   * @return Group
   **/
  public Group accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * .
   * @return accessType
   **/
  @Schema(description = "")
  public String getAccessType() {
    return accessType;
  }

  /**
   * setAccessType.
   **/
  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  /**
   * dsGroupId.
   *
   * @return Group
   **/
  public Group dsGroupId(String dsGroupId) {
    this.dsGroupId = dsGroupId;
    return this;
  }

  /**
   * .
   * @return dsGroupId
   **/
  @Schema(description = "")
  public String getDsGroupId() {
    return dsGroupId;
  }

  /**
   * setDsGroupId.
   **/
  public void setDsGroupId(String dsGroupId) {
    this.dsGroupId = dsGroupId;
  }


  /**
   * errorDetails.
   *
   * @return Group
   **/
  public Group errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
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
   * groupId.
   *
   * @return Group
   **/
  public Group groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The DocuSign group ID for the group..
   * @return groupId
   **/
  @Schema(description = "The DocuSign group ID for the group.")
  public String getGroupId() {
    return groupId;
  }

  /**
   * setGroupId.
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * groupName.
   *
   * @return Group
   **/
  public Group groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the group..
   * @return groupName
   **/
  @Schema(description = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  /**
   * setGroupName.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  /**
   * groupType.
   *
   * @return Group
   **/
  public Group groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * The group type..
   * @return groupType
   **/
  @Schema(description = "The group type.")
  public String getGroupType() {
    return groupType;
  }

  /**
   * setGroupType.
   **/
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }


  /**
   * permissionProfileId.
   *
   * @return Group
   **/
  public Group permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

  /**
   * The ID of the permission profile associated with the group..
   * @return permissionProfileId
   **/
  @Schema(description = "The ID of the permission profile associated with the group.")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  /**
   * setPermissionProfileId.
   **/
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }


  /**
   * users.
   *
   * @return Group
   **/
  public Group users(java.util.List<UserInfo> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return Group
   **/
  public Group addUsersItem(UserInfo usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * .
   * @return users
   **/
  @Schema(description = "")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<UserInfo> users) {
    this.users = users;
  }


  /**
   * usersCount.
   *
   * @return Group
   **/
  public Group usersCount(String usersCount) {
    this.usersCount = usersCount;
    return this;
  }

  /**
   * .
   * @return usersCount
   **/
  @Schema(description = "")
  public String getUsersCount() {
    return usersCount;
  }

  /**
   * setUsersCount.
   **/
  public void setUsersCount(String usersCount) {
    this.usersCount = usersCount;
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
    Group group = (Group) o;
    return Objects.equals(this.accessType, group.accessType) &&
        Objects.equals(this.dsGroupId, group.dsGroupId) &&
        Objects.equals(this.errorDetails, group.errorDetails) &&
        Objects.equals(this.groupId, group.groupId) &&
        Objects.equals(this.groupName, group.groupName) &&
        Objects.equals(this.groupType, group.groupType) &&
        Objects.equals(this.permissionProfileId, group.permissionProfileId) &&
        Objects.equals(this.users, group.users) &&
        Objects.equals(this.usersCount, group.usersCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessType, dsGroupId, errorDetails, groupId, groupName, groupType, permissionProfileId, users, usersCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    dsGroupId: ").append(toIndentedString(dsGroupId)).append("\n");
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

