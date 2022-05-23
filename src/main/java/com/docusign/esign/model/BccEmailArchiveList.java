package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BccEmailArchiveList. */
public class BccEmailArchiveList {
  @JsonProperty("bccEmailArchives")
  private java.util.List<BccEmailArchive> bccEmailArchives = null;

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
   * bccEmailArchives.
   *
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList bccEmailArchives(java.util.List<BccEmailArchive> bccEmailArchives) {
    this.bccEmailArchives = bccEmailArchives;
    return this;
  }

  /**
   * addBccEmailArchivesItem.
   *
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList addBccEmailArchivesItem(BccEmailArchive bccEmailArchivesItem) {
    if (this.bccEmailArchives == null) {
      this.bccEmailArchives = new java.util.ArrayList<>();
    }
    this.bccEmailArchives.add(bccEmailArchivesItem);
    return this;
  }

  /**
   * .
   *
   * @return bccEmailArchives
   */
  @ApiModelProperty(value = "")
  public java.util.List<BccEmailArchive> getBccEmailArchives() {
    return bccEmailArchives;
  }

  /** setBccEmailArchives. */
  public void setBccEmailArchives(java.util.List<BccEmailArchive> bccEmailArchives) {
    this.bccEmailArchives = bccEmailArchives;
  }

  /**
   * endPosition.
   *
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList endPosition(String endPosition) {
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
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList nextUri(String nextUri) {
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
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList previousUri(String previousUri) {
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
   * resultSetSize.
   *
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList resultSetSize(String resultSetSize) {
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
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList startPosition(String startPosition) {
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
   * totalSetSize.
   *
   * @return BccEmailArchiveList
   */
  public BccEmailArchiveList totalSetSize(String totalSetSize) {
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
    BccEmailArchiveList bccEmailArchiveList = (BccEmailArchiveList) o;
    return Objects.equals(this.bccEmailArchives, bccEmailArchiveList.bccEmailArchives)
        && Objects.equals(this.endPosition, bccEmailArchiveList.endPosition)
        && Objects.equals(this.nextUri, bccEmailArchiveList.nextUri)
        && Objects.equals(this.previousUri, bccEmailArchiveList.previousUri)
        && Objects.equals(this.resultSetSize, bccEmailArchiveList.resultSetSize)
        && Objects.equals(this.startPosition, bccEmailArchiveList.startPosition)
        && Objects.equals(this.totalSetSize, bccEmailArchiveList.totalSetSize);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        bccEmailArchives,
        endPosition,
        nextUri,
        previousUri,
        resultSetSize,
        startPosition,
        totalSetSize);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BccEmailArchiveList {\n");

    sb.append("    bccEmailArchives: ").append(toIndentedString(bccEmailArchives)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
