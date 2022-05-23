package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Money. */
public class Money {
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
   */
  public Money amountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
    return this;
  }

  /**
   * .
   *
   * @return amountInBaseUnit
   */
  @ApiModelProperty(value = "")
  public String getAmountInBaseUnit() {
    return amountInBaseUnit;
  }

  /** setAmountInBaseUnit. */
  public void setAmountInBaseUnit(String amountInBaseUnit) {
    this.amountInBaseUnit = amountInBaseUnit;
  }

  /**
   * currency.
   *
   * @return Money
   */
  public Money currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * .
   *
   * @return currency
   */
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  /** setCurrency. */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * displayAmount.
   *
   * @return Money
   */
  public Money displayAmount(String displayAmount) {
    this.displayAmount = displayAmount;
    return this;
  }

  /**
   * .
   *
   * @return displayAmount
   */
  @ApiModelProperty(value = "")
  public String getDisplayAmount() {
    return displayAmount;
  }

  /** setDisplayAmount. */
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
    return Objects.equals(this.amountInBaseUnit, money.amountInBaseUnit)
        && Objects.equals(this.currency, money.currency)
        && Objects.equals(this.displayAmount, money.displayAmount);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(amountInBaseUnit, currency, displayAmount);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
