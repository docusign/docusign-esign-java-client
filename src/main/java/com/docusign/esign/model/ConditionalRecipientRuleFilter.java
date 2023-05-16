package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ConditionalRecipientRuleFilter.
 *
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


  /**
   * operator.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * .
   * @return operator
   **/
  @Schema(description = "")
  public String getOperator() {
    return operator;
  }

  /**
   * setOperator.
   **/
  public void setOperator(String operator) {
    this.operator = operator;
  }


  /**
   * recipientId.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter recipientId(String recipientId) {
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
   * scope.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * .
   * @return scope
   **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  /**
   * setScope.
   **/
  public void setScope(String scope) {
    this.scope = scope;
  }


  /**
   * tabId.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     .
   * @return tabId
   **/
  @Schema(description = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  /**
   * setTabId.
   **/
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }


  /**
   * tabLabel.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * The label string associated with the tab..
   * @return tabLabel
   **/
  @Schema(description = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  /**
   * setTabLabel.
   **/
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }


  /**
   * tabType.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * .
   * @return tabType
   **/
  @Schema(description = "")
  public String getTabType() {
    return tabType;
  }

  /**
   * setTabType.
   **/
  public void setTabType(String tabType) {
    this.tabType = tabType;
  }


  /**
   * value.
   *
   * @return ConditionalRecipientRuleFilter
   **/
  public ConditionalRecipientRuleFilter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   * @return value
   **/
  @Schema(description = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(String value) {
    this.value = value;
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
    ConditionalRecipientRuleFilter conditionalRecipientRuleFilter = (ConditionalRecipientRuleFilter) o;
    return Objects.equals(this.operator, conditionalRecipientRuleFilter.operator) &&
        Objects.equals(this.recipientId, conditionalRecipientRuleFilter.recipientId) &&
        Objects.equals(this.scope, conditionalRecipientRuleFilter.scope) &&
        Objects.equals(this.tabId, conditionalRecipientRuleFilter.tabId) &&
        Objects.equals(this.tabLabel, conditionalRecipientRuleFilter.tabLabel) &&
        Objects.equals(this.tabType, conditionalRecipientRuleFilter.tabType) &&
        Objects.equals(this.value, conditionalRecipientRuleFilter.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(operator, recipientId, scope, tabId, tabLabel, tabType, value);
  }


  /**
   * Converts the given object to string.
   */
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

