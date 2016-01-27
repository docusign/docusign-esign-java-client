package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-18T16:25:36.433-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItem listItem = (ListItem) o;

    return true && Objects.equals(text, listItem.text) &&
        Objects.equals(value, listItem.value) &&
        Objects.equals(selected, listItem.selected)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, value, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

