package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Describes information about the &#x60;total&#x60; of a payment. .
 *
 */
@Schema(description = "Describes information about the `total` of a payment. ")

public class Money implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amountInBaseUnit")
  private String amountInBaseUnit = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("displayAmount")
  private String displayAmount = null;


  /**
   * amountInBaseUnit.
   *
   * @return Money
   **/
  public Money amountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
    return this;
  }

  /**
   * .
   * @return amountInBaseUnit
   **/
  @Schema(description = "")
  public String getAmountInBaseUnit() {
    return amountInBaseUnit;
  }

  /**
   * setAmountInBaseUnit.
   **/
  public void setAmountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
  }


  /**
   * currency.
   *
   * @return Money
   **/
  public Money currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * .
   * @return currency
   **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  /**
   * setCurrency.
   **/
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * displayAmount.
   *
   * @return Money
   **/
  public Money displayAmount(String displayAmount) {
    this.displayAmount = displayAmount;
    return this;
  }

  /**
   * .
   * @return displayAmount
   **/
  @Schema(description = "")
  public String getDisplayAmount() {
    return displayAmount;
  }

  /**
   * setDisplayAmount.
   **/
  public void setDisplayAmount(String displayAmount) {
    this.displayAmount = displayAmount;
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
    Money money = (Money) o;
    return Objects.equals(this.amountInBaseUnit, money.amountInBaseUnit) &&
        Objects.equals(this.currency, money.currency) &&
        Objects.equals(this.displayAmount, money.displayAmount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(amountInBaseUnit, currency, displayAmount);
  }


  /**
   * Converts the given object to string.
   */
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

