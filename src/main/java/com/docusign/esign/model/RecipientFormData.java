package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-02T23:49:11.300-08:00")
public class RecipientFormData   {
  
  private String declinedTime = null;
  private String deliveredTime = null;
  private String email = null;
  private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();
  private String name = null;
  private String recipientId = null;
  private String sentTime = null;
  private String signedTime = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("declinedTime")
  public String getDeclinedTime() {
    return declinedTime;
  }
  public void setDeclinedTime(String declinedTime) {
    this.declinedTime = declinedTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveredTime")
  public String getDeliveredTime() {
    return deliveredTime;
  }
  public void setDeliveredTime(String deliveredTime) {
    this.deliveredTime = deliveredTime;
  }

  
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sentTime")
  public String getSentTime() {
    return sentTime;
  }
  public void setSentTime(String sentTime) {
    this.sentTime = sentTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signedTime")
  public String getSignedTime() {
    return signedTime;
  }
  public void setSignedTime(String signedTime) {
    this.signedTime = signedTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientFormData recipientFormData = (RecipientFormData) o;

    return true && Objects.equals(declinedTime, recipientFormData.declinedTime) &&
        Objects.equals(deliveredTime, recipientFormData.deliveredTime) &&
        Objects.equals(email, recipientFormData.email) &&
        Objects.equals(formData, recipientFormData.formData) &&
        Objects.equals(name, recipientFormData.name) &&
        Objects.equals(recipientId, recipientFormData.recipientId) &&
        Objects.equals(sentTime, recipientFormData.sentTime) &&
        Objects.equals(signedTime, recipientFormData.signedTime)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(declinedTime, deliveredTime, email, formData, name, recipientId, sentTime, signedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientFormData {\n");
    
    sb.append("    declinedTime: ").append(toIndentedString(declinedTime)).append("\n");
    sb.append("    deliveredTime: ").append(toIndentedString(deliveredTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
    sb.append("    signedTime: ").append(toIndentedString(signedTime)).append("\n");
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

