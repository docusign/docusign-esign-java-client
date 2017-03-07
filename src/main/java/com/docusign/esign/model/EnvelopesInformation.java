package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.EnvelopeTransactionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopesInformation   {
  
  private String endPosition = null;
  private java.util.List<Envelope> envelopes = new java.util.ArrayList<Envelope>();
  private java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses = new java.util.ArrayList<EnvelopeTransactionStatus>();
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
   * 
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeTransactionStatuses")
  public java.util.List<EnvelopeTransactionStatus> getEnvelopeTransactionStatuses() {
    return envelopeTransactionStatuses;
  }
  public void setEnvelopeTransactionStatuses(java.util.List<EnvelopeTransactionStatus> envelopeTransactionStatuses) {
    this.envelopeTransactionStatuses = envelopeTransactionStatuses;
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
    EnvelopesInformation envelopesInformation = (EnvelopesInformation) o;

    return true && Objects.equals(endPosition, envelopesInformation.endPosition) &&
        Objects.equals(envelopes, envelopesInformation.envelopes) &&
        Objects.equals(envelopeTransactionStatuses, envelopesInformation.envelopeTransactionStatuses) &&
        Objects.equals(nextUri, envelopesInformation.nextUri) &&
        Objects.equals(previousUri, envelopesInformation.previousUri) &&
        Objects.equals(resultSetSize, envelopesInformation.resultSetSize) &&
        Objects.equals(startPosition, envelopesInformation.startPosition) &&
        Objects.equals(totalSetSize, envelopesInformation.totalSetSize)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, envelopes, envelopeTransactionStatuses, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesInformation {\n");
    
    if (endPosition != null)
      sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    if (envelopes != null)
      sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    if (envelopeTransactionStatuses != null)
      sb.append("    envelopeTransactionStatuses: ").append(toIndentedString(envelopeTransactionStatuses)).append("\n");
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

