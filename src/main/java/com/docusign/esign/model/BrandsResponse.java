package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Brand;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BrandsResponse   {
  
  private java.util.List<Brand> brands = new java.util.ArrayList<Brand>();
  private String recipientBrandIdDefault = null;
  private String senderBrandIdDefault = null;

  
  /**
   * The list of brands.
   **/
  
  @ApiModelProperty(value = "The list of brands.")
  @JsonProperty("brands")
  public java.util.List<Brand> getBrands() {
    return brands;
  }
  public void setBrands(java.util.List<Brand> brands) {
    this.brands = brands;
  }

  
  /**
   * The brand seen by envelope recipients when a brand is not explicitly set.
   **/
  
  @ApiModelProperty(value = "The brand seen by envelope recipients when a brand is not explicitly set.")
  @JsonProperty("recipientBrandIdDefault")
  public String getRecipientBrandIdDefault() {
    return recipientBrandIdDefault;
  }
  public void setRecipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
  }

  
  /**
   * The brand seen by envelope senders when a brand is not explicitly set.
   **/
  
  @ApiModelProperty(value = "The brand seen by envelope senders when a brand is not explicitly set.")
  @JsonProperty("senderBrandIdDefault")
  public String getSenderBrandIdDefault() {
    return senderBrandIdDefault;
  }
  public void setSenderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
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

    return true && Objects.equals(brands, brandsResponse.brands) &&
        Objects.equals(recipientBrandIdDefault, brandsResponse.recipientBrandIdDefault) &&
        Objects.equals(senderBrandIdDefault, brandsResponse.senderBrandIdDefault)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, recipientBrandIdDefault, senderBrandIdDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsResponse {\n");
    
    if (brands != null)
      sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    if (recipientBrandIdDefault != null)
      sb.append("    recipientBrandIdDefault: ").append(toIndentedString(recipientBrandIdDefault)).append("\n");
    if (senderBrandIdDefault != null)
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

