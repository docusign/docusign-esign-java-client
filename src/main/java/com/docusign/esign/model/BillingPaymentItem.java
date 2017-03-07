package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines a billing payment request object.
 **/

@ApiModel(description = "Defines a billing payment request object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPaymentItem   {
  
  private String amount = null;
  private String description = null;
  private String paymentDate = null;
  private String paymentId = null;
  private String paymentNumber = null;

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentDate")
  public String getPaymentDate() {
    return paymentDate;
  }
  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
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

  
  /**
   * When set to **true**, a PDF version of the invoice is available. \n\nTo get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".
   **/
  
  @ApiModelProperty(value = "When set to **true**, a PDF version of the invoice is available. \n\nTo get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".")
  @JsonProperty("paymentNumber")
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

    return true && Objects.equals(amount, billingPaymentItem.amount) &&
        Objects.equals(description, billingPaymentItem.description) &&
        Objects.equals(paymentDate, billingPaymentItem.paymentDate) &&
        Objects.equals(paymentId, billingPaymentItem.paymentId) &&
        Objects.equals(paymentNumber, billingPaymentItem.paymentNumber)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, paymentDate, paymentId, paymentNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentItem {\n");
    
    if (amount != null)
      sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (description != null)
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
    if (paymentDate != null)
      sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    if (paymentId != null)
      sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    if (paymentNumber != null)
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

