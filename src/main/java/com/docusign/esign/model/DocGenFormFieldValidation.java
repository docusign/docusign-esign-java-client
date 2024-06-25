package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocGenFormFieldValidation.
 *
 */

public class DocGenFormFieldValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("expression")
  private String expression = null;


  /**
   * errorMessage.
   *
   * @return DocGenFormFieldValidation
   **/
  public DocGenFormFieldValidation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * .
   * @return errorMessage
   **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * setErrorMessage.
   **/
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * expression.
   *
   * @return DocGenFormFieldValidation
   **/
  public DocGenFormFieldValidation expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * .
   * @return expression
   **/
  @Schema(description = "")
  public String getExpression() {
    return expression;
  }

  /**
   * setExpression.
   **/
  public void setExpression(String expression) {
    this.expression = expression;
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
    DocGenFormFieldValidation docGenFormFieldValidation = (DocGenFormFieldValidation) o;
    return Objects.equals(this.errorMessage, docGenFormFieldValidation.errorMessage) &&
        Objects.equals(this.expression, docGenFormFieldValidation.expression);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, expression);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenFormFieldValidation {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

