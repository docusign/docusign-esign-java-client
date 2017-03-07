package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PaymentLineItem   {
  
  private String amountReference = null;
  private String description = null;
  private String itemCode = null;
  private String name = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amountReference")
  public String getAmountReference() {
    return amountReference;
  }
  public void setAmountReference(String amountReference) {
    this.amountReference = amountReference;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemCode")
  public String getItemCode() {
    return itemCode;
  }
  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
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

    return true && Objects.equals(amountReference, paymentLineItem.amountReference) &&
        Objects.equals(description, paymentLineItem.description) &&
        Objects.equals(itemCode, paymentLineItem.itemCode) &&
        Objects.equals(name, paymentLineItem.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountReference, description, itemCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLineItem {\n");
    
    if (amountReference != null)
      sb.append("    amountReference: ").append(toIndentedString(amountReference)).append("\n");
    if (description != null)
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
    if (itemCode != null)
      sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    if (name != null)
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

