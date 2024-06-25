package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Watermark.
 *
 */

public class Watermark implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * displayAngle.
   *
   * @return Watermark
   **/
  public Watermark displayAngle(String displayAngle) {
    this.displayAngle = displayAngle;
    return this;
  }

  /**
   * .
   * @return displayAngle
   **/
  @Schema(description = "")
  public String getDisplayAngle() {
    return displayAngle;
  }

  /**
   * setDisplayAngle.
   **/
  public void setDisplayAngle(String displayAngle) {
    this.displayAngle = displayAngle;
  }


  /**
   * enabled.
   *
   * @return Watermark
   **/
  public Watermark enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * .
   * @return enabled
   **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  /**
   * setEnabled.
   **/
  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }


  /**
   * font.
   *
   * @return Watermark
   **/
  public Watermark font(String font) {
    this.font = font;
    return this;
  }

  /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default..
   * @return font
   **/
  @Schema(description = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  /**
   * setFont.
   **/
  public void setFont(String font) {
    this.font = font;
  }


  /**
   * fontColor.
   *
   * @return Watermark
   **/
  public Watermark fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White..
   * @return fontColor
   **/
  @Schema(description = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  /**
   * setFontColor.
   **/
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }


  /**
   * fontSize.
   *
   * @return Watermark
   **/
  public Watermark fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72..
   * @return fontSize
   **/
  @Schema(description = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  /**
   * setFontSize.
   **/
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * id.
   *
   * @return Watermark
   **/
  public Watermark id(String id) {
    this.id = id;
    return this;
  }

  /**
   * .
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * imageBase64.
   *
   * @return Watermark
   **/
  public Watermark imageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
    return this;
  }

  /**
   * .
   * @return imageBase64
   **/
  @Schema(description = "")
  public String getImageBase64() {
    return imageBase64;
  }

  /**
   * setImageBase64.
   **/
  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }


  /**
   * transparency.
   *
   * @return Watermark
   **/
  public Watermark transparency(String transparency) {
    this.transparency = transparency;
    return this;
  }

  /**
   * .
   * @return transparency
   **/
  @Schema(description = "")
  public String getTransparency() {
    return transparency;
  }

  /**
   * setTransparency.
   **/
  public void setTransparency(String transparency) {
    this.transparency = transparency;
  }


  /**
   * watermarkText.
   *
   * @return Watermark
   **/
  public Watermark watermarkText(String watermarkText) {
    this.watermarkText = watermarkText;
    return this;
  }

  /**
   * .
   * @return watermarkText
   **/
  @Schema(description = "")
  public String getWatermarkText() {
    return watermarkText;
  }

  /**
   * setWatermarkText.
   **/
  public void setWatermarkText(String watermarkText) {
    this.watermarkText = watermarkText;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(displayAngle, enabled, font, fontColor, fontSize, id, imageBase64, transparency, watermarkText);
  }


  /**
   * Converts the given object to string.
   */
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

