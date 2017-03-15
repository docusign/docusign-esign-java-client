package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about an item on a billing invoice.
 **/

@ApiModel(description = "Contains information about an item on a billing invoice.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingInvoiceItem   {
  
  private String chargeAmount = null;
  private String chargeName = null;
  private String invoiceItemId = null;
  private String quantity = null;
  private String unitPrice = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("chargeAmount")
  public String getChargeAmount() {
    return chargeAmount;
  }
  public void setChargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("chargeName")
  public String getChargeName() {
    return chargeName;
  }
  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("invoiceItemId")
  public String getInvoiceItemId() {
    return invoiceItemId;
  }
  public void setInvoiceItemId(String invoiceItemId) {
    this.invoiceItemId = invoiceItemId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public String getQuantity() {
    return quantity;
  }
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("unitPrice")
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

    return true && Objects.equals(chargeAmount, billingInvoiceItem.chargeAmount) &&
        Objects.equals(chargeName, billingInvoiceItem.chargeName) &&
        Objects.equals(invoiceItemId, billingInvoiceItem.invoiceItemId) &&
        Objects.equals(quantity, billingInvoiceItem.quantity) &&
        Objects.equals(unitPrice, billingInvoiceItem.unitPrice)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeAmount, chargeName, invoiceItemId, quantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoiceItem {\n");
    
    if (chargeAmount != null)
      sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    if (chargeName != null)
      sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    if (invoiceItemId != null)
      sb.append("    invoiceItemId: ").append(toIndentedString(invoiceItemId)).append("\n");
    if (quantity != null)
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    if (unitPrice != null)
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

