package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BulkEnvelope;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
   * The number of items returned in this response.
   **/
  public BulkEnvelopeStatus batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of items returned in this response.")
  @JsonProperty("batchSize")
  public String getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }

  
  /**
   * Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.
   **/
  public BulkEnvelopeStatus batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.")
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
  public BulkEnvelopeStatus bulkEnvelopesBatchUri(String bulkEnvelopesBatchUri) {
    this.bulkEnvelopesBatchUri = bulkEnvelopesBatchUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("bulkEnvelopesBatchUri")
  public String getBulkEnvelopesBatchUri() {
    return bulkEnvelopesBatchUri;
  }
  public void setBulkEnvelopesBatchUri(String bulkEnvelopesBatchUri) {
    this.bulkEnvelopesBatchUri = bulkEnvelopesBatchUri;
  }

  
  /**
   * The number of entries with a status of failed. 
   **/
  public BulkEnvelopeStatus failed(String failed) {
    this.failed = failed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of entries with a status of failed. ")
  @JsonProperty("failed")
  public String getFailed() {
    return failed;
  }
  public void setFailed(String failed) {
    this.failed = failed;
  }

  
  /**
   * The number of entries with a status of queued. 
   **/
  public BulkEnvelopeStatus queued(String queued) {
    this.queued = queued;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of entries with a status of queued. ")
  @JsonProperty("queued")
  public String getQueued() {
    return queued;
  }
  public void setQueued(String queued) {
    this.queued = queued;
  }

  
  /**
   * The number of entries with a status of sent.
   **/
  public BulkEnvelopeStatus sent(String sent) {
    this.sent = sent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of entries with a status of sent.")
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
  public BulkEnvelopeStatus submittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public BulkEnvelopeStatus resultSetSize(String resultSetSize) {
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
   * Starting position of the current result set.
   **/
  public BulkEnvelopeStatus startPosition(String startPosition) {
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
  public BulkEnvelopeStatus endPosition(String endPosition) {
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
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  public BulkEnvelopeStatus totalSetSize(String totalSetSize) {
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
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. 
   **/
  public BulkEnvelopeStatus nextUri(String nextUri) {
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
  public BulkEnvelopeStatus previousUri(String previousUri) {
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
   * Reserved: TBD
   **/
  public BulkEnvelopeStatus bulkEnvelopes(java.util.List<BulkEnvelope> bulkEnvelopes) {
    this.bulkEnvelopes = bulkEnvelopes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
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
    return Objects.equals(this.batchSize, bulkEnvelopeStatus.batchSize) &&
        Objects.equals(this.batchId, bulkEnvelopeStatus.batchId) &&
        Objects.equals(this.bulkEnvelopesBatchUri, bulkEnvelopeStatus.bulkEnvelopesBatchUri) &&
        Objects.equals(this.failed, bulkEnvelopeStatus.failed) &&
        Objects.equals(this.queued, bulkEnvelopeStatus.queued) &&
        Objects.equals(this.sent, bulkEnvelopeStatus.sent) &&
        Objects.equals(this.submittedDate, bulkEnvelopeStatus.submittedDate) &&
        Objects.equals(this.resultSetSize, bulkEnvelopeStatus.resultSetSize) &&
        Objects.equals(this.startPosition, bulkEnvelopeStatus.startPosition) &&
        Objects.equals(this.endPosition, bulkEnvelopeStatus.endPosition) &&
        Objects.equals(this.totalSetSize, bulkEnvelopeStatus.totalSetSize) &&
        Objects.equals(this.nextUri, bulkEnvelopeStatus.nextUri) &&
        Objects.equals(this.previousUri, bulkEnvelopeStatus.previousUri) &&
        Objects.equals(this.bulkEnvelopes, bulkEnvelopeStatus.bulkEnvelopes);
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

