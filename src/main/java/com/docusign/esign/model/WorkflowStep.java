package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DelayedRouting;
import com.docusign.esign.model.RecipientRouting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes a single step in a workflow..
 *
 */
@Schema(description = "Describes a single step in a workflow.")

public class WorkflowStep {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("completedDate")
  private String completedDate = null;

  @JsonProperty("delayedRouting")
  private DelayedRouting delayedRouting = null;

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


  /**
   * action.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep action(String action) {
    this.action = action;
    return this;
  }

  /**
   * .
   * @return action
   **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * completedDate.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep completedDate(String completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * .
   * @return completedDate
   **/
  @Schema(description = "")
  public String getCompletedDate() {
    return completedDate;
  }

  /**
   * setCompletedDate.
   **/
  public void setCompletedDate(String completedDate) {
    this.completedDate = completedDate;
  }


  /**
   * delayedRouting.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep delayedRouting(DelayedRouting delayedRouting) {
    this.delayedRouting = delayedRouting;
    return this;
  }

  /**
   * A complex element that specifies the delayed routing settings for the workflow step..
   * @return delayedRouting
   **/
  @Schema(description = "A complex element that specifies the delayed routing settings for the workflow step.")
  public DelayedRouting getDelayedRouting() {
    return delayedRouting;
  }

  /**
   * setDelayedRouting.
   **/
  public void setDelayedRouting(DelayedRouting delayedRouting) {
    this.delayedRouting = delayedRouting;
  }


  /**
   * itemId.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * .
   * @return itemId
   **/
  @Schema(description = "")
  public String getItemId() {
    return itemId;
  }

  /**
   * setItemId.
   **/
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  /**
   * recipientRouting.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep recipientRouting(RecipientRouting recipientRouting) {
    this.recipientRouting = recipientRouting;
    return this;
  }

  /**
   * The rules for recipient routing..
   * @return recipientRouting
   **/
  @Schema(description = "The rules for recipient routing.")
  public RecipientRouting getRecipientRouting() {
    return recipientRouting;
  }

  /**
   * setRecipientRouting.
   **/
  public void setRecipientRouting(RecipientRouting recipientRouting) {
    this.recipientRouting = recipientRouting;
  }


  /**
   * status.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * triggeredDate.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep triggeredDate(String triggeredDate) {
    this.triggeredDate = triggeredDate;
    return this;
  }

  /**
   * .
   * @return triggeredDate
   **/
  @Schema(description = "")
  public String getTriggeredDate() {
    return triggeredDate;
  }

  /**
   * setTriggeredDate.
   **/
  public void setTriggeredDate(String triggeredDate) {
    this.triggeredDate = triggeredDate;
  }


  /**
   * triggerOnItem.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep triggerOnItem(String triggerOnItem) {
    this.triggerOnItem = triggerOnItem;
    return this;
  }

  /**
   * .
   * @return triggerOnItem
   **/
  @Schema(description = "")
  public String getTriggerOnItem() {
    return triggerOnItem;
  }

  /**
   * setTriggerOnItem.
   **/
  public void setTriggerOnItem(String triggerOnItem) {
    this.triggerOnItem = triggerOnItem;
  }


  /**
   * workflowStepId.
   *
   * @return WorkflowStep
   **/
  public WorkflowStep workflowStepId(String workflowStepId) {
    this.workflowStepId = workflowStepId;
    return this;
  }

  /**
   * .
   * @return workflowStepId
   **/
  @Schema(description = "")
  public String getWorkflowStepId() {
    return workflowStepId;
  }

  /**
   * setWorkflowStepId.
   **/
  public void setWorkflowStepId(String workflowStepId) {
    this.workflowStepId = workflowStepId;
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
    WorkflowStep workflowStep = (WorkflowStep) o;
    return Objects.equals(this.action, workflowStep.action) &&
        Objects.equals(this.completedDate, workflowStep.completedDate) &&
        Objects.equals(this.delayedRouting, workflowStep.delayedRouting) &&
        Objects.equals(this.itemId, workflowStep.itemId) &&
        Objects.equals(this.recipientRouting, workflowStep.recipientRouting) &&
        Objects.equals(this.status, workflowStep.status) &&
        Objects.equals(this.triggeredDate, workflowStep.triggeredDate) &&
        Objects.equals(this.triggerOnItem, workflowStep.triggerOnItem) &&
        Objects.equals(this.workflowStepId, workflowStep.workflowStepId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(action, completedDate, delayedRouting, itemId, recipientRouting, status, triggeredDate, triggerOnItem, workflowStepId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStep {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    delayedRouting: ").append(toIndentedString(delayedRouting)).append("\n");
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

