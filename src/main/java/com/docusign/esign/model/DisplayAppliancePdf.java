package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DisplayApplianceSignerAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DisplayAppliancePdf
 */

public class DisplayAppliancePdf {
  @JsonProperty("attachmentInfo")
  private DisplayApplianceSignerAttachment attachmentInfo = null;

  @JsonProperty("docName")
  private String docName = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("latestPdf")
  private String latestPdf = null;

  @JsonProperty("latestPDFId")
  private String latestPDFId = null;

  @JsonProperty("originalPdf")
  private String originalPdf = null;

  @JsonProperty("originalPDFId")
  private String originalPDFId = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("pdfType")
  private String pdfType = null;

  public DisplayAppliancePdf attachmentInfo(DisplayApplianceSignerAttachment attachmentInfo) {
    this.attachmentInfo = attachmentInfo;
    return this;
  }

   /**
   * Get attachmentInfo
   * @return attachmentInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public DisplayApplianceSignerAttachment getAttachmentInfo() {
    return attachmentInfo;
  }

  public void setAttachmentInfo(DisplayApplianceSignerAttachment attachmentInfo) {
    this.attachmentInfo = attachmentInfo;
  }

  public DisplayAppliancePdf docName(String docName) {
    this.docName = docName;
    return this;
  }

   /**
   * 
   * @return docName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  public DisplayAppliancePdf documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DisplayAppliancePdf latestPdf(String latestPdf) {
    this.latestPdf = latestPdf;
    return this;
  }

   /**
   * 
   * @return latestPdf
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatestPdf() {
    return latestPdf;
  }

  public void setLatestPdf(String latestPdf) {
    this.latestPdf = latestPdf;
  }

  public DisplayAppliancePdf latestPDFId(String latestPDFId) {
    this.latestPDFId = latestPDFId;
    return this;
  }

   /**
   * 
   * @return latestPDFId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatestPDFId() {
    return latestPDFId;
  }

  public void setLatestPDFId(String latestPDFId) {
    this.latestPDFId = latestPDFId;
  }

  public DisplayAppliancePdf originalPdf(String originalPdf) {
    this.originalPdf = originalPdf;
    return this;
  }

   /**
   * 
   * @return originalPdf
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOriginalPdf() {
    return originalPdf;
  }

  public void setOriginalPdf(String originalPdf) {
    this.originalPdf = originalPdf;
  }

  public DisplayAppliancePdf originalPDFId(String originalPDFId) {
    this.originalPDFId = originalPDFId;
    return this;
  }

   /**
   * 
   * @return originalPDFId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOriginalPDFId() {
    return originalPDFId;
  }

  public void setOriginalPDFId(String originalPDFId) {
    this.originalPDFId = originalPDFId;
  }

  public DisplayAppliancePdf pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * 
   * @return pageCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public DisplayAppliancePdf pdfType(String pdfType) {
    this.pdfType = pdfType;
    return this;
  }

   /**
   * 
   * @return pdfType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPdfType() {
    return pdfType;
  }

  public void setPdfType(String pdfType) {
    this.pdfType = pdfType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAppliancePdf displayAppliancePdf = (DisplayAppliancePdf) o;
    return Objects.equals(this.attachmentInfo, displayAppliancePdf.attachmentInfo) &&
        Objects.equals(this.docName, displayAppliancePdf.docName) &&
        Objects.equals(this.documentId, displayAppliancePdf.documentId) &&
        Objects.equals(this.latestPdf, displayAppliancePdf.latestPdf) &&
        Objects.equals(this.latestPDFId, displayAppliancePdf.latestPDFId) &&
        Objects.equals(this.originalPdf, displayAppliancePdf.originalPdf) &&
        Objects.equals(this.originalPDFId, displayAppliancePdf.originalPDFId) &&
        Objects.equals(this.pageCount, displayAppliancePdf.pageCount) &&
        Objects.equals(this.pdfType, displayAppliancePdf.pdfType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentInfo, docName, documentId, latestPdf, latestPDFId, originalPdf, originalPDFId, pageCount, pdfType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAppliancePdf {\n");
    
    sb.append("    attachmentInfo: ").append(toIndentedString(attachmentInfo)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    latestPdf: ").append(toIndentedString(latestPdf)).append("\n");
    sb.append("    latestPDFId: ").append(toIndentedString(latestPDFId)).append("\n");
    sb.append("    originalPdf: ").append(toIndentedString(originalPdf)).append("\n");
    sb.append("    originalPDFId: ").append(toIndentedString(originalPDFId)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pdfType: ").append(toIndentedString(pdfType)).append("\n");
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

