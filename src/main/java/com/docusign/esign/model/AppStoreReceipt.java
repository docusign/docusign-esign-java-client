package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about an APP store receipt.
 **/

@ApiModel(description = "Contains information about an APP store receipt.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AppStoreReceipt   {
  
  private String productId = null;
  private String receiptData = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * Reserved: TBD
   **/
  
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("receiptData")
  public String getReceiptData() {
    return receiptData;
  }
  public void setReceiptData(String receiptData) {
    this.receiptData = receiptData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreReceipt appStoreReceipt = (AppStoreReceipt) o;

    return true && Objects.equals(productId, appStoreReceipt.productId) &&
        Objects.equals(receiptData, appStoreReceipt.receiptData)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, receiptData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReceipt {\n");
    
    if (productId != null)
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    if (receiptData != null)
      sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
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

