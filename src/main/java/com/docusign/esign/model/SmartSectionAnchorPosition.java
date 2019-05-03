package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SmartSectionAnchorPosition
 */

public class SmartSectionAnchorPosition {
  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("xPosition")
  private Double xPosition = null;

  @JsonProperty("yPosition")
  private Double yPosition = null;

  public SmartSectionAnchorPosition pageNumber(Integer pageNumber) {
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

  public SmartSectionAnchorPosition xPosition(Double xPosition) {
    this.xPosition = xPosition;
    return this;
  }

   /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return xPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public Double getXPosition() {
    return xPosition;
  }

  public void setXPosition(Double xPosition) {
    this.xPosition = xPosition;
  }

  public SmartSectionAnchorPosition yPosition(Double yPosition) {
    this.yPosition = yPosition;
    return this;
  }

   /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return yPosition
  **/
  @ApiModelProperty(example = "null", value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public Double getYPosition() {
    return yPosition;
  }

  public void setYPosition(Double yPosition) {
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
    SmartSectionAnchorPosition smartSectionAnchorPosition = (SmartSectionAnchorPosition) o;
    return Objects.equals(this.pageNumber, smartSectionAnchorPosition.pageNumber) &&
        Objects.equals(this.xPosition, smartSectionAnchorPosition.xPosition) &&
        Objects.equals(this.yPosition, smartSectionAnchorPosition.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, xPosition, yPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartSectionAnchorPosition {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

