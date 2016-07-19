package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.FolderItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public FolderItemsResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results returned in this response. ")
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
  public FolderItemsResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Starting position of the current result set.")
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
  public FolderItemsResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last position in the result set. ")
  @JsonProperty("endPosition")
  public String getEndPosition() {
    return endPosition;
  }
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  
  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  public FolderItemsResponse totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
  public FolderItemsResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The postal code for the billing address.")
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
  public FolderItemsResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
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
  public FolderItemsResponse folderItems(java.util.List<FolderItem> folderItems) {
    this.folderItems = folderItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of the envelopes in the specified folder or folders. ")
  @JsonProperty("folderItems")
  public java.util.List<FolderItem> getFolderItems() {
    return folderItems;
  }
  public void setFolderItems(java.util.List<FolderItem> folderItems) {
    this.folderItems = folderItems;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderItemsResponse folderItemsResponse = (FolderItemsResponse) o;
    return Objects.equals(this.resultSetSize, folderItemsResponse.resultSetSize) &&
        Objects.equals(this.startPosition, folderItemsResponse.startPosition) &&
        Objects.equals(this.endPosition, folderItemsResponse.endPosition) &&
        Objects.equals(this.totalSetSize, folderItemsResponse.totalSetSize) &&
        Objects.equals(this.previousUri, folderItemsResponse.previousUri) &&
        Objects.equals(this.nextUri, folderItemsResponse.nextUri) &&
        Objects.equals(this.folderItems, folderItemsResponse.folderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, startPosition, endPosition, totalSetSize, previousUri, nextUri, folderItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItemsResponse {\n");
    
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    folderItems: ").append(toIndentedString(folderItems)).append("\n");
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

