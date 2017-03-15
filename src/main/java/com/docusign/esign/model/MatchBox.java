package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class MatchBox   {
  
  private Integer height = null;
  private Integer pageNumber = null;
  private Integer width = null;
  private Integer xPosition = null;
  private Integer yPosition = null;

  
  /**
   * Height of the tab in pixels.
   **/
  
  @ApiModelProperty(value = "Height of the tab in pixels.")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   * Specifies the page number on which the tab is located.
   **/
  
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Width of the tab in pixels.
   **/
  
  @ApiModelProperty(value = "Width of the tab in pixels.")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  
  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   **/
  
  @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  @JsonProperty("xPosition")
  public Integer getXPosition() {
    return xPosition;
  }
  public void setXPosition(Integer xPosition) {
    this.xPosition = xPosition;
  }

  
  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   **/
  
  @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  @JsonProperty("yPosition")
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

    return true && Objects.equals(height, matchBox.height) &&
        Objects.equals(pageNumber, matchBox.pageNumber) &&
        Objects.equals(width, matchBox.width) &&
        Objects.equals(xPosition, matchBox.xPosition) &&
        Objects.equals(yPosition, matchBox.yPosition)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, pageNumber, width, xPosition, yPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchBox {\n");
    
    if (height != null)
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
    if (pageNumber != null)
      sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    if (width != null)
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
    if (xPosition != null)
      sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    if (yPosition != null)
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

