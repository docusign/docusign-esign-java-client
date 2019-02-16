package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentLineItem
 */

public class PaymentLineItem {
  @JsonProperty("amountReference")
  private String amountReference = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("itemCode")
  private String itemCode = null;

  @JsonProperty("name")
  private String name = null;

  public PaymentLineItem amountReference(String amountReference) {
    this.amountReference = amountReference;
    return this;
  }

   /**
   * 
   * @return amountReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAmountReference() {
    return amountReference;
  }

  public void setAmountReference(String amountReference) {
    this.amountReference = amountReference;
  }

  public PaymentLineItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentLineItem itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * 
   * @return itemCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public PaymentLineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLineItem paymentLineItem = (PaymentLineItem) o;
    return Objects.equals(this.amountReference, paymentLineItem.amountReference) &&
        Objects.equals(this.description, paymentLineItem.description) &&
        Objects.equals(this.itemCode, paymentLineItem.itemCode) &&
        Objects.equals(this.name, paymentLineItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountReference, description, itemCode, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLineItem {\n");
    
    sb.append("    amountReference: ").append(toIndentedString(amountReference)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

