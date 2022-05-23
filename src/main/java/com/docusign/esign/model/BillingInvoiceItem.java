package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Contains information about an item on a billing invoice.. */
@ApiModel(description = "Contains information about an item on a billing invoice.")
public class BillingInvoiceItem {
  @JsonProperty("chargeAmount")
  private String chargeAmount = null;

  @JsonProperty("chargeName")
  private String chargeName = null;

  @JsonProperty("invoiceItemId")
  private String invoiceItemId = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("taxAmount")
  private String taxAmount = null;

  @JsonProperty("taxExemptAmount")
  private String taxExemptAmount = null;

  @JsonProperty("unitPrice")
  private String unitPrice = null;

  /**
   * chargeAmount.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem chargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return chargeAmount
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getChargeAmount() {
    return chargeAmount;
  }

  /** setChargeAmount. */
  public void setChargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  /**
   * chargeName.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return chargeName
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getChargeName() {
    return chargeName;
  }

  /** setChargeName. */
  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  /**
   * invoiceItemId.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem invoiceItemId(String invoiceItemId) {
    this.invoiceItemId = invoiceItemId;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return invoiceItemId
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getInvoiceItemId() {
    return invoiceItemId;
  }

  /** setInvoiceItemId. */
  public void setInvoiceItemId(String invoiceItemId) {
    this.invoiceItemId = invoiceItemId;
  }

  /**
   * quantity.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * .
   *
   * @return quantity
   */
  @ApiModelProperty(value = "")
  public String getQuantity() {
    return quantity;
  }

  /** setQuantity. */
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  /**
   * taxAmount.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * .
   *
   * @return taxAmount
   */
  @ApiModelProperty(value = "")
  public String getTaxAmount() {
    return taxAmount;
  }

  /** setTaxAmount. */
  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  /**
   * taxExemptAmount.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem taxExemptAmount(String taxExemptAmount) {
    this.taxExemptAmount = taxExemptAmount;
    return this;
  }

  /**
   * .
   *
   * @return taxExemptAmount
   */
  @ApiModelProperty(value = "")
  public String getTaxExemptAmount() {
    return taxExemptAmount;
  }

  /** setTaxExemptAmount. */
  public void setTaxExemptAmount(String taxExemptAmount) {
    this.taxExemptAmount = taxExemptAmount;
  }

  /**
   * unitPrice.
   *
   * @return BillingInvoiceItem
   */
  public BillingInvoiceItem unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return unitPrice
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getUnitPrice() {
    return unitPrice;
  }

  /** setUnitPrice. */
  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
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
    BillingInvoiceItem billingInvoiceItem = (BillingInvoiceItem) o;
    return Objects.equals(this.chargeAmount, billingInvoiceItem.chargeAmount)
        && Objects.equals(this.chargeName, billingInvoiceItem.chargeName)
        && Objects.equals(this.invoiceItemId, billingInvoiceItem.invoiceItemId)
        && Objects.equals(this.quantity, billingInvoiceItem.quantity)
        && Objects.equals(this.taxAmount, billingInvoiceItem.taxAmount)
        && Objects.equals(this.taxExemptAmount, billingInvoiceItem.taxExemptAmount)
        && Objects.equals(this.unitPrice, billingInvoiceItem.unitPrice);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        chargeAmount, chargeName, invoiceItemId, quantity, taxAmount, taxExemptAmount, unitPrice);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoiceItem {\n");

    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    invoiceItemId: ").append(toIndentedString(invoiceItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxExemptAmount: ").append(toIndentedString(taxExemptAmount)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
