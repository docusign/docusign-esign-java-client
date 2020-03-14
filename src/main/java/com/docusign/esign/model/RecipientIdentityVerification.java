package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.RecipientIdentityInputOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientIdentityVerification
 */

public class RecipientIdentityVerification {
  @JsonProperty("inputOptions")
  private java.util.List<RecipientIdentityInputOption> inputOptions = new java.util.ArrayList<RecipientIdentityInputOption>();

  @JsonProperty("workflowId")
  private String workflowId = null;

  public RecipientIdentityVerification inputOptions(java.util.List<RecipientIdentityInputOption> inputOptions) {
    this.inputOptions = inputOptions;
    return this;
  }

  public RecipientIdentityVerification addInputOptionsItem(RecipientIdentityInputOption inputOptionsItem) {
    this.inputOptions.add(inputOptionsItem);
    return this;
  }

   /**
   * 
   * @return inputOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<RecipientIdentityInputOption> getInputOptions() {
    return inputOptions;
  }

  public void setInputOptions(java.util.List<RecipientIdentityInputOption> inputOptions) {
    this.inputOptions = inputOptions;
  }

  public RecipientIdentityVerification workflowId(String workflowId) {
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
    RecipientIdentityVerification recipientIdentityVerification = (RecipientIdentityVerification) o;
    return Objects.equals(this.inputOptions, recipientIdentityVerification.inputOptions) &&
        Objects.equals(this.workflowId, recipientIdentityVerification.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputOptions, workflowId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientIdentityVerification {\n");
    
    sb.append("    inputOptions: ").append(toIndentedString(inputOptions)).append("\n");
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

