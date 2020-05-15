package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element containing the following information:  templateId: Unique identifier of the template. If this is not provided, DocuSign will generate a value.   name: Name of the template. Maximum length: 100 characters.  shared: When set to **true**, the template is shared with the Everyone group in the account. If false, the template is only shared with the Administrator group.  password: Password, if the template is locked.  description: Description of the template. Maximum Length: 500 characters.  pageCount: Number of document pages in the template.  folderName: The name of the folder the template is located in.  folderId: The ID for the folder.  owner: The userName, email, userId, userType, and userStatus for the template owner.
 */
@ApiModel(description = "A complex element containing the following information:  templateId: Unique identifier of the template. If this is not provided, DocuSign will generate a value.   name: Name of the template. Maximum length: 100 characters.  shared: When set to **true**, the template is shared with the Everyone group in the account. If false, the template is only shared with the Administrator group.  password: Password, if the template is locked.  description: Description of the template. Maximum Length: 500 characters.  pageCount: Number of document pages in the template.  folderName: The name of the folder the template is located in.  folderId: The ID for the folder.  owner: The userName, email, userId, userType, and userStatus for the template owner.")

public class EnvelopeTemplateDefinition {
  @JsonProperty("created")
  private String created = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("folderName")
  private String folderName = null;

  @JsonProperty("folderUri")
  private String folderUri = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedBy")
  private UserInfo lastModifiedBy = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("newPassword")
  private String newPassword = null;

  @JsonProperty("owner")
  private UserInfo owner = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("parentFolderUri")
  private String parentFolderUri = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("uri")
  private String uri = null;

  public EnvelopeTemplateDefinition created(String created) {
    this.created = created;
    return this;
  }

   /**
   * 
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public EnvelopeTemplateDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnvelopeTemplateDefinition folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * The ID for the folder.
   * @return folderId
  **/
  @ApiModelProperty(value = "The ID for the folder.")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public EnvelopeTemplateDefinition folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

   /**
   *  The name of the folder in which the template is located.
   * @return folderName
  **/
  @ApiModelProperty(value = " The name of the folder in which the template is located.")
  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public EnvelopeTemplateDefinition folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

   /**
   * The URI of the folder.
   * @return folderUri
  **/
  @ApiModelProperty(value = "The URI of the folder.")
  public String getFolderUri() {
    return folderUri;
  }

  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  public EnvelopeTemplateDefinition lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * 
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public EnvelopeTemplateDefinition lastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public UserInfo getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public EnvelopeTemplateDefinition name(String name) {
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

  public EnvelopeTemplateDefinition newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * 
   * @return newPassword
  **/
  @ApiModelProperty(value = "")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public EnvelopeTemplateDefinition owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public UserInfo getOwner() {
    return owner;
  }

  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }

  public EnvelopeTemplateDefinition pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.
   * @return pageCount
  **/
  @ApiModelProperty(value = "An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public EnvelopeTemplateDefinition parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }

   /**
   * 
   * @return parentFolderUri
  **/
  @ApiModelProperty(value = "")
  public String getParentFolderUri() {
    return parentFolderUri;
  }

  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }

  public EnvelopeTemplateDefinition password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EnvelopeTemplateDefinition shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public EnvelopeTemplateDefinition templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public EnvelopeTemplateDefinition uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(value = "")
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
    EnvelopeTemplateDefinition envelopeTemplateDefinition = (EnvelopeTemplateDefinition) o;
    return Objects.equals(this.created, envelopeTemplateDefinition.created) &&
        Objects.equals(this.description, envelopeTemplateDefinition.description) &&
        Objects.equals(this.folderId, envelopeTemplateDefinition.folderId) &&
        Objects.equals(this.folderName, envelopeTemplateDefinition.folderName) &&
        Objects.equals(this.folderUri, envelopeTemplateDefinition.folderUri) &&
        Objects.equals(this.lastModified, envelopeTemplateDefinition.lastModified) &&
        Objects.equals(this.lastModifiedBy, envelopeTemplateDefinition.lastModifiedBy) &&
        Objects.equals(this.name, envelopeTemplateDefinition.name) &&
        Objects.equals(this.newPassword, envelopeTemplateDefinition.newPassword) &&
        Objects.equals(this.owner, envelopeTemplateDefinition.owner) &&
        Objects.equals(this.pageCount, envelopeTemplateDefinition.pageCount) &&
        Objects.equals(this.parentFolderUri, envelopeTemplateDefinition.parentFolderUri) &&
        Objects.equals(this.password, envelopeTemplateDefinition.password) &&
        Objects.equals(this.shared, envelopeTemplateDefinition.shared) &&
        Objects.equals(this.templateId, envelopeTemplateDefinition.templateId) &&
        Objects.equals(this.uri, envelopeTemplateDefinition.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, folderId, folderName, folderUri, lastModified, lastModifiedBy, name, newPassword, owner, pageCount, parentFolderUri, password, shared, templateId, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeTemplateDefinition {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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

