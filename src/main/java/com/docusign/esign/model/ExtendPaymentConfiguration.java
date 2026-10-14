package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ExtendPaymentLineItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ExtendPaymentConfiguration.
 *
 */

public class ExtendPaymentConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("connectionInstanceId")
  private String connectionInstanceId = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("durationEnd")
  private String durationEnd = null;

  @JsonProperty("durationStart")
  private String durationStart = null;

  @JsonProperty("lineItems")
  private java.util.List<ExtendPaymentLineItem> lineItems = null;

  @JsonProperty("paymentDueDays")
  private String paymentDueDays = null;

  @JsonProperty("paymentMethods")
  private java.util.List<String> paymentMethods = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("tabRole")
  private String tabRole = null;


  /**
   * appId.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * .
   * @return appId
   **/
  @Schema(description = "")
  public String getAppId() {
    return appId;
  }

  /**
   * setAppId.
   **/
  public void setAppId(String appId) {
    this.appId = appId;
  }


  /**
   * connectionInstanceId.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration connectionInstanceId(String connectionInstanceId) {
    this.connectionInstanceId = connectionInstanceId;
    return this;
  }

  /**
   * .
   * @return connectionInstanceId
   **/
  @Schema(description = "")
  public String getConnectionInstanceId() {
    return connectionInstanceId;
  }

  /**
   * setConnectionInstanceId.
   **/
  public void setConnectionInstanceId(String connectionInstanceId) {
    this.connectionInstanceId = connectionInstanceId;
  }


  /**
   * currency.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * .
   * @return currency
   **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  /**
   * setCurrency.
   **/
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * durationEnd.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration durationEnd(String durationEnd) {
    this.durationEnd = durationEnd;
    return this;
  }

  /**
   * .
   * @return durationEnd
   **/
  @Schema(description = "")
  public String getDurationEnd() {
    return durationEnd;
  }

  /**
   * setDurationEnd.
   **/
  public void setDurationEnd(String durationEnd) {
    this.durationEnd = durationEnd;
  }


  /**
   * durationStart.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration durationStart(String durationStart) {
    this.durationStart = durationStart;
    return this;
  }

  /**
   * .
   * @return durationStart
   **/
  @Schema(description = "")
  public String getDurationStart() {
    return durationStart;
  }

  /**
   * setDurationStart.
   **/
  public void setDurationStart(String durationStart) {
    this.durationStart = durationStart;
  }


  /**
   * lineItems.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration lineItems(java.util.List<ExtendPaymentLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }
  
  /**
   * addLineItemsItem.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration addLineItemsItem(ExtendPaymentLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new java.util.ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * .
   * @return lineItems
   **/
  @Schema(description = "")
  public java.util.List<ExtendPaymentLineItem> getLineItems() {
    return lineItems;
  }

  /**
   * setLineItems.
   **/
  public void setLineItems(java.util.List<ExtendPaymentLineItem> lineItems) {
    this.lineItems = lineItems;
  }


  /**
   * paymentDueDays.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration paymentDueDays(String paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
    return this;
  }

  /**
   * .
   * @return paymentDueDays
   **/
  @Schema(description = "")
  public String getPaymentDueDays() {
    return paymentDueDays;
  }

  /**
   * setPaymentDueDays.
   **/
  public void setPaymentDueDays(String paymentDueDays) {
    this.paymentDueDays = paymentDueDays;
  }


  /**
   * paymentMethods.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration paymentMethods(java.util.List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }
  
  /**
   * addPaymentMethodsItem.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new java.util.ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * .
   * @return paymentMethods
   **/
  @Schema(description = "")
  public java.util.List<String> getPaymentMethods() {
    return paymentMethods;
  }

  /**
   * setPaymentMethods.
   **/
  public void setPaymentMethods(java.util.List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  /**
   * paymentMode.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * .
   * @return paymentMode
   **/
  @Schema(description = "")
  public String getPaymentMode() {
    return paymentMode;
  }

  /**
   * setPaymentMode.
   **/
  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }


  /**
   * tabRole.
   *
   * @return ExtendPaymentConfiguration
   **/
  public ExtendPaymentConfiguration tabRole(String tabRole) {
    this.tabRole = tabRole;
    return this;
  }

  /**
   * .
   * @return tabRole
   **/
  @Schema(description = "")
  public String getTabRole() {
    return tabRole;
  }

  /**
   * setTabRole.
   **/
  public void setTabRole(String tabRole) {
    this.tabRole = tabRole;
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
    ExtendPaymentConfiguration extendPaymentConfiguration = (ExtendPaymentConfiguration) o;
    return Objects.equals(this.appId, extendPaymentConfiguration.appId) &&
        Objects.equals(this.connectionInstanceId, extendPaymentConfiguration.connectionInstanceId) &&
        Objects.equals(this.currency, extendPaymentConfiguration.currency) &&
        Objects.equals(this.durationEnd, extendPaymentConfiguration.durationEnd) &&
        Objects.equals(this.durationStart, extendPaymentConfiguration.durationStart) &&
        Objects.equals(this.lineItems, extendPaymentConfiguration.lineItems) &&
        Objects.equals(this.paymentDueDays, extendPaymentConfiguration.paymentDueDays) &&
        Objects.equals(this.paymentMethods, extendPaymentConfiguration.paymentMethods) &&
        Objects.equals(this.paymentMode, extendPaymentConfiguration.paymentMode) &&
        Objects.equals(this.tabRole, extendPaymentConfiguration.tabRole);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(appId, connectionInstanceId, currency, durationEnd, durationStart, lineItems, paymentDueDays, paymentMethods, paymentMode, tabRole);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendPaymentConfiguration {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    connectionInstanceId: ").append(toIndentedString(connectionInstanceId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    durationEnd: ").append(toIndentedString(durationEnd)).append("\n");
    sb.append("    durationStart: ").append(toIndentedString(durationStart)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    paymentDueDays: ").append(toIndentedString(paymentDueDays)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    tabRole: ").append(toIndentedString(tabRole)).append("\n");
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

