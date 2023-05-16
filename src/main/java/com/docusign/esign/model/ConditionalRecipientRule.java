package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConditionalRecipientRuleCondition;
import com.docusign.esign.model.RecipientGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A rule that defines a set of recipients and the conditions under which they will be used for the envelope..
 *
 */
@Schema(description = "A rule that defines a set of recipients and the conditions under which they will be used for the envelope.")

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
   **/
  public ConditionalRecipientRule conditions(java.util.List<ConditionalRecipientRuleCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  /**
   * addConditionsItem.
   *
   * @return ConditionalRecipientRule
   **/
  public ConditionalRecipientRule addConditionsItem(ConditionalRecipientRuleCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new java.util.ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * .
   * @return conditions
   **/
  @Schema(description = "")
  public java.util.List<ConditionalRecipientRuleCondition> getConditions() {
    return conditions;
  }

  /**
   * setConditions.
   **/
  public void setConditions(java.util.List<ConditionalRecipientRuleCondition> conditions) {
    this.conditions = conditions;
  }


  /**
   * order.
   *
   * @return ConditionalRecipientRule
   **/
  public ConditionalRecipientRule order(String order) {
    this.order = order;
    return this;
  }

  /**
   * .
   * @return order
   **/
  @Schema(description = "")
  public String getOrder() {
    return order;
  }

  /**
   * setOrder.
   **/
  public void setOrder(String order) {
    this.order = order;
  }


  /**
   * recipientGroup.
   *
   * @return ConditionalRecipientRule
   **/
  public ConditionalRecipientRule recipientGroup(RecipientGroup recipientGroup) {
    this.recipientGroup = recipientGroup;
    return this;
  }

  /**
   * A set of recipients that may be used for the envelope, depending on the `conditions` defined..
   * @return recipientGroup
   **/
  @Schema(description = "A set of recipients that may be used for the envelope, depending on the `conditions` defined.")
  public RecipientGroup getRecipientGroup() {
    return recipientGroup;
  }

  /**
   * setRecipientGroup.
   **/
  public void setRecipientGroup(RecipientGroup recipientGroup) {
    this.recipientGroup = recipientGroup;
  }


  /**
   * recipientId.
   *
   * @return ConditionalRecipientRule
   **/
  public ConditionalRecipientRule recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @Schema(description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
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
    return Objects.equals(this.conditions, conditionalRecipientRule.conditions) &&
        Objects.equals(this.order, conditionalRecipientRule.order) &&
        Objects.equals(this.recipientGroup, conditionalRecipientRule.recipientGroup) &&
        Objects.equals(this.recipientId, conditionalRecipientRule.recipientId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(conditions, order, recipientGroup, recipientId);
  }


  /**
   * Converts the given object to string.
   */
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

