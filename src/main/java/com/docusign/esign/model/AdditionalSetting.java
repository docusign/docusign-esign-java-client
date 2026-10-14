package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AdditionalSetting.
 *
 */

public class AdditionalSetting implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("metadata")
  private SettingsMetadata metadata = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * metadata.
   *
   * @return AdditionalSetting
   **/
  public AdditionalSetting metadata(SettingsMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * .
   * @return metadata
   **/
  @Schema(description = "")
  public SettingsMetadata getMetadata() {
    return metadata;
  }

  /**
   * setMetadata.
   **/
  public void setMetadata(SettingsMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * name.
   *
   * @return AdditionalSetting
   **/
  public AdditionalSetting name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * value.
   *
   * @return AdditionalSetting
   **/
  public AdditionalSetting value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   * @return value
   **/
  @Schema(description = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(String value) {
    this.value = value;
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
    AdditionalSetting additionalSetting = (AdditionalSetting) o;
    return Objects.equals(this.metadata, additionalSetting.metadata) &&
        Objects.equals(this.name, additionalSetting.name) &&
        Objects.equals(this.value, additionalSetting.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(metadata, name, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalSetting {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

