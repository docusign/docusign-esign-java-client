package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentUpdateInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CompleteSignRequest
 */

public class CompleteSignRequest {
  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("documentUpdateInfos")
  private java.util.List<DocumentUpdateInfo> documentUpdateInfos = new java.util.ArrayList<DocumentUpdateInfo>();

  @JsonProperty("signingLocation")
  private String signingLocation = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  public CompleteSignRequest correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * 
   * @return correlationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public CompleteSignRequest documentUpdateInfos(java.util.List<DocumentUpdateInfo> documentUpdateInfos) {
    this.documentUpdateInfos = documentUpdateInfos;
    return this;
  }

  public CompleteSignRequest addDocumentUpdateInfosItem(DocumentUpdateInfo documentUpdateInfosItem) {
    this.documentUpdateInfos.add(documentUpdateInfosItem);
    return this;
  }

   /**
   * 
   * @return documentUpdateInfos
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DocumentUpdateInfo> getDocumentUpdateInfos() {
    return documentUpdateInfos;
  }

  public void setDocumentUpdateInfos(java.util.List<DocumentUpdateInfo> documentUpdateInfos) {
    this.documentUpdateInfos = documentUpdateInfos;
  }

  public CompleteSignRequest signingLocation(String signingLocation) {
    this.signingLocation = signingLocation;
    return this;
  }

   /**
   * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.
   * @return signingLocation
  **/
  @ApiModelProperty(example = "null", value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
  public String getSigningLocation() {
    return signingLocation;
  }

  public void setSigningLocation(String signingLocation) {
    this.signingLocation = signingLocation;
  }

  public CompleteSignRequest transactionId(String transactionId) {
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
    CompleteSignRequest completeSignRequest = (CompleteSignRequest) o;
    return Objects.equals(this.correlationId, completeSignRequest.correlationId) &&
        Objects.equals(this.documentUpdateInfos, completeSignRequest.documentUpdateInfos) &&
        Objects.equals(this.signingLocation, completeSignRequest.signingLocation) &&
        Objects.equals(this.transactionId, completeSignRequest.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, documentUpdateInfos, signingLocation, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteSignRequest {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    documentUpdateInfos: ").append(toIndentedString(documentUpdateInfos)).append("\n");
    sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
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

