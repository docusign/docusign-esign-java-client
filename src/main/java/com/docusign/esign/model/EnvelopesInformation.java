package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.EnvelopeTransactionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EnvelopesInformation   {
  
  private String resultSetSize = null;
  private String totalSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String nextUri = null;
  private String previousUri = null;
  private java.util.List<Envelope> envelopes = new java.util.ArrayList<Envelope>();
  private java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses = new java.util.ArrayList<EnvelopeTransactionStatus>();

  
  /**
   * The number of results returned in this response. 
   **/
  public EnvelopesInformation resultSetSize(String resultSetSize) {
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
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  public EnvelopesInformation totalSetSize(String totalSetSize) {
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
   * Starting position of the current result set.
   **/
  public EnvelopesInformation startPosition(String startPosition) {
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
  public EnvelopesInformation endPosition(String endPosition) {
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
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. 
   **/
  public EnvelopesInformation nextUri(String nextUri) {
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
   * The postal code for the billing address.
   **/
  public EnvelopesInformation previousUri(String previousUri) {
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
   * 
   **/
  public EnvelopesInformation envelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelopes")
  public java.util.List<Envelope> getEnvelopes() {
    return envelopes;
  }
  public void setEnvelopes(java.util.List<Envelope> envelopes) {
    this.envelopes = envelopes;
  }

  
  /**
   * 
   **/
  public EnvelopesInformation envelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelopeTransactionStatuses")
  public java.util.List<EnvelopeTransactionStatus> getEnvelopeTransactionStatuses() {
    return envelopeTransactionStatuses;
  }
  public void setEnvelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
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
    return Objects.equals(this.resultSetSize, envelopesInformation.resultSetSize) &&
        Objects.equals(this.totalSetSize, envelopesInformation.totalSetSize) &&
        Objects.equals(this.startPosition, envelopesInformation.startPosition) &&
        Objects.equals(this.endPosition, envelopesInformation.endPosition) &&
        Objects.equals(this.nextUri, envelopesInformation.nextUri) &&
        Objects.equals(this.previousUri, envelopesInformation.previousUri) &&
        Objects.equals(this.envelopes, envelopesInformation.envelopes) &&
        Objects.equals(this.envelopeTransactionStatuses, envelopesInformation.envelopeTransactionStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSetSize, totalSetSize, startPosition, endPosition, nextUri, previousUri, envelopes, envelopeTransactionStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesInformation {\n");
    
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    envelopeTransactionStatuses: ").append(toIndentedString(envelopeTransactionStatuses)).append("\n");
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

