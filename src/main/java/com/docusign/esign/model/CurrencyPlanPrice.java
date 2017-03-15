package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CreditCardTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CurrencyPlanPrice   {
  
  private String currencyCode = null;
  private String currencySymbol = null;
  private String perSeatPrice = null;
  private CreditCardTypes supportedCardTypes = null;
  private String supportIncidentFee = null;
  private String supportPlanFee = null;

  
  /**
   * Specifies the ISO currency code for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * Specifies the currency symbol for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the currency symbol for the account.")
  @JsonProperty("currencySymbol")
  public String getCurrencySymbol() {
    return currencySymbol;
  }
  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("perSeatPrice")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }
  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supportedCardTypes")
  public CreditCardTypes getSupportedCardTypes() {
    return supportedCardTypes;
  }
  public void setSupportedCardTypes(CreditCardTypes supportedCardTypes) {
    this.supportedCardTypes = supportedCardTypes;
  }

  
  /**
   * The support incident fee charged for each support incident.
   **/
  
  @ApiModelProperty(value = "The support incident fee charged for each support incident.")
  @JsonProperty("supportIncidentFee")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }
  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }

  
  /**
   * The support plan fee charged for this plan.
   **/
  
  @ApiModelProperty(value = "The support plan fee charged for this plan.")
  @JsonProperty("supportPlanFee")
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

    return true && Objects.equals(currencyCode, currencyPlanPrice.currencyCode) &&
        Objects.equals(currencySymbol, currencyPlanPrice.currencySymbol) &&
        Objects.equals(perSeatPrice, currencyPlanPrice.perSeatPrice) &&
        Objects.equals(supportedCardTypes, currencyPlanPrice.supportedCardTypes) &&
        Objects.equals(supportIncidentFee, currencyPlanPrice.supportIncidentFee) &&
        Objects.equals(supportPlanFee, currencyPlanPrice.supportPlanFee)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, perSeatPrice, supportedCardTypes, supportIncidentFee, supportPlanFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyPlanPrice {\n");
    
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (currencySymbol != null)
      sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    if (perSeatPrice != null)
      sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    if (supportedCardTypes != null)
      sb.append("    supportedCardTypes: ").append(toIndentedString(supportedCardTypes)).append("\n");
    if (supportIncidentFee != null)
      sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
    if (supportPlanFee != null)
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

