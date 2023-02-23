package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocumentFieldsInformation.
 *
 */

public class DocumentFieldsInformation {
  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = null;

  /**
   * documentFields.
   *
   * @return DocumentFieldsInformation
   **/
  public DocumentFieldsInformation documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }

  /**
   * addDocumentFieldsItem.
   *
   * @return DocumentFieldsInformation
   **/
  public DocumentFieldsInformation addDocumentFieldsItem(NameValue documentFieldsItem) {
    if (this.documentFields == null) {
      this.documentFields = new java.util.ArrayList<>();
    }
    this.documentFields.add(documentFieldsItem);
    return this;
  }

  /**
   * The array of name/value custom data strings to be added to a document. Custom
   * document field information is returned in the status, but otherwise is not
   * used by DocuSign. The array contains the elements: * name - A string that can
   * be a maximum of 50 characters. * value - A string that can be a maximum of
   * 200 characters. *IMPORTANT*: If you are using xml, the name/value pair is
   * contained in a nameValue element. .
   * 
   * @return documentFields
   **/
  @Schema(description = "The array of name/value custom data strings to be added to a document. Custom document field information is returned in the status, but otherwise is not used by DocuSign. The array contains the elements:   * name - A string that can be a maximum of 50 characters.  * value - A string that can be a maximum of 200 characters.  *IMPORTANT*: If you are using xml, the name/value pair is contained in a nameValue element.  ")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }

  /**
   * setDocumentFields.
   **/
  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
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
    DocumentFieldsInformation documentFieldsInformation = (DocumentFieldsInformation) o;
    return Objects.equals(this.documentFields, documentFieldsInformation.documentFields);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentFields);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFieldsInformation {\n");

    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
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
