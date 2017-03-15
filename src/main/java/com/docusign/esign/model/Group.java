package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Group   {
  
  private ErrorDetails errorDetails = null;
  private String groupId = null;
  private String groupName = null;
  private String groupType = null;
  private String permissionProfileId = null;
  private java.util.List<UserInfo> users = new java.util.ArrayList<UserInfo>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * The DocuSign group ID for the group.
   **/
  
  @ApiModelProperty(value = "The DocuSign group ID for the group.")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * The name of the group.
   **/
  
  @ApiModelProperty(value = "The name of the group.")
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  
  /**
   * The group type.
   **/
  
  @ApiModelProperty(value = "The group type.")
  @JsonProperty("groupType")
  public String getGroupType() {
    return groupType;
  }
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  
  /**
   * The ID of the permission profile associated with the group.
   **/
  
  @ApiModelProperty(value = "The ID of the permission profile associated with the group.")
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
  @JsonProperty("users")
  public java.util.List<UserInfo> getUsers() {
    return users;
  }
  public void setUsers(java.util.List<UserInfo> users) {
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
    Group group = (Group) o;

    return true && Objects.equals(errorDetails, group.errorDetails) &&
        Objects.equals(groupId, group.groupId) &&
        Objects.equals(groupName, group.groupName) &&
        Objects.equals(groupType, group.groupType) &&
        Objects.equals(permissionProfileId, group.permissionProfileId) &&
        Objects.equals(users, group.users)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, groupId, groupName, groupType, permissionProfileId, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (groupId != null)
      sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    if (groupName != null)
      sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    if (groupType != null)
      sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    if (permissionProfileId != null)
      sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
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

