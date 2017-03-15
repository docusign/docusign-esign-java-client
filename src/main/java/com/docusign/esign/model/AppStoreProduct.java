package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about an APP store product.
 **/

@ApiModel(description = "Contains information about an APP store product.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AppStoreProduct   {
  
  private String marketPlace = null;
  private String productId = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("marketPlace")
  public String getMarketPlace() {
    return marketPlace;
  }
  public void setMarketPlace(String marketPlace) {
    this.marketPlace = marketPlace;
  }

  
  /**
   * The Product ID from the AppStore.
   **/
  
  @ApiModelProperty(value = "The Product ID from the AppStore.")
  @JsonProperty("productId")
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

    return true && Objects.equals(marketPlace, appStoreProduct.marketPlace) &&
        Objects.equals(productId, appStoreProduct.productId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketPlace, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreProduct {\n");
    
    if (marketPlace != null)
      sb.append("    marketPlace: ").append(toIndentedString(marketPlace)).append("\n");
    if (productId != null)
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

