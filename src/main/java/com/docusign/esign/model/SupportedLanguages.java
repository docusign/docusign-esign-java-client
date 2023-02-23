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
 * A list of supported languages..
 *
 */
@Schema(description = "A list of supported languages.")

public class SupportedLanguages {
  @JsonProperty("languages")
  private java.util.List<NameValue> languages = null;

  /**
   * languages.
   *
   * @return SupportedLanguages
   **/
  public SupportedLanguages languages(java.util.List<NameValue> languages) {
    this.languages = languages;
    return this;
  }

  /**
   * addLanguagesItem.
   *
   * @return SupportedLanguages
   **/
  public SupportedLanguages addLanguagesItem(NameValue languagesItem) {
    if (this.languages == null) {
      this.languages = new java.util.ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * .
   * 
   * @return languages
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getLanguages() {
    return languages;
  }

  /**
   * setLanguages.
   **/
  public void setLanguages(java.util.List<NameValue> languages) {
    this.languages = languages;
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
    SupportedLanguages supportedLanguages = (SupportedLanguages) o;
    return Objects.equals(this.languages, supportedLanguages.languages);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(languages);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguages {\n");

    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
