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
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("street1")
  private String street1 = null;

  @JsonProperty("street2")
  private String street2 = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("zipPlus4")
  private String zipPlus4 = null;

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

  public AddressInformation state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state or province associated with the address.
   * @return state
  **/
  @ApiModelProperty(value = "The state or province associated with the address.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressInformation street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * The first line of the address.
   * @return street1
  **/
  @ApiModelProperty(value = "The first line of the address.")
  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public AddressInformation street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * The second line of the address (optional).
   * @return street2
  **/
  @ApiModelProperty(value = "The second line of the address (optional).")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public AddressInformation zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * The zip or postal code associated with the address.
   * @return zip
  **/
  @ApiModelProperty(value = "The zip or postal code associated with the address.")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
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
    return Objects.equals(this.city, addressInformation.city) &&
        Objects.equals(this.country, addressInformation.country) &&
        Objects.equals(this.fax, addressInformation.fax) &&
        Objects.equals(this.phone, addressInformation.phone) &&
        Objects.equals(this.state, addressInformation.state) &&
        Objects.equals(this.street1, addressInformation.street1) &&
        Objects.equals(this.street2, addressInformation.street2) &&
        Objects.equals(this.zip, addressInformation.zip) &&
        Objects.equals(this.zipPlus4, addressInformation.zipPlus4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, fax, phone, state, street1, street2, zip, zipPlus4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformation {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

