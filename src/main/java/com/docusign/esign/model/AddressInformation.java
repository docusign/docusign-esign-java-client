package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains address information.
 **/

@ApiModel(description = "Contains address information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class AddressInformation   {
  
  private String street1 = null;
  private String street2 = null;
  private String city = null;
  private String state = null;
  private String zip = null;
  private String phone = null;
  private String fax = null;
  private String country = null;

  
  /**
   * The first line of the address.
   **/
  public AddressInformation street1(String street1) {
    this.street1 = street1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The first line of the address.")
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  
  /**
   * The second line of the address (optional).
   **/
  public AddressInformation street2(String street2) {
    this.street2 = street2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The second line of the address (optional).")
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  
  /**
   * The city associated with the address.
   **/
  public AddressInformation city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The city associated with the address.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * The state or province associated with the address.
   **/
  public AddressInformation state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state or province associated with the address.")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * The zip or postal code associated with the address.
   **/
  public AddressInformation zip(String zip) {
    this.zip = zip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The zip or postal code associated with the address.")
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  
  /**
   * A phone number associated with the address.
   **/
  public AddressInformation phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A phone number associated with the address.")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * A Fax number associated with the address if one is available.
   **/
  public AddressInformation fax(String fax) {
    this.fax = fax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Fax number associated with the address if one is available.")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  
  /**
   * Specifies the country associated with the address.
   **/
  public AddressInformation country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the country associated with the address.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
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
    return Objects.equals(this.street1, addressInformation.street1) &&
        Objects.equals(this.street2, addressInformation.street2) &&
        Objects.equals(this.city, addressInformation.city) &&
        Objects.equals(this.state, addressInformation.state) &&
        Objects.equals(this.zip, addressInformation.zip) &&
        Objects.equals(this.phone, addressInformation.phone) &&
        Objects.equals(this.fax, addressInformation.fax) &&
        Objects.equals(this.country, addressInformation.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street1, street2, city, state, zip, phone, fax, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformation {\n");
    
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

