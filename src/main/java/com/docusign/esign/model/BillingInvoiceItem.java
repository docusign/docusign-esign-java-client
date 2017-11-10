package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about an item on a billing invoice.
 */
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

  @JsonProperty("unitPrice")
  private String unitPrice = null;

  public BillingInvoiceItem chargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Reserved: TBD
   * @return chargeAmount
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public BillingInvoiceItem chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

   /**
   * Reserved: TBD
   * @return chargeName
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getChargeName() {
    return chargeName;
  }

  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  public BillingInvoiceItem invoiceItemId(String invoiceItemId) {
    this.invoiceItemId = invoiceItemId;
    return this;
  }

   /**
   * Reserved: TBD
   * @return invoiceItemId
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getInvoiceItemId() {
    return invoiceItemId;
  }

  public void setInvoiceItemId(String invoiceItemId) {
    this.invoiceItemId = invoiceItemId;
  }

  public BillingInvoiceItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * 
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public BillingInvoiceItem unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Reserved: TBD
   * @return unitPrice
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoiceItem billingInvoiceItem = (BillingInvoiceItem) o;
    return Objects.equals(this.chargeAmount, billingInvoiceItem.chargeAmount) &&
        Objects.equals(this.chargeName, billingInvoiceItem.chargeName) &&
        Objects.equals(this.invoiceItemId, billingInvoiceItem.invoiceItemId) &&
        Objects.equals(this.quantity, billingInvoiceItem.quantity) &&
        Objects.equals(this.unitPrice, billingInvoiceItem.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeAmount, chargeName, invoiceItemId, quantity, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoiceItem {\n");
    
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    invoiceItemId: ").append(toIndentedString(invoiceItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

