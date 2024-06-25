package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopeViewTemplateSettings.
 *
 */

public class EnvelopeViewTemplateSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("showMatchingTemplatesPrompt")
  private String showMatchingTemplatesPrompt = null;


  /**
   * showMatchingTemplatesPrompt.
   *
   * @return EnvelopeViewTemplateSettings
   **/
  public EnvelopeViewTemplateSettings showMatchingTemplatesPrompt(String showMatchingTemplatesPrompt) {
    this.showMatchingTemplatesPrompt = showMatchingTemplatesPrompt;
    return this;
  }

  /**
   * .
   * @return showMatchingTemplatesPrompt
   **/
  @Schema(description = "")
  public String getShowMatchingTemplatesPrompt() {
    return showMatchingTemplatesPrompt;
  }

  /**
   * setShowMatchingTemplatesPrompt.
   **/
  public void setShowMatchingTemplatesPrompt(String showMatchingTemplatesPrompt) {
    this.showMatchingTemplatesPrompt = showMatchingTemplatesPrompt;
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
    EnvelopeViewTemplateSettings envelopeViewTemplateSettings = (EnvelopeViewTemplateSettings) o;
    return Objects.equals(this.showMatchingTemplatesPrompt, envelopeViewTemplateSettings.showMatchingTemplatesPrompt);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(showMatchingTemplatesPrompt);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewTemplateSettings {\n");
    
    sb.append("    showMatchingTemplatesPrompt: ").append(toIndentedString(showMatchingTemplatesPrompt)).append("\n");
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

