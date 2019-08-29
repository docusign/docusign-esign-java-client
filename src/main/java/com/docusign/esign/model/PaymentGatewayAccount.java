package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PayPalLegacySettings;
import com.docusign.esign.model.PaymentGatewayAccountSetting;
import com.docusign.esign.model.PaymentMethodWithOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentGatewayAccount
 */

public class PaymentGatewayAccount {
  @JsonProperty("allowCustomMetadata")
  private Boolean allowCustomMetadata = null;

  @JsonProperty("config")
  private PaymentGatewayAccountSetting config = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("isEnabled")
  private String isEnabled = null;

  @JsonProperty("isLegacy")
  private String isLegacy = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("paymentGateway")
  private String paymentGateway = null;

  @JsonProperty("paymentGatewayAccountId")
  private String paymentGatewayAccountId = null;

  @JsonProperty("paymentGatewayDisplayName")
  private String paymentGatewayDisplayName = null;

  @JsonProperty("payPalLegacySettings")
  private PayPalLegacySettings payPalLegacySettings = null;

  @JsonProperty("supportedCurrencies")
  private java.util.List<String> supportedCurrencies = new java.util.ArrayList<String>();

  @JsonProperty("supportedPaymentMethods")
  private java.util.List<String> supportedPaymentMethods = new java.util.ArrayList<String>();

  @JsonProperty("supportedPaymentMethodsWithOptions")
  private java.util.List<PaymentMethodWithOptions> supportedPaymentMethodsWithOptions = new java.util.ArrayList<PaymentMethodWithOptions>();

  public PaymentGatewayAccount allowCustomMetadata(Boolean allowCustomMetadata) {
    this.allowCustomMetadata = allowCustomMetadata;
    return this;
  }

   /**
   * 
   * @return allowCustomMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowCustomMetadata() {
    return allowCustomMetadata;
  }

  public void setAllowCustomMetadata(Boolean allowCustomMetadata) {
    this.allowCustomMetadata = allowCustomMetadata;
  }

  public PaymentGatewayAccount config(PaymentGatewayAccountSetting config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentGatewayAccountSetting getConfig() {
    return config;
  }

  public void setConfig(PaymentGatewayAccountSetting config) {
    this.config = config;
  }

  public PaymentGatewayAccount displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PaymentGatewayAccount isEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * 
   * @return isEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }

  public PaymentGatewayAccount isLegacy(String isLegacy) {
    this.isLegacy = isLegacy;
    return this;
  }

   /**
   * 
   * @return isLegacy
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsLegacy() {
    return isLegacy;
  }

  public void setIsLegacy(String isLegacy) {
    this.isLegacy = isLegacy;
  }

  public PaymentGatewayAccount lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * 
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public PaymentGatewayAccount paymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
    return this;
  }

   /**
   * 
   * @return paymentGateway
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentGateway() {
    return paymentGateway;
  }

  public void setPaymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public PaymentGatewayAccount paymentGatewayAccountId(String paymentGatewayAccountId) {
    this.paymentGatewayAccountId = paymentGatewayAccountId;
    return this;
  }

   /**
   * 
   * @return paymentGatewayAccountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentGatewayAccountId() {
    return paymentGatewayAccountId;
  }

  public void setPaymentGatewayAccountId(String paymentGatewayAccountId) {
    this.paymentGatewayAccountId = paymentGatewayAccountId;
  }

  public PaymentGatewayAccount paymentGatewayDisplayName(String paymentGatewayDisplayName) {
    this.paymentGatewayDisplayName = paymentGatewayDisplayName;
    return this;
  }

   /**
   * 
   * @return paymentGatewayDisplayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentGatewayDisplayName() {
    return paymentGatewayDisplayName;
  }

  public void setPaymentGatewayDisplayName(String paymentGatewayDisplayName) {
    this.paymentGatewayDisplayName = paymentGatewayDisplayName;
  }

  public PaymentGatewayAccount payPalLegacySettings(PayPalLegacySettings payPalLegacySettings) {
    this.payPalLegacySettings = payPalLegacySettings;
    return this;
  }

   /**
   * Get payPalLegacySettings
   * @return payPalLegacySettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public PayPalLegacySettings getPayPalLegacySettings() {
    return payPalLegacySettings;
  }

  public void setPayPalLegacySettings(PayPalLegacySettings payPalLegacySettings) {
    this.payPalLegacySettings = payPalLegacySettings;
  }

  public PaymentGatewayAccount supportedCurrencies(java.util.List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }

  public PaymentGatewayAccount addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

   /**
   * 
   * @return supportedCurrencies
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }

  public void setSupportedCurrencies(java.util.List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }

  public PaymentGatewayAccount supportedPaymentMethods(java.util.List<String> supportedPaymentMethods) {
    this.supportedPaymentMethods = supportedPaymentMethods;
    return this;
  }

  public PaymentGatewayAccount addSupportedPaymentMethodsItem(String supportedPaymentMethodsItem) {
    this.supportedPaymentMethods.add(supportedPaymentMethodsItem);
    return this;
  }

   /**
   * 
   * @return supportedPaymentMethods
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getSupportedPaymentMethods() {
    return supportedPaymentMethods;
  }

  public void setSupportedPaymentMethods(java.util.List<String> supportedPaymentMethods) {
    this.supportedPaymentMethods = supportedPaymentMethods;
  }

  public PaymentGatewayAccount supportedPaymentMethodsWithOptions(java.util.List<PaymentMethodWithOptions> supportedPaymentMethodsWithOptions) {
    this.supportedPaymentMethodsWithOptions = supportedPaymentMethodsWithOptions;
    return this;
  }

  public PaymentGatewayAccount addSupportedPaymentMethodsWithOptionsItem(PaymentMethodWithOptions supportedPaymentMethodsWithOptionsItem) {
    this.supportedPaymentMethodsWithOptions.add(supportedPaymentMethodsWithOptionsItem);
    return this;
  }

   /**
   * 
   * @return supportedPaymentMethodsWithOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<PaymentMethodWithOptions> getSupportedPaymentMethodsWithOptions() {
    return supportedPaymentMethodsWithOptions;
  }

  public void setSupportedPaymentMethodsWithOptions(java.util.List<PaymentMethodWithOptions> supportedPaymentMethodsWithOptions) {
    this.supportedPaymentMethodsWithOptions = supportedPaymentMethodsWithOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentGatewayAccount paymentGatewayAccount = (PaymentGatewayAccount) o;
    return Objects.equals(this.allowCustomMetadata, paymentGatewayAccount.allowCustomMetadata) &&
        Objects.equals(this.config, paymentGatewayAccount.config) &&
        Objects.equals(this.displayName, paymentGatewayAccount.displayName) &&
        Objects.equals(this.isEnabled, paymentGatewayAccount.isEnabled) &&
        Objects.equals(this.isLegacy, paymentGatewayAccount.isLegacy) &&
        Objects.equals(this.lastModified, paymentGatewayAccount.lastModified) &&
        Objects.equals(this.paymentGateway, paymentGatewayAccount.paymentGateway) &&
        Objects.equals(this.paymentGatewayAccountId, paymentGatewayAccount.paymentGatewayAccountId) &&
        Objects.equals(this.paymentGatewayDisplayName, paymentGatewayAccount.paymentGatewayDisplayName) &&
        Objects.equals(this.payPalLegacySettings, paymentGatewayAccount.payPalLegacySettings) &&
        Objects.equals(this.supportedCurrencies, paymentGatewayAccount.supportedCurrencies) &&
        Objects.equals(this.supportedPaymentMethods, paymentGatewayAccount.supportedPaymentMethods) &&
        Objects.equals(this.supportedPaymentMethodsWithOptions, paymentGatewayAccount.supportedPaymentMethodsWithOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCustomMetadata, config, displayName, isEnabled, isLegacy, lastModified, paymentGateway, paymentGatewayAccountId, paymentGatewayDisplayName, payPalLegacySettings, supportedCurrencies, supportedPaymentMethods, supportedPaymentMethodsWithOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGatewayAccount {\n");
    
    sb.append("    allowCustomMetadata: ").append(toIndentedString(allowCustomMetadata)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isLegacy: ").append(toIndentedString(isLegacy)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    paymentGatewayAccountId: ").append(toIndentedString(paymentGatewayAccountId)).append("\n");
    sb.append("    paymentGatewayDisplayName: ").append(toIndentedString(paymentGatewayDisplayName)).append("\n");
    sb.append("    payPalLegacySettings: ").append(toIndentedString(payPalLegacySettings)).append("\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    supportedPaymentMethods: ").append(toIndentedString(supportedPaymentMethods)).append("\n");
    sb.append("    supportedPaymentMethodsWithOptions: ").append(toIndentedString(supportedPaymentMethodsWithOptions)).append("\n");
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

