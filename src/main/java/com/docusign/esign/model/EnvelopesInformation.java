package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.EnvelopeTransactionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopesInformation
 */

public class EnvelopesInformation {
  @JsonProperty("continuationToken")
  private String continuationToken = null;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("envelopes")
  private java.util.List<Envelope> envelopes = new java.util.ArrayList<Envelope>();

  @JsonProperty("envelopeTransactionStatuses")
  private java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses = new java.util.ArrayList<EnvelopeTransactionStatus>();

  @JsonProperty("lastQueriedDateTime")
  private String lastQueriedDateTime = null;

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

  public EnvelopesInformation continuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
    return this;
  }

   /**
   * 
   * @return continuationToken
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContinuationToken() {
    return continuationToken;
  }

  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }

  public EnvelopesInformation endPosition(String endPosition) {
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

  public EnvelopesInformation envelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  public EnvelopesInformation addEnvelopesItem(Envelope envelopesItem) {
    this.envelopes.add(envelopesItem);
    return this;
  }

   /**
   * 
   * @return envelopes
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Envelope> getEnvelopes() {
    return envelopes;
  }

  public void setEnvelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
  }

  public EnvelopesInformation envelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
    return this;
  }

  public EnvelopesInformation addEnvelopeTransactionStatusesItem(EnvelopeTransactionStatus envelopeTransactionStatusesItem) {
    this.envelopeTransactionStatuses.add(envelopeTransactionStatusesItem);
    return this;
  }

   /**
   * 
   * @return envelopeTransactionStatuses
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<EnvelopeTransactionStatus> getEnvelopeTransactionStatuses() {
    return envelopeTransactionStatuses;
  }

  public void setEnvelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
  }

  public EnvelopesInformation lastQueriedDateTime(String lastQueriedDateTime) {
    this.lastQueriedDateTime = lastQueriedDateTime;
    return this;
  }

   /**
   * 
   * @return lastQueriedDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastQueriedDateTime() {
    return lastQueriedDateTime;
  }

  public void setLastQueriedDateTime(String lastQueriedDateTime) {
    this.lastQueriedDateTime = lastQueriedDateTime;
  }

  public EnvelopesInformation nextUri(String nextUri) {
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

  public EnvelopesInformation previousUri(String previousUri) {
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

  public EnvelopesInformation resultSetSize(String resultSetSize) {
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

  public EnvelopesInformation startPosition(String startPosition) {
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

  public EnvelopesInformation totalSetSize(String totalSetSize) {
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
    EnvelopesInformation envelopesInformation = (EnvelopesInformation) o;
    return Objects.equals(this.continuationToken, envelopesInformation.continuationToken) &&
        Objects.equals(this.endPosition, envelopesInformation.endPosition) &&
        Objects.equals(this.envelopes, envelopesInformation.envelopes) &&
        Objects.equals(this.envelopeTransactionStatuses, envelopesInformation.envelopeTransactionStatuses) &&
        Objects.equals(this.lastQueriedDateTime, envelopesInformation.lastQueriedDateTime) &&
        Objects.equals(this.nextUri, envelopesInformation.nextUri) &&
        Objects.equals(this.previousUri, envelopesInformation.previousUri) &&
        Objects.equals(this.resultSetSize, envelopesInformation.resultSetSize) &&
        Objects.equals(this.startPosition, envelopesInformation.startPosition) &&
        Objects.equals(this.totalSetSize, envelopesInformation.totalSetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continuationToken, endPosition, envelopes, envelopeTransactionStatuses, lastQueriedDateTime, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesInformation {\n");
    
    sb.append("    continuationToken: ").append(toIndentedString(continuationToken)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    envelopeTransactionStatuses: ").append(toIndentedString(envelopeTransactionStatuses)).append("\n");
    sb.append("    lastQueriedDateTime: ").append(toIndentedString(lastQueriedDateTime)).append("\n");
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

