package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoiceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about a billing invoice.
 **/

@ApiModel(description = "Contains information about a billing invoice.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingInvoice   {
  
  private String amount = null;
  private String balance = null;
  private String dueDate = null;
  private String invoiceId = null;
  private java.util.List<BillingInvoiceItem> invoiceItems = new java.util.ArrayList<BillingInvoiceItem>();
  private String invoiceNumber = null;
  private String invoiceUri = null;
  private String nonTaxableAmount = null;
  private String pdfAvailable = null;
  private String taxableAmount = null;

  
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
  @JsonProperty("balance")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("dueDate")
  public String getDueDate() {
    return dueDate;
  }
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
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
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("invoiceItems")
  public java.util.List<BillingInvoiceItem> getInvoiceItems() {
    return invoiceItems;
  }
  public void setInvoiceItems(java.util.List<BillingInvoiceItem> invoiceItems) {
    this.invoiceItems = invoiceItems;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("invoiceNumber")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve invoice information.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve invoice information.")
  @JsonProperty("invoiceUri")
  public String getInvoiceUri() {
    return invoiceUri;
  }
  public void setInvoiceUri(String invoiceUri) {
    this.invoiceUri = invoiceUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nonTaxableAmount")
  public String getNonTaxableAmount() {
    return nonTaxableAmount;
  }
  public void setNonTaxableAmount(String nonTaxableAmount) {
    this.nonTaxableAmount = nonTaxableAmount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pdfAvailable")
  public String getPdfAvailable() {
    return pdfAvailable;
  }
  public void setPdfAvailable(String pdfAvailable) {
    this.pdfAvailable = pdfAvailable;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("taxableAmount")
  public String getTaxableAmount() {
    return taxableAmount;
  }
  public void setTaxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoice billingInvoice = (BillingInvoice) o;

    return true && Objects.equals(amount, billingInvoice.amount) &&
        Objects.equals(balance, billingInvoice.balance) &&
        Objects.equals(dueDate, billingInvoice.dueDate) &&
        Objects.equals(invoiceId, billingInvoice.invoiceId) &&
        Objects.equals(invoiceItems, billingInvoice.invoiceItems) &&
        Objects.equals(invoiceNumber, billingInvoice.invoiceNumber) &&
        Objects.equals(invoiceUri, billingInvoice.invoiceUri) &&
        Objects.equals(nonTaxableAmount, billingInvoice.nonTaxableAmount) &&
        Objects.equals(pdfAvailable, billingInvoice.pdfAvailable) &&
        Objects.equals(taxableAmount, billingInvoice.taxableAmount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, dueDate, invoiceId, invoiceItems, invoiceNumber, invoiceUri, nonTaxableAmount, pdfAvailable, taxableAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoice {\n");
    
    if (amount != null)
      sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (balance != null)
      sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    if (dueDate != null)
      sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    if (invoiceId != null)
      sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    if (invoiceItems != null)
      sb.append("    invoiceItems: ").append(toIndentedString(invoiceItems)).append("\n");
    if (invoiceNumber != null)
      sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    if (invoiceUri != null)
      sb.append("    invoiceUri: ").append(toIndentedString(invoiceUri)).append("\n");
    if (nonTaxableAmount != null)
      sb.append("    nonTaxableAmount: ").append(toIndentedString(nonTaxableAmount)).append("\n");
    if (pdfAvailable != null)
      sb.append("    pdfAvailable: ").append(toIndentedString(pdfAvailable)).append("\n");
    if (taxableAmount != null)
      sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
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

