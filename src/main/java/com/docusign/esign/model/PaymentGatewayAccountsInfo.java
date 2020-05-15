package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PaymentGatewayAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentGatewayAccountsInfo
 */

public class PaymentGatewayAccountsInfo {
  @JsonProperty("paymentGatewayAccounts")
  private java.util.List<PaymentGatewayAccount> paymentGatewayAccounts = null;

  public PaymentGatewayAccountsInfo paymentGatewayAccounts(java.util.List<PaymentGatewayAccount> paymentGatewayAccounts) {
    this.paymentGatewayAccounts = paymentGatewayAccounts;
    return this;
  }

  public PaymentGatewayAccountsInfo addPaymentGatewayAccountsItem(PaymentGatewayAccount paymentGatewayAccountsItem) {
    if (this.paymentGatewayAccounts == null) {
      this.paymentGatewayAccounts = new java.util.ArrayList<PaymentGatewayAccount>();
    }
    this.paymentGatewayAccounts.add(paymentGatewayAccountsItem);
    return this;
  }

   /**
   * 
   * @return paymentGatewayAccounts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PaymentGatewayAccount> getPaymentGatewayAccounts() {
    return paymentGatewayAccounts;
  }

  public void setPaymentGatewayAccounts(java.util.List<PaymentGatewayAccount> paymentGatewayAccounts) {
    this.paymentGatewayAccounts = paymentGatewayAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentGatewayAccountsInfo paymentGatewayAccountsInfo = (PaymentGatewayAccountsInfo) o;
    return Objects.equals(this.paymentGatewayAccounts, paymentGatewayAccountsInfo.paymentGatewayAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentGatewayAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGatewayAccountsInfo {\n");
    
    sb.append("    paymentGatewayAccounts: ").append(toIndentedString(paymentGatewayAccounts)).append("\n");
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

