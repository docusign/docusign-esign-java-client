package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ListCustomField;
import com.docusign.esign.model.TextCustomField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class CustomFieldsEnvelope   {
  
  private java.util.List<ListCustomField> listCustomFields = new java.util.ArrayList<ListCustomField>();
  private java.util.List<TextCustomField> textCustomFields = new java.util.ArrayList<TextCustomField>();

  
  /**
   * An array of list custom fields.
   **/
  
  @ApiModelProperty(value = "An array of list custom fields.")
  @JsonProperty("listCustomFields")
  public java.util.List<ListCustomField> getListCustomFields() {
    return listCustomFields;
  }
  public void setListCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
  }

  
  /**
   * An array of text custom fields.
   **/
  
  @ApiModelProperty(value = "An array of text custom fields.")
  @JsonProperty("textCustomFields")
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
    CustomFieldsEnvelope customFieldsEnvelope = (CustomFieldsEnvelope) o;

    return true && Objects.equals(listCustomFields, customFieldsEnvelope.listCustomFields) &&
        Objects.equals(textCustomFields, customFieldsEnvelope.textCustomFields)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(listCustomFields, textCustomFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsEnvelope {\n");
    
    if (listCustomFields != null)
      sb.append("    listCustomFields: ").append(toIndentedString(listCustomFields)).append("\n");
    if (textCustomFields != null)
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

