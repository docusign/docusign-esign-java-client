package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PowerFormFormDataRecipient   {
  
  private String email = null;
  private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();
  private String name = null;
  private String recipientId = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("formData")
  public java.util.List<NameValue> getFormData() {
    return formData;
  }
  public void setFormData(java.util.List<NameValue> formData) {
    this.formData = formData;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
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

    return true && Objects.equals(email, powerFormFormDataRecipient.email) &&
        Objects.equals(formData, powerFormFormDataRecipient.formData) &&
        Objects.equals(name, powerFormFormDataRecipient.name) &&
        Objects.equals(recipientId, powerFormFormDataRecipient.recipientId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, formData, name, recipientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormFormDataRecipient {\n");
    
    if (email != null)
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
    if (formData != null)
      sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (recipientId != null)
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

