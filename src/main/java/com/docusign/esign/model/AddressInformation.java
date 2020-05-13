package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains address information.
 */
@ApiModel(description = "Contains address information.")

public class AddressInformation {
  @JsonProperty("address1")
  private String address1 = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;

  @JsonProperty("zipPlus4")
  private String zipPlus4 = null;

  public AddressInformation address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First Line of the address. Maximum length: 100 characters.
   * @return address1
  **/
  @ApiModelProperty(value = "First Line of the address. Maximum length: 100 characters.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public AddressInformation address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second Line of the address. Maximum length: 100 characters.
   * @return address2
  **/
  @ApiModelProperty(value = "Second Line of the address. Maximum length: 100 characters.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public AddressInformation city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city associated with the address.
   * @return city
  **/
  @ApiModelProperty(value = "The city associated with the address.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Specifies the country associated with the address.
   * @return country
  **/
  @ApiModelProperty(value = "Specifies the country associated with the address.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressInformation fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * A Fax number associated with the address if one is available.
   * @return fax
  **/
  @ApiModelProperty(value = "A Fax number associated with the address if one is available.")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public AddressInformation phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * A phone number associated with the address.
   * @return phone
  **/
  @ApiModelProperty(value = "A phone number associated with the address.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AddressInformation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * 
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AddressInformation stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * 
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public AddressInformation zipPlus4(String zipPlus4) {
    this.zipPlus4 = zipPlus4;
    return this;
  }

   /**
   * 
   * @return zipPlus4
  **/
  @ApiModelProperty(value = "")
  public String getZipPlus4() {
    return zipPlus4;
  }

  public void setZipPlus4(String zipPlus4) {
    this.zipPlus4 = zipPlus4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInformation addressInformation = (AddressInformation) o;
    return Objects.equals(this.address1, addressInformation.address1) &&
        Objects.equals(this.address2, addressInformation.address2) &&
        Objects.equals(this.city, addressInformation.city) &&
        Objects.equals(this.country, addressInformation.country) &&
        Objects.equals(this.fax, addressInformation.fax) &&
        Objects.equals(this.phone, addressInformation.phone) &&
        Objects.equals(this.postalCode, addressInformation.postalCode) &&
        Objects.equals(this.stateOrProvince, addressInformation.stateOrProvince) &&
        Objects.equals(this.zipPlus4, addressInformation.zipPlus4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, fax, phone, postalCode, stateOrProvince, zipPlus4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformation {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    zipPlus4: ").append(toIndentedString(zipPlus4)).append("\n");
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

