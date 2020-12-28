package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Brand;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandsResponse
 */

public class BrandsResponse {
  @JsonProperty("recipientBrandIdDefault")
  private String recipientBrandIdDefault = null;

  @JsonProperty("senderBrandIdDefault")
  private String senderBrandIdDefault = null;

  @JsonProperty("brandOptions")
  private java.util.List<Brand> brandOptions = null;

  public BrandsResponse recipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
    return this;
  }

   /**
   * The brand seen by envelope recipients when a brand is not explicitly set.
   * @return recipientBrandIdDefault
  **/
  @ApiModelProperty(value = "The brand seen by envelope recipients when a brand is not explicitly set.")
  public String getRecipientBrandIdDefault() {
    return recipientBrandIdDefault;
  }

  public void setRecipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
  }

  public BrandsResponse senderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
    return this;
  }

   /**
   * The brand seen by envelope senders when a brand is not explicitly set.
   * @return senderBrandIdDefault
  **/
  @ApiModelProperty(value = "The brand seen by envelope senders when a brand is not explicitly set.")
  public String getSenderBrandIdDefault() {
    return senderBrandIdDefault;
  }

  public void setSenderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
  }

  public BrandsResponse brandOptions(java.util.List<Brand> brandOptions) {
    this.brandOptions = brandOptions;
    return this;
  }

  public BrandsResponse addBrandOptionsItem(Brand brandOptionsItem) {
    if (this.brandOptions == null) {
      this.brandOptions = new java.util.ArrayList<Brand>();
    }
    this.brandOptions.add(brandOptionsItem);
    return this;
  }

   /**
   * The list of brands.
   * @return brandOptions
  **/
  @ApiModelProperty(value = "The list of brands.")
  public java.util.List<Brand> getBrandOptions() {
    return brandOptions;
  }

  public void setBrandOptions(java.util.List<Brand> brandOptions) {
    this.brandOptions = brandOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsResponse brandsResponse = (BrandsResponse) o;
    return Objects.equals(this.recipientBrandIdDefault, brandsResponse.recipientBrandIdDefault) &&
        Objects.equals(this.senderBrandIdDefault, brandsResponse.senderBrandIdDefault) &&
        Objects.equals(this.brandOptions, brandsResponse.brandOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientBrandIdDefault, senderBrandIdDefault, brandOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsResponse {\n");
    
    sb.append("    recipientBrandIdDefault: ").append(toIndentedString(recipientBrandIdDefault)).append("\n");
    sb.append("    senderBrandIdDefault: ").append(toIndentedString(senderBrandIdDefault)).append("\n");
    sb.append("    brandOptions: ").append(toIndentedString(brandOptions)).append("\n");
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

