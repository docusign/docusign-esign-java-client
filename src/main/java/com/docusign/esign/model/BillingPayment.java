package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information on a billing plan..
 *
 */
@Schema(description = "Contains information on a billing plan.")

public class BillingPayment {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("invoiceId")
  private String invoiceId = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  /**
   * amount.
   *
   * @return BillingPayment
   **/
  public BillingPayment amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Reserved: TBD.
   * 
   * @return amount
   **/
  @Schema(description = "Reserved: TBD")
  public String getAmount() {
    return amount;
  }

  /**
   * setAmount.
   **/
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * invoiceId.
   *
   * @return BillingPayment
   **/
  public BillingPayment invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Reserved: TBD.
   * 
   * @return invoiceId
   **/
  @Schema(description = "Reserved: TBD")
  public String getInvoiceId() {
    return invoiceId;
  }

  /**
   * setInvoiceId.
   **/
  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  /**
   * paymentId.
   *
   * @return BillingPayment
   **/
  public BillingPayment paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * .
   * 
   * @return paymentId
   **/
  @Schema(description = "")
  public String getPaymentId() {
    return paymentId;
  }

  /**
   * setPaymentId.
   **/
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
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
    BillingPayment billingPayment = (BillingPayment) o;
    return Objects.equals(this.amount, billingPayment.amount) &&
        Objects.equals(this.invoiceId, billingPayment.invoiceId) &&
        Objects.equals(this.paymentId, billingPayment.paymentId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(amount, invoiceId, paymentId);
  }

  /**
   * Converts the given object to string.
   */
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
