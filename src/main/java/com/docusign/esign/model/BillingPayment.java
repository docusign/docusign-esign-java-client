package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information on a billing plan.
 **/

@ApiModel(description = "Contains information on a billing plan.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPayment   {
  
  private String amount = null;
  private String invoiceId = null;
  private String paymentId = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("invoiceId")
  public String getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentId")
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

    return true && Objects.equals(amount, billingPayment.amount) &&
        Objects.equals(invoiceId, billingPayment.invoiceId) &&
        Objects.equals(paymentId, billingPayment.paymentId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, invoiceId, paymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPayment {\n");
    
    if (amount != null)
      sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (invoiceId != null)
      sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    if (paymentId != null)
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

