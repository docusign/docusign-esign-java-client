package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class ListItem   {
  
  private String text = null;
  private String value = null;
  private String selected = null;

  
  /**
   * Specifies the text that is shown in the dropdown list.
   **/
  @ApiModelProperty(value = "Specifies the text that is shown in the dropdown list.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Specifies the value that is used when the list item is selected.
   **/
  @ApiModelProperty(value = "Specifies the value that is used when the list item is selected.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * When set to **true**, indicates that this item is the default selection shown to a signer. \n\nOnly one selection can be set as the default.
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this item is the default selection shown to a signer. \n\nOnly one selection can be set as the default.")
  @JsonProperty("selected")
  public String getSelected() {
    return selected;
  }
  public void setSelected(String selected) {
    this.selected = selected;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItem listItem = (ListItem) o;
    return Objects.equals(text, listItem.text) &&
        Objects.equals(value, listItem.value) &&
        Objects.equals(selected, listItem.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, value, selected);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    selected: ").append(StringUtil.toIndentedString(selected)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
