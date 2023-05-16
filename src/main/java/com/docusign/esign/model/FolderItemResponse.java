package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.FolderItemV2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Results from a folder item request..
 *
 */
@Schema(description = "Results from a folder item request.")

public class FolderItemResponse {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("folderItems")
  private java.util.List<FolderItemV2> folderItems = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalRows")
  private String totalRows = null;


  /**
   * endPosition.
   *
   * @return FolderItemResponse
   **/
  public FolderItemResponse endPosition(String endPosition) {
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
   * folderItems.
   *
   * @return FolderItemResponse
   **/
  public FolderItemResponse folderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
    return this;
  }
  
  /**
   * addFolderItemsItem.
   *
   * @return FolderItemResponse
   **/
  public FolderItemResponse addFolderItemsItem(FolderItemV2 folderItemsItem) {
    if (this.folderItems == null) {
      this.folderItems = new java.util.ArrayList<>();
    }
    this.folderItems.add(folderItemsItem);
    return this;
  }

  /**
   * A list of the envelopes in the specified folder or folders. .
   * @return folderItems
   **/
  @Schema(description = "A list of the envelopes in the specified folder or folders. ")
  public java.util.List<FolderItemV2> getFolderItems() {
    return folderItems;
  }

  /**
   * setFolderItems.
   **/
  public void setFolderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
  }


  /**
   * nextUri.
   *
   * @return FolderItemResponse
   **/
  public FolderItemResponse nextUri(String nextUri) {
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
   * @return FolderItemResponse
   **/
  public FolderItemResponse previousUri(String previousUri) {
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
   * @return FolderItemResponse
   **/
  public FolderItemResponse resultSetSize(String resultSetSize) {
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
   * @return FolderItemResponse
   **/
  public FolderItemResponse startPosition(String startPosition) {
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
   * totalRows.
   *
   * @return FolderItemResponse
   **/
  public FolderItemResponse totalRows(String totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * .
   * @return totalRows
   **/
  @Schema(description = "")
  public String getTotalRows() {
    return totalRows;
  }

  /**
   * setTotalRows.
   **/
  public void setTotalRows(String totalRows) {
    this.totalRows = totalRows;
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
    FolderItemResponse folderItemResponse = (FolderItemResponse) o;
    return Objects.equals(this.endPosition, folderItemResponse.endPosition) &&
        Objects.equals(this.folderItems, folderItemResponse.folderItems) &&
        Objects.equals(this.nextUri, folderItemResponse.nextUri) &&
        Objects.equals(this.previousUri, folderItemResponse.previousUri) &&
        Objects.equals(this.resultSetSize, folderItemResponse.resultSetSize) &&
        Objects.equals(this.startPosition, folderItemResponse.startPosition) &&
        Objects.equals(this.totalRows, folderItemResponse.totalRows);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endPosition, folderItems, nextUri, previousUri, resultSetSize, startPosition, totalRows);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemResponse {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    folderItems: ").append(toIndentedString(folderItems)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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

