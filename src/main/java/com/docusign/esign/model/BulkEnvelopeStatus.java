package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkEnvelope;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BulkEnvelopeStatus   {
  
  private String batchId = null;
  private String batchSize = null;
  private java.util.List<BulkEnvelope> bulkEnvelopes = new java.util.ArrayList<BulkEnvelope>();
  private String bulkEnvelopesBatchUri = null;
  private String endPosition = null;
  private String failed = null;
  private String nextUri = null;
  private String previousUri = null;
  private String queued = null;
  private String resultSetSize = null;
  private String sent = null;
  private String startPosition = null;
  private String submittedDate = null;
  private String totalSetSize = null;

  
  /**
   * Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.
   **/
  
  @ApiModelProperty(value = "Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.")
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  
  /**
   * The number of items returned in this response.
   **/
  
  @ApiModelProperty(value = "The number of items returned in this response.")
  @JsonProperty("batchSize")
  public String getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
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
   * The number of entries with a status of failed.
   **/
  
  @ApiModelProperty(value = "The number of entries with a status of failed.")
  @JsonProperty("failed")
  public String getFailed() {
    return failed;
  }
  public void setFailed(String failed) {
    this.failed = failed;
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
   * The number of entries with a status of queued.
   **/
  
  @ApiModelProperty(value = "The number of entries with a status of queued.")
  @JsonProperty("queued")
  public String getQueued() {
    return queued;
  }
  public void setQueued(String queued) {
    this.queued = queued;
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
   * The number of entries with a status of sent.
   **/
  
  @ApiModelProperty(value = "The number of entries with a status of sent.")
  @JsonProperty("sent")
  public String getSent() {
    return sent;
  }
  public void setSent(String sent) {
    this.sent = sent;
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
    BulkEnvelopeStatus bulkEnvelopeStatus = (BulkEnvelopeStatus) o;

    return true && Objects.equals(batchId, bulkEnvelopeStatus.batchId) &&
        Objects.equals(batchSize, bulkEnvelopeStatus.batchSize) &&
        Objects.equals(bulkEnvelopes, bulkEnvelopeStatus.bulkEnvelopes) &&
        Objects.equals(bulkEnvelopesBatchUri, bulkEnvelopeStatus.bulkEnvelopesBatchUri) &&
        Objects.equals(endPosition, bulkEnvelopeStatus.endPosition) &&
        Objects.equals(failed, bulkEnvelopeStatus.failed) &&
        Objects.equals(nextUri, bulkEnvelopeStatus.nextUri) &&
        Objects.equals(previousUri, bulkEnvelopeStatus.previousUri) &&
        Objects.equals(queued, bulkEnvelopeStatus.queued) &&
        Objects.equals(resultSetSize, bulkEnvelopeStatus.resultSetSize) &&
        Objects.equals(sent, bulkEnvelopeStatus.sent) &&
        Objects.equals(startPosition, bulkEnvelopeStatus.startPosition) &&
        Objects.equals(submittedDate, bulkEnvelopeStatus.submittedDate) &&
        Objects.equals(totalSetSize, bulkEnvelopeStatus.totalSetSize)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchSize, bulkEnvelopes, bulkEnvelopesBatchUri, endPosition, failed, nextUri, previousUri, queued, resultSetSize, sent, startPosition, submittedDate, totalSetSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelopeStatus {\n");
    
    if (batchId != null)
      sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    if (batchSize != null)
      sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    if (bulkEnvelopes != null)
      sb.append("    bulkEnvelopes: ").append(toIndentedString(bulkEnvelopes)).append("\n");
    if (bulkEnvelopesBatchUri != null)
      sb.append("    bulkEnvelopesBatchUri: ").append(toIndentedString(bulkEnvelopesBatchUri)).append("\n");
    if (endPosition != null)
      sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    if (failed != null)
      sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    if (nextUri != null)
      sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    if (previousUri != null)
      sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    if (queued != null)
      sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    if (resultSetSize != null)
      sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    if (sent != null)
      sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    if (startPosition != null)
      sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    if (submittedDate != null)
      sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
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

