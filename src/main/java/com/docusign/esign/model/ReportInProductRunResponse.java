package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ReportInProductRunResponse. */
public class ReportInProductRunResponse {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("exceededMaxResults")
  private String exceededMaxResults = null;

  @JsonProperty("lastWarehouseRefreshDateTime")
  private String lastWarehouseRefreshDateTime = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("rows")
  private java.util.List<ReportInProductRunResponseRow> rows = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  /**
   * endPosition.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   *
   * @return endPosition
   */
  @Schema(description = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /** setEndPosition. */
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  /**
   * exceededMaxResults.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse exceededMaxResults(String exceededMaxResults) {
    this.exceededMaxResults = exceededMaxResults;
    return this;
  }

  /**
   * .
   *
   * @return exceededMaxResults
   */
  @Schema(description = "")
  public String getExceededMaxResults() {
    return exceededMaxResults;
  }

  /** setExceededMaxResults. */
  public void setExceededMaxResults(String exceededMaxResults) {
    this.exceededMaxResults = exceededMaxResults;
  }

  /**
   * lastWarehouseRefreshDateTime.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse lastWarehouseRefreshDateTime(
      String lastWarehouseRefreshDateTime) {
    this.lastWarehouseRefreshDateTime = lastWarehouseRefreshDateTime;
    return this;
  }

  /**
   * .
   *
   * @return lastWarehouseRefreshDateTime
   */
  @Schema(description = "")
  public String getLastWarehouseRefreshDateTime() {
    return lastWarehouseRefreshDateTime;
  }

  /** setLastWarehouseRefreshDateTime. */
  public void setLastWarehouseRefreshDateTime(String lastWarehouseRefreshDateTime) {
    this.lastWarehouseRefreshDateTime = lastWarehouseRefreshDateTime;
  }

  /**
   * resultSetSize.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   *
   * @return resultSetSize
   */
  @Schema(description = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /** setResultSetSize. */
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  /**
   * rows.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse rows(java.util.List<ReportInProductRunResponseRow> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * addRowsItem.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse addRowsItem(ReportInProductRunResponseRow rowsItem) {
    if (this.rows == null) {
      this.rows = new java.util.ArrayList<ReportInProductRunResponseRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * .
   *
   * @return rows
   */
  @Schema(description = "")
  public java.util.List<ReportInProductRunResponseRow> getRows() {
    return rows;
  }

  /** setRows. */
  public void setRows(java.util.List<ReportInProductRunResponseRow> rows) {
    this.rows = rows;
  }

  /**
   * startPosition.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   *
   * @return startPosition
   */
  @Schema(description = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /** setStartPosition. */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * totalSetSize.
   *
   * @return ReportInProductRunResponse
   */
  public ReportInProductRunResponse totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be
   * greater than or
   * equal to the value of the property returning the results in the in the
   * response..
   *
   * @return totalSetSize
   */
  @Schema(description = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
    ReportInProductRunResponse reportInProductRunResponse = (ReportInProductRunResponse) o;
    return Objects.equals(this.endPosition, reportInProductRunResponse.endPosition)
        && Objects.equals(this.exceededMaxResults, reportInProductRunResponse.exceededMaxResults)
        && Objects.equals(
            this.lastWarehouseRefreshDateTime,
            reportInProductRunResponse.lastWarehouseRefreshDateTime)
        && Objects.equals(this.resultSetSize, reportInProductRunResponse.resultSetSize)
        && Objects.equals(this.rows, reportInProductRunResponse.rows)
        && Objects.equals(this.startPosition, reportInProductRunResponse.startPosition)
        && Objects.equals(this.totalSetSize, reportInProductRunResponse.totalSetSize);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        endPosition,
        exceededMaxResults,
        lastWarehouseRefreshDateTime,
        resultSetSize,
        rows,
        startPosition,
        totalSetSize);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductRunResponse {\n");

    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    exceededMaxResults: ").append(toIndentedString(exceededMaxResults)).append("\n");
    sb.append("    lastWarehouseRefreshDateTime: ")
        .append(toIndentedString(lastWarehouseRefreshDateTime))
        .append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
