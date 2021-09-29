package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientIdentityPhoneNumber.
 *
 */

public class RecipientIdentityPhoneNumber {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("countryCodeLock")
  private String countryCodeLock = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("number")
  private String number = null;


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
   * @return countryCode
   **/
  @ApiModelProperty(value = "")
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
   * @return countryCodeLock
   **/
  @ApiModelProperty(value = "")
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
   * @return extension
   **/
  @ApiModelProperty(value = "")
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
   * @return number
   **/
  @ApiModelProperty(value = "")
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
        Objects.equals(this.extension, recipientIdentityPhoneNumber.extension) &&
        Objects.equals(this.number, recipientIdentityPhoneNumber.number);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryCodeLock, extension, number);
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
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

