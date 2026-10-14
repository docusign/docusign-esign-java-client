package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ExtendPaymentLineItem.
 *
 */

public class ExtendPaymentLineItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amountReference")
  private String amountReference = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priceId")
  private String priceId = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("unitAmount")
  private String unitAmount = null;


  /**
   * amountReference.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem amountReference(String amountReference) {
    this.amountReference = amountReference;
    return this;
  }

  /**
   * .
   * @return amountReference
   **/
  @Schema(description = "")
  public String getAmountReference() {
    return amountReference;
  }

  /**
   * setAmountReference.
   **/
  public void setAmountReference(String amountReference) {
    this.amountReference = amountReference;
  }


  /**
   * description.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * .
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * name.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * priceId.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem priceId(String priceId) {
    this.priceId = priceId;
    return this;
  }

  /**
   * .
   * @return priceId
   **/
  @Schema(description = "")
  public String getPriceId() {
    return priceId;
  }

  /**
   * setPriceId.
   **/
  public void setPriceId(String priceId) {
    this.priceId = priceId;
  }


  /**
   * productId.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * .
   * @return productId
   **/
  @Schema(description = "")
  public String getProductId() {
    return productId;
  }

  /**
   * setProductId.
   **/
  public void setProductId(String productId) {
    this.productId = productId;
  }


  /**
   * quantity.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * .
   * @return quantity
   **/
  @Schema(description = "")
  public String getQuantity() {
    return quantity;
  }

  /**
   * setQuantity.
   **/
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  /**
   * type.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * .
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }


  /**
   * unitAmount.
   *
   * @return ExtendPaymentLineItem
   **/
  public ExtendPaymentLineItem unitAmount(String unitAmount) {
    this.unitAmount = unitAmount;
    return this;
  }

  /**
   * .
   * @return unitAmount
   **/
  @Schema(description = "")
  public String getUnitAmount() {
    return unitAmount;
  }

  /**
   * setUnitAmount.
   **/
  public void setUnitAmount(String unitAmount) {
    this.unitAmount = unitAmount;
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
    ExtendPaymentLineItem extendPaymentLineItem = (ExtendPaymentLineItem) o;
    return Objects.equals(this.amountReference, extendPaymentLineItem.amountReference) &&
        Objects.equals(this.description, extendPaymentLineItem.description) &&
        Objects.equals(this.name, extendPaymentLineItem.name) &&
        Objects.equals(this.priceId, extendPaymentLineItem.priceId) &&
        Objects.equals(this.productId, extendPaymentLineItem.productId) &&
        Objects.equals(this.quantity, extendPaymentLineItem.quantity) &&
        Objects.equals(this.type, extendPaymentLineItem.type) &&
        Objects.equals(this.unitAmount, extendPaymentLineItem.unitAmount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(amountReference, description, name, priceId, productId, quantity, type, unitAmount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendPaymentLineItem {\n");
    
    sb.append("    amountReference: ").append(toIndentedString(amountReference)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
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

