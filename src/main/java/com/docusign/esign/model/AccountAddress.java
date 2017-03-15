package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Country;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about an account address.
 **/

@ApiModel(description = "Contains information about an account address.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountAddress   {
  
  private String address1 = null;
  private String address2 = null;
  private String city = null;
  private String country = null;
  private String email = null;
  private String fax = null;
  private String firstName = null;
  private String lastName = null;
  private String phone = null;
  private String postalCode = null;
  private String state = null;
  private java.util.List<Country> supportedCountries = new java.util.ArrayList<Country>();

  
  /**
   * First Line of the address.\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "First Line of the address.\nMaximum length: 100 characters.")
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  /**
   * Second Line of the address.\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Second Line of the address.\nMaximum length: 100 characters.")
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  
  /**
   * The city value of the address.
   **/
  
  @ApiModelProperty(value = "The city value of the address.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  
  /**
   * The user’s first name. \nMaximum Length: 50 characters.
   **/
  
  @ApiModelProperty(value = "The user’s first name. \nMaximum Length: 50 characters.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
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
   * Contains an array of countries supported by the billing plan.
   **/
  
  @ApiModelProperty(value = "Contains an array of countries supported by the billing plan.")
  @JsonProperty("supportedCountries")
  public java.util.List<Country> getSupportedCountries() {
    return supportedCountries;
  }
  public void setSupportedCountries(java.util.List<Country> supportedCountries) {
    this.supportedCountries = supportedCountries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAddress accountAddress = (AccountAddress) o;

    return true && Objects.equals(address1, accountAddress.address1) &&
        Objects.equals(address2, accountAddress.address2) &&
        Objects.equals(city, accountAddress.city) &&
        Objects.equals(country, accountAddress.country) &&
        Objects.equals(email, accountAddress.email) &&
        Objects.equals(fax, accountAddress.fax) &&
        Objects.equals(firstName, accountAddress.firstName) &&
        Objects.equals(lastName, accountAddress.lastName) &&
        Objects.equals(phone, accountAddress.phone) &&
        Objects.equals(postalCode, accountAddress.postalCode) &&
        Objects.equals(state, accountAddress.state) &&
        Objects.equals(supportedCountries, accountAddress.supportedCountries)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, email, fax, firstName, lastName, phone, postalCode, state, supportedCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAddress {\n");
    
    if (address1 != null)
      sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    if (address2 != null)
      sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    if (city != null)
      sb.append("    city: ").append(toIndentedString(city)).append("\n");
    if (country != null)
      sb.append("    country: ").append(toIndentedString(country)).append("\n");
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (fax != null)
      sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    if (firstName != null)
      sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    if (lastName != null)
      sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    if (phone != null)
      sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    if (postalCode != null)
      sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    if (state != null)
      sb.append("    state: ").append(toIndentedString(state)).append("\n");
    if (supportedCountries != null)
      sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
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

