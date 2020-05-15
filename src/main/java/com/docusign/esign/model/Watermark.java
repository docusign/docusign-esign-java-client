package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Watermark
 */

public class Watermark {
  @JsonProperty("displayAngle")
  private String displayAngle = null;

  @JsonProperty("enabled")
  private String enabled = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("imageBase64")
  private String imageBase64 = null;

  @JsonProperty("transparency")
  private String transparency = null;

  @JsonProperty("watermarkText")
  private String watermarkText = null;

  public Watermark displayAngle(String displayAngle) {
    this.displayAngle = displayAngle;
    return this;
  }

   /**
   * 
   * @return displayAngle
  **/
  @ApiModelProperty(value = "")
  public String getDisplayAngle() {
    return displayAngle;
  }

  public void setDisplayAngle(String displayAngle) {
    this.displayAngle = displayAngle;
  }

  public Watermark enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * 
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public Watermark font(String font) {
    this.font = font;
    return this;
  }

   /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
   * @return font
  **/
  @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public Watermark fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
   * @return fontColor
  **/
  @ApiModelProperty(value = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public Watermark fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
   * @return fontSize
  **/
  @ApiModelProperty(value = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public Watermark id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Watermark imageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
    return this;
  }

   /**
   * 
   * @return imageBase64
  **/
  @ApiModelProperty(value = "")
  public String getImageBase64() {
    return imageBase64;
  }

  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }

  public Watermark transparency(String transparency) {
    this.transparency = transparency;
    return this;
  }

   /**
   * 
   * @return transparency
  **/
  @ApiModelProperty(value = "")
  public String getTransparency() {
    return transparency;
  }

  public void setTransparency(String transparency) {
    this.transparency = transparency;
  }

  public Watermark watermarkText(String watermarkText) {
    this.watermarkText = watermarkText;
    return this;
  }

   /**
   * 
   * @return watermarkText
  **/
  @ApiModelProperty(value = "")
  public String getWatermarkText() {
    return watermarkText;
  }

  public void setWatermarkText(String watermarkText) {
    this.watermarkText = watermarkText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watermark watermark = (Watermark) o;
    return Objects.equals(this.displayAngle, watermark.displayAngle) &&
        Objects.equals(this.enabled, watermark.enabled) &&
        Objects.equals(this.font, watermark.font) &&
        Objects.equals(this.fontColor, watermark.fontColor) &&
        Objects.equals(this.fontSize, watermark.fontSize) &&
        Objects.equals(this.id, watermark.id) &&
        Objects.equals(this.imageBase64, watermark.imageBase64) &&
        Objects.equals(this.transparency, watermark.transparency) &&
        Objects.equals(this.watermarkText, watermark.watermarkText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayAngle, enabled, font, fontColor, fontSize, id, imageBase64, transparency, watermarkText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watermark {\n");
    
    sb.append("    displayAngle: ").append(toIndentedString(displayAngle)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
    sb.append("    watermarkText: ").append(toIndentedString(watermarkText)).append("\n");
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

