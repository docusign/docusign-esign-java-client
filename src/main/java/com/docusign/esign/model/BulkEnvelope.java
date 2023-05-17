package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BulkEnvelope.
 *
 */

public class BulkEnvelope {
  @JsonProperty("bulkRecipientRow")
  private String bulkRecipientRow = null;

  @JsonProperty("bulkStatus")
  private String bulkStatus = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeUri")
  private String envelopeUri = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("submittedDateTime")
  private String submittedDateTime = null;

  @JsonProperty("transactionId")
  private String transactionId = null;


  /**
   * bulkRecipientRow.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope bulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return bulkRecipientRow
   **/
  @Schema(description = "Reserved: TBD")
  public String getBulkRecipientRow() {
    return bulkRecipientRow;
  }

  /**
   * setBulkRecipientRow.
   **/
  public void setBulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
  }


  /**
   * bulkStatus.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope bulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
    return this;
  }

  /**
   * Indicates the status of the bulk send operation. Returned values can be: * queued * processing * sent * failed.
   * @return bulkStatus
   **/
  @Schema(description = "Indicates the status of the bulk send operation. Returned values can be: * queued * processing * sent * failed")
  public String getBulkStatus() {
    return bulkStatus;
  }

  /**
   * setBulkStatus.
   **/
  public void setBulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
  }


  /**
   * email.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * envelopeId.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope envelopeId(String envelopeId) {
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
   * envelopeUri.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes..
   * @return envelopeUri
   **/
  @Schema(description = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  /**
   * setEnvelopeUri.
   **/
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }


  /**
   * errorDetails.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope errorDetails(ErrorDetails errorDetails) {
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
   * name.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * submittedDateTime.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope submittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
    return this;
  }

  /**
   * .
   * @return submittedDateTime
   **/
  @Schema(description = "")
  public String getSubmittedDateTime() {
    return submittedDateTime;
  }

  /**
   * setSubmittedDateTime.
   **/
  public void setSubmittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
  }


  /**
   * transactionId.
   *
   * @return BulkEnvelope
   **/
  public BulkEnvelope transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned..
   * @return transactionId
   **/
  @Schema(description = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  public String getTransactionId() {
    return transactionId;
  }

  /**
   * setTransactionId.
   **/
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
    BulkEnvelope bulkEnvelope = (BulkEnvelope) o;
    return Objects.equals(this.bulkRecipientRow, bulkEnvelope.bulkRecipientRow) &&
        Objects.equals(this.bulkStatus, bulkEnvelope.bulkStatus) &&
        Objects.equals(this.email, bulkEnvelope.email) &&
        Objects.equals(this.envelopeId, bulkEnvelope.envelopeId) &&
        Objects.equals(this.envelopeUri, bulkEnvelope.envelopeUri) &&
        Objects.equals(this.errorDetails, bulkEnvelope.errorDetails) &&
        Objects.equals(this.name, bulkEnvelope.name) &&
        Objects.equals(this.submittedDateTime, bulkEnvelope.submittedDateTime) &&
        Objects.equals(this.transactionId, bulkEnvelope.transactionId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipientRow, bulkStatus, email, envelopeId, envelopeUri, errorDetails, name, submittedDateTime, transactionId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelope {\n");
    
    sb.append("    bulkRecipientRow: ").append(toIndentedString(bulkRecipientRow)).append("\n");
    sb.append("    bulkStatus: ").append(toIndentedString(bulkStatus)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submittedDateTime: ").append(toIndentedString(submittedDateTime)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

