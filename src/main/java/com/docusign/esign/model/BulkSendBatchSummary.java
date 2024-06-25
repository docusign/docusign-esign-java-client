package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Summary status of a single batch..
 *
 */
@Schema(description = "Summary status of a single batch.")

public class BulkSendBatchSummary implements Serializable {
  private static final long serialVersionUID = 1L;

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

  @JsonProperty("batchUri")
  private String batchUri = null;

  @JsonProperty("failed")
  private String failed = null;

  @JsonProperty("queued")
  private String queued = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("submittedDate")
  private String submittedDate = null;


  /**
   * action.
   *
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary action(String action) {
    this.action = action;
    return this;
  }

  /**
   * .
   * @return action
   **/
  @Schema(description = "")
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
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

  /**
   * .
   * @return actionStatus
   **/
  @Schema(description = "")
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
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * .
   * @return batchId
   **/
  @Schema(description = "")
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
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * .
   * @return batchName
   **/
  @Schema(description = "")
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
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * .
   * @return batchSize
   **/
  @Schema(description = "")
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
   * batchUri.
   *
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary batchUri(String batchUri) {
    this.batchUri = batchUri;
    return this;
  }

  /**
   * .
   * @return batchUri
   **/
  @Schema(description = "")
  public String getBatchUri() {
    return batchUri;
  }

  /**
   * setBatchUri.
   **/
  public void setBatchUri(String batchUri) {
    this.batchUri = batchUri;
  }


  /**
   * failed.
   *
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary failed(String failed) {
    this.failed = failed;
    return this;
  }

  /**
   * .
   * @return failed
   **/
  @Schema(description = "")
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
   * queued.
   *
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary queued(String queued) {
    this.queued = queued;
    return this;
  }

  /**
   * .
   * @return queued
   **/
  @Schema(description = "")
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
   * sent.
   *
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary sent(String sent) {
    this.sent = sent;
    return this;
  }

  /**
   * .
   * @return sent
   **/
  @Schema(description = "")
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
   * @return BulkSendBatchSummary
   **/
  public BulkSendBatchSummary submittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }

  /**
   * .
   * @return submittedDate
   **/
  @Schema(description = "")
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
    BulkSendBatchSummary bulkSendBatchSummary = (BulkSendBatchSummary) o;
    return Objects.equals(this.action, bulkSendBatchSummary.action) &&
        Objects.equals(this.actionStatus, bulkSendBatchSummary.actionStatus) &&
        Objects.equals(this.batchId, bulkSendBatchSummary.batchId) &&
        Objects.equals(this.batchName, bulkSendBatchSummary.batchName) &&
        Objects.equals(this.batchSize, bulkSendBatchSummary.batchSize) &&
        Objects.equals(this.batchUri, bulkSendBatchSummary.batchUri) &&
        Objects.equals(this.failed, bulkSendBatchSummary.failed) &&
        Objects.equals(this.queued, bulkSendBatchSummary.queued) &&
        Objects.equals(this.sent, bulkSendBatchSummary.sent) &&
        Objects.equals(this.submittedDate, bulkSendBatchSummary.submittedDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, actionStatus, batchId, batchName, batchSize, batchUri, failed, queued, sent, submittedDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchSummary {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    batchUri: ").append(toIndentedString(batchUri)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
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

