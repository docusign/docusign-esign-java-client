package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MatchBox
 */

public class MatchBox {
  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("xPosition")
  private Integer xPosition = null;

  @JsonProperty("yPosition")
  private Integer yPosition = null;

  public MatchBox height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the tab in pixels.
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "Height of the tab in pixels.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public MatchBox pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the page number on which the tab is located.
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "Specifies the page number on which the tab is located.")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public MatchBox width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the tab in pixels.
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "Width of the tab in pixels.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public MatchBox xPosition(Integer xPosition) {
    this.xPosition = xPosition;
    return this;
  }

   /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return xPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public Integer getXPosition() {
    return xPosition;
  }

  public void setXPosition(Integer xPosition) {
    this.xPosition = xPosition;
  }

  public MatchBox yPosition(Integer yPosition) {
    this.yPosition = yPosition;
    return this;
  }

   /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return yPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public Integer getYPosition() {
    return yPosition;
  }

  public void setYPosition(Integer yPosition) {
    this.yPosition = yPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchBox matchBox = (MatchBox) o;
    return Objects.equals(this.height, matchBox.height) &&
        Objects.equals(this.pageNumber, matchBox.pageNumber) &&
        Objects.equals(this.width, matchBox.width) &&
        Objects.equals(this.xPosition, matchBox.xPosition) &&
        Objects.equals(this.yPosition, matchBox.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, pageNumber, width, xPosition, yPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchBox {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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

