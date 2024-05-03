package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PaletteItemSettings.
 *
 */

public class PaletteItemSettings {
  @JsonProperty("show")
  private String show = null;


  /**
   * show.
   *
   * @return PaletteItemSettings
   **/
  public PaletteItemSettings show(String show) {
    this.show = show;
    return this;
  }

  /**
   * .
   * @return show
   **/
  @Schema(description = "")
  public String getShow() {
    return show;
  }

  /**
   * setShow.
   **/
  public void setShow(String show) {
    this.show = show;
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
    PaletteItemSettings paletteItemSettings = (PaletteItemSettings) o;
    return Objects.equals(this.show, paletteItemSettings.show);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(show);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaletteItemSettings {\n");
    
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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

