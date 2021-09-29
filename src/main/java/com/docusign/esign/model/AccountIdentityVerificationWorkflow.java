package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountIdentityInputOption;
import com.docusign.esign.model.AccountIdentityVerificationStep;
import com.docusign.esign.model.AccountSignatureProvider;
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
  @JsonProperty("defaultDescription")
  private String defaultDescription = null;

  @JsonProperty("defaultName")
  private String defaultName = null;

  @JsonProperty("inputOptions")
  private java.util.List<AccountIdentityInputOption> inputOptions = null;

  @JsonProperty("signatureProvider")
  private AccountSignatureProvider signatureProvider = null;

  @JsonProperty("steps")
  private java.util.List<AccountIdentityVerificationStep> steps = null;

  @JsonProperty("workflowId")
  private String workflowId = null;

  @JsonProperty("workflowResourceKey")
  private String workflowResourceKey = null;


  /**
   * defaultDescription.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow defaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
    return this;
  }

  /**
   * .
   * @return defaultDescription
   **/
  @ApiModelProperty(value = "")
  public String getDefaultDescription() {
    return defaultDescription;
  }

  /**
   * setDefaultDescription.
   **/
  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }


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
   * inputOptions.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow inputOptions(java.util.List<AccountIdentityInputOption> inputOptions) {
    this.inputOptions = inputOptions;
    return this;
  }
  
  /**
   * addInputOptionsItem.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow addInputOptionsItem(AccountIdentityInputOption inputOptionsItem) {
    if (this.inputOptions == null) {
      this.inputOptions = new java.util.ArrayList<AccountIdentityInputOption>();
    }
    this.inputOptions.add(inputOptionsItem);
    return this;
  }

  /**
   * .
   * @return inputOptions
   **/
  @ApiModelProperty(value = "")
  public java.util.List<AccountIdentityInputOption> getInputOptions() {
    return inputOptions;
  }

  /**
   * setInputOptions.
   **/
  public void setInputOptions(java.util.List<AccountIdentityInputOption> inputOptions) {
    this.inputOptions = inputOptions;
  }


  /**
   * signatureProvider.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow signatureProvider(AccountSignatureProvider signatureProvider) {
    this.signatureProvider = signatureProvider;
    return this;
  }

  /**
   * Get signatureProvider.
   * @return signatureProvider
   **/
  @ApiModelProperty(value = "")
  public AccountSignatureProvider getSignatureProvider() {
    return signatureProvider;
  }

  /**
   * setSignatureProvider.
   **/
  public void setSignatureProvider(AccountSignatureProvider signatureProvider) {
    this.signatureProvider = signatureProvider;
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
   * workflowResourceKey.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow workflowResourceKey(String workflowResourceKey) {
    this.workflowResourceKey = workflowResourceKey;
    return this;
  }

  /**
   * .
   * @return workflowResourceKey
   **/
  @ApiModelProperty(value = "")
  public String getWorkflowResourceKey() {
    return workflowResourceKey;
  }

  /**
   * setWorkflowResourceKey.
   **/
  public void setWorkflowResourceKey(String workflowResourceKey) {
    this.workflowResourceKey = workflowResourceKey;
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
    return Objects.equals(this.defaultDescription, accountIdentityVerificationWorkflow.defaultDescription) &&
        Objects.equals(this.defaultName, accountIdentityVerificationWorkflow.defaultName) &&
        Objects.equals(this.inputOptions, accountIdentityVerificationWorkflow.inputOptions) &&
        Objects.equals(this.signatureProvider, accountIdentityVerificationWorkflow.signatureProvider) &&
        Objects.equals(this.steps, accountIdentityVerificationWorkflow.steps) &&
        Objects.equals(this.workflowId, accountIdentityVerificationWorkflow.workflowId) &&
        Objects.equals(this.workflowResourceKey, accountIdentityVerificationWorkflow.workflowResourceKey);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(defaultDescription, defaultName, inputOptions, signatureProvider, steps, workflowId, workflowResourceKey);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityVerificationWorkflow {\n");
    
    sb.append("    defaultDescription: ").append(toIndentedString(defaultDescription)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    inputOptions: ").append(toIndentedString(inputOptions)).append("\n");
    sb.append("    signatureProvider: ").append(toIndentedString(signatureProvider)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowResourceKey: ").append(toIndentedString(workflowResourceKey)).append("\n");
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

