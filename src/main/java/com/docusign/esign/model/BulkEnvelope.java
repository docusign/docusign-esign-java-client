package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BulkEnvelope   {
  
  private String bulkRecipientRow = null;
  private String bulkStatus = null;
  private String email = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private ErrorDetails errorDetails = null;
  private String name = null;
  private String submittedDateTime = null;
  private String transactionId = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("bulkRecipientRow")
  public String getBulkRecipientRow() {
    return bulkRecipientRow;
  }
  public void setBulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
  }

  
  /**
   * Indicates the status of the bulk send operation. Returned values can be:\n* queued\n* processing\n* sent\n* failed
   **/
  
  @ApiModelProperty(value = "Indicates the status of the bulk send operation. Returned values can be:\n* queued\n* processing\n* sent\n* failed")
  @JsonProperty("bulkStatus")
  public String getBulkStatus() {
    return bulkStatus;
  }
  public void setBulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  @JsonProperty("envelopeUri")
  public String getEnvelopeUri() {
    return envelopeUri;
  }
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("submittedDateTime")
  public String getSubmittedDateTime() {
    return submittedDateTime;
  }
  public void setSubmittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
  }

  
  /**
   * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   **/
  
  @ApiModelProperty(value = "Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  @JsonProperty("transactionId")
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

    return true && Objects.equals(bulkRecipientRow, bulkEnvelope.bulkRecipientRow) &&
        Objects.equals(bulkStatus, bulkEnvelope.bulkStatus) &&
        Objects.equals(email, bulkEnvelope.email) &&
        Objects.equals(envelopeId, bulkEnvelope.envelopeId) &&
        Objects.equals(envelopeUri, bulkEnvelope.envelopeUri) &&
        Objects.equals(errorDetails, bulkEnvelope.errorDetails) &&
        Objects.equals(name, bulkEnvelope.name) &&
        Objects.equals(submittedDateTime, bulkEnvelope.submittedDateTime) &&
        Objects.equals(transactionId, bulkEnvelope.transactionId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRecipientRow, bulkStatus, email, envelopeId, envelopeUri, errorDetails, name, submittedDateTime, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelope {\n");
    
    if (bulkRecipientRow != null)
      sb.append("    bulkRecipientRow: ").append(toIndentedString(bulkRecipientRow)).append("\n");
    if (bulkStatus != null)
      sb.append("    bulkStatus: ").append(toIndentedString(bulkStatus)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (envelopeUri != null)
      sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (submittedDateTime != null)
      sb.append("    submittedDateTime: ").append(toIndentedString(submittedDateTime)).append("\n");
    if (transactionId != null)
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

