package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DisplayApplianceDocument */
public class DisplayApplianceDocument {
  @JsonProperty("attachmentDescription")
  private String attachmentDescription = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentType")
  private String documentType = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("externalDocumentId")
  private String externalDocumentId = null;

  @JsonProperty("latestPDFId")
  private String latestPDFId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pages")
  private Integer pages = null;

  public DisplayApplianceDocument attachmentDescription(String attachmentDescription) {
    this.attachmentDescription = attachmentDescription;
    return this;
  }

  /** @return attachmentDescription */
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentDescription() {
    return attachmentDescription;
  }

  public void setAttachmentDescription(String attachmentDescription) {
    this.attachmentDescription = attachmentDescription;
  }

  public DisplayApplianceDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing
   * Document's ID attribute.
   *
   * @return documentId
   */
  @ApiModelProperty(
      example = "null",
      value =
          "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DisplayApplianceDocument documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /** @return documentType */
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public DisplayApplianceDocument envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post.
   *
   * @return envelopeId
   */
  @ApiModelProperty(
      example = "null",
      value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public DisplayApplianceDocument externalDocumentId(String externalDocumentId) {
    this.externalDocumentId = externalDocumentId;
    return this;
  }

  /** @return externalDocumentId */
  @ApiModelProperty(example = "null", value = "")
  public String getExternalDocumentId() {
    return externalDocumentId;
  }

  public void setExternalDocumentId(String externalDocumentId) {
    this.externalDocumentId = externalDocumentId;
  }

  public DisplayApplianceDocument latestPDFId(String latestPDFId) {
    this.latestPDFId = latestPDFId;
    return this;
  }

  /** @return latestPDFId */
  @ApiModelProperty(example = "null", value = "")
  public String getLatestPDFId() {
    return latestPDFId;
  }

  public void setLatestPDFId(String latestPDFId) {
    this.latestPDFId = latestPDFId;
  }

  public DisplayApplianceDocument name(String name) {
    this.name = name;
    return this;
  }

  /** @return name */
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DisplayApplianceDocument pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /** @return pages */
  @ApiModelProperty(example = "null", value = "")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceDocument displayApplianceDocument = (DisplayApplianceDocument) o;
    return Objects.equals(
            this.attachmentDescription, displayApplianceDocument.attachmentDescription)
        && Objects.equals(this.documentId, displayApplianceDocument.documentId)
        && Objects.equals(this.documentType, displayApplianceDocument.documentType)
        && Objects.equals(this.envelopeId, displayApplianceDocument.envelopeId)
        && Objects.equals(this.externalDocumentId, displayApplianceDocument.externalDocumentId)
        && Objects.equals(this.latestPDFId, displayApplianceDocument.latestPDFId)
        && Objects.equals(this.name, displayApplianceDocument.name)
        && Objects.equals(this.pages, displayApplianceDocument.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachmentDescription,
        documentId,
        documentType,
        envelopeId,
        externalDocumentId,
        latestPDFId,
        name,
        pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceDocument {\n");

    sb.append("    attachmentDescription: ")
        .append(toIndentedString(attachmentDescription))
        .append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    externalDocumentId: ").append(toIndentedString(externalDocumentId)).append("\n");
    sb.append("    latestPDFId: ").append(toIndentedString(latestPDFId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
