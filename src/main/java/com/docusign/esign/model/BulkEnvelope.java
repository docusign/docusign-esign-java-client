package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class BulkEnvelope   {
  
  private String transactionId = null;
  private String submittedDateTime = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private String bulkRecipientRow = null;
  private String name = null;
  private String email = null;
  private String bulkStatus = null;
  private ErrorDetails errorDetails = null;

  
  /**
   *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
   **/
  public BulkEnvelope transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * 
   **/
  public BulkEnvelope submittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("submittedDateTime")
  public String getSubmittedDateTime() {
    return submittedDateTime;
  }
  public void setSubmittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
  }

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  public BulkEnvelope envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
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
  public BulkEnvelope envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  @JsonProperty("envelopeUri")
  public String getEnvelopeUri() {
    return envelopeUri;
  }
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  
  /**
   * Reserved: TBD
   **/
  public BulkEnvelope bulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  @JsonProperty("bulkRecipientRow")
  public String getBulkRecipientRow() {
    return bulkRecipientRow;
  }
  public void setBulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
  }

  
  /**
   * 
   **/
  public BulkEnvelope name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public BulkEnvelope email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indicates the status of the bulk send operation. Returned values can be:\n* queued\n* processing\n* sent\n* failed
   **/
  public BulkEnvelope bulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the status of the bulk send operation. Returned values can be:\n* queued\n* processing\n* sent\n* failed")
  @JsonProperty("bulkStatus")
  public String getBulkStatus() {
    return bulkStatus;
  }
  public void setBulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
  }

  
  /**
   **/
  public BulkEnvelope errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
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
    return Objects.equals(this.transactionId, bulkEnvelope.transactionId) &&
        Objects.equals(this.submittedDateTime, bulkEnvelope.submittedDateTime) &&
        Objects.equals(this.envelopeId, bulkEnvelope.envelopeId) &&
        Objects.equals(this.envelopeUri, bulkEnvelope.envelopeUri) &&
        Objects.equals(this.bulkRecipientRow, bulkEnvelope.bulkRecipientRow) &&
        Objects.equals(this.name, bulkEnvelope.name) &&
        Objects.equals(this.email, bulkEnvelope.email) &&
        Objects.equals(this.bulkStatus, bulkEnvelope.bulkStatus) &&
        Objects.equals(this.errorDetails, bulkEnvelope.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, submittedDateTime, envelopeId, envelopeUri, bulkRecipientRow, name, email, bulkStatus, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelope {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    submittedDateTime: ").append(toIndentedString(submittedDateTime)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    bulkRecipientRow: ").append(toIndentedString(bulkRecipientRow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    bulkStatus: ").append(toIndentedString(bulkStatus)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

