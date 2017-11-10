package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CreditCardTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CurrencyPlanPrice
 */

public class CurrencyPlanPrice {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("currencySymbol")
  private String currencySymbol = null;

  @JsonProperty("perSeatPrice")
  private String perSeatPrice = null;

  @JsonProperty("supportedCardTypes")
  private CreditCardTypes supportedCardTypes = null;

  @JsonProperty("supportIncidentFee")
  private String supportIncidentFee = null;

  @JsonProperty("supportPlanFee")
  private String supportPlanFee = null;

  public CurrencyPlanPrice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code for the account.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CurrencyPlanPrice currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Specifies the currency symbol for the account.
   * @return currencySymbol
  **/
  @ApiModelProperty(example = "null", value = "Specifies the currency symbol for the account.")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public CurrencyPlanPrice perSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
    return this;
  }

   /**
   * 
   * @return perSeatPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }

  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }

  public CurrencyPlanPrice supportedCardTypes(CreditCardTypes supportedCardTypes) {
    this.supportedCardTypes = supportedCardTypes;
    return this;
  }

   /**
   * Get supportedCardTypes
   * @return supportedCardTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public CreditCardTypes getSupportedCardTypes() {
    return supportedCardTypes;
  }

  public void setSupportedCardTypes(CreditCardTypes supportedCardTypes) {
    this.supportedCardTypes = supportedCardTypes;
  }

  public CurrencyPlanPrice supportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
    return this;
  }

   /**
   * The support incident fee charged for each support incident.
   * @return supportIncidentFee
  **/
  @ApiModelProperty(example = "null", value = "The support incident fee charged for each support incident.")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }

  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }

  public CurrencyPlanPrice supportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
    return this;
  }

   /**
   * The support plan fee charged for this plan.
   * @return supportPlanFee
  **/
  @ApiModelProperty(example = "null", value = "The support plan fee charged for this plan.")
  public String getSupportPlanFee() {
    return supportPlanFee;
  }

  public void setSupportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyPlanPrice currencyPlanPrice = (CurrencyPlanPrice) o;
    return Objects.equals(this.currencyCode, currencyPlanPrice.currencyCode) &&
        Objects.equals(this.currencySymbol, currencyPlanPrice.currencySymbol) &&
        Objects.equals(this.perSeatPrice, currencyPlanPrice.perSeatPrice) &&
        Objects.equals(this.supportedCardTypes, currencyPlanPrice.supportedCardTypes) &&
        Objects.equals(this.supportIncidentFee, currencyPlanPrice.supportIncidentFee) &&
        Objects.equals(this.supportPlanFee, currencyPlanPrice.supportPlanFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, perSeatPrice, supportedCardTypes, supportIncidentFee, supportPlanFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyPlanPrice {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    sb.append("    supportedCardTypes: ").append(toIndentedString(supportedCardTypes)).append("\n");
    sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
    sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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

