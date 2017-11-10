package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoiceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about a billing invoice.
 */
@ApiModel(description = "Contains information about a billing invoice.")

public class BillingInvoice {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("dueDate")
  private String dueDate = null;

  @JsonProperty("invoiceId")
  private String invoiceId = null;

  @JsonProperty("invoiceItems")
  private java.util.List<BillingInvoiceItem> invoiceItems = new java.util.ArrayList<BillingInvoiceItem>();

  @JsonProperty("invoiceNumber")
  private String invoiceNumber = null;

  @JsonProperty("invoiceUri")
  private String invoiceUri = null;

  @JsonProperty("nonTaxableAmount")
  private String nonTaxableAmount = null;

  @JsonProperty("pdfAvailable")
  private String pdfAvailable = null;

  @JsonProperty("taxableAmount")
  private String taxableAmount = null;

  public BillingInvoice amount(String amount) {
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

  public BillingInvoice balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Reserved: TBD
   * @return balance
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public BillingInvoice dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Reserved: TBD
   * @return dueDate
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public BillingInvoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Reserved: TBD
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public BillingInvoice invoiceItems(java.util.List<BillingInvoiceItem> invoiceItems) {
    this.invoiceItems = invoiceItems;
    return this;
  }

  public BillingInvoice addInvoiceItemsItem(BillingInvoiceItem invoiceItemsItem) {
    this.invoiceItems.add(invoiceItemsItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return invoiceItems
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public java.util.List<BillingInvoiceItem> getInvoiceItems() {
    return invoiceItems;
  }

  public void setInvoiceItems(java.util.List<BillingInvoiceItem> invoiceItems) {
    this.invoiceItems = invoiceItems;
  }

  public BillingInvoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Reserved: TBD
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public BillingInvoice invoiceUri(String invoiceUri) {
    this.invoiceUri = invoiceUri;
    return this;
  }

   /**
   * Contains a URI for an endpoint that you can use to retrieve invoice information.
   * @return invoiceUri
  **/
  @ApiModelProperty(example = "null", value = "Contains a URI for an endpoint that you can use to retrieve invoice information.")
  public String getInvoiceUri() {
    return invoiceUri;
  }

  public void setInvoiceUri(String invoiceUri) {
    this.invoiceUri = invoiceUri;
  }

  public BillingInvoice nonTaxableAmount(String nonTaxableAmount) {
    this.nonTaxableAmount = nonTaxableAmount;
    return this;
  }

   /**
   * 
   * @return nonTaxableAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNonTaxableAmount() {
    return nonTaxableAmount;
  }

  public void setNonTaxableAmount(String nonTaxableAmount) {
    this.nonTaxableAmount = nonTaxableAmount;
  }

  public BillingInvoice pdfAvailable(String pdfAvailable) {
    this.pdfAvailable = pdfAvailable;
    return this;
  }

   /**
   * 
   * @return pdfAvailable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPdfAvailable() {
    return pdfAvailable;
  }

  public void setPdfAvailable(String pdfAvailable) {
    this.pdfAvailable = pdfAvailable;
  }

  public BillingInvoice taxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * 
   * @return taxableAmount
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.amount, billingInvoice.amount) &&
        Objects.equals(this.balance, billingInvoice.balance) &&
        Objects.equals(this.dueDate, billingInvoice.dueDate) &&
        Objects.equals(this.invoiceId, billingInvoice.invoiceId) &&
        Objects.equals(this.invoiceItems, billingInvoice.invoiceItems) &&
        Objects.equals(this.invoiceNumber, billingInvoice.invoiceNumber) &&
        Objects.equals(this.invoiceUri, billingInvoice.invoiceUri) &&
        Objects.equals(this.nonTaxableAmount, billingInvoice.nonTaxableAmount) &&
        Objects.equals(this.pdfAvailable, billingInvoice.pdfAvailable) &&
        Objects.equals(this.taxableAmount, billingInvoice.taxableAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, dueDate, invoiceId, invoiceItems, invoiceNumber, invoiceUri, nonTaxableAmount, pdfAvailable, taxableAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoice {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceItems: ").append(toIndentedString(invoiceItems)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceUri: ").append(toIndentedString(invoiceUri)).append("\n");
    sb.append("    nonTaxableAmount: ").append(toIndentedString(nonTaxableAmount)).append("\n");
    sb.append("    pdfAvailable: ").append(toIndentedString(pdfAvailable)).append("\n");
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

