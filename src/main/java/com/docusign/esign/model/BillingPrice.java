package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPrice   {
  
  private String beginQuantity = null;
  private String endQuantity = null;
  private String unitPrice = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("beginQuantity")
  public String getBeginQuantity() {
    return beginQuantity;
  }
  public void setBeginQuantity(String beginQuantity) {
    this.beginQuantity = beginQuantity;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endQuantity")
  public String getEndQuantity() {
    return endQuantity;
  }
  public void setEndQuantity(String endQuantity) {
    this.endQuantity = endQuantity;
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
    BillingPrice billingPrice = (BillingPrice) o;

    return true && Objects.equals(beginQuantity, billingPrice.beginQuantity) &&
        Objects.equals(endQuantity, billingPrice.endQuantity) &&
        Objects.equals(unitPrice, billingPrice.unitPrice)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginQuantity, endQuantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPrice {\n");
    
    if (beginQuantity != null)
      sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
    if (endQuantity != null)
      sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
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

