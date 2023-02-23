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
 * Describes the recipient phone number..
 *
 */
@Schema(description = "Describes the recipient phone number.")

public class RecipientPhoneNumber {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("countryCodeMetadata")
  private PropertyMetadata countryCodeMetadata = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("numberMetadata")
  private PropertyMetadata numberMetadata = null;

  /**
   * countryCode.
   *
   * @return RecipientPhoneNumber
   **/
  public RecipientPhoneNumber countryCode(String countryCode) {
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
   * countryCodeMetadata.
   *
   * @return RecipientPhoneNumber
   **/
  public RecipientPhoneNumber countryCodeMetadata(PropertyMetadata countryCodeMetadata) {
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
   * number.
   *
   * @return RecipientPhoneNumber
   **/
  public RecipientPhoneNumber number(String number) {
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
   * @return RecipientPhoneNumber
   **/
  public RecipientPhoneNumber numberMetadata(PropertyMetadata numberMetadata) {
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
    RecipientPhoneNumber recipientPhoneNumber = (RecipientPhoneNumber) o;
    return Objects.equals(this.countryCode, recipientPhoneNumber.countryCode) &&
        Objects.equals(this.countryCodeMetadata, recipientPhoneNumber.countryCodeMetadata) &&
        Objects.equals(this.number, recipientPhoneNumber.number) &&
        Objects.equals(this.numberMetadata, recipientPhoneNumber.numberMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryCodeMetadata, number, numberMetadata);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPhoneNumber {\n");

    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryCodeMetadata: ").append(toIndentedString(countryCodeMetadata)).append("\n");
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
