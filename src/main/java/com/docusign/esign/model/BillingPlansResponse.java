package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingPlan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines a billing plans response object.
 */
@ApiModel(description = "Defines a billing plans response object.")

public class BillingPlansResponse {
  @JsonProperty("billingPlans")
  private java.util.List<BillingPlan> billingPlans = null;

  public BillingPlansResponse billingPlans(java.util.List<BillingPlan> billingPlans) {
    this.billingPlans = billingPlans;
    return this;
  }

  public BillingPlansResponse addBillingPlansItem(BillingPlan billingPlansItem) {
    if (this.billingPlans == null) {
      this.billingPlans = new java.util.ArrayList<BillingPlan>();
    }
    this.billingPlans.add(billingPlansItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingPlans
  **/
  @ApiModelProperty(value = "Reserved: TBD")
  public java.util.List<BillingPlan> getBillingPlans() {
    return billingPlans;
  }

  public void setBillingPlans(java.util.List<BillingPlan> billingPlans) {
    this.billingPlans = billingPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlansResponse billingPlansResponse = (BillingPlansResponse) o;
    return Objects.equals(this.billingPlans, billingPlansResponse.billingPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlansResponse {\n");
    
    sb.append("    billingPlans: ").append(toIndentedString(billingPlans)).append("\n");
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

