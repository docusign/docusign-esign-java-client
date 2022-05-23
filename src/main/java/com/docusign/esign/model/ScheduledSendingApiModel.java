package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ScheduledSendingApiModel. */
public class ScheduledSendingApiModel {
  @JsonProperty("resumeDate")
  private String resumeDate = null;

  @JsonProperty("rules")
  private java.util.List<EnvelopeDelayRuleApiModel> rules = null;

  @JsonProperty("status")
  private String status = null;

  /**
   * resumeDate.
   *
   * @return ScheduledSendingApiModel
   */
  public ScheduledSendingApiModel resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * An ISO 8601 formatted datetime string indicating the date and time that the envelope is (or
   * was) scheduled to be sent or null if the envelope has not yet been sent..
   *
   * @return resumeDate
   */
  @ApiModelProperty(
      value =
          "An ISO 8601 formatted datetime string indicating the date and time that the envelope is (or was) scheduled to be sent or null if the envelope has not yet been sent.")
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
   * @return ScheduledSendingApiModel
   */
  public ScheduledSendingApiModel rules(java.util.List<EnvelopeDelayRuleApiModel> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * addRulesItem.
   *
   * @return ScheduledSendingApiModel
   */
  public ScheduledSendingApiModel addRulesItem(EnvelopeDelayRuleApiModel rulesItem) {
    if (this.rules == null) {
      this.rules = new java.util.ArrayList<EnvelopeDelayRuleApiModel>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * A list of envelope delay rules specified by the user indicating how and when the envelope
   * should be scheduled for sending in the future. Currently only 1 rule may be specified..
   *
   * @return rules
   */
  @ApiModelProperty(
      value =
          "A list of envelope delay rules specified by the user indicating how and when the envelope should be scheduled for sending in the future. Currently only 1 rule may be specified.")
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
   * @return ScheduledSendingApiModel
   */
  public ScheduledSendingApiModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * \"pending\" if the envelope has not yet been sent and the scheduled sending delay has not
   * iniaited. \"started\" if the scheduled sending delay is in progress. \"completed\" if the
   * scheduled sending delay has elapsed and the envelope has been sent..
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "\"pending\" if the envelope has not yet been sent and the scheduled sending delay has not iniaited. \"started\" if the scheduled sending delay is in progress. \"completed\" if the scheduled sending delay has elapsed and the envelope has been sent.")
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
    ScheduledSendingApiModel scheduledSendingApiModel = (ScheduledSendingApiModel) o;
    return Objects.equals(this.resumeDate, scheduledSendingApiModel.resumeDate)
        && Objects.equals(this.rules, scheduledSendingApiModel.rules)
        && Objects.equals(this.status, scheduledSendingApiModel.status);
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
    sb.append("class ScheduledSendingApiModel {\n");

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
