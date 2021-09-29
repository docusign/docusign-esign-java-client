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
 * .
 *
 */
@ApiModel(description = "")

public class GroupBrands {
  @JsonProperty("recipientBrandIdDefault")
  private String recipientBrandIdDefault = null;

  @JsonProperty("senderBrandIdDefault")
  private String senderBrandIdDefault = null;

  @JsonProperty("brandOptions")
  private java.util.List<Brand> brandOptions = null;


  /**
   * recipientBrandIdDefault.
   *
   * @return GroupBrands
   **/
  public GroupBrands recipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
    return this;
  }

  /**
   * The brand seen by envelope recipients when a brand is not explicitly set..
   * @return recipientBrandIdDefault
   **/
  @ApiModelProperty(value = "The brand seen by envelope recipients when a brand is not explicitly set.")
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
   * @return GroupBrands
   **/
  public GroupBrands senderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
    return this;
  }

  /**
   * The brand seen by envelope senders when a brand is not explicitly set..
   * @return senderBrandIdDefault
   **/
  @ApiModelProperty(value = "The brand seen by envelope senders when a brand is not explicitly set.")
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
   * brandOptions.
   *
   * @return GroupBrands
   **/
  public GroupBrands brandOptions(java.util.List<Brand> brandOptions) {
    this.brandOptions = brandOptions;
    return this;
  }
  
  /**
   * addBrandOptionsItem.
   *
   * @return GroupBrands
   **/
  public GroupBrands addBrandOptionsItem(Brand brandOptionsItem) {
    if (this.brandOptions == null) {
      this.brandOptions = new java.util.ArrayList<Brand>();
    }
    this.brandOptions.add(brandOptionsItem);
    return this;
  }

  /**
   * The list of brands..
   * @return brandOptions
   **/
  @ApiModelProperty(value = "The list of brands.")
  public java.util.List<Brand> getBrandOptions() {
    return brandOptions;
  }

  /**
   * setBrandOptions.
   **/
  public void setBrandOptions(java.util.List<Brand> brandOptions) {
    this.brandOptions = brandOptions;
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
    GroupBrands groupBrands = (GroupBrands) o;
    return Objects.equals(this.recipientBrandIdDefault, groupBrands.recipientBrandIdDefault) &&
        Objects.equals(this.senderBrandIdDefault, groupBrands.senderBrandIdDefault) &&
        Objects.equals(this.brandOptions, groupBrands.brandOptions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recipientBrandIdDefault, senderBrandIdDefault, brandOptions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBrands {\n");
    
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

