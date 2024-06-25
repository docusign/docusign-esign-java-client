package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A line item describes details about an individual line item in a payment request.  .
 *
 */
@Schema(description = "A line item describes details about an individual line item in a payment request.  ")

public class PaymentLineItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amountReference")
  private String amountReference = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("itemCode")
  private String itemCode = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * amountReference.
   *
   * @return PaymentLineItem
   **/
  public PaymentLineItem amountReference(String amountReference) {
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
   * @return PaymentLineItem
   **/
  public PaymentLineItem description(String description) {
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
   * itemCode.
   *
   * @return PaymentLineItem
   **/
  public PaymentLineItem itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

  /**
   * .
   * @return itemCode
   **/
  @Schema(description = "")
  public String getItemCode() {
    return itemCode;
  }

  /**
   * setItemCode.
   **/
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }


  /**
   * name.
   *
   * @return PaymentLineItem
   **/
  public PaymentLineItem name(String name) {
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
    PaymentLineItem paymentLineItem = (PaymentLineItem) o;
    return Objects.equals(this.amountReference, paymentLineItem.amountReference) &&
        Objects.equals(this.description, paymentLineItem.description) &&
        Objects.equals(this.itemCode, paymentLineItem.itemCode) &&
        Objects.equals(this.name, paymentLineItem.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(amountReference, description, itemCode, name);
  }


  /**
   * Converts the given object to string.
   */
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

