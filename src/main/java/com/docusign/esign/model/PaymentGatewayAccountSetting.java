package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentGatewayAccountSetting
 */

public class PaymentGatewayAccountSetting {
  @JsonProperty("apiFields")
  private String apiFields = null;

  @JsonProperty("authorizationCode")
  private String authorizationCode = null;

  @JsonProperty("credentialStatus")
  private String credentialStatus = null;

  @JsonProperty("merchantId")
  private String merchantId = null;

  public PaymentGatewayAccountSetting apiFields(String apiFields) {
    this.apiFields = apiFields;
    return this;
  }

   /**
   * 
   * @return apiFields
  **/
  @ApiModelProperty(value = "")
  public String getApiFields() {
    return apiFields;
  }

  public void setApiFields(String apiFields) {
    this.apiFields = apiFields;
  }

  public PaymentGatewayAccountSetting authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * 
   * @return authorizationCode
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public PaymentGatewayAccountSetting credentialStatus(String credentialStatus) {
    this.credentialStatus = credentialStatus;
    return this;
  }

   /**
   * 
   * @return credentialStatus
  **/
  @ApiModelProperty(value = "")
  public String getCredentialStatus() {
    return credentialStatus;
  }

  public void setCredentialStatus(String credentialStatus) {
    this.credentialStatus = credentialStatus;
  }

  public PaymentGatewayAccountSetting merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentGatewayAccountSetting paymentGatewayAccountSetting = (PaymentGatewayAccountSetting) o;
    return Objects.equals(this.apiFields, paymentGatewayAccountSetting.apiFields) &&
        Objects.equals(this.authorizationCode, paymentGatewayAccountSetting.authorizationCode) &&
        Objects.equals(this.credentialStatus, paymentGatewayAccountSetting.credentialStatus) &&
        Objects.equals(this.merchantId, paymentGatewayAccountSetting.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiFields, authorizationCode, credentialStatus, merchantId);
  }


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

