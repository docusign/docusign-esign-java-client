package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BrandRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandsRequest.
 *
 */

public class BrandsRequest {
  @JsonProperty("brands")
  private java.util.List<BrandRequest> brands = null;


  /**
   * brands.
   *
   * @return BrandsRequest
   **/
  public BrandsRequest brands(java.util.List<BrandRequest> brands) {
    this.brands = brands;
    return this;
  }
  
  /**
   * addBrandsItem.
   *
   * @return BrandsRequest
   **/
  public BrandsRequest addBrandsItem(BrandRequest brandsItem) {
    if (this.brands == null) {
      this.brands = new java.util.ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

  /**
   * The list of brands..
   * @return brands
   **/
  @ApiModelProperty(value = "The list of brands.")
  public java.util.List<BrandRequest> getBrands() {
    return brands;
  }

  /**
   * setBrands.
   **/
  public void setBrands(java.util.List<BrandRequest> brands) {
    this.brands = brands;
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
    BrandsRequest brandsRequest = (BrandsRequest) o;
    return Objects.equals(this.brands, brandsRequest.brands);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(brands);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsRequest {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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

