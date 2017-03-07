package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about a preview billing plan.
 **/

@ApiModel(description = "Contains information about a preview billing plan.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPlanPreview   {
  
  private String currencyCode = null;
  private BillingInvoice invoice = null;
  private String isProrated = null;
  private String subtotalAmount = null;
  private String taxAmount = null;
  private String totalAmount = null;

  
  /**
   * Specifies the ISO currency code for the account.
   **/
  
  @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invoice")
  public BillingInvoice getInvoice() {
    return invoice;
  }
  public void setInvoice(BillingInvoice invoice) {
    this.invoice = invoice;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isProrated")
  public String getIsProrated() {
    return isProrated;
  }
  public void setIsProrated(String isProrated) {
    this.isProrated = isProrated;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subtotalAmount")
  public String getSubtotalAmount() {
    return subtotalAmount;
  }
  public void setSubtotalAmount(String subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("taxAmount")
  public String getTaxAmount() {
    return taxAmount;
  }
  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalAmount")
  public String getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanPreview billingPlanPreview = (BillingPlanPreview) o;

    return true && Objects.equals(currencyCode, billingPlanPreview.currencyCode) &&
        Objects.equals(invoice, billingPlanPreview.invoice) &&
        Objects.equals(isProrated, billingPlanPreview.isProrated) &&
        Objects.equals(subtotalAmount, billingPlanPreview.subtotalAmount) &&
        Objects.equals(taxAmount, billingPlanPreview.taxAmount) &&
        Objects.equals(totalAmount, billingPlanPreview.totalAmount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, invoice, isProrated, subtotalAmount, taxAmount, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanPreview {\n");
    
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (invoice != null)
      sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    if (isProrated != null)
      sb.append("    isProrated: ").append(toIndentedString(isProrated)).append("\n");
    if (subtotalAmount != null)
      sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    if (taxAmount != null)
      sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    if (totalAmount != null)
      sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

