package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AddressInformationV2
 */

public class AddressInformationV2 {
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

  public AddressInformationV2 address1(String address1) {
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

  public AddressInformationV2 address2(String address2) {
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

  public AddressInformationV2 city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressInformationV2 country(String country) {
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

  public AddressInformationV2 fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * 
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public AddressInformationV2 phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * 
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AddressInformationV2 postalCode(String postalCode) {
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

  public AddressInformationV2 stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The state or province associated with the address.
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The state or province associated with the address.")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInformationV2 addressInformationV2 = (AddressInformationV2) o;
    return Objects.equals(this.address1, addressInformationV2.address1) &&
        Objects.equals(this.address2, addressInformationV2.address2) &&
        Objects.equals(this.city, addressInformationV2.city) &&
        Objects.equals(this.country, addressInformationV2.country) &&
        Objects.equals(this.fax, addressInformationV2.fax) &&
        Objects.equals(this.phone, addressInformationV2.phone) &&
        Objects.equals(this.postalCode, addressInformationV2.postalCode) &&
        Objects.equals(this.stateOrProvince, addressInformationV2.stateOrProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, fax, phone, postalCode, stateOrProvince);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformationV2 {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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

