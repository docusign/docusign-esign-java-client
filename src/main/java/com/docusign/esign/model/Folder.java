package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Filter;
import com.docusign.esign.model.Folder;
import com.docusign.esign.model.FolderItemV2;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Folder.
 *
 */

public class Folder {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("filter")
  private Filter filter = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("folderItems")
  private java.util.List<FolderItemV2> folderItems = null;

  @JsonProperty("folders")
  private java.util.List<Folder> folders = null;

  @JsonProperty("hasAccess")
  private String hasAccess = null;

  @JsonProperty("hasSubFolders")
  private String hasSubFolders = null;

  @JsonProperty("itemCount")
  private String itemCount = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private UserInfo owner = null;

  @JsonProperty("parentFolderId")
  private String parentFolderId = null;

  @JsonProperty("parentFolderUri")
  private String parentFolderUri = null;

  @JsonProperty("subFolderCount")
  private String subFolderCount = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * errorDetails.
   *
   * @return Folder
   **/
  public Folder errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * filter.
   *
   * @return Folder
   **/
  public Folder filter(Filter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter.
   * @return filter
   **/
  @ApiModelProperty(value = "")
  public Filter getFilter() {
    return filter;
  }

  /**
   * setFilter.
   **/
  public void setFilter(Filter filter) {
    this.filter = filter;
  }


  /**
   * folderId.
   *
   * @return Folder
   **/
  public Folder folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * .
   * @return folderId
   **/
  @ApiModelProperty(value = "")
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
   * folderItems.
   *
   * @return Folder
   **/
  public Folder folderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
    return this;
  }
  
  /**
   * addFolderItemsItem.
   *
   * @return Folder
   **/
  public Folder addFolderItemsItem(FolderItemV2 folderItemsItem) {
    if (this.folderItems == null) {
      this.folderItems = new java.util.ArrayList<>();
    }
    this.folderItems.add(folderItemsItem);
    return this;
  }

  /**
   * A list of the envelopes in the specified folder or folders. .
   * @return folderItems
   **/
  @ApiModelProperty(value = "A list of the envelopes in the specified folder or folders. ")
  public java.util.List<FolderItemV2> getFolderItems() {
    return folderItems;
  }

  /**
   * setFolderItems.
   **/
  public void setFolderItems(java.util.List<FolderItemV2> folderItems) {
    this.folderItems = folderItems;
  }


  /**
   * folders.
   *
   * @return Folder
   **/
  public Folder folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }
  
  /**
   * addFoldersItem.
   *
   * @return Folder
   **/
  public Folder addFoldersItem(Folder foldersItem) {
    if (this.folders == null) {
      this.folders = new java.util.ArrayList<>();
    }
    this.folders.add(foldersItem);
    return this;
  }

  /**
   * A collection of folder objects returned in a response..
   * @return folders
   **/
  @ApiModelProperty(value = "A collection of folder objects returned in a response.")
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  /**
   * setFolders.
   **/
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }


  /**
   * hasAccess.
   *
   * @return Folder
   **/
  public Folder hasAccess(String hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * .
   * @return hasAccess
   **/
  @ApiModelProperty(value = "")
  public String getHasAccess() {
    return hasAccess;
  }

  /**
   * setHasAccess.
   **/
  public void setHasAccess(String hasAccess) {
    this.hasAccess = hasAccess;
  }


  /**
   * hasSubFolders.
   *
   * @return Folder
   **/
  public Folder hasSubFolders(String hasSubFolders) {
    this.hasSubFolders = hasSubFolders;
    return this;
  }

  /**
   * .
   * @return hasSubFolders
   **/
  @ApiModelProperty(value = "")
  public String getHasSubFolders() {
    return hasSubFolders;
  }

  /**
   * setHasSubFolders.
   **/
  public void setHasSubFolders(String hasSubFolders) {
    this.hasSubFolders = hasSubFolders;
  }


  /**
   * itemCount.
   *
   * @return Folder
   **/
  public Folder itemCount(String itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * .
   * @return itemCount
   **/
  @ApiModelProperty(value = "")
  public String getItemCount() {
    return itemCount;
  }

  /**
   * setItemCount.
   **/
  public void setItemCount(String itemCount) {
    this.itemCount = itemCount;
  }


  /**
   * name.
   *
   * @return Folder
   **/
  public Folder name(String name) {
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
   * owner.
   *
   * @return Folder
   **/
  public Folder owner(UserInfo owner) {
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
   * parentFolderId.
   *
   * @return Folder
   **/
  public Folder parentFolderId(String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

  /**
   * .
   * @return parentFolderId
   **/
  @ApiModelProperty(value = "")
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
   * @return Folder
   **/
  public Folder parentFolderUri(String parentFolderUri) {
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
   * subFolderCount.
   *
   * @return Folder
   **/
  public Folder subFolderCount(String subFolderCount) {
    this.subFolderCount = subFolderCount;
    return this;
  }

  /**
   * .
   * @return subFolderCount
   **/
  @ApiModelProperty(value = "")
  public String getSubFolderCount() {
    return subFolderCount;
  }

  /**
   * setSubFolderCount.
   **/
  public void setSubFolderCount(String subFolderCount) {
    this.subFolderCount = subFolderCount;
  }


  /**
   * type.
   *
   * @return Folder
   **/
  public Folder type(String type) {
    this.type = type;
    return this;
  }

  /**
   * .
   * @return type
   **/
  @ApiModelProperty(value = "")
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
   * @return Folder
   **/
  public Folder uri(String uri) {
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
    Folder folder = (Folder) o;
    return Objects.equals(this.errorDetails, folder.errorDetails) &&
        Objects.equals(this.filter, folder.filter) &&
        Objects.equals(this.folderId, folder.folderId) &&
        Objects.equals(this.folderItems, folder.folderItems) &&
        Objects.equals(this.folders, folder.folders) &&
        Objects.equals(this.hasAccess, folder.hasAccess) &&
        Objects.equals(this.hasSubFolders, folder.hasSubFolders) &&
        Objects.equals(this.itemCount, folder.itemCount) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.owner, folder.owner) &&
        Objects.equals(this.parentFolderId, folder.parentFolderId) &&
        Objects.equals(this.parentFolderUri, folder.parentFolderUri) &&
        Objects.equals(this.subFolderCount, folder.subFolderCount) &&
        Objects.equals(this.type, folder.type) &&
        Objects.equals(this.uri, folder.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, filter, folderId, folderItems, folders, hasAccess, hasSubFolders, itemCount, name, owner, parentFolderId, parentFolderUri, subFolderCount, type, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderItems: ").append(toIndentedString(folderItems)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    hasSubFolders: ").append(toIndentedString(hasSubFolders)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
    sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
    sb.append("    subFolderCount: ").append(toIndentedString(subFolderCount)).append("\n");
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

