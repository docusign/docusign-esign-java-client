package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ConnectedObjectDetails;
import com.docusign.esign.model.DocGenFormFieldOption;
import com.docusign.esign.model.DocGenFormFieldRowValue;
import com.docusign.esign.model.DocGenFormFieldValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocGenFormField.
 *
 */

public class DocGenFormField implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectedObjectDetails")
  private ConnectedObjectDetails connectedObjectDetails = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fullyQualifiedPath")
  private String fullyQualifiedPath = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("options")
  private java.util.List<DocGenFormFieldOption> options = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("predefinedValidation")
  private String predefinedValidation = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("rowValues")
  private java.util.List<DocGenFormFieldRowValue> rowValues = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("validation")
  private DocGenFormFieldValidation validation = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * connectedObjectDetails.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField connectedObjectDetails(ConnectedObjectDetails connectedObjectDetails) {
    this.connectedObjectDetails = connectedObjectDetails;
    return this;
  }

  /**
   * .
   * @return connectedObjectDetails
   **/
  @Schema(description = "")
  public ConnectedObjectDetails getConnectedObjectDetails() {
    return connectedObjectDetails;
  }

  /**
   * setConnectedObjectDetails.
   **/
  public void setConnectedObjectDetails(ConnectedObjectDetails connectedObjectDetails) {
    this.connectedObjectDetails = connectedObjectDetails;
  }


  /**
   * description.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField description(String description) {
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
   * fullyQualifiedPath.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField fullyQualifiedPath(String fullyQualifiedPath) {
    this.fullyQualifiedPath = fullyQualifiedPath;
    return this;
  }

  /**
   * .
   * @return fullyQualifiedPath
   **/
  @Schema(description = "")
  public String getFullyQualifiedPath() {
    return fullyQualifiedPath;
  }

  /**
   * setFullyQualifiedPath.
   **/
  public void setFullyQualifiedPath(String fullyQualifiedPath) {
    this.fullyQualifiedPath = fullyQualifiedPath;
  }


  /**
   * label.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField label(String label) {
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
   * name.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * options.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField options(java.util.List<DocGenFormFieldOption> options) {
    this.options = options;
    return this;
  }
  
  /**
   * addOptionsItem.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField addOptionsItem(DocGenFormFieldOption optionsItem) {
    if (this.options == null) {
      this.options = new java.util.ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * .
   * @return options
   **/
  @Schema(description = "")
  public java.util.List<DocGenFormFieldOption> getOptions() {
    return options;
  }

  /**
   * setOptions.
   **/
  public void setOptions(java.util.List<DocGenFormFieldOption> options) {
    this.options = options;
  }


  /**
   * order.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField order(String order) {
    this.order = order;
    return this;
  }

  /**
   * .
   * @return order
   **/
  @Schema(description = "")
  public String getOrder() {
    return order;
  }

  /**
   * setOrder.
   **/
  public void setOrder(String order) {
    this.order = order;
  }


  /**
   * predefinedValidation.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField predefinedValidation(String predefinedValidation) {
    this.predefinedValidation = predefinedValidation;
    return this;
  }

  /**
   * .
   * @return predefinedValidation
   **/
  @Schema(description = "")
  public String getPredefinedValidation() {
    return predefinedValidation;
  }

  /**
   * setPredefinedValidation.
   **/
  public void setPredefinedValidation(String predefinedValidation) {
    this.predefinedValidation = predefinedValidation;
  }


  /**
   * required.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   * @return required
   **/
  @Schema(description = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  /**
   * setRequired.
   **/
  public void setRequired(String required) {
    this.required = required;
  }


  /**
   * rowValues.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField rowValues(java.util.List<DocGenFormFieldRowValue> rowValues) {
    this.rowValues = rowValues;
    return this;
  }
  
  /**
   * addRowValuesItem.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField addRowValuesItem(DocGenFormFieldRowValue rowValuesItem) {
    if (this.rowValues == null) {
      this.rowValues = new java.util.ArrayList<>();
    }
    this.rowValues.add(rowValuesItem);
    return this;
  }

  /**
   * .
   * @return rowValues
   **/
  @Schema(description = "")
  public java.util.List<DocGenFormFieldRowValue> getRowValues() {
    return rowValues;
  }

  /**
   * setRowValues.
   **/
  public void setRowValues(java.util.List<DocGenFormFieldRowValue> rowValues) {
    this.rowValues = rowValues;
  }


  /**
   * type.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * .
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }


  /**
   * validation.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField validation(DocGenFormFieldValidation validation) {
    this.validation = validation;
    return this;
  }

  /**
   * .
   * @return validation
   **/
  @Schema(description = "")
  public DocGenFormFieldValidation getValidation() {
    return validation;
  }

  /**
   * setValidation.
   **/
  public void setValidation(DocGenFormFieldValidation validation) {
    this.validation = validation;
  }


  /**
   * value.
   *
   * @return DocGenFormField
   **/
  public DocGenFormField value(String value) {
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
    DocGenFormField docGenFormField = (DocGenFormField) o;
    return Objects.equals(this.connectedObjectDetails, docGenFormField.connectedObjectDetails) &&
        Objects.equals(this.description, docGenFormField.description) &&
        Objects.equals(this.fullyQualifiedPath, docGenFormField.fullyQualifiedPath) &&
        Objects.equals(this.label, docGenFormField.label) &&
        Objects.equals(this.name, docGenFormField.name) &&
        Objects.equals(this.options, docGenFormField.options) &&
        Objects.equals(this.order, docGenFormField.order) &&
        Objects.equals(this.predefinedValidation, docGenFormField.predefinedValidation) &&
        Objects.equals(this.required, docGenFormField.required) &&
        Objects.equals(this.rowValues, docGenFormField.rowValues) &&
        Objects.equals(this.type, docGenFormField.type) &&
        Objects.equals(this.validation, docGenFormField.validation) &&
        Objects.equals(this.value, docGenFormField.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(connectedObjectDetails, description, fullyQualifiedPath, label, name, options, order, predefinedValidation, required, rowValues, type, validation, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocGenFormField {\n");
    
    sb.append("    connectedObjectDetails: ").append(toIndentedString(connectedObjectDetails)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullyQualifiedPath: ").append(toIndentedString(fullyQualifiedPath)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    predefinedValidation: ").append(toIndentedString(predefinedValidation)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    rowValues: ").append(toIndentedString(rowValues)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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

