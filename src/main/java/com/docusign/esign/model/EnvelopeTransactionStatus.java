package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeTransactionStatus. */
public class EnvelopeTransactionStatus {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  /**
   * envelopeId.
   *
   * @return EnvelopeTransactionStatus
   */
  public EnvelopeTransactionStatus envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   *
   * @return envelopeId
   */
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /** setEnvelopeId. */
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  /**
   * errorDetails.
   *
   * @return EnvelopeTransactionStatus
   */
  public EnvelopeTransactionStatus errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * status.
   *
   * @return EnvelopeTransactionStatus
   */
  public EnvelopeTransactionStatus status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is sent to the
   * recipients. * created - The envelope is saved as a draft and can be modified and sent later..
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /** setStatus. */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * transactionId.
   *
   * @return EnvelopeTransactionStatus
   */
  public EnvelopeTransactionStatus transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign
   * system for 7 days. It is recommended that a transaction ID is used for offline signing to
   * ensure that an envelope is not sent multiple times. The `transactionId` property can be used
   * determine an envelope's status (i.e. was it created or not) in cases where the internet
   * connection was lost before the envelope status was returned..
   *
   * @return transactionId
   */
  @ApiModelProperty(
      value =
          " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  public String getTransactionId() {
    return transactionId;
  }

  /** setTransactionId. */
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
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
    EnvelopeTransactionStatus envelopeTransactionStatus = (EnvelopeTransactionStatus) o;
    return Objects.equals(this.envelopeId, envelopeTransactionStatus.envelopeId)
        && Objects.equals(this.errorDetails, envelopeTransactionStatus.errorDetails)
        && Objects.equals(this.status, envelopeTransactionStatus.status)
        && Objects.equals(this.transactionId, envelopeTransactionStatus.transactionId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, errorDetails, status, transactionId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTransactionStatus {\n");

    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
