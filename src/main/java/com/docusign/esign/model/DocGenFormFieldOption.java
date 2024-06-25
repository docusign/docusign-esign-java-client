package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocGenFormFieldOption.
 *
 */

public class DocGenFormFieldOption implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("selected")
  private String selected = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * description.
   *
   * @return DocGenFormFieldOption
   **/
  public DocGenFormFieldOption description(String description) {
    this.description = description;
    return this;
  }

  /**
   * .
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * label.
   *
   * @return DocGenFormFieldOption
   **/
  public DocGenFormFieldOption label(String label) {
    this.label = label;
    return this;
  }

  /**
   * .
   * @return label
   **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  /**
   * setLabel.
   **/
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * selected.
   *
   * @return DocGenFormFieldOption
   **/
  public DocGenFormFieldOption selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * .
   * @return selected
   **/
  @Schema(description = "")
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
   * value.
   *
   * @return DocGenFormFieldOption
   **/
  public DocGenFormFieldOption value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   * @return value
   **/
  @Schema(description = "Specifies the value of the tab. ")
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
    DocGenFormFieldOption docGenFormFieldOption = (DocGenFormFieldOption) o;
    return Objects.equals(this.description, docGenFormFieldOption.description) &&
        Objects.equals(this.label, docGenFormFieldOption.label) &&
        Objects.equals(this.selected, docGenFormFieldOption.selected) &&
        Objects.equals(this.value, docGenFormFieldOption.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(description, label, selected, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenFormFieldOption {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

