package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.FormDataItem;
import com.docusign.esign.model.PrefillFormData;
import com.docusign.esign.model.RecipientFormData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes the form data of the envelope..
 *
 */
@ApiModel(description = "Describes the form data of the envelope.")

public class EnvelopeFormData {
  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("formData")
  private java.util.List<FormDataItem> formData = null;

  @JsonProperty("prefillFormData")
  private PrefillFormData prefillFormData = null;

  @JsonProperty("recipientFormData")
  private java.util.List<RecipientFormData> recipientFormData = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("status")
  private String status = null;


  /**
   * emailSubject.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject..
   * @return emailSubject
   **/
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  /**
   * setEmailSubject.
   **/
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  /**
   * envelopeId.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post..
   * @return envelopeId
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  /**
   * setEnvelopeId.
   **/
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }


  /**
   * formData.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData formData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
    return this;
  }
  
  /**
   * addFormDataItem.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData addFormDataItem(FormDataItem formDataItem) {
    if (this.formData == null) {
      this.formData = new java.util.ArrayList<>();
    }
    this.formData.add(formDataItem);
    return this;
  }

  /**
   * .
   * @return formData
   **/
  @ApiModelProperty(value = "")
  public java.util.List<FormDataItem> getFormData() {
    return formData;
  }

  /**
   * setFormData.
   **/
  public void setFormData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
  }


  /**
   * prefillFormData.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData prefillFormData(PrefillFormData prefillFormData) {
    this.prefillFormData = prefillFormData;
    return this;
  }

  /**
   * An array of `formDataItem` objects for [prefill tabs](/docs/esign-rest-api/reference/envelopes/envelopedocumenttabs/create/#definition__tabs_prefilltabs). .
   * @return prefillFormData
   **/
  @ApiModelProperty(value = "An array of `formDataItem` objects for [prefill tabs](/docs/esign-rest-api/reference/envelopes/envelopedocumenttabs/create/#definition__tabs_prefilltabs). ")
  public PrefillFormData getPrefillFormData() {
    return prefillFormData;
  }

  /**
   * setPrefillFormData.
   **/
  public void setPrefillFormData(PrefillFormData prefillFormData) {
    this.prefillFormData = prefillFormData;
  }


  /**
   * recipientFormData.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData recipientFormData(java.util.List<RecipientFormData> recipientFormData) {
    this.recipientFormData = recipientFormData;
    return this;
  }
  
  /**
   * addRecipientFormDataItem.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData addRecipientFormDataItem(RecipientFormData recipientFormDataItem) {
    if (this.recipientFormData == null) {
      this.recipientFormData = new java.util.ArrayList<>();
    }
    this.recipientFormData.add(recipientFormDataItem);
    return this;
  }

  /**
   * .
   * @return recipientFormData
   **/
  @ApiModelProperty(value = "")
  public java.util.List<RecipientFormData> getRecipientFormData() {
    return recipientFormData;
  }

  /**
   * setRecipientFormData.
   **/
  public void setRecipientFormData(java.util.List<RecipientFormData> recipientFormData) {
    this.recipientFormData = recipientFormData;
  }


  /**
   * sentDateTime.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

  /**
   * The date and time the envelope was sent..
   * @return sentDateTime
   **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  /**
   * setSentDateTime.
   **/
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }


  /**
   * status.
   *
   * @return EnvelopeFormData
   **/
  public EnvelopeFormData status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later..
   * @return status
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
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
    EnvelopeFormData envelopeFormData = (EnvelopeFormData) o;
    return Objects.equals(this.emailSubject, envelopeFormData.emailSubject) &&
        Objects.equals(this.envelopeId, envelopeFormData.envelopeId) &&
        Objects.equals(this.formData, envelopeFormData.formData) &&
        Objects.equals(this.prefillFormData, envelopeFormData.prefillFormData) &&
        Objects.equals(this.recipientFormData, envelopeFormData.recipientFormData) &&
        Objects.equals(this.sentDateTime, envelopeFormData.sentDateTime) &&
        Objects.equals(this.status, envelopeFormData.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, envelopeId, formData, prefillFormData, recipientFormData, sentDateTime, status);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeFormData {\n");
    
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    prefillFormData: ").append(toIndentedString(prefillFormData)).append("\n");
    sb.append("    recipientFormData: ").append(toIndentedString(recipientFormData)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
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

