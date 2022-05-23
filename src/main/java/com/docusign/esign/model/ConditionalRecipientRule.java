package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ConditionalRecipientRule. */
public class ConditionalRecipientRule {
  @JsonProperty("conditions")
  private java.util.List<ConditionalRecipientRuleCondition> conditions = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("recipientGroup")
  private RecipientGroup recipientGroup = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  /**
   * conditions.
   *
   * @return ConditionalRecipientRule
   */
  public ConditionalRecipientRule conditions(
      java.util.List<ConditionalRecipientRuleCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * addConditionsItem.
   *
   * @return ConditionalRecipientRule
   */
  public ConditionalRecipientRule addConditionsItem(
      ConditionalRecipientRuleCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new java.util.ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * .
   *
   * @return conditions
   */
  @ApiModelProperty(value = "")
  public java.util.List<ConditionalRecipientRuleCondition> getConditions() {
    return conditions;
  }

  /** setConditions. */
  public void setConditions(java.util.List<ConditionalRecipientRuleCondition> conditions) {
    this.conditions = conditions;
  }

  /**
   * order.
   *
   * @return ConditionalRecipientRule
   */
  public ConditionalRecipientRule order(String order) {
    this.order = order;
    return this;
  }

  /**
   * .
   *
   * @return order
   */
  @ApiModelProperty(value = "")
  public String getOrder() {
    return order;
  }

  /** setOrder. */
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * recipientGroup.
   *
   * @return ConditionalRecipientRule
   */
  public ConditionalRecipientRule recipientGroup(RecipientGroup recipientGroup) {
    this.recipientGroup = recipientGroup;
    return this;
  }

  /**
   * Get recipientGroup.
   *
   * @return recipientGroup
   */
  @ApiModelProperty(value = "")
  public RecipientGroup getRecipientGroup() {
    return recipientGroup;
  }

  /** setRecipientGroup. */
  public void setRecipientGroup(RecipientGroup recipientGroup) {
    this.recipientGroup = recipientGroup;
  }

  /**
   * recipientId.
   *
   * @return ConditionalRecipientRule
   */
  public ConditionalRecipientRule recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign
   * the Document..
   *
   * @return recipientId
   */
  @ApiModelProperty(
      value =
          "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /** setRecipientId. */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
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
    ConditionalRecipientRule conditionalRecipientRule = (ConditionalRecipientRule) o;
    return Objects.equals(this.conditions, conditionalRecipientRule.conditions)
        && Objects.equals(this.order, conditionalRecipientRule.order)
        && Objects.equals(this.recipientGroup, conditionalRecipientRule.recipientGroup)
        && Objects.equals(this.recipientId, conditionalRecipientRule.recipientId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(conditions, order, recipientGroup, recipientId);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
