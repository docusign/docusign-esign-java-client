package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentGatewayAccount.
 *
 */

public class PaymentGatewayAccount {
  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("paymentGateway")
  private String paymentGateway = null;

  @JsonProperty("paymentGatewayAccountId")
  private String paymentGatewayAccountId = null;

  @JsonProperty("paymentGatewayDisplayName")
  private String paymentGatewayDisplayName = null;


  /**
   * displayName.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * .
   * @return displayName
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * setDisplayName.
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * paymentGateway.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount paymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
    return this;
  }

  /**
   * .
   * @return paymentGateway
   **/
  @ApiModelProperty(value = "")
  public String getPaymentGateway() {
    return paymentGateway;
  }

  /**
   * setPaymentGateway.
   **/
  public void setPaymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
  }


  /**
   * paymentGatewayAccountId.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount paymentGatewayAccountId(String paymentGatewayAccountId) {
    this.paymentGatewayAccountId = paymentGatewayAccountId;
    return this;
  }

  /**
   * .
   * @return paymentGatewayAccountId
   **/
  @ApiModelProperty(value = "")
  public String getPaymentGatewayAccountId() {
    return paymentGatewayAccountId;
  }

  /**
   * setPaymentGatewayAccountId.
   **/
  public void setPaymentGatewayAccountId(String paymentGatewayAccountId) {
    this.paymentGatewayAccountId = paymentGatewayAccountId;
  }


  /**
   * paymentGatewayDisplayName.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount paymentGatewayDisplayName(String paymentGatewayDisplayName) {
    this.paymentGatewayDisplayName = paymentGatewayDisplayName;
    return this;
  }

  /**
   * .
   * @return paymentGatewayDisplayName
   **/
  @ApiModelProperty(value = "")
  public String getPaymentGatewayDisplayName() {
    return paymentGatewayDisplayName;
  }

  /**
   * setPaymentGatewayDisplayName.
   **/
  public void setPaymentGatewayDisplayName(String paymentGatewayDisplayName) {
    this.paymentGatewayDisplayName = paymentGatewayDisplayName;
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
    PaymentGatewayAccount paymentGatewayAccount = (PaymentGatewayAccount) o;
    return Objects.equals(this.displayName, paymentGatewayAccount.displayName) &&
        Objects.equals(this.paymentGateway, paymentGatewayAccount.paymentGateway) &&
        Objects.equals(this.paymentGatewayAccountId, paymentGatewayAccount.paymentGatewayAccountId) &&
        Objects.equals(this.paymentGatewayDisplayName, paymentGatewayAccount.paymentGatewayDisplayName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(displayName, paymentGateway, paymentGatewayAccountId, paymentGatewayDisplayName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGatewayAccount {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    paymentGatewayAccountId: ").append(toIndentedString(paymentGatewayAccountId)).append("\n");
    sb.append("    paymentGatewayDisplayName: ").append(toIndentedString(paymentGatewayDisplayName)).append("\n");
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

