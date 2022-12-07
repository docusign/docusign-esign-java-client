package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopeDelayRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ScheduledSending.
 *
 */

public class ScheduledSending {
  @JsonProperty("bulkListId")
  private String bulkListId = null;

  @JsonProperty("resumeDate")
  private String resumeDate = null;

  @JsonProperty("rules")
  private java.util.List<EnvelopeDelayRule> rules = null;

  @JsonProperty("status")
  private String status = null;


  /**
   * bulkListId.
   *
   * @return ScheduledSending
   **/
  public ScheduledSending bulkListId(String bulkListId) {
    this.bulkListId = bulkListId;
    return this;
  }

  /**
   * .
   * @return bulkListId
   **/
  @ApiModelProperty(value = "")
  public String getBulkListId() {
    return bulkListId;
  }

  /**
   * setBulkListId.
   **/
  public void setBulkListId(String bulkListId) {
    this.bulkListId = bulkListId;
  }


  /**
   * resumeDate.
   *
   * @return ScheduledSending
   **/
  public ScheduledSending resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * An ISO 8601 formatted datetime string indicating the date and time that the envelope is (or was) scheduled to be sent or null if the envelope has not yet been sent..
   * @return resumeDate
   **/
  @ApiModelProperty(value = "An ISO 8601 formatted datetime string indicating the date and time that the envelope is (or was) scheduled to be sent or null if the envelope has not yet been sent.")
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
   * @return ScheduledSending
   **/
  public ScheduledSending rules(java.util.List<EnvelopeDelayRule> rules) {
    this.rules = rules;
    return this;
  }
  
  /**
   * addRulesItem.
   *
   * @return ScheduledSending
   **/
  public ScheduledSending addRulesItem(EnvelopeDelayRule rulesItem) {
    if (this.rules == null) {
      this.rules = new java.util.ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * A list of envelope delay rules specified by the user indicating how and when the envelope should be scheduled for sending in the future. Currently only 1 rule may be specified..
   * @return rules
   **/
  @ApiModelProperty(value = "A list of envelope delay rules specified by the user indicating how and when the envelope should be scheduled for sending in the future. Currently only 1 rule may be specified.")
  public java.util.List<EnvelopeDelayRule> getRules() {
    return rules;
  }

  /**
   * setRules.
   **/
  public void setRules(java.util.List<EnvelopeDelayRule> rules) {
    this.rules = rules;
  }


  /**
   * status.
   *
   * @return ScheduledSending
   **/
  public ScheduledSending status(String status) {
    this.status = status;
    return this;
  }

  /**
   * \\\"pending\\\" if the envelope has not yet been sent and the scheduled sending delay has not iniaited. \\\"started\\\" if the scheduled sending delay is in progress. \\\"completed\\\" if the scheduled sending delay has elapsed and the envelope has been sent..
   * @return status
   **/
  @ApiModelProperty(value = "\\\"pending\\\" if the envelope has not yet been sent and the scheduled sending delay has not iniaited. \\\"started\\\" if the scheduled sending delay is in progress. \\\"completed\\\" if the scheduled sending delay has elapsed and the envelope has been sent.")
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
    ScheduledSending scheduledSending = (ScheduledSending) o;
    return Objects.equals(this.bulkListId, scheduledSending.bulkListId) &&
        Objects.equals(this.resumeDate, scheduledSending.resumeDate) &&
        Objects.equals(this.rules, scheduledSending.rules) &&
        Objects.equals(this.status, scheduledSending.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkListId, resumeDate, rules, status);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledSending {\n");
    
    sb.append("    bulkListId: ").append(toIndentedString(bulkListId)).append("\n");
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

