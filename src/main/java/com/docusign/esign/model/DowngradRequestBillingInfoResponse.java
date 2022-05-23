package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DowngradRequestBillingInfoResponse. */
public class DowngradRequestBillingInfoResponse {
  @JsonProperty("downgradePlanInformation")
  private DowngradePlanUpdateResponse downgradePlanInformation = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  /**
   * downgradePlanInformation.
   *
   * @return DowngradRequestBillingInfoResponse
   */
  public DowngradRequestBillingInfoResponse downgradePlanInformation(
      DowngradePlanUpdateResponse downgradePlanInformation) {
    this.downgradePlanInformation = downgradePlanInformation;
    return this;
  }

  /**
   * Get downgradePlanInformation.
   *
   * @return downgradePlanInformation
   */
  @ApiModelProperty(value = "")
  public DowngradePlanUpdateResponse getDowngradePlanInformation() {
    return downgradePlanInformation;
  }

  /** setDowngradePlanInformation. */
  public void setDowngradePlanInformation(DowngradePlanUpdateResponse downgradePlanInformation) {
    this.downgradePlanInformation = downgradePlanInformation;
  }

  /**
   * paymentMethod.
   *
   * @return DowngradRequestBillingInfoResponse
   */
  public DowngradRequestBillingInfoResponse paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * .
   *
   * @return paymentMethod
   */
  @ApiModelProperty(value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  /** setPaymentMethod. */
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
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
    DowngradRequestBillingInfoResponse downgradRequestBillingInfoResponse =
        (DowngradRequestBillingInfoResponse) o;
    return Objects.equals(
            this.downgradePlanInformation,
            downgradRequestBillingInfoResponse.downgradePlanInformation)
        && Objects.equals(this.paymentMethod, downgradRequestBillingInfoResponse.paymentMethod);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(downgradePlanInformation, paymentMethod);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradRequestBillingInfoResponse {\n");

    sb.append("    downgradePlanInformation: ")
        .append(toIndentedString(downgradePlanInformation))
        .append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
