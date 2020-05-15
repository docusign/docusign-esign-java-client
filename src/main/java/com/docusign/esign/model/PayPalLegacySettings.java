package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PayPalLegacySettings
 */

public class PayPalLegacySettings {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("partner")
  private String partner = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("vendor")
  private String vendor = null;

  public PayPalLegacySettings currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PayPalLegacySettings partner(String partner) {
    this.partner = partner;
    return this;
  }

   /**
   * 
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public PayPalLegacySettings password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PayPalLegacySettings userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public PayPalLegacySettings vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * 
   * @return vendor
  **/
  @ApiModelProperty(value = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPalLegacySettings payPalLegacySettings = (PayPalLegacySettings) o;
    return Objects.equals(this.currency, payPalLegacySettings.currency) &&
        Objects.equals(this.partner, payPalLegacySettings.partner) &&
        Objects.equals(this.password, payPalLegacySettings.password) &&
        Objects.equals(this.userName, payPalLegacySettings.userName) &&
        Objects.equals(this.vendor, payPalLegacySettings.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, partner, password, userName, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalLegacySettings {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

