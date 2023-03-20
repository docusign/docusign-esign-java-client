package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BillingDiscount.
 *
 */

public class BillingDiscount {
  @JsonProperty("beginQuantity")
  private String beginQuantity = null;

  @JsonProperty("discount")
  private String discount = null;

  @JsonProperty("endQuantity")
  private String endQuantity = null;


  /**
   * beginQuantity.
   *
   * @return BillingDiscount
   **/
  public BillingDiscount beginQuantity(String beginQuantity) {
    this.beginQuantity = beginQuantity;
    return this;
  }

  /**
   * Reserved: TBD.
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
   * discount.
   *
   * @return BillingDiscount
   **/
  public BillingDiscount discount(String discount) {
    this.discount = discount;
    return this;
  }

  /**
   * .
   * @return discount
   **/
  @Schema(description = "")
  public String getDiscount() {
    return discount;
  }

  /**
   * setDiscount.
   **/
  public void setDiscount(String discount) {
    this.discount = discount;
  }


  /**
   * endQuantity.
   *
   * @return BillingDiscount
   **/
  public BillingDiscount endQuantity(String endQuantity) {
    this.endQuantity = endQuantity;
    return this;
  }

  /**
   * .
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
    BillingDiscount billingDiscount = (BillingDiscount) o;
    return Objects.equals(this.beginQuantity, billingDiscount.beginQuantity) &&
        Objects.equals(this.discount, billingDiscount.discount) &&
        Objects.equals(this.endQuantity, billingDiscount.endQuantity);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(beginQuantity, discount, endQuantity);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDiscount {\n");
    
    sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
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

