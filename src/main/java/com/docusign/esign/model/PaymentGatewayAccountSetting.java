package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** PaymentGatewayAccountSetting. */
public class PaymentGatewayAccountSetting {
  @JsonProperty("apiFields")
  private String apiFields = null;

  @JsonProperty("authorizationCode")
  private String authorizationCode = null;

  @JsonProperty("credentialStatus")
  private String credentialStatus = null;

  @JsonProperty("merchantId")
  private String merchantId = null;

  /**
   * apiFields.
   *
   * @return PaymentGatewayAccountSetting
   */
  public PaymentGatewayAccountSetting apiFields(String apiFields) {
    this.apiFields = apiFields;
    return this;
  }

  /**
   * .
   *
   * @return apiFields
   */
  @ApiModelProperty(value = "")
  public String getApiFields() {
    return apiFields;
  }

  /** setApiFields. */
  public void setApiFields(String apiFields) {
    this.apiFields = apiFields;
  }

  /**
   * authorizationCode.
   *
   * @return PaymentGatewayAccountSetting
   */
  public PaymentGatewayAccountSetting authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  /**
   * .
   *
   * @return authorizationCode
   */
  @ApiModelProperty(value = "")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  /** setAuthorizationCode. */
  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  /**
   * credentialStatus.
   *
   * @return PaymentGatewayAccountSetting
   */
  public PaymentGatewayAccountSetting credentialStatus(String credentialStatus) {
    this.credentialStatus = credentialStatus;
    return this;
  }

  /**
   * .
   *
   * @return credentialStatus
   */
  @ApiModelProperty(value = "")
  public String getCredentialStatus() {
    return credentialStatus;
  }

  /** setCredentialStatus. */
  public void setCredentialStatus(String credentialStatus) {
    this.credentialStatus = credentialStatus;
  }

  /**
   * merchantId.
   *
   * @return PaymentGatewayAccountSetting
   */
  public PaymentGatewayAccountSetting merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * .
   *
   * @return merchantId
   */
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  /** setMerchantId. */
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
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
    PaymentGatewayAccountSetting paymentGatewayAccountSetting = (PaymentGatewayAccountSetting) o;
    return Objects.equals(this.apiFields, paymentGatewayAccountSetting.apiFields)
        && Objects.equals(this.authorizationCode, paymentGatewayAccountSetting.authorizationCode)
        && Objects.equals(this.credentialStatus, paymentGatewayAccountSetting.credentialStatus)
        && Objects.equals(this.merchantId, paymentGatewayAccountSetting.merchantId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(apiFields, authorizationCode, credentialStatus, merchantId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGatewayAccountSetting {\n");

    sb.append("    apiFields: ").append(toIndentedString(apiFields)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    credentialStatus: ").append(toIndentedString(credentialStatus)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
