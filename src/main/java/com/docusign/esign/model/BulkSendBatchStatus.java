package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendErrorStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendBatchStatus
 */

public class BulkSendBatchStatus {
  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("batchName")
  private String batchName = null;

  @JsonProperty("batchSize")
  private String batchSize = null;

  @JsonProperty("bulkErrors")
  private java.util.List<BulkSendErrorStatus> bulkErrors = null;

  @JsonProperty("envelopeIdOrTemplateId")
  private String envelopeIdOrTemplateId = null;

  @JsonProperty("envelopesUri")
  private String envelopesUri = null;

  @JsonProperty("failed")
  private String failed = null;

  @JsonProperty("mailingListId")
  private String mailingListId = null;

  @JsonProperty("ownerUserId")
  private String ownerUserId = null;

  @JsonProperty("queued")
  private String queued = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("submittedDate")
  private String submittedDate = null;

  public BulkSendBatchStatus batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * 
   * @return batchId
  **/
  @ApiModelProperty(value = "")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public BulkSendBatchStatus batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

   /**
   * 
   * @return batchName
  **/
  @ApiModelProperty(value = "")
  public String getBatchName() {
    return batchName;
  }

  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }

  public BulkSendBatchStatus batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * 
   * @return batchSize
  **/
  @ApiModelProperty(value = "")
  public String getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }

  public BulkSendBatchStatus bulkErrors(java.util.List<BulkSendErrorStatus> bulkErrors) {
    this.bulkErrors = bulkErrors;
    return this;
  }

  public BulkSendBatchStatus addBulkErrorsItem(BulkSendErrorStatus bulkErrorsItem) {
    if (this.bulkErrors == null) {
      this.bulkErrors = new java.util.ArrayList<BulkSendErrorStatus>();
    }
    this.bulkErrors.add(bulkErrorsItem);
    return this;
  }

   /**
   * 
   * @return bulkErrors
  **/
  @ApiModelProperty(value = "")
  public java.util.List<BulkSendErrorStatus> getBulkErrors() {
    return bulkErrors;
  }

  public void setBulkErrors(java.util.List<BulkSendErrorStatus> bulkErrors) {
    this.bulkErrors = bulkErrors;
  }

  public BulkSendBatchStatus envelopeIdOrTemplateId(String envelopeIdOrTemplateId) {
    this.envelopeIdOrTemplateId = envelopeIdOrTemplateId;
    return this;
  }

   /**
   * 
   * @return envelopeIdOrTemplateId
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeIdOrTemplateId() {
    return envelopeIdOrTemplateId;
  }

  public void setEnvelopeIdOrTemplateId(String envelopeIdOrTemplateId) {
    this.envelopeIdOrTemplateId = envelopeIdOrTemplateId;
  }

  public BulkSendBatchStatus envelopesUri(String envelopesUri) {
    this.envelopesUri = envelopesUri;
    return this;
  }

   /**
   * 
   * @return envelopesUri
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopesUri() {
    return envelopesUri;
  }

  public void setEnvelopesUri(String envelopesUri) {
    this.envelopesUri = envelopesUri;
  }

  public BulkSendBatchStatus failed(String failed) {
    this.failed = failed;
    return this;
  }

   /**
   * 
   * @return failed
  **/
  @ApiModelProperty(value = "")
  public String getFailed() {
    return failed;
  }

  public void setFailed(String failed) {
    this.failed = failed;
  }

  public BulkSendBatchStatus mailingListId(String mailingListId) {
    this.mailingListId = mailingListId;
    return this;
  }

   /**
   * 
   * @return mailingListId
  **/
  @ApiModelProperty(value = "")
  public String getMailingListId() {
    return mailingListId;
  }

  public void setMailingListId(String mailingListId) {
    this.mailingListId = mailingListId;
  }

  public BulkSendBatchStatus ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * 
   * @return ownerUserId
  **/
  @ApiModelProperty(value = "")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public BulkSendBatchStatus queued(String queued) {
    this.queued = queued;
    return this;
  }

   /**
   * 
   * @return queued
  **/
  @ApiModelProperty(value = "")
  public String getQueued() {
    return queued;
  }

  public void setQueued(String queued) {
    this.queued = queued;
  }

  public BulkSendBatchStatus senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

   /**
   * 
   * @return senderUserId
  **/
  @ApiModelProperty(value = "")
  public String getSenderUserId() {
    return senderUserId;
  }

  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }

  public BulkSendBatchStatus sent(String sent) {
    this.sent = sent;
    return this;
  }

   /**
   * 
   * @return sent
  **/
  @ApiModelProperty(value = "")
  public String getSent() {
    return sent;
  }

  public void setSent(String sent) {
    this.sent = sent;
  }

  public BulkSendBatchStatus submittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }

   /**
   * 
   * @return submittedDate
  **/
  @ApiModelProperty(value = "")
  public String getSubmittedDate() {
    return submittedDate;
  }

  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendBatchStatus bulkSendBatchStatus = (BulkSendBatchStatus) o;
    return Objects.equals(this.batchId, bulkSendBatchStatus.batchId) &&
        Objects.equals(this.batchName, bulkSendBatchStatus.batchName) &&
        Objects.equals(this.batchSize, bulkSendBatchStatus.batchSize) &&
        Objects.equals(this.bulkErrors, bulkSendBatchStatus.bulkErrors) &&
        Objects.equals(this.envelopeIdOrTemplateId, bulkSendBatchStatus.envelopeIdOrTemplateId) &&
        Objects.equals(this.envelopesUri, bulkSendBatchStatus.envelopesUri) &&
        Objects.equals(this.failed, bulkSendBatchStatus.failed) &&
        Objects.equals(this.mailingListId, bulkSendBatchStatus.mailingListId) &&
        Objects.equals(this.ownerUserId, bulkSendBatchStatus.ownerUserId) &&
        Objects.equals(this.queued, bulkSendBatchStatus.queued) &&
        Objects.equals(this.senderUserId, bulkSendBatchStatus.senderUserId) &&
        Objects.equals(this.sent, bulkSendBatchStatus.sent) &&
        Objects.equals(this.submittedDate, bulkSendBatchStatus.submittedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchName, batchSize, bulkErrors, envelopeIdOrTemplateId, envelopesUri, failed, mailingListId, ownerUserId, queued, senderUserId, sent, submittedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchStatus {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    bulkErrors: ").append(toIndentedString(bulkErrors)).append("\n");
    sb.append("    envelopeIdOrTemplateId: ").append(toIndentedString(envelopeIdOrTemplateId)).append("\n");
    sb.append("    envelopesUri: ").append(toIndentedString(envelopesUri)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    mailingListId: ").append(toIndentedString(mailingListId)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
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

