package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandRequest
 */

public class BrandRequest {
  @JsonProperty("brandId")
  private String brandId = null;

  public BrandRequest brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * The ID of the brand used in API calls
   * @return brandId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the brand used in API calls")
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandRequest brandRequest = (BrandRequest) o;
    return Objects.equals(this.brandId, brandRequest.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandRequest {\n");
    
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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

