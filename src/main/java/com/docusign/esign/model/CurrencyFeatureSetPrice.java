package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CurrencyFeatureSetPrice. */
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

  /**
   * currencyCode.
   *
   * @return CurrencyFeatureSetPrice
   */
  public CurrencyFeatureSetPrice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Specifies the alternate ISO currency code for the account. .
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "Specifies the alternate ISO currency code for the account. ")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /** setCurrencyCode. */
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * currencySymbol.
   *
   * @return CurrencyFeatureSetPrice
   */
  public CurrencyFeatureSetPrice currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

  /**
   * Specifies the alternate currency symbol for the account..
   *
   * @return currencySymbol
   */
  @ApiModelProperty(value = "Specifies the alternate currency symbol for the account.")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  /** setCurrencySymbol. */
  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  /**
   * envelopeFee.
   *
   * @return CurrencyFeatureSetPrice
   */
  public CurrencyFeatureSetPrice envelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
    return this;
  }

  /**
   * An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to
   * **true**.).
   *
   * @return envelopeFee
   */
  @ApiModelProperty(
      value =
          "An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)")
  public String getEnvelopeFee() {
    return envelopeFee;
  }

  /** setEnvelopeFee. */
  public void setEnvelopeFee(String envelopeFee) {
    this.envelopeFee = envelopeFee;
  }

  /**
   * fixedFee.
   *
   * @return CurrencyFeatureSetPrice
   */
  public CurrencyFeatureSetPrice fixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
    return this;
  }

  /**
   * Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.).
   *
   * @return fixedFee
   */
  @ApiModelProperty(
      value =
          "Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)")
  public String getFixedFee() {
    return fixedFee;
  }

  /** setFixedFee. */
  public void setFixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
  }

  /**
   * seatFee.
   *
   * @return CurrencyFeatureSetPrice
   */
  public CurrencyFeatureSetPrice seatFee(String seatFee) {
    this.seatFee = seatFee;
    return this;
  }

  /**
   * Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.).
   *
   * @return seatFee
   */
  @ApiModelProperty(
      value =
          "Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)")
  public String getSeatFee() {
    return seatFee;
  }

  /** setSeatFee. */
  public void setSeatFee(String seatFee) {
    this.seatFee = seatFee;
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
    CurrencyFeatureSetPrice currencyFeatureSetPrice = (CurrencyFeatureSetPrice) o;
    return Objects.equals(this.currencyCode, currencyFeatureSetPrice.currencyCode)
        && Objects.equals(this.currencySymbol, currencyFeatureSetPrice.currencySymbol)
        && Objects.equals(this.envelopeFee, currencyFeatureSetPrice.envelopeFee)
        && Objects.equals(this.fixedFee, currencyFeatureSetPrice.fixedFee)
        && Objects.equals(this.seatFee, currencyFeatureSetPrice.seatFee);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencySymbol, envelopeFee, fixedFee, seatFee);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
