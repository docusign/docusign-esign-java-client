package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** GraphicsContext. */
public class GraphicsContext {
  @JsonProperty("fillColor")
  private String fillColor = null;

  @JsonProperty("lineColor")
  private String lineColor = null;

  @JsonProperty("lineWeight")
  private String lineWeight = null;

  /**
   * fillColor.
   *
   * @return GraphicsContext
   */
  public GraphicsContext fillColor(String fillColor) {
    this.fillColor = fillColor;
    return this;
  }

  /**
   * .
   *
   * @return fillColor
   */
  @ApiModelProperty(value = "")
  public String getFillColor() {
    return fillColor;
  }

  /** setFillColor. */
  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  /**
   * lineColor.
   *
   * @return GraphicsContext
   */
  public GraphicsContext lineColor(String lineColor) {
    this.lineColor = lineColor;
    return this;
  }

  /**
   * .
   *
   * @return lineColor
   */
  @ApiModelProperty(value = "")
  public String getLineColor() {
    return lineColor;
  }

  /** setLineColor. */
  public void setLineColor(String lineColor) {
    this.lineColor = lineColor;
  }

  /**
   * lineWeight.
   *
   * @return GraphicsContext
   */
  public GraphicsContext lineWeight(String lineWeight) {
    this.lineWeight = lineWeight;
    return this;
  }

  /**
   * .
   *
   * @return lineWeight
   */
  @ApiModelProperty(value = "")
  public String getLineWeight() {
    return lineWeight;
  }

  /** setLineWeight. */
  public void setLineWeight(String lineWeight) {
    this.lineWeight = lineWeight;
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
    GraphicsContext graphicsContext = (GraphicsContext) o;
    return Objects.equals(this.fillColor, graphicsContext.fillColor)
        && Objects.equals(this.lineColor, graphicsContext.lineColor)
        && Objects.equals(this.lineWeight, graphicsContext.lineWeight);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(fillColor, lineColor, lineWeight);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
