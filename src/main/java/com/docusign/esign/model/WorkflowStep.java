package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientRouting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WorkflowStep
 */

public class WorkflowStep {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("completedDate")
  private String completedDate = null;

  @JsonProperty("itemId")
  private String itemId = null;

  @JsonProperty("recipientRouting")
  private RecipientRouting recipientRouting = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("triggeredDate")
  private String triggeredDate = null;

  @JsonProperty("triggerOnItem")
  private String triggerOnItem = null;

  @JsonProperty("workflowStepId")
  private String workflowStepId = null;

  public WorkflowStep action(String action) {
    this.action = action;
    return this;
  }

   /**
   * 
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public WorkflowStep completedDate(String completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * 
   * @return completedDate
  **/
  @ApiModelProperty(value = "")
  public String getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(String completedDate) {
    this.completedDate = completedDate;
  }

  public WorkflowStep itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public WorkflowStep recipientRouting(RecipientRouting recipientRouting) {
    this.recipientRouting = recipientRouting;
    return this;
  }

   /**
   * Get recipientRouting
   * @return recipientRouting
  **/
  @ApiModelProperty(value = "")
  public RecipientRouting getRecipientRouting() {
    return recipientRouting;
  }

  public void setRecipientRouting(RecipientRouting recipientRouting) {
    this.recipientRouting = recipientRouting;
  }

  public WorkflowStep status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WorkflowStep triggeredDate(String triggeredDate) {
    this.triggeredDate = triggeredDate;
    return this;
  }

   /**
   * 
   * @return triggeredDate
  **/
  @ApiModelProperty(value = "")
  public String getTriggeredDate() {
    return triggeredDate;
  }

  public void setTriggeredDate(String triggeredDate) {
    this.triggeredDate = triggeredDate;
  }

  public WorkflowStep triggerOnItem(String triggerOnItem) {
    this.triggerOnItem = triggerOnItem;
    return this;
  }

   /**
   * 
   * @return triggerOnItem
  **/
  @ApiModelProperty(value = "")
  public String getTriggerOnItem() {
    return triggerOnItem;
  }

  public void setTriggerOnItem(String triggerOnItem) {
    this.triggerOnItem = triggerOnItem;
  }

  public WorkflowStep workflowStepId(String workflowStepId) {
    this.workflowStepId = workflowStepId;
    return this;
  }

   /**
   * 
   * @return workflowStepId
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowStepId() {
    return workflowStepId;
  }

  public void setWorkflowStepId(String workflowStepId) {
    this.workflowStepId = workflowStepId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStep workflowStep = (WorkflowStep) o;
    return Objects.equals(this.action, workflowStep.action) &&
        Objects.equals(this.completedDate, workflowStep.completedDate) &&
        Objects.equals(this.itemId, workflowStep.itemId) &&
        Objects.equals(this.recipientRouting, workflowStep.recipientRouting) &&
        Objects.equals(this.status, workflowStep.status) &&
        Objects.equals(this.triggeredDate, workflowStep.triggeredDate) &&
        Objects.equals(this.triggerOnItem, workflowStep.triggerOnItem) &&
        Objects.equals(this.workflowStepId, workflowStep.workflowStepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, completedDate, itemId, recipientRouting, status, triggeredDate, triggerOnItem, workflowStepId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStep {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    recipientRouting: ").append(toIndentedString(recipientRouting)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggeredDate: ").append(toIndentedString(triggeredDate)).append("\n");
    sb.append("    triggerOnItem: ").append(toIndentedString(triggerOnItem)).append("\n");
    sb.append("    workflowStepId: ").append(toIndentedString(workflowStepId)).append("\n");
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

