package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class Group   {
  
  private String groupId = null;
  private String groupName = null;
  private String permissionProfileId = null;
  private String groupType = null;
  private java.util.List<UserInfo> users = new java.util.ArrayList<UserInfo>();
  private ErrorDetails errorDetails = null;

  
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;

    return true && Objects.equals(groupId, group.groupId) &&
        Objects.equals(groupName, group.groupName) &&
        Objects.equals(permissionProfileId, group.permissionProfileId) &&
        Objects.equals(groupType, group.groupType) &&
        Objects.equals(users, group.users) &&
        Objects.equals(errorDetails, group.errorDetails)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, permissionProfileId, groupType, users, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

