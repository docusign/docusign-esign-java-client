package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AddressInformationV2   {
  
  private String address1 = null;
  private String address2 = null;
  private String city = null;
  private String country = null;
  private String fax = null;
  private String phone = null;
  private String postalCode = null;
  private String stateOrProvince = null;

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
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
  @JsonProperty("stateOrProvince")
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

    return true && Objects.equals(address1, addressInformationV2.address1) &&
        Objects.equals(address2, addressInformationV2.address2) &&
        Objects.equals(city, addressInformationV2.city) &&
        Objects.equals(country, addressInformationV2.country) &&
        Objects.equals(fax, addressInformationV2.fax) &&
        Objects.equals(phone, addressInformationV2.phone) &&
        Objects.equals(postalCode, addressInformationV2.postalCode) &&
        Objects.equals(stateOrProvince, addressInformationV2.stateOrProvince)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, fax, phone, postalCode, stateOrProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformationV2 {\n");
    
    if (address1 != null)
      sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    if (address2 != null)
      sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    if (city != null)
      sb.append("    city: ").append(toIndentedString(city)).append("\n");
    if (country != null)
      sb.append("    country: ").append(toIndentedString(country)).append("\n");
    if (fax != null)
      sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    if (phone != null)
      sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    if (postalCode != null)
      sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    if (stateOrProvince != null)
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

