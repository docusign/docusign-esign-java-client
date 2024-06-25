package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BccEmailArchiveHistory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BccEmailArchiveHistoryList.
 *
 */

public class BccEmailArchiveHistoryList implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bccEmailArchiveHistory")
  private java.util.List<BccEmailArchiveHistory> bccEmailArchiveHistory = null;

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


  /**
   * bccEmailArchiveHistory.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList bccEmailArchiveHistory(java.util.List<BccEmailArchiveHistory> bccEmailArchiveHistory) {
    this.bccEmailArchiveHistory = bccEmailArchiveHistory;
    return this;
  }
  
  /**
   * addBccEmailArchiveHistoryItem.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList addBccEmailArchiveHistoryItem(BccEmailArchiveHistory bccEmailArchiveHistoryItem) {
    if (this.bccEmailArchiveHistory == null) {
      this.bccEmailArchiveHistory = new java.util.ArrayList<>();
    }
    this.bccEmailArchiveHistory.add(bccEmailArchiveHistoryItem);
    return this;
  }

  /**
   * .
   * @return bccEmailArchiveHistory
   **/
  @Schema(description = "")
  public java.util.List<BccEmailArchiveHistory> getBccEmailArchiveHistory() {
    return bccEmailArchiveHistory;
  }

  /**
   * setBccEmailArchiveHistory.
   **/
  public void setBccEmailArchiveHistory(java.util.List<BccEmailArchiveHistory> bccEmailArchiveHistory) {
    this.bccEmailArchiveHistory = bccEmailArchiveHistory;
  }


  /**
   * endPosition.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList endPosition(String endPosition) {
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
   * nextUri.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList nextUri(String nextUri) {
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
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList previousUri(String previousUri) {
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
   * resultSetSize.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList resultSetSize(String resultSetSize) {
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
   * startPosition.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList startPosition(String startPosition) {
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
   * totalSetSize.
   *
   * @return BccEmailArchiveHistoryList
   **/
  public BccEmailArchiveHistoryList totalSetSize(String totalSetSize) {
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
    BccEmailArchiveHistoryList bccEmailArchiveHistoryList = (BccEmailArchiveHistoryList) o;
    return Objects.equals(this.bccEmailArchiveHistory, bccEmailArchiveHistoryList.bccEmailArchiveHistory) &&
        Objects.equals(this.endPosition, bccEmailArchiveHistoryList.endPosition) &&
        Objects.equals(this.nextUri, bccEmailArchiveHistoryList.nextUri) &&
        Objects.equals(this.previousUri, bccEmailArchiveHistoryList.previousUri) &&
        Objects.equals(this.resultSetSize, bccEmailArchiveHistoryList.resultSetSize) &&
        Objects.equals(this.startPosition, bccEmailArchiveHistoryList.startPosition) &&
        Objects.equals(this.totalSetSize, bccEmailArchiveHistoryList.totalSetSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bccEmailArchiveHistory, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailArchiveHistoryList {\n");
    
    sb.append("    bccEmailArchiveHistory: ").append(toIndentedString(bccEmailArchiveHistory)).append("\n");
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

