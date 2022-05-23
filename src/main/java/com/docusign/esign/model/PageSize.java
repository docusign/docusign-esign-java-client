package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** PageSize */
public class PageSize {
  @JsonProperty("pageHeight")
  private String pageHeight = null;

  @JsonProperty("pageWidth")
  private String pageWidth = null;

  public PageSize pageHeight(String pageHeight) {
    this.pageHeight = pageHeight;
    return this;
  }

  /** @return pageHeight */
  @ApiModelProperty(example = "null", value = "")
  public String getPageHeight() {
    return pageHeight;
  }

  public void setPageHeight(String pageHeight) {
    this.pageHeight = pageHeight;
  }

  public PageSize pageWidth(String pageWidth) {
    this.pageWidth = pageWidth;
    return this;
  }

  /** @return pageWidth */
  @ApiModelProperty(example = "null", value = "")
  public String getPageWidth() {
    return pageWidth;
  }

  public void setPageWidth(String pageWidth) {
    this.pageWidth = pageWidth;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageSize pageSize = (PageSize) o;
    return Objects.equals(this.pageHeight, pageSize.pageHeight)
        && Objects.equals(this.pageWidth, pageSize.pageWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageHeight, pageWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageSize {\n");

    sb.append("    pageHeight: ").append(toIndentedString(pageHeight)).append("\n");
    sb.append("    pageWidth: ").append(toIndentedString(pageWidth)).append("\n");
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
