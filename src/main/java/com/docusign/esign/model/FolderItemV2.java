package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FolderItemV2.
 *
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

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("templateUri")
  private String templateUri = null;


  /**
   * completedDateTime.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 completedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
    return this;
  }

  /**
   * Specifies the date and time this item was completed..
   * @return completedDateTime
   **/
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  public String getCompletedDateTime() {
    return completedDateTime;
  }

  /**
   * setCompletedDateTime.
   **/
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }


  /**
   * createdDateTime.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
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
   * envelopeId.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * envelopeUri.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes..
   * @return envelopeUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  /**
   * setEnvelopeUri.
   **/
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }


  /**
   * expireDateTime.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 expireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
    return this;
  }

  /**
   * The date and time the envelope is set to expire..
   * @return expireDateTime
   **/
  @ApiModelProperty(value = "The date and time the envelope is set to expire.")
  public String getExpireDateTime() {
    return expireDateTime;
  }

  /**
   * setExpireDateTime.
   **/
  public void setExpireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
  }


  /**
   * folderId.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * .
   * @return folderId
   **/
  @ApiModelProperty(value = "")
  public String getFolderId() {
    return folderId;
  }

  /**
   * setFolderId.
   **/
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  /**
   * folderUri.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

  /**
   * .
   * @return folderUri
   **/
  @ApiModelProperty(value = "")
  public String getFolderUri() {
    return folderUri;
  }

  /**
   * setFolderUri.
   **/
  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }


  /**
   * is21CFRPart11.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

  /**
   * When set to **true**, indicates that this module is enabled on the account..
   * @return is21CFRPart11
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  /**
   * setIs21CFRPart11.
   **/
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }


  /**
   * lastModifiedDateTime.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  /**
   * The date and time the item was last modified..
   * @return lastModifiedDateTime
   **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  /**
   * setLastModifiedDateTime.
   **/
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  /**
   * ownerName.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * .
   * @return ownerName
   **/
  @ApiModelProperty(value = "")
  public String getOwnerName() {
    return ownerName;
  }

  /**
   * setOwnerName.
   **/
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  /**
   * recipients.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 recipients(Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * Get recipients.
   * @return recipients
   **/
  @ApiModelProperty(value = "")
  public Recipients getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(Recipients recipients) {
    this.recipients = recipients;
  }


  /**
   * recipientsUri.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 recipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the recipients..
   * @return recipientsUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
  public String getRecipientsUri() {
    return recipientsUri;
  }

  /**
   * setRecipientsUri.
   **/
  public void setRecipientsUri(String recipientsUri) {
    this.recipientsUri = recipientsUri;
  }


  /**
   * senderCompany.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 senderCompany(String senderCompany) {
    this.senderCompany = senderCompany;
    return this;
  }

  /**
   * .
   * @return senderCompany
   **/
  @ApiModelProperty(value = "")
  public String getSenderCompany() {
    return senderCompany;
  }

  /**
   * setSenderCompany.
   **/
  public void setSenderCompany(String senderCompany) {
    this.senderCompany = senderCompany;
  }


  /**
   * senderEmail.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

  /**
   * .
   * @return senderEmail
   **/
  @ApiModelProperty(value = "")
  public String getSenderEmail() {
    return senderEmail;
  }

  /**
   * setSenderEmail.
   **/
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  /**
   * senderName.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * .
   * @return senderName
   **/
  @ApiModelProperty(value = "")
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
   * @return FolderItemV2
   **/
  public FolderItemV2 senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

  /**
   * .
   * @return senderUserId
   **/
  @ApiModelProperty(value = "")
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
   * sentDateTime.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

  /**
   * The date and time the envelope was sent..
   * @return sentDateTime
   **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  /**
   * setSentDateTime.
   **/
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }


  /**
   * status.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * subject.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * .
   * @return subject
   **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  /**
   * setSubject.
   **/
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * templateId.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
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
   * templateUri.
   *
   * @return FolderItemV2
   **/
  public FolderItemV2 templateUri(String templateUri) {
    this.templateUri = templateUri;
    return this;
  }

  /**
   * .
   * @return templateUri
   **/
  @ApiModelProperty(value = "")
  public String getTemplateUri() {
    return templateUri;
  }

  /**
   * setTemplateUri.
   **/
  public void setTemplateUri(String templateUri) {
    this.templateUri = templateUri;
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
    FolderItemV2 folderItemV2 = (FolderItemV2) o;
    return Objects.equals(this.completedDateTime, folderItemV2.completedDateTime) &&
        Objects.equals(this.createdDateTime, folderItemV2.createdDateTime) &&
        Objects.equals(this.envelopeId, folderItemV2.envelopeId) &&
        Objects.equals(this.envelopeUri, folderItemV2.envelopeUri) &&
        Objects.equals(this.expireDateTime, folderItemV2.expireDateTime) &&
        Objects.equals(this.folderId, folderItemV2.folderId) &&
        Objects.equals(this.folderUri, folderItemV2.folderUri) &&
        Objects.equals(this.is21CFRPart11, folderItemV2.is21CFRPart11) &&
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
        Objects.equals(this.subject, folderItemV2.subject) &&
        Objects.equals(this.templateId, folderItemV2.templateId) &&
        Objects.equals(this.templateUri, folderItemV2.templateUri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(completedDateTime, createdDateTime, envelopeId, envelopeUri, expireDateTime, folderId, folderUri, is21CFRPart11, lastModifiedDateTime, ownerName, recipients, recipientsUri, senderCompany, senderEmail, senderName, senderUserId, sentDateTime, status, subject, templateId, templateUri);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
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

