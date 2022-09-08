package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BillingInvoicesSummary.
 *
 */

public class BillingInvoicesSummary {
  @JsonProperty("accountBalance")
  private String accountBalance = null;

  @JsonProperty("billingInvoices")
  private java.util.List<BillingInvoice> billingInvoices = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("pastDueBalance")
  private String pastDueBalance = null;

  @JsonProperty("paymentAllowed")
  private String paymentAllowed = null;


  /**
   * accountBalance.
   *
   * @return BillingInvoicesSummary
   **/
  public BillingInvoicesSummary accountBalance(String accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * .
   * @return accountBalance
   **/
  @ApiModelProperty(value = "")
  public String getAccountBalance() {
    return accountBalance;
  }

  /**
   * setAccountBalance.
   **/
  public void setAccountBalance(String accountBalance) {
    this.accountBalance = accountBalance;
  }


  /**
   * billingInvoices.
   *
   * @return BillingInvoicesSummary
   **/
  public BillingInvoicesSummary billingInvoices(java.util.List<BillingInvoice> billingInvoices) {
    this.billingInvoices = billingInvoices;
    return this;
  }
  
  /**
   * addBillingInvoicesItem.
   *
   * @return BillingInvoicesSummary
   **/
  public BillingInvoicesSummary addBillingInvoicesItem(BillingInvoice billingInvoicesItem) {
    if (this.billingInvoices == null) {
      this.billingInvoices = new java.util.ArrayList<>();
    }
    this.billingInvoices.add(billingInvoicesItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingInvoices
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<BillingInvoice> getBillingInvoices() {
    return billingInvoices;
  }

  /**
   * setBillingInvoices.
   **/
  public void setBillingInvoices(java.util.List<BillingInvoice> billingInvoices) {
    this.billingInvoices = billingInvoices;
  }


  /**
   * currencyCode.
   *
   * @return BillingInvoicesSummary
   **/
  public BillingInvoicesSummary currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * .
   * @return currencyCode
   **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * setCurrencyCode.
   **/
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * pastDueBalance.
   *
   * @return BillingInvoicesSummary
   **/
  public BillingInvoicesSummary pastDueBalance(String pastDueBalance) {
    this.pastDueBalance = pastDueBalance;
    return this;
  }

  /**
   * .
   * @return pastDueBalance
   **/
  @ApiModelProperty(value = "")
  public String getPastDueBalance() {
    return pastDueBalance;
  }

  /**
   * setPastDueBalance.
   **/
  public void setPastDueBalance(String pastDueBalance) {
    this.pastDueBalance = pastDueBalance;
  }


  /**
   * paymentAllowed.
   *
   * @return BillingInvoicesSummary
   **/
  public BillingInvoicesSummary paymentAllowed(String paymentAllowed) {
    this.paymentAllowed = paymentAllowed;
    return this;
  }

  /**
   * .
   * @return paymentAllowed
   **/
  @ApiModelProperty(value = "")
  public String getPaymentAllowed() {
    return paymentAllowed;
  }

  /**
   * setPaymentAllowed.
   **/
  public void setPaymentAllowed(String paymentAllowed) {
    this.paymentAllowed = paymentAllowed;
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
    BillingInvoicesSummary billingInvoicesSummary = (BillingInvoicesSummary) o;
    return Objects.equals(this.accountBalance, billingInvoicesSummary.accountBalance) &&
        Objects.equals(this.billingInvoices, billingInvoicesSummary.billingInvoices) &&
        Objects.equals(this.currencyCode, billingInvoicesSummary.currencyCode) &&
        Objects.equals(this.pastDueBalance, billingInvoicesSummary.pastDueBalance) &&
        Objects.equals(this.paymentAllowed, billingInvoicesSummary.paymentAllowed);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountBalance, billingInvoices, currencyCode, pastDueBalance, paymentAllowed);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoicesSummary {\n");
    
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    billingInvoices: ").append(toIndentedString(billingInvoices)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    pastDueBalance: ").append(toIndentedString(pastDueBalance)).append("\n");
    sb.append("    paymentAllowed: ").append(toIndentedString(paymentAllowed)).append("\n");
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

