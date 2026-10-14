package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.GeneratedDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * GeneratedDocumentsResult.
 *
 */

public class GeneratedDocumentsResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("generatedDocuments")
  private java.util.List<GeneratedDocument> generatedDocuments = null;


  /**
   * generatedDocuments.
   *
   * @return GeneratedDocumentsResult
   **/
  public GeneratedDocumentsResult generatedDocuments(java.util.List<GeneratedDocument> generatedDocuments) {
    this.generatedDocuments = generatedDocuments;
    return this;
  }
  
  /**
   * addGeneratedDocumentsItem.
   *
   * @return GeneratedDocumentsResult
   **/
  public GeneratedDocumentsResult addGeneratedDocumentsItem(GeneratedDocument generatedDocumentsItem) {
    if (this.generatedDocuments == null) {
      this.generatedDocuments = new java.util.ArrayList<>();
    }
    this.generatedDocuments.add(generatedDocumentsItem);
    return this;
  }

  /**
   * .
   * @return generatedDocuments
   **/
  @Schema(description = "")
  public java.util.List<GeneratedDocument> getGeneratedDocuments() {
    return generatedDocuments;
  }

  /**
   * setGeneratedDocuments.
   **/
  public void setGeneratedDocuments(java.util.List<GeneratedDocument> generatedDocuments) {
    this.generatedDocuments = generatedDocuments;
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
    GeneratedDocumentsResult generatedDocumentsResult = (GeneratedDocumentsResult) o;
    return Objects.equals(this.generatedDocuments, generatedDocumentsResult.generatedDocuments);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(generatedDocuments);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratedDocumentsResult {\n");
    
    sb.append("    generatedDocuments: ").append(toIndentedString(generatedDocuments)).append("\n");
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

