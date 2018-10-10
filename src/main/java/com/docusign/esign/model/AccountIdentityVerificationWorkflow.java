package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountIdentityVerificationStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountIdentityVerificationWorkflow
 */

public class AccountIdentityVerificationWorkflow {
  @JsonProperty("defaultName")
  private String defaultName = null;

  @JsonProperty("steps")
  private java.util.List<AccountIdentityVerificationStep> steps = new java.util.ArrayList<AccountIdentityVerificationStep>();

  @JsonProperty("workflowId")
  private String workflowId = null;

  public AccountIdentityVerificationWorkflow defaultName(String defaultName) {
    this.defaultName = defaultName;
    return this;
  }

   /**
   * 
   * @return defaultName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultName() {
    return defaultName;
  }

  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }

  public AccountIdentityVerificationWorkflow steps(java.util.List<AccountIdentityVerificationStep> steps) {
    this.steps = steps;
    return this;
  }

  public AccountIdentityVerificationWorkflow addStepsItem(AccountIdentityVerificationStep stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * 
   * @return steps
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<AccountIdentityVerificationStep> getSteps() {
    return steps;
  }

  public void setSteps(java.util.List<AccountIdentityVerificationStep> steps) {
    this.steps = steps;
  }

  public AccountIdentityVerificationWorkflow workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * 
   * @return workflowId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentityVerificationWorkflow accountIdentityVerificationWorkflow = (AccountIdentityVerificationWorkflow) o;
    return Objects.equals(this.defaultName, accountIdentityVerificationWorkflow.defaultName) &&
        Objects.equals(this.steps, accountIdentityVerificationWorkflow.steps) &&
        Objects.equals(this.workflowId, accountIdentityVerificationWorkflow.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultName, steps, workflowId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityVerificationWorkflow {\n");
    
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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

