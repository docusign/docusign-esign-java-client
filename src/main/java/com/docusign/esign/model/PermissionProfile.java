package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountRoleSettings;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PermissionProfile   {
  
  private String modifiedByUsername = null;
  private String modifiedDateTime = null;
  private String permissionProfileId = null;
  private String permissionProfileName = null;
  private AccountRoleSettings settings = null;
  private String userCount = null;
  private java.util.List<UserInformation> users = new java.util.ArrayList<UserInformation>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedByUsername")
  public String getModifiedByUsername() {
    return modifiedByUsername;
  }
  public void setModifiedByUsername(String modifiedByUsername) {
    this.modifiedByUsername = modifiedByUsername;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedDateTime")
  public String getModifiedDateTime() {
    return modifiedDateTime;
  }
  public void setModifiedDateTime(String modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionProfileId")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("permissionProfileName")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("settings")
  public AccountRoleSettings getSettings() {
    return settings;
  }
  public void setSettings(AccountRoleSettings settings) {
    this.settings = settings;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userCount")
  public String getUserCount() {
    return userCount;
  }
  public void setUserCount(String userCount) {
    this.userCount = userCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("users")
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

    return true && Objects.equals(modifiedByUsername, permissionProfile.modifiedByUsername) &&
        Objects.equals(modifiedDateTime, permissionProfile.modifiedDateTime) &&
        Objects.equals(permissionProfileId, permissionProfile.permissionProfileId) &&
        Objects.equals(permissionProfileName, permissionProfile.permissionProfileName) &&
        Objects.equals(settings, permissionProfile.settings) &&
        Objects.equals(userCount, permissionProfile.userCount) &&
        Objects.equals(users, permissionProfile.users)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedByUsername, modifiedDateTime, permissionProfileId, permissionProfileName, settings, userCount, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionProfile {\n");
    
    if (modifiedByUsername != null)
      sb.append("    modifiedByUsername: ").append(toIndentedString(modifiedByUsername)).append("\n");
    if (modifiedDateTime != null)
      sb.append("    modifiedDateTime: ").append(toIndentedString(modifiedDateTime)).append("\n");
    if (permissionProfileId != null)
      sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    if (permissionProfileName != null)
      sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
    if (settings != null)
      sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    if (userCount != null)
      sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    if (users != null)
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

