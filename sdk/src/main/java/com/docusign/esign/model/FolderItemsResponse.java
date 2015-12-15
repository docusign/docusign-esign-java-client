package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.FolderItem;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FolderItemsResponse   {
  
  private String resultSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String totalSetSize = null;
  private String previousUri = null;
  private String nextUri = null;
  private java.util.List<FolderItem> folderItems = new java.util.ArrayList<FolderItem>();

  
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
   * The total number of items available in the result set. This will always be greater than or equal to the value of the `resultSetSize` property.
   **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the `resultSetSize` property.")
  @JsonProperty("totalSetSize")
  public String getTotalSetSize() {
    return totalSetSize;
  }
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
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
   * A list of the envelopes in the specified folder or folders.
   **/
  @ApiModelProperty(value = "A list of the envelopes in the specified folder or folders.")
  @JsonProperty("folderItems")
  public java.util.List<FolderItem> getFolderItems() {
    return folderItems;
  }
  public void setFolderItems(java.util.List<FolderItem> folderItems) {
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
    FolderItemsResponse folderItemsResponse = (FolderItemsResponse) o;
    return Objects.equals(resultSetSize, folderItemsResponse.resultSetSize) &&
        Objects.equals(startPosition, folderItemsResponse.startPosition) &&
        Objects.equals(endPosition, folderItemsResponse.endPosition) &&
        Objects.equals(totalSetSize, folderItemsResponse.totalSetSize) &&
        Objects.equals(previousUri, folderItemsResponse.previousUri) &&
        Objects.equals(nextUri, folderItemsResponse.nextUri) &&
        Objects.equals(folderItems, folderItemsResponse.folderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, startPosition, endPosition, totalSetSize, previousUri, nextUri, folderItems);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemsResponse {\n");
    
    sb.append("    resultSetSize: ").append(StringUtil.toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(StringUtil.toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(StringUtil.toIndentedString(endPosition)).append("\n");
    sb.append("    totalSetSize: ").append(StringUtil.toIndentedString(totalSetSize)).append("\n");
    sb.append("    previousUri: ").append(StringUtil.toIndentedString(previousUri)).append("\n");
    sb.append("    nextUri: ").append(StringUtil.toIndentedString(nextUri)).append("\n");
    sb.append("    folderItems: ").append(StringUtil.toIndentedString(folderItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
