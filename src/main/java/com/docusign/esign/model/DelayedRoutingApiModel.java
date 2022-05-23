package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DelayedRoutingApiModel. */
public class DelayedRoutingApiModel {
  @JsonProperty("resumeDate")
  private String resumeDate = null;

  @JsonProperty("rules")
  private java.util.List<EnvelopeDelayRuleApiModel> rules = null;

  @JsonProperty("status")
  private String status = null;

  /**
   * resumeDate.
   *
   * @return DelayedRoutingApiModel
   */
  public DelayedRoutingApiModel resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * An ISO 8601 formatted datetime string indicating the date and time that the envelope is (or
   * was) scheduled to be sent to the recipients associated with the current workflow step or null
   * if the envelope has not yet begun processing the current workflow step..
   *
   * @return resumeDate
   */
  @ApiModelProperty(
      value =
          "An ISO 8601 formatted datetime string indicating the date and time that the envelope is (or was) scheduled to be sent to the recipients associated with the current workflow step or null if the envelope has not yet begun processing the current workflow step.")
  public String getResumeDate() {
    return resumeDate;
  }

  /** setResumeDate. */
  public void setResumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
  }

  /**
   * rules.
   *
   * @return DelayedRoutingApiModel
   */
  public DelayedRoutingApiModel rules(java.util.List<EnvelopeDelayRuleApiModel> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * addRulesItem.
   *
   * @return DelayedRoutingApiModel
   */
  public DelayedRoutingApiModel addRulesItem(EnvelopeDelayRuleApiModel rulesItem) {
    if (this.rules == null) {
      this.rules = new java.util.ArrayList<EnvelopeDelayRuleApiModel>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * A list of envelope delay rules specified by the user indicating how and when the envelope
   * should be sent in the future for the current workflow step and its associated recipients.
   * Currently only 1 rule may be specified..
   *
   * @return rules
   */
  @ApiModelProperty(
      value =
          "A list of envelope delay rules specified by the user indicating how and when the envelope should be sent in the future for the current workflow step and its associated recipients. Currently only 1 rule may be specified.")
  public java.util.List<EnvelopeDelayRuleApiModel> getRules() {
    return rules;
  }

  /** setRules. */
  public void setRules(java.util.List<EnvelopeDelayRuleApiModel> rules) {
    this.rules = rules;
  }

  /**
   * status.
   *
   * @return DelayedRoutingApiModel
   */
  public DelayedRoutingApiModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * \"pending\" if the current workflow step has not been reached and the delay has not yet
   * started. \"started\" if the delay is in progress. \"completed\" if the delay has elapsed and
   * the envelope has been sent to the current workflow step's recipients..
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "\"pending\" if the current workflow step has not been reached and the delay has not yet started. \"started\" if the delay is in progress. \"completed\" if the delay has elapsed and the envelope has been sent to the current workflow step's recipients.")
  public String getStatus() {
    return status;
  }

  /** setStatus. */
  public void setStatus(String status) {
    this.status = status;
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
    DelayedRoutingApiModel delayedRoutingApiModel = (DelayedRoutingApiModel) o;
    return Objects.equals(this.resumeDate, delayedRoutingApiModel.resumeDate)
        && Objects.equals(this.rules, delayedRoutingApiModel.rules)
        && Objects.equals(this.status, delayedRoutingApiModel.status);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(resumeDate, rules, status);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelayedRoutingApiModel {\n");

    sb.append("    resumeDate: ").append(toIndentedString(resumeDate)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
