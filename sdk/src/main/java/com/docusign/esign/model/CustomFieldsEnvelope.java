package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.TextCustomField;
import com.docusign.esign.model.ListCustomField;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class CustomFieldsEnvelope   {
  
  private java.util.List<TextCustomField> textCustomFields = new java.util.ArrayList<TextCustomField>();
  private java.util.List<ListCustomField> listCustomFields = new java.util.ArrayList<ListCustomField>();

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsEnvelope customFieldsEnvelope = (CustomFieldsEnvelope) o;
    return Objects.equals(textCustomFields, customFieldsEnvelope.textCustomFields) &&
        Objects.equals(listCustomFields, customFieldsEnvelope.listCustomFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textCustomFields, listCustomFields);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsEnvelope {\n");
    
    sb.append("    textCustomFields: ").append(StringUtil.toIndentedString(textCustomFields)).append("\n");
    sb.append("    listCustomFields: ").append(StringUtil.toIndentedString(listCustomFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
