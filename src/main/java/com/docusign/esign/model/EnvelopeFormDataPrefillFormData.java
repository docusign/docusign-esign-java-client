package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeFormDataPrefillFormData
 */

public class EnvelopeFormDataPrefillFormData {
  @JsonProperty("formData")
  private java.util.List<NameValue> formData = null;

  public EnvelopeFormDataPrefillFormData formData(java.util.List<NameValue> formData) {
    this.formData = formData;
    return this;
  }

  public EnvelopeFormDataPrefillFormData addFormDataItem(NameValue formDataItem) {
    if (this.formData == null) {
      this.formData = new java.util.ArrayList<NameValue>();
    }
    this.formData.add(formDataItem);
    return this;
  }

   /**
   * 
   * @return formData
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NameValue> getFormData() {
    return formData;
  }

  public void setFormData(java.util.List<NameValue> formData) {
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
    EnvelopeFormDataPrefillFormData envelopeFormDataPrefillFormData = (EnvelopeFormDataPrefillFormData) o;
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

