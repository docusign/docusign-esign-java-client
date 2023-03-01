package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** DisplayAppliancePage */
public class DisplayAppliancePage {
  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("externalDocumentId")
  private String externalDocumentId = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("isFirstPage")
  private Boolean isFirstPage = null;

  @JsonProperty("pageId")
  private String pageId = null;

  @JsonProperty("pageNo")
  private Integer pageNo = null;

  @JsonProperty("pageStatus")
  private String pageStatus = null;

  @JsonProperty("pageType")
  private String pageType = null;

  @JsonProperty("width")
  private Integer width = null;

  public DisplayAppliancePage documentId(String documentId) {
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

  public DisplayAppliancePage documentName(String documentName) {
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

  public DisplayAppliancePage externalDocumentId(String externalDocumentId) {
    this.externalDocumentId = externalDocumentId;
    return this;
  }

  /** @return externalDocumentId */
  @Schema(example = "null", description = "")
  public String getExternalDocumentId() {
    return externalDocumentId;
  }

  public void setExternalDocumentId(String externalDocumentId) {
    this.externalDocumentId = externalDocumentId;
  }

  public DisplayAppliancePage height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels.
   *
   * @return height
   */
  @Schema(example = "null", description = "Height of the tab in pixels.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public DisplayAppliancePage isFirstPage(Boolean isFirstPage) {
    this.isFirstPage = isFirstPage;
    return this;
  }

  /** @return isFirstPage */
  @Schema(example = "null", description = "")
  public Boolean getIsFirstPage() {
    return isFirstPage;
  }

  public void setIsFirstPage(Boolean isFirstPage) {
    this.isFirstPage = isFirstPage;
  }

  public DisplayAppliancePage pageId(String pageId) {
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

  public DisplayAppliancePage pageNo(Integer pageNo) {
    this.pageNo = pageNo;
    return this;
  }

  /** @return pageNo */
  @Schema(example = "null", description = "")
  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public DisplayAppliancePage pageStatus(String pageStatus) {
    this.pageStatus = pageStatus;
    return this;
  }

  /** @return pageStatus */
  @Schema(example = "null", description = "")
  public String getPageStatus() {
    return pageStatus;
  }

  public void setPageStatus(String pageStatus) {
    this.pageStatus = pageStatus;
  }

  public DisplayAppliancePage pageType(String pageType) {
    this.pageType = pageType;
    return this;
  }

  /** @return pageType */
  @Schema(example = "null", description = "")
  public String getPageType() {
    return pageType;
  }

  public void setPageType(String pageType) {
    this.pageType = pageType;
  }

  public DisplayAppliancePage width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels.
   *
   * @return width
   */
  @Schema(example = "null", description = "Width of the tab in pixels.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAppliancePage displayAppliancePage = (DisplayAppliancePage) o;
    return Objects.equals(this.documentId, displayAppliancePage.documentId)
        && Objects.equals(this.documentName, displayAppliancePage.documentName)
        && Objects.equals(this.externalDocumentId, displayAppliancePage.externalDocumentId)
        && Objects.equals(this.height, displayAppliancePage.height)
        && Objects.equals(this.isFirstPage, displayAppliancePage.isFirstPage)
        && Objects.equals(this.pageId, displayAppliancePage.pageId)
        && Objects.equals(this.pageNo, displayAppliancePage.pageNo)
        && Objects.equals(this.pageStatus, displayAppliancePage.pageStatus)
        && Objects.equals(this.pageType, displayAppliancePage.pageType)
        && Objects.equals(this.width, displayAppliancePage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        documentId,
        documentName,
        externalDocumentId,
        height,
        isFirstPage,
        pageId,
        pageNo,
        pageStatus,
        pageType,
        width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAppliancePage {\n");

    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    externalDocumentId: ").append(toIndentedString(externalDocumentId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isFirstPage: ").append(toIndentedString(isFirstPage)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageStatus: ").append(toIndentedString(pageStatus)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
