package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PayPalLegacySettings;
import com.docusign.esign.model.PaymentGatewayAccountSetting;
import com.docusign.esign.model.PaymentMethodWithOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This object contains details about a payment gateway account..
 *
 */
@ApiModel(description = "This object contains details about a payment gateway account.")

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
  private java.util.List<String> supportedCurrencies = null;

  @JsonProperty("supportedPaymentMethods")
  private java.util.List<String> supportedPaymentMethods = null;

  @JsonProperty("supportedPaymentMethodsWithOptions")
  private java.util.List<PaymentMethodWithOptions> supportedPaymentMethodsWithOptions = null;

  @JsonProperty("zeroDecimalCurrencies")
  private java.util.List<String> zeroDecimalCurrencies = null;


  /**
   * allowCustomMetadata.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount allowCustomMetadata(Boolean allowCustomMetadata) {
    this.allowCustomMetadata = allowCustomMetadata;
    return this;
  }

  /**
   * .
   * @return allowCustomMetadata
   **/
  @ApiModelProperty(value = "")
  public Boolean isAllowCustomMetadata() {
    return allowCustomMetadata;
  }

  /**
   * setAllowCustomMetadata.
   **/
  public void setAllowCustomMetadata(Boolean allowCustomMetadata) {
    this.allowCustomMetadata = allowCustomMetadata;
  }


  /**
   * config.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount config(PaymentGatewayAccountSetting config) {
    this.config = config;
    return this;
  }

  /**
   * This property contains metadata about the payment gateway account's configuration such as the API key, `userId`, and `merchantId` details..
   * @return config
   **/
  @ApiModelProperty(value = "This property contains metadata about the payment gateway account's configuration such as the API key, `userId`, and `merchantId` details.")
  public PaymentGatewayAccountSetting getConfig() {
    return config;
  }

  /**
   * setConfig.
   **/
  public void setConfig(PaymentGatewayAccountSetting config) {
    this.config = config;
  }


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
   * isEnabled.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount isEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * .
   * @return isEnabled
   **/
  @ApiModelProperty(value = "")
  public String getIsEnabled() {
    return isEnabled;
  }

  /**
   * setIsEnabled.
   **/
  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }


  /**
   * isLegacy.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount isLegacy(String isLegacy) {
    this.isLegacy = isLegacy;
    return this;
  }

  /**
   * .
   * @return isLegacy
   **/
  @ApiModelProperty(value = "")
  public String getIsLegacy() {
    return isLegacy;
  }

  /**
   * setIsLegacy.
   **/
  public void setIsLegacy(String isLegacy) {
    this.isLegacy = isLegacy;
  }


  /**
   * lastModified.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * .
   * @return lastModified
   **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  /**
   * setLastModified.
   **/
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
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
   * payPalLegacySettings.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount payPalLegacySettings(PayPalLegacySettings payPalLegacySettings) {
    this.payPalLegacySettings = payPalLegacySettings;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * @return payPalLegacySettings
   **/
  @ApiModelProperty(value = "Reserved for DocuSign.")
  public PayPalLegacySettings getPayPalLegacySettings() {
    return payPalLegacySettings;
  }

  /**
   * setPayPalLegacySettings.
   **/
  public void setPayPalLegacySettings(PayPalLegacySettings payPalLegacySettings) {
    this.payPalLegacySettings = payPalLegacySettings;
  }


  /**
   * supportedCurrencies.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount supportedCurrencies(java.util.List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }
  
  /**
   * addSupportedCurrenciesItem.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    if (this.supportedCurrencies == null) {
      this.supportedCurrencies = new java.util.ArrayList<>();
    }
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

  /**
   * .
   * @return supportedCurrencies
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }

  /**
   * setSupportedCurrencies.
   **/
  public void setSupportedCurrencies(java.util.List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }


  /**
   * supportedPaymentMethods.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount supportedPaymentMethods(java.util.List<String> supportedPaymentMethods) {
    this.supportedPaymentMethods = supportedPaymentMethods;
    return this;
  }
  
  /**
   * addSupportedPaymentMethodsItem.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount addSupportedPaymentMethodsItem(String supportedPaymentMethodsItem) {
    if (this.supportedPaymentMethods == null) {
      this.supportedPaymentMethods = new java.util.ArrayList<>();
    }
    this.supportedPaymentMethods.add(supportedPaymentMethodsItem);
    return this;
  }

  /**
   * .
   * @return supportedPaymentMethods
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSupportedPaymentMethods() {
    return supportedPaymentMethods;
  }

  /**
   * setSupportedPaymentMethods.
   **/
  public void setSupportedPaymentMethods(java.util.List<String> supportedPaymentMethods) {
    this.supportedPaymentMethods = supportedPaymentMethods;
  }


  /**
   * supportedPaymentMethodsWithOptions.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount supportedPaymentMethodsWithOptions(java.util.List<PaymentMethodWithOptions> supportedPaymentMethodsWithOptions) {
    this.supportedPaymentMethodsWithOptions = supportedPaymentMethodsWithOptions;
    return this;
  }
  
  /**
   * addSupportedPaymentMethodsWithOptionsItem.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount addSupportedPaymentMethodsWithOptionsItem(PaymentMethodWithOptions supportedPaymentMethodsWithOptionsItem) {
    if (this.supportedPaymentMethodsWithOptions == null) {
      this.supportedPaymentMethodsWithOptions = new java.util.ArrayList<>();
    }
    this.supportedPaymentMethodsWithOptions.add(supportedPaymentMethodsWithOptionsItem);
    return this;
  }

  /**
   * .
   * @return supportedPaymentMethodsWithOptions
   **/
  @ApiModelProperty(value = "")
  public java.util.List<PaymentMethodWithOptions> getSupportedPaymentMethodsWithOptions() {
    return supportedPaymentMethodsWithOptions;
  }

  /**
   * setSupportedPaymentMethodsWithOptions.
   **/
  public void setSupportedPaymentMethodsWithOptions(java.util.List<PaymentMethodWithOptions> supportedPaymentMethodsWithOptions) {
    this.supportedPaymentMethodsWithOptions = supportedPaymentMethodsWithOptions;
  }


  /**
   * zeroDecimalCurrencies.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount zeroDecimalCurrencies(java.util.List<String> zeroDecimalCurrencies) {
    this.zeroDecimalCurrencies = zeroDecimalCurrencies;
    return this;
  }
  
  /**
   * addZeroDecimalCurrenciesItem.
   *
   * @return PaymentGatewayAccount
   **/
  public PaymentGatewayAccount addZeroDecimalCurrenciesItem(String zeroDecimalCurrenciesItem) {
    if (this.zeroDecimalCurrencies == null) {
      this.zeroDecimalCurrencies = new java.util.ArrayList<>();
    }
    this.zeroDecimalCurrencies.add(zeroDecimalCurrenciesItem);
    return this;
  }

  /**
   * .
   * @return zeroDecimalCurrencies
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getZeroDecimalCurrencies() {
    return zeroDecimalCurrencies;
  }

  /**
   * setZeroDecimalCurrencies.
   **/
  public void setZeroDecimalCurrencies(java.util.List<String> zeroDecimalCurrencies) {
    this.zeroDecimalCurrencies = zeroDecimalCurrencies;
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
        Objects.equals(this.supportedPaymentMethodsWithOptions, paymentGatewayAccount.supportedPaymentMethodsWithOptions) &&
        Objects.equals(this.zeroDecimalCurrencies, paymentGatewayAccount.zeroDecimalCurrencies);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowCustomMetadata, config, displayName, isEnabled, isLegacy, lastModified, paymentGateway, paymentGatewayAccountId, paymentGatewayDisplayName, payPalLegacySettings, supportedCurrencies, supportedPaymentMethods, supportedPaymentMethodsWithOptions, zeroDecimalCurrencies);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    zeroDecimalCurrencies: ").append(toIndentedString(zeroDecimalCurrencies)).append("\n");
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

