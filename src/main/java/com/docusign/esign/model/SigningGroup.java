package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.SigningGroupUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains details about a signing group. Signing groups enable you to send an envelope to a predefined group of recipients and have any one member of the group sign your documents. When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature..
 *
 */
@Schema(description = "Contains details about a signing group. Signing groups enable you to send an envelope to a predefined group of recipients and have any one member of the group sign your documents. When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature.")

public class SigningGroup implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * created.
   *
   * @return SigningGroup
   **/
  public SigningGroup created(String created) {
    this.created = created;
    return this;
  }

  /**
   * .
   * @return created
   **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  /**
   * setCreated.
   **/
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   * createdBy.
   *
   * @return SigningGroup
   **/
  public SigningGroup createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * .
   * @return createdBy
   **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * setCreatedBy.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * errorDetails.
   *
   * @return SigningGroup
   **/
  public SigningGroup errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * groupEmail.
   *
   * @return SigningGroup
   **/
  public SigningGroup groupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
    return this;
  }

  /**
   * .
   * @return groupEmail
   **/
  @Schema(description = "")
  public String getGroupEmail() {
    return groupEmail;
  }

  /**
   * setGroupEmail.
   **/
  public void setGroupEmail(String groupEmail) {
    this.groupEmail = groupEmail;
  }


  /**
   * groupName.
   *
   * @return SigningGroup
   **/
  public SigningGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the group..
   * @return groupName
   **/
  @Schema(description = "The name of the group.")
  public String getGroupName() {
    return groupName;
  }

  /**
   * setGroupName.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  /**
   * groupType.
   *
   * @return SigningGroup
   **/
  public SigningGroup groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * .
   * @return groupType
   **/
  @Schema(description = "")
  public String getGroupType() {
    return groupType;
  }

  /**
   * setGroupType.
   **/
  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }


  /**
   * modified.
   *
   * @return SigningGroup
   **/
  public SigningGroup modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * .
   * @return modified
   **/
  @Schema(description = "")
  public String getModified() {
    return modified;
  }

  /**
   * setModified.
   **/
  public void setModified(String modified) {
    this.modified = modified;
  }


  /**
   * modifiedBy.
   *
   * @return SigningGroup
   **/
  public SigningGroup modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * .
   * @return modifiedBy
   **/
  @Schema(description = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  /**
   * setModifiedBy.
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * signingGroupId.
   *
   * @return SigningGroup
   **/
  public SigningGroup signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @Schema(description = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  /**
   * setSigningGroupId.
   **/
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }


  /**
   * users.
   *
   * @return SigningGroup
   **/
  public SigningGroup users(java.util.List<SigningGroupUser> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return SigningGroup
   **/
  public SigningGroup addUsersItem(SigningGroupUser usersItem) {
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
  public java.util.List<SigningGroupUser> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<SigningGroupUser> users) {
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(created, createdBy, errorDetails, groupEmail, groupName, groupType, modified, modifiedBy, signingGroupId, users);
  }


  /**
   * Converts the given object to string.
   */
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

