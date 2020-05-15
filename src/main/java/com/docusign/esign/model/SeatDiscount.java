package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SeatDiscount
 */

public class SeatDiscount {
  @JsonProperty("beginSeatCount")
  private String beginSeatCount = null;

  @JsonProperty("discountPercent")
  private String discountPercent = null;

  @JsonProperty("endSeatCount")
  private String endSeatCount = null;

  public SeatDiscount beginSeatCount(String beginSeatCount) {
    this.beginSeatCount = beginSeatCount;
    return this;
  }

   /**
   * Reserved: TBD
   * @return beginSeatCount
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public String getBeginSeatCount() {
    return beginSeatCount;
  }

  public void setBeginSeatCount(String beginSeatCount) {
    this.beginSeatCount = beginSeatCount;
  }

  public SeatDiscount discountPercent(String discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * 
   * @return discountPercent
  **/
  @ApiModelProperty(value = "")
  public String getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(String discountPercent) {
    this.discountPercent = discountPercent;
  }

  public SeatDiscount endSeatCount(String endSeatCount) {
    this.endSeatCount = endSeatCount;
    return this;
  }

   /**
   * Reserved: TBD
   * @return endSeatCount
  **/
  @ApiModelProperty(value = "Reserved: TBD")
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
    return Objects.equals(this.beginSeatCount, seatDiscount.beginSeatCount) &&
        Objects.equals(this.discountPercent, seatDiscount.discountPercent) &&
        Objects.equals(this.endSeatCount, seatDiscount.endSeatCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginSeatCount, discountPercent, endSeatCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatDiscount {\n");
    
    sb.append("    beginSeatCount: ").append(toIndentedString(beginSeatCount)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
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

