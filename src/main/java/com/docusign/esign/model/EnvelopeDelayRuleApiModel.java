package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/**
 * An envelope delay rule is a rule which determines how the envelope should be
 * delayed either for
 * sending or routing. It can expressed as either a delay in some number of
 * days, hours, minutes and
 * seconds or an exact resumeDate in the future..
 */
@Schema(description = "An envelope delay rule is a rule which determines how the envelope should be delayed either for sending or routing. It can expressed as either a delay in some number of days, hours, minutes and seconds or an exact resumeDate in the future.")
public class EnvelopeDelayRuleApiModel {
  @JsonProperty("delay")
  private String delay = null;

  @JsonProperty("resumeDate")
  private String resumeDate = null;

  /**
   * delay.
   *
   * @return EnvelopeDelayRuleApiModel
   */
  public EnvelopeDelayRuleApiModel delay(String delay) {
    this.delay = delay;
    return this;
  }

  /**
   * A string timespan duration represented as d.hh:mm:ss where the d component is
   * days, hh is hours
   * measured on a 24-hour clock, mm is minutes and ss is seconds, indicating the
   * expected delay for
   * this envelope rule. The maximum delay is 30 days..
   *
   * @return delay
   */
  @Schema(description = "A string timespan duration represented as d.hh:mm:ss where the d component is days, hh is hours measured on a 24-hour clock, mm is minutes and ss is seconds, indicating the expected delay for this envelope rule. The maximum delay is 30 days.")
  public String getDelay() {
    return delay;
  }

  /** setDelay. */
  public void setDelay(String delay) {
    this.delay = delay;
  }

  /**
   * resumeDate.
   *
   * @return EnvelopeDelayRuleApiModel
   */
  public EnvelopeDelayRuleApiModel resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * A string formatted as an ISO 8601 DATETIME with TimeZone specified,
   * indicating the expected
   * resumeDate for this envelope rule. The specified datetime must occur in the
   * future relative to
   * the current UTC time hen the request is made. The maximum resumeDate must not
   * exceed 30 days in
   * the future..
   *
   * @return resumeDate
   */
  @Schema(description = "A string formatted as an ISO 8601 DATETIME with TimeZone specified, indicating the expected resumeDate for this envelope rule. The specified datetime must occur in the future relative to the current UTC time hen the request is made. The maximum resumeDate must not exceed 30 days in the future.")
  public String getResumeDate() {
    return resumeDate;
  }

  /** setResumeDate. */
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
    return Objects.equals(this.delay, envelopeDelayRuleApiModel.delay)
        && Objects.equals(this.resumeDate, envelopeDelayRuleApiModel.resumeDate);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(delay, resumeDate);
  }

  /** Converts the given object to string. */
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
