package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnvelopeFormDataPrefillFormData */
public class EnvelopeFormDataPrefillFormData {
  @JsonProperty("formData")
  private java.util.List<FormDataItem> formData = null;

  public EnvelopeFormDataPrefillFormData formData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
    return this;
  }

  public EnvelopeFormDataPrefillFormData addFormDataItem(FormDataItem formDataItem) {
    if (this.formData == null) {
      this.formData = new java.util.ArrayList<FormDataItem>();
    }
    this.formData.add(formDataItem);
    return this;
  }

  /** @return formData */
  @ApiModelProperty(value = "")
  public java.util.List<FormDataItem> getFormData() {
    return formData;
  }

  public void setFormData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeFormDataPrefillFormData envelopeFormDataPrefillFormData =
        (EnvelopeFormDataPrefillFormData) o;
    return Objects.equals(this.formData, envelopeFormDataPrefillFormData.formData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeFormDataPrefillFormData {\n");

    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
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
