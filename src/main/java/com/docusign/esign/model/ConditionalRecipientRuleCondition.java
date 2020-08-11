package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConditionalRecipientRuleFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConditionalRecipientRuleCondition
 */

public class ConditionalRecipientRuleCondition {
  @JsonProperty("filters")
  private java.util.List<ConditionalRecipientRuleFilter> filters = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("recipientLabel")
  private String recipientLabel = null;

  public ConditionalRecipientRuleCondition filters(java.util.List<ConditionalRecipientRuleFilter> filters) {
    this.filters = filters;
    return this;
  }

  public ConditionalRecipientRuleCondition addFiltersItem(ConditionalRecipientRuleFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<ConditionalRecipientRuleFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * 
   * @return filters
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ConditionalRecipientRuleFilter> getFilters() {
    return filters;
  }

  public void setFilters(java.util.List<ConditionalRecipientRuleFilter> filters) {
    this.filters = filters;
  }

  public ConditionalRecipientRuleCondition order(String order) {
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

  public ConditionalRecipientRuleCondition recipientLabel(String recipientLabel) {
    this.recipientLabel = recipientLabel;
    return this;
  }

   /**
   * 
   * @return recipientLabel
  **/
  @ApiModelProperty(value = "")
  public String getRecipientLabel() {
    return recipientLabel;
  }

  public void setRecipientLabel(String recipientLabel) {
    this.recipientLabel = recipientLabel;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(filters, order, recipientLabel);
  }


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

