package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** BulkEnvelopesResponse */
public class BulkEnvelopesResponse {
  @JsonProperty("bulkEnvelopeStatuses")
  private java.util.List<BulkEnvelopeStatus> bulkEnvelopeStatuses = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  public BulkEnvelopesResponse bulkEnvelopeStatuses(
      java.util.List<BulkEnvelopeStatus> bulkEnvelopeStatuses) {
    this.bulkEnvelopeStatuses = bulkEnvelopeStatuses;
    return this;
  }

  public BulkEnvelopesResponse addBulkEnvelopeStatusesItem(
      BulkEnvelopeStatus bulkEnvelopeStatusesItem) {
    if (this.bulkEnvelopeStatuses == null) {
      this.bulkEnvelopeStatuses = new java.util.ArrayList<BulkEnvelopeStatus>();
    }
    this.bulkEnvelopeStatuses.add(bulkEnvelopeStatusesItem);
    return this;
  }

  /**
   * Reserved: TBD
   *
   * @return bulkEnvelopeStatuses
   */
  @Schema(description = "Reserved: TBD")
  public java.util.List<BulkEnvelopeStatus> getBulkEnvelopeStatuses() {
    return bulkEnvelopeStatuses;
  }

  public void setBulkEnvelopeStatuses(java.util.List<BulkEnvelopeStatus> bulkEnvelopeStatuses) {
    this.bulkEnvelopeStatuses = bulkEnvelopeStatuses;
  }

  public BulkEnvelopesResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set.
   *
   * @return endPosition
   */
  @Schema(description = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  public BulkEnvelopesResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * The URI to the next chunk of records based on the search request. If the
   * endPosition is the
   * entire results of the search, this is null.
   *
   * @return nextUri
   */
  @Schema(description = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public BulkEnvelopesResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

  /**
   * The postal code for the billing address.
   *
   * @return previousUri
   */
  @Schema(description = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  public BulkEnvelopesResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response.
   *
   * @return resultSetSize
   */
  @Schema(description = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public BulkEnvelopesResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set.
   *
   * @return startPosition
   */
  @Schema(description = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public BulkEnvelopesResponse totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be
   * greater than or
   * equal to the value of the property returning the results in the in the
   * response.
   *
   * @return totalSetSize
   */
  @Schema(description = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEnvelopesResponse bulkEnvelopesResponse = (BulkEnvelopesResponse) o;
    return Objects.equals(this.bulkEnvelopeStatuses, bulkEnvelopesResponse.bulkEnvelopeStatuses)
        && Objects.equals(this.endPosition, bulkEnvelopesResponse.endPosition)
        && Objects.equals(this.nextUri, bulkEnvelopesResponse.nextUri)
        && Objects.equals(this.previousUri, bulkEnvelopesResponse.previousUri)
        && Objects.equals(this.resultSetSize, bulkEnvelopesResponse.resultSetSize)
        && Objects.equals(this.startPosition, bulkEnvelopesResponse.startPosition)
        && Objects.equals(this.totalSetSize, bulkEnvelopesResponse.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bulkEnvelopeStatuses,
        endPosition,
        nextUri,
        previousUri,
        resultSetSize,
        startPosition,
        totalSetSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelopesResponse {\n");

    sb.append("    bulkEnvelopeStatuses: ")
        .append(toIndentedString(bulkEnvelopeStatuses))
        .append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
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
