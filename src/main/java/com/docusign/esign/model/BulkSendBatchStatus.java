package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendEnvelopesInfo;
import com.docusign.esign.model.BulkSendErrorStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendBatchStatus.
 *
 */

public class BulkSendBatchStatus {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("actionStatus")
  private String actionStatus = null;

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

  @JsonProperty("envelopesInfo")
  private BulkSendEnvelopesInfo envelopesInfo = null;

  @JsonProperty("envelopesUri")
  private String envelopesUri = null;

  @JsonProperty("failed")
  private String failed = null;

  @JsonProperty("mailingListId")
  private String mailingListId = null;

  @JsonProperty("mailingListName")
  private String mailingListName = null;

  @JsonProperty("ownerUserId")
  private String ownerUserId = null;

  @JsonProperty("queued")
  private String queued = null;

  @JsonProperty("resendsRemaining")
  private String resendsRemaining = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("submittedDate")
  private String submittedDate = null;


  /**
   * action.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus action(String action) {
    this.action = action;
    return this;
  }

  /**
   * .
   * @return action
   **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * actionStatus.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

  /**
   * .
   * @return actionStatus
   **/
  @ApiModelProperty(value = "")
  public String getActionStatus() {
    return actionStatus;
  }

  /**
   * setActionStatus.
   **/
  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }


  /**
   * batchId.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * .
   * @return batchId
   **/
  @ApiModelProperty(value = "")
  public String getBatchId() {
    return batchId;
  }

  /**
   * setBatchId.
   **/
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  /**
   * batchName.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * .
   * @return batchName
   **/
  @ApiModelProperty(value = "")
  public String getBatchName() {
    return batchName;
  }

  /**
   * setBatchName.
   **/
  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


  /**
   * batchSize.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * .
   * @return batchSize
   **/
  @ApiModelProperty(value = "")
  public String getBatchSize() {
    return batchSize;
  }

  /**
   * setBatchSize.
   **/
  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }


  /**
   * bulkErrors.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus bulkErrors(java.util.List<BulkSendErrorStatus> bulkErrors) {
    this.bulkErrors = bulkErrors;
    return this;
  }
  
  /**
   * addBulkErrorsItem.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus addBulkErrorsItem(BulkSendErrorStatus bulkErrorsItem) {
    if (this.bulkErrors == null) {
      this.bulkErrors = new java.util.ArrayList<>();
    }
    this.bulkErrors.add(bulkErrorsItem);
    return this;
  }

  /**
   * .
   * @return bulkErrors
   **/
  @ApiModelProperty(value = "")
  public java.util.List<BulkSendErrorStatus> getBulkErrors() {
    return bulkErrors;
  }

  /**
   * setBulkErrors.
   **/
  public void setBulkErrors(java.util.List<BulkSendErrorStatus> bulkErrors) {
    this.bulkErrors = bulkErrors;
  }


  /**
   * envelopeIdOrTemplateId.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus envelopeIdOrTemplateId(String envelopeIdOrTemplateId) {
    this.envelopeIdOrTemplateId = envelopeIdOrTemplateId;
    return this;
  }

  /**
   * .
   * @return envelopeIdOrTemplateId
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopeIdOrTemplateId() {
    return envelopeIdOrTemplateId;
  }

  /**
   * setEnvelopeIdOrTemplateId.
   **/
  public void setEnvelopeIdOrTemplateId(String envelopeIdOrTemplateId) {
    this.envelopeIdOrTemplateId = envelopeIdOrTemplateId;
  }


  /**
   * envelopesInfo.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus envelopesInfo(BulkSendEnvelopesInfo envelopesInfo) {
    this.envelopesInfo = envelopesInfo;
    return this;
  }

  /**
   * Get envelopesInfo.
   * @return envelopesInfo
   **/
  @ApiModelProperty(value = "")
  public BulkSendEnvelopesInfo getEnvelopesInfo() {
    return envelopesInfo;
  }

  /**
   * setEnvelopesInfo.
   **/
  public void setEnvelopesInfo(BulkSendEnvelopesInfo envelopesInfo) {
    this.envelopesInfo = envelopesInfo;
  }


  /**
   * envelopesUri.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus envelopesUri(String envelopesUri) {
    this.envelopesUri = envelopesUri;
    return this;
  }

  /**
   * .
   * @return envelopesUri
   **/
  @ApiModelProperty(value = "")
  public String getEnvelopesUri() {
    return envelopesUri;
  }

  /**
   * setEnvelopesUri.
   **/
  public void setEnvelopesUri(String envelopesUri) {
    this.envelopesUri = envelopesUri;
  }


  /**
   * failed.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus failed(String failed) {
    this.failed = failed;
    return this;
  }

  /**
   * .
   * @return failed
   **/
  @ApiModelProperty(value = "")
  public String getFailed() {
    return failed;
  }

  /**
   * setFailed.
   **/
  public void setFailed(String failed) {
    this.failed = failed;
  }


  /**
   * mailingListId.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus mailingListId(String mailingListId) {
    this.mailingListId = mailingListId;
    return this;
  }

  /**
   * .
   * @return mailingListId
   **/
  @ApiModelProperty(value = "")
  public String getMailingListId() {
    return mailingListId;
  }

  /**
   * setMailingListId.
   **/
  public void setMailingListId(String mailingListId) {
    this.mailingListId = mailingListId;
  }


  /**
   * mailingListName.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus mailingListName(String mailingListName) {
    this.mailingListName = mailingListName;
    return this;
  }

  /**
   * .
   * @return mailingListName
   **/
  @ApiModelProperty(value = "")
  public String getMailingListName() {
    return mailingListName;
  }

  /**
   * setMailingListName.
   **/
  public void setMailingListName(String mailingListName) {
    this.mailingListName = mailingListName;
  }


  /**
   * ownerUserId.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  /**
   * .
   * @return ownerUserId
   **/
  @ApiModelProperty(value = "")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  /**
   * setOwnerUserId.
   **/
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }


  /**
   * queued.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus queued(String queued) {
    this.queued = queued;
    return this;
  }

  /**
   * .
   * @return queued
   **/
  @ApiModelProperty(value = "")
  public String getQueued() {
    return queued;
  }

  /**
   * setQueued.
   **/
  public void setQueued(String queued) {
    this.queued = queued;
  }


  /**
   * resendsRemaining.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus resendsRemaining(String resendsRemaining) {
    this.resendsRemaining = resendsRemaining;
    return this;
  }

  /**
   * .
   * @return resendsRemaining
   **/
  @ApiModelProperty(value = "")
  public String getResendsRemaining() {
    return resendsRemaining;
  }

  /**
   * setResendsRemaining.
   **/
  public void setResendsRemaining(String resendsRemaining) {
    this.resendsRemaining = resendsRemaining;
  }


  /**
   * senderUserId.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus senderUserId(String senderUserId) {
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
   * sent.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus sent(String sent) {
    this.sent = sent;
    return this;
  }

  /**
   * .
   * @return sent
   **/
  @ApiModelProperty(value = "")
  public String getSent() {
    return sent;
  }

  /**
   * setSent.
   **/
  public void setSent(String sent) {
    this.sent = sent;
  }


  /**
   * submittedDate.
   *
   * @return BulkSendBatchStatus
   **/
  public BulkSendBatchStatus submittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }

  /**
   * .
   * @return submittedDate
   **/
  @ApiModelProperty(value = "")
  public String getSubmittedDate() {
    return submittedDate;
  }

  /**
   * setSubmittedDate.
   **/
  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
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
    BulkSendBatchStatus bulkSendBatchStatus = (BulkSendBatchStatus) o;
    return Objects.equals(this.action, bulkSendBatchStatus.action) &&
        Objects.equals(this.actionStatus, bulkSendBatchStatus.actionStatus) &&
        Objects.equals(this.batchId, bulkSendBatchStatus.batchId) &&
        Objects.equals(this.batchName, bulkSendBatchStatus.batchName) &&
        Objects.equals(this.batchSize, bulkSendBatchStatus.batchSize) &&
        Objects.equals(this.bulkErrors, bulkSendBatchStatus.bulkErrors) &&
        Objects.equals(this.envelopeIdOrTemplateId, bulkSendBatchStatus.envelopeIdOrTemplateId) &&
        Objects.equals(this.envelopesInfo, bulkSendBatchStatus.envelopesInfo) &&
        Objects.equals(this.envelopesUri, bulkSendBatchStatus.envelopesUri) &&
        Objects.equals(this.failed, bulkSendBatchStatus.failed) &&
        Objects.equals(this.mailingListId, bulkSendBatchStatus.mailingListId) &&
        Objects.equals(this.mailingListName, bulkSendBatchStatus.mailingListName) &&
        Objects.equals(this.ownerUserId, bulkSendBatchStatus.ownerUserId) &&
        Objects.equals(this.queued, bulkSendBatchStatus.queued) &&
        Objects.equals(this.resendsRemaining, bulkSendBatchStatus.resendsRemaining) &&
        Objects.equals(this.senderUserId, bulkSendBatchStatus.senderUserId) &&
        Objects.equals(this.sent, bulkSendBatchStatus.sent) &&
        Objects.equals(this.submittedDate, bulkSendBatchStatus.submittedDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, actionStatus, batchId, batchName, batchSize, bulkErrors, envelopeIdOrTemplateId, envelopesInfo, envelopesUri, failed, mailingListId, mailingListName, ownerUserId, queued, resendsRemaining, senderUserId, sent, submittedDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchStatus {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    bulkErrors: ").append(toIndentedString(bulkErrors)).append("\n");
    sb.append("    envelopeIdOrTemplateId: ").append(toIndentedString(envelopeIdOrTemplateId)).append("\n");
    sb.append("    envelopesInfo: ").append(toIndentedString(envelopesInfo)).append("\n");
    sb.append("    envelopesUri: ").append(toIndentedString(envelopesUri)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    mailingListId: ").append(toIndentedString(mailingListId)).append("\n");
    sb.append("    mailingListName: ").append(toIndentedString(mailingListName)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    resendsRemaining: ").append(toIndentedString(resendsRemaining)).append("\n");
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

