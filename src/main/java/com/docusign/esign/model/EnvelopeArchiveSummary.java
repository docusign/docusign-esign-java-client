package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopeArchiveSummary.
 *
 */

public class EnvelopeArchiveSummary implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * bulkEnvelopeStatus.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary bulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
    return this;
  }

  /**
   * .
   * @return bulkEnvelopeStatus
   **/
  @Schema(description = "")
  public BulkEnvelopeStatus getBulkEnvelopeStatus() {
    return bulkEnvelopeStatus;
  }

  /**
   * setBulkEnvelopeStatus.
   **/
  public void setBulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
    this.bulkEnvelopeStatus = bulkEnvelopeStatus;
  }


  /**
   * envelopeId.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @Schema(description = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * errorDetails.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * recipientSigningUri.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary recipientSigningUri(String recipientSigningUri) {
    this.recipientSigningUri = recipientSigningUri;
    return this;
  }

  /**
   * .
   * @return recipientSigningUri
   **/
  @Schema(description = "")
  public String getRecipientSigningUri() {
    return recipientSigningUri;
  }

  /**
   * setRecipientSigningUri.
   **/
  public void setRecipientSigningUri(String recipientSigningUri) {
    this.recipientSigningUri = recipientSigningUri;
  }


  /**
   * recipientSigningUriError.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary recipientSigningUriError(String recipientSigningUriError) {
    this.recipientSigningUriError = recipientSigningUriError;
    return this;
  }

  /**
   * .
   * @return recipientSigningUriError
   **/
  @Schema(description = "")
  public String getRecipientSigningUriError() {
    return recipientSigningUriError;
  }

  /**
   * setRecipientSigningUriError.
   **/
  public void setRecipientSigningUriError(String recipientSigningUriError) {
    this.recipientSigningUriError = recipientSigningUriError;
  }


  /**
   * status.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * statusDateTime.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary statusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
    return this;
  }

  /**
   * .
   * @return statusDateTime
   **/
  @Schema(description = "")
  public String getStatusDateTime() {
    return statusDateTime;
  }

  /**
   * setStatusDateTime.
   **/
  public void setStatusDateTime(String statusDateTime) {
    this.statusDateTime = statusDateTime;
  }


  /**
   * uri.
   *
   * @return EnvelopeArchiveSummary
   **/
  public EnvelopeArchiveSummary uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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
    EnvelopeArchiveSummary envelopeArchiveSummary = (EnvelopeArchiveSummary) o;
    return Objects.equals(this.bulkEnvelopeStatus, envelopeArchiveSummary.bulkEnvelopeStatus) &&
        Objects.equals(this.envelopeId, envelopeArchiveSummary.envelopeId) &&
        Objects.equals(this.errorDetails, envelopeArchiveSummary.errorDetails) &&
        Objects.equals(this.recipientSigningUri, envelopeArchiveSummary.recipientSigningUri) &&
        Objects.equals(this.recipientSigningUriError, envelopeArchiveSummary.recipientSigningUriError) &&
        Objects.equals(this.status, envelopeArchiveSummary.status) &&
        Objects.equals(this.statusDateTime, envelopeArchiveSummary.statusDateTime) &&
        Objects.equals(this.uri, envelopeArchiveSummary.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkEnvelopeStatus, envelopeId, errorDetails, recipientSigningUri, recipientSigningUriError, status, statusDateTime, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeArchiveSummary {\n");
    
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

