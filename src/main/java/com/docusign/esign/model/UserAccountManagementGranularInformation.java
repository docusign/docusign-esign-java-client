package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class UserAccountManagementGranularInformation   {
  
  private String canManageAdmins = null;
  private SettingsMetadata canManageAdminsMetadata = null;
  private String canManageGroups = null;
  private SettingsMetadata canManageGroupsMetadata = null;
  private String canManageSharing = null;
  private SettingsMetadata canManageSharingMetadata = null;
  private String canManageUsers = null;
  private SettingsMetadata canManageUsersMetadata = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageAdmins")
  public String getCanManageAdmins() {
    return canManageAdmins;
  }
  public void setCanManageAdmins(String canManageAdmins) {
    this.canManageAdmins = canManageAdmins;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageAdminsMetadata")
  public SettingsMetadata getCanManageAdminsMetadata() {
    return canManageAdminsMetadata;
  }
  public void setCanManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
    this.canManageAdminsMetadata = canManageAdminsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageGroups")
  public String getCanManageGroups() {
    return canManageGroups;
  }
  public void setCanManageGroups(String canManageGroups) {
    this.canManageGroups = canManageGroups;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageGroupsMetadata")
  public SettingsMetadata getCanManageGroupsMetadata() {
    return canManageGroupsMetadata;
  }
  public void setCanManageGroupsMetadata(SettingsMetadata canManageGroupsMetadata) {
    this.canManageGroupsMetadata = canManageGroupsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageSharing")
  public String getCanManageSharing() {
    return canManageSharing;
  }
  public void setCanManageSharing(String canManageSharing) {
    this.canManageSharing = canManageSharing;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageSharingMetadata")
  public SettingsMetadata getCanManageSharingMetadata() {
    return canManageSharingMetadata;
  }
  public void setCanManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
    this.canManageSharingMetadata = canManageSharingMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageUsers")
  public String getCanManageUsers() {
    return canManageUsers;
  }
  public void setCanManageUsers(String canManageUsers) {
    this.canManageUsers = canManageUsers;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("canManageUsersMetadata")
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

    return true && Objects.equals(canManageAdmins, userAccountManagementGranularInformation.canManageAdmins) &&
        Objects.equals(canManageAdminsMetadata, userAccountManagementGranularInformation.canManageAdminsMetadata) &&
        Objects.equals(canManageGroups, userAccountManagementGranularInformation.canManageGroups) &&
        Objects.equals(canManageGroupsMetadata, userAccountManagementGranularInformation.canManageGroupsMetadata) &&
        Objects.equals(canManageSharing, userAccountManagementGranularInformation.canManageSharing) &&
        Objects.equals(canManageSharingMetadata, userAccountManagementGranularInformation.canManageSharingMetadata) &&
        Objects.equals(canManageUsers, userAccountManagementGranularInformation.canManageUsers) &&
        Objects.equals(canManageUsersMetadata, userAccountManagementGranularInformation.canManageUsersMetadata)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(canManageAdmins, canManageAdminsMetadata, canManageGroups, canManageGroupsMetadata, canManageSharing, canManageSharingMetadata, canManageUsers, canManageUsersMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountManagementGranularInformation {\n");
    
    if (canManageAdmins != null)
      sb.append("    canManageAdmins: ").append(toIndentedString(canManageAdmins)).append("\n");
    if (canManageAdminsMetadata != null)
      sb.append("    canManageAdminsMetadata: ").append(toIndentedString(canManageAdminsMetadata)).append("\n");
    if (canManageGroups != null)
      sb.append("    canManageGroups: ").append(toIndentedString(canManageGroups)).append("\n");
    if (canManageGroupsMetadata != null)
      sb.append("    canManageGroupsMetadata: ").append(toIndentedString(canManageGroupsMetadata)).append("\n");
    if (canManageSharing != null)
      sb.append("    canManageSharing: ").append(toIndentedString(canManageSharing)).append("\n");
    if (canManageSharingMetadata != null)
      sb.append("    canManageSharingMetadata: ").append(toIndentedString(canManageSharingMetadata)).append("\n");
    if (canManageUsers != null)
      sb.append("    canManageUsers: ").append(toIndentedString(canManageUsers)).append("\n");
    if (canManageUsersMetadata != null)
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

