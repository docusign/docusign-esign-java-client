package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendResponse
 */

public class BulkSendResponse {
  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("batchSize")
  private String batchSize = null;

  @JsonProperty("envelopeOrTemplateId")
  private String envelopeOrTemplateId = null;

  @JsonProperty("errorDetails")
  private java.util.List<String> errorDetails = null;

  @JsonProperty("errors")
  private java.util.List<String> errors = null;

  @JsonProperty("queueLimit")
  private String queueLimit = null;

  @JsonProperty("totalQueued")
  private String totalQueued = null;

  public BulkSendResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * 
   * @return batchId
  **/
  @ApiModelProperty(value = "")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public BulkSendResponse batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * 
   * @return batchSize
  **/
  @ApiModelProperty(value = "")
  public String getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }

  public BulkSendResponse envelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
    return this;
  }

   /**
   * 
   * @return envelopeOrTemplateId
  **/
  @ApiModelProperty(value = "")
  public String getEnvelopeOrTemplateId() {
    return envelopeOrTemplateId;
  }

  public void setEnvelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
  }

  public BulkSendResponse errorDetails(java.util.List<String> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  public BulkSendResponse addErrorDetailsItem(String errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new java.util.ArrayList<String>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

   /**
   * Array or errors.
   * @return errorDetails
  **/
  @ApiModelProperty(value = "Array or errors.")
  public java.util.List<String> getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(java.util.List<String> errorDetails) {
    this.errorDetails = errorDetails;
  }

  public BulkSendResponse errors(java.util.List<String> errors) {
    this.errors = errors;
    return this;
  }

  public BulkSendResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getErrors() {
    return errors;
  }

  public void setErrors(java.util.List<String> errors) {
    this.errors = errors;
  }

  public BulkSendResponse queueLimit(String queueLimit) {
    this.queueLimit = queueLimit;
    return this;
  }

   /**
   * 
   * @return queueLimit
  **/
  @ApiModelProperty(value = "")
  public String getQueueLimit() {
    return queueLimit;
  }

  public void setQueueLimit(String queueLimit) {
    this.queueLimit = queueLimit;
  }

  public BulkSendResponse totalQueued(String totalQueued) {
    this.totalQueued = totalQueued;
    return this;
  }

   /**
   * 
   * @return totalQueued
  **/
  @ApiModelProperty(value = "")
  public String getTotalQueued() {
    return totalQueued;
  }

  public void setTotalQueued(String totalQueued) {
    this.totalQueued = totalQueued;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendResponse bulkSendResponse = (BulkSendResponse) o;
    return Objects.equals(this.batchId, bulkSendResponse.batchId) &&
        Objects.equals(this.batchSize, bulkSendResponse.batchSize) &&
        Objects.equals(this.envelopeOrTemplateId, bulkSendResponse.envelopeOrTemplateId) &&
        Objects.equals(this.errorDetails, bulkSendResponse.errorDetails) &&
        Objects.equals(this.errors, bulkSendResponse.errors) &&
        Objects.equals(this.queueLimit, bulkSendResponse.queueLimit) &&
        Objects.equals(this.totalQueued, bulkSendResponse.totalQueued);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchSize, envelopeOrTemplateId, errorDetails, errors, queueLimit, totalQueued);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendResponse {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    envelopeOrTemplateId: ").append(toIndentedString(envelopeOrTemplateId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    queueLimit: ").append(toIndentedString(queueLimit)).append("\n");
    sb.append("    totalQueued: ").append(toIndentedString(totalQueued)).append("\n");
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

