package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.CustomFieldV2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FolderItem.
 *
 */

public class FolderItem {
  @JsonProperty("completedDateTime")
  private String completedDateTime = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("customFields")
  private java.util.List<CustomFieldV2> customFields = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("envelopeUri")
  private String envelopeUri = null;

  @JsonProperty("is21CFRPart11")
  private String is21CFRPart11 = null;

  @JsonProperty("isSignatureProviderEnvelope")
  private String isSignatureProviderEnvelope = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * completedDateTime.
   *
   * @return FolderItem
   **/
  public FolderItem completedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
    return this;
  }

  /**
   * Specifies the date and time this item was completed..
   * @return completedDateTime
   **/
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  public String getCompletedDateTime() {
    return completedDateTime;
  }

  /**
   * setCompletedDateTime.
   **/
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }


  /**
   * createdDateTime.
   *
   * @return FolderItem
   **/
  public FolderItem createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Indicates the date and time the item was created..
   * @return createdDateTime
   **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * customFields.
   *
   * @return FolderItem
   **/
  public FolderItem customFields(java.util.List<CustomFieldV2> customFields) {
    this.customFields = customFields;
    return this;
  }
  
  /**
   * addCustomFieldsItem.
   *
   * @return FolderItem
   **/
  public FolderItem addCustomFieldsItem(CustomFieldV2 customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new java.util.ArrayList<CustomFieldV2>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters..
   * @return customFields
   **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<CustomFieldV2> getCustomFields() {
    return customFields;
  }

  /**
   * setCustomFields.
   **/
  public void setCustomFields(java.util.List<CustomFieldV2> customFields) {
    this.customFields = customFields;
  }


  /**
   * description.
   *
   * @return FolderItem
   **/
  public FolderItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * .
   * @return description
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * envelopeId.
   *
   * @return FolderItem
   **/
  public FolderItem envelopeId(String envelopeId) {
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
   * envelopeUri.
   *
   * @return FolderItem
   **/
  public FolderItem envelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
    return this;
  }

  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes..
   * @return envelopeUri
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  public String getEnvelopeUri() {
    return envelopeUri;
  }

  /**
   * setEnvelopeUri.
   **/
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }


  /**
   * is21CFRPart11.
   *
   * @return FolderItem
   **/
  public FolderItem is21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
    return this;
  }

  /**
   * When set to **true**, indicates that this module is enabled on the account..
   * @return is21CFRPart11
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }

  /**
   * setIs21CFRPart11.
   **/
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }


  /**
   * isSignatureProviderEnvelope.
   *
   * @return FolderItem
   **/
  public FolderItem isSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    return this;
  }

  /**
   * .
   * @return isSignatureProviderEnvelope
   **/
  @ApiModelProperty(value = "")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }

  /**
   * setIsSignatureProviderEnvelope.
   **/
  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }


  /**
   * lastModified.
   *
   * @return FolderItem
   **/
  public FolderItem lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * .
   * @return lastModified
   **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  /**
   * setLastModified.
   **/
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  /**
   * name.
   *
   * @return FolderItem
   **/
  public FolderItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
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
   * ownerName.
   *
   * @return FolderItem
   **/
  public FolderItem ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Name of the envelope owner..
   * @return ownerName
   **/
  @ApiModelProperty(value = "Name of the envelope owner.")
  public String getOwnerName() {
    return ownerName;
  }

  /**
   * setOwnerName.
   **/
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  /**
   * pageCount.
   *
   * @return FolderItem
   **/
  public FolderItem pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * .
   * @return pageCount
   **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  /**
   * setPageCount.
   **/
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  /**
   * password.
   *
   * @return FolderItem
   **/
  public FolderItem password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * senderEmail.
   *
   * @return FolderItem
   **/
  public FolderItem senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

  /**
   * .
   * @return senderEmail
   **/
  @ApiModelProperty(value = "")
  public String getSenderEmail() {
    return senderEmail;
  }

  /**
   * setSenderEmail.
   **/
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  /**
   * senderName.
   *
   * @return FolderItem
   **/
  public FolderItem senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

  /**
   * Name of the envelope sender..
   * @return senderName
   **/
  @ApiModelProperty(value = "Name of the envelope sender.")
  public String getSenderName() {
    return senderName;
  }

  /**
   * setSenderName.
   **/
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  /**
   * sentDateTime.
   *
   * @return FolderItem
   **/
  public FolderItem sentDateTime(String sentDateTime) {
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
   * shared.
   *
   * @return FolderItem
   **/
  public FolderItem shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * @return shared
   **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /**
   * setShared.
   **/
  public void setShared(String shared) {
    this.shared = shared;
  }


  /**
   * status.
   *
   * @return FolderItem
   **/
  public FolderItem status(String status) {
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
   * subject.
   *
   * @return FolderItem
   **/
  public FolderItem subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * .
   * @return subject
   **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  /**
   * setSubject.
   **/
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * templateId.
   *
   * @return FolderItem
   **/
  public FolderItem templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. .
   * @return templateId
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * uri.
   *
   * @return FolderItem
   **/
  public FolderItem uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @ApiModelProperty(value = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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
    FolderItem folderItem = (FolderItem) o;
    return Objects.equals(this.completedDateTime, folderItem.completedDateTime) &&
        Objects.equals(this.createdDateTime, folderItem.createdDateTime) &&
        Objects.equals(this.customFields, folderItem.customFields) &&
        Objects.equals(this.description, folderItem.description) &&
        Objects.equals(this.envelopeId, folderItem.envelopeId) &&
        Objects.equals(this.envelopeUri, folderItem.envelopeUri) &&
        Objects.equals(this.is21CFRPart11, folderItem.is21CFRPart11) &&
        Objects.equals(this.isSignatureProviderEnvelope, folderItem.isSignatureProviderEnvelope) &&
        Objects.equals(this.lastModified, folderItem.lastModified) &&
        Objects.equals(this.name, folderItem.name) &&
        Objects.equals(this.ownerName, folderItem.ownerName) &&
        Objects.equals(this.pageCount, folderItem.pageCount) &&
        Objects.equals(this.password, folderItem.password) &&
        Objects.equals(this.senderEmail, folderItem.senderEmail) &&
        Objects.equals(this.senderName, folderItem.senderName) &&
        Objects.equals(this.sentDateTime, folderItem.sentDateTime) &&
        Objects.equals(this.shared, folderItem.shared) &&
        Objects.equals(this.status, folderItem.status) &&
        Objects.equals(this.subject, folderItem.subject) &&
        Objects.equals(this.templateId, folderItem.templateId) &&
        Objects.equals(this.uri, folderItem.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(completedDateTime, createdDateTime, customFields, description, envelopeId, envelopeUri, is21CFRPart11, isSignatureProviderEnvelope, lastModified, name, ownerName, pageCount, password, senderEmail, senderName, sentDateTime, shared, status, subject, templateId, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItem {\n");
    
    sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

