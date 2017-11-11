package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.FolderItemV2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FolderItemResponse
 */

public class FolderItemResponse {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("folderItems")
  private java.util.List<FolderItemV2> folderItems = new java.util.ArrayList<FolderItemV2>();

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

  public FolderItemResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * The last position in the result set. 
   * @return endPosition
  **/
  @ApiModelProperty(example = "null", value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  public FolderItemResponse folderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
    return this;
  }

  public FolderItemResponse addFolderItemsItem(FolderItemV2 folderItemsItem) {
    this.folderItems.add(folderItemsItem);
    return this;
  }

   /**
   * A list of the envelopes in the specified folder or folders. 
   * @return folderItems
  **/
  @ApiModelProperty(example = "null", value = "A list of the envelopes in the specified folder or folders. ")
  public java.util.List<FolderItemV2> getFolderItems() {
    return folderItems;
  }

  public void setFolderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
  }

  public FolderItemResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

   /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. 
   * @return nextUri
  **/
  @ApiModelProperty(example = "null", value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public FolderItemResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

   /**
   * The postal code for the billing address.
   * @return previousUri
  **/
  @ApiModelProperty(example = "null", value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  public FolderItemResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * The number of results returned in this response. 
   * @return resultSetSize
  **/
  @ApiModelProperty(example = "null", value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public FolderItemResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(example = "null", value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public FolderItemResponse totalRows(String totalRows) {
    this.totalRows = totalRows;
    return this;
  }

   /**
   * 
   * @return totalRows
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(String totalRows) {
    this.totalRows = totalRows;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, folderItems, nextUri, previousUri, resultSetSize, startPosition, totalRows);
  }


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

