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
 * PowerFormFormDataRecipient
 */

public class PowerFormFormDataRecipient {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("formData")
  private java.util.List<NameValue> formData = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  public PowerFormFormDataRecipient email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PowerFormFormDataRecipient formData(java.util.List<NameValue> formData) {
    this.formData = formData;
    return this;
  }

  public PowerFormFormDataRecipient addFormDataItem(NameValue formDataItem) {
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

  public PowerFormFormDataRecipient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PowerFormFormDataRecipient recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerFormFormDataRecipient powerFormFormDataRecipient = (PowerFormFormDataRecipient) o;
    return Objects.equals(this.email, powerFormFormDataRecipient.email) &&
        Objects.equals(this.formData, powerFormFormDataRecipient.formData) &&
        Objects.equals(this.name, powerFormFormDataRecipient.name) &&
        Objects.equals(this.recipientId, powerFormFormDataRecipient.recipientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, formData, name, recipientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormFormDataRecipient {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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

