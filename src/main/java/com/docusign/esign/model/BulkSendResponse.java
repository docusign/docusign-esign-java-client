package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The object contains the response to a bulk send request..
 *
 */
@Schema(description = "The object contains the response to a bulk send request.")

public class BulkSendResponse {
  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("batchName")
  private String batchName = null;

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


  /**
   * batchId.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * .
   * @return batchId
   **/
  @Schema(description = "")
  public String getBatchId() {
    return batchId;
  }

  /**
   * setBatchId.
   **/
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  /**
   * batchName.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * .
   * @return batchName
   **/
  @Schema(description = "")
  public String getBatchName() {
    return batchName;
  }

  /**
   * setBatchName.
   **/
  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


  /**
   * batchSize.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse batchSize(String batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  /**
   * .
   * @return batchSize
   **/
  @Schema(description = "")
  public String getBatchSize() {
    return batchSize;
  }

  /**
   * setBatchSize.
   **/
  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }


  /**
   * envelopeOrTemplateId.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse envelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
    return this;
  }

  /**
   * .
   * @return envelopeOrTemplateId
   **/
  @Schema(description = "")
  public String getEnvelopeOrTemplateId() {
    return envelopeOrTemplateId;
  }

  /**
   * setEnvelopeOrTemplateId.
   **/
  public void setEnvelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
  }


  /**
   * errorDetails.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse errorDetails(java.util.List<String> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  /**
   * addErrorDetailsItem.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse addErrorDetailsItem(String errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new java.util.ArrayList<>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public java.util.List<String> getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(java.util.List<String> errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * errors.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse errors(java.util.List<String> errors) {
    this.errors = errors;
    return this;
  }
  
  /**
   * addErrorsItem.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new java.util.ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * .
   * @return errors
   **/
  @Schema(description = "")
  public java.util.List<String> getErrors() {
    return errors;
  }

  /**
   * setErrors.
   **/
  public void setErrors(java.util.List<String> errors) {
    this.errors = errors;
  }


  /**
   * queueLimit.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse queueLimit(String queueLimit) {
    this.queueLimit = queueLimit;
    return this;
  }

  /**
   * .
   * @return queueLimit
   **/
  @Schema(description = "")
  public String getQueueLimit() {
    return queueLimit;
  }

  /**
   * setQueueLimit.
   **/
  public void setQueueLimit(String queueLimit) {
    this.queueLimit = queueLimit;
  }


  /**
   * totalQueued.
   *
   * @return BulkSendResponse
   **/
  public BulkSendResponse totalQueued(String totalQueued) {
    this.totalQueued = totalQueued;
    return this;
  }

  /**
   * .
   * @return totalQueued
   **/
  @Schema(description = "")
  public String getTotalQueued() {
    return totalQueued;
  }

  /**
   * setTotalQueued.
   **/
  public void setTotalQueued(String totalQueued) {
    this.totalQueued = totalQueued;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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
        Objects.equals(this.batchName, bulkSendResponse.batchName) &&
        Objects.equals(this.batchSize, bulkSendResponse.batchSize) &&
        Objects.equals(this.envelopeOrTemplateId, bulkSendResponse.envelopeOrTemplateId) &&
        Objects.equals(this.errorDetails, bulkSendResponse.errorDetails) &&
        Objects.equals(this.errors, bulkSendResponse.errors) &&
        Objects.equals(this.queueLimit, bulkSendResponse.queueLimit) &&
        Objects.equals(this.totalQueued, bulkSendResponse.totalQueued);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchName, batchSize, envelopeOrTemplateId, errorDetails, errors, queueLimit, totalQueued);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendResponse {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
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

