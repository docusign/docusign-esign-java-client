package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingPayment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines an billing payment response object.
 */
@ApiModel(description = "Defines an billing payment response object.")

public class BillingPaymentResponse {
  @JsonProperty("billingPayments")
  private java.util.List<BillingPayment> billingPayments = null;

  public BillingPaymentResponse billingPayments(java.util.List<BillingPayment> billingPayments) {
    this.billingPayments = billingPayments;
    return this;
  }

  public BillingPaymentResponse addBillingPaymentsItem(BillingPayment billingPaymentsItem) {
    if (this.billingPayments == null) {
      this.billingPayments = new java.util.ArrayList<BillingPayment>();
    }
    this.billingPayments.add(billingPaymentsItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPayments
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<BillingPayment> getBillingPayments() {
    return billingPayments;
  }

  public void setBillingPayments(java.util.List<BillingPayment> billingPayments) {
    this.billingPayments = billingPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPaymentResponse billingPaymentResponse = (BillingPaymentResponse) o;
    return Objects.equals(this.billingPayments, billingPaymentResponse.billingPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentResponse {\n");
    
    sb.append("    billingPayments: ").append(toIndentedString(billingPayments)).append("\n");
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

