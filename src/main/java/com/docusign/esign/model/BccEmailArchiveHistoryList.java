package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BccEmailArchiveHistory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BccEmailArchiveHistoryList
 */

public class BccEmailArchiveHistoryList {
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

  public BccEmailArchiveHistoryList bccEmailArchiveHistory(java.util.List<BccEmailArchiveHistory> bccEmailArchiveHistory) {
    this.bccEmailArchiveHistory = bccEmailArchiveHistory;
    return this;
  }

  public BccEmailArchiveHistoryList addBccEmailArchiveHistoryItem(BccEmailArchiveHistory bccEmailArchiveHistoryItem) {
    if (this.bccEmailArchiveHistory == null) {
      this.bccEmailArchiveHistory = new java.util.ArrayList<BccEmailArchiveHistory>();
    }
    this.bccEmailArchiveHistory.add(bccEmailArchiveHistoryItem);
    return this;
  }

   /**
   * 
   * @return bccEmailArchiveHistory
  **/
  @ApiModelProperty(value = "")
  public java.util.List<BccEmailArchiveHistory> getBccEmailArchiveHistory() {
    return bccEmailArchiveHistory;
  }

  public void setBccEmailArchiveHistory(java.util.List<BccEmailArchiveHistory> bccEmailArchiveHistory) {
    this.bccEmailArchiveHistory = bccEmailArchiveHistory;
  }

  public BccEmailArchiveHistoryList endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * The last position in the result set. 
   * @return endPosition
  **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  public BccEmailArchiveHistoryList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

   /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. 
   * @return nextUri
  **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public BccEmailArchiveHistoryList previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

   /**
   * The postal code for the billing address.
   * @return previousUri
  **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  public BccEmailArchiveHistoryList resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * The number of results returned in this response. 
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public BccEmailArchiveHistoryList startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public BccEmailArchiveHistoryList totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   * @return totalSetSize
  **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
    BccEmailArchiveHistoryList bccEmailArchiveHistoryList = (BccEmailArchiveHistoryList) o;
    return Objects.equals(this.bccEmailArchiveHistory, bccEmailArchiveHistoryList.bccEmailArchiveHistory) &&
        Objects.equals(this.endPosition, bccEmailArchiveHistoryList.endPosition) &&
        Objects.equals(this.nextUri, bccEmailArchiveHistoryList.nextUri) &&
        Objects.equals(this.previousUri, bccEmailArchiveHistoryList.previousUri) &&
        Objects.equals(this.resultSetSize, bccEmailArchiveHistoryList.resultSetSize) &&
        Objects.equals(this.startPosition, bccEmailArchiveHistoryList.startPosition) &&
        Objects.equals(this.totalSetSize, bccEmailArchiveHistoryList.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bccEmailArchiveHistory, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


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

