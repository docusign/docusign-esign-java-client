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
 * Defines a billing plan response object..
 *
 */
@ApiModel(description = "Defines a billing plan response object.")

public class BillingPlanResponse {
  @JsonProperty("billingPlan")
  private BillingPlan billingPlan = null;

  @JsonProperty("successorPlans")
  private java.util.List<BillingPlan> successorPlans = null;


  /**
   * billingPlan.
   *
   * @return BillingPlanResponse
   **/
  public BillingPlanResponse billingPlan(BillingPlan billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

  /**
   * Get billingPlan.
   * @return billingPlan
   **/
  @ApiModelProperty(value = "")
  public BillingPlan getBillingPlan() {
    return billingPlan;
  }

  /**
   * setBillingPlan.
   **/
  public void setBillingPlan(BillingPlan billingPlan) {
    this.billingPlan = billingPlan;
  }


  /**
   * successorPlans.
   *
   * @return BillingPlanResponse
   **/
  public BillingPlanResponse successorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
    return this;
  }
  
  /**
   * addSuccessorPlansItem.
   *
   * @return BillingPlanResponse
   **/
  public BillingPlanResponse addSuccessorPlansItem(BillingPlan successorPlansItem) {
    if (this.successorPlans == null) {
      this.successorPlans = new java.util.ArrayList<BillingPlan>();
    }
    this.successorPlans.add(successorPlansItem);
    return this;
  }

  /**
   * .
   * @return successorPlans
   **/
  @ApiModelProperty(value = "")
  public java.util.List<BillingPlan> getSuccessorPlans() {
    return successorPlans;
  }

  /**
   * setSuccessorPlans.
   **/
  public void setSuccessorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
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
    BillingPlanResponse billingPlanResponse = (BillingPlanResponse) o;
    return Objects.equals(this.billingPlan, billingPlanResponse.billingPlan) &&
        Objects.equals(this.successorPlans, billingPlanResponse.successorPlans);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(billingPlan, successorPlans);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanResponse {\n");
    
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("    successorPlans: ").append(toIndentedString(successorPlans)).append("\n");
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

