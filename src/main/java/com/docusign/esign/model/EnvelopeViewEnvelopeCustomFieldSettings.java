package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeViewEnvelopeCustomFieldSettings.
 *
 */

public class EnvelopeViewEnvelopeCustomFieldSettings {
  @JsonProperty("showEnvelopeCustomFields")
  private String showEnvelopeCustomFields = null;


  /**
   * showEnvelopeCustomFields.
   *
   * @return EnvelopeViewEnvelopeCustomFieldSettings
   **/
  public EnvelopeViewEnvelopeCustomFieldSettings showEnvelopeCustomFields(String showEnvelopeCustomFields) {
    this.showEnvelopeCustomFields = showEnvelopeCustomFields;
    return this;
  }

  /**
   * .
   * @return showEnvelopeCustomFields
   **/
  @Schema(description = "")
  public String getShowEnvelopeCustomFields() {
    return showEnvelopeCustomFields;
  }

  /**
   * setShowEnvelopeCustomFields.
   **/
  public void setShowEnvelopeCustomFields(String showEnvelopeCustomFields) {
    this.showEnvelopeCustomFields = showEnvelopeCustomFields;
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
    EnvelopeViewEnvelopeCustomFieldSettings envelopeViewEnvelopeCustomFieldSettings = (EnvelopeViewEnvelopeCustomFieldSettings) o;
    return Objects.equals(this.showEnvelopeCustomFields, envelopeViewEnvelopeCustomFieldSettings.showEnvelopeCustomFields);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(showEnvelopeCustomFields);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeViewEnvelopeCustomFieldSettings {\n");
    
    sb.append("    showEnvelopeCustomFields: ").append(toIndentedString(showEnvelopeCustomFields)).append("\n");
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

