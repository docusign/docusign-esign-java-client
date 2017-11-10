package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CurrencyFeatureSetPrice
 */

public class CurrencyFeatureSetPrice {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currencySymbol")
  private String currencySymbol = null;

  @JsonProperty("envelopeFee")
  private String envelopeFee = null;

  @JsonProperty("fixedFee")
  private String fixedFee = null;

  @JsonProperty("seatFee")
  private String seatFee = null;

  public CurrencyFeatureSetPrice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the alternate ISO currency code for the account. 
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the alternate ISO currency code for the account. ")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CurrencyFeatureSetPrice currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Specifies the alternate currency symbol for the account.
   * @return currencySymbol
  **/
  @ApiModelProperty(example = "null", value = "Specifies the alternate currency symbol for the account.")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public CurrencyFeatureSetPrice envelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
    return this;
  }

   /**
   * An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)
   * @return envelopeFee
  **/
  @ApiModelProperty(example = "null", value = "An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)")
  public String getEnvelopeFee() {
    return envelopeFee;
  }

  public void setEnvelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
  }

  public CurrencyFeatureSetPrice fixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
    return this;
  }

   /**
   * Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)
   * @return fixedFee
  **/
  @ApiModelProperty(example = "null", value = "Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)")
  public String getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
  }

  public CurrencyFeatureSetPrice seatFee(String seatFee) {
    this.seatFee = seatFee;
    return this;
  }

   /**
   * Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)
   * @return seatFee
  **/
  @ApiModelProperty(example = "null", value = "Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)")
  public String getSeatFee() {
    return seatFee;
  }

  public void setSeatFee(String seatFee) {
    this.seatFee = seatFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyFeatureSetPrice currencyFeatureSetPrice = (CurrencyFeatureSetPrice) o;
    return Objects.equals(this.currencyCode, currencyFeatureSetPrice.currencyCode) &&
        Objects.equals(this.currencySymbol, currencyFeatureSetPrice.currencySymbol) &&
        Objects.equals(this.envelopeFee, currencyFeatureSetPrice.envelopeFee) &&
        Objects.equals(this.fixedFee, currencyFeatureSetPrice.fixedFee) &&
        Objects.equals(this.seatFee, currencyFeatureSetPrice.seatFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, envelopeFee, fixedFee, seatFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyFeatureSetPrice {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    envelopeFee: ").append(toIndentedString(envelopeFee)).append("\n");
    sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
    sb.append("    seatFee: ").append(toIndentedString(seatFee)).append("\n");
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

