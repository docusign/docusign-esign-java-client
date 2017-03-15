package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BrandRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandsRequest   {
  
  private java.util.List<BrandRequest> brands = new java.util.ArrayList<BrandRequest>();

  
  /**
   * The list of brands.
   **/
  
  @ApiModelProperty(value = "The list of brands.")
  @JsonProperty("brands")
  public java.util.List<BrandRequest> getBrands() {
    return brands;
  }
  public void setBrands(java.util.List<BrandRequest> brands) {
    this.brands = brands;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsRequest brandsRequest = (BrandsRequest) o;

    return true && Objects.equals(brands, brandsRequest.brands)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsRequest {\n");
    
    if (brands != null)
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

