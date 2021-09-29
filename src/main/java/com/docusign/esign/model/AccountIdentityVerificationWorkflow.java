package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountIdentityVerificationStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountIdentityVerificationWorkflow.
 *
 */

public class AccountIdentityVerificationWorkflow {
  @JsonProperty("defaultName")
  private String defaultName = null;

  @JsonProperty("steps")
  private java.util.List<AccountIdentityVerificationStep> steps = null;

  @JsonProperty("workflowId")
  private String workflowId = null;


  /**
   * defaultName.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow defaultName(String defaultName) {
    this.defaultName = defaultName;
    return this;
  }

  /**
   * .
   * @return defaultName
   **/
  @ApiModelProperty(value = "")
  public String getDefaultName() {
    return defaultName;
  }

  /**
   * setDefaultName.
   **/
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }


  /**
   * steps.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow steps(java.util.List<AccountIdentityVerificationStep> steps) {
    this.steps = steps;
    return this;
  }
  
  /**
   * addStepsItem.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow addStepsItem(AccountIdentityVerificationStep stepsItem) {
    if (this.steps == null) {
      this.steps = new java.util.ArrayList<AccountIdentityVerificationStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * .
   * @return steps
   **/
  @ApiModelProperty(value = "")
  public java.util.List<AccountIdentityVerificationStep> getSteps() {
    return steps;
  }

  /**
   * setSteps.
   **/
  public void setSteps(java.util.List<AccountIdentityVerificationStep> steps) {
    this.steps = steps;
  }


  /**
   * workflowId.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * .
   * @return workflowId
   **/
  @ApiModelProperty(value = "")
  public String getWorkflowId() {
    return workflowId;
  }

  /**
   * setWorkflowId.
   **/
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
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
    AccountIdentityVerificationWorkflow accountIdentityVerificationWorkflow = (AccountIdentityVerificationWorkflow) o;
    return Objects.equals(this.defaultName, accountIdentityVerificationWorkflow.defaultName) &&
        Objects.equals(this.steps, accountIdentityVerificationWorkflow.steps) &&
        Objects.equals(this.workflowId, accountIdentityVerificationWorkflow.workflowId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(defaultName, steps, workflowId);
  }


  /**
   * Converts the given object to string.
   */
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

