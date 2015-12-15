package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class MatchBox   {
  
  private Integer pageNumber = null;
  private Integer xPosition = null;
  private Integer yPosition = null;
  private Integer width = null;
  private Integer height = null;

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchBox matchBox = (MatchBox) o;
    return Objects.equals(pageNumber, matchBox.pageNumber) &&
        Objects.equals(xPosition, matchBox.xPosition) &&
        Objects.equals(yPosition, matchBox.yPosition) &&
        Objects.equals(width, matchBox.width) &&
        Objects.equals(height, matchBox.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, xPosition, yPosition, width, height);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchBox {\n");
    
    sb.append("    pageNumber: ").append(StringUtil.toIndentedString(pageNumber)).append("\n");
    sb.append("    xPosition: ").append(StringUtil.toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(StringUtil.toIndentedString(yPosition)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("    height: ").append(StringUtil.toIndentedString(height)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
