package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkEnvelope;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BulkEnvelopeStatus.
 *
 */

public class BulkEnvelopeStatus {
  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("batchSize")
  private String batchSize = null;

  @JsonProperty("bulkEnvelopes")
  private java.util.List<BulkEnvelope> bulkEnvelopes = null;

  @JsonProperty("bulkEnvelopesBatchUri")
  private String bulkEnvelopesBatchUri = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("failed")
  private String failed = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("queued")
  private String queued = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("sent")
  private String sent = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("submittedDate")
  private String submittedDate = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;


  /**
   * batchId.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches..
   * @return batchId
   **/
  @Schema(description = "Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.")
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
   * batchSize.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * The number of items returned in this response..
   * @return batchSize
   **/
  @Schema(description = "The number of items returned in this response.")
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
   * bulkEnvelopes.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus bulkEnvelopes(java.util.List<BulkEnvelope> bulkEnvelopes) {
    this.bulkEnvelopes = bulkEnvelopes;
    return this;
  }
  
  /**
   * addBulkEnvelopesItem.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus addBulkEnvelopesItem(BulkEnvelope bulkEnvelopesItem) {
    if (this.bulkEnvelopes == null) {
      this.bulkEnvelopes = new java.util.ArrayList<>();
    }
    this.bulkEnvelopes.add(bulkEnvelopesItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return bulkEnvelopes
   **/
  @Schema(description = "Reserved: TBD")
  public java.util.List<BulkEnvelope> getBulkEnvelopes() {
    return bulkEnvelopes;
  }

  /**
   * setBulkEnvelopes.
   **/
  public void setBulkEnvelopes(java.util.List<BulkEnvelope> bulkEnvelopes) {
    this.bulkEnvelopes = bulkEnvelopes;
  }


  /**
   * bulkEnvelopesBatchUri.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus bulkEnvelopesBatchUri(String bulkEnvelopesBatchUri) {
    this.bulkEnvelopesBatchUri = bulkEnvelopesBatchUri;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return bulkEnvelopesBatchUri
   **/
  @Schema(description = "Reserved: TBD")
  public String getBulkEnvelopesBatchUri() {
    return bulkEnvelopesBatchUri;
  }

  /**
   * setBulkEnvelopesBatchUri.
   **/
  public void setBulkEnvelopesBatchUri(String bulkEnvelopesBatchUri) {
    this.bulkEnvelopesBatchUri = bulkEnvelopesBatchUri;
  }


  /**
   * endPosition.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @Schema(description = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * failed.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus failed(String failed) {
    this.failed = failed;
    return this;
  }

  /**
   * The number of entries with a status of failed. .
   * @return failed
   **/
  @Schema(description = "The number of entries with a status of failed. ")
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
   * nextUri.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. .
   * @return nextUri
   **/
  @Schema(description = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * previousUri.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   * @return previousUri
   **/
  @Schema(description = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /**
   * setPreviousUri.
   **/
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * queued.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus queued(String queued) {
    this.queued = queued;
    return this;
  }

  /**
   * The number of entries with a status of queued. .
   * @return queued
   **/
  @Schema(description = "The number of entries with a status of queued. ")
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
   * resultSetSize.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @Schema(description = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * sent.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus sent(String sent) {
    this.sent = sent;
    return this;
  }

  /**
   * The number of entries with a status of sent..
   * @return sent
   **/
  @Schema(description = "The number of entries with a status of sent.")
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
   * startPosition.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @Schema(description = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * submittedDate.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus submittedDate(String submittedDate) {
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
   * totalSetSize.
   *
   * @return BulkEnvelopeStatus
   **/
  public BulkEnvelopeStatus totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @Schema(description = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
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
    BulkEnvelopeStatus bulkEnvelopeStatus = (BulkEnvelopeStatus) o;
    return Objects.equals(this.batchId, bulkEnvelopeStatus.batchId) &&
        Objects.equals(this.batchSize, bulkEnvelopeStatus.batchSize) &&
        Objects.equals(this.bulkEnvelopes, bulkEnvelopeStatus.bulkEnvelopes) &&
        Objects.equals(this.bulkEnvelopesBatchUri, bulkEnvelopeStatus.bulkEnvelopesBatchUri) &&
        Objects.equals(this.endPosition, bulkEnvelopeStatus.endPosition) &&
        Objects.equals(this.failed, bulkEnvelopeStatus.failed) &&
        Objects.equals(this.nextUri, bulkEnvelopeStatus.nextUri) &&
        Objects.equals(this.previousUri, bulkEnvelopeStatus.previousUri) &&
        Objects.equals(this.queued, bulkEnvelopeStatus.queued) &&
        Objects.equals(this.resultSetSize, bulkEnvelopeStatus.resultSetSize) &&
        Objects.equals(this.sent, bulkEnvelopeStatus.sent) &&
        Objects.equals(this.startPosition, bulkEnvelopeStatus.startPosition) &&
        Objects.equals(this.submittedDate, bulkEnvelopeStatus.submittedDate) &&
        Objects.equals(this.totalSetSize, bulkEnvelopeStatus.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchSize, bulkEnvelopes, bulkEnvelopesBatchUri, endPosition, failed, nextUri, previousUri, queued, resultSetSize, sent, startPosition, submittedDate, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelopeStatus {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    bulkEnvelopes: ").append(toIndentedString(bulkEnvelopes)).append("\n");
    sb.append("    bulkEnvelopesBatchUri: ").append(toIndentedString(bulkEnvelopesBatchUri)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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

