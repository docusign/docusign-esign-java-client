package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Description of a page of a document..
 *
 */
@Schema(description = "Description of a page of a document.")

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


  /**
   * dpi.
   *
   * @return Page
   **/
  public Page dpi(String dpi) {
    this.dpi = dpi;
    return this;
  }

  /**
   * The number of dots per inch used for the page image..
   * @return dpi
   **/
  @Schema(description = "The number of dots per inch used for the page image.")
  public String getDpi() {
    return dpi;
  }

  /**
   * setDpi.
   **/
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }


  /**
   * errorDetails.
   *
   * @return Page
   **/
  public Page errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * height.
   *
   * @return Page
   **/
  public Page height(String height) {
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
   * imageBytes.
   *
   * @return Page
   **/
  public Page imageBytes(String imageBytes) {
    this.imageBytes = imageBytes;
    return this;
  }

  /**
   * .
   * @return imageBytes
   **/
  @Schema(description = "")
  public String getImageBytes() {
    return imageBytes;
  }

  /**
   * setImageBytes.
   **/
  public void setImageBytes(String imageBytes) {
    this.imageBytes = imageBytes;
  }


  /**
   * mimeType.
   *
   * @return Page
   **/
  public Page mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * .
   * @return mimeType
   **/
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }

  /**
   * setMimeType.
   **/
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  /**
   * pageId.
   *
   * @return Page
   **/
  public Page pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * .
   * @return pageId
   **/
  @Schema(description = "")
  public String getPageId() {
    return pageId;
  }

  /**
   * setPageId.
   **/
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }


  /**
   * sequence.
   *
   * @return Page
   **/
  public Page sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * .
   * @return sequence
   **/
  @Schema(description = "")
  public String getSequence() {
    return sequence;
  }

  /**
   * setSequence.
   **/
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  /**
   * width.
   *
   * @return Page
   **/
  public Page width(String width) {
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dpi, errorDetails, height, imageBytes, mimeType, pageId, sequence, width);
  }


  /**
   * Converts the given object to string.
   */
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

