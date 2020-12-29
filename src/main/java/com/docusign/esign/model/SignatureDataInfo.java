package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocumentSecurityStore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignatureDataInfo
 */

public class SignatureDataInfo {
  @JsonProperty("documentSecurityStore")
  private DocumentSecurityStore documentSecurityStore = null;

  @JsonProperty("signatureData")
  private String signatureData = null;

  @JsonProperty("signatureFieldName")
  private String signatureFieldName = null;

  public SignatureDataInfo documentSecurityStore(DocumentSecurityStore documentSecurityStore) {
    this.documentSecurityStore = documentSecurityStore;
    return this;
  }

   /**
   * Get documentSecurityStore
   * @return documentSecurityStore
  **/
  @ApiModelProperty(value = "")
  public DocumentSecurityStore getDocumentSecurityStore() {
    return documentSecurityStore;
  }

  public void setDocumentSecurityStore(DocumentSecurityStore documentSecurityStore) {
    this.documentSecurityStore = documentSecurityStore;
  }

  public SignatureDataInfo signatureData(String signatureData) {
    this.signatureData = signatureData;
    return this;
  }

   /**
   * 
   * @return signatureData
  **/
  @ApiModelProperty(value = "")
  public String getSignatureData() {
    return signatureData;
  }

  public void setSignatureData(String signatureData) {
    this.signatureData = signatureData;
  }

  public SignatureDataInfo signatureFieldName(String signatureFieldName) {
    this.signatureFieldName = signatureFieldName;
    return this;
  }

   /**
   * 
   * @return signatureFieldName
  **/
  @ApiModelProperty(value = "")
  public String getSignatureFieldName() {
    return signatureFieldName;
  }

  public void setSignatureFieldName(String signatureFieldName) {
    this.signatureFieldName = signatureFieldName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureDataInfo signatureDataInfo = (SignatureDataInfo) o;
    return Objects.equals(this.documentSecurityStore, signatureDataInfo.documentSecurityStore) &&
        Objects.equals(this.signatureData, signatureDataInfo.signatureData) &&
        Objects.equals(this.signatureFieldName, signatureDataInfo.signatureFieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentSecurityStore, signatureData, signatureFieldName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureDataInfo {\n");
    
    sb.append("    documentSecurityStore: ").append(toIndentedString(documentSecurityStore)).append("\n");
    sb.append("    signatureData: ").append(toIndentedString(signatureData)).append("\n");
    sb.append("    signatureFieldName: ").append(toIndentedString(signatureFieldName)).append("\n");
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

