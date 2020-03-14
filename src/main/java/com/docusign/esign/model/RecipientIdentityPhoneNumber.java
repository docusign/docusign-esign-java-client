package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientIdentityPhoneNumber
 */

public class RecipientIdentityPhoneNumber {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("number")
  private String number = null;

  public RecipientIdentityPhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RecipientIdentityPhoneNumber extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * 
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public RecipientIdentityPhoneNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * 
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


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
        Objects.equals(this.extension, recipientIdentityPhoneNumber.extension) &&
        Objects.equals(this.number, recipientIdentityPhoneNumber.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, extension, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientIdentityPhoneNumber {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

