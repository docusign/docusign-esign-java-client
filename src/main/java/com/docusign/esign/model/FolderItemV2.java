package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class FolderItemV2   {
  
  private String completedDateTime = null;
  private String createdDateTime = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private String expireDateTime = null;
  private String folderId = null;
  private String folderUri = null;
  private String is21CFRPart11 = null;
  private String isSignatureProviderEnvelope = null;
  private String lastModifiedDateTime = null;
  private String ownerName = null;
  private Recipients recipients = null;
  private String recipientsUri = null;
  private String senderCompany = null;
  private String senderEmail = null;
  private String senderName = null;
  private String senderUserId = null;
  private String sentDateTime = null;
  private String status = null;
  private String subject = null;

  
  /**
   * Specifies the date and time this item was completed.
   **/
  
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  @JsonProperty("completedDateTime")
  public String getCompletedDateTime() {
    return completedDateTime;
  }
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  
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
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  @JsonProperty("envelopeUri")
  public String getEnvelopeUri() {
    return envelopeUri;
  }
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  
  /**
   * The date and time the envelope is set to expire.
   **/
  
  @ApiModelProperty(value = "The date and time the envelope is set to expire.")
  @JsonProperty("expireDateTime")
  public String getExpireDateTime() {
    return expireDateTime;
  }
  public void setExpireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folderId")
  public String getFolderId() {
    return folderId;
  }
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folderUri")
  public String getFolderUri() {
    return folderUri;
  }
  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  
  /**
   * When set to **true**, indicates that this module is enabled on the account.
   **/
  
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  @JsonProperty("is21CFRPart11")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isSignatureProviderEnvelope")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }
  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }

  
  /**
   * The date and time the item was last modified.
   **/
  
  @ApiModelProperty(value = "The date and time the item was last modified.")
  @JsonProperty("lastModifiedDateTime")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerName")
  public String getOwnerName() {
    return ownerName;
  }
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipients")
  public Recipients getRecipients() {
    return recipients;
  }
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the recipients.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
  @JsonProperty("recipientsUri")
  public String getRecipientsUri() {
    return recipientsUri;
  }
  public void setRecipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderCompany")
  public String getSenderCompany() {
    return senderCompany;
  }
  public void setSenderCompany(String senderCompany) {
    this.senderCompany = senderCompany;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderEmail")
  public String getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
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
   * The date and time the envelope was sent.
   **/
  
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  @JsonProperty("sentDateTime")
  public String getSentDateTime() {
    return sentDateTime;
  }
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
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

    return true && Objects.equals(completedDateTime, folderItemV2.completedDateTime) &&
        Objects.equals(createdDateTime, folderItemV2.createdDateTime) &&
        Objects.equals(envelopeId, folderItemV2.envelopeId) &&
        Objects.equals(envelopeUri, folderItemV2.envelopeUri) &&
        Objects.equals(expireDateTime, folderItemV2.expireDateTime) &&
        Objects.equals(folderId, folderItemV2.folderId) &&
        Objects.equals(folderUri, folderItemV2.folderUri) &&
        Objects.equals(is21CFRPart11, folderItemV2.is21CFRPart11) &&
        Objects.equals(isSignatureProviderEnvelope, folderItemV2.isSignatureProviderEnvelope) &&
        Objects.equals(lastModifiedDateTime, folderItemV2.lastModifiedDateTime) &&
        Objects.equals(ownerName, folderItemV2.ownerName) &&
        Objects.equals(recipients, folderItemV2.recipients) &&
        Objects.equals(recipientsUri, folderItemV2.recipientsUri) &&
        Objects.equals(senderCompany, folderItemV2.senderCompany) &&
        Objects.equals(senderEmail, folderItemV2.senderEmail) &&
        Objects.equals(senderName, folderItemV2.senderName) &&
        Objects.equals(senderUserId, folderItemV2.senderUserId) &&
        Objects.equals(sentDateTime, folderItemV2.sentDateTime) &&
        Objects.equals(status, folderItemV2.status) &&
        Objects.equals(subject, folderItemV2.subject)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedDateTime, createdDateTime, envelopeId, envelopeUri, expireDateTime, folderId, folderUri, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, ownerName, recipients, recipientsUri, senderCompany, senderEmail, senderName, senderUserId, sentDateTime, status, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemV2 {\n");
    
    if (completedDateTime != null)
      sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (envelopeUri != null)
      sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    if (expireDateTime != null)
      sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
    if (folderId != null)
      sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    if (folderUri != null)
      sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    if (is21CFRPart11 != null)
      sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    if (isSignatureProviderEnvelope != null)
      sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    if (lastModifiedDateTime != null)
      sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    if (ownerName != null)
      sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    if (recipients != null)
      sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    if (recipientsUri != null)
      sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    if (senderCompany != null)
      sb.append("    senderCompany: ").append(toIndentedString(senderCompany)).append("\n");
    if (senderEmail != null)
      sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    if (senderName != null)
      sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    if (senderUserId != null)
      sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    if (sentDateTime != null)
      sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (subject != null)
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

