package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GraphicsContext
 */

public class GraphicsContext {
  @JsonProperty("fillColor")
  private String fillColor = null;

  @JsonProperty("lineColor")
  private String lineColor = null;

  @JsonProperty("lineWeight")
  private String lineWeight = null;

  public GraphicsContext fillColor(String fillColor) {
    this.fillColor = fillColor;
    return this;
  }

   /**
   * 
   * @return fillColor
  **/
  @ApiModelProperty(value = "")
  public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public GraphicsContext lineColor(String lineColor) {
    this.lineColor = lineColor;
    return this;
  }

   /**
   * 
   * @return lineColor
  **/
  @ApiModelProperty(value = "")
  public String getLineColor() {
    return lineColor;
  }

  public void setLineColor(String lineColor) {
    this.lineColor = lineColor;
  }

  public GraphicsContext lineWeight(String lineWeight) {
    this.lineWeight = lineWeight;
    return this;
  }

   /**
   * 
   * @return lineWeight
  **/
  @ApiModelProperty(value = "")
  public String getLineWeight() {
    return lineWeight;
  }

  public void setLineWeight(String lineWeight) {
    this.lineWeight = lineWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicsContext graphicsContext = (GraphicsContext) o;
    return Objects.equals(this.fillColor, graphicsContext.fillColor) &&
        Objects.equals(this.lineColor, graphicsContext.lineColor) &&
        Objects.equals(this.lineWeight, graphicsContext.lineWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillColor, lineColor, lineWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicsContext {\n");
    
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    lineColor: ").append(toIndentedString(lineColor)).append("\n");
    sb.append("    lineWeight: ").append(toIndentedString(lineWeight)).append("\n");
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

