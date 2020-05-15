package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendTestResponse
 */

public class BulkSendTestResponse {
  @JsonProperty("canBeSent")
  private Boolean canBeSent = null;

  @JsonProperty("validationErrorDetails")
  private java.util.List<String> validationErrorDetails = null;

  @JsonProperty("validationErrors")
  private java.util.List<String> validationErrors = null;

  public BulkSendTestResponse canBeSent(Boolean canBeSent) {
    this.canBeSent = canBeSent;
    return this;
  }

   /**
   * 
   * @return canBeSent
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanBeSent() {
    return canBeSent;
  }

  public void setCanBeSent(Boolean canBeSent) {
    this.canBeSent = canBeSent;
  }

  public BulkSendTestResponse validationErrorDetails(java.util.List<String> validationErrorDetails) {
    this.validationErrorDetails = validationErrorDetails;
    return this;
  }

  public BulkSendTestResponse addValidationErrorDetailsItem(String validationErrorDetailsItem) {
    if (this.validationErrorDetails == null) {
      this.validationErrorDetails = new java.util.ArrayList<String>();
    }
    this.validationErrorDetails.add(validationErrorDetailsItem);
    return this;
  }

   /**
   * 
   * @return validationErrorDetails
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getValidationErrorDetails() {
    return validationErrorDetails;
  }

  public void setValidationErrorDetails(java.util.List<String> validationErrorDetails) {
    this.validationErrorDetails = validationErrorDetails;
  }

  public BulkSendTestResponse validationErrors(java.util.List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public BulkSendTestResponse addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new java.util.ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * 
   * @return validationErrors
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(java.util.List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendTestResponse bulkSendTestResponse = (BulkSendTestResponse) o;
    return Objects.equals(this.canBeSent, bulkSendTestResponse.canBeSent) &&
        Objects.equals(this.validationErrorDetails, bulkSendTestResponse.validationErrorDetails) &&
        Objects.equals(this.validationErrors, bulkSendTestResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canBeSent, validationErrorDetails, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendTestResponse {\n");
    
    sb.append("    canBeSent: ").append(toIndentedString(canBeSent)).append("\n");
    sb.append("    validationErrorDetails: ").append(toIndentedString(validationErrorDetails)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

