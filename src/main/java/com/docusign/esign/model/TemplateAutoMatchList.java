package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.TemplateAutoMatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * TemplateAutoMatchList.
 *
 */

public class TemplateAutoMatchList implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("templates")
  private java.util.List<TemplateAutoMatch> templates = null;


  /**
   * templates.
   *
   * @return TemplateAutoMatchList
   **/
  public TemplateAutoMatchList templates(java.util.List<TemplateAutoMatch> templates) {
    this.templates = templates;
    return this;
  }
  
  /**
   * addTemplatesItem.
   *
   * @return TemplateAutoMatchList
   **/
  public TemplateAutoMatchList addTemplatesItem(TemplateAutoMatch templatesItem) {
    if (this.templates == null) {
      this.templates = new java.util.ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * .
   * @return templates
   **/
  @Schema(description = "")
  public java.util.List<TemplateAutoMatch> getTemplates() {
    return templates;
  }

  /**
   * setTemplates.
   **/
  public void setTemplates(java.util.List<TemplateAutoMatch> templates) {
    this.templates = templates;
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
    TemplateAutoMatchList templateAutoMatchList = (TemplateAutoMatchList) o;
    return Objects.equals(this.templates, templateAutoMatchList.templates);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(templates);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateAutoMatchList {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

