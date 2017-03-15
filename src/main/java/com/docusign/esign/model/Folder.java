package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Filter;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Folder   {
  
  private ErrorDetails errorDetails = null;
  private Filter filter = null;
  private String folderId = null;
  private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();
  private String name = null;
  private String ownerEmail = null;
  private String ownerUserId = null;
  private String ownerUserName = null;
  private String parentFolderId = null;
  private String parentFolderUri = null;
  private String type = null;
  private String uri = null;

  
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filter")
  public Filter getFilter() {
    return filter;
  }
  public void setFilter(Filter filter) {
    this.filter = filter;
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
    Folder folder = (Folder) o;

    return true && Objects.equals(errorDetails, folder.errorDetails) &&
        Objects.equals(filter, folder.filter) &&
        Objects.equals(folderId, folder.folderId) &&
        Objects.equals(folders, folder.folders) &&
        Objects.equals(name, folder.name) &&
        Objects.equals(ownerEmail, folder.ownerEmail) &&
        Objects.equals(ownerUserId, folder.ownerUserId) &&
        Objects.equals(ownerUserName, folder.ownerUserName) &&
        Objects.equals(parentFolderId, folder.parentFolderId) &&
        Objects.equals(parentFolderUri, folder.parentFolderUri) &&
        Objects.equals(type, folder.type) &&
        Objects.equals(uri, folder.uri)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, filter, folderId, folders, name, ownerEmail, ownerUserId, ownerUserName, parentFolderId, parentFolderUri, type, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (filter != null)
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    if (folderId != null)
      sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    if (folders != null)
      sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (ownerEmail != null)
      sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    if (ownerUserId != null)
      sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    if (ownerUserName != null)
      sb.append("    ownerUserName: ").append(toIndentedString(ownerUserName)).append("\n");
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

