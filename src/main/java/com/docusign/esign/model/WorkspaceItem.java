package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.WorkspaceUser;
import com.docusign.esign.model.WorkspaceUserAuthorization;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.
 **/

@ApiModel(description = "A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class WorkspaceItem   {
  
  private WorkspaceUserAuthorization callerAuthorization = null;
  private String _contentType = null;
  private String created = null;
  private String createdById = null;
  private WorkspaceUser createdByInformation = null;
  private String extension = null;
  private String fileSize = null;
  private String fileUri = null;
  private String id = null;
  private String isPublic = null;
  private String lastModified = null;
  private String lastModifiedById = null;
  private WorkspaceUser lastModifiedByInformation = null;
  private String name = null;
  private String pageCount = null;
  private String parentFolderId = null;
  private String parentFolderUri = null;
  private String type = null;
  private String uri = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("callerAuthorization")
  public WorkspaceUserAuthorization getCallerAuthorization() {
    return callerAuthorization;
  }
  public void setCallerAuthorization(WorkspaceUserAuthorization callerAuthorization) {
    this.callerAuthorization = callerAuthorization;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
  public String getContentType() {
    return _contentType;
  }
  public void setContentType(String _contentType) {
    this._contentType = _contentType;
  }

  
  /**
   * The UTC DateTime when the workspace item was created.
   **/
  
  @ApiModelProperty(value = "The UTC DateTime when the workspace item was created.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdById")
  public String getCreatedById() {
    return createdById;
  }
  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdByInformation")
  public WorkspaceUser getCreatedByInformation() {
    return createdByInformation;
  }
  public void setCreatedByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fileSize")
  public String getFileSize() {
    return fileSize;
  }
  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fileUri")
  public String getFileUri() {
    return fileUri;
  }
  public void setFileUri(String fileUri) {
    this.fileUri = fileUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * If true, this supersedes need for bit mask permission with workspaceUserAuthorization
   **/
  
  @ApiModelProperty(value = "If true, this supersedes need for bit mask permission with workspaceUserAuthorization")
  @JsonProperty("isPublic")
  public String getIsPublic() {
    return isPublic;
  }
  public void setIsPublic(String isPublic) {
    this.isPublic = isPublic;
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
   * Utc date and time the comment was last updated (can only be done by creator)
   **/
  
  @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator)")
  @JsonProperty("lastModifiedById")
  public String getLastModifiedById() {
    return lastModifiedById;
  }
  public void setLastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastModifiedByInformation")
  public WorkspaceUser getLastModifiedByInformation() {
    return lastModifiedByInformation;
  }
  public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
  }

  
  /**
   * A simple string description of the item, such as a file name or a folder name.
   **/
  
  @ApiModelProperty(value = "A simple string description of the item, such as a file name or a folder name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageCount")
  public String getPageCount() {
    return pageCount;
  }
  public void setPageCount(String pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   * The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.
   **/
  
  @ApiModelProperty(value = "The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.")
  @JsonProperty("parentFolderId")
  public String getParentFolderId() {
    return parentFolderId;
  }
  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentFolderUri")
  public String getParentFolderUri() {
    return parentFolderUri;
  }
  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }

  
  /**
   * The type of the workspace item. Valid values are file, folder.
   **/
  
  @ApiModelProperty(value = "The type of the workspace item. Valid values are file, folder.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
    WorkspaceItem workspaceItem = (WorkspaceItem) o;

    return true && Objects.equals(callerAuthorization, workspaceItem.callerAuthorization) &&
        Objects.equals(_contentType, workspaceItem._contentType) &&
        Objects.equals(created, workspaceItem.created) &&
        Objects.equals(createdById, workspaceItem.createdById) &&
        Objects.equals(createdByInformation, workspaceItem.createdByInformation) &&
        Objects.equals(extension, workspaceItem.extension) &&
        Objects.equals(fileSize, workspaceItem.fileSize) &&
        Objects.equals(fileUri, workspaceItem.fileUri) &&
        Objects.equals(id, workspaceItem.id) &&
        Objects.equals(isPublic, workspaceItem.isPublic) &&
        Objects.equals(lastModified, workspaceItem.lastModified) &&
        Objects.equals(lastModifiedById, workspaceItem.lastModifiedById) &&
        Objects.equals(lastModifiedByInformation, workspaceItem.lastModifiedByInformation) &&
        Objects.equals(name, workspaceItem.name) &&
        Objects.equals(pageCount, workspaceItem.pageCount) &&
        Objects.equals(parentFolderId, workspaceItem.parentFolderId) &&
        Objects.equals(parentFolderUri, workspaceItem.parentFolderUri) &&
        Objects.equals(type, workspaceItem.type) &&
        Objects.equals(uri, workspaceItem.uri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerAuthorization, _contentType, created, createdById, createdByInformation, extension, fileSize, fileUri, id, isPublic, lastModified, lastModifiedById, lastModifiedByInformation, name, pageCount, parentFolderId, parentFolderUri, type, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceItem {\n");
    
    if (callerAuthorization != null)
      sb.append("    callerAuthorization: ").append(toIndentedString(callerAuthorization)).append("\n");
    if (_contentType != null)
      sb.append("    _contentType: ").append(toIndentedString(_contentType)).append("\n");
    if (created != null)
      sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (createdById != null)
      sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    if (createdByInformation != null)
      sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
    if (extension != null)
      sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    if (fileSize != null)
      sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    if (fileUri != null)
      sb.append("    fileUri: ").append(toIndentedString(fileUri)).append("\n");
    if (id != null)
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (isPublic != null)
      sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    if (lastModified != null)
      sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    if (lastModifiedById != null)
      sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
    if (lastModifiedByInformation != null)
      sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (pageCount != null)
      sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    if (parentFolderId != null)
      sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    if (parentFolderUri != null)
      sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    if (type != null)
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

