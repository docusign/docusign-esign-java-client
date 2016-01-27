package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Group;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class GroupInformation   {
  
  private java.util.List<Group> groups = new java.util.ArrayList<Group>();
  private String resultSetSize = null;
  private String totalSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String nextUri = null;
  private String previousUri = null;

  
  /**
   * A collection group objects containing information about the groups returned.
   **/
  @ApiModelProperty(value = "A collection group objects containing information about the groups returned.")
  @JsonProperty("groups")
  public java.util.List<Group> getGroups() {
    return groups;
  }
  public void setGroups(java.util.List<Group> groups) {
    this.groups = groups;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupInformation groupInformation = (GroupInformation) o;
    return Objects.equals(groups, groupInformation.groups) &&
        Objects.equals(resultSetSize, groupInformation.resultSetSize) &&
        Objects.equals(totalSetSize, groupInformation.totalSetSize) &&
        Objects.equals(startPosition, groupInformation.startPosition) &&
        Objects.equals(endPosition, groupInformation.endPosition) &&
        Objects.equals(nextUri, groupInformation.nextUri) &&
        Objects.equals(previousUri, groupInformation.previousUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, resultSetSize, totalSetSize, startPosition, endPosition, nextUri, previousUri);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInformation {\n");
    
    sb.append("    groups: ").append(StringUtil.toIndentedString(groups)).append("\n");
    sb.append("    resultSetSize: ").append(StringUtil.toIndentedString(resultSetSize)).append("\n");
    sb.append("    totalSetSize: ").append(StringUtil.toIndentedString(totalSetSize)).append("\n");
    sb.append("    startPosition: ").append(StringUtil.toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(StringUtil.toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(StringUtil.toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(StringUtil.toIndentedString(previousUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
