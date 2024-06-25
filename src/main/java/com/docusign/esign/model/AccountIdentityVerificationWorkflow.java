package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountIdentityInputOption;
import com.docusign.esign.model.AccountIdentityVerificationStep;
import com.docusign.esign.model.AccountSignatureProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Specifies an Identity Verification workflow..
 *
 */
@Schema(description = "Specifies an Identity Verification workflow.")

public class AccountIdentityVerificationWorkflow implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("defaultDescription")
  private String defaultDescription = null;

  @JsonProperty("defaultName")
  private String defaultName = null;

  @JsonProperty("inputOptions")
  private java.util.List<AccountIdentityInputOption> inputOptions = null;

  @JsonProperty("isDisabled")
  private String isDisabled = null;

  @JsonProperty("ownerType")
  private String ownerType = null;

  @JsonProperty("signatureProvider")
  private AccountSignatureProvider signatureProvider = null;

  @JsonProperty("steps")
  private java.util.List<AccountIdentityVerificationStep> steps = null;

  @JsonProperty("workflowId")
  private String workflowId = null;

  @JsonProperty("workflowLabel")
  private String workflowLabel = null;

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
  @Schema(description = "")
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
  @Schema(description = "")
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
      this.inputOptions = new java.util.ArrayList<>();
    }
    this.inputOptions.add(inputOptionsItem);
    return this;
  }

  /**
   * .
   * @return inputOptions
   **/
  @Schema(description = "")
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
   * isDisabled.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow isDisabled(String isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * .
   * @return isDisabled
   **/
  @Schema(description = "")
  public String getIsDisabled() {
    return isDisabled;
  }

  /**
   * setIsDisabled.
   **/
  public void setIsDisabled(String isDisabled) {
    this.isDisabled = isDisabled;
  }


  /**
   * ownerType.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow ownerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * .
   * @return ownerType
   **/
  @Schema(description = "")
  public String getOwnerType() {
    return ownerType;
  }

  /**
   * setOwnerType.
   **/
  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
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
   * The signature provider associated with the Identity Verification workflow..
   * @return signatureProvider
   **/
  @Schema(description = "The signature provider associated with the Identity Verification workflow.")
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
      this.steps = new java.util.ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * .
   * @return steps
   **/
  @Schema(description = "")
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
  @Schema(description = "")
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
   * workflowLabel.
   *
   * @return AccountIdentityVerificationWorkflow
   **/
  public AccountIdentityVerificationWorkflow workflowLabel(String workflowLabel) {
    this.workflowLabel = workflowLabel;
    return this;
  }

  /**
   * .
   * @return workflowLabel
   **/
  @Schema(description = "")
  public String getWorkflowLabel() {
    return workflowLabel;
  }

  /**
   * setWorkflowLabel.
   **/
  public void setWorkflowLabel(String workflowLabel) {
    this.workflowLabel = workflowLabel;
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
  @Schema(description = "")
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
        Objects.equals(this.isDisabled, accountIdentityVerificationWorkflow.isDisabled) &&
        Objects.equals(this.ownerType, accountIdentityVerificationWorkflow.ownerType) &&
        Objects.equals(this.signatureProvider, accountIdentityVerificationWorkflow.signatureProvider) &&
        Objects.equals(this.steps, accountIdentityVerificationWorkflow.steps) &&
        Objects.equals(this.workflowId, accountIdentityVerificationWorkflow.workflowId) &&
        Objects.equals(this.workflowLabel, accountIdentityVerificationWorkflow.workflowLabel) &&
        Objects.equals(this.workflowResourceKey, accountIdentityVerificationWorkflow.workflowResourceKey);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(defaultDescription, defaultName, inputOptions, isDisabled, ownerType, signatureProvider, steps, workflowId, workflowLabel, workflowResourceKey);
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
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    signatureProvider: ").append(toIndentedString(signatureProvider)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowLabel: ").append(toIndentedString(workflowLabel)).append("\n");
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

