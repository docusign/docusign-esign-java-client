package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * TemplateAutoMatch.
 *
 */

public class TemplateAutoMatch implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("autoMatch")
  private String autoMatch = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("templateId")
  private String templateId = null;


  /**
   * autoMatch.
   *
   * @return TemplateAutoMatch
   **/
  public TemplateAutoMatch autoMatch(String autoMatch) {
    this.autoMatch = autoMatch;
    return this;
  }

  /**
   * .
   * @return autoMatch
   **/
  @Schema(description = "")
  public String getAutoMatch() {
    return autoMatch;
  }

  /**
   * setAutoMatch.
   **/
  public void setAutoMatch(String autoMatch) {
    this.autoMatch = autoMatch;
  }


  /**
   * errorDetails.
   *
   * @return TemplateAutoMatch
   **/
  public TemplateAutoMatch errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * templateId.
   *
   * @return TemplateAutoMatch
   **/
  public TemplateAutoMatch templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @Schema(description = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
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
    TemplateAutoMatch templateAutoMatch = (TemplateAutoMatch) o;
    return Objects.equals(this.autoMatch, templateAutoMatch.autoMatch) &&
        Objects.equals(this.errorDetails, templateAutoMatch.errorDetails) &&
        Objects.equals(this.templateId, templateAutoMatch.templateId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(autoMatch, errorDetails, templateId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateAutoMatch {\n");
    
    sb.append("    autoMatch: ").append(toIndentedString(autoMatch)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

