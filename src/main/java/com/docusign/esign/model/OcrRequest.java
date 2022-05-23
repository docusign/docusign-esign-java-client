package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OcrRequest */
public class OcrRequest {
  @JsonProperty("ocrLanguage")
  private String ocrLanguage = null;

  @JsonProperty("pageSelection")
  private String pageSelection = null;

  @JsonProperty("setPageOrientation")
  private String setPageOrientation = null;

  @JsonProperty("showFrames")
  private String showFrames = null;

  @JsonProperty("showText")
  private String showText = null;

  @JsonProperty("skipPagesHavingExistingExtractableText")
  private String skipPagesHavingExistingExtractableText = null;

  public OcrRequest ocrLanguage(String ocrLanguage) {
    this.ocrLanguage = ocrLanguage;
    return this;
  }

  /** @return ocrLanguage */
  @ApiModelProperty(example = "null", value = "")
  public String getOcrLanguage() {
    return ocrLanguage;
  }

  public void setOcrLanguage(String ocrLanguage) {
    this.ocrLanguage = ocrLanguage;
  }

  public OcrRequest pageSelection(String pageSelection) {
    this.pageSelection = pageSelection;
    return this;
  }

  /** @return pageSelection */
  @ApiModelProperty(example = "null", value = "")
  public String getPageSelection() {
    return pageSelection;
  }

  public void setPageSelection(String pageSelection) {
    this.pageSelection = pageSelection;
  }

  public OcrRequest setPageOrientation(String setPageOrientation) {
    this.setPageOrientation = setPageOrientation;
    return this;
  }

  /** @return setPageOrientation */
  @ApiModelProperty(example = "null", value = "")
  public String getSetPageOrientation() {
    return setPageOrientation;
  }

  public void setSetPageOrientation(String setPageOrientation) {
    this.setPageOrientation = setPageOrientation;
  }

  public OcrRequest showFrames(String showFrames) {
    this.showFrames = showFrames;
    return this;
  }

  /** @return showFrames */
  @ApiModelProperty(example = "null", value = "")
  public String getShowFrames() {
    return showFrames;
  }

  public void setShowFrames(String showFrames) {
    this.showFrames = showFrames;
  }

  public OcrRequest showText(String showText) {
    this.showText = showText;
    return this;
  }

  /** @return showText */
  @ApiModelProperty(example = "null", value = "")
  public String getShowText() {
    return showText;
  }

  public void setShowText(String showText) {
    this.showText = showText;
  }

  public OcrRequest skipPagesHavingExistingExtractableText(
      String skipPagesHavingExistingExtractableText) {
    this.skipPagesHavingExistingExtractableText = skipPagesHavingExistingExtractableText;
    return this;
  }

  /** @return skipPagesHavingExistingExtractableText */
  @ApiModelProperty(example = "null", value = "")
  public String getSkipPagesHavingExistingExtractableText() {
    return skipPagesHavingExistingExtractableText;
  }

  public void setSkipPagesHavingExistingExtractableText(
      String skipPagesHavingExistingExtractableText) {
    this.skipPagesHavingExistingExtractableText = skipPagesHavingExistingExtractableText;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrRequest ocrRequest = (OcrRequest) o;
    return Objects.equals(this.ocrLanguage, ocrRequest.ocrLanguage)
        && Objects.equals(this.pageSelection, ocrRequest.pageSelection)
        && Objects.equals(this.setPageOrientation, ocrRequest.setPageOrientation)
        && Objects.equals(this.showFrames, ocrRequest.showFrames)
        && Objects.equals(this.showText, ocrRequest.showText)
        && Objects.equals(
            this.skipPagesHavingExistingExtractableText,
            ocrRequest.skipPagesHavingExistingExtractableText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ocrLanguage,
        pageSelection,
        setPageOrientation,
        showFrames,
        showText,
        skipPagesHavingExistingExtractableText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrRequest {\n");

    sb.append("    ocrLanguage: ").append(toIndentedString(ocrLanguage)).append("\n");
    sb.append("    pageSelection: ").append(toIndentedString(pageSelection)).append("\n");
    sb.append("    setPageOrientation: ").append(toIndentedString(setPageOrientation)).append("\n");
    sb.append("    showFrames: ").append(toIndentedString(showFrames)).append("\n");
    sb.append("    showText: ").append(toIndentedString(showText)).append("\n");
    sb.append("    skipPagesHavingExistingExtractableText: ")
        .append(toIndentedString(skipPagesHavingExistingExtractableText))
        .append("\n");
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
