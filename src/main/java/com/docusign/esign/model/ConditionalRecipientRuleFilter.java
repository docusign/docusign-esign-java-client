package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConditionalRecipientRuleFilter
 */

public class ConditionalRecipientRuleFilter {
  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("tabType")
  private String tabType = null;

  @JsonProperty("value")
  private String value = null;

  public ConditionalRecipientRuleFilter operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * 
   * @return operator
  **/
  @ApiModelProperty(value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public ConditionalRecipientRuleFilter recipientId(String recipientId) {
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

  public ConditionalRecipientRuleFilter scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * 
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public ConditionalRecipientRuleFilter tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     
   * @return tabId
  **/
  @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  public ConditionalRecipientRuleFilter tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * The label string associated with the tab.
   * @return tabLabel
  **/
  @ApiModelProperty(value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  public ConditionalRecipientRuleFilter tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

   /**
   * 
   * @return tabType
  **/
  @ApiModelProperty(value = "")
  public String getTabType() {
    return tabType;
  }

  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  public ConditionalRecipientRuleFilter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Specifies the value of the tab. 
   * @return value
  **/
  @ApiModelProperty(value = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalRecipientRuleFilter conditionalRecipientRuleFilter = (ConditionalRecipientRuleFilter) o;
    return Objects.equals(this.operator, conditionalRecipientRuleFilter.operator) &&
        Objects.equals(this.recipientId, conditionalRecipientRuleFilter.recipientId) &&
        Objects.equals(this.scope, conditionalRecipientRuleFilter.scope) &&
        Objects.equals(this.tabId, conditionalRecipientRuleFilter.tabId) &&
        Objects.equals(this.tabLabel, conditionalRecipientRuleFilter.tabLabel) &&
        Objects.equals(this.tabType, conditionalRecipientRuleFilter.tabType) &&
        Objects.equals(this.value, conditionalRecipientRuleFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, recipientId, scope, tabId, tabLabel, tabType, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalRecipientRuleFilter {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

