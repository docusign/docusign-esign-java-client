package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BillingPrice
 */

public class BillingPrice {
  @JsonProperty("beginQuantity")
  private String beginQuantity = null;

  @JsonProperty("endQuantity")
  private String endQuantity = null;

  @JsonProperty("unitPrice")
  private String unitPrice = null;

  public BillingPrice beginQuantity(String beginQuantity) {
    this.beginQuantity = beginQuantity;
    return this;
  }

   /**
   * Reserved: TBD
   * @return beginQuantity
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getBeginQuantity() {
    return beginQuantity;
  }

  public void setBeginQuantity(String beginQuantity) {
    this.beginQuantity = beginQuantity;
  }

  public BillingPrice endQuantity(String endQuantity) {
    this.endQuantity = endQuantity;
    return this;
  }

   /**
   * 
   * @return endQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndQuantity() {
    return endQuantity;
  }

  public void setEndQuantity(String endQuantity) {
    this.endQuantity = endQuantity;
  }

  public BillingPrice unitPrice(String unitPrice) {
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
    BillingPrice billingPrice = (BillingPrice) o;
    return Objects.equals(this.beginQuantity, billingPrice.beginQuantity) &&
        Objects.equals(this.endQuantity, billingPrice.endQuantity) &&
        Objects.equals(this.unitPrice, billingPrice.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginQuantity, endQuantity, unitPrice);
  }


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

