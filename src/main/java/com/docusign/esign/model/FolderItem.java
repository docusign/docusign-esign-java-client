package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.CustomFieldV2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class FolderItem   {
  
  private String completedDateTime = null;
  private String createdDateTime = null;
  private java.util.List<CustomFieldV2> customFields = new java.util.ArrayList<CustomFieldV2>();
  private String description = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private String is21CFRPart11 = null;
  private String isSignatureProviderEnvelope = null;
  private String lastModified = null;
  private String name = null;
  private String ownerName = null;
  private Integer pageCount = null;
  private String password = null;
  private String senderEmail = null;
  private String senderName = null;
  private String sentDateTime = null;
  private String shared = null;
  private String status = null;
  private String subject = null;
  private String templateId = null;
  private String uri = null;

  
  /**
   * Specifies the date and time this item was completed.
   **/
  
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  @JsonProperty("completedDateTime")
  public String getCompletedDateTime() {
    return completedDateTime;
  }
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   **/
  
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  @JsonProperty("customFields")
  public java.util.List<CustomFieldV2> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(java.util.List<CustomFieldV2> customFields) {
    this.customFields = customFields;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   **/
  
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  @JsonProperty("envelopeUri")
  public String getEnvelopeUri() {
    return envelopeUri;
  }
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  
  /**
   * When set to **true**, indicates that this module is enabled on the account.
   **/
  
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  @JsonProperty("is21CFRPart11")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isSignatureProviderEnvelope")
  public String getIsSignatureProviderEnvelope() {
    return isSignatureProviderEnvelope;
  }
  public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
    this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
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
   * Name of the envelope owner.
   **/
  
  @ApiModelProperty(value = "Name of the envelope owner.")
  @JsonProperty("ownerName")
  public String getOwnerName() {
    return ownerName;
  }
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("senderEmail")
  public String getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  
  /**
   * Name of the envelope sender.
   **/
  
  @ApiModelProperty(value = "Name of the envelope sender.")
  @JsonProperty("senderName")
  public String getSenderName() {
    return senderName;
  }
  public void setSenderName(String senderName) {
    this.senderName = senderName;
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
   * When set to **true**, this custom tab is shared.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
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

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderItem folderItem = (FolderItem) o;

    return true && Objects.equals(completedDateTime, folderItem.completedDateTime) &&
        Objects.equals(createdDateTime, folderItem.createdDateTime) &&
        Objects.equals(customFields, folderItem.customFields) &&
        Objects.equals(description, folderItem.description) &&
        Objects.equals(envelopeId, folderItem.envelopeId) &&
        Objects.equals(envelopeUri, folderItem.envelopeUri) &&
        Objects.equals(is21CFRPart11, folderItem.is21CFRPart11) &&
        Objects.equals(isSignatureProviderEnvelope, folderItem.isSignatureProviderEnvelope) &&
        Objects.equals(lastModified, folderItem.lastModified) &&
        Objects.equals(name, folderItem.name) &&
        Objects.equals(ownerName, folderItem.ownerName) &&
        Objects.equals(pageCount, folderItem.pageCount) &&
        Objects.equals(password, folderItem.password) &&
        Objects.equals(senderEmail, folderItem.senderEmail) &&
        Objects.equals(senderName, folderItem.senderName) &&
        Objects.equals(sentDateTime, folderItem.sentDateTime) &&
        Objects.equals(shared, folderItem.shared) &&
        Objects.equals(status, folderItem.status) &&
        Objects.equals(subject, folderItem.subject) &&
        Objects.equals(templateId, folderItem.templateId) &&
        Objects.equals(uri, folderItem.uri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedDateTime, createdDateTime, customFields, description, envelopeId, envelopeUri, is21CFRPart11, isSignatureProviderEnvelope, lastModified, name, ownerName, pageCount, password, senderEmail, senderName, sentDateTime, shared, status, subject, templateId, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItem {\n");
    
    if (completedDateTime != null)
      sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
    if (createdDateTime != null)
      sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    if (customFields != null)
      sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    if (description != null)
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
    if (envelopeId != null)
      sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    if (envelopeUri != null)
      sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
    if (is21CFRPart11 != null)
      sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
    if (isSignatureProviderEnvelope != null)
      sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
    if (lastModified != null)
      sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (ownerName != null)
      sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    if (pageCount != null)
      sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    if (password != null)
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
    if (senderEmail != null)
      sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    if (senderName != null)
      sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    if (sentDateTime != null)
      sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    if (shared != null)
      sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (subject != null)
      sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    if (templateId != null)
      sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    if (uri != null)
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

