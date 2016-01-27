package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Filter;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Folder;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class Folder   {
  
  private String ownerUserName = null;
  private String ownerEmail = null;
  private String ownerUserId = null;
  private String type = null;
  private String name = null;
  private String uri = null;
  private String parentFolderId = null;
  private String parentFolderUri = null;
  private String folderId = null;
  private ErrorDetails errorDetails = null;
  private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();
  private Filter filter = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ownerUserName")
  public String getOwnerUserName() {
    return ownerUserName;
  }
  public void setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ownerEmail")
  public String getOwnerEmail() {
    return ownerEmail;
  }
  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ownerUserId")
  public String getOwnerUserId() {
    return ownerUserId;
  }
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
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
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
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
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("folderId")
  public String getFolderId() {
    return folderId;
  }
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * A collection of folder objects returned in a response.
   **/
  @ApiModelProperty(value = "A collection of folder objects returned in a response.")
  @JsonProperty("folders")
  public java.util.List<Folder> getFolders() {
    return folders;
  }
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("filter")
  public Filter getFilter() {
    return filter;
  }
  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Folder folder = (Folder) o;
    return Objects.equals(ownerUserName, folder.ownerUserName) &&
        Objects.equals(ownerEmail, folder.ownerEmail) &&
        Objects.equals(ownerUserId, folder.ownerUserId) &&
        Objects.equals(type, folder.type) &&
        Objects.equals(name, folder.name) &&
        Objects.equals(uri, folder.uri) &&
        Objects.equals(parentFolderId, folder.parentFolderId) &&
        Objects.equals(parentFolderUri, folder.parentFolderUri) &&
        Objects.equals(folderId, folder.folderId) &&
        Objects.equals(errorDetails, folder.errorDetails) &&
        Objects.equals(folders, folder.folders) &&
        Objects.equals(filter, folder.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerUserName, ownerEmail, ownerUserId, type, name, uri, parentFolderId, parentFolderUri, folderId, errorDetails, folders, filter);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    ownerUserName: ").append(StringUtil.toIndentedString(ownerUserName)).append("\n");
    sb.append("    ownerEmail: ").append(StringUtil.toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerUserId: ").append(StringUtil.toIndentedString(ownerUserId)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("    parentFolderId: ").append(StringUtil.toIndentedString(parentFolderId)).append("\n");
    sb.append("    parentFolderUri: ").append(StringUtil.toIndentedString(parentFolderUri)).append("\n");
    sb.append("    folderId: ").append(StringUtil.toIndentedString(folderId)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("    folders: ").append(StringUtil.toIndentedString(folders)).append("\n");
    sb.append("    filter: ").append(StringUtil.toIndentedString(filter)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
