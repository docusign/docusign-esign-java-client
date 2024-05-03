package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PaletteItemSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PaletteSettings.
 *
 */

public class PaletteSettings {
  @JsonProperty("annotations")
  private PaletteItemSettings annotations = null;

  @JsonProperty("custom")
  private PaletteItemSettings custom = null;

  @JsonProperty("merge")
  private PaletteItemSettings merge = null;

  @JsonProperty("notary")
  private PaletteItemSettings notary = null;

  @JsonProperty("seals")
  private PaletteItemSettings seals = null;

  @JsonProperty("smartContracts")
  private PaletteItemSettings smartContracts = null;

  @JsonProperty("smartSections")
  private PaletteItemSettings smartSections = null;


  /**
   * annotations.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings annotations(PaletteItemSettings annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * .
   * @return annotations
   **/
  @Schema(description = "")
  public PaletteItemSettings getAnnotations() {
    return annotations;
  }

  /**
   * setAnnotations.
   **/
  public void setAnnotations(PaletteItemSettings annotations) {
    this.annotations = annotations;
  }


  /**
   * custom.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings custom(PaletteItemSettings custom) {
    this.custom = custom;
    return this;
  }

  /**
   * .
   * @return custom
   **/
  @Schema(description = "")
  public PaletteItemSettings getCustom() {
    return custom;
  }

  /**
   * setCustom.
   **/
  public void setCustom(PaletteItemSettings custom) {
    this.custom = custom;
  }


  /**
   * merge.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings merge(PaletteItemSettings merge) {
    this.merge = merge;
    return this;
  }

  /**
   * .
   * @return merge
   **/
  @Schema(description = "")
  public PaletteItemSettings getMerge() {
    return merge;
  }

  /**
   * setMerge.
   **/
  public void setMerge(PaletteItemSettings merge) {
    this.merge = merge;
  }


  /**
   * notary.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings notary(PaletteItemSettings notary) {
    this.notary = notary;
    return this;
  }

  /**
   * .
   * @return notary
   **/
  @Schema(description = "")
  public PaletteItemSettings getNotary() {
    return notary;
  }

  /**
   * setNotary.
   **/
  public void setNotary(PaletteItemSettings notary) {
    this.notary = notary;
  }


  /**
   * seals.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings seals(PaletteItemSettings seals) {
    this.seals = seals;
    return this;
  }

  /**
   * .
   * @return seals
   **/
  @Schema(description = "")
  public PaletteItemSettings getSeals() {
    return seals;
  }

  /**
   * setSeals.
   **/
  public void setSeals(PaletteItemSettings seals) {
    this.seals = seals;
  }


  /**
   * smartContracts.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings smartContracts(PaletteItemSettings smartContracts) {
    this.smartContracts = smartContracts;
    return this;
  }

  /**
   * .
   * @return smartContracts
   **/
  @Schema(description = "")
  public PaletteItemSettings getSmartContracts() {
    return smartContracts;
  }

  /**
   * setSmartContracts.
   **/
  public void setSmartContracts(PaletteItemSettings smartContracts) {
    this.smartContracts = smartContracts;
  }


  /**
   * smartSections.
   *
   * @return PaletteSettings
   **/
  public PaletteSettings smartSections(PaletteItemSettings smartSections) {
    this.smartSections = smartSections;
    return this;
  }

  /**
   * .
   * @return smartSections
   **/
  @Schema(description = "")
  public PaletteItemSettings getSmartSections() {
    return smartSections;
  }

  /**
   * setSmartSections.
   **/
  public void setSmartSections(PaletteItemSettings smartSections) {
    this.smartSections = smartSections;
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
    PaletteSettings paletteSettings = (PaletteSettings) o;
    return Objects.equals(this.annotations, paletteSettings.annotations) &&
        Objects.equals(this.custom, paletteSettings.custom) &&
        Objects.equals(this.merge, paletteSettings.merge) &&
        Objects.equals(this.notary, paletteSettings.notary) &&
        Objects.equals(this.seals, paletteSettings.seals) &&
        Objects.equals(this.smartContracts, paletteSettings.smartContracts) &&
        Objects.equals(this.smartSections, paletteSettings.smartSections);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(annotations, custom, merge, notary, seals, smartContracts, smartSections);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaletteSettings {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    notary: ").append(toIndentedString(notary)).append("\n");
    sb.append("    seals: ").append(toIndentedString(seals)).append("\n");
    sb.append("    smartContracts: ").append(toIndentedString(smartContracts)).append("\n");
    sb.append("    smartSections: ").append(toIndentedString(smartSections)).append("\n");
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

