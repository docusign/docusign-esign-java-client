package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Recipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class FolderItemV2   {
  
  private String ownerName = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private String status = null;
  private String lastModifiedDateTime = null;
  private String senderUserId = null;
  private String senderName = null;
  private String senderEmail = null;
  private String senderCompany = null;
  private String createdDateTime = null;
  private String sentDateTime = null;
  private String completedDateTime = null;
  private String subject = null;
  private String expireDateTime = null;
  private String folderId = null;
  private String folderUri = null;
  private Recipients recipients = null;
  private String recipientsUri = null;
  private String is21CFRPart11 = null;

  
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
  @JsonProperty("senderCompany")
  public String getSenderCompany() {
    return senderCompany;
  }
  public void setSenderCompany(String senderCompany) {
    this.senderCompany = senderCompany;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderItemV2 folderItemV2 = (FolderItemV2) o;

    return true && Objects.equals(ownerName, folderItemV2.ownerName) &&
        Objects.equals(envelopeId, folderItemV2.envelopeId) &&
        Objects.equals(envelopeUri, folderItemV2.envelopeUri) &&
        Objects.equals(status, folderItemV2.status) &&
        Objects.equals(lastModifiedDateTime, folderItemV2.lastModifiedDateTime) &&
        Objects.equals(senderUserId, folderItemV2.senderUserId) &&
        Objects.equals(senderName, folderItemV2.senderName) &&
        Objects.equals(senderEmail, folderItemV2.senderEmail) &&
        Objects.equals(senderCompany, folderItemV2.senderCompany) &&
        Objects.equals(createdDateTime, folderItemV2.createdDateTime) &&
        Objects.equals(sentDateTime, folderItemV2.sentDateTime) &&
        Objects.equals(completedDateTime, folderItemV2.completedDateTime) &&
        Objects.equals(subject, folderItemV2.subject) &&
        Objects.equals(expireDateTime, folderItemV2.expireDateTime) &&
        Objects.equals(folderId, folderItemV2.folderId) &&
        Objects.equals(folderUri, folderItemV2.folderUri) &&
        Objects.equals(recipients, folderItemV2.recipients) &&
        Objects.equals(recipientsUri, folderItemV2.recipientsUri) &&
        Objects.equals(is21CFRPart11, folderItemV2.is21CFRPart11)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName, envelopeId, envelopeUri, status, lastModifiedDateTime, senderUserId, senderName, senderEmail, senderCompany, createdDateTime, sentDateTime, completedDateTime, subject, expireDateTime, folderId, folderUri, recipients, recipientsUri, is21CFRPart11);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemV2 {\n");
    
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderCompany: ").append(toIndentedString(senderCompany)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
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

