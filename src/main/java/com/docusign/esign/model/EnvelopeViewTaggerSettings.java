package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PaletteSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeViewTaggerSettings.
 *
 */

public class EnvelopeViewTaggerSettings {
  @JsonProperty("paletteDefault")
  private String paletteDefault = null;

  @JsonProperty("paletteSections")
  private String paletteSections = null;

  @JsonProperty("paletteSettings")
  private PaletteSettings paletteSettings = null;


  /**
   * paletteDefault.
   *
   * @return EnvelopeViewTaggerSettings
   **/
  public EnvelopeViewTaggerSettings paletteDefault(String paletteDefault) {
    this.paletteDefault = paletteDefault;
    return this;
  }

  /**
   * .
   * @return paletteDefault
   **/
  @Schema(description = "")
  public String getPaletteDefault() {
    return paletteDefault;
  }

  /**
   * setPaletteDefault.
   **/
  public void setPaletteDefault(String paletteDefault) {
    this.paletteDefault = paletteDefault;
  }


  /**
   * paletteSections.
   *
   * @return EnvelopeViewTaggerSettings
   **/
  public EnvelopeViewTaggerSettings paletteSections(String paletteSections) {
    this.paletteSections = paletteSections;
    return this;
  }

  /**
   * .
   * @return paletteSections
   **/
  @Schema(description = "")
  public String getPaletteSections() {
    return paletteSections;
  }

  /**
   * setPaletteSections.
   **/
  public void setPaletteSections(String paletteSections) {
    this.paletteSections = paletteSections;
  }


  /**
   * paletteSettings.
   *
   * @return EnvelopeViewTaggerSettings
   **/
  public EnvelopeViewTaggerSettings paletteSettings(PaletteSettings paletteSettings) {
    this.paletteSettings = paletteSettings;
    return this;
  }

  /**
   * .
   * @return paletteSettings
   **/
  @Schema(description = "")
  public PaletteSettings getPaletteSettings() {
    return paletteSettings;
  }

  /**
   * setPaletteSettings.
   **/
  public void setPaletteSettings(PaletteSettings paletteSettings) {
    this.paletteSettings = paletteSettings;
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
    EnvelopeViewTaggerSettings envelopeViewTaggerSettings = (EnvelopeViewTaggerSettings) o;
    return Objects.equals(this.paletteDefault, envelopeViewTaggerSettings.paletteDefault) &&
        Objects.equals(this.paletteSections, envelopeViewTaggerSettings.paletteSections) &&
        Objects.equals(this.paletteSettings, envelopeViewTaggerSettings.paletteSettings);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(paletteDefault, paletteSections, paletteSettings);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewTaggerSettings {\n");
    
    sb.append("    paletteDefault: ").append(toIndentedString(paletteDefault)).append("\n");
    sb.append("    paletteSections: ").append(toIndentedString(paletteSections)).append("\n");
    sb.append("    paletteSettings: ").append(toIndentedString(paletteSettings)).append("\n");
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

