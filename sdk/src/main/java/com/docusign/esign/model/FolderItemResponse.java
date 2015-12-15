package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.FolderItemV2;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FolderItemResponse   {
  
  private String resultSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String totalRows = null;
  private String nextUri = null;
  private String previousUri = null;
  private java.util.List<FolderItemV2> folderItems = new java.util.ArrayList<FolderItemV2>();

  
  /**
   * The number of results returned in this response.
   **/
  @ApiModelProperty(value = "The number of results returned in this response.")
  @JsonProperty("resultSetSize")
  public String getResultSetSize() {
    return resultSetSize;
  }
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  
  /**
   * Starting position of the current result set.
   **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  @JsonProperty("startPosition")
  public String getStartPosition() {
    return startPosition;
  }
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  
  /**
   * The last position in the result set.
   **/
  @ApiModelProperty(value = "The last position in the result set.")
  @JsonProperty("endPosition")
  public String getEndPosition() {
    return endPosition;
  }
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalRows")
  public String getTotalRows() {
    return totalRows;
  }
  public void setTotalRows(String totalRows) {
    this.totalRows = totalRows;
  }

  
  /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
   **/
  @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  
  /**
   * The postal code for the billing address.
   **/
  @ApiModelProperty(value = "The postal code for the billing address.")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  
  /**
   * A list of the envelopes in the specified folder or folders.
   **/
  @ApiModelProperty(value = "A list of the envelopes in the specified folder or folders.")
  @JsonProperty("folderItems")
  public java.util.List<FolderItemV2> getFolderItems() {
    return folderItems;
  }
  public void setFolderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderItemResponse folderItemResponse = (FolderItemResponse) o;
    return Objects.equals(resultSetSize, folderItemResponse.resultSetSize) &&
        Objects.equals(startPosition, folderItemResponse.startPosition) &&
        Objects.equals(endPosition, folderItemResponse.endPosition) &&
        Objects.equals(totalRows, folderItemResponse.totalRows) &&
        Objects.equals(nextUri, folderItemResponse.nextUri) &&
        Objects.equals(previousUri, folderItemResponse.previousUri) &&
        Objects.equals(folderItems, folderItemResponse.folderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, startPosition, endPosition, totalRows, nextUri, previousUri, folderItems);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemResponse {\n");
    
    sb.append("    resultSetSize: ").append(StringUtil.toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(StringUtil.toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(StringUtil.toIndentedString(endPosition)).append("\n");
    sb.append("    totalRows: ").append(StringUtil.toIndentedString(totalRows)).append("\n");
    sb.append("    nextUri: ").append(StringUtil.toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(StringUtil.toIndentedString(previousUri)).append("\n");
    sb.append("    folderItems: ").append(StringUtil.toIndentedString(folderItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
