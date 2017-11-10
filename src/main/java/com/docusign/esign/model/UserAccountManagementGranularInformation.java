package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserAccountManagementGranularInformation
 */

public class UserAccountManagementGranularInformation {
  @JsonProperty("canManageAdmins")
  private String canManageAdmins = null;

  @JsonProperty("canManageAdminsMetadata")
  private SettingsMetadata canManageAdminsMetadata = null;

  @JsonProperty("canManageGroups")
  private String canManageGroups = null;

  @JsonProperty("canManageGroupsMetadata")
  private SettingsMetadata canManageGroupsMetadata = null;

  @JsonProperty("canManageSharing")
  private String canManageSharing = null;

  @JsonProperty("canManageSharingMetadata")
  private SettingsMetadata canManageSharingMetadata = null;

  @JsonProperty("canManageUsers")
  private String canManageUsers = null;

  @JsonProperty("canManageUsersMetadata")
  private SettingsMetadata canManageUsersMetadata = null;

  public UserAccountManagementGranularInformation canManageAdmins(String canManageAdmins) {
    this.canManageAdmins = canManageAdmins;
    return this;
  }

   /**
   * 
   * @return canManageAdmins
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanManageAdmins() {
    return canManageAdmins;
  }

  public void setCanManageAdmins(String canManageAdmins) {
    this.canManageAdmins = canManageAdmins;
  }

  public UserAccountManagementGranularInformation canManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
    this.canManageAdminsMetadata = canManageAdminsMetadata;
    return this;
  }

   /**
   * Get canManageAdminsMetadata
   * @return canManageAdminsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCanManageAdminsMetadata() {
    return canManageAdminsMetadata;
  }

  public void setCanManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
    this.canManageAdminsMetadata = canManageAdminsMetadata;
  }

  public UserAccountManagementGranularInformation canManageGroups(String canManageGroups) {
    this.canManageGroups = canManageGroups;
    return this;
  }

   /**
   * 
   * @return canManageGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanManageGroups() {
    return canManageGroups;
  }

  public void setCanManageGroups(String canManageGroups) {
    this.canManageGroups = canManageGroups;
  }

  public UserAccountManagementGranularInformation canManageGroupsMetadata(SettingsMetadata canManageGroupsMetadata) {
    this.canManageGroupsMetadata = canManageGroupsMetadata;
    return this;
  }

   /**
   * Get canManageGroupsMetadata
   * @return canManageGroupsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCanManageGroupsMetadata() {
    return canManageGroupsMetadata;
  }

  public void setCanManageGroupsMetadata(SettingsMetadata canManageGroupsMetadata) {
    this.canManageGroupsMetadata = canManageGroupsMetadata;
  }

  public UserAccountManagementGranularInformation canManageSharing(String canManageSharing) {
    this.canManageSharing = canManageSharing;
    return this;
  }

   /**
   * 
   * @return canManageSharing
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanManageSharing() {
    return canManageSharing;
  }

  public void setCanManageSharing(String canManageSharing) {
    this.canManageSharing = canManageSharing;
  }

  public UserAccountManagementGranularInformation canManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
    this.canManageSharingMetadata = canManageSharingMetadata;
    return this;
  }

   /**
   * Get canManageSharingMetadata
   * @return canManageSharingMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCanManageSharingMetadata() {
    return canManageSharingMetadata;
  }

  public void setCanManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
    this.canManageSharingMetadata = canManageSharingMetadata;
  }

  public UserAccountManagementGranularInformation canManageUsers(String canManageUsers) {
    this.canManageUsers = canManageUsers;
    return this;
  }

   /**
   * 
   * @return canManageUsers
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCanManageUsers() {
    return canManageUsers;
  }

  public void setCanManageUsers(String canManageUsers) {
    this.canManageUsers = canManageUsers;
  }

  public UserAccountManagementGranularInformation canManageUsersMetadata(SettingsMetadata canManageUsersMetadata) {
    this.canManageUsersMetadata = canManageUsersMetadata;
    return this;
  }

   /**
   * Get canManageUsersMetadata
   * @return canManageUsersMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public SettingsMetadata getCanManageUsersMetadata() {
    return canManageUsersMetadata;
  }

  public void setCanManageUsersMetadata(SettingsMetadata canManageUsersMetadata) {
    this.canManageUsersMetadata = canManageUsersMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountManagementGranularInformation userAccountManagementGranularInformation = (UserAccountManagementGranularInformation) o;
    return Objects.equals(this.canManageAdmins, userAccountManagementGranularInformation.canManageAdmins) &&
        Objects.equals(this.canManageAdminsMetadata, userAccountManagementGranularInformation.canManageAdminsMetadata) &&
        Objects.equals(this.canManageGroups, userAccountManagementGranularInformation.canManageGroups) &&
        Objects.equals(this.canManageGroupsMetadata, userAccountManagementGranularInformation.canManageGroupsMetadata) &&
        Objects.equals(this.canManageSharing, userAccountManagementGranularInformation.canManageSharing) &&
        Objects.equals(this.canManageSharingMetadata, userAccountManagementGranularInformation.canManageSharingMetadata) &&
        Objects.equals(this.canManageUsers, userAccountManagementGranularInformation.canManageUsers) &&
        Objects.equals(this.canManageUsersMetadata, userAccountManagementGranularInformation.canManageUsersMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canManageAdmins, canManageAdminsMetadata, canManageGroups, canManageGroupsMetadata, canManageSharing, canManageSharingMetadata, canManageUsers, canManageUsersMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountManagementGranularInformation {\n");
    
    sb.append("    canManageAdmins: ").append(toIndentedString(canManageAdmins)).append("\n");
    sb.append("    canManageAdminsMetadata: ").append(toIndentedString(canManageAdminsMetadata)).append("\n");
    sb.append("    canManageGroups: ").append(toIndentedString(canManageGroups)).append("\n");
    sb.append("    canManageGroupsMetadata: ").append(toIndentedString(canManageGroupsMetadata)).append("\n");
    sb.append("    canManageSharing: ").append(toIndentedString(canManageSharing)).append("\n");
    sb.append("    canManageSharingMetadata: ").append(toIndentedString(canManageSharingMetadata)).append("\n");
    sb.append("    canManageUsers: ").append(toIndentedString(canManageUsers)).append("\n");
    sb.append("    canManageUsersMetadata: ").append(toIndentedString(canManageUsersMetadata)).append("\n");
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

