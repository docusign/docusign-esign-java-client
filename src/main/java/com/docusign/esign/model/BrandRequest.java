package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BrandRequest. */
public class BrandRequest {
  @JsonProperty("brandId")
  private String brandId = null;

  /**
   * brandId.
   *
   * @return BrandRequest
   */
  public BrandRequest brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * The ID of the brand used in API calls.
   *
   * @return brandId
   */
  @ApiModelProperty(value = "The ID of the brand used in API calls")
  public String getBrandId() {
    return brandId;
  }

  /** setBrandId. */
  public void setBrandId(String brandId) {
    this.brandId = brandId;
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
    BrandRequest brandRequest = (BrandRequest) o;
    return Objects.equals(this.brandId, brandRequest.brandId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(brandId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandRequest {\n");

    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
