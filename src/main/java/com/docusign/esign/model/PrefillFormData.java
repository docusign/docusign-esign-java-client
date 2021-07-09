package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.FormDataItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PrefillFormData
 */

public class PrefillFormData {
  @JsonProperty("formData")
  private java.util.List<FormDataItem> formData = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("senderUserId")
  private String senderUserId = null;

  public PrefillFormData formData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
    return this;
  }

  public PrefillFormData addFormDataItem(FormDataItem formDataItem) {
    if (this.formData == null) {
      this.formData = new java.util.ArrayList<FormDataItem>();
    }
    this.formData.add(formDataItem);
    return this;
  }

   /**
   * 
   * @return formData
  **/
  @ApiModelProperty(value = "")
  public java.util.List<FormDataItem> getFormData() {
    return formData;
  }

  public void setFormData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
  }

  public PrefillFormData senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * 
   * @return senderEmail
  **/
  @ApiModelProperty(value = "")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public PrefillFormData senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * 
   * @return senderName
  **/
  @ApiModelProperty(value = "")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public PrefillFormData senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

   /**
   * 
   * @return senderUserId
  **/
  @ApiModelProperty(value = "")
  public String getSenderUserId() {
    return senderUserId;
  }

  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefillFormData prefillFormData = (PrefillFormData) o;
    return Objects.equals(this.formData, prefillFormData.formData) &&
        Objects.equals(this.senderEmail, prefillFormData.senderEmail) &&
        Objects.equals(this.senderName, prefillFormData.senderName) &&
        Objects.equals(this.senderUserId, prefillFormData.senderUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formData, senderEmail, senderName, senderUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefillFormData {\n");
    
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
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

