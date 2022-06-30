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
 * EnvelopeTransferRule.
 *
 */

public class EnvelopeTransferRule {
  @JsonProperty("carbonCopyOriginalOwner")
  private String carbonCopyOriginalOwner = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("envelopeTransferRuleId")
  private String envelopeTransferRuleId = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("fromGroup")
  private Group fromGroup = null;

  @JsonProperty("fromUser")
  private UserInformation fromUser = null;

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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule carbonCopyOriginalOwner(String carbonCopyOriginalOwner) {
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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule enabled(String enabled) {
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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule envelopeTransferRuleId(String envelopeTransferRuleId) {
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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule eventType(String eventType) {
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
   * fromGroup.
   *
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule fromGroup(Group fromGroup) {
    this.fromGroup = fromGroup;
    return this;
  }

  /**
   * Get fromGroup.
   * @return fromGroup
   **/
  @ApiModelProperty(value = "")
  public Group getFromGroup() {
    return fromGroup;
  }

  /**
   * setFromGroup.
   **/
  public void setFromGroup(Group fromGroup) {
    this.fromGroup = fromGroup;
  }


  /**
   * fromUser.
   *
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule fromUser(UserInformation fromUser) {
    this.fromUser = fromUser;
    return this;
  }

  /**
   * Get fromUser.
   * @return fromUser
   **/
  @ApiModelProperty(value = "")
  public UserInformation getFromUser() {
    return fromUser;
  }

  /**
   * setFromUser.
   **/
  public void setFromUser(UserInformation fromUser) {
    this.fromUser = fromUser;
  }


  /**
   * modifiedDate.
   *
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule modifiedDate(String modifiedDate) {
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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule modifiedUser(UserInformation modifiedUser) {
    this.modifiedUser = modifiedUser;
    return this;
  }

  /**
   * Get modifiedUser.
   * @return modifiedUser
   **/
  @ApiModelProperty(value = "")
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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule toFolder(Folder toFolder) {
    this.toFolder = toFolder;
    return this;
  }

  /**
   * Get toFolder.
   * @return toFolder
   **/
  @ApiModelProperty(value = "")
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
   * @return EnvelopeTransferRule
   **/
  public EnvelopeTransferRule toUser(UserInformation toUser) {
    this.toUser = toUser;
    return this;
  }

  /**
   * Get toUser.
   * @return toUser
   **/
  @ApiModelProperty(value = "")
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
    EnvelopeTransferRule envelopeTransferRule = (EnvelopeTransferRule) o;
    return Objects.equals(this.carbonCopyOriginalOwner, envelopeTransferRule.carbonCopyOriginalOwner) &&
        Objects.equals(this.enabled, envelopeTransferRule.enabled) &&
        Objects.equals(this.envelopeTransferRuleId, envelopeTransferRule.envelopeTransferRuleId) &&
        Objects.equals(this.eventType, envelopeTransferRule.eventType) &&
        Objects.equals(this.fromGroup, envelopeTransferRule.fromGroup) &&
        Objects.equals(this.fromUser, envelopeTransferRule.fromUser) &&
        Objects.equals(this.modifiedDate, envelopeTransferRule.modifiedDate) &&
        Objects.equals(this.modifiedUser, envelopeTransferRule.modifiedUser) &&
        Objects.equals(this.toFolder, envelopeTransferRule.toFolder) &&
        Objects.equals(this.toUser, envelopeTransferRule.toUser);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(carbonCopyOriginalOwner, enabled, envelopeTransferRuleId, eventType, fromGroup, fromUser, modifiedDate, modifiedUser, toFolder, toUser);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTransferRule {\n");
    
    sb.append("    carbonCopyOriginalOwner: ").append(toIndentedString(carbonCopyOriginalOwner)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    envelopeTransferRuleId: ").append(toIndentedString(envelopeTransferRuleId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    fromGroup: ").append(toIndentedString(fromGroup)).append("\n");
    sb.append("    fromUser: ").append(toIndentedString(fromUser)).append("\n");
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

