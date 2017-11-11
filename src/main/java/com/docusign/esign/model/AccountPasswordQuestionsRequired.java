package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordQuestionsRequired
 */

public class AccountPasswordQuestionsRequired {
  @JsonProperty("maximumQuestions")
  private String maximumQuestions = null;

  @JsonProperty("minimumQuestions")
  private String minimumQuestions = null;

  public AccountPasswordQuestionsRequired maximumQuestions(String maximumQuestions) {
    this.maximumQuestions = maximumQuestions;
    return this;
  }

   /**
   * 
   * @return maximumQuestions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaximumQuestions() {
    return maximumQuestions;
  }

  public void setMaximumQuestions(String maximumQuestions) {
    this.maximumQuestions = maximumQuestions;
  }

  public AccountPasswordQuestionsRequired minimumQuestions(String minimumQuestions) {
    this.minimumQuestions = minimumQuestions;
    return this;
  }

   /**
   * 
   * @return minimumQuestions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMinimumQuestions() {
    return minimumQuestions;
  }

  public void setMinimumQuestions(String minimumQuestions) {
    this.minimumQuestions = minimumQuestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordQuestionsRequired accountPasswordQuestionsRequired = (AccountPasswordQuestionsRequired) o;
    return Objects.equals(this.maximumQuestions, accountPasswordQuestionsRequired.maximumQuestions) &&
        Objects.equals(this.minimumQuestions, accountPasswordQuestionsRequired.minimumQuestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumQuestions, minimumQuestions);
  }


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

