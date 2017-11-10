package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BillingPaymentRequest
 */

public class BillingPaymentRequest {
  @JsonProperty("paymentAmount")
  private String paymentAmount = null;

  public BillingPaymentRequest paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * The payment amount for the past due invoices. This value must match the pastDueBalance value retrieved using Get Past Due Invoices.
   * @return paymentAmount
  **/
  @ApiModelProperty(example = "null", value = "The payment amount for the past due invoices. This value must match the pastDueBalance value retrieved using Get Past Due Invoices.")
  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPaymentRequest billingPaymentRequest = (BillingPaymentRequest) o;
    return Objects.equals(this.paymentAmount, billingPaymentRequest.paymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentRequest {\n");
    
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
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

