package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Display settings for collapsible section..
 *
 */
@Schema(description = "Display settings for collapsible section.")

public class DocumentHtmlCollapsibleDisplaySettings {
  @JsonProperty("arrowClosed")
  private String arrowClosed = null;

  @JsonProperty("arrowColor")
  private String arrowColor = null;

  @JsonProperty("arrowLocation")
  private String arrowLocation = null;

  @JsonProperty("arrowOpen")
  private String arrowOpen = null;

  @JsonProperty("arrowSize")
  private String arrowSize = null;

  @JsonProperty("arrowStyle")
  private String arrowStyle = null;

  @JsonProperty("containerStyle")
  private String containerStyle = null;

  @JsonProperty("labelStyle")
  private String labelStyle = null;

  @JsonProperty("onlyArrowIsClickable")
  private Boolean onlyArrowIsClickable = null;

  @JsonProperty("outerLabelAndArrowStyle")
  private String outerLabelAndArrowStyle = null;

  /**
   * arrowClosed.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings arrowClosed(String arrowClosed) {
    this.arrowClosed = arrowClosed;
    return this;
  }

  /**
   * .
   * 
   * @return arrowClosed
   **/
  @Schema(description = "")
  public String getArrowClosed() {
    return arrowClosed;
  }

  /**
   * setArrowClosed.
   **/
  public void setArrowClosed(String arrowClosed) {
    this.arrowClosed = arrowClosed;
  }

  /**
   * arrowColor.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings arrowColor(String arrowColor) {
    this.arrowColor = arrowColor;
    return this;
  }

  /**
   * .
   * 
   * @return arrowColor
   **/
  @Schema(description = "")
  public String getArrowColor() {
    return arrowColor;
  }

  /**
   * setArrowColor.
   **/
  public void setArrowColor(String arrowColor) {
    this.arrowColor = arrowColor;
  }

  /**
   * arrowLocation.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings arrowLocation(String arrowLocation) {
    this.arrowLocation = arrowLocation;
    return this;
  }

  /**
   * .
   * 
   * @return arrowLocation
   **/
  @Schema(description = "")
  public String getArrowLocation() {
    return arrowLocation;
  }

  /**
   * setArrowLocation.
   **/
  public void setArrowLocation(String arrowLocation) {
    this.arrowLocation = arrowLocation;
  }

  /**
   * arrowOpen.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings arrowOpen(String arrowOpen) {
    this.arrowOpen = arrowOpen;
    return this;
  }

  /**
   * .
   * 
   * @return arrowOpen
   **/
  @Schema(description = "")
  public String getArrowOpen() {
    return arrowOpen;
  }

  /**
   * setArrowOpen.
   **/
  public void setArrowOpen(String arrowOpen) {
    this.arrowOpen = arrowOpen;
  }

  /**
   * arrowSize.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings arrowSize(String arrowSize) {
    this.arrowSize = arrowSize;
    return this;
  }

  /**
   * .
   * 
   * @return arrowSize
   **/
  @Schema(description = "")
  public String getArrowSize() {
    return arrowSize;
  }

  /**
   * setArrowSize.
   **/
  public void setArrowSize(String arrowSize) {
    this.arrowSize = arrowSize;
  }

  /**
   * arrowStyle.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings arrowStyle(String arrowStyle) {
    this.arrowStyle = arrowStyle;
    return this;
  }

  /**
   * .
   * 
   * @return arrowStyle
   **/
  @Schema(description = "")
  public String getArrowStyle() {
    return arrowStyle;
  }

  /**
   * setArrowStyle.
   **/
  public void setArrowStyle(String arrowStyle) {
    this.arrowStyle = arrowStyle;
  }

  /**
   * containerStyle.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings containerStyle(String containerStyle) {
    this.containerStyle = containerStyle;
    return this;
  }

  /**
   * .
   * 
   * @return containerStyle
   **/
  @Schema(description = "")
  public String getContainerStyle() {
    return containerStyle;
  }

  /**
   * setContainerStyle.
   **/
  public void setContainerStyle(String containerStyle) {
    this.containerStyle = containerStyle;
  }

  /**
   * labelStyle.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings labelStyle(String labelStyle) {
    this.labelStyle = labelStyle;
    return this;
  }

  /**
   * .
   * 
   * @return labelStyle
   **/
  @Schema(description = "")
  public String getLabelStyle() {
    return labelStyle;
  }

  /**
   * setLabelStyle.
   **/
  public void setLabelStyle(String labelStyle) {
    this.labelStyle = labelStyle;
  }

  /**
   * onlyArrowIsClickable.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings onlyArrowIsClickable(Boolean onlyArrowIsClickable) {
    this.onlyArrowIsClickable = onlyArrowIsClickable;
    return this;
  }

  /**
   * .
   * 
   * @return onlyArrowIsClickable
   **/
  @Schema(description = "")
  public Boolean isOnlyArrowIsClickable() {
    return onlyArrowIsClickable;
  }

  /**
   * setOnlyArrowIsClickable.
   **/
  public void setOnlyArrowIsClickable(Boolean onlyArrowIsClickable) {
    this.onlyArrowIsClickable = onlyArrowIsClickable;
  }

  /**
   * outerLabelAndArrowStyle.
   *
   * @return DocumentHtmlCollapsibleDisplaySettings
   **/
  public DocumentHtmlCollapsibleDisplaySettings outerLabelAndArrowStyle(String outerLabelAndArrowStyle) {
    this.outerLabelAndArrowStyle = outerLabelAndArrowStyle;
    return this;
  }

  /**
   * .
   * 
   * @return outerLabelAndArrowStyle
   **/
  @Schema(description = "")
  public String getOuterLabelAndArrowStyle() {
    return outerLabelAndArrowStyle;
  }

  /**
   * setOuterLabelAndArrowStyle.
   **/
  public void setOuterLabelAndArrowStyle(String outerLabelAndArrowStyle) {
    this.outerLabelAndArrowStyle = outerLabelAndArrowStyle;
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
    DocumentHtmlCollapsibleDisplaySettings documentHtmlCollapsibleDisplaySettings = (DocumentHtmlCollapsibleDisplaySettings) o;
    return Objects.equals(this.arrowClosed, documentHtmlCollapsibleDisplaySettings.arrowClosed) &&
        Objects.equals(this.arrowColor, documentHtmlCollapsibleDisplaySettings.arrowColor) &&
        Objects.equals(this.arrowLocation, documentHtmlCollapsibleDisplaySettings.arrowLocation) &&
        Objects.equals(this.arrowOpen, documentHtmlCollapsibleDisplaySettings.arrowOpen) &&
        Objects.equals(this.arrowSize, documentHtmlCollapsibleDisplaySettings.arrowSize) &&
        Objects.equals(this.arrowStyle, documentHtmlCollapsibleDisplaySettings.arrowStyle) &&
        Objects.equals(this.containerStyle, documentHtmlCollapsibleDisplaySettings.containerStyle) &&
        Objects.equals(this.labelStyle, documentHtmlCollapsibleDisplaySettings.labelStyle) &&
        Objects.equals(this.onlyArrowIsClickable, documentHtmlCollapsibleDisplaySettings.onlyArrowIsClickable) &&
        Objects.equals(this.outerLabelAndArrowStyle, documentHtmlCollapsibleDisplaySettings.outerLabelAndArrowStyle);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(arrowClosed, arrowColor, arrowLocation, arrowOpen, arrowSize, arrowStyle, containerStyle,
        labelStyle, onlyArrowIsClickable, outerLabelAndArrowStyle);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHtmlCollapsibleDisplaySettings {\n");

    sb.append("    arrowClosed: ").append(toIndentedString(arrowClosed)).append("\n");
    sb.append("    arrowColor: ").append(toIndentedString(arrowColor)).append("\n");
    sb.append("    arrowLocation: ").append(toIndentedString(arrowLocation)).append("\n");
    sb.append("    arrowOpen: ").append(toIndentedString(arrowOpen)).append("\n");
    sb.append("    arrowSize: ").append(toIndentedString(arrowSize)).append("\n");
    sb.append("    arrowStyle: ").append(toIndentedString(arrowStyle)).append("\n");
    sb.append("    containerStyle: ").append(toIndentedString(containerStyle)).append("\n");
    sb.append("    labelStyle: ").append(toIndentedString(labelStyle)).append("\n");
    sb.append("    onlyArrowIsClickable: ").append(toIndentedString(onlyArrowIsClickable)).append("\n");
    sb.append("    outerLabelAndArrowStyle: ").append(toIndentedString(outerLabelAndArrowStyle)).append("\n");
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
