package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SmartSectionCollapsibleDisplaySettings
 */

public class SmartSectionCollapsibleDisplaySettings {
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

  public SmartSectionCollapsibleDisplaySettings arrowClosed(String arrowClosed) {
    this.arrowClosed = arrowClosed;
    return this;
  }

   /**
   * 
   * @return arrowClosed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArrowClosed() {
    return arrowClosed;
  }

  public void setArrowClosed(String arrowClosed) {
    this.arrowClosed = arrowClosed;
  }

  public SmartSectionCollapsibleDisplaySettings arrowColor(String arrowColor) {
    this.arrowColor = arrowColor;
    return this;
  }

   /**
   * 
   * @return arrowColor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArrowColor() {
    return arrowColor;
  }

  public void setArrowColor(String arrowColor) {
    this.arrowColor = arrowColor;
  }

  public SmartSectionCollapsibleDisplaySettings arrowLocation(String arrowLocation) {
    this.arrowLocation = arrowLocation;
    return this;
  }

   /**
   * 
   * @return arrowLocation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArrowLocation() {
    return arrowLocation;
  }

  public void setArrowLocation(String arrowLocation) {
    this.arrowLocation = arrowLocation;
  }

  public SmartSectionCollapsibleDisplaySettings arrowOpen(String arrowOpen) {
    this.arrowOpen = arrowOpen;
    return this;
  }

   /**
   * 
   * @return arrowOpen
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArrowOpen() {
    return arrowOpen;
  }

  public void setArrowOpen(String arrowOpen) {
    this.arrowOpen = arrowOpen;
  }

  public SmartSectionCollapsibleDisplaySettings arrowSize(String arrowSize) {
    this.arrowSize = arrowSize;
    return this;
  }

   /**
   * 
   * @return arrowSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArrowSize() {
    return arrowSize;
  }

  public void setArrowSize(String arrowSize) {
    this.arrowSize = arrowSize;
  }

  public SmartSectionCollapsibleDisplaySettings arrowStyle(String arrowStyle) {
    this.arrowStyle = arrowStyle;
    return this;
  }

   /**
   * 
   * @return arrowStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArrowStyle() {
    return arrowStyle;
  }

  public void setArrowStyle(String arrowStyle) {
    this.arrowStyle = arrowStyle;
  }

  public SmartSectionCollapsibleDisplaySettings containerStyle(String containerStyle) {
    this.containerStyle = containerStyle;
    return this;
  }

   /**
   * 
   * @return containerStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContainerStyle() {
    return containerStyle;
  }

  public void setContainerStyle(String containerStyle) {
    this.containerStyle = containerStyle;
  }

  public SmartSectionCollapsibleDisplaySettings labelStyle(String labelStyle) {
    this.labelStyle = labelStyle;
    return this;
  }

   /**
   * 
   * @return labelStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabelStyle() {
    return labelStyle;
  }

  public void setLabelStyle(String labelStyle) {
    this.labelStyle = labelStyle;
  }

  public SmartSectionCollapsibleDisplaySettings onlyArrowIsClickable(Boolean onlyArrowIsClickable) {
    this.onlyArrowIsClickable = onlyArrowIsClickable;
    return this;
  }

   /**
   * 
   * @return onlyArrowIsClickable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getOnlyArrowIsClickable() {
    return onlyArrowIsClickable;
  }

  public void setOnlyArrowIsClickable(Boolean onlyArrowIsClickable) {
    this.onlyArrowIsClickable = onlyArrowIsClickable;
  }

  public SmartSectionCollapsibleDisplaySettings outerLabelAndArrowStyle(String outerLabelAndArrowStyle) {
    this.outerLabelAndArrowStyle = outerLabelAndArrowStyle;
    return this;
  }

   /**
   * 
   * @return outerLabelAndArrowStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOuterLabelAndArrowStyle() {
    return outerLabelAndArrowStyle;
  }

  public void setOuterLabelAndArrowStyle(String outerLabelAndArrowStyle) {
    this.outerLabelAndArrowStyle = outerLabelAndArrowStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartSectionCollapsibleDisplaySettings smartSectionCollapsibleDisplaySettings = (SmartSectionCollapsibleDisplaySettings) o;
    return Objects.equals(this.arrowClosed, smartSectionCollapsibleDisplaySettings.arrowClosed) &&
        Objects.equals(this.arrowColor, smartSectionCollapsibleDisplaySettings.arrowColor) &&
        Objects.equals(this.arrowLocation, smartSectionCollapsibleDisplaySettings.arrowLocation) &&
        Objects.equals(this.arrowOpen, smartSectionCollapsibleDisplaySettings.arrowOpen) &&
        Objects.equals(this.arrowSize, smartSectionCollapsibleDisplaySettings.arrowSize) &&
        Objects.equals(this.arrowStyle, smartSectionCollapsibleDisplaySettings.arrowStyle) &&
        Objects.equals(this.containerStyle, smartSectionCollapsibleDisplaySettings.containerStyle) &&
        Objects.equals(this.labelStyle, smartSectionCollapsibleDisplaySettings.labelStyle) &&
        Objects.equals(this.onlyArrowIsClickable, smartSectionCollapsibleDisplaySettings.onlyArrowIsClickable) &&
        Objects.equals(this.outerLabelAndArrowStyle, smartSectionCollapsibleDisplaySettings.outerLabelAndArrowStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrowClosed, arrowColor, arrowLocation, arrowOpen, arrowSize, arrowStyle, containerStyle, labelStyle, onlyArrowIsClickable, outerLabelAndArrowStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartSectionCollapsibleDisplaySettings {\n");
    
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

