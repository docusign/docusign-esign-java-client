package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines a billing payment request object.
 */
@ApiModel(description = "Defines a billing payment request object.")

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

  public BillingPaymentItem amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Reserved: TBD
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BillingPaymentItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BillingPaymentItem paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * 
   * @return paymentDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public BillingPaymentItem paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * 
   * @return paymentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public BillingPaymentItem paymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
    return this;
  }

   /**
   * When set to **true**, a PDF version of the invoice is available.   To get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".
   * @return paymentNumber
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, a PDF version of the invoice is available.   To get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".")
  public String getPaymentNumber() {
    return paymentNumber;
  }

  public void setPaymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, paymentDate, paymentId, paymentNumber);
  }


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

