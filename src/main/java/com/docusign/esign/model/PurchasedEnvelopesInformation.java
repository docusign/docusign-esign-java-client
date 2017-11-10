package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PurchasedEnvelopesInformation
 */

public class PurchasedEnvelopesInformation {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("platform")
  private String platform = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("receiptData")
  private String receiptData = null;

  @JsonProperty("storeName")
  private String storeName = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  public PurchasedEnvelopesInformation amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the purchase.
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "The total amount of the purchase.")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PurchasedEnvelopesInformation appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * The AppName of the client application.
   * @return appName
  **/
  @ApiModelProperty(example = "null", value = "The AppName of the client application.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public PurchasedEnvelopesInformation currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code of the purchase. This is based on the ISO 4217 currency code information.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code of the purchase. This is based on the ISO 4217 currency code information.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PurchasedEnvelopesInformation platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * The Platform of the client application
   * @return platform
  **/
  @ApiModelProperty(example = "null", value = "The Platform of the client application")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public PurchasedEnvelopesInformation productId(String productId) {
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

  public PurchasedEnvelopesInformation quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of envelopes to add to the account.
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "The quantity of envelopes to add to the account.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public PurchasedEnvelopesInformation receiptData(String receiptData) {
    this.receiptData = receiptData;
    return this;
  }

   /**
   * The encrypted Base64 encoded receipt data.
   * @return receiptData
  **/
  @ApiModelProperty(example = "null", value = "The encrypted Base64 encoded receipt data.")
  public String getReceiptData() {
    return receiptData;
  }

  public void setReceiptData(String receiptData) {
    this.receiptData = receiptData;
  }

  public PurchasedEnvelopesInformation storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * The name of the AppStore.
   * @return storeName
  **/
  @ApiModelProperty(example = "null", value = "The name of the AppStore.")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PurchasedEnvelopesInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Specifies the Transaction ID from the AppStore.
   * @return transactionId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the Transaction ID from the AppStore.")
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
    return Objects.equals(this.amount, purchasedEnvelopesInformation.amount) &&
        Objects.equals(this.appName, purchasedEnvelopesInformation.appName) &&
        Objects.equals(this.currencyCode, purchasedEnvelopesInformation.currencyCode) &&
        Objects.equals(this.platform, purchasedEnvelopesInformation.platform) &&
        Objects.equals(this.productId, purchasedEnvelopesInformation.productId) &&
        Objects.equals(this.quantity, purchasedEnvelopesInformation.quantity) &&
        Objects.equals(this.receiptData, purchasedEnvelopesInformation.receiptData) &&
        Objects.equals(this.storeName, purchasedEnvelopesInformation.storeName) &&
        Objects.equals(this.transactionId, purchasedEnvelopesInformation.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, appName, currencyCode, platform, productId, quantity, receiptData, storeName, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchasedEnvelopesInformation {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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

