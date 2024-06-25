package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.PowerFormRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Contains details about a PowerForm..
 *
 */
@Schema(description = "Contains details about a PowerForm.")

public class PowerForm implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("emailBody")
  private String emailBody = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("envelopes")
  private java.util.List<Envelope> envelopes = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("instructions")
  private String instructions = null;

  @JsonProperty("isActive")
  private String isActive = null;

  @JsonProperty("lastUsed")
  private String lastUsed = null;

  @JsonProperty("limitUseInterval")
  private String limitUseInterval = null;

  @JsonProperty("limitUseIntervalEnabled")
  private String limitUseIntervalEnabled = null;

  @JsonProperty("limitUseIntervalUnits")
  private String limitUseIntervalUnits = null;

  @JsonProperty("maxUseEnabled")
  private String maxUseEnabled = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("powerFormId")
  private String powerFormId = null;

  @JsonProperty("powerFormUrl")
  private String powerFormUrl = null;

  @JsonProperty("recipients")
  private java.util.List<PowerFormRecipient> recipients = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;

  @JsonProperty("signingMode")
  private String signingMode = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templateName")
  private String templateName = null;

  @JsonProperty("timesUsed")
  private String timesUsed = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("usesRemaining")
  private String usesRemaining = null;


  /**
   * createdBy.
   *
   * @return PowerForm
   **/
  public PowerForm createdBy(String createdBy) {
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
   * createdDateTime.
   *
   * @return PowerForm
   **/
  public PowerForm createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @Schema(description = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * emailBody.
   *
   * @return PowerForm
   **/
  public PowerForm emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }

  /**
   * Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. .
   * @return emailBody
   **/
  @Schema(description = "Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. ")
  public String getEmailBody() {
    return emailBody;
  }

  /**
   * setEmailBody.
   **/
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }


  /**
   * emailSubject.
   *
   * @return PowerForm
   **/
  public PowerForm emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject..
   * @return emailSubject
   **/
  @Schema(description = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  /**
   * setEmailSubject.
   **/
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  /**
   * envelopes.
   *
   * @return PowerForm
   **/
  public PowerForm envelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  /**
   * addEnvelopesItem.
   *
   * @return PowerForm
   **/
  public PowerForm addEnvelopesItem(Envelope envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new java.util.ArrayList<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * .
   * @return envelopes
   **/
  @Schema(description = "")
  public java.util.List<Envelope> getEnvelopes() {
    return envelopes;
  }

  /**
   * setEnvelopes.
   **/
  public void setEnvelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
  }


  /**
   * errorDetails.
   *
   * @return PowerForm
   **/
  public PowerForm errorDetails(ErrorDetails errorDetails) {
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
   * instructions.
   *
   * @return PowerForm
   **/
  public PowerForm instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * .
   * @return instructions
   **/
  @Schema(description = "")
  public String getInstructions() {
    return instructions;
  }

  /**
   * setInstructions.
   **/
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  /**
   * isActive.
   *
   * @return PowerForm
   **/
  public PowerForm isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * .
   * @return isActive
   **/
  @Schema(description = "")
  public String getIsActive() {
    return isActive;
  }

  /**
   * setIsActive.
   **/
  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }


  /**
   * lastUsed.
   *
   * @return PowerForm
   **/
  public PowerForm lastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

  /**
   * .
   * @return lastUsed
   **/
  @Schema(description = "")
  public String getLastUsed() {
    return lastUsed;
  }

  /**
   * setLastUsed.
   **/
  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }


  /**
   * limitUseInterval.
   *
   * @return PowerForm
   **/
  public PowerForm limitUseInterval(String limitUseInterval) {
    this.limitUseInterval = limitUseInterval;
    return this;
  }

  /**
   * .
   * @return limitUseInterval
   **/
  @Schema(description = "")
  public String getLimitUseInterval() {
    return limitUseInterval;
  }

  /**
   * setLimitUseInterval.
   **/
  public void setLimitUseInterval(String limitUseInterval) {
    this.limitUseInterval = limitUseInterval;
  }


  /**
   * limitUseIntervalEnabled.
   *
   * @return PowerForm
   **/
  public PowerForm limitUseIntervalEnabled(String limitUseIntervalEnabled) {
    this.limitUseIntervalEnabled = limitUseIntervalEnabled;
    return this;
  }

  /**
   * .
   * @return limitUseIntervalEnabled
   **/
  @Schema(description = "")
  public String getLimitUseIntervalEnabled() {
    return limitUseIntervalEnabled;
  }

  /**
   * setLimitUseIntervalEnabled.
   **/
  public void setLimitUseIntervalEnabled(String limitUseIntervalEnabled) {
    this.limitUseIntervalEnabled = limitUseIntervalEnabled;
  }


  /**
   * limitUseIntervalUnits.
   *
   * @return PowerForm
   **/
  public PowerForm limitUseIntervalUnits(String limitUseIntervalUnits) {
    this.limitUseIntervalUnits = limitUseIntervalUnits;
    return this;
  }

  /**
   * .
   * @return limitUseIntervalUnits
   **/
  @Schema(description = "")
  public String getLimitUseIntervalUnits() {
    return limitUseIntervalUnits;
  }

  /**
   * setLimitUseIntervalUnits.
   **/
  public void setLimitUseIntervalUnits(String limitUseIntervalUnits) {
    this.limitUseIntervalUnits = limitUseIntervalUnits;
  }


  /**
   * maxUseEnabled.
   *
   * @return PowerForm
   **/
  public PowerForm maxUseEnabled(String maxUseEnabled) {
    this.maxUseEnabled = maxUseEnabled;
    return this;
  }

  /**
   * .
   * @return maxUseEnabled
   **/
  @Schema(description = "")
  public String getMaxUseEnabled() {
    return maxUseEnabled;
  }

  /**
   * setMaxUseEnabled.
   **/
  public void setMaxUseEnabled(String maxUseEnabled) {
    this.maxUseEnabled = maxUseEnabled;
  }


  /**
   * name.
   *
   * @return PowerForm
   **/
  public PowerForm name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * powerFormId.
   *
   * @return PowerForm
   **/
  public PowerForm powerFormId(String powerFormId) {
    this.powerFormId = powerFormId;
    return this;
  }

  /**
   * .
   * @return powerFormId
   **/
  @Schema(description = "")
  public String getPowerFormId() {
    return powerFormId;
  }

  /**
   * setPowerFormId.
   **/
  public void setPowerFormId(String powerFormId) {
    this.powerFormId = powerFormId;
  }


  /**
   * powerFormUrl.
   *
   * @return PowerForm
   **/
  public PowerForm powerFormUrl(String powerFormUrl) {
    this.powerFormUrl = powerFormUrl;
    return this;
  }

  /**
   * .
   * @return powerFormUrl
   **/
  @Schema(description = "")
  public String getPowerFormUrl() {
    return powerFormUrl;
  }

  /**
   * setPowerFormUrl.
   **/
  public void setPowerFormUrl(String powerFormUrl) {
    this.powerFormUrl = powerFormUrl;
  }


  /**
   * recipients.
   *
   * @return PowerForm
   **/
  public PowerForm recipients(java.util.List<PowerFormRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }
  
  /**
   * addRecipientsItem.
   *
   * @return PowerForm
   **/
  public PowerForm addRecipientsItem(PowerFormRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * An array of powerform recipients..
   * @return recipients
   **/
  @Schema(description = "An array of powerform recipients.")
  public java.util.List<PowerFormRecipient> getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(java.util.List<PowerFormRecipient> recipients) {
    this.recipients = recipients;
  }


  /**
   * senderName.
   *
   * @return PowerForm
   **/
  public PowerForm senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * .
   * @return senderName
   **/
  @Schema(description = "")
  public String getSenderName() {
    return senderName;
  }

  /**
   * setSenderName.
   **/
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  /**
   * senderUserId.
   *
   * @return PowerForm
   **/
  public PowerForm senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

  /**
   * .
   * @return senderUserId
   **/
  @Schema(description = "")
  public String getSenderUserId() {
    return senderUserId;
  }

  /**
   * setSenderUserId.
   **/
  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }


  /**
   * signingMode.
   *
   * @return PowerForm
   **/
  public PowerForm signingMode(String signingMode) {
    this.signingMode = signingMode;
    return this;
  }

  /**
   * .
   * @return signingMode
   **/
  @Schema(description = "")
  public String getSigningMode() {
    return signingMode;
  }

  /**
   * setSigningMode.
   **/
  public void setSigningMode(String signingMode) {
    this.signingMode = signingMode;
  }


  /**
   * templateId.
   *
   * @return PowerForm
   **/
  public PowerForm templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @Schema(description = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * templateName.
   *
   * @return PowerForm
   **/
  public PowerForm templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * .
   * @return templateName
   **/
  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  /**
   * setTemplateName.
   **/
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  /**
   * timesUsed.
   *
   * @return PowerForm
   **/
  public PowerForm timesUsed(String timesUsed) {
    this.timesUsed = timesUsed;
    return this;
  }

  /**
   * .
   * @return timesUsed
   **/
  @Schema(description = "")
  public String getTimesUsed() {
    return timesUsed;
  }

  /**
   * setTimesUsed.
   **/
  public void setTimesUsed(String timesUsed) {
    this.timesUsed = timesUsed;
  }


  /**
   * uri.
   *
   * @return PowerForm
   **/
  public PowerForm uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * usesRemaining.
   *
   * @return PowerForm
   **/
  public PowerForm usesRemaining(String usesRemaining) {
    this.usesRemaining = usesRemaining;
    return this;
  }

  /**
   * .
   * @return usesRemaining
   **/
  @Schema(description = "")
  public String getUsesRemaining() {
    return usesRemaining;
  }

  /**
   * setUsesRemaining.
   **/
  public void setUsesRemaining(String usesRemaining) {
    this.usesRemaining = usesRemaining;
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
    PowerForm powerForm = (PowerForm) o;
    return Objects.equals(this.createdBy, powerForm.createdBy) &&
        Objects.equals(this.createdDateTime, powerForm.createdDateTime) &&
        Objects.equals(this.emailBody, powerForm.emailBody) &&
        Objects.equals(this.emailSubject, powerForm.emailSubject) &&
        Objects.equals(this.envelopes, powerForm.envelopes) &&
        Objects.equals(this.errorDetails, powerForm.errorDetails) &&
        Objects.equals(this.instructions, powerForm.instructions) &&
        Objects.equals(this.isActive, powerForm.isActive) &&
        Objects.equals(this.lastUsed, powerForm.lastUsed) &&
        Objects.equals(this.limitUseInterval, powerForm.limitUseInterval) &&
        Objects.equals(this.limitUseIntervalEnabled, powerForm.limitUseIntervalEnabled) &&
        Objects.equals(this.limitUseIntervalUnits, powerForm.limitUseIntervalUnits) &&
        Objects.equals(this.maxUseEnabled, powerForm.maxUseEnabled) &&
        Objects.equals(this.name, powerForm.name) &&
        Objects.equals(this.powerFormId, powerForm.powerFormId) &&
        Objects.equals(this.powerFormUrl, powerForm.powerFormUrl) &&
        Objects.equals(this.recipients, powerForm.recipients) &&
        Objects.equals(this.senderName, powerForm.senderName) &&
        Objects.equals(this.senderUserId, powerForm.senderUserId) &&
        Objects.equals(this.signingMode, powerForm.signingMode) &&
        Objects.equals(this.templateId, powerForm.templateId) &&
        Objects.equals(this.templateName, powerForm.templateName) &&
        Objects.equals(this.timesUsed, powerForm.timesUsed) &&
        Objects.equals(this.uri, powerForm.uri) &&
        Objects.equals(this.usesRemaining, powerForm.usesRemaining);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDateTime, emailBody, emailSubject, envelopes, errorDetails, instructions, isActive, lastUsed, limitUseInterval, limitUseIntervalEnabled, limitUseIntervalUnits, maxUseEnabled, name, powerFormId, powerFormUrl, recipients, senderName, senderUserId, signingMode, templateId, templateName, timesUsed, uri, usesRemaining);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerForm {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    limitUseInterval: ").append(toIndentedString(limitUseInterval)).append("\n");
    sb.append("    limitUseIntervalEnabled: ").append(toIndentedString(limitUseIntervalEnabled)).append("\n");
    sb.append("    limitUseIntervalUnits: ").append(toIndentedString(limitUseIntervalUnits)).append("\n");
    sb.append("    maxUseEnabled: ").append(toIndentedString(maxUseEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    powerFormId: ").append(toIndentedString(powerFormId)).append("\n");
    sb.append("    powerFormUrl: ").append(toIndentedString(powerFormUrl)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    signingMode: ").append(toIndentedString(signingMode)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    timesUsed: ").append(toIndentedString(timesUsed)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    usesRemaining: ").append(toIndentedString(usesRemaining)).append("\n");
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

