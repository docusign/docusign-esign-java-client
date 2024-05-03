package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeViewDocumentSettings.
 *
 */

public class EnvelopeViewDocumentSettings {
  @JsonProperty("showEditDocuments")
  private String showEditDocuments = null;

  @JsonProperty("showEditDocumentVisibility")
  private String showEditDocumentVisibility = null;

  @JsonProperty("showEditPages")
  private String showEditPages = null;

  @JsonProperty("showSaveAsDocumentCustomField")
  private String showSaveAsDocumentCustomField = null;


  /**
   * showEditDocuments.
   *
   * @return EnvelopeViewDocumentSettings
   **/
  public EnvelopeViewDocumentSettings showEditDocuments(String showEditDocuments) {
    this.showEditDocuments = showEditDocuments;
    return this;
  }

  /**
   * .
   * @return showEditDocuments
   **/
  @Schema(description = "")
  public String getShowEditDocuments() {
    return showEditDocuments;
  }

  /**
   * setShowEditDocuments.
   **/
  public void setShowEditDocuments(String showEditDocuments) {
    this.showEditDocuments = showEditDocuments;
  }


  /**
   * showEditDocumentVisibility.
   *
   * @return EnvelopeViewDocumentSettings
   **/
  public EnvelopeViewDocumentSettings showEditDocumentVisibility(String showEditDocumentVisibility) {
    this.showEditDocumentVisibility = showEditDocumentVisibility;
    return this;
  }

  /**
   * .
   * @return showEditDocumentVisibility
   **/
  @Schema(description = "")
  public String getShowEditDocumentVisibility() {
    return showEditDocumentVisibility;
  }

  /**
   * setShowEditDocumentVisibility.
   **/
  public void setShowEditDocumentVisibility(String showEditDocumentVisibility) {
    this.showEditDocumentVisibility = showEditDocumentVisibility;
  }


  /**
   * showEditPages.
   *
   * @return EnvelopeViewDocumentSettings
   **/
  public EnvelopeViewDocumentSettings showEditPages(String showEditPages) {
    this.showEditPages = showEditPages;
    return this;
  }

  /**
   * .
   * @return showEditPages
   **/
  @Schema(description = "")
  public String getShowEditPages() {
    return showEditPages;
  }

  /**
   * setShowEditPages.
   **/
  public void setShowEditPages(String showEditPages) {
    this.showEditPages = showEditPages;
  }


  /**
   * showSaveAsDocumentCustomField.
   *
   * @return EnvelopeViewDocumentSettings
   **/
  public EnvelopeViewDocumentSettings showSaveAsDocumentCustomField(String showSaveAsDocumentCustomField) {
    this.showSaveAsDocumentCustomField = showSaveAsDocumentCustomField;
    return this;
  }

  /**
   * .
   * @return showSaveAsDocumentCustomField
   **/
  @Schema(description = "")
  public String getShowSaveAsDocumentCustomField() {
    return showSaveAsDocumentCustomField;
  }

  /**
   * setShowSaveAsDocumentCustomField.
   **/
  public void setShowSaveAsDocumentCustomField(String showSaveAsDocumentCustomField) {
    this.showSaveAsDocumentCustomField = showSaveAsDocumentCustomField;
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
    EnvelopeViewDocumentSettings envelopeViewDocumentSettings = (EnvelopeViewDocumentSettings) o;
    return Objects.equals(this.showEditDocuments, envelopeViewDocumentSettings.showEditDocuments) &&
        Objects.equals(this.showEditDocumentVisibility, envelopeViewDocumentSettings.showEditDocumentVisibility) &&
        Objects.equals(this.showEditPages, envelopeViewDocumentSettings.showEditPages) &&
        Objects.equals(this.showSaveAsDocumentCustomField, envelopeViewDocumentSettings.showSaveAsDocumentCustomField);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(showEditDocuments, showEditDocumentVisibility, showEditPages, showSaveAsDocumentCustomField);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewDocumentSettings {\n");
    
    sb.append("    showEditDocuments: ").append(toIndentedString(showEditDocuments)).append("\n");
    sb.append("    showEditDocumentVisibility: ").append(toIndentedString(showEditDocumentVisibility)).append("\n");
    sb.append("    showEditPages: ").append(toIndentedString(showEditPages)).append("\n");
    sb.append("    showSaveAsDocumentCustomField: ").append(toIndentedString(showSaveAsDocumentCustomField)).append("\n");
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

