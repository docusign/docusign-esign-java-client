package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Description of a page of a document.
 */
@ApiModel(description = "Description of a page of a document.")

public class Page {
  @JsonProperty("dpi")
  private String dpi = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("imageBytes")
  private String imageBytes = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("pageId")
  private String pageId = null;

  @JsonProperty("sequence")
  private String sequence = null;

  @JsonProperty("width")
  private String width = null;

  public Page dpi(String dpi) {
    this.dpi = dpi;
    return this;
  }

   /**
   * The number of dots per inch used for the page image.
   * @return dpi
  **/
  @ApiModelProperty(example = "null", value = "The number of dots per inch used for the page image.")
  public String getDpi() {
    return dpi;
  }

  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

  public Page errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Page height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the tab in pixels.
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public Page imageBytes(String imageBytes) {
    this.imageBytes = imageBytes;
    return this;
  }

   /**
   * 
   * @return imageBytes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getImageBytes() {
    return imageBytes;
  }

  public void setImageBytes(String imageBytes) {
    this.imageBytes = imageBytes;
  }

  public Page mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * 
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Page pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * 
   * @return pageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public Page sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * 
   * @return sequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public Page width(String width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the tab in pixels.
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.dpi, page.dpi) &&
        Objects.equals(this.errorDetails, page.errorDetails) &&
        Objects.equals(this.height, page.height) &&
        Objects.equals(this.imageBytes, page.imageBytes) &&
        Objects.equals(this.mimeType, page.mimeType) &&
        Objects.equals(this.pageId, page.pageId) &&
        Objects.equals(this.sequence, page.sequence) &&
        Objects.equals(this.width, page.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpi, errorDetails, height, imageBytes, mimeType, pageId, sequence, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageBytes: ").append(toIndentedString(imageBytes)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

