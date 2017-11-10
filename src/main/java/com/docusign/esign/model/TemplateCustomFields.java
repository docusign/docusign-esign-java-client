package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ListCustomField;
import com.docusign.esign.model.TextCustomField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateCustomFields
 */

public class TemplateCustomFields {
  @JsonProperty("listCustomFields")
  private java.util.List<ListCustomField> listCustomFields = new java.util.ArrayList<ListCustomField>();

  @JsonProperty("textCustomFields")
  private java.util.List<TextCustomField> textCustomFields = new java.util.ArrayList<TextCustomField>();

  public TemplateCustomFields listCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
    return this;
  }

  public TemplateCustomFields addListCustomFieldsItem(ListCustomField listCustomFieldsItem) {
    this.listCustomFields.add(listCustomFieldsItem);
    return this;
  }

   /**
   * An array of list custom fields.
   * @return listCustomFields
  **/
  @ApiModelProperty(example = "null", value = "An array of list custom fields.")
  public java.util.List<ListCustomField> getListCustomFields() {
    return listCustomFields;
  }

  public void setListCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
  }

  public TemplateCustomFields textCustomFields(java.util.List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
    return this;
  }

  public TemplateCustomFields addTextCustomFieldsItem(TextCustomField textCustomFieldsItem) {
    this.textCustomFields.add(textCustomFieldsItem);
    return this;
  }

   /**
   * An array of text custom fields.
   * @return textCustomFields
  **/
  @ApiModelProperty(example = "null", value = "An array of text custom fields.")
  public java.util.List<TextCustomField> getTextCustomFields() {
    return textCustomFields;
  }

  public void setTextCustomFields(java.util.List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateCustomFields templateCustomFields = (TemplateCustomFields) o;
    return Objects.equals(this.listCustomFields, templateCustomFields.listCustomFields) &&
        Objects.equals(this.textCustomFields, templateCustomFields.textCustomFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listCustomFields, textCustomFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCustomFields {\n");
    
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

