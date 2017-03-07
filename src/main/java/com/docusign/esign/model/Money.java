package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Money   {
  
  private String amountInBaseUnit = null;
  private String currency = null;
  private String displayAmount = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amountInBaseUnit")
  public String getAmountInBaseUnit() {
    return amountInBaseUnit;
  }
  public void setAmountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("displayAmount")
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

    return true && Objects.equals(amountInBaseUnit, money.amountInBaseUnit) &&
        Objects.equals(currency, money.currency) &&
        Objects.equals(displayAmount, money.displayAmount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountInBaseUnit, currency, displayAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    
    if (amountInBaseUnit != null)
      sb.append("    amountInBaseUnit: ").append(toIndentedString(amountInBaseUnit)).append("\n");
    if (currency != null)
      sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (displayAmount != null)
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

