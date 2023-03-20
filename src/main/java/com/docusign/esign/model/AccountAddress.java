package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Country;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about an account address..
 *
 */
@Schema(description = "Contains information about an account address.")

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


  /**
   * address1.
   *
   * @return AccountAddress
   **/
  public AccountAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * First Line of the address. Maximum length: 100 characters..
   * @return address1
   **/
  @Schema(description = "First Line of the address. Maximum length: 100 characters.")
  public String getAddress1() {
    return address1;
  }

  /**
   * setAddress1.
   **/
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  /**
   * address2.
   *
   * @return AccountAddress
   **/
  public AccountAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Second Line of the address. Maximum length: 100 characters..
   * @return address2
   **/
  @Schema(description = "Second Line of the address. Maximum length: 100 characters.")
  public String getAddress2() {
    return address2;
  }

  /**
   * setAddress2.
   **/
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  /**
   * city.
   *
   * @return AccountAddress
   **/
  public AccountAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city value of the address..
   * @return city
   **/
  @Schema(description = "The city value of the address.")
  public String getCity() {
    return city;
  }

  /**
   * setCity.
   **/
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * country.
   *
   * @return AccountAddress
   **/
  public AccountAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Specifies the country associated with the address..
   * @return country
   **/
  @Schema(description = "Specifies the country associated with the address.")
  public String getCountry() {
    return country;
  }

  /**
   * setCountry.
   **/
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * email.
   *
   * @return AccountAddress
   **/
  public AccountAddress email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * fax.
   *
   * @return AccountAddress
   **/
  public AccountAddress fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * .
   * @return fax
   **/
  @Schema(description = "")
  public String getFax() {
    return fax;
  }

  /**
   * setFax.
   **/
  public void setFax(String fax) {
    this.fax = fax;
  }


  /**
   * firstName.
   *
   * @return AccountAddress
   **/
  public AccountAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The user's first name.  Maximum Length: 50 characters..
   * @return firstName
   **/
  @Schema(description = "The user's first name.  Maximum Length: 50 characters.")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return AccountAddress
   **/
  public AccountAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * .
   * @return lastName
   **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * phone.
   *
   * @return AccountAddress
   **/
  public AccountAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * .
   * @return phone
   **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  /**
   * setPhone.
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   * postalCode.
   *
   * @return AccountAddress
   **/
  public AccountAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * .
   * @return postalCode
   **/
  @Schema(description = "")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * setPostalCode.
   **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * state.
   *
   * @return AccountAddress
   **/
  public AccountAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state or province associated with the address..
   * @return state
   **/
  @Schema(description = "The state or province associated with the address.")
  public String getState() {
    return state;
  }

  /**
   * setState.
   **/
  public void setState(String state) {
    this.state = state;
  }


  /**
   * supportedCountries.
   *
   * @return AccountAddress
   **/
  public AccountAddress supportedCountries(java.util.List<Country> supportedCountries) {
    this.supportedCountries = supportedCountries;
    return this;
  }
  
  /**
   * addSupportedCountriesItem.
   *
   * @return AccountAddress
   **/
  public AccountAddress addSupportedCountriesItem(Country supportedCountriesItem) {
    if (this.supportedCountries == null) {
      this.supportedCountries = new java.util.ArrayList<>();
    }
    this.supportedCountries.add(supportedCountriesItem);
    return this;
  }

  /**
   * Contains an array of countries supported by the billing plan..
   * @return supportedCountries
   **/
  @Schema(description = "Contains an array of countries supported by the billing plan.")
  public java.util.List<Country> getSupportedCountries() {
    return supportedCountries;
  }

  /**
   * setSupportedCountries.
   **/
  public void setSupportedCountries(java.util.List<Country> supportedCountries) {
    this.supportedCountries = supportedCountries;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, email, fax, firstName, lastName, phone, postalCode, state, supportedCountries);
  }


  /**
   * Converts the given object to string.
   */
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

