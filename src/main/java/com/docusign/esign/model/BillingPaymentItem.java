package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Defines a billing payment request object..
 *
 */
@Schema(description = "Defines a billing payment request object.")

public class BillingPaymentItem {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("paymentDate")
  private String paymentDate = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("paymentNumber")
  private String paymentNumber = null;

  /**
   * amount.
   *
   * @return BillingPaymentItem
   **/
  public BillingPaymentItem amount(String amount) {
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
   * description.
   *
   * @return BillingPaymentItem
   **/
  public BillingPaymentItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * .
   * 
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * paymentDate.
   *
   * @return BillingPaymentItem
   **/
  public BillingPaymentItem paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * .
   * 
   * @return paymentDate
   **/
  @Schema(description = "")
  public String getPaymentDate() {
    return paymentDate;
  }

  /**
   * setPaymentDate.
   **/
  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  /**
   * paymentId.
   *
   * @return BillingPaymentItem
   **/
  public BillingPaymentItem paymentId(String paymentId) {
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
   * paymentNumber.
   *
   * @return BillingPaymentItem
   **/
  public BillingPaymentItem paymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
    return this;
  }

  /**
   * When set to **true**, a PDF version of the invoice is available. To get the
   * PDF, make the call again and change \"Accept:\" in the header to \"Accept:
   * application/pdf\"..
   * 
   * @return paymentNumber
   **/
  @Schema(description = "When set to **true**, a PDF version of the invoice is available.   To get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".")
  public String getPaymentNumber() {
    return paymentNumber;
  }

  /**
   * setPaymentNumber.
   **/
  public void setPaymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
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
    BillingPaymentItem billingPaymentItem = (BillingPaymentItem) o;
    return Objects.equals(this.amount, billingPaymentItem.amount) &&
        Objects.equals(this.description, billingPaymentItem.description) &&
        Objects.equals(this.paymentDate, billingPaymentItem.paymentDate) &&
        Objects.equals(this.paymentId, billingPaymentItem.paymentId) &&
        Objects.equals(this.paymentNumber, billingPaymentItem.paymentNumber);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(amount, description, paymentDate, paymentId, paymentNumber);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentItem {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentNumber: ").append(toIndentedString(paymentNumber)).append("\n");
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
