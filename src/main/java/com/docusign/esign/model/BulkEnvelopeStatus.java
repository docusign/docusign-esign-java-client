package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkEnvelope;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class BulkEnvelopeStatus   {
  
  private String batchSize = null;
  private String batchId = null;
  private String bulkEnvelopesBatchUri = null;
  private String failed = null;
  private String queued = null;
  private String sent = null;
  private String submittedDate = null;
  private String resultSetSize = null;
  private String startPosition = null;
  private String endPosition = null;
  private String totalSetSize = null;
  private String nextUri = null;
  private String previousUri = null;
  private java.util.List<BulkEnvelope> bulkEnvelopes = new java.util.ArrayList<BulkEnvelope>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("batchSize")
  public String getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("bulkEnvelopesBatchUri")
  public String getBulkEnvelopesBatchUri() {
    return bulkEnvelopesBatchUri;
  }
  public void setBulkEnvelopesBatchUri(String bulkEnvelopesBatchUri) {
    this.bulkEnvelopesBatchUri = bulkEnvelopesBatchUri;
  }

  
  /**
   * Entries with a failed status.
   **/
  
  @ApiModelProperty(value = "Entries with a failed status.")
  @JsonProperty("failed")
  public String getFailed() {
    return failed;
  }
  public void setFailed(String failed) {
    this.failed = failed;
  }

  
  /**
   * Retrieves entries with a status of queued.
   **/
  
  @ApiModelProperty(value = "Retrieves entries with a status of queued.")
  @JsonProperty("queued")
  public String getQueued() {
    return queued;
  }
  public void setQueued(String queued) {
    this.queued = queued;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sent")
  public String getSent() {
    return sent;
  }
  public void setSent(String sent) {
    this.sent = sent;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("submittedDate")
  public String getSubmittedDate() {
    return submittedDate;
  }
  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
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
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("bulkEnvelopes")
  public java.util.List<BulkEnvelope> getBulkEnvelopes() {
    return bulkEnvelopes;
  }
  public void setBulkEnvelopes(java.util.List<BulkEnvelope> bulkEnvelopes) {
    this.bulkEnvelopes = bulkEnvelopes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEnvelopeStatus bulkEnvelopeStatus = (BulkEnvelopeStatus) o;

    return true && Objects.equals(batchSize, bulkEnvelopeStatus.batchSize) &&
        Objects.equals(batchId, bulkEnvelopeStatus.batchId) &&
        Objects.equals(bulkEnvelopesBatchUri, bulkEnvelopeStatus.bulkEnvelopesBatchUri) &&
        Objects.equals(failed, bulkEnvelopeStatus.failed) &&
        Objects.equals(queued, bulkEnvelopeStatus.queued) &&
        Objects.equals(sent, bulkEnvelopeStatus.sent) &&
        Objects.equals(submittedDate, bulkEnvelopeStatus.submittedDate) &&
        Objects.equals(resultSetSize, bulkEnvelopeStatus.resultSetSize) &&
        Objects.equals(startPosition, bulkEnvelopeStatus.startPosition) &&
        Objects.equals(endPosition, bulkEnvelopeStatus.endPosition) &&
        Objects.equals(totalSetSize, bulkEnvelopeStatus.totalSetSize) &&
        Objects.equals(nextUri, bulkEnvelopeStatus.nextUri) &&
        Objects.equals(previousUri, bulkEnvelopeStatus.previousUri) &&
        Objects.equals(bulkEnvelopes, bulkEnvelopeStatus.bulkEnvelopes)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, batchId, bulkEnvelopesBatchUri, failed, queued, sent, submittedDate, resultSetSize, startPosition, endPosition, totalSetSize, nextUri, previousUri, bulkEnvelopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelopeStatus {\n");
    
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    bulkEnvelopesBatchUri: ").append(toIndentedString(bulkEnvelopesBatchUri)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    bulkEnvelopes: ").append(toIndentedString(bulkEnvelopes)).append("\n");
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

