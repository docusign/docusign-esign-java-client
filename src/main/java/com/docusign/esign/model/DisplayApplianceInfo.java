package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DisplayApplianceDocument;
import com.docusign.esign.model.DisplayApplianceDocumentPage;
import com.docusign.esign.model.DisplayApplianceEnvelope;
import com.docusign.esign.model.DisplayAppliancePage;
import com.docusign.esign.model.DisplayApplianceRecipient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DisplayApplianceInfo
 */

public class DisplayApplianceInfo {
  @JsonProperty("documentData")
  private java.util.List<DisplayApplianceDocument> documentData = new java.util.ArrayList<DisplayApplianceDocument>();

  @JsonProperty("documentPages")
  private java.util.List<DisplayApplianceDocumentPage> documentPages = new java.util.ArrayList<DisplayApplianceDocumentPage>();

  @JsonProperty("envelopeData")
  private DisplayApplianceEnvelope envelopeData = null;

  @JsonProperty("pageData")
  private java.util.List<DisplayAppliancePage> pageData = new java.util.ArrayList<DisplayAppliancePage>();

  @JsonProperty("recipientData")
  private java.util.List<DisplayApplianceRecipient> recipientData = new java.util.ArrayList<DisplayApplianceRecipient>();

  public DisplayApplianceInfo documentData(java.util.List<DisplayApplianceDocument> documentData) {
    this.documentData = documentData;
    return this;
  }

  public DisplayApplianceInfo addDocumentDataItem(DisplayApplianceDocument documentDataItem) {
    this.documentData.add(documentDataItem);
    return this;
  }

   /**
   * 
   * @return documentData
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DisplayApplianceDocument> getDocumentData() {
    return documentData;
  }

  public void setDocumentData(java.util.List<DisplayApplianceDocument> documentData) {
    this.documentData = documentData;
  }

  public DisplayApplianceInfo documentPages(java.util.List<DisplayApplianceDocumentPage> documentPages) {
    this.documentPages = documentPages;
    return this;
  }

  public DisplayApplianceInfo addDocumentPagesItem(DisplayApplianceDocumentPage documentPagesItem) {
    this.documentPages.add(documentPagesItem);
    return this;
  }

   /**
   * 
   * @return documentPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DisplayApplianceDocumentPage> getDocumentPages() {
    return documentPages;
  }

  public void setDocumentPages(java.util.List<DisplayApplianceDocumentPage> documentPages) {
    this.documentPages = documentPages;
  }

  public DisplayApplianceInfo envelopeData(DisplayApplianceEnvelope envelopeData) {
    this.envelopeData = envelopeData;
    return this;
  }

   /**
   * Get envelopeData
   * @return envelopeData
  **/
  @ApiModelProperty(example = "null", value = "")
  public DisplayApplianceEnvelope getEnvelopeData() {
    return envelopeData;
  }

  public void setEnvelopeData(DisplayApplianceEnvelope envelopeData) {
    this.envelopeData = envelopeData;
  }

  public DisplayApplianceInfo pageData(java.util.List<DisplayAppliancePage> pageData) {
    this.pageData = pageData;
    return this;
  }

  public DisplayApplianceInfo addPageDataItem(DisplayAppliancePage pageDataItem) {
    this.pageData.add(pageDataItem);
    return this;
  }

   /**
   * 
   * @return pageData
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DisplayAppliancePage> getPageData() {
    return pageData;
  }

  public void setPageData(java.util.List<DisplayAppliancePage> pageData) {
    this.pageData = pageData;
  }

  public DisplayApplianceInfo recipientData(java.util.List<DisplayApplianceRecipient> recipientData) {
    this.recipientData = recipientData;
    return this;
  }

  public DisplayApplianceInfo addRecipientDataItem(DisplayApplianceRecipient recipientDataItem) {
    this.recipientData.add(recipientDataItem);
    return this;
  }

   /**
   * 
   * @return recipientData
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DisplayApplianceRecipient> getRecipientData() {
    return recipientData;
  }

  public void setRecipientData(java.util.List<DisplayApplianceRecipient> recipientData) {
    this.recipientData = recipientData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceInfo displayApplianceInfo = (DisplayApplianceInfo) o;
    return Objects.equals(this.documentData, displayApplianceInfo.documentData) &&
        Objects.equals(this.documentPages, displayApplianceInfo.documentPages) &&
        Objects.equals(this.envelopeData, displayApplianceInfo.envelopeData) &&
        Objects.equals(this.pageData, displayApplianceInfo.pageData) &&
        Objects.equals(this.recipientData, displayApplianceInfo.recipientData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentData, documentPages, envelopeData, pageData, recipientData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceInfo {\n");
    
    sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    sb.append("    documentPages: ").append(toIndentedString(documentPages)).append("\n");
    sb.append("    envelopeData: ").append(toIndentedString(envelopeData)).append("\n");
    sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
    sb.append("    recipientData: ").append(toIndentedString(recipientData)).append("\n");
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

