package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BulkSendBatchSummaries. */
public class BulkSendBatchSummaries {
  @JsonProperty("batchSizeLimit")
  private String batchSizeLimit = null;

  @JsonProperty("bulkBatchSummaries")
  private java.util.List<BulkSendBatchSummary> bulkBatchSummaries = null;

  @JsonProperty("bulkProcessQueueLimit")
  private String bulkProcessQueueLimit = null;

  @JsonProperty("bulkProcessTotalQueued")
  private String bulkProcessTotalQueued = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("queueLimit")
  private String queueLimit = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalQueued")
  private String totalQueued = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  /**
   * batchSizeLimit.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries batchSizeLimit(String batchSizeLimit) {
    this.batchSizeLimit = batchSizeLimit;
    return this;
  }

  /**
   * .
   *
   * @return batchSizeLimit
   */
  @ApiModelProperty(value = "")
  public String getBatchSizeLimit() {
    return batchSizeLimit;
  }

  /** setBatchSizeLimit. */
  public void setBatchSizeLimit(String batchSizeLimit) {
    this.batchSizeLimit = batchSizeLimit;
  }

  /**
   * bulkBatchSummaries.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries bulkBatchSummaries(
      java.util.List<BulkSendBatchSummary> bulkBatchSummaries) {
    this.bulkBatchSummaries = bulkBatchSummaries;
    return this;
  }

  /**
   * addBulkBatchSummariesItem.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries addBulkBatchSummariesItem(
      BulkSendBatchSummary bulkBatchSummariesItem) {
    if (this.bulkBatchSummaries == null) {
      this.bulkBatchSummaries = new java.util.ArrayList<>();
    }
    this.bulkBatchSummaries.add(bulkBatchSummariesItem);
    return this;
  }

  /**
   * .
   *
   * @return bulkBatchSummaries
   */
  @ApiModelProperty(value = "")
  public java.util.List<BulkSendBatchSummary> getBulkBatchSummaries() {
    return bulkBatchSummaries;
  }

  /** setBulkBatchSummaries. */
  public void setBulkBatchSummaries(java.util.List<BulkSendBatchSummary> bulkBatchSummaries) {
    this.bulkBatchSummaries = bulkBatchSummaries;
  }

  /**
   * bulkProcessQueueLimit.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries bulkProcessQueueLimit(String bulkProcessQueueLimit) {
    this.bulkProcessQueueLimit = bulkProcessQueueLimit;
    return this;
  }

  /**
   * .
   *
   * @return bulkProcessQueueLimit
   */
  @ApiModelProperty(value = "")
  public String getBulkProcessQueueLimit() {
    return bulkProcessQueueLimit;
  }

  /** setBulkProcessQueueLimit. */
  public void setBulkProcessQueueLimit(String bulkProcessQueueLimit) {
    this.bulkProcessQueueLimit = bulkProcessQueueLimit;
  }

  /**
   * bulkProcessTotalQueued.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries bulkProcessTotalQueued(String bulkProcessTotalQueued) {
    this.bulkProcessTotalQueued = bulkProcessTotalQueued;
    return this;
  }

  /**
   * .
   *
   * @return bulkProcessTotalQueued
   */
  @ApiModelProperty(value = "")
  public String getBulkProcessTotalQueued() {
    return bulkProcessTotalQueued;
  }

  /** setBulkProcessTotalQueued. */
  public void setBulkProcessTotalQueued(String bulkProcessTotalQueued) {
    this.bulkProcessTotalQueued = bulkProcessTotalQueued;
  }

  /**
   * endPosition.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   *
   * @return endPosition
   */
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /** setEndPosition. */
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  /**
   * nextUri.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the
   * entire results of the search, this is null. .
   *
   * @return nextUri
   */
  @ApiModelProperty(
      value =
          "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  /** setNextUri. */
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  /**
   * previousUri.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address..
   *
   * @return previousUri
   */
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  /** setPreviousUri. */
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  /**
   * queueLimit.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries queueLimit(String queueLimit) {
    this.queueLimit = queueLimit;
    return this;
  }

  /**
   * .
   *
   * @return queueLimit
   */
  @ApiModelProperty(value = "")
  public String getQueueLimit() {
    return queueLimit;
  }

  /** setQueueLimit. */
  public void setQueueLimit(String queueLimit) {
    this.queueLimit = queueLimit;
  }

  /**
   * resultSetSize.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   *
   * @return resultSetSize
   */
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /** setResultSetSize. */
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  /**
   * startPosition.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   *
   * @return startPosition
   */
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /** setStartPosition. */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * totalQueued.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries totalQueued(String totalQueued) {
    this.totalQueued = totalQueued;
    return this;
  }

  /**
   * .
   *
   * @return totalQueued
   */
  @ApiModelProperty(value = "")
  public String getTotalQueued() {
    return totalQueued;
  }

  /** setTotalQueued. */
  public void setTotalQueued(String totalQueued) {
    this.totalQueued = totalQueued;
  }

  /**
   * totalSetSize.
   *
   * @return BulkSendBatchSummaries
   */
  public BulkSendBatchSummaries totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or
   * equal to the value of the property returning the results in the in the response..
   *
   * @return totalSetSize
   */
  @ApiModelProperty(
      value =
          "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /** setTotalSetSize. */
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
    BulkSendBatchSummaries bulkSendBatchSummaries = (BulkSendBatchSummaries) o;
    return Objects.equals(this.batchSizeLimit, bulkSendBatchSummaries.batchSizeLimit)
        && Objects.equals(this.bulkBatchSummaries, bulkSendBatchSummaries.bulkBatchSummaries)
        && Objects.equals(this.bulkProcessQueueLimit, bulkSendBatchSummaries.bulkProcessQueueLimit)
        && Objects.equals(
            this.bulkProcessTotalQueued, bulkSendBatchSummaries.bulkProcessTotalQueued)
        && Objects.equals(this.endPosition, bulkSendBatchSummaries.endPosition)
        && Objects.equals(this.nextUri, bulkSendBatchSummaries.nextUri)
        && Objects.equals(this.previousUri, bulkSendBatchSummaries.previousUri)
        && Objects.equals(this.queueLimit, bulkSendBatchSummaries.queueLimit)
        && Objects.equals(this.resultSetSize, bulkSendBatchSummaries.resultSetSize)
        && Objects.equals(this.startPosition, bulkSendBatchSummaries.startPosition)
        && Objects.equals(this.totalQueued, bulkSendBatchSummaries.totalQueued)
        && Objects.equals(this.totalSetSize, bulkSendBatchSummaries.totalSetSize);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        batchSizeLimit,
        bulkBatchSummaries,
        bulkProcessQueueLimit,
        bulkProcessTotalQueued,
        endPosition,
        nextUri,
        previousUri,
        queueLimit,
        resultSetSize,
        startPosition,
        totalQueued,
        totalSetSize);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendBatchSummaries {\n");

    sb.append("    batchSizeLimit: ").append(toIndentedString(batchSizeLimit)).append("\n");
    sb.append("    bulkBatchSummaries: ").append(toIndentedString(bulkBatchSummaries)).append("\n");
    sb.append("    bulkProcessQueueLimit: ")
        .append(toIndentedString(bulkProcessQueueLimit))
        .append("\n");
    sb.append("    bulkProcessTotalQueued: ")
        .append(toIndentedString(bulkProcessTotalQueued))
        .append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    queueLimit: ").append(toIndentedString(queueLimit)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalQueued: ").append(toIndentedString(totalQueued)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
