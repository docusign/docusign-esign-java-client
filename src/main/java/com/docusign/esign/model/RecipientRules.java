package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConditionalRecipientRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientRules
 */

public class RecipientRules {
  @JsonProperty("conditionalRecipients")
  private java.util.List<ConditionalRecipientRule> conditionalRecipients = null;

  public RecipientRules conditionalRecipients(java.util.List<ConditionalRecipientRule> conditionalRecipients) {
    this.conditionalRecipients = conditionalRecipients;
    return this;
  }

  public RecipientRules addConditionalRecipientsItem(ConditionalRecipientRule conditionalRecipientsItem) {
    if (this.conditionalRecipients == null) {
      this.conditionalRecipients = new java.util.ArrayList<ConditionalRecipientRule>();
    }
    this.conditionalRecipients.add(conditionalRecipientsItem);
    return this;
  }

   /**
   * 
   * @return conditionalRecipients
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ConditionalRecipientRule> getConditionalRecipients() {
    return conditionalRecipients;
  }

  public void setConditionalRecipients(java.util.List<ConditionalRecipientRule> conditionalRecipients) {
    this.conditionalRecipients = conditionalRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientRules recipientRules = (RecipientRules) o;
    return Objects.equals(this.conditionalRecipients, recipientRules.conditionalRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientRules {\n");
    
    sb.append("    conditionalRecipients: ").append(toIndentedString(conditionalRecipients)).append("\n");
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

