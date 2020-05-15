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
 * EnvelopeTransferRuleRequest
 */

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

  public EnvelopeTransferRuleRequest carbonCopyOriginalOwner(String carbonCopyOriginalOwner) {
    this.carbonCopyOriginalOwner = carbonCopyOriginalOwner;
    return this;
  }

   /**
   * 
   * @return carbonCopyOriginalOwner
  **/
  @ApiModelProperty(value = "")
  public String getCarbonCopyOriginalOwner() {
    return carbonCopyOriginalOwner;
  }

  public void setCarbonCopyOriginalOwner(String carbonCopyOriginalOwner) {
    this.carbonCopyOriginalOwner = carbonCopyOriginalOwner;
  }

  public EnvelopeTransferRuleRequest enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * 
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public EnvelopeTransferRuleRequest envelopeTransferRuleId(String envelopeTransferRuleId) {
    this.envelopeTransferRuleId = envelopeTransferRuleId;
    return this;
  }

   /**
   * 
   * @return envelopeTransferRuleId
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeTransferRuleId() {
    return envelopeTransferRuleId;
  }

  public void setEnvelopeTransferRuleId(String envelopeTransferRuleId) {
    this.envelopeTransferRuleId = envelopeTransferRuleId;
  }

  public EnvelopeTransferRuleRequest eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * 
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public EnvelopeTransferRuleRequest fromGroups(java.util.List<Group> fromGroups) {
    this.fromGroups = fromGroups;
    return this;
  }

  public EnvelopeTransferRuleRequest addFromGroupsItem(Group fromGroupsItem) {
    if (this.fromGroups == null) {
      this.fromGroups = new java.util.ArrayList<Group>();
    }
    this.fromGroups.add(fromGroupsItem);
    return this;
  }

   /**
   * 
   * @return fromGroups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Group> getFromGroups() {
    return fromGroups;
  }

  public void setFromGroups(java.util.List<Group> fromGroups) {
    this.fromGroups = fromGroups;
  }

  public EnvelopeTransferRuleRequest fromUsers(java.util.List<UserInformation> fromUsers) {
    this.fromUsers = fromUsers;
    return this;
  }

  public EnvelopeTransferRuleRequest addFromUsersItem(UserInformation fromUsersItem) {
    if (this.fromUsers == null) {
      this.fromUsers = new java.util.ArrayList<UserInformation>();
    }
    this.fromUsers.add(fromUsersItem);
    return this;
  }

   /**
   * 
   * @return fromUsers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserInformation> getFromUsers() {
    return fromUsers;
  }

  public void setFromUsers(java.util.List<UserInformation> fromUsers) {
    this.fromUsers = fromUsers;
  }

  public EnvelopeTransferRuleRequest modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * 
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "")
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public EnvelopeTransferRuleRequest modifiedUser(UserInformation modifiedUser) {
    this.modifiedUser = modifiedUser;
    return this;
  }

   /**
   * Get modifiedUser
   * @return modifiedUser
  **/
  @ApiModelProperty(value = "")
  public UserInformation getModifiedUser() {
    return modifiedUser;
  }

  public void setModifiedUser(UserInformation modifiedUser) {
    this.modifiedUser = modifiedUser;
  }

  public EnvelopeTransferRuleRequest toFolder(Folder toFolder) {
    this.toFolder = toFolder;
    return this;
  }

   /**
   * Get toFolder
   * @return toFolder
  **/
  @ApiModelProperty(value = "")
  public Folder getToFolder() {
    return toFolder;
  }

  public void setToFolder(Folder toFolder) {
    this.toFolder = toFolder;
  }

  public EnvelopeTransferRuleRequest toUser(UserInformation toUser) {
    this.toUser = toUser;
    return this;
  }

   /**
   * Get toUser
   * @return toUser
  **/
  @ApiModelProperty(value = "")
  public UserInformation getToUser() {
    return toUser;
  }

  public void setToUser(UserInformation toUser) {
    this.toUser = toUser;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(carbonCopyOriginalOwner, enabled, envelopeTransferRuleId, eventType, fromGroups, fromUsers, modifiedDate, modifiedUser, toFolder, toUser);
  }


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

