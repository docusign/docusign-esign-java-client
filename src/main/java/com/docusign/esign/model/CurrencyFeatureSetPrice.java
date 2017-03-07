package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CurrencyFeatureSetPrice   {
  
  private String currencyCode = null;
  private String currencySymbol = null;
  private String envelopeFee = null;
  private String fixedFee = null;
  private String seatFee = null;

  
  /**
   * Specifies the alternate ISO currency code for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the alternate ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * Specifies the alternate currency symbol for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the alternate currency symbol for the account.")
  @JsonProperty("currencySymbol")
  public String getCurrencySymbol() {
    return currencySymbol;
  }
  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  
  /**
   * An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)
   **/
  
  @ApiModelProperty(value = "An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)")
  @JsonProperty("envelopeFee")
  public String getEnvelopeFee() {
    return envelopeFee;
  }
  public void setEnvelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
  }

  
  /**
   * Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)
   **/
  
  @ApiModelProperty(value = "Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)")
  @JsonProperty("fixedFee")
  public String getFixedFee() {
    return fixedFee;
  }
  public void setFixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
  }

  
  /**
   * Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)
   **/
  
  @ApiModelProperty(value = "Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)")
  @JsonProperty("seatFee")
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

    return true && Objects.equals(currencyCode, currencyFeatureSetPrice.currencyCode) &&
        Objects.equals(currencySymbol, currencyFeatureSetPrice.currencySymbol) &&
        Objects.equals(envelopeFee, currencyFeatureSetPrice.envelopeFee) &&
        Objects.equals(fixedFee, currencyFeatureSetPrice.fixedFee) &&
        Objects.equals(seatFee, currencyFeatureSetPrice.seatFee)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, envelopeFee, fixedFee, seatFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyFeatureSetPrice {\n");
    
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (currencySymbol != null)
      sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    if (envelopeFee != null)
      sb.append("    envelopeFee: ").append(toIndentedString(envelopeFee)).append("\n");
    if (fixedFee != null)
      sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
    if (seatFee != null)
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

