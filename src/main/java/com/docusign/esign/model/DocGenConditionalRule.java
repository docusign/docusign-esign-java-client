package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocGenConditionalOperationBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocGenConditionalRule.
 *
 */

public class DocGenConditionalRule implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("conditionalOperations")
  private java.util.List<DocGenConditionalOperationBase> conditionalOperations = null;

  @JsonProperty("conditionalRuleEffect")
  private String conditionalRuleEffect = null;

  @JsonProperty("conditionalRuleEffectFields")
  private java.util.List<String> conditionalRuleEffectFields = null;

  @JsonProperty("conditionalRuleOperator")
  private String conditionalRuleOperator = null;


  /**
   * conditionalOperations.
   *
   * @return DocGenConditionalRule
   **/
  public DocGenConditionalRule conditionalOperations(java.util.List<DocGenConditionalOperationBase> conditionalOperations) {
    this.conditionalOperations = conditionalOperations;
    return this;
  }
  
  /**
   * addConditionalOperationsItem.
   *
   * @return DocGenConditionalRule
   **/
  public DocGenConditionalRule addConditionalOperationsItem(DocGenConditionalOperationBase conditionalOperationsItem) {
    if (this.conditionalOperations == null) {
      this.conditionalOperations = new java.util.ArrayList<>();
    }
    this.conditionalOperations.add(conditionalOperationsItem);
    return this;
  }

  /**
   * .
   * @return conditionalOperations
   **/
  @Schema(description = "")
  public java.util.List<DocGenConditionalOperationBase> getConditionalOperations() {
    return conditionalOperations;
  }

  /**
   * setConditionalOperations.
   **/
  public void setConditionalOperations(java.util.List<DocGenConditionalOperationBase> conditionalOperations) {
    this.conditionalOperations = conditionalOperations;
  }


  /**
   * conditionalRuleEffect.
   *
   * @return DocGenConditionalRule
   **/
  public DocGenConditionalRule conditionalRuleEffect(String conditionalRuleEffect) {
    this.conditionalRuleEffect = conditionalRuleEffect;
    return this;
  }

  /**
   * .
   * @return conditionalRuleEffect
   **/
  @Schema(description = "")
  public String getConditionalRuleEffect() {
    return conditionalRuleEffect;
  }

  /**
   * setConditionalRuleEffect.
   **/
  public void setConditionalRuleEffect(String conditionalRuleEffect) {
    this.conditionalRuleEffect = conditionalRuleEffect;
  }


  /**
   * conditionalRuleEffectFields.
   *
   * @return DocGenConditionalRule
   **/
  public DocGenConditionalRule conditionalRuleEffectFields(java.util.List<String> conditionalRuleEffectFields) {
    this.conditionalRuleEffectFields = conditionalRuleEffectFields;
    return this;
  }
  
  /**
   * addConditionalRuleEffectFieldsItem.
   *
   * @return DocGenConditionalRule
   **/
  public DocGenConditionalRule addConditionalRuleEffectFieldsItem(String conditionalRuleEffectFieldsItem) {
    if (this.conditionalRuleEffectFields == null) {
      this.conditionalRuleEffectFields = new java.util.ArrayList<>();
    }
    this.conditionalRuleEffectFields.add(conditionalRuleEffectFieldsItem);
    return this;
  }

  /**
   * .
   * @return conditionalRuleEffectFields
   **/
  @Schema(description = "")
  public java.util.List<String> getConditionalRuleEffectFields() {
    return conditionalRuleEffectFields;
  }

  /**
   * setConditionalRuleEffectFields.
   **/
  public void setConditionalRuleEffectFields(java.util.List<String> conditionalRuleEffectFields) {
    this.conditionalRuleEffectFields = conditionalRuleEffectFields;
  }


  /**
   * conditionalRuleOperator.
   *
   * @return DocGenConditionalRule
   **/
  public DocGenConditionalRule conditionalRuleOperator(String conditionalRuleOperator) {
    this.conditionalRuleOperator = conditionalRuleOperator;
    return this;
  }

  /**
   * .
   * @return conditionalRuleOperator
   **/
  @Schema(description = "")
  public String getConditionalRuleOperator() {
    return conditionalRuleOperator;
  }

  /**
   * setConditionalRuleOperator.
   **/
  public void setConditionalRuleOperator(String conditionalRuleOperator) {
    this.conditionalRuleOperator = conditionalRuleOperator;
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
    DocGenConditionalRule docGenConditionalRule = (DocGenConditionalRule) o;
    return Objects.equals(this.conditionalOperations, docGenConditionalRule.conditionalOperations) &&
        Objects.equals(this.conditionalRuleEffect, docGenConditionalRule.conditionalRuleEffect) &&
        Objects.equals(this.conditionalRuleEffectFields, docGenConditionalRule.conditionalRuleEffectFields) &&
        Objects.equals(this.conditionalRuleOperator, docGenConditionalRule.conditionalRuleOperator);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(conditionalOperations, conditionalRuleEffect, conditionalRuleEffectFields, conditionalRuleOperator);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenConditionalRule {\n");
    
    sb.append("    conditionalOperations: ").append(toIndentedString(conditionalOperations)).append("\n");
    sb.append("    conditionalRuleEffect: ").append(toIndentedString(conditionalRuleEffect)).append("\n");
    sb.append("    conditionalRuleEffectFields: ").append(toIndentedString(conditionalRuleEffectFields)).append("\n");
    sb.append("    conditionalRuleOperator: ").append(toIndentedString(conditionalRuleOperator)).append("\n");
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

