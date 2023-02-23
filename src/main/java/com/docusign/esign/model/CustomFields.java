package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ListCustomField;
import com.docusign.esign.model.TextCustomField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains information about custom fields..
 *
 */
@Schema(description = "Contains information about custom fields.")

public class CustomFields {
  @JsonProperty("listCustomFields")
  private java.util.List<ListCustomField> listCustomFields = null;

  @JsonProperty("textCustomFields")
  private java.util.List<TextCustomField> textCustomFields = null;

  /**
   * listCustomFields.
   *
   * @return CustomFields
   **/
  public CustomFields listCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
    return this;
  }

  /**
   * addListCustomFieldsItem.
   *
   * @return CustomFields
   **/
  public CustomFields addListCustomFieldsItem(ListCustomField listCustomFieldsItem) {
    if (this.listCustomFields == null) {
      this.listCustomFields = new java.util.ArrayList<>();
    }
    this.listCustomFields.add(listCustomFieldsItem);
    return this;
  }

  /**
   * An array of list custom fields..
   * 
   * @return listCustomFields
   **/
  @Schema(description = "An array of list custom fields.")
  public java.util.List<ListCustomField> getListCustomFields() {
    return listCustomFields;
  }

  /**
   * setListCustomFields.
   **/
  public void setListCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
  }

  /**
   * textCustomFields.
   *
   * @return CustomFields
   **/
  public CustomFields textCustomFields(java.util.List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
    return this;
  }

  /**
   * addTextCustomFieldsItem.
   *
   * @return CustomFields
   **/
  public CustomFields addTextCustomFieldsItem(TextCustomField textCustomFieldsItem) {
    if (this.textCustomFields == null) {
      this.textCustomFields = new java.util.ArrayList<>();
    }
    this.textCustomFields.add(textCustomFieldsItem);
    return this;
  }

  /**
   * An array of text custom fields..
   * 
   * @return textCustomFields
   **/
  @Schema(description = "An array of text custom fields.")
  public java.util.List<TextCustomField> getTextCustomFields() {
    return textCustomFields;
  }

  /**
   * setTextCustomFields.
   **/
  public void setTextCustomFields(java.util.List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
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
    CustomFields customFields = (CustomFields) o;
    return Objects.equals(this.listCustomFields, customFields.listCustomFields) &&
        Objects.equals(this.textCustomFields, customFields.textCustomFields);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(listCustomFields, textCustomFields);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFields {\n");

    sb.append("    listCustomFields: ").append(toIndentedString(listCustomFields)).append("\n");
    sb.append("    textCustomFields: ").append(toIndentedString(textCustomFields)).append("\n");
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
