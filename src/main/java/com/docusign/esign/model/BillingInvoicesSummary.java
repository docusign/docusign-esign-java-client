package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingInvoicesSummary   {
  
  private java.util.List<BillingInvoice> billingInvoices = new java.util.ArrayList<BillingInvoice>();
  private String pastDueBalance = null;
  private String paymentAllowed = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("billingInvoices")
  public java.util.List<BillingInvoice> getBillingInvoices() {
    return billingInvoices;
  }
  public void setBillingInvoices(java.util.List<BillingInvoice> billingInvoices) {
    this.billingInvoices = billingInvoices;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pastDueBalance")
  public String getPastDueBalance() {
    return pastDueBalance;
  }
  public void setPastDueBalance(String pastDueBalance) {
    this.pastDueBalance = pastDueBalance;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentAllowed")
  public String getPaymentAllowed() {
    return paymentAllowed;
  }
  public void setPaymentAllowed(String paymentAllowed) {
    this.paymentAllowed = paymentAllowed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoicesSummary billingInvoicesSummary = (BillingInvoicesSummary) o;

    return true && Objects.equals(billingInvoices, billingInvoicesSummary.billingInvoices) &&
        Objects.equals(pastDueBalance, billingInvoicesSummary.pastDueBalance) &&
        Objects.equals(paymentAllowed, billingInvoicesSummary.paymentAllowed)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingInvoices, pastDueBalance, paymentAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoicesSummary {\n");
    
    if (billingInvoices != null)
      sb.append("    billingInvoices: ").append(toIndentedString(billingInvoices)).append("\n");
    if (pastDueBalance != null)
      sb.append("    pastDueBalance: ").append(toIndentedString(pastDueBalance)).append("\n");
    if (paymentAllowed != null)
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

