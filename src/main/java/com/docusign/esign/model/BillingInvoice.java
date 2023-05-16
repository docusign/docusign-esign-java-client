package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingInvoiceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about a billing invoice..
 *
 */
@Schema(description = "Contains information about a billing invoice.")

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
  private java.util.List<BillingInvoiceItem> invoiceItems = null;

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


  /**
   * amount.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Reserved: TBD.
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
   * balance.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return balance
   **/
  @Schema(description = "Reserved: TBD")
  public String getBalance() {
    return balance;
  }

  /**
   * setBalance.
   **/
  public void setBalance(String balance) {
    this.balance = balance;
  }


  /**
   * dueDate.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return dueDate
   **/
  @Schema(description = "Reserved: TBD")
  public String getDueDate() {
    return dueDate;
  }

  /**
   * setDueDate.
   **/
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  /**
   * invoiceId.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Reserved: TBD.
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
   * invoiceItems.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice invoiceItems(java.util.List<BillingInvoiceItem> invoiceItems) {
    this.invoiceItems = invoiceItems;
    return this;
  }
  
  /**
   * addInvoiceItemsItem.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice addInvoiceItemsItem(BillingInvoiceItem invoiceItemsItem) {
    if (this.invoiceItems == null) {
      this.invoiceItems = new java.util.ArrayList<>();
    }
    this.invoiceItems.add(invoiceItemsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return invoiceItems
   **/
  @Schema(description = "Reserved: TBD")
  public java.util.List<BillingInvoiceItem> getInvoiceItems() {
    return invoiceItems;
  }

  /**
   * setInvoiceItems.
   **/
  public void setInvoiceItems(java.util.List<BillingInvoiceItem> invoiceItems) {
    this.invoiceItems = invoiceItems;
  }


  /**
   * invoiceNumber.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Reserved: TBD.
   * @return invoiceNumber
   **/
  @Schema(description = "Reserved: TBD")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  /**
   * setInvoiceNumber.
   **/
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  /**
   * invoiceUri.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice invoiceUri(String invoiceUri) {
    this.invoiceUri = invoiceUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve invoice information..
   * @return invoiceUri
   **/
  @Schema(description = "Contains a URI for an endpoint that you can use to retrieve invoice information.")
  public String getInvoiceUri() {
    return invoiceUri;
  }

  /**
   * setInvoiceUri.
   **/
  public void setInvoiceUri(String invoiceUri) {
    this.invoiceUri = invoiceUri;
  }


  /**
   * nonTaxableAmount.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice nonTaxableAmount(String nonTaxableAmount) {
    this.nonTaxableAmount = nonTaxableAmount;
    return this;
  }

  /**
   * .
   * @return nonTaxableAmount
   **/
  @Schema(description = "")
  public String getNonTaxableAmount() {
    return nonTaxableAmount;
  }

  /**
   * setNonTaxableAmount.
   **/
  public void setNonTaxableAmount(String nonTaxableAmount) {
    this.nonTaxableAmount = nonTaxableAmount;
  }


  /**
   * pdfAvailable.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice pdfAvailable(String pdfAvailable) {
    this.pdfAvailable = pdfAvailable;
    return this;
  }

  /**
   * .
   * @return pdfAvailable
   **/
  @Schema(description = "")
  public String getPdfAvailable() {
    return pdfAvailable;
  }

  /**
   * setPdfAvailable.
   **/
  public void setPdfAvailable(String pdfAvailable) {
    this.pdfAvailable = pdfAvailable;
  }


  /**
   * taxableAmount.
   *
   * @return BillingInvoice
   **/
  public BillingInvoice taxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * .
   * @return taxableAmount
   **/
  @Schema(description = "")
  public String getTaxableAmount() {
    return taxableAmount;
  }

  /**
   * setTaxableAmount.
   **/
  public void setTaxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, dueDate, invoiceId, invoiceItems, invoiceNumber, invoiceUri, nonTaxableAmount, pdfAvailable, taxableAmount);
  }


  /**
   * Converts the given object to string.
   */
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

