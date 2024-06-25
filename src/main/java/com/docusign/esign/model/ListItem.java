package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * One of the selectable items in the &#x60;listItems&#x60; property of a [&#x60;list&#x60;](/docs/esign-rest-api/reference/envelopes/enveloperecipienttabs/create/) tab..
 *
 */
@Schema(description = "One of the selectable items in the `listItems` property of a [`list`](/docs/esign-rest-api/reference/envelopes/enveloperecipienttabs/create/) tab.")

public class ListItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("selected")
  private String selected = null;

  @JsonProperty("selectedMetadata")
  private PropertyMetadata selectedMetadata = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("textMetadata")
  private PropertyMetadata textMetadata = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueMetadata")
  private PropertyMetadata valueMetadata = null;


  /**
   * selected.
   *
   * @return ListItem
   **/
  public ListItem selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * When set to **true**, indicates that this item is the default selection shown to a signer.   Only one selection can be set as the default..
   * @return selected
   **/
  @Schema(description = "When set to **true**, indicates that this item is the default selection shown to a signer.   Only one selection can be set as the default.")
  public String getSelected() {
    return selected;
  }

  /**
   * setSelected.
   **/
  public void setSelected(String selected) {
    this.selected = selected;
  }


  /**
   * selectedMetadata.
   *
   * @return ListItem
   **/
  public ListItem selectedMetadata(PropertyMetadata selectedMetadata) {
    this.selectedMetadata = selectedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `selected` property is editable..
   * @return selectedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `selected` property is editable.")
  public PropertyMetadata getSelectedMetadata() {
    return selectedMetadata;
  }

  /**
   * setSelectedMetadata.
   **/
  public void setSelectedMetadata(PropertyMetadata selectedMetadata) {
    this.selectedMetadata = selectedMetadata;
  }


  /**
   * text.
   *
   * @return ListItem
   **/
  public ListItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Specifies the text that is shown in the dropdown list. .
   * @return text
   **/
  @Schema(description = "Specifies the text that is shown in the dropdown list. ")
  public String getText() {
    return text;
  }

  /**
   * setText.
   **/
  public void setText(String text) {
    this.text = text;
  }


  /**
   * textMetadata.
   *
   * @return ListItem
   **/
  public ListItem textMetadata(PropertyMetadata textMetadata) {
    this.textMetadata = textMetadata;
    return this;
  }

  /**
   * .
   * @return textMetadata
   **/
  @Schema(description = "")
  public PropertyMetadata getTextMetadata() {
    return textMetadata;
  }

  /**
   * setTextMetadata.
   **/
  public void setTextMetadata(PropertyMetadata textMetadata) {
    this.textMetadata = textMetadata;
  }


  /**
   * value.
   *
   * @return ListItem
   **/
  public ListItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value that is used when the list item is selected..
   * @return value
   **/
  @Schema(description = "Specifies the value that is used when the list item is selected.")
  public String getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * valueMetadata.
   *
   * @return ListItem
   **/
  public ListItem valueMetadata(PropertyMetadata valueMetadata) {
    this.valueMetadata = valueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `value` property is editable..
   * @return valueMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `value` property is editable.")
  public PropertyMetadata getValueMetadata() {
    return valueMetadata;
  }

  /**
   * setValueMetadata.
   **/
  public void setValueMetadata(PropertyMetadata valueMetadata) {
    this.valueMetadata = valueMetadata;
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
    ListItem listItem = (ListItem) o;
    return Objects.equals(this.selected, listItem.selected) &&
        Objects.equals(this.selectedMetadata, listItem.selectedMetadata) &&
        Objects.equals(this.text, listItem.text) &&
        Objects.equals(this.textMetadata, listItem.textMetadata) &&
        Objects.equals(this.value, listItem.value) &&
        Objects.equals(this.valueMetadata, listItem.valueMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(selected, selectedMetadata, text, textMetadata, value, valueMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    selectedMetadata: ").append(toIndentedString(selectedMetadata)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textMetadata: ").append(toIndentedString(textMetadata)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueMetadata: ").append(toIndentedString(valueMetadata)).append("\n");
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

