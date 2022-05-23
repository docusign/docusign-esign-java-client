package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeDelayRule. */
public class EnvelopeDelayRule {
  @JsonProperty("delay")
  private String delay = null;

  @JsonProperty("resumeDate")
  private String resumeDate = null;

  /**
   * delay.
   *
   * @return EnvelopeDelayRule
   */
  public EnvelopeDelayRule delay(String delay) {
    this.delay = delay;
    return this;
  }

  /**
   * .
   *
   * @return delay
   */
  @ApiModelProperty(value = "")
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
   * @return EnvelopeDelayRule
   */
  public EnvelopeDelayRule resumeDate(String resumeDate) {
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
    EnvelopeDelayRule envelopeDelayRule = (EnvelopeDelayRule) o;
    return Objects.equals(this.delay, envelopeDelayRule.delay)
        && Objects.equals(this.resumeDate, envelopeDelayRule.resumeDate);
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
    sb.append("class EnvelopeDelayRule {\n");

    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    resumeDate: ").append(toIndentedString(resumeDate)).append("\n");
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
