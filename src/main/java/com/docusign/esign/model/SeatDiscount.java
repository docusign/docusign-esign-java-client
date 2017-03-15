package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SeatDiscount   {
  
  private String beginSeatCount = null;
  private String discountPercent = null;
  private String endSeatCount = null;

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("beginSeatCount")
  public String getBeginSeatCount() {
    return beginSeatCount;
  }
  public void setBeginSeatCount(String beginSeatCount) {
    this.beginSeatCount = beginSeatCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("discountPercent")
  public String getDiscountPercent() {
    return discountPercent;
  }
  public void setDiscountPercent(String discountPercent) {
    this.discountPercent = discountPercent;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("endSeatCount")
  public String getEndSeatCount() {
    return endSeatCount;
  }
  public void setEndSeatCount(String endSeatCount) {
    this.endSeatCount = endSeatCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatDiscount seatDiscount = (SeatDiscount) o;

    return true && Objects.equals(beginSeatCount, seatDiscount.beginSeatCount) &&
        Objects.equals(discountPercent, seatDiscount.discountPercent) &&
        Objects.equals(endSeatCount, seatDiscount.endSeatCount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginSeatCount, discountPercent, endSeatCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatDiscount {\n");
    
    if (beginSeatCount != null)
      sb.append("    beginSeatCount: ").append(toIndentedString(beginSeatCount)).append("\n");
    if (discountPercent != null)
      sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    if (endSeatCount != null)
      sb.append("    endSeatCount: ").append(toIndentedString(endSeatCount)).append("\n");
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

