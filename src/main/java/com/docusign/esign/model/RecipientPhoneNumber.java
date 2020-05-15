package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientPhoneNumber
 */

public class RecipientPhoneNumber {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("countryCodeMetadata")
  private PropertyMetadata countryCodeMetadata = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("numberMetadata")
  private PropertyMetadata numberMetadata = null;

  public RecipientPhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RecipientPhoneNumber countryCodeMetadata(PropertyMetadata countryCodeMetadata) {
    this.countryCodeMetadata = countryCodeMetadata;
    return this;
  }

   /**
   * Get countryCodeMetadata
   * @return countryCodeMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getCountryCodeMetadata() {
    return countryCodeMetadata;
  }

  public void setCountryCodeMetadata(PropertyMetadata countryCodeMetadata) {
    this.countryCodeMetadata = countryCodeMetadata;
  }

  public RecipientPhoneNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * 
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public RecipientPhoneNumber numberMetadata(PropertyMetadata numberMetadata) {
    this.numberMetadata = numberMetadata;
    return this;
  }

   /**
   * Get numberMetadata
   * @return numberMetadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getNumberMetadata() {
    return numberMetadata;
  }

  public void setNumberMetadata(PropertyMetadata numberMetadata) {
    this.numberMetadata = numberMetadata;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryCodeMetadata, number, numberMetadata);
  }


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

