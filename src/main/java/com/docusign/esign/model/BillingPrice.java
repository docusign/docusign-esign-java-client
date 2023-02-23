package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BillingPrice.
 *
 */

public class BillingPrice {
  @JsonProperty("beginQuantity")
  private String beginQuantity = null;

  @JsonProperty("endQuantity")
  private String endQuantity = null;

  @JsonProperty("unitPrice")
  private String unitPrice = null;

  /**
   * beginQuantity.
   *
   * @return BillingPrice
   **/
  public BillingPrice beginQuantity(String beginQuantity) {
    this.beginQuantity = beginQuantity;
    return this;
  }

  /**
   * Reserved: TBD.
   * 
   * @return beginQuantity
   **/
  @Schema(description = "Reserved: TBD")
  public String getBeginQuantity() {
    return beginQuantity;
  }

  /**
   * setBeginQuantity.
   **/
  public void setBeginQuantity(String beginQuantity) {
    this.beginQuantity = beginQuantity;
  }

  /**
   * endQuantity.
   *
   * @return BillingPrice
   **/
  public BillingPrice endQuantity(String endQuantity) {
    this.endQuantity = endQuantity;
    return this;
  }

  /**
   * .
   * 
   * @return endQuantity
   **/
  @Schema(description = "")
  public String getEndQuantity() {
    return endQuantity;
  }

  /**
   * setEndQuantity.
   **/
  public void setEndQuantity(String endQuantity) {
    this.endQuantity = endQuantity;
  }

  /**
   * unitPrice.
   *
   * @return BillingPrice
   **/
  public BillingPrice unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Reserved: TBD.
   * 
   * @return unitPrice
   **/
  @Schema(description = "Reserved: TBD")
  public String getUnitPrice() {
    return unitPrice;
  }

  /**
   * setUnitPrice.
   **/
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
    BillingPrice billingPrice = (BillingPrice) o;
    return Objects.equals(this.beginQuantity, billingPrice.beginQuantity) &&
        Objects.equals(this.endQuantity, billingPrice.endQuantity) &&
        Objects.equals(this.unitPrice, billingPrice.unitPrice);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(beginQuantity, endQuantity, unitPrice);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPrice {\n");

    sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
    sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
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
