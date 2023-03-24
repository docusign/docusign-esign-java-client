package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConditionalRecipientRuleFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ConditionalRecipientRuleCondition.
 *
 */

public class ConditionalRecipientRuleCondition {
  @JsonProperty("filters")
  private java.util.List<ConditionalRecipientRuleFilter> filters = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("recipientLabel")
  private String recipientLabel = null;


  /**
   * filters.
   *
   * @return ConditionalRecipientRuleCondition
   **/
  public ConditionalRecipientRuleCondition filters(java.util.List<ConditionalRecipientRuleFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  /**
   * addFiltersItem.
   *
   * @return ConditionalRecipientRuleCondition
   **/
  public ConditionalRecipientRuleCondition addFiltersItem(ConditionalRecipientRuleFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * .
   * @return filters
   **/
  @Schema(description = "")
  public java.util.List<ConditionalRecipientRuleFilter> getFilters() {
    return filters;
  }

  /**
   * setFilters.
   **/
  public void setFilters(java.util.List<ConditionalRecipientRuleFilter> filters) {
    this.filters = filters;
  }


  /**
   * order.
   *
   * @return ConditionalRecipientRuleCondition
   **/
  public ConditionalRecipientRuleCondition order(String order) {
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
   * recipientLabel.
   *
   * @return ConditionalRecipientRuleCondition
   **/
  public ConditionalRecipientRuleCondition recipientLabel(String recipientLabel) {
    this.recipientLabel = recipientLabel;
    return this;
  }

  /**
   * .
   * @return recipientLabel
   **/
  @Schema(description = "")
  public String getRecipientLabel() {
    return recipientLabel;
  }

  /**
   * setRecipientLabel.
   **/
  public void setRecipientLabel(String recipientLabel) {
    this.recipientLabel = recipientLabel;
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
    ConditionalRecipientRuleCondition conditionalRecipientRuleCondition = (ConditionalRecipientRuleCondition) o;
    return Objects.equals(this.filters, conditionalRecipientRuleCondition.filters) &&
        Objects.equals(this.order, conditionalRecipientRuleCondition.order) &&
        Objects.equals(this.recipientLabel, conditionalRecipientRuleCondition.recipientLabel);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(filters, order, recipientLabel);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalRecipientRuleCondition {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    recipientLabel: ").append(toIndentedString(recipientLabel)).append("\n");
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

