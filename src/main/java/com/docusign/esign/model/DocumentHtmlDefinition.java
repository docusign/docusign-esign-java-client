package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentHtmlDisplayAnchor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDefinition
 */

public class DocumentHtmlDefinition {
  @JsonProperty("displayAnchorPrefix")
  private String displayAnchorPrefix = null;

  @JsonProperty("displayAnchors")
  private java.util.List<DocumentHtmlDisplayAnchor> displayAnchors = new java.util.ArrayList<DocumentHtmlDisplayAnchor>();

  @JsonProperty("displayOrder")
  private String displayOrder = null;

  @JsonProperty("displayPageNumber")
  private String displayPageNumber = null;

  @JsonProperty("documentGuid")
  private String documentGuid = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("headerLabel")
  private String headerLabel = null;

  @JsonProperty("maxScreenWidth")
  private String maxScreenWidth = null;

  @JsonProperty("removeEmptyTags")
  private String removeEmptyTags = null;

  @JsonProperty("showMobileOptimizedToggle")
  private String showMobileOptimizedToggle = null;

  @JsonProperty("source")
  private String source = null;

  public DocumentHtmlDefinition displayAnchorPrefix(String displayAnchorPrefix) {
    this.displayAnchorPrefix = displayAnchorPrefix;
    return this;
  }

   /**
   * 
   * @return displayAnchorPrefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayAnchorPrefix() {
    return displayAnchorPrefix;
  }

  public void setDisplayAnchorPrefix(String displayAnchorPrefix) {
    this.displayAnchorPrefix = displayAnchorPrefix;
  }

  public DocumentHtmlDefinition displayAnchors(java.util.List<DocumentHtmlDisplayAnchor> displayAnchors) {
    this.displayAnchors = displayAnchors;
    return this;
  }

  public DocumentHtmlDefinition addDisplayAnchorsItem(DocumentHtmlDisplayAnchor displayAnchorsItem) {
    this.displayAnchors.add(displayAnchorsItem);
    return this;
  }

   /**
   * 
   * @return displayAnchors
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DocumentHtmlDisplayAnchor> getDisplayAnchors() {
    return displayAnchors;
  }

  public void setDisplayAnchors(java.util.List<DocumentHtmlDisplayAnchor> displayAnchors) {
    this.displayAnchors = displayAnchors;
  }

  public DocumentHtmlDefinition displayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * 
   * @return displayOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
  }

  public DocumentHtmlDefinition displayPageNumber(String displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
    return this;
  }

   /**
   * 
   * @return displayPageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayPageNumber() {
    return displayPageNumber;
  }

  public void setDisplayPageNumber(String displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
  }

  public DocumentHtmlDefinition documentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
    return this;
  }

   /**
   * 
   * @return documentGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDocumentGuid() {
    return documentGuid;
  }

  public void setDocumentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
  }

  public DocumentHtmlDefinition documentId(String documentId) {
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

  public DocumentHtmlDefinition headerLabel(String headerLabel) {
    this.headerLabel = headerLabel;
    return this;
  }

   /**
   * 
   * @return headerLabel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHeaderLabel() {
    return headerLabel;
  }

  public void setHeaderLabel(String headerLabel) {
    this.headerLabel = headerLabel;
  }

  public DocumentHtmlDefinition maxScreenWidth(String maxScreenWidth) {
    this.maxScreenWidth = maxScreenWidth;
    return this;
  }

   /**
   * 
   * @return maxScreenWidth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaxScreenWidth() {
    return maxScreenWidth;
  }

  public void setMaxScreenWidth(String maxScreenWidth) {
    this.maxScreenWidth = maxScreenWidth;
  }

  public DocumentHtmlDefinition removeEmptyTags(String removeEmptyTags) {
    this.removeEmptyTags = removeEmptyTags;
    return this;
  }

   /**
   * 
   * @return removeEmptyTags
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemoveEmptyTags() {
    return removeEmptyTags;
  }

  public void setRemoveEmptyTags(String removeEmptyTags) {
    this.removeEmptyTags = removeEmptyTags;
  }

  public DocumentHtmlDefinition showMobileOptimizedToggle(String showMobileOptimizedToggle) {
    this.showMobileOptimizedToggle = showMobileOptimizedToggle;
    return this;
  }

   /**
   * 
   * @return showMobileOptimizedToggle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShowMobileOptimizedToggle() {
    return showMobileOptimizedToggle;
  }

  public void setShowMobileOptimizedToggle(String showMobileOptimizedToggle) {
    this.showMobileOptimizedToggle = showMobileOptimizedToggle;
  }

  public DocumentHtmlDefinition source(String source) {
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentHtmlDefinition documentHtmlDefinition = (DocumentHtmlDefinition) o;
    return Objects.equals(this.displayAnchorPrefix, documentHtmlDefinition.displayAnchorPrefix) &&
        Objects.equals(this.displayAnchors, documentHtmlDefinition.displayAnchors) &&
        Objects.equals(this.displayOrder, documentHtmlDefinition.displayOrder) &&
        Objects.equals(this.displayPageNumber, documentHtmlDefinition.displayPageNumber) &&
        Objects.equals(this.documentGuid, documentHtmlDefinition.documentGuid) &&
        Objects.equals(this.documentId, documentHtmlDefinition.documentId) &&
        Objects.equals(this.headerLabel, documentHtmlDefinition.headerLabel) &&
        Objects.equals(this.maxScreenWidth, documentHtmlDefinition.maxScreenWidth) &&
        Objects.equals(this.removeEmptyTags, documentHtmlDefinition.removeEmptyTags) &&
        Objects.equals(this.showMobileOptimizedToggle, documentHtmlDefinition.showMobileOptimizedToggle) &&
        Objects.equals(this.source, documentHtmlDefinition.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayAnchorPrefix, displayAnchors, displayOrder, displayPageNumber, documentGuid, documentId, headerLabel, maxScreenWidth, removeEmptyTags, showMobileOptimizedToggle, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDefinition {\n");
    
    sb.append("    displayAnchorPrefix: ").append(toIndentedString(displayAnchorPrefix)).append("\n");
    sb.append("    displayAnchors: ").append(toIndentedString(displayAnchors)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    displayPageNumber: ").append(toIndentedString(displayPageNumber)).append("\n");
    sb.append("    documentGuid: ").append(toIndentedString(documentGuid)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    headerLabel: ").append(toIndentedString(headerLabel)).append("\n");
    sb.append("    maxScreenWidth: ").append(toIndentedString(maxScreenWidth)).append("\n");
    sb.append("    removeEmptyTags: ").append(toIndentedString(removeEmptyTags)).append("\n");
    sb.append("    showMobileOptimizedToggle: ").append(toIndentedString(showMobileOptimizedToggle)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

