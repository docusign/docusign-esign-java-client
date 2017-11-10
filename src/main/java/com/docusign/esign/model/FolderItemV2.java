package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FolderItemV2
 */

public class FolderItemV2 {
  @JsonProperty("completedDateTime")
  private String completedDateTime = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeUri")
  private String envelopeUri = null;

  @JsonProperty("expireDateTime")
  private String expireDateTime = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("folderUri")
  private String folderUri = null;

  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("isSignatureProviderEnvelope")
  private String isSignatureProviderEnvelope = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  @JsonProperty("recipients")
  private Recipients recipients = null;

  @JsonProperty("recipientsUri")
  private String recipientsUri = null;

  @JsonProperty("senderCompany")
  private String senderCompany = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("subject")
  private String subject = null;

  public FolderItemV2 completedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
    return this;
  }

   /**
   * Specifies the date and time this item was completed.
   * @return completedDateTime
  **/
  @ApiModelProperty(example = "null", value = "Specifies the date and time this item was completed.")
  public String getCompletedDateTime() {
    return completedDateTime;
  }

  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  public FolderItemV2 createdDateTime(String createdDateTime) {
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

  public FolderItemV2 envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public FolderItemV2 envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   * @return envelopeUri
  **/
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  public FolderItemV2 expireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
    return this;
  }

   /**
   * The date and time the envelope is set to expire.
   * @return expireDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the envelope is set to expire.")
  public String getExpireDateTime() {
    return expireDateTime;
  }

  public void setExpireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
  }

  public FolderItemV2 folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * 
   * @return folderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public FolderItemV2 folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

   /**
   * 
   * @return folderUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFolderUri() {
    return folderUri;
  }

  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  public FolderItemV2 is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

   /**
   * When set to **true**, indicates that this module is enabled on the account.
   * @return is21CFRPart11
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  public FolderItemV2 isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    return this;
  }

   /**
   * 
   * @return isSignatureProviderEnvelope
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }

  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }

  public FolderItemV2 lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the item was last modified.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public FolderItemV2 ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * 
   * @return ownerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public FolderItemV2 recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "")
  public Recipients getRecipients() {
    return recipients;
  }

  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  public FolderItemV2 recipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the recipients.
   * @return recipientsUri
  **/
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
  public String getRecipientsUri() {
    return recipientsUri;
  }

  public void setRecipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
  }

  public FolderItemV2 senderCompany(String senderCompany) {
    this.senderCompany = senderCompany;
    return this;
  }

   /**
   * 
   * @return senderCompany
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderCompany() {
    return senderCompany;
  }

  public void setSenderCompany(String senderCompany) {
    this.senderCompany = senderCompany;
  }

  public FolderItemV2 senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * 
   * @return senderEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public FolderItemV2 senderName(String senderName) {
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

  public FolderItemV2 senderUserId(String senderUserId) {
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

  public FolderItemV2 sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public FolderItemV2 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FolderItemV2 subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * 
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderItemV2 folderItemV2 = (FolderItemV2) o;
    return Objects.equals(this.completedDateTime, folderItemV2.completedDateTime) &&
        Objects.equals(this.createdDateTime, folderItemV2.createdDateTime) &&
        Objects.equals(this.envelopeId, folderItemV2.envelopeId) &&
        Objects.equals(this.envelopeUri, folderItemV2.envelopeUri) &&
        Objects.equals(this.expireDateTime, folderItemV2.expireDateTime) &&
        Objects.equals(this.folderId, folderItemV2.folderId) &&
        Objects.equals(this.folderUri, folderItemV2.folderUri) &&
        Objects.equals(this.is21CFRPart11, folderItemV2.is21CFRPart11) &&
        Objects.equals(this.isSignatureProviderEnvelope, folderItemV2.isSignatureProviderEnvelope) &&
        Objects.equals(this.lastModifiedDateTime, folderItemV2.lastModifiedDateTime) &&
        Objects.equals(this.ownerName, folderItemV2.ownerName) &&
        Objects.equals(this.recipients, folderItemV2.recipients) &&
        Objects.equals(this.recipientsUri, folderItemV2.recipientsUri) &&
        Objects.equals(this.senderCompany, folderItemV2.senderCompany) &&
        Objects.equals(this.senderEmail, folderItemV2.senderEmail) &&
        Objects.equals(this.senderName, folderItemV2.senderName) &&
        Objects.equals(this.senderUserId, folderItemV2.senderUserId) &&
        Objects.equals(this.sentDateTime, folderItemV2.sentDateTime) &&
        Objects.equals(this.status, folderItemV2.status) &&
        Objects.equals(this.subject, folderItemV2.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedDateTime, createdDateTime, envelopeId, envelopeUri, expireDateTime, folderId, folderUri, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, ownerName, recipients, recipientsUri, senderCompany, senderEmail, senderName, senderUserId, sentDateTime, status, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemV2 {\n");
    
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    sb.append("    senderCompany: ").append(toIndentedString(senderCompany)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

