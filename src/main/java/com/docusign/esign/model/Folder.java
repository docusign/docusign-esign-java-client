package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Filter;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
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
  public Folder ownerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder parentFolderUri(String parentFolderUri) {
    this.parentFolderUri = parentFolderUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("folderId")
  public String getFolderId() {
    return folderId;
  }
  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  /**
   **/
  public Folder errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Folder folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of folder objects returned in a response.")
  @JsonProperty("folders")
  public java.util.List<Folder> getFolders() {
    return folders;
  }
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  
  /**
   **/
  public Folder filter(Filter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filter")
  public Filter getFilter() {
    return filter;
  }
  public void setFilter(Filter filter) {
    this.filter = filter;
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
    return Objects.equals(this.ownerUserName, folder.ownerUserName) &&
        Objects.equals(this.ownerEmail, folder.ownerEmail) &&
        Objects.equals(this.ownerUserId, folder.ownerUserId) &&
        Objects.equals(this.type, folder.type) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.uri, folder.uri) &&
        Objects.equals(this.parentFolderId, folder.parentFolderId) &&
        Objects.equals(this.parentFolderUri, folder.parentFolderUri) &&
        Objects.equals(this.folderId, folder.folderId) &&
        Objects.equals(this.errorDetails, folder.errorDetails) &&
        Objects.equals(this.folders, folder.folders) &&
        Objects.equals(this.filter, folder.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerUserName, ownerEmail, ownerUserId, type, name, uri, parentFolderId, parentFolderUri, folderId, errorDetails, folders, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    ownerUserName: ").append(toIndentedString(ownerUserName)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

