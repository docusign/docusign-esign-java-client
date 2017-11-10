package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Group;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GroupInformation
 */

public class GroupInformation {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("groups")
  private java.util.List<Group> groups = new java.util.ArrayList<Group>();

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

  public GroupInformation endPosition(String endPosition) {
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

  public GroupInformation groups(java.util.List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public GroupInformation addGroupsItem(Group groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A collection group objects containing information about the groups returned.
   * @return groups
  **/
  @ApiModelProperty(example = "null", value = "A collection group objects containing information about the groups returned.")
  public java.util.List<Group> getGroups() {
    return groups;
  }

  public void setGroups(java.util.List<Group> groups) {
    this.groups = groups;
  }

  public GroupInformation nextUri(String nextUri) {
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

  public GroupInformation previousUri(String previousUri) {
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

  public GroupInformation resultSetSize(String resultSetSize) {
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

  public GroupInformation startPosition(String startPosition) {
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

  public GroupInformation totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   * @return totalSetSize
  **/
  @ApiModelProperty(example = "null", value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
    GroupInformation groupInformation = (GroupInformation) o;
    return Objects.equals(this.endPosition, groupInformation.endPosition) &&
        Objects.equals(this.groups, groupInformation.groups) &&
        Objects.equals(this.nextUri, groupInformation.nextUri) &&
        Objects.equals(this.previousUri, groupInformation.previousUri) &&
        Objects.equals(this.resultSetSize, groupInformation.resultSetSize) &&
        Objects.equals(this.startPosition, groupInformation.startPosition) &&
        Objects.equals(this.totalSetSize, groupInformation.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, groups, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInformation {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

