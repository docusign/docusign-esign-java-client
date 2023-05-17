package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocGenFormFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocGenFormFieldRequest.
 *
 */

public class DocGenFormFieldRequest {
  @JsonProperty("docGenFormFields")
  private java.util.List<DocGenFormFields> docGenFormFields = null;


  /**
   * docGenFormFields.
   *
   * @return DocGenFormFieldRequest
   **/
  public DocGenFormFieldRequest docGenFormFields(java.util.List<DocGenFormFields> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
    return this;
  }
  
  /**
   * addDocGenFormFieldsItem.
   *
   * @return DocGenFormFieldRequest
   **/
  public DocGenFormFieldRequest addDocGenFormFieldsItem(DocGenFormFields docGenFormFieldsItem) {
    if (this.docGenFormFields == null) {
      this.docGenFormFields = new java.util.ArrayList<>();
    }
    this.docGenFormFields.add(docGenFormFieldsItem);
    return this;
  }

  /**
   * .
   * @return docGenFormFields
   **/
  @Schema(description = "")
  public java.util.List<DocGenFormFields> getDocGenFormFields() {
    return docGenFormFields;
  }

  /**
   * setDocGenFormFields.
   **/
  public void setDocGenFormFields(java.util.List<DocGenFormFields> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
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
    DocGenFormFieldRequest docGenFormFieldRequest = (DocGenFormFieldRequest) o;
    return Objects.equals(this.docGenFormFields, docGenFormFieldRequest.docGenFormFields);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(docGenFormFields);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenFormFieldRequest {\n");
    
    sb.append("    docGenFormFields: ").append(toIndentedString(docGenFormFields)).append("\n");
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

