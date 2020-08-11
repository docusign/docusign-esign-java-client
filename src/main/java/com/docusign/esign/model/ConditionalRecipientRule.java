package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConditionalRecipientRuleCondition;
import com.docusign.esign.model.RecipientGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConditionalRecipientRule
 */

public class ConditionalRecipientRule {
  @JsonProperty("conditions")
  private java.util.List<ConditionalRecipientRuleCondition> conditions = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("recipientGroup")
  private RecipientGroup recipientGroup = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  public ConditionalRecipientRule conditions(java.util.List<ConditionalRecipientRuleCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ConditionalRecipientRule addConditionsItem(ConditionalRecipientRuleCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new java.util.ArrayList<ConditionalRecipientRuleCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * 
   * @return conditions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ConditionalRecipientRuleCondition> getConditions() {
    return conditions;
  }

  public void setConditions(java.util.List<ConditionalRecipientRuleCondition> conditions) {
    this.conditions = conditions;
  }

  public ConditionalRecipientRule order(String order) {
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @ApiModelProperty(value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ConditionalRecipientRule recipientGroup(RecipientGroup recipientGroup) {
    this.recipientGroup = recipientGroup;
    return this;
  }

   /**
   * Get recipientGroup
   * @return recipientGroup
  **/
  @ApiModelProperty(value = "")
  public RecipientGroup getRecipientGroup() {
    return recipientGroup;
  }

  public void setRecipientGroup(RecipientGroup recipientGroup) {
    this.recipientGroup = recipientGroup;
  }

  public ConditionalRecipientRule recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalRecipientRule conditionalRecipientRule = (ConditionalRecipientRule) o;
    return Objects.equals(this.conditions, conditionalRecipientRule.conditions) &&
        Objects.equals(this.order, conditionalRecipientRule.order) &&
        Objects.equals(this.recipientGroup, conditionalRecipientRule.recipientGroup) &&
        Objects.equals(this.recipientId, conditionalRecipientRule.recipientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, order, recipientGroup, recipientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalRecipientRule {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    recipientGroup: ").append(toIndentedString(recipientGroup)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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

