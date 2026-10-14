package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocGenFormat.
 *
 */

public class DocGenFormat implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("expression")
  private String expression = null;

  @JsonProperty("locale")
  private String locale = null;


  /**
   * expression.
   *
   * @return DocGenFormat
   **/
  public DocGenFormat expression(String expression) {
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
   * locale.
   *
   * @return DocGenFormat
   **/
  public DocGenFormat locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * .
   * @return locale
   **/
  @Schema(description = "")
  public String getLocale() {
    return locale;
  }

  /**
   * setLocale.
   **/
  public void setLocale(String locale) {
    this.locale = locale;
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
    DocGenFormat docGenFormat = (DocGenFormat) o;
    return Objects.equals(this.expression, docGenFormat.expression) &&
        Objects.equals(this.locale, docGenFormat.locale);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expression, locale);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenFormat {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

