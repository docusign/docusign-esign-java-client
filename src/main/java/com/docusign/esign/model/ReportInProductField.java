package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReportInProductField. */
public class ReportInProductField {
  @JsonProperty("displayOrder")
  private String displayOrder = null;

  @JsonProperty("fieldVersion")
  private String fieldVersion = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("selected")
  private String selected = null;

  /**
   * displayOrder.
   *
   * @return ReportInProductField
   */
  public ReportInProductField displayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * .
   *
   * @return displayOrder
   */
  @ApiModelProperty(value = "")
  public String getDisplayOrder() {
    return displayOrder;
  }

  /** setDisplayOrder. */
  public void setDisplayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * fieldVersion.
   *
   * @return ReportInProductField
   */
  public ReportInProductField fieldVersion(String fieldVersion) {
    this.fieldVersion = fieldVersion;
    return this;
  }

  /**
   * .
   *
   * @return fieldVersion
   */
  @ApiModelProperty(value = "")
  public String getFieldVersion() {
    return fieldVersion;
  }

  /** setFieldVersion. */
  public void setFieldVersion(String fieldVersion) {
    this.fieldVersion = fieldVersion;
  }

  /**
   * name.
   *
   * @return ReportInProductField
   */
  public ReportInProductField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * selected.
   *
   * @return ReportInProductField
   */
  public ReportInProductField selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * .
   *
   * @return selected
   */
  @ApiModelProperty(value = "")
  public String getSelected() {
    return selected;
  }

  /** setSelected. */
  public void setSelected(String selected) {
    this.selected = selected;
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
    ReportInProductField reportInProductField = (ReportInProductField) o;
    return Objects.equals(this.displayOrder, reportInProductField.displayOrder)
        && Objects.equals(this.fieldVersion, reportInProductField.fieldVersion)
        && Objects.equals(this.name, reportInProductField.name)
        && Objects.equals(this.selected, reportInProductField.selected);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, fieldVersion, name, selected);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInProductField {\n");

    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    fieldVersion: ").append(toIndentedString(fieldVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
