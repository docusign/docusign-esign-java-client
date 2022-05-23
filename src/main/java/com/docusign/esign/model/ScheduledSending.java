package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ScheduledSending. */
public class ScheduledSending {
  @JsonProperty("resumeDate")
  private String resumeDate = null;

  @JsonProperty("rules")
  private java.util.List<EnvelopeDelayRule> rules = null;

  @JsonProperty("status")
  private String status = null;

  /**
   * resumeDate.
   *
   * @return ScheduledSending
   */
  public ScheduledSending resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * .
   *
   * @return resumeDate
   */
  @ApiModelProperty(value = "")
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
   * @return ScheduledSending
   */
  public ScheduledSending rules(java.util.List<EnvelopeDelayRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * addRulesItem.
   *
   * @return ScheduledSending
   */
  public ScheduledSending addRulesItem(EnvelopeDelayRule rulesItem) {
    if (this.rules == null) {
      this.rules = new java.util.ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * .
   *
   * @return rules
   */
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeDelayRule> getRules() {
    return rules;
  }

  /** setRules. */
  public void setRules(java.util.List<EnvelopeDelayRule> rules) {
    this.rules = rules;
  }

  /**
   * status.
   *
   * @return ScheduledSending
   */
  public ScheduledSending status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is sent to the
   * recipients. * created - The envelope is saved as a draft and can be modified and sent later..
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
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
    ScheduledSending scheduledSending = (ScheduledSending) o;
    return Objects.equals(this.resumeDate, scheduledSending.resumeDate)
        && Objects.equals(this.rules, scheduledSending.rules)
        && Objects.equals(this.status, scheduledSending.status);
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
    sb.append("class ScheduledSending {\n");

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
