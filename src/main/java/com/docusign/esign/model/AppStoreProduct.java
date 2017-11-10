package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about an APP store product.
 */
@ApiModel(description = "Contains information about an APP store product.")

public class AppStoreProduct {
  @JsonProperty("marketPlace")
  private String marketPlace = null;

  @JsonProperty("productId")
  private String productId = null;

  public AppStoreProduct marketPlace(String marketPlace) {
    this.marketPlace = marketPlace;
    return this;
  }

   /**
   * 
   * @return marketPlace
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMarketPlace() {
    return marketPlace;
  }

  public void setMarketPlace(String marketPlace) {
    this.marketPlace = marketPlace;
  }

  public AppStoreProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The Product ID from the AppStore.
   * @return productId
  **/
  @ApiModelProperty(example = "null", value = "The Product ID from the AppStore.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreProduct appStoreProduct = (AppStoreProduct) o;
    return Objects.equals(this.marketPlace, appStoreProduct.marketPlace) &&
        Objects.equals(this.productId, appStoreProduct.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketPlace, productId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreProduct {\n");
    
    sb.append("    marketPlace: ").append(toIndentedString(marketPlace)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

