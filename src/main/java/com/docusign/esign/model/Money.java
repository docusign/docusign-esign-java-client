package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Money
 */

public class Money {
  @JsonProperty("amountInBaseUnit")
  private String amountInBaseUnit = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("displayAmount")
  private String displayAmount = null;

  public Money amountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
    return this;
  }

   /**
   * 
   * @return amountInBaseUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAmountInBaseUnit() {
    return amountInBaseUnit;
  }

  public void setAmountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
  }

  public Money currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Money displayAmount(String displayAmount) {
    this.displayAmount = displayAmount;
    return this;
  }

   /**
   * 
   * @return displayAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayAmount() {
    return displayAmount;
  }

  public void setDisplayAmount(String displayAmount) {
    this.displayAmount = displayAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return Objects.equals(this.amountInBaseUnit, money.amountInBaseUnit) &&
        Objects.equals(this.currency, money.currency) &&
        Objects.equals(this.displayAmount, money.displayAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountInBaseUnit, currency, displayAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    
    sb.append("    amountInBaseUnit: ").append(toIndentedString(amountInBaseUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    displayAmount: ").append(toIndentedString(displayAmount)).append("\n");
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

