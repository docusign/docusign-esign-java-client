package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingPlan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Defines a billing plan response object.
 **/

@ApiModel(description = "Defines a billing plan response object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BillingPlanResponse   {
  
  private BillingPlan billingPlan = null;
  private java.util.List<BillingPlan> successorPlans = new java.util.ArrayList<BillingPlan>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingPlan")
  public BillingPlan getBillingPlan() {
    return billingPlan;
  }
  public void setBillingPlan(BillingPlan billingPlan) {
    this.billingPlan = billingPlan;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("successorPlans")
  public java.util.List<BillingPlan> getSuccessorPlans() {
    return successorPlans;
  }
  public void setSuccessorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanResponse billingPlanResponse = (BillingPlanResponse) o;

    return true && Objects.equals(billingPlan, billingPlanResponse.billingPlan) &&
        Objects.equals(successorPlans, billingPlanResponse.successorPlans)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPlan, successorPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanResponse {\n");
    
    if (billingPlan != null)
      sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    if (successorPlans != null)
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

