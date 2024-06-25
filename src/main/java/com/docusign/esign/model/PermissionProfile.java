package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountRoleSettings;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * This object defines the account permissions for a profile that you can apply to a group of users..
 *
 */
@Schema(description = "This object defines the account permissions for a profile that you can apply to a group of users.")

public class PermissionProfile implements Serializable {
  private static final long serialVersionUID = 1L;

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
  private java.util.List<UserInformation> users = null;


  /**
   * modifiedByUsername.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile modifiedByUsername(String modifiedByUsername) {
    this.modifiedByUsername = modifiedByUsername;
    return this;
  }

  /**
   * .
   * @return modifiedByUsername
   **/
  @Schema(description = "")
  public String getModifiedByUsername() {
    return modifiedByUsername;
  }

  /**
   * setModifiedByUsername.
   **/
  public void setModifiedByUsername(String modifiedByUsername) {
    this.modifiedByUsername = modifiedByUsername;
  }


  /**
   * modifiedDateTime.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile modifiedDateTime(String modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
    return this;
  }

  /**
   * .
   * @return modifiedDateTime
   **/
  @Schema(description = "")
  public String getModifiedDateTime() {
    return modifiedDateTime;
  }

  /**
   * setModifiedDateTime.
   **/
  public void setModifiedDateTime(String modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
  }


  /**
   * permissionProfileId.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

  /**
   * .
   * @return permissionProfileId
   **/
  @Schema(description = "")
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
   * permissionProfileName.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

  /**
   * .
   * @return permissionProfileName
   **/
  @Schema(description = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  /**
   * setPermissionProfileName.
   **/
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }


  /**
   * settings.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile settings(AccountRoleSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * This object specifies the permissions that are associated with the account permission profile..
   * @return settings
   **/
  @Schema(description = "This object specifies the permissions that are associated with the account permission profile.")
  public AccountRoleSettings getSettings() {
    return settings;
  }

  /**
   * setSettings.
   **/
  public void setSettings(AccountRoleSettings settings) {
    this.settings = settings;
  }


  /**
   * userCount.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile userCount(String userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * .
   * @return userCount
   **/
  @Schema(description = "")
  public String getUserCount() {
    return userCount;
  }

  /**
   * setUserCount.
   **/
  public void setUserCount(String userCount) {
    this.userCount = userCount;
  }


  /**
   * users.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile users(java.util.List<UserInformation> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return PermissionProfile
   **/
  public PermissionProfile addUsersItem(UserInformation usersItem) {
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
  public java.util.List<UserInformation> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<UserInformation> users) {
    this.users = users;
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
    PermissionProfile permissionProfile = (PermissionProfile) o;
    return Objects.equals(this.modifiedByUsername, permissionProfile.modifiedByUsername) &&
        Objects.equals(this.modifiedDateTime, permissionProfile.modifiedDateTime) &&
        Objects.equals(this.permissionProfileId, permissionProfile.permissionProfileId) &&
        Objects.equals(this.permissionProfileName, permissionProfile.permissionProfileName) &&
        Objects.equals(this.settings, permissionProfile.settings) &&
        Objects.equals(this.userCount, permissionProfile.userCount) &&
        Objects.equals(this.users, permissionProfile.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(modifiedByUsername, modifiedDateTime, permissionProfileId, permissionProfileName, settings, userCount, users);
  }


  /**
   * Converts the given object to string.
   */
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

