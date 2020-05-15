package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PlanInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DowngradeBillingPlanInformation
 */

public class DowngradeBillingPlanInformation {
  @JsonProperty("downgradeEventType")
  private String downgradeEventType = null;

  @JsonProperty("planInformation")
  private PlanInformation planInformation = null;

  public DowngradeBillingPlanInformation downgradeEventType(String downgradeEventType) {
    this.downgradeEventType = downgradeEventType;
    return this;
  }

   /**
   * 
   * @return downgradeEventType
  **/
  @ApiModelProperty(value = "")
  public String getDowngradeEventType() {
    return downgradeEventType;
  }

  public void setDowngradeEventType(String downgradeEventType) {
    this.downgradeEventType = downgradeEventType;
  }

  public DowngradeBillingPlanInformation planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(value = "")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowngradeBillingPlanInformation downgradeBillingPlanInformation = (DowngradeBillingPlanInformation) o;
    return Objects.equals(this.downgradeEventType, downgradeBillingPlanInformation.downgradeEventType) &&
        Objects.equals(this.planInformation, downgradeBillingPlanInformation.planInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downgradeEventType, planInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowngradeBillingPlanInformation {\n");
    
    sb.append("    downgradeEventType: ").append(toIndentedString(downgradeEventType)).append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
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

