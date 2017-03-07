package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.PowerFormRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PowerForm   {
  
  private String createdDateTime = null;
  private String emailBody = null;
  private String emailSubject = null;
  private java.util.List<Envelope> envelopes = new java.util.ArrayList<Envelope>();
  private ErrorDetails errorDetails = null;
  private String instructions = null;
  private String isActive = null;
  private String lastUsed = null;
  private String limitUseInterval = null;
  private String limitUseIntervalEnabled = null;
  private String limitUseIntervalUnits = null;
  private String maxUseEnabled = null;
  private String name = null;
  private String powerFormId = null;
  private String powerFormUrl = null;
  private java.util.List<PowerFormRecipient> recipients = new java.util.ArrayList<PowerFormRecipient>();
  private String senderName = null;
  private String senderUserId = null;
  private String signingMode = null;
  private String templateId = null;
  private String templateName = null;
  private String timesUsed = null;
  private String uri = null;
  private String usesRemaining = null;

  
  /**
   * Indicates the date and time the item was created.
   **/
  
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters.
   **/
  
  @ApiModelProperty(value = "Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters.")
  @JsonProperty("emailBody")
  public String getEmailBody() {
    return emailBody;
  }
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  
  /**
   * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   **/
  
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  @JsonProperty("emailSubject")
  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopes")
  public java.util.List<Envelope> getEnvelopes() {
    return envelopes;
  }
  public void setEnvelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
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
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isActive")
  public String getIsActive() {
    return isActive;
  }
  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastUsed")
  public String getLastUsed() {
    return lastUsed;
  }
  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limitUseInterval")
  public String getLimitUseInterval() {
    return limitUseInterval;
  }
  public void setLimitUseInterval(String limitUseInterval) {
    this.limitUseInterval = limitUseInterval;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limitUseIntervalEnabled")
  public String getLimitUseIntervalEnabled() {
    return limitUseIntervalEnabled;
  }
  public void setLimitUseIntervalEnabled(String limitUseIntervalEnabled) {
    this.limitUseIntervalEnabled = limitUseIntervalEnabled;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limitUseIntervalUnits")
  public String getLimitUseIntervalUnits() {
    return limitUseIntervalUnits;
  }
  public void setLimitUseIntervalUnits(String limitUseIntervalUnits) {
    this.limitUseIntervalUnits = limitUseIntervalUnits;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxUseEnabled")
  public String getMaxUseEnabled() {
    return maxUseEnabled;
  }
  public void setMaxUseEnabled(String maxUseEnabled) {
    this.maxUseEnabled = maxUseEnabled;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("powerFormId")
  public String getPowerFormId() {
    return powerFormId;
  }
  public void setPowerFormId(String powerFormId) {
    this.powerFormId = powerFormId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("powerFormUrl")
  public String getPowerFormUrl() {
    return powerFormUrl;
  }
  public void setPowerFormUrl(String powerFormUrl) {
    this.powerFormUrl = powerFormUrl;
  }

  
  /**
   * An array of powerform recipients.
   **/
  
  @ApiModelProperty(value = "An array of powerform recipients.")
  @JsonProperty("recipients")
  public java.util.List<PowerFormRecipient> getRecipients() {
    return recipients;
  }
  public void setRecipients(java.util.List<PowerFormRecipient> recipients) {
    this.recipients = recipients;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderName")
  public String getSenderName() {
    return senderName;
  }
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderUserId")
  public String getSenderUserId() {
    return senderUserId;
  }
  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signingMode")
  public String getSigningMode() {
    return signingMode;
  }
  public void setSigningMode(String signingMode) {
    this.signingMode = signingMode;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templateName")
  public String getTemplateName() {
    return templateName;
  }
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timesUsed")
  public String getTimesUsed() {
    return timesUsed;
  }
  public void setTimesUsed(String timesUsed) {
    this.timesUsed = timesUsed;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usesRemaining")
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

    return true && Objects.equals(createdDateTime, powerForm.createdDateTime) &&
        Objects.equals(emailBody, powerForm.emailBody) &&
        Objects.equals(emailSubject, powerForm.emailSubject) &&
        Objects.equals(envelopes, powerForm.envelopes) &&
        Objects.equals(errorDetails, powerForm.errorDetails) &&
        Objects.equals(instructions, powerForm.instructions) &&
        Objects.equals(isActive, powerForm.isActive) &&
        Objects.equals(lastUsed, powerForm.lastUsed) &&
        Objects.equals(limitUseInterval, powerForm.limitUseInterval) &&
        Objects.equals(limitUseIntervalEnabled, powerForm.limitUseIntervalEnabled) &&
        Objects.equals(limitUseIntervalUnits, powerForm.limitUseIntervalUnits) &&
        Objects.equals(maxUseEnabled, powerForm.maxUseEnabled) &&
        Objects.equals(name, powerForm.name) &&
        Objects.equals(powerFormId, powerForm.powerFormId) &&
        Objects.equals(powerFormUrl, powerForm.powerFormUrl) &&
        Objects.equals(recipients, powerForm.recipients) &&
        Objects.equals(senderName, powerForm.senderName) &&
        Objects.equals(senderUserId, powerForm.senderUserId) &&
        Objects.equals(signingMode, powerForm.signingMode) &&
        Objects.equals(templateId, powerForm.templateId) &&
        Objects.equals(templateName, powerForm.templateName) &&
        Objects.equals(timesUsed, powerForm.timesUsed) &&
        Objects.equals(uri, powerForm.uri) &&
        Objects.equals(usesRemaining, powerForm.usesRemaining)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDateTime, emailBody, emailSubject, envelopes, errorDetails, instructions, isActive, lastUsed, limitUseInterval, limitUseIntervalEnabled, limitUseIntervalUnits, maxUseEnabled, name, powerFormId, powerFormUrl, recipients, senderName, senderUserId, signingMode, templateId, templateName, timesUsed, uri, usesRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerForm {\n");
    
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (emailBody != null)
      sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    if (emailSubject != null)
      sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    if (envelopes != null)
      sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (instructions != null)
      sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    if (isActive != null)
      sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    if (lastUsed != null)
      sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    if (limitUseInterval != null)
      sb.append("    limitUseInterval: ").append(toIndentedString(limitUseInterval)).append("\n");
    if (limitUseIntervalEnabled != null)
      sb.append("    limitUseIntervalEnabled: ").append(toIndentedString(limitUseIntervalEnabled)).append("\n");
    if (limitUseIntervalUnits != null)
      sb.append("    limitUseIntervalUnits: ").append(toIndentedString(limitUseIntervalUnits)).append("\n");
    if (maxUseEnabled != null)
      sb.append("    maxUseEnabled: ").append(toIndentedString(maxUseEnabled)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (powerFormId != null)
      sb.append("    powerFormId: ").append(toIndentedString(powerFormId)).append("\n");
    if (powerFormUrl != null)
      sb.append("    powerFormUrl: ").append(toIndentedString(powerFormUrl)).append("\n");
    if (recipients != null)
      sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    if (senderName != null)
      sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    if (senderUserId != null)
      sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    if (signingMode != null)
      sb.append("    signingMode: ").append(toIndentedString(signingMode)).append("\n");
    if (templateId != null)
      sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    if (templateName != null)
      sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    if (timesUsed != null)
      sb.append("    timesUsed: ").append(toIndentedString(timesUsed)).append("\n");
    if (uri != null)
      sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    if (usesRemaining != null)
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

