package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Page;
import com.docusign.esign.model.WorkspaceUser;
import com.docusign.esign.model.WorkspaceUserAuthorization;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call..
 *
 */
@Schema(description = "A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.")

public class WorkspaceItem implements Serializable {
  private static final long serialVersionUID = 1L;

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

  @JsonProperty("sha256")
  private String sha256 = null;

  @JsonProperty("thumbHeight")
  private String thumbHeight = null;

  @JsonProperty("thumbnail")
  private Page thumbnail = null;

  @JsonProperty("thumbWidth")
  private String thumbWidth = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("userAuthorization")
  private WorkspaceUserAuthorization userAuthorization = null;


  /**
   * callerAuthorization.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem callerAuthorization(WorkspaceUserAuthorization callerAuthorization) {
    this.callerAuthorization = callerAuthorization;
    return this;
  }

  /**
   * .
   * @return callerAuthorization
   **/
  @Schema(description = "")
  public WorkspaceUserAuthorization getCallerAuthorization() {
    return callerAuthorization;
  }

  /**
   * setCallerAuthorization.
   **/
  public void setCallerAuthorization(WorkspaceUserAuthorization callerAuthorization) {
    this.callerAuthorization = callerAuthorization;
  }


  /**
   * contentType.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * .
   * @return contentType
   **/
  @Schema(description = "")
  public String getContentType() {
    return contentType;
  }

  /**
   * setContentType.
   **/
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * created.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem created(String created) {
    this.created = created;
    return this;
  }

  /**
   * The UTC DateTime when the workspace item was created..
   * @return created
   **/
  @Schema(description = "The UTC DateTime when the workspace item was created.")
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
   * createdById.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem createdById(String createdById) {
    this.createdById = createdById;
    return this;
  }

  /**
   * .
   * @return createdById
   **/
  @Schema(description = "")
  public String getCreatedById() {
    return createdById;
  }

  /**
   * setCreatedById.
   **/
  public void setCreatedById(String createdById) {
    this.createdById = createdById;
  }


  /**
   * createdByInformation.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem createdByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
    return this;
  }

  /**
   * Details about the user who created the workspace item..
   * @return createdByInformation
   **/
  @Schema(description = "Details about the user who created the workspace item.")
  public WorkspaceUser getCreatedByInformation() {
    return createdByInformation;
  }

  /**
   * setCreatedByInformation.
   **/
  public void setCreatedByInformation(WorkspaceUser createdByInformation) {
    this.createdByInformation = createdByInformation;
  }


  /**
   * extension.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * .
   * @return extension
   **/
  @Schema(description = "")
  public String getExtension() {
    return extension;
  }

  /**
   * setExtension.
   **/
  public void setExtension(String extension) {
    this.extension = extension;
  }


  /**
   * fileSize.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * .
   * @return fileSize
   **/
  @Schema(description = "")
  public String getFileSize() {
    return fileSize;
  }

  /**
   * setFileSize.
   **/
  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }


  /**
   * fileUri.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem fileUri(String fileUri) {
    this.fileUri = fileUri;
    return this;
  }

  /**
   * .
   * @return fileUri
   **/
  @Schema(description = "")
  public String getFileUri() {
    return fileUri;
  }

  /**
   * setFileUri.
   **/
  public void setFileUri(String fileUri) {
    this.fileUri = fileUri;
  }


  /**
   * id.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * .
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * isPublic.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem isPublic(String isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   *  If true, this supersedes need for bit mask permission with workspaceUserAuthorization.
   * @return isPublic
   **/
  @Schema(description = " If true, this supersedes need for bit mask permission with workspaceUserAuthorization")
  public String getIsPublic() {
    return isPublic;
  }

  /**
   * setIsPublic.
   **/
  public void setIsPublic(String isPublic) {
    this.isPublic = isPublic;
  }


  /**
   * lastModified.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * .
   * @return lastModified
   **/
  @Schema(description = "")
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
   * lastModifiedById.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem lastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

  /**
   * Utc date and time the comment was last updated (can only be done by creator).
   * @return lastModifiedById
   **/
  @Schema(description = "Utc date and time the comment was last updated (can only be done by creator)")
  public String getLastModifiedById() {
    return lastModifiedById;
  }

  /**
   * setLastModifiedById.
   **/
  public void setLastModifiedById(String lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
  }


  /**
   * lastModifiedByInformation.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem lastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
    return this;
  }

  /**
   * Details about the user who last modified the workspace item..
   * @return lastModifiedByInformation
   **/
  @Schema(description = "Details about the user who last modified the workspace item.")
  public WorkspaceUser getLastModifiedByInformation() {
    return lastModifiedByInformation;
  }

  /**
   * setLastModifiedByInformation.
   **/
  public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
    this.lastModifiedByInformation = lastModifiedByInformation;
  }


  /**
   * name.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A simple string description of the item, such as a file name or a folder name..
   * @return name
   **/
  @Schema(description = "A simple string description of the item, such as a file name or a folder name.")
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
   * pageCount.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem pageCount(String pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * .
   * @return pageCount
   **/
  @Schema(description = "")
  public String getPageCount() {
    return pageCount;
  }

  /**
   * setPageCount.
   **/
  public void setPageCount(String pageCount) {
    this.pageCount = pageCount;
  }


  /**
   * parentFolderId.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

  /**
   * The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder..
   * @return parentFolderId
   **/
  @Schema(description = "The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.")
  public String getParentFolderId() {
    return parentFolderId;
  }

  /**
   * setParentFolderId.
   **/
  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }


  /**
   * parentFolderUri.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }

  /**
   * .
   * @return parentFolderUri
   **/
  @Schema(description = "")
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
   * sha256.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

  /**
   * .
   * @return sha256
   **/
  @Schema(description = "")
  public String getSha256() {
    return sha256;
  }

  /**
   * setSha256.
   **/
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  /**
   * thumbHeight.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem thumbHeight(String thumbHeight) {
    this.thumbHeight = thumbHeight;
    return this;
  }

  /**
   * .
   * @return thumbHeight
   **/
  @Schema(description = "")
  public String getThumbHeight() {
    return thumbHeight;
  }

  /**
   * setThumbHeight.
   **/
  public void setThumbHeight(String thumbHeight) {
    this.thumbHeight = thumbHeight;
  }


  /**
   * thumbnail.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem thumbnail(Page thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * .
   * @return thumbnail
   **/
  @Schema(description = "")
  public Page getThumbnail() {
    return thumbnail;
  }

  /**
   * setThumbnail.
   **/
  public void setThumbnail(Page thumbnail) {
    this.thumbnail = thumbnail;
  }


  /**
   * thumbWidth.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem thumbWidth(String thumbWidth) {
    this.thumbWidth = thumbWidth;
    return this;
  }

  /**
   * .
   * @return thumbWidth
   **/
  @Schema(description = "")
  public String getThumbWidth() {
    return thumbWidth;
  }

  /**
   * setThumbWidth.
   **/
  public void setThumbWidth(String thumbWidth) {
    this.thumbWidth = thumbWidth;
  }


  /**
   * type.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the workspace item. Valid values are file, folder..
   * @return type
   **/
  @Schema(description = "The type of the workspace item. Valid values are file, folder.")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }


  /**
   * uri.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
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
   * userAuthorization.
   *
   * @return WorkspaceItem
   **/
  public WorkspaceItem userAuthorization(WorkspaceUserAuthorization userAuthorization) {
    this.userAuthorization = userAuthorization;
    return this;
  }

  /**
   * .
   * @return userAuthorization
   **/
  @Schema(description = "")
  public WorkspaceUserAuthorization getUserAuthorization() {
    return userAuthorization;
  }

  /**
   * setUserAuthorization.
   **/
  public void setUserAuthorization(WorkspaceUserAuthorization userAuthorization) {
    this.userAuthorization = userAuthorization;
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
        Objects.equals(this.sha256, workspaceItem.sha256) &&
        Objects.equals(this.thumbHeight, workspaceItem.thumbHeight) &&
        Objects.equals(this.thumbnail, workspaceItem.thumbnail) &&
        Objects.equals(this.thumbWidth, workspaceItem.thumbWidth) &&
        Objects.equals(this.type, workspaceItem.type) &&
        Objects.equals(this.uri, workspaceItem.uri) &&
        Objects.equals(this.userAuthorization, workspaceItem.userAuthorization);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(callerAuthorization, contentType, created, createdById, createdByInformation, extension, fileSize, fileUri, id, isPublic, lastModified, lastModifiedById, lastModifiedByInformation, name, pageCount, parentFolderId, parentFolderUri, sha256, thumbHeight, thumbnail, thumbWidth, type, uri, userAuthorization);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    thumbHeight: ").append(toIndentedString(thumbHeight)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    thumbWidth: ").append(toIndentedString(thumbWidth)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userAuthorization: ").append(toIndentedString(userAuthorization)).append("\n");
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

