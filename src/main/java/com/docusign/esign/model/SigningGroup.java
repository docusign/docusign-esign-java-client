package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SigningGroupUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SigningGroup   {
  
  private String created = null;
  private String createdBy = null;
  private ErrorDetails errorDetails = null;
  private String groupEmail = null;
  private String groupName = null;
  private String groupType = null;
  private String modified = null;
  private String modifiedBy = null;
  private String signingGroupId = null;
  private java.util.List<SigningGroupUser> users = new java.util.ArrayList<SigningGroupUser>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupEmail")
  public String getGroupEmail() {
    return groupEmail;
  }
  public void setGroupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
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
   * 
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("modified")
  public String getModified() {
    return modified;
  }
  public void setModified(String modified) {
    this.modified = modified;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   **/
  
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  @JsonProperty("signingGroupId")
  public String getSigningGroupId() {
    return signingGroupId;
  }
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("users")
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

    return true && Objects.equals(created, signingGroup.created) &&
        Objects.equals(createdBy, signingGroup.createdBy) &&
        Objects.equals(errorDetails, signingGroup.errorDetails) &&
        Objects.equals(groupEmail, signingGroup.groupEmail) &&
        Objects.equals(groupName, signingGroup.groupName) &&
        Objects.equals(groupType, signingGroup.groupType) &&
        Objects.equals(modified, signingGroup.modified) &&
        Objects.equals(modifiedBy, signingGroup.modifiedBy) &&
        Objects.equals(signingGroupId, signingGroup.signingGroupId) &&
        Objects.equals(users, signingGroup.users)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, createdBy, errorDetails, groupEmail, groupName, groupType, modified, modifiedBy, signingGroupId, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGroup {\n");
    
    if (created != null)
      sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (createdBy != null)
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (groupEmail != null)
      sb.append("    groupEmail: ").append(toIndentedString(groupEmail)).append("\n");
    if (groupName != null)
      sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    if (groupType != null)
      sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    if (modified != null)
      sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    if (modifiedBy != null)
      sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    if (signingGroupId != null)
      sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
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

