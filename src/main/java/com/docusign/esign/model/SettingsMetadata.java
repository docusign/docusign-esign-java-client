package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Metadata that indicates whether a property is editable and describes setting-specific options..
 *
 */
@Schema(description = "Metadata that indicates whether a property is editable and describes setting-specific options.")

public class SettingsMetadata {
  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("options")
  private java.util.List<String> options = null;

  @JsonProperty("rights")
  private String rights = null;

  @JsonProperty("uiHint")
  private String uiHint = null;

  @JsonProperty("uiOrder")
  private String uiOrder = null;

  @JsonProperty("uiType")
  private String uiType = null;


  /**
   * is21CFRPart11.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

  /**
   * When set to **true**, indicates that this module is enabled on the account..
   * @return is21CFRPart11
   **/
  @Schema(description = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  /**
   * setIs21CFRPart11.
   **/
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }


  /**
   * options.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata options(java.util.List<String> options) {
    this.options = options;
    return this;
  }
  
  /**
   * addOptionsItem.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new java.util.ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * .
   * @return options
   **/
  @Schema(description = "")
  public java.util.List<String> getOptions() {
    return options;
  }

  /**
   * setOptions.
   **/
  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }


  /**
   * rights.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata rights(String rights) {
    this.rights = rights;
    return this;
  }

  /**
   * .
   * @return rights
   **/
  @Schema(description = "")
  public String getRights() {
    return rights;
  }

  /**
   * setRights.
   **/
  public void setRights(String rights) {
    this.rights = rights;
  }


  /**
   * uiHint.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata uiHint(String uiHint) {
    this.uiHint = uiHint;
    return this;
  }

  /**
   * .
   * @return uiHint
   **/
  @Schema(description = "")
  public String getUiHint() {
    return uiHint;
  }

  /**
   * setUiHint.
   **/
  public void setUiHint(String uiHint) {
    this.uiHint = uiHint;
  }


  /**
   * uiOrder.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata uiOrder(String uiOrder) {
    this.uiOrder = uiOrder;
    return this;
  }

  /**
   * .
   * @return uiOrder
   **/
  @Schema(description = "")
  public String getUiOrder() {
    return uiOrder;
  }

  /**
   * setUiOrder.
   **/
  public void setUiOrder(String uiOrder) {
    this.uiOrder = uiOrder;
  }


  /**
   * uiType.
   *
   * @return SettingsMetadata
   **/
  public SettingsMetadata uiType(String uiType) {
    this.uiType = uiType;
    return this;
  }

  /**
   * .
   * @return uiType
   **/
  @Schema(description = "")
  public String getUiType() {
    return uiType;
  }

  /**
   * setUiType.
   **/
  public void setUiType(String uiType) {
    this.uiType = uiType;
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
    SettingsMetadata settingsMetadata = (SettingsMetadata) o;
    return Objects.equals(this.is21CFRPart11, settingsMetadata.is21CFRPart11) &&
        Objects.equals(this.options, settingsMetadata.options) &&
        Objects.equals(this.rights, settingsMetadata.rights) &&
        Objects.equals(this.uiHint, settingsMetadata.uiHint) &&
        Objects.equals(this.uiOrder, settingsMetadata.uiOrder) &&
        Objects.equals(this.uiType, settingsMetadata.uiType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(is21CFRPart11, options, rights, uiHint, uiOrder, uiType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsMetadata {\n");
    
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    uiHint: ").append(toIndentedString(uiHint)).append("\n");
    sb.append("    uiOrder: ").append(toIndentedString(uiOrder)).append("\n");
    sb.append("    uiType: ").append(toIndentedString(uiType)).append("\n");
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

