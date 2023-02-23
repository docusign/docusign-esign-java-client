package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** DisplayApplianceDocumentPage */
public class DisplayApplianceDocumentPage {
  @JsonProperty("docPageCountTotal")
  private Integer docPageCountTotal = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("height72DPI")
  private Integer height72DPI = null;

  @JsonProperty("isAttachmentType")
  private Boolean isAttachmentType = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageId")
  private String pageId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("width72DPI")
  private Integer width72DPI = null;

  public DisplayApplianceDocumentPage docPageCountTotal(Integer docPageCountTotal) {
    this.docPageCountTotal = docPageCountTotal;
    return this;
  }

  /** @return docPageCountTotal */
  @Schema(example = "null", description = "")
  public Integer getDocPageCountTotal() {
    return docPageCountTotal;
  }

  public void setDocPageCountTotal(Integer docPageCountTotal) {
    this.docPageCountTotal = docPageCountTotal;
  }

  public DisplayApplianceDocumentPage documentId(String documentId) {
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
  @Schema(example = "null", description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DisplayApplianceDocumentPage documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /** @return documentName */
  @Schema(example = "null", description = "")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public DisplayApplianceDocumentPage extension(String extension) {
    this.extension = extension;
    return this;
  }

  /** @return extension */
  @Schema(example = "null", description = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public DisplayApplianceDocumentPage height72DPI(Integer height72DPI) {
    this.height72DPI = height72DPI;
    return this;
  }

  /** @return height72DPI */
  @Schema(example = "null", description = "")
  public Integer getHeight72DPI() {
    return height72DPI;
  }

  public void setHeight72DPI(Integer height72DPI) {
    this.height72DPI = height72DPI;
  }

  public DisplayApplianceDocumentPage isAttachmentType(Boolean isAttachmentType) {
    this.isAttachmentType = isAttachmentType;
    return this;
  }

  /** @return isAttachmentType */
  @Schema(example = "null", description = "")
  public Boolean getIsAttachmentType() {
    return isAttachmentType;
  }

  public void setIsAttachmentType(Boolean isAttachmentType) {
    this.isAttachmentType = isAttachmentType;
  }

  public DisplayApplianceDocumentPage page(Integer page) {
    this.page = page;
    return this;
  }

  /** @return page */
  @Schema(example = "null", description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public DisplayApplianceDocumentPage pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  /** @return pageId */
  @Schema(example = "null", description = "")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public DisplayApplianceDocumentPage type(String type) {
    this.type = type;
    return this;
  }

  /** @return type */
  @Schema(example = "null", description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DisplayApplianceDocumentPage width72DPI(Integer width72DPI) {
    this.width72DPI = width72DPI;
    return this;
  }

  /** @return width72DPI */
  @Schema(example = "null", description = "")
  public Integer getWidth72DPI() {
    return width72DPI;
  }

  public void setWidth72DPI(Integer width72DPI) {
    this.width72DPI = width72DPI;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceDocumentPage displayApplianceDocumentPage = (DisplayApplianceDocumentPage) o;
    return Objects.equals(this.docPageCountTotal, displayApplianceDocumentPage.docPageCountTotal)
        && Objects.equals(this.documentId, displayApplianceDocumentPage.documentId)
        && Objects.equals(this.documentName, displayApplianceDocumentPage.documentName)
        && Objects.equals(this.extension, displayApplianceDocumentPage.extension)
        && Objects.equals(this.height72DPI, displayApplianceDocumentPage.height72DPI)
        && Objects.equals(this.isAttachmentType, displayApplianceDocumentPage.isAttachmentType)
        && Objects.equals(this.page, displayApplianceDocumentPage.page)
        && Objects.equals(this.pageId, displayApplianceDocumentPage.pageId)
        && Objects.equals(this.type, displayApplianceDocumentPage.type)
        && Objects.equals(this.width72DPI, displayApplianceDocumentPage.width72DPI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        docPageCountTotal,
        documentId,
        documentName,
        extension,
        height72DPI,
        isAttachmentType,
        page,
        pageId,
        type,
        width72DPI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceDocumentPage {\n");

    sb.append("    docPageCountTotal: ").append(toIndentedString(docPageCountTotal)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    height72DPI: ").append(toIndentedString(height72DPI)).append("\n");
    sb.append("    isAttachmentType: ").append(toIndentedString(isAttachmentType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    width72DPI: ").append(toIndentedString(width72DPI)).append("\n");
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
