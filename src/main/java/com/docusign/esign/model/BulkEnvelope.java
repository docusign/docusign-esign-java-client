package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkEnvelope
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

  public BulkEnvelope bulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
    return this;
  }

   /**
   * Reserved: TBD
   * @return bulkRecipientRow
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBulkRecipientRow() {
    return bulkRecipientRow;
  }

  public void setBulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
  }

  public BulkEnvelope bulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
    return this;
  }

   /**
   * Indicates the status of the bulk send operation. Returned values can be: * queued * processing * sent * failed
   * @return bulkStatus
  **/
  @ApiModelProperty(example = "null", value = "Indicates the status of the bulk send operation. Returned values can be: * queued * processing * sent * failed")
  public String getBulkStatus() {
    return bulkStatus;
  }

  public void setBulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
  }

  public BulkEnvelope email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BulkEnvelope envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public BulkEnvelope envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   * @return envelopeUri
  **/
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  public BulkEnvelope errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public BulkEnvelope name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkEnvelope submittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
    return this;
  }

   /**
   * 
   * @return submittedDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubmittedDateTime() {
    return submittedDateTime;
  }

  public void setSubmittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
  }

  public BulkEnvelope transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   * @return transactionId
  **/
  @ApiModelProperty(example = "null", value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipientRow, bulkStatus, email, envelopeId, envelopeUri, errorDetails, name, submittedDateTime, transactionId);
  }


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

