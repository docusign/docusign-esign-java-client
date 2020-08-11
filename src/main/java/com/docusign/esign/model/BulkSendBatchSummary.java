package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendBatchSummary
 */

public class BulkSendBatchSummary {
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

  public BulkSendBatchSummary batchId(String batchId) {
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

  public BulkSendBatchSummary batchName(String batchName) {
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

  public BulkSendBatchSummary batchSize(String batchSize) {
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

  public BulkSendBatchSummary batchUri(String batchUri) {
    this.batchUri = batchUri;
    return this;
  }

   /**
   * 
   * @return batchUri
  **/
  @ApiModelProperty(value = "")
  public String getBatchUri() {
    return batchUri;
  }

  public void setBatchUri(String batchUri) {
    this.batchUri = batchUri;
  }

  public BulkSendBatchSummary failed(String failed) {
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

  public BulkSendBatchSummary queued(String queued) {
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

  public BulkSendBatchSummary sent(String sent) {
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

  public BulkSendBatchSummary submittedDate(String submittedDate) {
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
    BulkSendBatchSummary bulkSendBatchSummary = (BulkSendBatchSummary) o;
    return Objects.equals(this.batchId, bulkSendBatchSummary.batchId) &&
        Objects.equals(this.batchName, bulkSendBatchSummary.batchName) &&
        Objects.equals(this.batchSize, bulkSendBatchSummary.batchSize) &&
        Objects.equals(this.batchUri, bulkSendBatchSummary.batchUri) &&
        Objects.equals(this.failed, bulkSendBatchSummary.failed) &&
        Objects.equals(this.queued, bulkSendBatchSummary.queued) &&
        Objects.equals(this.sent, bulkSendBatchSummary.sent) &&
        Objects.equals(this.submittedDate, bulkSendBatchSummary.submittedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchName, batchSize, batchUri, failed, queued, sent, submittedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchSummary {\n");
    
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

