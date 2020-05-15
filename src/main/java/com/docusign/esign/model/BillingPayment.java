package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information on a billing plan.
 */
@ApiModel(description = "Contains information on a billing plan.")

public class BillingPayment {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("invoiceId")
  private String invoiceId = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  public BillingPayment amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Reserved: TBD
   * @return amount
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BillingPayment invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Reserved: TBD
   * @return invoiceId
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public BillingPayment paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * 
   * @return paymentId
  **/
  @ApiModelProperty(value = "")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPayment billingPayment = (BillingPayment) o;
    return Objects.equals(this.amount, billingPayment.amount) &&
        Objects.equals(this.invoiceId, billingPayment.invoiceId) &&
        Objects.equals(this.paymentId, billingPayment.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, invoiceId, paymentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPayment {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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

