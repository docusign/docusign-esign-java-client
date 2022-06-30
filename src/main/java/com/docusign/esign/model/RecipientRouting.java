package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientRouting.
 *
 */

public class RecipientRouting {
  @JsonProperty("rules")
  private RecipientRules rules = null;


  /**
   * rules.
   *
   * @return RecipientRouting
   **/
  public RecipientRouting rules(RecipientRules rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules.
   * @return rules
   **/
  @ApiModelProperty(value = "")
  public RecipientRules getRules() {
    return rules;
  }

  /**
   * setRules.
   **/
  public void setRules(RecipientRules rules) {
    this.rules = rules;
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
    RecipientRouting recipientRouting = (RecipientRouting) o;
    return Objects.equals(this.rules, recipientRouting.rules);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientRouting {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

