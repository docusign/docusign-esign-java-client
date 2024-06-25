package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * MatchBox.
 *
 */

public class MatchBox implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("yPosition")
  private String yPosition = null;


  /**
   * height.
   *
   * @return MatchBox
   **/
  public MatchBox height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
   * @return height
   **/
  @Schema(description = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  /**
   * setHeight.
   **/
  public void setHeight(String height) {
    this.height = height;
  }


  /**
   * pageNumber.
   *
   * @return MatchBox
   **/
  public MatchBox pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
   * @return pageNumber
   **/
  @Schema(description = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  /**
   * setPageNumber.
   **/
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * width.
   *
   * @return MatchBox
   **/
  public MatchBox width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
   * @return width
   **/
  @Schema(description = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  /**
   * setWidth.
   **/
  public void setWidth(String width) {
    this.width = width;
  }


  /**
   * xPosition.
   *
   * @return MatchBox
   **/
  public MatchBox xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position..
   * @return xPosition
   **/
  @Schema(description = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  /**
   * setXPosition.
   **/
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }


  /**
   * yPosition.
   *
   * @return MatchBox
   **/
  public MatchBox yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position..
   * @return yPosition
   **/
  @Schema(description = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  /**
   * setYPosition.
   **/
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
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
    MatchBox matchBox = (MatchBox) o;
    return Objects.equals(this.height, matchBox.height) &&
        Objects.equals(this.pageNumber, matchBox.pageNumber) &&
        Objects.equals(this.width, matchBox.width) &&
        Objects.equals(this.xPosition, matchBox.xPosition) &&
        Objects.equals(this.yPosition, matchBox.yPosition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(height, pageNumber, width, xPosition, yPosition);
  }


  /**
   * Converts the given object to string.
   */
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

