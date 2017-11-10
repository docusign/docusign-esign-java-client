package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountRoleSettings;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PermissionProfile
 */

public class PermissionProfile {
  @JsonProperty("modifiedByUsername")
  private String modifiedByUsername = null;

  @JsonProperty("modifiedDateTime")
  private String modifiedDateTime = null;

  @JsonProperty("permissionProfileId")
  private String permissionProfileId = null;

  @JsonProperty("permissionProfileName")
  private String permissionProfileName = null;

  @JsonProperty("settings")
  private AccountRoleSettings settings = null;

  @JsonProperty("userCount")
  private String userCount = null;

  @JsonProperty("users")
  private java.util.List<UserInformation> users = new java.util.ArrayList<UserInformation>();

  public PermissionProfile modifiedByUsername(String modifiedByUsername) {
    this.modifiedByUsername = modifiedByUsername;
    return this;
  }

   /**
   * 
   * @return modifiedByUsername
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModifiedByUsername() {
    return modifiedByUsername;
  }

  public void setModifiedByUsername(String modifiedByUsername) {
    this.modifiedByUsername = modifiedByUsername;
  }

  public PermissionProfile modifiedDateTime(String modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
    return this;
  }

   /**
   * 
   * @return modifiedDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModifiedDateTime() {
    return modifiedDateTime;
  }

  public void setModifiedDateTime(String modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
  }

  public PermissionProfile permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

   /**
   * 
   * @return permissionProfileId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  public PermissionProfile permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

   /**
   * 
   * @return permissionProfileName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }

  public PermissionProfile settings(AccountRoleSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountRoleSettings getSettings() {
    return settings;
  }

  public void setSettings(AccountRoleSettings settings) {
    this.settings = settings;
  }

  public PermissionProfile userCount(String userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * 
   * @return userCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserCount() {
    return userCount;
  }

  public void setUserCount(String userCount) {
    this.userCount = userCount;
  }

  public PermissionProfile users(java.util.List<UserInformation> users) {
    this.users = users;
    return this;
  }

  public PermissionProfile addUsersItem(UserInformation usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<UserInformation> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<UserInformation> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionProfile permissionProfile = (PermissionProfile) o;
    return Objects.equals(this.modifiedByUsername, permissionProfile.modifiedByUsername) &&
        Objects.equals(this.modifiedDateTime, permissionProfile.modifiedDateTime) &&
        Objects.equals(this.permissionProfileId, permissionProfile.permissionProfileId) &&
        Objects.equals(this.permissionProfileName, permissionProfile.permissionProfileName) &&
        Objects.equals(this.settings, permissionProfile.settings) &&
        Objects.equals(this.userCount, permissionProfile.userCount) &&
        Objects.equals(this.users, permissionProfile.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedByUsername, modifiedDateTime, permissionProfileId, permissionProfileName, settings, userCount, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionProfile {\n");
    
    sb.append("    modifiedByUsername: ").append(toIndentedString(modifiedByUsername)).append("\n");
    sb.append("    modifiedDateTime: ").append(toIndentedString(modifiedDateTime)).append("\n");
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

