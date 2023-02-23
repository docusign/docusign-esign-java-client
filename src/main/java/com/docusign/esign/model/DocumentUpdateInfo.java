package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** DocumentUpdateInfo */
public class DocumentUpdateInfo {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentSecurityStore")
  private DocumentSecurityStore documentSecurityStore = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("returnFormat")
  private String returnFormat = null;

  @JsonProperty("signatureDataInfos")
  private java.util.List<SignatureDataInfo> signatureDataInfos = null;

  @JsonProperty("timeStampField")
  private TimeStampField timeStampField = null;

  public DocumentUpdateInfo data(String data) {
    this.data = data;
    return this;
  }

  /** @return data */
  @Schema(description = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public DocumentUpdateInfo documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer
   * to an existing
   * Document's ID attribute.
   *
   * @return documentId
   */
  @Schema(description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DocumentUpdateInfo documentSecurityStore(DocumentSecurityStore documentSecurityStore) {
    this.documentSecurityStore = documentSecurityStore;
    return this;
  }

  /**
   * Get documentSecurityStore
   *
   * @return documentSecurityStore
   */
  @Schema(description = "")
  public DocumentSecurityStore getDocumentSecurityStore() {
    return documentSecurityStore;
  }

  public void setDocumentSecurityStore(DocumentSecurityStore documentSecurityStore) {
    this.documentSecurityStore = documentSecurityStore;
  }

  public DocumentUpdateInfo name(String name) {
    this.name = name;
    return this;
  }

  /** @return name */
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentUpdateInfo returnFormat(String returnFormat) {
    this.returnFormat = returnFormat;
    return this;
  }

  /** @return returnFormat */
  @Schema(description = "")
  public String getReturnFormat() {
    return returnFormat;
  }

  public void setReturnFormat(String returnFormat) {
    this.returnFormat = returnFormat;
  }

  public DocumentUpdateInfo signatureDataInfos(
      java.util.List<SignatureDataInfo> signatureDataInfos) {
    this.signatureDataInfos = signatureDataInfos;
    return this;
  }

  public DocumentUpdateInfo addSignatureDataInfosItem(SignatureDataInfo signatureDataInfosItem) {
    if (this.signatureDataInfos == null) {
      this.signatureDataInfos = new java.util.ArrayList<SignatureDataInfo>();
    }
    this.signatureDataInfos.add(signatureDataInfosItem);
    return this;
  }

  /** @return signatureDataInfos */
  @Schema(description = "")
  public java.util.List<SignatureDataInfo> getSignatureDataInfos() {
    return signatureDataInfos;
  }

  public void setSignatureDataInfos(java.util.List<SignatureDataInfo> signatureDataInfos) {
    this.signatureDataInfos = signatureDataInfos;
  }

  public DocumentUpdateInfo timeStampField(TimeStampField timeStampField) {
    this.timeStampField = timeStampField;
    return this;
  }

  /**
   * Get timeStampField
   *
   * @return timeStampField
   */
  @Schema(description = "")
  public TimeStampField getTimeStampField() {
    return timeStampField;
  }

  public void setTimeStampField(TimeStampField timeStampField) {
    this.timeStampField = timeStampField;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUpdateInfo documentUpdateInfo = (DocumentUpdateInfo) o;
    return Objects.equals(this.data, documentUpdateInfo.data)
        && Objects.equals(this.documentId, documentUpdateInfo.documentId)
        && Objects.equals(this.documentSecurityStore, documentUpdateInfo.documentSecurityStore)
        && Objects.equals(this.name, documentUpdateInfo.name)
        && Objects.equals(this.returnFormat, documentUpdateInfo.returnFormat)
        && Objects.equals(this.signatureDataInfos, documentUpdateInfo.signatureDataInfos)
        && Objects.equals(this.timeStampField, documentUpdateInfo.timeStampField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        data,
        documentId,
        documentSecurityStore,
        name,
        returnFormat,
        signatureDataInfos,
        timeStampField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpdateInfo {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentSecurityStore: ")
        .append(toIndentedString(documentSecurityStore))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    returnFormat: ").append(toIndentedString(returnFormat)).append("\n");
    sb.append("    signatureDataInfos: ").append(toIndentedString(signatureDataInfos)).append("\n");
    sb.append("    timeStampField: ").append(toIndentedString(timeStampField)).append("\n");
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
