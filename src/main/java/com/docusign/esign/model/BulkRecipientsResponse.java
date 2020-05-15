package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkRecipientsResponse
 */

public class BulkRecipientsResponse {
  @JsonProperty("bulkRecipients")
  private java.util.List<BulkRecipient> bulkRecipients = null;

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

  public BulkRecipientsResponse bulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
    return this;
  }

  public BulkRecipientsResponse addBulkRecipientsItem(BulkRecipient bulkRecipientsItem) {
    if (this.bulkRecipients == null) {
      this.bulkRecipients = new java.util.ArrayList<BulkRecipient>();
    }
    this.bulkRecipients.add(bulkRecipientsItem);
    return this;
  }

   /**
   * A complex type containing information about the bulk recipients in the response.
   * @return bulkRecipients
  **/
  @ApiModelProperty(value = "A complex type containing information about the bulk recipients in the response.")
  public java.util.List<BulkRecipient> getBulkRecipients() {
    return bulkRecipients;
  }

  public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
    this.bulkRecipients = bulkRecipients;
  }

  public BulkRecipientsResponse endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * The last position in the result set. 
   * @return endPosition
  **/
  @ApiModelProperty(value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  public BulkRecipientsResponse nextUri(String nextUri) {
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

  public BulkRecipientsResponse previousUri(String previousUri) {
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

  public BulkRecipientsResponse resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * The number of results returned in this response. 
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public BulkRecipientsResponse startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public BulkRecipientsResponse totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   * @return totalSetSize
  **/
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
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
    BulkRecipientsResponse bulkRecipientsResponse = (BulkRecipientsResponse) o;
    return Objects.equals(this.bulkRecipients, bulkRecipientsResponse.bulkRecipients) &&
        Objects.equals(this.endPosition, bulkRecipientsResponse.endPosition) &&
        Objects.equals(this.nextUri, bulkRecipientsResponse.nextUri) &&
        Objects.equals(this.previousUri, bulkRecipientsResponse.previousUri) &&
        Objects.equals(this.resultSetSize, bulkRecipientsResponse.resultSetSize) &&
        Objects.equals(this.startPosition, bulkRecipientsResponse.startPosition) &&
        Objects.equals(this.totalSetSize, bulkRecipientsResponse.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipients, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsResponse {\n");
    
    sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
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

