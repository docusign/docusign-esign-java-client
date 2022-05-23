package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AccountPasswordQuestionsRequired. */
public class AccountPasswordQuestionsRequired {
  @JsonProperty("maximumQuestions")
  private String maximumQuestions = null;

  @JsonProperty("minimumQuestions")
  private String minimumQuestions = null;

  /**
   * maximumQuestions.
   *
   * @return AccountPasswordQuestionsRequired
   */
  public AccountPasswordQuestionsRequired maximumQuestions(String maximumQuestions) {
    this.maximumQuestions = maximumQuestions;
    return this;
  }

  /**
   * .
   *
   * @return maximumQuestions
   */
  @ApiModelProperty(value = "")
  public String getMaximumQuestions() {
    return maximumQuestions;
  }

  /** setMaximumQuestions. */
  public void setMaximumQuestions(String maximumQuestions) {
    this.maximumQuestions = maximumQuestions;
  }

  /**
   * minimumQuestions.
   *
   * @return AccountPasswordQuestionsRequired
   */
  public AccountPasswordQuestionsRequired minimumQuestions(String minimumQuestions) {
    this.minimumQuestions = minimumQuestions;
    return this;
  }

  /**
   * .
   *
   * @return minimumQuestions
   */
  @ApiModelProperty(value = "")
  public String getMinimumQuestions() {
    return minimumQuestions;
  }

  /** setMinimumQuestions. */
  public void setMinimumQuestions(String minimumQuestions) {
    this.minimumQuestions = minimumQuestions;
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
    AccountPasswordQuestionsRequired accountPasswordQuestionsRequired =
        (AccountPasswordQuestionsRequired) o;
    return Objects.equals(this.maximumQuestions, accountPasswordQuestionsRequired.maximumQuestions)
        && Objects.equals(this.minimumQuestions, accountPasswordQuestionsRequired.minimumQuestions);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(maximumQuestions, minimumQuestions);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordQuestionsRequired {\n");

    sb.append("    maximumQuestions: ").append(toIndentedString(maximumQuestions)).append("\n");
    sb.append("    minimumQuestions: ").append(toIndentedString(minimumQuestions)).append("\n");
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
