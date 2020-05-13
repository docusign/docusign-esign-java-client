package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Country;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about an account address.
 */
@ApiModel(description = "Contains information about an account address.")

public class AccountAddress {
  @JsonProperty("address1")
  private String address1 = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("supportedCountries")
  private java.util.List<Country> supportedCountries = null;

  public AccountAddress address1(String address1) {
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

  public AccountAddress address2(String address2) {
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

  public AccountAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city value of the address.
   * @return city
  **/
  @ApiModelProperty(value = "The city value of the address.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountAddress country(String country) {
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

  public AccountAddress email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountAddress fax(String fax) {
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

  public AccountAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user's first name.  Maximum Length: 50 characters.
   * @return firstName
  **/
  @ApiModelProperty(value = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * 
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountAddress phone(String phone) {
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

  public AccountAddress postalCode(String postalCode) {
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

  public AccountAddress state(String state) {
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

  public AccountAddress supportedCountries(java.util.List<Country> supportedCountries) {
    this.supportedCountries = supportedCountries;
    return this;
  }

  public AccountAddress addSupportedCountriesItem(Country supportedCountriesItem) {
    if (this.supportedCountries == null) {
      this.supportedCountries = new java.util.ArrayList<Country>();
    }
    this.supportedCountries.add(supportedCountriesItem);
    return this;
  }

   /**
   * Contains an array of countries supported by the billing plan.
   * @return supportedCountries
  **/
  @ApiModelProperty(value = "Contains an array of countries supported by the billing plan.")
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
    return Objects.equals(this.address1, accountAddress.address1) &&
        Objects.equals(this.address2, accountAddress.address2) &&
        Objects.equals(this.city, accountAddress.city) &&
        Objects.equals(this.country, accountAddress.country) &&
        Objects.equals(this.email, accountAddress.email) &&
        Objects.equals(this.fax, accountAddress.fax) &&
        Objects.equals(this.firstName, accountAddress.firstName) &&
        Objects.equals(this.lastName, accountAddress.lastName) &&
        Objects.equals(this.phone, accountAddress.phone) &&
        Objects.equals(this.postalCode, accountAddress.postalCode) &&
        Objects.equals(this.state, accountAddress.state) &&
        Objects.equals(this.supportedCountries, accountAddress.supportedCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, email, fax, firstName, lastName, phone, postalCode, state, supportedCountries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

