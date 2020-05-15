package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SigningGroupUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SigningGroup
 */

public class SigningGroup {
  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("groupEmail")
  private String groupEmail = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupType")
  private String groupType = null;

  @JsonProperty("modified")
  private String modified = null;

  @JsonProperty("modifiedBy")
  private String modifiedBy = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("users")
  private java.util.List<SigningGroupUser> users = null;

  public SigningGroup created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public SigningGroup createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public SigningGroup errorDetails(ErrorDetails errorDetails) {
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

  public SigningGroup groupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
    return this;
  }

   /**
   * 
   * @return groupEmail
  **/
  @ApiModelProperty(value = "")
  public String getGroupEmail() {
    return groupEmail;
  }

  public void setGroupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
  }

  public SigningGroup groupName(String groupName) {
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

  public SigningGroup groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * 
   * @return groupType
  **/
  @ApiModelProperty(value = "")
  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public SigningGroup modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * 
   * @return modified
  **/
  @ApiModelProperty(value = "")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public SigningGroup modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * 
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public SigningGroup signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public SigningGroup users(java.util.List<SigningGroupUser> users) {
    this.users = users;
    return this;
  }

  public SigningGroup addUsersItem(SigningGroupUser usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<SigningGroupUser>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SigningGroupUser> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<SigningGroupUser> users) {
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
    SigningGroup signingGroup = (SigningGroup) o;
    return Objects.equals(this.created, signingGroup.created) &&
        Objects.equals(this.createdBy, signingGroup.createdBy) &&
        Objects.equals(this.errorDetails, signingGroup.errorDetails) &&
        Objects.equals(this.groupEmail, signingGroup.groupEmail) &&
        Objects.equals(this.groupName, signingGroup.groupName) &&
        Objects.equals(this.groupType, signingGroup.groupType) &&
        Objects.equals(this.modified, signingGroup.modified) &&
        Objects.equals(this.modifiedBy, signingGroup.modifiedBy) &&
        Objects.equals(this.signingGroupId, signingGroup.signingGroupId) &&
        Objects.equals(this.users, signingGroup.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, createdBy, errorDetails, groupEmail, groupName, groupType, modified, modifiedBy, signingGroupId, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroup {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    groupEmail: ").append(toIndentedString(groupEmail)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
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

