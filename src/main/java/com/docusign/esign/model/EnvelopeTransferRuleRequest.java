package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Folder;
import com.docusign.esign.model.Group;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This object contains details about the envelope transfer rule that you want to create..
 *
 */
@ApiModel(description = "This object contains details about the envelope transfer rule that you want to create.")

public class EnvelopeTransferRuleRequest {
  @JsonProperty("carbonCopyOriginalOwner")
  private String carbonCopyOriginalOwner = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("envelopeTransferRuleId")
  private String envelopeTransferRuleId = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("fromGroups")
  private java.util.List<Group> fromGroups = null;

  @JsonProperty("fromUsers")
  private java.util.List<UserInformation> fromUsers = null;

  @JsonProperty("modifiedDate")
  private String modifiedDate = null;

  @JsonProperty("modifiedUser")
  private UserInformation modifiedUser = null;

  @JsonProperty("toFolder")
  private Folder toFolder = null;

  @JsonProperty("toUser")
  private UserInformation toUser = null;


  /**
   * carbonCopyOriginalOwner.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest carbonCopyOriginalOwner(String carbonCopyOriginalOwner) {
    this.carbonCopyOriginalOwner = carbonCopyOriginalOwner;
    return this;
  }

  /**
   * .
   * @return carbonCopyOriginalOwner
   **/
  @ApiModelProperty(value = "")
  public String getCarbonCopyOriginalOwner() {
    return carbonCopyOriginalOwner;
  }

  /**
   * setCarbonCopyOriginalOwner.
   **/
  public void setCarbonCopyOriginalOwner(String carbonCopyOriginalOwner) {
    this.carbonCopyOriginalOwner = carbonCopyOriginalOwner;
  }


  /**
   * enabled.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * .
   * @return enabled
   **/
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  /**
   * setEnabled.
   **/
  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }


  /**
   * envelopeTransferRuleId.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest envelopeTransferRuleId(String envelopeTransferRuleId) {
    this.envelopeTransferRuleId = envelopeTransferRuleId;
    return this;
  }

  /**
   * .
   * @return envelopeTransferRuleId
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopeTransferRuleId() {
    return envelopeTransferRuleId;
  }

  /**
   * setEnvelopeTransferRuleId.
   **/
  public void setEnvelopeTransferRuleId(String envelopeTransferRuleId) {
    this.envelopeTransferRuleId = envelopeTransferRuleId;
  }


  /**
   * eventType.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * .
   * @return eventType
   **/
  @ApiModelProperty(value = "")
  public String getEventType() {
    return eventType;
  }

  /**
   * setEventType.
   **/
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  /**
   * fromGroups.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest fromGroups(java.util.List<Group> fromGroups) {
    this.fromGroups = fromGroups;
    return this;
  }
  
  /**
   * addFromGroupsItem.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest addFromGroupsItem(Group fromGroupsItem) {
    if (this.fromGroups == null) {
      this.fromGroups = new java.util.ArrayList<>();
    }
    this.fromGroups.add(fromGroupsItem);
    return this;
  }

  /**
   * .
   * @return fromGroups
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Group> getFromGroups() {
    return fromGroups;
  }

  /**
   * setFromGroups.
   **/
  public void setFromGroups(java.util.List<Group> fromGroups) {
    this.fromGroups = fromGroups;
  }


  /**
   * fromUsers.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest fromUsers(java.util.List<UserInformation> fromUsers) {
    this.fromUsers = fromUsers;
    return this;
  }
  
  /**
   * addFromUsersItem.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest addFromUsersItem(UserInformation fromUsersItem) {
    if (this.fromUsers == null) {
      this.fromUsers = new java.util.ArrayList<>();
    }
    this.fromUsers.add(fromUsersItem);
    return this;
  }

  /**
   * .
   * @return fromUsers
   **/
  @ApiModelProperty(value = "")
  public java.util.List<UserInformation> getFromUsers() {
    return fromUsers;
  }

  /**
   * setFromUsers.
   **/
  public void setFromUsers(java.util.List<UserInformation> fromUsers) {
    this.fromUsers = fromUsers;
  }


  /**
   * modifiedDate.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * .
   * @return modifiedDate
   **/
  @ApiModelProperty(value = "")
  public String getModifiedDate() {
    return modifiedDate;
  }

  /**
   * setModifiedDate.
   **/
  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   * modifiedUser.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest modifiedUser(UserInformation modifiedUser) {
    this.modifiedUser = modifiedUser;
    return this;
  }

  /**
   * Information about the user who last modified the envelope transfer rule..
   * @return modifiedUser
   **/
  @ApiModelProperty(value = "Information about the user who last modified the envelope transfer rule.")
  public UserInformation getModifiedUser() {
    return modifiedUser;
  }

  /**
   * setModifiedUser.
   **/
  public void setModifiedUser(UserInformation modifiedUser) {
    this.modifiedUser = modifiedUser;
  }


  /**
   * toFolder.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest toFolder(Folder toFolder) {
    this.toFolder = toFolder;
    return this;
  }

  /**
   * Information about the destination folder to which the envelope is transferred..
   * @return toFolder
   **/
  @ApiModelProperty(value = "Information about the destination folder to which the envelope is transferred.")
  public Folder getToFolder() {
    return toFolder;
  }

  /**
   * setToFolder.
   **/
  public void setToFolder(Folder toFolder) {
    this.toFolder = toFolder;
  }


  /**
   * toUser.
   *
   * @return EnvelopeTransferRuleRequest
   **/
  public EnvelopeTransferRuleRequest toUser(UserInformation toUser) {
    this.toUser = toUser;
    return this;
  }

  /**
   * Information about the user to which the envelope is transferred..
   * @return toUser
   **/
  @ApiModelProperty(value = "Information about the user to which the envelope is transferred.")
  public UserInformation getToUser() {
    return toUser;
  }

  /**
   * setToUser.
   **/
  public void setToUser(UserInformation toUser) {
    this.toUser = toUser;
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
    EnvelopeTransferRuleRequest envelopeTransferRuleRequest = (EnvelopeTransferRuleRequest) o;
    return Objects.equals(this.carbonCopyOriginalOwner, envelopeTransferRuleRequest.carbonCopyOriginalOwner) &&
        Objects.equals(this.enabled, envelopeTransferRuleRequest.enabled) &&
        Objects.equals(this.envelopeTransferRuleId, envelopeTransferRuleRequest.envelopeTransferRuleId) &&
        Objects.equals(this.eventType, envelopeTransferRuleRequest.eventType) &&
        Objects.equals(this.fromGroups, envelopeTransferRuleRequest.fromGroups) &&
        Objects.equals(this.fromUsers, envelopeTransferRuleRequest.fromUsers) &&
        Objects.equals(this.modifiedDate, envelopeTransferRuleRequest.modifiedDate) &&
        Objects.equals(this.modifiedUser, envelopeTransferRuleRequest.modifiedUser) &&
        Objects.equals(this.toFolder, envelopeTransferRuleRequest.toFolder) &&
        Objects.equals(this.toUser, envelopeTransferRuleRequest.toUser);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(carbonCopyOriginalOwner, enabled, envelopeTransferRuleId, eventType, fromGroups, fromUsers, modifiedDate, modifiedUser, toFolder, toUser);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTransferRuleRequest {\n");
    
    sb.append("    carbonCopyOriginalOwner: ").append(toIndentedString(carbonCopyOriginalOwner)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    envelopeTransferRuleId: ").append(toIndentedString(envelopeTransferRuleId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    fromGroups: ").append(toIndentedString(fromGroups)).append("\n");
    sb.append("    fromUsers: ").append(toIndentedString(fromUsers)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedUser: ").append(toIndentedString(modifiedUser)).append("\n");
    sb.append("    toFolder: ").append(toIndentedString(toFolder)).append("\n");
    sb.append("    toUser: ").append(toIndentedString(toUser)).append("\n");
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

