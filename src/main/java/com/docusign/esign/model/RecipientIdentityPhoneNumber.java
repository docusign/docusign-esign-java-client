package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RecipientIdentityPhoneNumber.
 *
 */

public class RecipientIdentityPhoneNumber {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("countryCodeLock")
  private String countryCodeLock = null;

  @JsonProperty("countryCodeMetadata")
  private PropertyMetadata countryCodeMetadata = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("extensionMetadata")
  private PropertyMetadata extensionMetadata = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("numberMetadata")
  private PropertyMetadata numberMetadata = null;

  /**
   * countryCode.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * .
   * 
   * @return countryCode
   **/
  @Schema(description = "")
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * setCountryCode.
   **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * countryCodeLock.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber countryCodeLock(String countryCodeLock) {
    this.countryCodeLock = countryCodeLock;
    return this;
  }

  /**
   * .
   * 
   * @return countryCodeLock
   **/
  @Schema(description = "")
  public String getCountryCodeLock() {
    return countryCodeLock;
  }

  /**
   * setCountryCodeLock.
   **/
  public void setCountryCodeLock(String countryCodeLock) {
    this.countryCodeLock = countryCodeLock;
  }

  /**
   * countryCodeMetadata.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber countryCodeMetadata(PropertyMetadata countryCodeMetadata) {
    this.countryCodeMetadata = countryCodeMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the `countryCode` property is editable..
   * 
   * @return countryCodeMetadata
   **/
  @Schema(description = "Metadata that indicates if the `countryCode` property is editable.")
  public PropertyMetadata getCountryCodeMetadata() {
    return countryCodeMetadata;
  }

  /**
   * setCountryCodeMetadata.
   **/
  public void setCountryCodeMetadata(PropertyMetadata countryCodeMetadata) {
    this.countryCodeMetadata = countryCodeMetadata;
  }

  /**
   * extension.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * .
   * 
   * @return extension
   **/
  @Schema(description = "")
  public String getExtension() {
    return extension;
  }

  /**
   * setExtension.
   **/
  public void setExtension(String extension) {
    this.extension = extension;
  }

  /**
   * extensionMetadata.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber extensionMetadata(PropertyMetadata extensionMetadata) {
    this.extensionMetadata = extensionMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the `extension` property is editable..
   * 
   * @return extensionMetadata
   **/
  @Schema(description = "Metadata that indicates if the `extension` property is editable.")
  public PropertyMetadata getExtensionMetadata() {
    return extensionMetadata;
  }

  /**
   * setExtensionMetadata.
   **/
  public void setExtensionMetadata(PropertyMetadata extensionMetadata) {
    this.extensionMetadata = extensionMetadata;
  }

  /**
   * number.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber number(String number) {
    this.number = number;
    return this;
  }

  /**
   * .
   * 
   * @return number
   **/
  @Schema(description = "")
  public String getNumber() {
    return number;
  }

  /**
   * setNumber.
   **/
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * numberMetadata.
   *
   * @return RecipientIdentityPhoneNumber
   **/
  public RecipientIdentityPhoneNumber numberMetadata(PropertyMetadata numberMetadata) {
    this.numberMetadata = numberMetadata;
    return this;
  }

  /**
   * Metadata that indicates if the `number` property is editable..
   * 
   * @return numberMetadata
   **/
  @Schema(description = "Metadata that indicates if the `number` property is editable.")
  public PropertyMetadata getNumberMetadata() {
    return numberMetadata;
  }

  /**
   * setNumberMetadata.
   **/
  public void setNumberMetadata(PropertyMetadata numberMetadata) {
    this.numberMetadata = numberMetadata;
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
    RecipientIdentityPhoneNumber recipientIdentityPhoneNumber = (RecipientIdentityPhoneNumber) o;
    return Objects.equals(this.countryCode, recipientIdentityPhoneNumber.countryCode) &&
        Objects.equals(this.countryCodeLock, recipientIdentityPhoneNumber.countryCodeLock) &&
        Objects.equals(this.countryCodeMetadata, recipientIdentityPhoneNumber.countryCodeMetadata) &&
        Objects.equals(this.extension, recipientIdentityPhoneNumber.extension) &&
        Objects.equals(this.extensionMetadata, recipientIdentityPhoneNumber.extensionMetadata) &&
        Objects.equals(this.number, recipientIdentityPhoneNumber.number) &&
        Objects.equals(this.numberMetadata, recipientIdentityPhoneNumber.numberMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryCodeLock, countryCodeMetadata, extension, extensionMetadata, number,
        numberMetadata);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientIdentityPhoneNumber {\n");

    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryCodeLock: ").append(toIndentedString(countryCodeLock)).append("\n");
    sb.append("    countryCodeMetadata: ").append(toIndentedString(countryCodeMetadata)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    extensionMetadata: ").append(toIndentedString(extensionMetadata)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberMetadata: ").append(toIndentedString(numberMetadata)).append("\n");
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
