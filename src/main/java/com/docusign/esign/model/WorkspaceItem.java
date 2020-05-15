package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.WorkspaceUser;
import com.docusign.esign.model.WorkspaceUserAuthorization;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.
 */
@ApiModel(description = "A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.")

public class WorkspaceItem {
  @JsonProperty("callerAuthorization")
  private WorkspaceUserAuthorization callerAuthorization = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("createdById")
  private String createdById = null;

  @JsonProperty("createdByInformation")
  private WorkspaceUser createdByInformation = null;

  @JsonProperty("extension")
  private String extension = null;

  @JsonProperty("fileSize")
  private String fileSize = null;

  @JsonProperty("fileUri")
  private String fileUri = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isPublic")
  private String isPublic = null;

  @JsonProperty("lastModified")
  private String lastModified = null;

  @JsonProperty("lastModifiedById")
  private String lastModifiedById = null;

  @JsonProperty("lastModifiedByInformation")
  private WorkspaceUser lastModifiedByInformation = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pageCount")
  private String pageCount = null;

  @JsonProperty("parentFolderId")
  private String parentFolderId = null;

  @JsonProperty("parentFolderUri")
  private String parentFolderUri = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  public WorkspaceItem callerAuthorization(WorkspaceUserAuthorization callerAuthorization) {
    this.callerAuthorization = callerAuthorization;
    return this;
  }

   /**
   * Get callerAuthorization
   * @return callerAuthorization
  **/
  @ApiModelProperty(value = "")
  public WorkspaceUserAuthorization getCallerAuthorization() {
    return callerAuthorization;
  }

  public void setCallerAuthorization(WorkspaceUserAuthorization callerAuthorization) {
    this.callerAuthorization = callerAuthorization;
  }

  public WorkspaceItem contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * 
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public WorkspaceItem created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The UTC DateTime when the workspace item was created.
   * @return created
  **/
  @ApiModelProperty(value = "The UTC DateTime when the workspace item was created.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public WorkspaceItem createdById(String createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * 
   * @return createdById
  **/
  @ApiModelProperty(value = "")
  public String getCreatedById() {
    return createdById;
  }

  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }

  public WorkspaceItem createdByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
    return this;
  }

   /**
   * Get createdByInformation
   * @return createdByInformation
  **/
  @ApiModelProperty(value = "")
  public WorkspaceUser getCreatedByInformation() {
    return createdByInformation;
  }

  public void setCreatedByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
  }

  public WorkspaceItem extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * 
   * @return extension
  **/
  @ApiModelProperty(value = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public WorkspaceItem fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * 
   * @return fileSize
  **/
  @ApiModelProperty(value = "")
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public WorkspaceItem fileUri(String fileUri) {
    this.fileUri = fileUri;
    return this;
  }

   /**
   * 
   * @return fileUri
  **/
  @ApiModelProperty(value = "")
  public String getFileUri() {
    return fileUri;
  }

  public void setFileUri(String fileUri) {
    this.fileUri = fileUri;
  }

  public WorkspaceItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkspaceItem isPublic(String isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   *  If true, this supersedes need for bit mask permission with workspaceUserAuthorization
   * @return isPublic
  **/
  @ApiModelProperty(value = " If true, this supersedes need for bit mask permission with workspaceUserAuthorization")
  public String getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(String isPublic) {
    this.isPublic = isPublic;
  }

  public WorkspaceItem lastModified(String lastModified) {
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

  public WorkspaceItem lastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

   /**
   * Utc date and time the comment was last updated (can only be done by creator)
   * @return lastModifiedById
  **/
  @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator)")
  public String getLastModifiedById() {
    return lastModifiedById;
  }

  public void setLastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
  }

  public WorkspaceItem lastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
    return this;
  }

   /**
   * Get lastModifiedByInformation
   * @return lastModifiedByInformation
  **/
  @ApiModelProperty(value = "")
  public WorkspaceUser getLastModifiedByInformation() {
    return lastModifiedByInformation;
  }

  public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
  }

  public WorkspaceItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A simple string description of the item, such as a file name or a folder name.
   * @return name
  **/
  @ApiModelProperty(value = "A simple string description of the item, such as a file name or a folder name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkspaceItem pageCount(String pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * 
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public String getPageCount() {
    return pageCount;
  }

  public void setPageCount(String pageCount) {
    this.pageCount = pageCount;
  }

  public WorkspaceItem parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

   /**
   * The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.
   * @return parentFolderId
  **/
  @ApiModelProperty(value = "The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.")
  public String getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public WorkspaceItem parentFolderUri(String parentFolderUri) {
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

  public WorkspaceItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the workspace item. Valid values are file, folder.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the workspace item. Valid values are file, folder.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WorkspaceItem uri(String uri) {
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
    WorkspaceItem workspaceItem = (WorkspaceItem) o;
    return Objects.equals(this.callerAuthorization, workspaceItem.callerAuthorization) &&
        Objects.equals(this.contentType, workspaceItem.contentType) &&
        Objects.equals(this.created, workspaceItem.created) &&
        Objects.equals(this.createdById, workspaceItem.createdById) &&
        Objects.equals(this.createdByInformation, workspaceItem.createdByInformation) &&
        Objects.equals(this.extension, workspaceItem.extension) &&
        Objects.equals(this.fileSize, workspaceItem.fileSize) &&
        Objects.equals(this.fileUri, workspaceItem.fileUri) &&
        Objects.equals(this.id, workspaceItem.id) &&
        Objects.equals(this.isPublic, workspaceItem.isPublic) &&
        Objects.equals(this.lastModified, workspaceItem.lastModified) &&
        Objects.equals(this.lastModifiedById, workspaceItem.lastModifiedById) &&
        Objects.equals(this.lastModifiedByInformation, workspaceItem.lastModifiedByInformation) &&
        Objects.equals(this.name, workspaceItem.name) &&
        Objects.equals(this.pageCount, workspaceItem.pageCount) &&
        Objects.equals(this.parentFolderId, workspaceItem.parentFolderId) &&
        Objects.equals(this.parentFolderUri, workspaceItem.parentFolderUri) &&
        Objects.equals(this.type, workspaceItem.type) &&
        Objects.equals(this.uri, workspaceItem.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerAuthorization, contentType, created, createdById, createdByInformation, extension, fileSize, fileUri, id, isPublic, lastModified, lastModifiedById, lastModifiedByInformation, name, pageCount, parentFolderId, parentFolderUri, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceItem {\n");
    
    sb.append("    callerAuthorization: ").append(toIndentedString(callerAuthorization)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileUri: ").append(toIndentedString(fileUri)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
    sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

