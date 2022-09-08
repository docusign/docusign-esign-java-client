package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Object specifying the format of the string provided to a recipient in order to access an envelope..
 *
 */
@ApiModel(description = "Object specifying the format of the string provided to a recipient in order to access an envelope.")

public class AccessCodeFormat {
  @JsonProperty("formatRequired")
  private String formatRequired = null;

  @JsonProperty("formatRequiredMetadata")
  private SettingsMetadata formatRequiredMetadata = null;

  @JsonProperty("letterRequired")
  private String letterRequired = null;

  @JsonProperty("letterRequiredMetadata")
  private SettingsMetadata letterRequiredMetadata = null;

  @JsonProperty("minimumLength")
  private String minimumLength = null;

  @JsonProperty("minimumLengthMetadata")
  private SettingsMetadata minimumLengthMetadata = null;

  @JsonProperty("numberRequired")
  private String numberRequired = null;

  @JsonProperty("numberRequiredMetadata")
  private SettingsMetadata numberRequiredMetadata = null;

  @JsonProperty("specialCharacterRequired")
  private String specialCharacterRequired = null;

  @JsonProperty("specialCharacterRequiredMetadata")
  private SettingsMetadata specialCharacterRequiredMetadata = null;


  /**
   * formatRequired.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat formatRequired(String formatRequired) {
    this.formatRequired = formatRequired;
    return this;
  }

  /**
   * .
   * @return formatRequired
   **/
  @ApiModelProperty(value = "")
  public String getFormatRequired() {
    return formatRequired;
  }

  /**
   * setFormatRequired.
   **/
  public void setFormatRequired(String formatRequired) {
    this.formatRequired = formatRequired;
  }


  /**
   * formatRequiredMetadata.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat formatRequiredMetadata(SettingsMetadata formatRequiredMetadata) {
    this.formatRequiredMetadata = formatRequiredMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `formatRequired` property is editable..
   * @return formatRequiredMetadata
   **/
  @ApiModelProperty(value = "Metadata indicating whether the `formatRequired` property is editable.")
  public SettingsMetadata getFormatRequiredMetadata() {
    return formatRequiredMetadata;
  }

  /**
   * setFormatRequiredMetadata.
   **/
  public void setFormatRequiredMetadata(SettingsMetadata formatRequiredMetadata) {
    this.formatRequiredMetadata = formatRequiredMetadata;
  }


  /**
   * letterRequired.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat letterRequired(String letterRequired) {
    this.letterRequired = letterRequired;
    return this;
  }

  /**
   * .
   * @return letterRequired
   **/
  @ApiModelProperty(value = "")
  public String getLetterRequired() {
    return letterRequired;
  }

  /**
   * setLetterRequired.
   **/
  public void setLetterRequired(String letterRequired) {
    this.letterRequired = letterRequired;
  }


  /**
   * letterRequiredMetadata.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat letterRequiredMetadata(SettingsMetadata letterRequiredMetadata) {
    this.letterRequiredMetadata = letterRequiredMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `letterRequired` property is editable..
   * @return letterRequiredMetadata
   **/
  @ApiModelProperty(value = "Metadata indicating whether the `letterRequired` property is editable.")
  public SettingsMetadata getLetterRequiredMetadata() {
    return letterRequiredMetadata;
  }

  /**
   * setLetterRequiredMetadata.
   **/
  public void setLetterRequiredMetadata(SettingsMetadata letterRequiredMetadata) {
    this.letterRequiredMetadata = letterRequiredMetadata;
  }


  /**
   * minimumLength.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat minimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

  /**
   * .
   * @return minimumLength
   **/
  @ApiModelProperty(value = "")
  public String getMinimumLength() {
    return minimumLength;
  }

  /**
   * setMinimumLength.
   **/
  public void setMinimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
  }


  /**
   * minimumLengthMetadata.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat minimumLengthMetadata(SettingsMetadata minimumLengthMetadata) {
    this.minimumLengthMetadata = minimumLengthMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `minimumLength` property is editable..
   * @return minimumLengthMetadata
   **/
  @ApiModelProperty(value = "Metadata indicating whether the `minimumLength` property is editable.")
  public SettingsMetadata getMinimumLengthMetadata() {
    return minimumLengthMetadata;
  }

  /**
   * setMinimumLengthMetadata.
   **/
  public void setMinimumLengthMetadata(SettingsMetadata minimumLengthMetadata) {
    this.minimumLengthMetadata = minimumLengthMetadata;
  }


  /**
   * numberRequired.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat numberRequired(String numberRequired) {
    this.numberRequired = numberRequired;
    return this;
  }

  /**
   * .
   * @return numberRequired
   **/
  @ApiModelProperty(value = "")
  public String getNumberRequired() {
    return numberRequired;
  }

  /**
   * setNumberRequired.
   **/
  public void setNumberRequired(String numberRequired) {
    this.numberRequired = numberRequired;
  }


  /**
   * numberRequiredMetadata.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat numberRequiredMetadata(SettingsMetadata numberRequiredMetadata) {
    this.numberRequiredMetadata = numberRequiredMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `numberRequired` property is editable..
   * @return numberRequiredMetadata
   **/
  @ApiModelProperty(value = "Metadata indicating whether the `numberRequired` property is editable.")
  public SettingsMetadata getNumberRequiredMetadata() {
    return numberRequiredMetadata;
  }

  /**
   * setNumberRequiredMetadata.
   **/
  public void setNumberRequiredMetadata(SettingsMetadata numberRequiredMetadata) {
    this.numberRequiredMetadata = numberRequiredMetadata;
  }


  /**
   * specialCharacterRequired.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat specialCharacterRequired(String specialCharacterRequired) {
    this.specialCharacterRequired = specialCharacterRequired;
    return this;
  }

  /**
   * .
   * @return specialCharacterRequired
   **/
  @ApiModelProperty(value = "")
  public String getSpecialCharacterRequired() {
    return specialCharacterRequired;
  }

  /**
   * setSpecialCharacterRequired.
   **/
  public void setSpecialCharacterRequired(String specialCharacterRequired) {
    this.specialCharacterRequired = specialCharacterRequired;
  }


  /**
   * specialCharacterRequiredMetadata.
   *
   * @return AccessCodeFormat
   **/
  public AccessCodeFormat specialCharacterRequiredMetadata(SettingsMetadata specialCharacterRequiredMetadata) {
    this.specialCharacterRequiredMetadata = specialCharacterRequiredMetadata;
    return this;
  }

  /**
   * Metadata indicating whether the `specialCharacterRequired` property is editable..
   * @return specialCharacterRequiredMetadata
   **/
  @ApiModelProperty(value = "Metadata indicating whether the `specialCharacterRequired` property is editable.")
  public SettingsMetadata getSpecialCharacterRequiredMetadata() {
    return specialCharacterRequiredMetadata;
  }

  /**
   * setSpecialCharacterRequiredMetadata.
   **/
  public void setSpecialCharacterRequiredMetadata(SettingsMetadata specialCharacterRequiredMetadata) {
    this.specialCharacterRequiredMetadata = specialCharacterRequiredMetadata;
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
    AccessCodeFormat accessCodeFormat = (AccessCodeFormat) o;
    return Objects.equals(this.formatRequired, accessCodeFormat.formatRequired) &&
        Objects.equals(this.formatRequiredMetadata, accessCodeFormat.formatRequiredMetadata) &&
        Objects.equals(this.letterRequired, accessCodeFormat.letterRequired) &&
        Objects.equals(this.letterRequiredMetadata, accessCodeFormat.letterRequiredMetadata) &&
        Objects.equals(this.minimumLength, accessCodeFormat.minimumLength) &&
        Objects.equals(this.minimumLengthMetadata, accessCodeFormat.minimumLengthMetadata) &&
        Objects.equals(this.numberRequired, accessCodeFormat.numberRequired) &&
        Objects.equals(this.numberRequiredMetadata, accessCodeFormat.numberRequiredMetadata) &&
        Objects.equals(this.specialCharacterRequired, accessCodeFormat.specialCharacterRequired) &&
        Objects.equals(this.specialCharacterRequiredMetadata, accessCodeFormat.specialCharacterRequiredMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formatRequired, formatRequiredMetadata, letterRequired, letterRequiredMetadata, minimumLength, minimumLengthMetadata, numberRequired, numberRequiredMetadata, specialCharacterRequired, specialCharacterRequiredMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCodeFormat {\n");
    
    sb.append("    formatRequired: ").append(toIndentedString(formatRequired)).append("\n");
    sb.append("    formatRequiredMetadata: ").append(toIndentedString(formatRequiredMetadata)).append("\n");
    sb.append("    letterRequired: ").append(toIndentedString(letterRequired)).append("\n");
    sb.append("    letterRequiredMetadata: ").append(toIndentedString(letterRequiredMetadata)).append("\n");
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
    sb.append("    minimumLengthMetadata: ").append(toIndentedString(minimumLengthMetadata)).append("\n");
    sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
    sb.append("    numberRequiredMetadata: ").append(toIndentedString(numberRequiredMetadata)).append("\n");
    sb.append("    specialCharacterRequired: ").append(toIndentedString(specialCharacterRequired)).append("\n");
    sb.append("    specialCharacterRequiredMetadata: ").append(toIndentedString(specialCharacterRequiredMetadata)).append("\n");
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

