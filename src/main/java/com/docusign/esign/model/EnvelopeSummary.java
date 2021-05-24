package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeSummary
 */

public class EnvelopeSummary {
  @JsonProperty("bulkEnvelopeStatus")
  private BulkEnvelopeStatus bulkEnvelopeStatus = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("recipientSigningUri")
  private String recipientSigningUri = null;

  @JsonProperty("recipientSigningUriError")
  private String recipientSigningUriError = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusDateTime")
  private String statusDateTime = null;

  @JsonProperty("uri")
  private String uri = null;

  public EnvelopeSummary bulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
    return this;
  }

   /**
   * Get bulkEnvelopeStatus
   * @return bulkEnvelopeStatus
  **/
  @ApiModelProperty(value = "")
  public BulkEnvelopeStatus getBulkEnvelopeStatus() {
    return bulkEnvelopeStatus;
  }

  public void setBulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
  }

  public EnvelopeSummary envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public EnvelopeSummary errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public EnvelopeSummary recipientSigningUri(String recipientSigningUri) {
    this.recipientSigningUri = recipientSigningUri;
    return this;
  }

   /**
   * 
   * @return recipientSigningUri
  **/
  @ApiModelProperty(value = "")
  public String getRecipientSigningUri() {
    return recipientSigningUri;
  }

  public void setRecipientSigningUri(String recipientSigningUri) {
    this.recipientSigningUri = recipientSigningUri;
  }

  public EnvelopeSummary recipientSigningUriError(String recipientSigningUriError) {
    this.recipientSigningUriError = recipientSigningUriError;
    return this;
  }

   /**
   * 
   * @return recipientSigningUriError
  **/
  @ApiModelProperty(value = "")
  public String getRecipientSigningUriError() {
    return recipientSigningUriError;
  }

  public void setRecipientSigningUriError(String recipientSigningUriError) {
    this.recipientSigningUriError = recipientSigningUriError;
  }

  public EnvelopeSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public EnvelopeSummary statusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
    return this;
  }

   /**
   * The DateTime that the envelope changed status (i.e. was created or sent.)
   * @return statusDateTime
  **/
  @ApiModelProperty(value = "The DateTime that the envelope changed status (i.e. was created or sent.)")
  public String getStatusDateTime() {
    return statusDateTime;
  }

  public void setStatusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
  }

  public EnvelopeSummary uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeSummary envelopeSummary = (EnvelopeSummary) o;
    return Objects.equals(this.bulkEnvelopeStatus, envelopeSummary.bulkEnvelopeStatus) &&
        Objects.equals(this.envelopeId, envelopeSummary.envelopeId) &&
        Objects.equals(this.errorDetails, envelopeSummary.errorDetails) &&
        Objects.equals(this.recipientSigningUri, envelopeSummary.recipientSigningUri) &&
        Objects.equals(this.recipientSigningUriError, envelopeSummary.recipientSigningUriError) &&
        Objects.equals(this.status, envelopeSummary.status) &&
        Objects.equals(this.statusDateTime, envelopeSummary.statusDateTime) &&
        Objects.equals(this.uri, envelopeSummary.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkEnvelopeStatus, envelopeId, errorDetails, recipientSigningUri, recipientSigningUriError, status, statusDateTime, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeSummary {\n");
    
    sb.append("    bulkEnvelopeStatus: ").append(toIndentedString(bulkEnvelopeStatus)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    recipientSigningUri: ").append(toIndentedString(recipientSigningUri)).append("\n");
    sb.append("    recipientSigningUriError: ").append(toIndentedString(recipientSigningUriError)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

