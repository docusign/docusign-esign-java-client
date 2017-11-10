package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.PowerFormRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PowerForm
 */

public class PowerForm {
  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("emailBody")
  private String emailBody = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("envelopes")
  private java.util.List<Envelope> envelopes = new java.util.ArrayList<Envelope>();

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
  private java.util.List<PowerFormRecipient> recipients = new java.util.ArrayList<PowerFormRecipient>();

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

  public PowerForm createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Indicates the date and time the item was created.
   * @return createdDateTime
  **/
  @ApiModelProperty(example = "null", value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public PowerForm emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }

   /**
   * Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. 
   * @return emailBody
  **/
  @ApiModelProperty(example = "null", value = "Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. ")
  public String getEmailBody() {
    return emailBody;
  }

  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public PowerForm emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   * @return emailSubject
  **/
  @ApiModelProperty(example = "null", value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public PowerForm envelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  public PowerForm addEnvelopesItem(Envelope envelopesItem) {
    this.envelopes.add(envelopesItem);
    return this;
  }

   /**
   * 
   * @return envelopes
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Envelope> getEnvelopes() {
    return envelopes;
  }

  public void setEnvelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
  }

  public PowerForm errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public PowerForm instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * 
   * @return instructions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public PowerForm isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * 
   * @return isActive
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  public PowerForm lastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * 
   * @return lastUsed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }

  public PowerForm limitUseInterval(String limitUseInterval) {
    this.limitUseInterval = limitUseInterval;
    return this;
  }

   /**
   * 
   * @return limitUseInterval
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLimitUseInterval() {
    return limitUseInterval;
  }

  public void setLimitUseInterval(String limitUseInterval) {
    this.limitUseInterval = limitUseInterval;
  }

  public PowerForm limitUseIntervalEnabled(String limitUseIntervalEnabled) {
    this.limitUseIntervalEnabled = limitUseIntervalEnabled;
    return this;
  }

   /**
   * 
   * @return limitUseIntervalEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLimitUseIntervalEnabled() {
    return limitUseIntervalEnabled;
  }

  public void setLimitUseIntervalEnabled(String limitUseIntervalEnabled) {
    this.limitUseIntervalEnabled = limitUseIntervalEnabled;
  }

  public PowerForm limitUseIntervalUnits(String limitUseIntervalUnits) {
    this.limitUseIntervalUnits = limitUseIntervalUnits;
    return this;
  }

   /**
   * 
   * @return limitUseIntervalUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLimitUseIntervalUnits() {
    return limitUseIntervalUnits;
  }

  public void setLimitUseIntervalUnits(String limitUseIntervalUnits) {
    this.limitUseIntervalUnits = limitUseIntervalUnits;
  }

  public PowerForm maxUseEnabled(String maxUseEnabled) {
    this.maxUseEnabled = maxUseEnabled;
    return this;
  }

   /**
   * 
   * @return maxUseEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaxUseEnabled() {
    return maxUseEnabled;
  }

  public void setMaxUseEnabled(String maxUseEnabled) {
    this.maxUseEnabled = maxUseEnabled;
  }

  public PowerForm name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PowerForm powerFormId(String powerFormId) {
    this.powerFormId = powerFormId;
    return this;
  }

   /**
   * 
   * @return powerFormId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPowerFormId() {
    return powerFormId;
  }

  public void setPowerFormId(String powerFormId) {
    this.powerFormId = powerFormId;
  }

  public PowerForm powerFormUrl(String powerFormUrl) {
    this.powerFormUrl = powerFormUrl;
    return this;
  }

   /**
   * 
   * @return powerFormUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPowerFormUrl() {
    return powerFormUrl;
  }

  public void setPowerFormUrl(String powerFormUrl) {
    this.powerFormUrl = powerFormUrl;
  }

  public PowerForm recipients(java.util.List<PowerFormRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PowerForm addRecipientsItem(PowerFormRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * An array of powerform recipients.
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "An array of powerform recipients.")
  public java.util.List<PowerFormRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(java.util.List<PowerFormRecipient> recipients) {
    this.recipients = recipients;
  }

  public PowerForm senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * 
   * @return senderName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public PowerForm senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

   /**
   * 
   * @return senderUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderUserId() {
    return senderUserId;
  }

  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }

  public PowerForm signingMode(String signingMode) {
    this.signingMode = signingMode;
    return this;
  }

   /**
   * 
   * @return signingMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSigningMode() {
    return signingMode;
  }

  public void setSigningMode(String signingMode) {
    this.signingMode = signingMode;
  }

  public PowerForm templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public PowerForm templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * 
   * @return templateName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public PowerForm timesUsed(String timesUsed) {
    this.timesUsed = timesUsed;
    return this;
  }

   /**
   * 
   * @return timesUsed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimesUsed() {
    return timesUsed;
  }

  public void setTimesUsed(String timesUsed) {
    this.timesUsed = timesUsed;
  }

  public PowerForm uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public PowerForm usesRemaining(String usesRemaining) {
    this.usesRemaining = usesRemaining;
    return this;
  }

   /**
   * 
   * @return usesRemaining
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUsesRemaining() {
    return usesRemaining;
  }

  public void setUsesRemaining(String usesRemaining) {
    this.usesRemaining = usesRemaining;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerForm powerForm = (PowerForm) o;
    return Objects.equals(this.createdDateTime, powerForm.createdDateTime) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(createdDateTime, emailBody, emailSubject, envelopes, errorDetails, instructions, isActive, lastUsed, limitUseInterval, limitUseIntervalEnabled, limitUseIntervalUnits, maxUseEnabled, name, powerFormId, powerFormUrl, recipients, senderName, senderUserId, signingMode, templateId, templateName, timesUsed, uri, usesRemaining);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerForm {\n");
    
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

