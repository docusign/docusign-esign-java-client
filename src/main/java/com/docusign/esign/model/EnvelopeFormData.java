package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.RecipientFormData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeFormData   {
  
  private String emailSubject = null;
  private String envelopeId = null;
  private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();
  private java.util.List<RecipientFormData> recipientFormData = new java.util.ArrayList<RecipientFormData>();
  private String sentDateTime = null;
  private String status = null;

  
  /**
   * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   **/
  
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  @JsonProperty("emailSubject")
  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
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
  @JsonProperty("recipientFormData")
  public java.util.List<RecipientFormData> getRecipientFormData() {
    return recipientFormData;
  }
  public void setRecipientFormData(java.util.List<RecipientFormData> recipientFormData) {
    this.recipientFormData = recipientFormData;
  }

  
  /**
   * The date and time the envelope was sent.
   **/
  
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  @JsonProperty("sentDateTime")
  public String getSentDateTime() {
    return sentDateTime;
  }
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeFormData envelopeFormData = (EnvelopeFormData) o;

    return true && Objects.equals(emailSubject, envelopeFormData.emailSubject) &&
        Objects.equals(envelopeId, envelopeFormData.envelopeId) &&
        Objects.equals(formData, envelopeFormData.formData) &&
        Objects.equals(recipientFormData, envelopeFormData.recipientFormData) &&
        Objects.equals(sentDateTime, envelopeFormData.sentDateTime) &&
        Objects.equals(status, envelopeFormData.status)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, envelopeId, formData, recipientFormData, sentDateTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeFormData {\n");
    
    if (emailSubject != null)
      sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (formData != null)
      sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    if (recipientFormData != null)
      sb.append("    recipientFormData: ").append(toIndentedString(recipientFormData)).append("\n");
    if (sentDateTime != null)
      sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

