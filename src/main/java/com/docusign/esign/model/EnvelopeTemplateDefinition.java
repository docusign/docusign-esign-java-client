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
 * A complex element containing the following information:  templateId: Unique identifier of the template. If this is not provided, DocuSign will generate a value.   name: Name of the template. Maximum length: 100 characters.  shared: When set to **true**, the template is shared with the Everyone group in the account. If false, the template is only shared with the Administrator group.  password: Password, if the template is locked.  description: Description of the template. Maximum Length: 500 characters.  pageCount: Number of document pages in the template.  folderName: The name of the folder the template is located in.  folderId: The ID for the folder.  owner: The userName, email, userId, userType, and userStatus for the template owner..
 *
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


  /**
   * created.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition created(String created) {
    this.created = created;
    return this;
  }

  /**
   * .
   * @return created
   **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  /**
   * setCreated.
   **/
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   * description.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition description(String description) {
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
   * folderId.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * The ID for the folder..
   * @return folderId
   **/
  @ApiModelProperty(value = "The ID for the folder.")
  public String getFolderId() {
    return folderId;
  }

  /**
   * setFolderId.
   **/
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  /**
   * folderName.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

  /**
   *  The name of the folder in which the template is located..
   * @return folderName
   **/
  @ApiModelProperty(value = " The name of the folder in which the template is located.")
  public String getFolderName() {
    return folderName;
  }

  /**
   * setFolderName.
   **/
  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }


  /**
   * folderUri.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

  /**
   * The URI of the folder..
   * @return folderUri
   **/
  @ApiModelProperty(value = "The URI of the folder.")
  public String getFolderUri() {
    return folderUri;
  }

  /**
   * setFolderUri.
   **/
  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }


  /**
   * lastModified.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition lastModified(String lastModified) {
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
   * lastModifiedBy.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition lastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy.
   * @return lastModifiedBy
   **/
  @ApiModelProperty(value = "")
  public UserInfo getLastModifiedBy() {
    return lastModifiedBy;
  }

  /**
   * setLastModifiedBy.
   **/
  public void setLastModifiedBy(UserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  /**
   * name.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition name(String name) {
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
   * newPassword.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * .
   * @return newPassword
   **/
  @ApiModelProperty(value = "")
  public String getNewPassword() {
    return newPassword;
  }

  /**
   * setNewPassword.
   **/
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  /**
   * owner.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition owner(UserInfo owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner.
   * @return owner
   **/
  @ApiModelProperty(value = "")
  public UserInfo getOwner() {
    return owner;
  }

  /**
   * setOwner.
   **/
  public void setOwner(UserInfo owner) {
    this.owner = owner;
  }


  /**
   * pageCount.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count..
   * @return pageCount
   **/
  @ApiModelProperty(value = "An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.")
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
   * parentFolderUri.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }

  /**
   * .
   * @return parentFolderUri
   **/
  @ApiModelProperty(value = "")
  public String getParentFolderUri() {
    return parentFolderUri;
  }

  /**
   * setParentFolderUri.
   **/
  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }


  /**
   * password.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition password(String password) {
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
   * shared.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition shared(String shared) {
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
   * templateId.
   *
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition templateId(String templateId) {
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
   * @return EnvelopeTemplateDefinition
   **/
  public EnvelopeTemplateDefinition uri(String uri) {
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(created, description, folderId, folderName, folderUri, lastModified, lastModifiedBy, name, newPassword, owner, pageCount, parentFolderUri, password, shared, templateId, uri);
  }


  /**
   * Converts the given object to string.
   */
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

