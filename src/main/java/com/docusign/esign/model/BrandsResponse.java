package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Brand;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BrandsResponse.
 *
 */

public class BrandsResponse {
  @JsonProperty("brands")
  private java.util.List<Brand> brands = null;

  @JsonProperty("recipientBrandIdDefault")
  private String recipientBrandIdDefault = null;

  @JsonProperty("senderBrandIdDefault")
  private String senderBrandIdDefault = null;


  /**
   * brands.
   *
   * @return BrandsResponse
   **/
  public BrandsResponse brands(java.util.List<Brand> brands) {
    this.brands = brands;
    return this;
  }
  
  /**
   * addBrandsItem.
   *
   * @return BrandsResponse
   **/
  public BrandsResponse addBrandsItem(Brand brandsItem) {
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
  @Schema(description = "The list of brands.")
  public java.util.List<Brand> getBrands() {
    return brands;
  }

  /**
   * setBrands.
   **/
  public void setBrands(java.util.List<Brand> brands) {
    this.brands = brands;
  }


  /**
   * recipientBrandIdDefault.
   *
   * @return BrandsResponse
   **/
  public BrandsResponse recipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
    return this;
  }

  /**
   * The brand seen by envelope recipients when a brand is not explicitly set..
   * @return recipientBrandIdDefault
   **/
  @Schema(description = "The brand seen by envelope recipients when a brand is not explicitly set.")
  public String getRecipientBrandIdDefault() {
    return recipientBrandIdDefault;
  }

  /**
   * setRecipientBrandIdDefault.
   **/
  public void setRecipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
  }


  /**
   * senderBrandIdDefault.
   *
   * @return BrandsResponse
   **/
  public BrandsResponse senderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
    return this;
  }

  /**
   * The brand seen by envelope senders when a brand is not explicitly set..
   * @return senderBrandIdDefault
   **/
  @Schema(description = "The brand seen by envelope senders when a brand is not explicitly set.")
  public String getSenderBrandIdDefault() {
    return senderBrandIdDefault;
  }

  /**
   * setSenderBrandIdDefault.
   **/
  public void setSenderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
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
    BrandsResponse brandsResponse = (BrandsResponse) o;
    return Objects.equals(this.brands, brandsResponse.brands) &&
        Objects.equals(this.recipientBrandIdDefault, brandsResponse.recipientBrandIdDefault) &&
        Objects.equals(this.senderBrandIdDefault, brandsResponse.senderBrandIdDefault);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(brands, recipientBrandIdDefault, senderBrandIdDefault);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsResponse {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    recipientBrandIdDefault: ").append(toIndentedString(recipientBrandIdDefault)).append("\n");
    sb.append("    senderBrandIdDefault: ").append(toIndentedString(senderBrandIdDefault)).append("\n");
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

