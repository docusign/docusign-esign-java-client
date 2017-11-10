package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Filter;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Folder
 */

public class Folder {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("filter")
  private Filter filter = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("folders")
  private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ownerEmail")
  private String ownerEmail = null;

  @JsonProperty("ownerUserId")
  private String ownerUserId = null;

  @JsonProperty("ownerUserName")
  private String ownerUserName = null;

  @JsonProperty("parentFolderId")
  private String parentFolderId = null;

  @JsonProperty("parentFolderUri")
  private String parentFolderUri = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;

  public Folder errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Folder filter(Filter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  public Folder folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * 
   * @return folderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public Folder folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }

  public Folder addFoldersItem(Folder foldersItem) {
    this.folders.add(foldersItem);
    return this;
  }

   /**
   * A collection of folder objects returned in a response.
   * @return folders
  **/
  @ApiModelProperty(example = "null", value = "A collection of folder objects returned in a response.")
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  public Folder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Folder ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * 
   * @return ownerEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public Folder ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * 
   * @return ownerUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public Folder ownerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

   /**
   * 
   * @return ownerUserName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerUserName() {
    return ownerUserName;
  }

  public void setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
  }

  public Folder parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

   /**
   * 
   * @return parentFolderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentFolderId() {
    return parentFolderId;
  }

  public void setParentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
  }

  public Folder parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }

   /**
   * 
   * @return parentFolderUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentFolderUri() {
    return parentFolderUri;
  }

  public void setParentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
  }

  public Folder type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Folder uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
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
    Folder folder = (Folder) o;
    return Objects.equals(this.errorDetails, folder.errorDetails) &&
        Objects.equals(this.filter, folder.filter) &&
        Objects.equals(this.folderId, folder.folderId) &&
        Objects.equals(this.folders, folder.folders) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.ownerEmail, folder.ownerEmail) &&
        Objects.equals(this.ownerUserId, folder.ownerUserId) &&
        Objects.equals(this.ownerUserName, folder.ownerUserName) &&
        Objects.equals(this.parentFolderId, folder.parentFolderId) &&
        Objects.equals(this.parentFolderUri, folder.parentFolderUri) &&
        Objects.equals(this.type, folder.type) &&
        Objects.equals(this.uri, folder.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, filter, folderId, folders, name, ownerEmail, ownerUserId, ownerUserName, parentFolderId, parentFolderUri, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    ownerUserName: ").append(toIndentedString(ownerUserName)).append("\n");
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

