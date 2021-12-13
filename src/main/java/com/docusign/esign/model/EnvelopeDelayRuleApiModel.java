package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeDelayRuleApiModel.
 *
 */

public class EnvelopeDelayRuleApiModel {
  @JsonProperty("delay")
  private String delay = null;

  @JsonProperty("resumeDate")
  private String resumeDate = null;


  /**
   * delay.
   *
   * @return EnvelopeDelayRuleApiModel
   **/
  public EnvelopeDelayRuleApiModel delay(String delay) {
    this.delay = delay;
    return this;
  }

  /**
   * .
   * @return delay
   **/
  @ApiModelProperty(value = "")
  public String getDelay() {
    return delay;
  }

  /**
   * setDelay.
   **/
  public void setDelay(String delay) {
    this.delay = delay;
  }


  /**
   * resumeDate.
   *
   * @return EnvelopeDelayRuleApiModel
   **/
  public EnvelopeDelayRuleApiModel resumeDate(String resumeDate) {
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
    EnvelopeDelayRuleApiModel envelopeDelayRuleApiModel = (EnvelopeDelayRuleApiModel) o;
    return Objects.equals(this.delay, envelopeDelayRuleApiModel.delay) &&
        Objects.equals(this.resumeDate, envelopeDelayRuleApiModel.resumeDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(delay, resumeDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeDelayRuleApiModel {\n");
    
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    resumeDate: ").append(toIndentedString(resumeDate)).append("\n");
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

