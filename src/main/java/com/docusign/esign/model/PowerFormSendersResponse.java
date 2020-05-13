package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PowerFormSendersResponse
 */

public class PowerFormSendersResponse {
  @JsonProperty("endPosition")
  private Integer endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("powerFormSenders")
  private java.util.List<UserInfo> powerFormSenders = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  @JsonProperty("resultSetSize")
  private Integer resultSetSize = null;

  @JsonProperty("startPosition")
  private Integer startPosition = null;

  @JsonProperty("totalSetSize")
  private Integer totalSetSize = null;

  public PowerFormSendersResponse endPosition(Integer endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * The last position in the result set. 
   * @return endPosition
  **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public Integer getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(Integer endPosition) {
    this.endPosition = endPosition;
  }

  public PowerFormSendersResponse nextUri(String nextUri) {
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

  public PowerFormSendersResponse powerFormSenders(java.util.List<UserInfo> powerFormSenders) {
    this.powerFormSenders = powerFormSenders;
    return this;
  }

  public PowerFormSendersResponse addPowerFormSendersItem(UserInfo powerFormSendersItem) {
    if (this.powerFormSenders == null) {
      this.powerFormSenders = new java.util.ArrayList<UserInfo>();
    }
    this.powerFormSenders.add(powerFormSendersItem);
    return this;
  }

   /**
   * 
   * @return powerFormSenders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserInfo> getPowerFormSenders() {
    return powerFormSenders;
  }

  public void setPowerFormSenders(java.util.List<UserInfo> powerFormSenders) {
    this.powerFormSenders = powerFormSenders;
  }

  public PowerFormSendersResponse previousUri(String previousUri) {
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

  public PowerFormSendersResponse resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * The number of results returned in this response. 
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public PowerFormSendersResponse startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public Integer getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public PowerFormSendersResponse totalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   * @return totalSetSize
  **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public Integer getTotalSetSize() {
    return totalSetSize;
  }

  public void setTotalSetSize(Integer totalSetSize) {
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
    PowerFormSendersResponse powerFormSendersResponse = (PowerFormSendersResponse) o;
    return Objects.equals(this.endPosition, powerFormSendersResponse.endPosition) &&
        Objects.equals(this.nextUri, powerFormSendersResponse.nextUri) &&
        Objects.equals(this.powerFormSenders, powerFormSendersResponse.powerFormSenders) &&
        Objects.equals(this.previousUri, powerFormSendersResponse.previousUri) &&
        Objects.equals(this.resultSetSize, powerFormSendersResponse.resultSetSize) &&
        Objects.equals(this.startPosition, powerFormSendersResponse.startPosition) &&
        Objects.equals(this.totalSetSize, powerFormSendersResponse.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, nextUri, powerFormSenders, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormSendersResponse {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    powerFormSenders: ").append(toIndentedString(powerFormSenders)).append("\n");
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

