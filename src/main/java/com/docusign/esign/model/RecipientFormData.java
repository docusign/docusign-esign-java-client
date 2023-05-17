package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.FormDataItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RecipientFormData.
 *
 */

public class RecipientFormData {
  @JsonProperty("DeclinedTime")
  private String declinedTime = null;

  @JsonProperty("DeliveredTime")
  private String deliveredTime = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("formData")
  private java.util.List<FormDataItem> formData = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("SentTime")
  private String sentTime = null;

  @JsonProperty("SignedTime")
  private String signedTime = null;


  /**
   * declinedTime.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData declinedTime(String declinedTime) {
    this.declinedTime = declinedTime;
    return this;
  }

  /**
   * .
   * @return declinedTime
   **/
  @Schema(description = "")
  public String getDeclinedTime() {
    return declinedTime;
  }

  /**
   * setDeclinedTime.
   **/
  public void setDeclinedTime(String declinedTime) {
    this.declinedTime = declinedTime;
  }


  /**
   * deliveredTime.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData deliveredTime(String deliveredTime) {
    this.deliveredTime = deliveredTime;
    return this;
  }

  /**
   * .
   * @return deliveredTime
   **/
  @Schema(description = "")
  public String getDeliveredTime() {
    return deliveredTime;
  }

  /**
   * setDeliveredTime.
   **/
  public void setDeliveredTime(String deliveredTime) {
    this.deliveredTime = deliveredTime;
  }


  /**
   * email.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * formData.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData formData(java.util.List<FormDataItem> formData) {
    this.formData = formData;
    return this;
  }
  
  /**
   * addFormDataItem.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData addFormDataItem(FormDataItem formDataItem) {
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
  @Schema(description = "")
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
   * name.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData name(String name) {
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
   * recipientId.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document..
   * @return recipientId
   **/
  @Schema(description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  /**
   * sentTime.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData sentTime(String sentTime) {
    this.sentTime = sentTime;
    return this;
  }

  /**
   * .
   * @return sentTime
   **/
  @Schema(description = "")
  public String getSentTime() {
    return sentTime;
  }

  /**
   * setSentTime.
   **/
  public void setSentTime(String sentTime) {
    this.sentTime = sentTime;
  }


  /**
   * signedTime.
   *
   * @return RecipientFormData
   **/
  public RecipientFormData signedTime(String signedTime) {
    this.signedTime = signedTime;
    return this;
  }

  /**
   * .
   * @return signedTime
   **/
  @Schema(description = "")
  public String getSignedTime() {
    return signedTime;
  }

  /**
   * setSignedTime.
   **/
  public void setSignedTime(String signedTime) {
    this.signedTime = signedTime;
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
    RecipientFormData recipientFormData = (RecipientFormData) o;
    return Objects.equals(this.declinedTime, recipientFormData.declinedTime) &&
        Objects.equals(this.deliveredTime, recipientFormData.deliveredTime) &&
        Objects.equals(this.email, recipientFormData.email) &&
        Objects.equals(this.formData, recipientFormData.formData) &&
        Objects.equals(this.name, recipientFormData.name) &&
        Objects.equals(this.recipientId, recipientFormData.recipientId) &&
        Objects.equals(this.sentTime, recipientFormData.sentTime) &&
        Objects.equals(this.signedTime, recipientFormData.signedTime);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(declinedTime, deliveredTime, email, formData, name, recipientId, sentTime, signedTime);
  }


  /**
   * Converts the given object to string.
   */
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

