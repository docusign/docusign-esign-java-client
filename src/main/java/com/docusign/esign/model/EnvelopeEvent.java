package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * For which envelope events should your webhook be called?.
 *
 */
@Schema(description = "For which envelope events should your webhook be called?")

public class EnvelopeEvent {
  @JsonProperty("envelopeEventStatusCode")
  private String envelopeEventStatusCode = null;

  @JsonProperty("includeDocuments")
  private String includeDocuments = null;


  /**
   * envelopeEventStatusCode.
   *
   * @return EnvelopeEvent
   **/
  public EnvelopeEvent envelopeEventStatusCode(String envelopeEventStatusCode) {
    this.envelopeEventStatusCode = envelopeEventStatusCode;
    return this;
  }

  /**
   * he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided..
   * @return envelopeEventStatusCode
   **/
  @Schema(description = "he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.")
  public String getEnvelopeEventStatusCode() {
    return envelopeEventStatusCode;
  }

  /**
   * setEnvelopeEventStatusCode.
   **/
  public void setEnvelopeEventStatusCode(String envelopeEventStatusCode) {
    this.envelopeEventStatusCode = envelopeEventStatusCode;
  }


  /**
   * includeDocuments.
   *
   * @return EnvelopeEvent
   **/
  public EnvelopeEvent includeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
    return this;
  }

  /**
   * When set to **true**, the PDF documents are included in the message along with the updated XML. .
   * @return includeDocuments
   **/
  @Schema(description = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
  public String getIncludeDocuments() {
    return includeDocuments;
  }

  /**
   * setIncludeDocuments.
   **/
  public void setIncludeDocuments(String includeDocuments) {
    this.includeDocuments = includeDocuments;
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
    EnvelopeEvent envelopeEvent = (EnvelopeEvent) o;
    return Objects.equals(this.envelopeEventStatusCode, envelopeEvent.envelopeEventStatusCode) &&
        Objects.equals(this.includeDocuments, envelopeEvent.includeDocuments);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeEventStatusCode, includeDocuments);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeEvent {\n");
    
    sb.append("    envelopeEventStatusCode: ").append(toIndentedString(envelopeEventStatusCode)).append("\n");
    sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
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

