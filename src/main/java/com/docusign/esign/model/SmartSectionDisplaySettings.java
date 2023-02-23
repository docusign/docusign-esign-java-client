package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SmartSectionCollapsibleDisplaySettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * These properties define how a Smart Section displays. A Smart Section is a
 * type of display section..
 *
 */
@Schema(description = "These properties define how a Smart Section displays. A Smart Section is a type of display section.")

public class SmartSectionDisplaySettings {
  @JsonProperty("cellStyle")
  private String cellStyle = null;

  @JsonProperty("collapsibleSettings")
  private SmartSectionCollapsibleDisplaySettings collapsibleSettings = null;

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

  @JsonProperty("preLabel")
  private String preLabel = null;

  @JsonProperty("scrollToTopWhenOpened")
  private Boolean scrollToTopWhenOpened = null;

  @JsonProperty("tableStyle")
  private String tableStyle = null;

  /**
   * cellStyle.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings cellStyle(String cellStyle) {
    this.cellStyle = cellStyle;
    return this;
  }

  /**
   * .
   * 
   * @return cellStyle
   **/
  @Schema(description = "")
  public String getCellStyle() {
    return cellStyle;
  }

  /**
   * setCellStyle.
   **/
  public void setCellStyle(String cellStyle) {
    this.cellStyle = cellStyle;
  }

  /**
   * collapsibleSettings.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings collapsibleSettings(SmartSectionCollapsibleDisplaySettings collapsibleSettings) {
    this.collapsibleSettings = collapsibleSettings;
    return this;
  }

  /**
   * This object defines the appearance and function of a collapsible section or
   * item..
   * 
   * @return collapsibleSettings
   **/
  @Schema(description = "This object defines the appearance and function of a collapsible section or item.")
  public SmartSectionCollapsibleDisplaySettings getCollapsibleSettings() {
    return collapsibleSettings;
  }

  /**
   * setCollapsibleSettings.
   **/
  public void setCollapsibleSettings(SmartSectionCollapsibleDisplaySettings collapsibleSettings) {
    this.collapsibleSettings = collapsibleSettings;
  }

  /**
   * display.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings display(String display) {
    this.display = display;
    return this;
  }

  /**
   * .
   * 
   * @return display
   **/
  @Schema(description = "")
  public String getDisplay() {
    return display;
  }

  /**
   * setDisplay.
   **/
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   * displayLabel.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * .
   * 
   * @return displayLabel
   **/
  @Schema(description = "")
  public String getDisplayLabel() {
    return displayLabel;
  }

  /**
   * setDisplayLabel.
   **/
  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  /**
   * displayOrder.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * .
   * 
   * @return displayOrder
   **/
  @Schema(description = "")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  /**
   * setDisplayOrder.
   **/
  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * displayPageNumber.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings displayPageNumber(Integer displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
    return this;
  }

  /**
   * .
   * 
   * @return displayPageNumber
   **/
  @Schema(description = "")
  public Integer getDisplayPageNumber() {
    return displayPageNumber;
  }

  /**
   * setDisplayPageNumber.
   **/
  public void setDisplayPageNumber(Integer displayPageNumber) {
    this.displayPageNumber = displayPageNumber;
  }

  /**
   * hideLabelWhenOpened.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings hideLabelWhenOpened(Boolean hideLabelWhenOpened) {
    this.hideLabelWhenOpened = hideLabelWhenOpened;
    return this;
  }

  /**
   * .
   * 
   * @return hideLabelWhenOpened
   **/
  @Schema(description = "")
  public Boolean isHideLabelWhenOpened() {
    return hideLabelWhenOpened;
  }

  /**
   * setHideLabelWhenOpened.
   **/
  public void setHideLabelWhenOpened(Boolean hideLabelWhenOpened) {
    this.hideLabelWhenOpened = hideLabelWhenOpened;
  }

  /**
   * inlineOuterStyle.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings inlineOuterStyle(String inlineOuterStyle) {
    this.inlineOuterStyle = inlineOuterStyle;
    return this;
  }

  /**
   * .
   * 
   * @return inlineOuterStyle
   **/
  @Schema(description = "")
  public String getInlineOuterStyle() {
    return inlineOuterStyle;
  }

  /**
   * setInlineOuterStyle.
   **/
  public void setInlineOuterStyle(String inlineOuterStyle) {
    this.inlineOuterStyle = inlineOuterStyle;
  }

  /**
   * labelWhenOpened.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings labelWhenOpened(String labelWhenOpened) {
    this.labelWhenOpened = labelWhenOpened;
    return this;
  }

  /**
   * .
   * 
   * @return labelWhenOpened
   **/
  @Schema(description = "")
  public String getLabelWhenOpened() {
    return labelWhenOpened;
  }

  /**
   * setLabelWhenOpened.
   **/
  public void setLabelWhenOpened(String labelWhenOpened) {
    this.labelWhenOpened = labelWhenOpened;
  }

  /**
   * preLabel.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings preLabel(String preLabel) {
    this.preLabel = preLabel;
    return this;
  }

  /**
   * .
   * 
   * @return preLabel
   **/
  @Schema(description = "")
  public String getPreLabel() {
    return preLabel;
  }

  /**
   * setPreLabel.
   **/
  public void setPreLabel(String preLabel) {
    this.preLabel = preLabel;
  }

  /**
   * scrollToTopWhenOpened.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings scrollToTopWhenOpened(Boolean scrollToTopWhenOpened) {
    this.scrollToTopWhenOpened = scrollToTopWhenOpened;
    return this;
  }

  /**
   * .
   * 
   * @return scrollToTopWhenOpened
   **/
  @Schema(description = "")
  public Boolean isScrollToTopWhenOpened() {
    return scrollToTopWhenOpened;
  }

  /**
   * setScrollToTopWhenOpened.
   **/
  public void setScrollToTopWhenOpened(Boolean scrollToTopWhenOpened) {
    this.scrollToTopWhenOpened = scrollToTopWhenOpened;
  }

  /**
   * tableStyle.
   *
   * @return SmartSectionDisplaySettings
   **/
  public SmartSectionDisplaySettings tableStyle(String tableStyle) {
    this.tableStyle = tableStyle;
    return this;
  }

  /**
   * .
   * 
   * @return tableStyle
   **/
  @Schema(description = "")
  public String getTableStyle() {
    return tableStyle;
  }

  /**
   * setTableStyle.
   **/
  public void setTableStyle(String tableStyle) {
    this.tableStyle = tableStyle;
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
    SmartSectionDisplaySettings smartSectionDisplaySettings = (SmartSectionDisplaySettings) o;
    return Objects.equals(this.cellStyle, smartSectionDisplaySettings.cellStyle) &&
        Objects.equals(this.collapsibleSettings, smartSectionDisplaySettings.collapsibleSettings) &&
        Objects.equals(this.display, smartSectionDisplaySettings.display) &&
        Objects.equals(this.displayLabel, smartSectionDisplaySettings.displayLabel) &&
        Objects.equals(this.displayOrder, smartSectionDisplaySettings.displayOrder) &&
        Objects.equals(this.displayPageNumber, smartSectionDisplaySettings.displayPageNumber) &&
        Objects.equals(this.hideLabelWhenOpened, smartSectionDisplaySettings.hideLabelWhenOpened) &&
        Objects.equals(this.inlineOuterStyle, smartSectionDisplaySettings.inlineOuterStyle) &&
        Objects.equals(this.labelWhenOpened, smartSectionDisplaySettings.labelWhenOpened) &&
        Objects.equals(this.preLabel, smartSectionDisplaySettings.preLabel) &&
        Objects.equals(this.scrollToTopWhenOpened, smartSectionDisplaySettings.scrollToTopWhenOpened) &&
        Objects.equals(this.tableStyle, smartSectionDisplaySettings.tableStyle);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(cellStyle, collapsibleSettings, display, displayLabel, displayOrder, displayPageNumber,
        hideLabelWhenOpened, inlineOuterStyle, labelWhenOpened, preLabel, scrollToTopWhenOpened, tableStyle);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartSectionDisplaySettings {\n");

    sb.append("    cellStyle: ").append(toIndentedString(cellStyle)).append("\n");
    sb.append("    collapsibleSettings: ").append(toIndentedString(collapsibleSettings)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    displayPageNumber: ").append(toIndentedString(displayPageNumber)).append("\n");
    sb.append("    hideLabelWhenOpened: ").append(toIndentedString(hideLabelWhenOpened)).append("\n");
    sb.append("    inlineOuterStyle: ").append(toIndentedString(inlineOuterStyle)).append("\n");
    sb.append("    labelWhenOpened: ").append(toIndentedString(labelWhenOpened)).append("\n");
    sb.append("    preLabel: ").append(toIndentedString(preLabel)).append("\n");
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
