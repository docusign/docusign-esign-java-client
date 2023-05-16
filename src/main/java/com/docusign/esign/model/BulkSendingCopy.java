package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingCopyCustomField;
import com.docusign.esign.model.BulkSendingCopyRecipient;
import com.docusign.esign.model.BulksendingCopyDocGenFormField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains the details to use for a specific copy, or instance, of the envelope. When you send an envelope by using a bulk send list, you can customize these properties for each instance..
 *
 */
@Schema(description = "This object contains the details to use for a specific copy, or instance, of the envelope. When you send an envelope by using a bulk send list, you can customize these properties for each instance.")

public class BulkSendingCopy {
  @JsonProperty("customFields")
  private java.util.List<BulkSendingCopyCustomField> customFields = null;

  @JsonProperty("docGenFormFields")
  private java.util.List<BulksendingCopyDocGenFormField> docGenFormFields = null;

  @JsonProperty("emailBlurb")
  private String emailBlurb = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("recipients")
  private java.util.List<BulkSendingCopyRecipient> recipients = null;


  /**
   * customFields.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy customFields(java.util.List<BulkSendingCopyCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy addCustomFieldsItem(BulkSendingCopyCustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters..
   * @return customFields
   **/
  @Schema(description = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<BulkSendingCopyCustomField> getCustomFields() {
    return customFields;
  }

  /**
   * setCustomFields.
   **/
  public void setCustomFields(java.util.List<BulkSendingCopyCustomField> customFields) {
    this.customFields = customFields;
  }


  /**
   * docGenFormFields.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy docGenFormFields(java.util.List<BulksendingCopyDocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
    return this;
  }
  
  /**
   * addDocGenFormFieldsItem.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy addDocGenFormFieldsItem(BulksendingCopyDocGenFormField docGenFormFieldsItem) {
    if (this.docGenFormFields == null) {
      this.docGenFormFields = new java.util.ArrayList<>();
    }
    this.docGenFormFields.add(docGenFormFieldsItem);
    return this;
  }

  /**
   * .
   * @return docGenFormFields
   **/
  @Schema(description = "")
  public java.util.List<BulksendingCopyDocGenFormField> getDocGenFormFields() {
    return docGenFormFields;
  }

  /**
   * setDocGenFormFields.
   **/
  public void setDocGenFormFields(java.util.List<BulksendingCopyDocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
  }


  /**
   * emailBlurb.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy emailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
    return this;
  }

  /**
   * .
   * @return emailBlurb
   **/
  @Schema(description = "")
  public String getEmailBlurb() {
    return emailBlurb;
  }

  /**
   * setEmailBlurb.
   **/
  public void setEmailBlurb(String emailBlurb) {
    this.emailBlurb = emailBlurb;
  }


  /**
   * emailSubject.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject..
   * @return emailSubject
   **/
  @Schema(description = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
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
   * recipients.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy recipients(java.util.List<BulkSendingCopyRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }
  
  /**
   * addRecipientsItem.
   *
   * @return BulkSendingCopy
   **/
  public BulkSendingCopy addRecipientsItem(BulkSendingCopyRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * An array of powerform recipients..
   * @return recipients
   **/
  @Schema(description = "An array of powerform recipients.")
  public java.util.List<BulkSendingCopyRecipient> getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(java.util.List<BulkSendingCopyRecipient> recipients) {
    this.recipients = recipients;
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
    BulkSendingCopy bulkSendingCopy = (BulkSendingCopy) o;
    return Objects.equals(this.customFields, bulkSendingCopy.customFields) &&
        Objects.equals(this.docGenFormFields, bulkSendingCopy.docGenFormFields) &&
        Objects.equals(this.emailBlurb, bulkSendingCopy.emailBlurb) &&
        Objects.equals(this.emailSubject, bulkSendingCopy.emailSubject) &&
        Objects.equals(this.recipients, bulkSendingCopy.recipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(customFields, docGenFormFields, emailBlurb, emailSubject, recipients);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingCopy {\n");
    
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    docGenFormFields: ").append(toIndentedString(docGenFormFields)).append("\n");
    sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

