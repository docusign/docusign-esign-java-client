package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Money;
import com.docusign.esign.model.PaymentLineItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentDetails
 */

public class PaymentDetails {
  @JsonProperty("allowedPaymentMethods")
  private java.util.List<String> allowedPaymentMethods = new java.util.ArrayList<String>();

  @JsonProperty("chargeId")
  private String chargeId = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("gatewayAccountId")
  private String gatewayAccountId = null;

  @JsonProperty("gatewayDisplayName")
  private String gatewayDisplayName = null;

  @JsonProperty("gatewayName")
  private String gatewayName = null;

  @JsonProperty("lineItems")
  private java.util.List<PaymentLineItem> lineItems = new java.util.ArrayList<PaymentLineItem>();

  @JsonProperty("paymentOption")
  private String paymentOption = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("total")
  private Money total = null;

  public PaymentDetails allowedPaymentMethods(java.util.List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public PaymentDetails addAllowedPaymentMethodsItem(String allowedPaymentMethodsItem) {
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

   /**
   * 
   * @return allowedPaymentMethods
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }

  public void setAllowedPaymentMethods(java.util.List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }

  public PaymentDetails chargeId(String chargeId) {
    this.chargeId = chargeId;
    return this;
  }

   /**
   * 
   * @return chargeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChargeId() {
    return chargeId;
  }

  public void setChargeId(String chargeId) {
    this.chargeId = chargeId;
  }

  public PaymentDetails currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * 
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PaymentDetails gatewayAccountId(String gatewayAccountId) {
    this.gatewayAccountId = gatewayAccountId;
    return this;
  }

   /**
   * 
   * @return gatewayAccountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGatewayAccountId() {
    return gatewayAccountId;
  }

  public void setGatewayAccountId(String gatewayAccountId) {
    this.gatewayAccountId = gatewayAccountId;
  }

  public PaymentDetails gatewayDisplayName(String gatewayDisplayName) {
    this.gatewayDisplayName = gatewayDisplayName;
    return this;
  }

   /**
   * 
   * @return gatewayDisplayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGatewayDisplayName() {
    return gatewayDisplayName;
  }

  public void setGatewayDisplayName(String gatewayDisplayName) {
    this.gatewayDisplayName = gatewayDisplayName;
  }

  public PaymentDetails gatewayName(String gatewayName) {
    this.gatewayName = gatewayName;
    return this;
  }

   /**
   * 
   * @return gatewayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGatewayName() {
    return gatewayName;
  }

  public void setGatewayName(String gatewayName) {
    this.gatewayName = gatewayName;
  }

  public PaymentDetails lineItems(java.util.List<PaymentLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public PaymentDetails addLineItemsItem(PaymentLineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<PaymentLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(java.util.List<PaymentLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public PaymentDetails paymentOption(String paymentOption) {
    this.paymentOption = paymentOption;
    return this;
  }

   /**
   * 
   * @return paymentOption
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentOption() {
    return paymentOption;
  }

  public void setPaymentOption(String paymentOption) {
    this.paymentOption = paymentOption;
  }

  public PaymentDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentDetails total(Money total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Money getTotal() {
    return total;
  }

  public void setTotal(Money total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.allowedPaymentMethods, paymentDetails.allowedPaymentMethods) &&
        Objects.equals(this.chargeId, paymentDetails.chargeId) &&
        Objects.equals(this.currencyCode, paymentDetails.currencyCode) &&
        Objects.equals(this.gatewayAccountId, paymentDetails.gatewayAccountId) &&
        Objects.equals(this.gatewayDisplayName, paymentDetails.gatewayDisplayName) &&
        Objects.equals(this.gatewayName, paymentDetails.gatewayName) &&
        Objects.equals(this.lineItems, paymentDetails.lineItems) &&
        Objects.equals(this.paymentOption, paymentDetails.paymentOption) &&
        Objects.equals(this.status, paymentDetails.status) &&
        Objects.equals(this.total, paymentDetails.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethods, chargeId, currencyCode, gatewayAccountId, gatewayDisplayName, gatewayName, lineItems, paymentOption, status, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    gatewayAccountId: ").append(toIndentedString(gatewayAccountId)).append("\n");
    sb.append("    gatewayDisplayName: ").append(toIndentedString(gatewayDisplayName)).append("\n");
    sb.append("    gatewayName: ").append(toIndentedString(gatewayName)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    paymentOption: ").append(toIndentedString(paymentOption)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

