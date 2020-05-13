package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserAccountManagementGranularInformation
 */

public class UserAccountManagementGranularInformation {
  @JsonProperty("canManageAccountSecuritySettings")
  private String canManageAccountSecuritySettings = null;

  @JsonProperty("canManageAccountSecuritySettingsMetadata")
  private SettingsMetadata canManageAccountSecuritySettingsMetadata = null;

  @JsonProperty("canManageAccountSettings")
  private String canManageAccountSettings = null;

  @JsonProperty("canManageAccountSettingsMetadata")
  private SettingsMetadata canManageAccountSettingsMetadata = null;

  @JsonProperty("canManageAdmins")
  private String canManageAdmins = null;

  @JsonProperty("canManageAdminsMetadata")
  private SettingsMetadata canManageAdminsMetadata = null;

  @JsonProperty("canManageReporting")
  private String canManageReporting = null;

  @JsonProperty("canManageReportingMetadata")
  private SettingsMetadata canManageReportingMetadata = null;

  @JsonProperty("canManageSharing")
  private String canManageSharing = null;

  @JsonProperty("canManageSharingMetadata")
  private SettingsMetadata canManageSharingMetadata = null;

  @JsonProperty("canManageSigningGroups")
  private String canManageSigningGroups = null;

  @JsonProperty("canManageSigningGroupsMetadata")
  private SettingsMetadata canManageSigningGroupsMetadata = null;

  @JsonProperty("canManageUsers")
  private String canManageUsers = null;

  @JsonProperty("canManageUsersMetadata")
  private SettingsMetadata canManageUsersMetadata = null;

  @JsonProperty("canViewUsers")
  private String canViewUsers = null;

  public UserAccountManagementGranularInformation canManageAccountSecuritySettings(String canManageAccountSecuritySettings) {
    this.canManageAccountSecuritySettings = canManageAccountSecuritySettings;
    return this;
  }

   /**
   * 
   * @return canManageAccountSecuritySettings
  **/
  @ApiModelProperty(value = "")
  public String getCanManageAccountSecuritySettings() {
    return canManageAccountSecuritySettings;
  }

  public void setCanManageAccountSecuritySettings(String canManageAccountSecuritySettings) {
    this.canManageAccountSecuritySettings = canManageAccountSecuritySettings;
  }

  public UserAccountManagementGranularInformation canManageAccountSecuritySettingsMetadata(SettingsMetadata canManageAccountSecuritySettingsMetadata) {
    this.canManageAccountSecuritySettingsMetadata = canManageAccountSecuritySettingsMetadata;
    return this;
  }

   /**
   * Get canManageAccountSecuritySettingsMetadata
   * @return canManageAccountSecuritySettingsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAccountSecuritySettingsMetadata() {
    return canManageAccountSecuritySettingsMetadata;
  }

  public void setCanManageAccountSecuritySettingsMetadata(SettingsMetadata canManageAccountSecuritySettingsMetadata) {
    this.canManageAccountSecuritySettingsMetadata = canManageAccountSecuritySettingsMetadata;
  }

  public UserAccountManagementGranularInformation canManageAccountSettings(String canManageAccountSettings) {
    this.canManageAccountSettings = canManageAccountSettings;
    return this;
  }

   /**
   * 
   * @return canManageAccountSettings
  **/
  @ApiModelProperty(value = "")
  public String getCanManageAccountSettings() {
    return canManageAccountSettings;
  }

  public void setCanManageAccountSettings(String canManageAccountSettings) {
    this.canManageAccountSettings = canManageAccountSettings;
  }

  public UserAccountManagementGranularInformation canManageAccountSettingsMetadata(SettingsMetadata canManageAccountSettingsMetadata) {
    this.canManageAccountSettingsMetadata = canManageAccountSettingsMetadata;
    return this;
  }

   /**
   * Get canManageAccountSettingsMetadata
   * @return canManageAccountSettingsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAccountSettingsMetadata() {
    return canManageAccountSettingsMetadata;
  }

  public void setCanManageAccountSettingsMetadata(SettingsMetadata canManageAccountSettingsMetadata) {
    this.canManageAccountSettingsMetadata = canManageAccountSettingsMetadata;
  }

  public UserAccountManagementGranularInformation canManageAdmins(String canManageAdmins) {
    this.canManageAdmins = canManageAdmins;
    return this;
  }

   /**
   * 
   * @return canManageAdmins
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageAdminsMetadata() {
    return canManageAdminsMetadata;
  }

  public void setCanManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
    this.canManageAdminsMetadata = canManageAdminsMetadata;
  }

  public UserAccountManagementGranularInformation canManageReporting(String canManageReporting) {
    this.canManageReporting = canManageReporting;
    return this;
  }

   /**
   * 
   * @return canManageReporting
  **/
  @ApiModelProperty(value = "")
  public String getCanManageReporting() {
    return canManageReporting;
  }

  public void setCanManageReporting(String canManageReporting) {
    this.canManageReporting = canManageReporting;
  }

  public UserAccountManagementGranularInformation canManageReportingMetadata(SettingsMetadata canManageReportingMetadata) {
    this.canManageReportingMetadata = canManageReportingMetadata;
    return this;
  }

   /**
   * Get canManageReportingMetadata
   * @return canManageReportingMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageReportingMetadata() {
    return canManageReportingMetadata;
  }

  public void setCanManageReportingMetadata(SettingsMetadata canManageReportingMetadata) {
    this.canManageReportingMetadata = canManageReportingMetadata;
  }

  public UserAccountManagementGranularInformation canManageSharing(String canManageSharing) {
    this.canManageSharing = canManageSharing;
    return this;
  }

   /**
   * 
   * @return canManageSharing
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageSharingMetadata() {
    return canManageSharingMetadata;
  }

  public void setCanManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
    this.canManageSharingMetadata = canManageSharingMetadata;
  }

  public UserAccountManagementGranularInformation canManageSigningGroups(String canManageSigningGroups) {
    this.canManageSigningGroups = canManageSigningGroups;
    return this;
  }

   /**
   * 
   * @return canManageSigningGroups
  **/
  @ApiModelProperty(value = "")
  public String getCanManageSigningGroups() {
    return canManageSigningGroups;
  }

  public void setCanManageSigningGroups(String canManageSigningGroups) {
    this.canManageSigningGroups = canManageSigningGroups;
  }

  public UserAccountManagementGranularInformation canManageSigningGroupsMetadata(SettingsMetadata canManageSigningGroupsMetadata) {
    this.canManageSigningGroupsMetadata = canManageSigningGroupsMetadata;
    return this;
  }

   /**
   * Get canManageSigningGroupsMetadata
   * @return canManageSigningGroupsMetadata
  **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageSigningGroupsMetadata() {
    return canManageSigningGroupsMetadata;
  }

  public void setCanManageSigningGroupsMetadata(SettingsMetadata canManageSigningGroupsMetadata) {
    this.canManageSigningGroupsMetadata = canManageSigningGroupsMetadata;
  }

  public UserAccountManagementGranularInformation canManageUsers(String canManageUsers) {
    this.canManageUsers = canManageUsers;
    return this;
  }

   /**
   * 
   * @return canManageUsers
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public SettingsMetadata getCanManageUsersMetadata() {
    return canManageUsersMetadata;
  }

  public void setCanManageUsersMetadata(SettingsMetadata canManageUsersMetadata) {
    this.canManageUsersMetadata = canManageUsersMetadata;
  }

  public UserAccountManagementGranularInformation canViewUsers(String canViewUsers) {
    this.canViewUsers = canViewUsers;
    return this;
  }

   /**
   * 
   * @return canViewUsers
  **/
  @ApiModelProperty(value = "")
  public String getCanViewUsers() {
    return canViewUsers;
  }

  public void setCanViewUsers(String canViewUsers) {
    this.canViewUsers = canViewUsers;
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
    return Objects.equals(this.canManageAccountSecuritySettings, userAccountManagementGranularInformation.canManageAccountSecuritySettings) &&
        Objects.equals(this.canManageAccountSecuritySettingsMetadata, userAccountManagementGranularInformation.canManageAccountSecuritySettingsMetadata) &&
        Objects.equals(this.canManageAccountSettings, userAccountManagementGranularInformation.canManageAccountSettings) &&
        Objects.equals(this.canManageAccountSettingsMetadata, userAccountManagementGranularInformation.canManageAccountSettingsMetadata) &&
        Objects.equals(this.canManageAdmins, userAccountManagementGranularInformation.canManageAdmins) &&
        Objects.equals(this.canManageAdminsMetadata, userAccountManagementGranularInformation.canManageAdminsMetadata) &&
        Objects.equals(this.canManageReporting, userAccountManagementGranularInformation.canManageReporting) &&
        Objects.equals(this.canManageReportingMetadata, userAccountManagementGranularInformation.canManageReportingMetadata) &&
        Objects.equals(this.canManageSharing, userAccountManagementGranularInformation.canManageSharing) &&
        Objects.equals(this.canManageSharingMetadata, userAccountManagementGranularInformation.canManageSharingMetadata) &&
        Objects.equals(this.canManageSigningGroups, userAccountManagementGranularInformation.canManageSigningGroups) &&
        Objects.equals(this.canManageSigningGroupsMetadata, userAccountManagementGranularInformation.canManageSigningGroupsMetadata) &&
        Objects.equals(this.canManageUsers, userAccountManagementGranularInformation.canManageUsers) &&
        Objects.equals(this.canManageUsersMetadata, userAccountManagementGranularInformation.canManageUsersMetadata) &&
        Objects.equals(this.canViewUsers, userAccountManagementGranularInformation.canViewUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canManageAccountSecuritySettings, canManageAccountSecuritySettingsMetadata, canManageAccountSettings, canManageAccountSettingsMetadata, canManageAdmins, canManageAdminsMetadata, canManageReporting, canManageReportingMetadata, canManageSharing, canManageSharingMetadata, canManageSigningGroups, canManageSigningGroupsMetadata, canManageUsers, canManageUsersMetadata, canViewUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountManagementGranularInformation {\n");
    
    sb.append("    canManageAccountSecuritySettings: ").append(toIndentedString(canManageAccountSecuritySettings)).append("\n");
    sb.append("    canManageAccountSecuritySettingsMetadata: ").append(toIndentedString(canManageAccountSecuritySettingsMetadata)).append("\n");
    sb.append("    canManageAccountSettings: ").append(toIndentedString(canManageAccountSettings)).append("\n");
    sb.append("    canManageAccountSettingsMetadata: ").append(toIndentedString(canManageAccountSettingsMetadata)).append("\n");
    sb.append("    canManageAdmins: ").append(toIndentedString(canManageAdmins)).append("\n");
    sb.append("    canManageAdminsMetadata: ").append(toIndentedString(canManageAdminsMetadata)).append("\n");
    sb.append("    canManageReporting: ").append(toIndentedString(canManageReporting)).append("\n");
    sb.append("    canManageReportingMetadata: ").append(toIndentedString(canManageReportingMetadata)).append("\n");
    sb.append("    canManageSharing: ").append(toIndentedString(canManageSharing)).append("\n");
    sb.append("    canManageSharingMetadata: ").append(toIndentedString(canManageSharingMetadata)).append("\n");
    sb.append("    canManageSigningGroups: ").append(toIndentedString(canManageSigningGroups)).append("\n");
    sb.append("    canManageSigningGroupsMetadata: ").append(toIndentedString(canManageSigningGroupsMetadata)).append("\n");
    sb.append("    canManageUsers: ").append(toIndentedString(canManageUsers)).append("\n");
    sb.append("    canManageUsersMetadata: ").append(toIndentedString(canManageUsersMetadata)).append("\n");
    sb.append("    canViewUsers: ").append(toIndentedString(canViewUsers)).append("\n");
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

