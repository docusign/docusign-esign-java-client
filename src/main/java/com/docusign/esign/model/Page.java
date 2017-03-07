package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Description of a page of a document.
 **/

@ApiModel(description = "Description of a page of a document.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Page   {
  
  private String dpi = null;
  private ErrorDetails errorDetails = null;
  private String height = null;
  private String imageBytes = null;
  private String mimeType = null;
  private String pageId = null;
  private String sequence = null;
  private String width = null;

  
  /**
   * The number of dots per inch used for the page image.
   **/
  
  @ApiModelProperty(value = "The number of dots per inch used for the page image.")
  @JsonProperty("dpi")
  public String getDpi() {
    return dpi;
  }
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * Height of the tab in pixels.
   **/
  
  @ApiModelProperty(value = "Height of the tab in pixels.")
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("imageBytes")
  public String getImageBytes() {
    return imageBytes;
  }
  public void setImageBytes(String imageBytes) {
    this.imageBytes = imageBytes;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageId")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sequence")
  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  
  /**
   * Width of the tab in pixels.
   **/
  
  @ApiModelProperty(value = "Width of the tab in pixels.")
  @JsonProperty("width")
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

    return true && Objects.equals(dpi, page.dpi) &&
        Objects.equals(errorDetails, page.errorDetails) &&
        Objects.equals(height, page.height) &&
        Objects.equals(imageBytes, page.imageBytes) &&
        Objects.equals(mimeType, page.mimeType) &&
        Objects.equals(pageId, page.pageId) &&
        Objects.equals(sequence, page.sequence) &&
        Objects.equals(width, page.width)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpi, errorDetails, height, imageBytes, mimeType, pageId, sequence, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    if (dpi != null)
      sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (height != null)
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
    if (imageBytes != null)
      sb.append("    imageBytes: ").append(toIndentedString(imageBytes)).append("\n");
    if (mimeType != null)
      sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    if (pageId != null)
      sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    if (sequence != null)
      sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    if (width != null)
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

