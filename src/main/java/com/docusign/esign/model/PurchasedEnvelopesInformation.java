package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PurchasedEnvelopesInformation   {
  
  private String amount = null;
  private String appName = null;
  private String currencyCode = null;
  private String platform = null;
  private String productId = null;
  private String quantity = null;
  private String receiptData = null;
  private String storeName = null;
  private String transactionId = null;

  
  /**
   * The total amount of the purchase.
   **/
  
  @ApiModelProperty(value = "The total amount of the purchase.")
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  /**
   * The AppName of the client application.
   **/
  
  @ApiModelProperty(value = "The AppName of the client application.")
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  
  /**
   * Specifies the ISO currency code of the purchase. This is based on the ISO 4217 currency code information.
   **/
  
  @ApiModelProperty(value = "Specifies the ISO currency code of the purchase. This is based on the ISO 4217 currency code information.")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   * The Platform of the client application
   **/
  
  @ApiModelProperty(value = "The Platform of the client application")
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
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

  
  /**
   * The quantity of envelopes to add to the account.
   **/
  
  @ApiModelProperty(value = "The quantity of envelopes to add to the account.")
  @JsonProperty("quantity")
  public String getQuantity() {
    return quantity;
  }
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  
  /**
   * The encrypted Base64 encoded receipt data.
   **/
  
  @ApiModelProperty(value = "The encrypted Base64 encoded receipt data.")
  @JsonProperty("receiptData")
  public String getReceiptData() {
    return receiptData;
  }
  public void setReceiptData(String receiptData) {
    this.receiptData = receiptData;
  }

  
  /**
   * The name of the AppStore.
   **/
  
  @ApiModelProperty(value = "The name of the AppStore.")
  @JsonProperty("storeName")
  public String getStoreName() {
    return storeName;
  }
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  
  /**
   * Specifies the Transaction ID from the AppStore.
   **/
  
  @ApiModelProperty(value = "Specifies the Transaction ID from the AppStore.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchasedEnvelopesInformation purchasedEnvelopesInformation = (PurchasedEnvelopesInformation) o;

    return true && Objects.equals(amount, purchasedEnvelopesInformation.amount) &&
        Objects.equals(appName, purchasedEnvelopesInformation.appName) &&
        Objects.equals(currencyCode, purchasedEnvelopesInformation.currencyCode) &&
        Objects.equals(platform, purchasedEnvelopesInformation.platform) &&
        Objects.equals(productId, purchasedEnvelopesInformation.productId) &&
        Objects.equals(quantity, purchasedEnvelopesInformation.quantity) &&
        Objects.equals(receiptData, purchasedEnvelopesInformation.receiptData) &&
        Objects.equals(storeName, purchasedEnvelopesInformation.storeName) &&
        Objects.equals(transactionId, purchasedEnvelopesInformation.transactionId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appName, currencyCode, platform, productId, quantity, receiptData, storeName, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchasedEnvelopesInformation {\n");
    
    if (amount != null)
      sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (appName != null)
      sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    if (currencyCode != null)
      sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    if (platform != null)
      sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    if (productId != null)
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    if (quantity != null)
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    if (receiptData != null)
      sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
    if (storeName != null)
      sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    if (transactionId != null)
      sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

