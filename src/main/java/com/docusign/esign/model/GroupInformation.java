package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Group;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class GroupInformation   {
  
  private String endPosition = null;
  private java.util.List<Group> groups = new java.util.ArrayList<Group>();
  private String nextUri = null;
  private String previousUri = null;
  private String resultSetSize = null;
  private String startPosition = null;
  private String totalSetSize = null;

  
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
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  @JsonProperty("totalSetSize")
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

    return true && Objects.equals(endPosition, groupInformation.endPosition) &&
        Objects.equals(groups, groupInformation.groups) &&
        Objects.equals(nextUri, groupInformation.nextUri) &&
        Objects.equals(previousUri, groupInformation.previousUri) &&
        Objects.equals(resultSetSize, groupInformation.resultSetSize) &&
        Objects.equals(startPosition, groupInformation.startPosition) &&
        Objects.equals(totalSetSize, groupInformation.totalSetSize)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, groups, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInformation {\n");
    
    if (endPosition != null)
      sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    if (groups != null)
      sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    if (nextUri != null)
      sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    if (previousUri != null)
      sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    if (resultSetSize != null)
      sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    if (startPosition != null)
      sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    if (totalSetSize != null)
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

