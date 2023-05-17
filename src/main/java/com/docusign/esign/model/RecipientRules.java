package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConditionalRecipientRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RecipientRules.
 *
 */

public class RecipientRules {
  @JsonProperty("conditionalRecipients")
  private java.util.List<ConditionalRecipientRule> conditionalRecipients = null;


  /**
   * conditionalRecipients.
   *
   * @return RecipientRules
   **/
  public RecipientRules conditionalRecipients(java.util.List<ConditionalRecipientRule> conditionalRecipients) {
    this.conditionalRecipients = conditionalRecipients;
    return this;
  }
  
  /**
   * addConditionalRecipientsItem.
   *
   * @return RecipientRules
   **/
  public RecipientRules addConditionalRecipientsItem(ConditionalRecipientRule conditionalRecipientsItem) {
    if (this.conditionalRecipients == null) {
      this.conditionalRecipients = new java.util.ArrayList<>();
    }
    this.conditionalRecipients.add(conditionalRecipientsItem);
    return this;
  }

  /**
   * .
   * @return conditionalRecipients
   **/
  @Schema(description = "")
  public java.util.List<ConditionalRecipientRule> getConditionalRecipients() {
    return conditionalRecipients;
  }

  /**
   * setConditionalRecipients.
   **/
  public void setConditionalRecipients(java.util.List<ConditionalRecipientRule> conditionalRecipients) {
    this.conditionalRecipients = conditionalRecipients;
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
    RecipientRules recipientRules = (RecipientRules) o;
    return Objects.equals(this.conditionalRecipients, recipientRules.conditionalRecipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(conditionalRecipients);
  }


  /**
   * Converts the given object to string.
   */
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

