package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocumentHtmlDisplayAnchor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDefinition.
 *
 */

public class DocumentHtmlDefinition {
  @JsonProperty("displayAnchorPrefix")
  private String displayAnchorPrefix = null;

  @JsonProperty("displayAnchors")
  private java.util.List<DocumentHtmlDisplayAnchor> displayAnchors = null;

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


  /**
   * displayAnchorPrefix.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition displayAnchorPrefix(String displayAnchorPrefix) {
    this.displayAnchorPrefix = displayAnchorPrefix;
    return this;
  }

  /**
   * .
   * @return displayAnchorPrefix
   **/
  @ApiModelProperty(value = "")
  public String getDisplayAnchorPrefix() {
    return displayAnchorPrefix;
  }

  /**
   * setDisplayAnchorPrefix.
   **/
  public void setDisplayAnchorPrefix(String displayAnchorPrefix) {
    this.displayAnchorPrefix = displayAnchorPrefix;
  }


  /**
   * displayAnchors.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition displayAnchors(java.util.List<DocumentHtmlDisplayAnchor> displayAnchors) {
    this.displayAnchors = displayAnchors;
    return this;
  }
  
  /**
   * addDisplayAnchorsItem.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition addDisplayAnchorsItem(DocumentHtmlDisplayAnchor displayAnchorsItem) {
    if (this.displayAnchors == null) {
      this.displayAnchors = new java.util.ArrayList<DocumentHtmlDisplayAnchor>();
    }
    this.displayAnchors.add(displayAnchorsItem);
    return this;
  }

  /**
   * .
   * @return displayAnchors
   **/
  @ApiModelProperty(value = "")
  public java.util.List<DocumentHtmlDisplayAnchor> getDisplayAnchors() {
    return displayAnchors;
  }

  /**
   * setDisplayAnchors.
   **/
  public void setDisplayAnchors(java.util.List<DocumentHtmlDisplayAnchor> displayAnchors) {
    this.displayAnchors = displayAnchors;
  }


  /**
   * displayOrder.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition displayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * .
   * @return displayOrder
   **/
  @ApiModelProperty(value = "")
  public String getDisplayOrder() {
    return displayOrder;
  }

  /**
   * setDisplayOrder.
   **/
  public void setDisplayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
  }


  /**
   * displayPageNumber.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition displayPageNumber(String displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
    return this;
  }

  /**
   * .
   * @return displayPageNumber
   **/
  @ApiModelProperty(value = "")
  public String getDisplayPageNumber() {
    return displayPageNumber;
  }

  /**
   * setDisplayPageNumber.
   **/
  public void setDisplayPageNumber(String displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
  }


  /**
   * documentGuid.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition documentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
    return this;
  }

  /**
   * .
   * @return documentGuid
   **/
  @ApiModelProperty(value = "")
  public String getDocumentGuid() {
    return documentGuid;
  }

  /**
   * setDocumentGuid.
   **/
  public void setDocumentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
  }


  /**
   * documentId.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
   * @return documentId
   **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * headerLabel.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition headerLabel(String headerLabel) {
    this.headerLabel = headerLabel;
    return this;
  }

  /**
   * .
   * @return headerLabel
   **/
  @ApiModelProperty(value = "")
  public String getHeaderLabel() {
    return headerLabel;
  }

  /**
   * setHeaderLabel.
   **/
  public void setHeaderLabel(String headerLabel) {
    this.headerLabel = headerLabel;
  }


  /**
   * maxScreenWidth.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition maxScreenWidth(String maxScreenWidth) {
    this.maxScreenWidth = maxScreenWidth;
    return this;
  }

  /**
   * .
   * @return maxScreenWidth
   **/
  @ApiModelProperty(value = "")
  public String getMaxScreenWidth() {
    return maxScreenWidth;
  }

  /**
   * setMaxScreenWidth.
   **/
  public void setMaxScreenWidth(String maxScreenWidth) {
    this.maxScreenWidth = maxScreenWidth;
  }


  /**
   * removeEmptyTags.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition removeEmptyTags(String removeEmptyTags) {
    this.removeEmptyTags = removeEmptyTags;
    return this;
  }

  /**
   * .
   * @return removeEmptyTags
   **/
  @ApiModelProperty(value = "")
  public String getRemoveEmptyTags() {
    return removeEmptyTags;
  }

  /**
   * setRemoveEmptyTags.
   **/
  public void setRemoveEmptyTags(String removeEmptyTags) {
    this.removeEmptyTags = removeEmptyTags;
  }


  /**
   * showMobileOptimizedToggle.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition showMobileOptimizedToggle(String showMobileOptimizedToggle) {
    this.showMobileOptimizedToggle = showMobileOptimizedToggle;
    return this;
  }

  /**
   * .
   * @return showMobileOptimizedToggle
   **/
  @ApiModelProperty(value = "")
  public String getShowMobileOptimizedToggle() {
    return showMobileOptimizedToggle;
  }

  /**
   * setShowMobileOptimizedToggle.
   **/
  public void setShowMobileOptimizedToggle(String showMobileOptimizedToggle) {
    this.showMobileOptimizedToggle = showMobileOptimizedToggle;
  }


  /**
   * source.
   *
   * @return DocumentHtmlDefinition
   **/
  public DocumentHtmlDefinition source(String source) {
    this.source = source;
    return this;
  }

  /**
   * .
   * @return source
   **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(String source) {
    this.source = source;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(displayAnchorPrefix, displayAnchors, displayOrder, displayPageNumber, documentGuid, documentId, headerLabel, maxScreenWidth, removeEmptyTags, showMobileOptimizedToggle, source);
  }


  /**
   * Converts the given object to string.
   */
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

