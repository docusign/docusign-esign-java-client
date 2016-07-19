package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ListCustomField;
import com.docusign.esign.model.TextCustomField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class TemplateCustomFields   {
  
  private java.util.List<TextCustomField> textCustomFields = new java.util.ArrayList<TextCustomField>();
  private java.util.List<ListCustomField> listCustomFields = new java.util.ArrayList<ListCustomField>();

  
  /**
   * An array of text custom fields.
   **/
  public TemplateCustomFields textCustomFields(java.util.List<TextCustomField> textCustomFields) {
    this.textCustomFields = textCustomFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of text custom fields.")
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
  public TemplateCustomFields listCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of list custom fields.")
  @JsonProperty("listCustomFields")
  public java.util.List<ListCustomField> getListCustomFields() {
    return listCustomFields;
  }
  public void setListCustomFields(java.util.List<ListCustomField> listCustomFields) {
    this.listCustomFields = listCustomFields;
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
    return Objects.equals(this.textCustomFields, templateCustomFields.textCustomFields) &&
        Objects.equals(this.listCustomFields, templateCustomFields.listCustomFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textCustomFields, listCustomFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCustomFields {\n");
    
    sb.append("    textCustomFields: ").append(toIndentedString(textCustomFields)).append("\n");
    sb.append("    listCustomFields: ").append(toIndentedString(listCustomFields)).append("\n");
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

