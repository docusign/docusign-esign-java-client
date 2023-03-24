package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Folder;
import com.docusign.esign.model.Group;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains details about an envelope transfer rule..
 *
 */
@Schema(description = "This object contains details about an envelope transfer rule.")

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
  @Schema(description = "")
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
  @Schema(description = "")
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
  @Schema(description = "")
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
  @Schema(description = "")
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
   * Information about the group that triggers the transfer..
   * @return fromGroup
   **/
  @Schema(description = "Information about the group that triggers the transfer.")
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
   * Information about the user who triggers the transfer..
   * @return fromUser
   **/
  @Schema(description = "Information about the user who triggers the transfer.")
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
  @Schema(description = "")
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
   * Information about the user who last modified the envelope transfer rule..
   * @return modifiedUser
   **/
  @Schema(description = "Information about the user who last modified the envelope transfer rule.")
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
   * Information about the destination folder to which the envelope is transferred..
   * @return toFolder
   **/
  @Schema(description = "Information about the destination folder to which the envelope is transferred.")
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
   * Information about the user to which the envelope is transferred..
   * @return toUser
   **/
  @Schema(description = "Information about the user to which the envelope is transferred.")
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

