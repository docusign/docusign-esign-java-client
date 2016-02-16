package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
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
  
  @ApiModelProperty(value = "The first line of the address.")
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
  
  @ApiModelProperty(value = "The second line of the address (optional).")
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
  
  @ApiModelProperty(value = "The city associated with the address.")
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
  
  @ApiModelProperty(value = "The state or province associated with the address.")
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
  
  @ApiModelProperty(value = "The zip or postal code associated with the address.")
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
  
  @ApiModelProperty(value = "A phone number associated with the address.")
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
  
  @ApiModelProperty(value = "A Fax number associated with the address if one is available.")
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
  
  @ApiModelProperty(value = "Specifies the country associated with the address.")
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

    return true && Objects.equals(street1, addressInformation.street1) &&
        Objects.equals(street2, addressInformation.street2) &&
        Objects.equals(city, addressInformation.city) &&
        Objects.equals(state, addressInformation.state) &&
        Objects.equals(zip, addressInformation.zip) &&
        Objects.equals(phone, addressInformation.phone) &&
        Objects.equals(fax, addressInformation.fax) &&
        Objects.equals(country, addressInformation.country)
    ;
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

