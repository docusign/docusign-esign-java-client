package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.DocumentHtmlCollapsibleDisplaySettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentHtmlDisplaySettings
 */

public class DocumentHtmlDisplaySettings {
  @JsonProperty("cellStyle")
  private String cellStyle = null;

  @JsonProperty("collapsibleSettings")
  private DocumentHtmlCollapsibleDisplaySettings collapsibleSettings = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("displayLabel")
  private String displayLabel = null;

  @JsonProperty("displayOrder")
  private Integer displayOrder = null;

  @JsonProperty("displayPageNumber")
  private Integer displayPageNumber = null;

  @JsonProperty("hideLabelWhenOpened")
  private Boolean hideLabelWhenOpened = null;

  @JsonProperty("inlineOuterStyle")
  private String inlineOuterStyle = null;

  @JsonProperty("labelWhenOpened")
  private String labelWhenOpened = null;

  @JsonProperty("scrollToTopWhenOpened")
  private Boolean scrollToTopWhenOpened = null;

  @JsonProperty("tableStyle")
  private String tableStyle = null;

  public DocumentHtmlDisplaySettings cellStyle(String cellStyle) {
    this.cellStyle = cellStyle;
    return this;
  }

   /**
   * 
   * @return cellStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCellStyle() {
    return cellStyle;
  }

  public void setCellStyle(String cellStyle) {
    this.cellStyle = cellStyle;
  }

  public DocumentHtmlDisplaySettings collapsibleSettings(DocumentHtmlCollapsibleDisplaySettings collapsibleSettings) {
    this.collapsibleSettings = collapsibleSettings;
    return this;
  }

   /**
   * Get collapsibleSettings
   * @return collapsibleSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public DocumentHtmlCollapsibleDisplaySettings getCollapsibleSettings() {
    return collapsibleSettings;
  }

  public void setCollapsibleSettings(DocumentHtmlCollapsibleDisplaySettings collapsibleSettings) {
    this.collapsibleSettings = collapsibleSettings;
  }

  public DocumentHtmlDisplaySettings display(String display) {
    this.display = display;
    return this;
  }

   /**
   * 
   * @return display
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public DocumentHtmlDisplaySettings displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

   /**
   * 
   * @return displayLabel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  public DocumentHtmlDisplaySettings displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * 
   * @return displayOrder
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public DocumentHtmlDisplaySettings displayPageNumber(Integer displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
    return this;
  }

   /**
   * 
   * @return displayPageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDisplayPageNumber() {
    return displayPageNumber;
  }

  public void setDisplayPageNumber(Integer displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
  }

  public DocumentHtmlDisplaySettings hideLabelWhenOpened(Boolean hideLabelWhenOpened) {
    this.hideLabelWhenOpened = hideLabelWhenOpened;
    return this;
  }

   /**
   * 
   * @return hideLabelWhenOpened
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHideLabelWhenOpened() {
    return hideLabelWhenOpened;
  }

  public void setHideLabelWhenOpened(Boolean hideLabelWhenOpened) {
    this.hideLabelWhenOpened = hideLabelWhenOpened;
  }

  public DocumentHtmlDisplaySettings inlineOuterStyle(String inlineOuterStyle) {
    this.inlineOuterStyle = inlineOuterStyle;
    return this;
  }

   /**
   * 
   * @return inlineOuterStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInlineOuterStyle() {
    return inlineOuterStyle;
  }

  public void setInlineOuterStyle(String inlineOuterStyle) {
    this.inlineOuterStyle = inlineOuterStyle;
  }

  public DocumentHtmlDisplaySettings labelWhenOpened(String labelWhenOpened) {
    this.labelWhenOpened = labelWhenOpened;
    return this;
  }

   /**
   * 
   * @return labelWhenOpened
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabelWhenOpened() {
    return labelWhenOpened;
  }

  public void setLabelWhenOpened(String labelWhenOpened) {
    this.labelWhenOpened = labelWhenOpened;
  }

  public DocumentHtmlDisplaySettings scrollToTopWhenOpened(Boolean scrollToTopWhenOpened) {
    this.scrollToTopWhenOpened = scrollToTopWhenOpened;
    return this;
  }

   /**
   * 
   * @return scrollToTopWhenOpened
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getScrollToTopWhenOpened() {
    return scrollToTopWhenOpened;
  }

  public void setScrollToTopWhenOpened(Boolean scrollToTopWhenOpened) {
    this.scrollToTopWhenOpened = scrollToTopWhenOpened;
  }

  public DocumentHtmlDisplaySettings tableStyle(String tableStyle) {
    this.tableStyle = tableStyle;
    return this;
  }

   /**
   * 
   * @return tableStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTableStyle() {
    return tableStyle;
  }

  public void setTableStyle(String tableStyle) {
    this.tableStyle = tableStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentHtmlDisplaySettings documentHtmlDisplaySettings = (DocumentHtmlDisplaySettings) o;
    return Objects.equals(this.cellStyle, documentHtmlDisplaySettings.cellStyle) &&
        Objects.equals(this.collapsibleSettings, documentHtmlDisplaySettings.collapsibleSettings) &&
        Objects.equals(this.display, documentHtmlDisplaySettings.display) &&
        Objects.equals(this.displayLabel, documentHtmlDisplaySettings.displayLabel) &&
        Objects.equals(this.displayOrder, documentHtmlDisplaySettings.displayOrder) &&
        Objects.equals(this.displayPageNumber, documentHtmlDisplaySettings.displayPageNumber) &&
        Objects.equals(this.hideLabelWhenOpened, documentHtmlDisplaySettings.hideLabelWhenOpened) &&
        Objects.equals(this.inlineOuterStyle, documentHtmlDisplaySettings.inlineOuterStyle) &&
        Objects.equals(this.labelWhenOpened, documentHtmlDisplaySettings.labelWhenOpened) &&
        Objects.equals(this.scrollToTopWhenOpened, documentHtmlDisplaySettings.scrollToTopWhenOpened) &&
        Objects.equals(this.tableStyle, documentHtmlDisplaySettings.tableStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellStyle, collapsibleSettings, display, displayLabel, displayOrder, displayPageNumber, hideLabelWhenOpened, inlineOuterStyle, labelWhenOpened, scrollToTopWhenOpened, tableStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlDisplaySettings {\n");
    
    sb.append("    cellStyle: ").append(toIndentedString(cellStyle)).append("\n");
    sb.append("    collapsibleSettings: ").append(toIndentedString(collapsibleSettings)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    displayPageNumber: ").append(toIndentedString(displayPageNumber)).append("\n");
    sb.append("    hideLabelWhenOpened: ").append(toIndentedString(hideLabelWhenOpened)).append("\n");
    sb.append("    inlineOuterStyle: ").append(toIndentedString(inlineOuterStyle)).append("\n");
    sb.append("    labelWhenOpened: ").append(toIndentedString(labelWhenOpened)).append("\n");
    sb.append("    scrollToTopWhenOpened: ").append(toIndentedString(scrollToTopWhenOpened)).append("\n");
    sb.append("    tableStyle: ").append(toIndentedString(tableStyle)).append("\n");
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

