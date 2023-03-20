package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about a preview billing plan..
 *
 */
@Schema(description = "Contains information about a preview billing plan.")

public class BillingPlanPreview {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("invoice")
  private BillingInvoice invoice = null;

  @JsonProperty("isProrated")
  private String isProrated = null;

  @JsonProperty("subtotalAmount")
  private String subtotalAmount = null;

  @JsonProperty("taxAmount")
  private String taxAmount = null;

  @JsonProperty("totalAmount")
  private String totalAmount = null;


  /**
   * currencyCode.
   *
   * @return BillingPlanPreview
   **/
  public BillingPlanPreview currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Specifies the ISO currency code for the account..
   * @return currencyCode
   **/
  @Schema(description = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * setCurrencyCode.
   **/
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  /**
   * invoice.
   *
   * @return BillingPlanPreview
   **/
  public BillingPlanPreview invoice(BillingInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * .
   * @return invoice
   **/
  @Schema(description = "")
  public BillingInvoice getInvoice() {
    return invoice;
  }

  /**
   * setInvoice.
   **/
  public void setInvoice(BillingInvoice invoice) {
    this.invoice = invoice;
  }


  /**
   * isProrated.
   *
   * @return BillingPlanPreview
   **/
  public BillingPlanPreview isProrated(String isProrated) {
    this.isProrated = isProrated;
    return this;
  }

  /**
   * .
   * @return isProrated
   **/
  @Schema(description = "")
  public String getIsProrated() {
    return isProrated;
  }

  /**
   * setIsProrated.
   **/
  public void setIsProrated(String isProrated) {
    this.isProrated = isProrated;
  }


  /**
   * subtotalAmount.
   *
   * @return BillingPlanPreview
   **/
  public BillingPlanPreview subtotalAmount(String subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
    return this;
  }

  /**
   * .
   * @return subtotalAmount
   **/
  @Schema(description = "")
  public String getSubtotalAmount() {
    return subtotalAmount;
  }

  /**
   * setSubtotalAmount.
   **/
  public void setSubtotalAmount(String subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }


  /**
   * taxAmount.
   *
   * @return BillingPlanPreview
   **/
  public BillingPlanPreview taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * .
   * @return taxAmount
   **/
  @Schema(description = "")
  public String getTaxAmount() {
    return taxAmount;
  }

  /**
   * setTaxAmount.
   **/
  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }


  /**
   * totalAmount.
   *
   * @return BillingPlanPreview
   **/
  public BillingPlanPreview totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * .
   * @return totalAmount
   **/
  @Schema(description = "")
  public String getTotalAmount() {
    return totalAmount;
  }

  /**
   * setTotalAmount.
   **/
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
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
    BillingPlanPreview billingPlanPreview = (BillingPlanPreview) o;
    return Objects.equals(this.currencyCode, billingPlanPreview.currencyCode) &&
        Objects.equals(this.invoice, billingPlanPreview.invoice) &&
        Objects.equals(this.isProrated, billingPlanPreview.isProrated) &&
        Objects.equals(this.subtotalAmount, billingPlanPreview.subtotalAmount) &&
        Objects.equals(this.taxAmount, billingPlanPreview.taxAmount) &&
        Objects.equals(this.totalAmount, billingPlanPreview.totalAmount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, invoice, isProrated, subtotalAmount, taxAmount, totalAmount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanPreview {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    isProrated: ").append(toIndentedString(isProrated)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

