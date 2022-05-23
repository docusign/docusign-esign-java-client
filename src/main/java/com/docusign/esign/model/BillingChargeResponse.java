package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Defines a billing charge response object.. */
@ApiModel(description = "Defines a billing charge response object.")
public class BillingChargeResponse {
  @JsonProperty("billingChargeItems")
  private java.util.List<BillingCharge> billingChargeItems = null;

  /**
   * billingChargeItems.
   *
   * @return BillingChargeResponse
   */
  public BillingChargeResponse billingChargeItems(
      java.util.List<BillingCharge> billingChargeItems) {
    this.billingChargeItems = billingChargeItems;
    return this;
  }

  /**
   * addBillingChargeItemsItem.
   *
   * @return BillingChargeResponse
   */
  public BillingChargeResponse addBillingChargeItemsItem(BillingCharge billingChargeItemsItem) {
    if (this.billingChargeItems == null) {
      this.billingChargeItems = new java.util.ArrayList<>();
    }
    this.billingChargeItems.add(billingChargeItemsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return billingChargeItems
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<BillingCharge> getBillingChargeItems() {
    return billingChargeItems;
  }

  /** setBillingChargeItems. */
  public void setBillingChargeItems(java.util.List<BillingCharge> billingChargeItems) {
    this.billingChargeItems = billingChargeItems;
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
    BillingChargeResponse billingChargeResponse = (BillingChargeResponse) o;
    return Objects.equals(this.billingChargeItems, billingChargeResponse.billingChargeItems);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(billingChargeItems);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingChargeResponse {\n");

    sb.append("    billingChargeItems: ").append(toIndentedString(billingChargeItems)).append("\n");
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
