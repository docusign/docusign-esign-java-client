package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeDelayRuleApiModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ScheduledSendingApiModel.
 *
 */

public class ScheduledSendingApiModel {
  @JsonProperty("ResumeDate")
  private String resumeDate = null;

  @JsonProperty("Rules")
  private java.util.List<EnvelopeDelayRuleApiModel> rules = null;

  @JsonProperty("Status")
  private String status = null;


  /**
   * resumeDate.
   *
   * @return ScheduledSendingApiModel
   **/
  public ScheduledSendingApiModel resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * .
   * @return resumeDate
   **/
  @ApiModelProperty(value = "")
  public String getResumeDate() {
    return resumeDate;
  }

  /**
   * setResumeDate.
   **/
  public void setResumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
  }


  /**
   * rules.
   *
   * @return ScheduledSendingApiModel
   **/
  public ScheduledSendingApiModel rules(java.util.List<EnvelopeDelayRuleApiModel> rules) {
    this.rules = rules;
    return this;
  }
  
  /**
   * addRulesItem.
   *
   * @return ScheduledSendingApiModel
   **/
  public ScheduledSendingApiModel addRulesItem(EnvelopeDelayRuleApiModel rulesItem) {
    if (this.rules == null) {
      this.rules = new java.util.ArrayList<EnvelopeDelayRuleApiModel>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * .
   * @return rules
   **/
  @ApiModelProperty(value = "")
  public java.util.List<EnvelopeDelayRuleApiModel> getRules() {
    return rules;
  }

  /**
   * setRules.
   **/
  public void setRules(java.util.List<EnvelopeDelayRuleApiModel> rules) {
    this.rules = rules;
  }


  /**
   * status.
   *
   * @return ScheduledSendingApiModel
   **/
  public ScheduledSendingApiModel status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
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
    return Objects.equals(this.resumeDate, scheduledSendingApiModel.resumeDate) &&
        Objects.equals(this.rules, scheduledSendingApiModel.rules) &&
        Objects.equals(this.status, scheduledSendingApiModel.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(resumeDate, rules, status);
  }


  /**
   * Converts the given object to string.
   */
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

