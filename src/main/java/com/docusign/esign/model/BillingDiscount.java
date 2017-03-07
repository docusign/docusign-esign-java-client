package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingDiscount   {
  
  private String beginQuantity = null;
  private String discount = null;
  private String endQuantity = null;

  
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
  @JsonProperty("discount")
  public String getDiscount() {
    return discount;
  }
  public void setDiscount(String discount) {
    this.discount = discount;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingDiscount billingDiscount = (BillingDiscount) o;

    return true && Objects.equals(beginQuantity, billingDiscount.beginQuantity) &&
        Objects.equals(discount, billingDiscount.discount) &&
        Objects.equals(endQuantity, billingDiscount.endQuantity)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginQuantity, discount, endQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDiscount {\n");
    
    if (beginQuantity != null)
      sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
    if (discount != null)
      sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    if (endQuantity != null)
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

