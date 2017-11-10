package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.WorkspaceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides properties that describe the contents of a workspace folder.
 */
@ApiModel(description = "Provides properties that describe the contents of a workspace folder.")

public class WorkspaceFolderContents {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("folder")
  private WorkspaceItem folder = null;

  @JsonProperty("items")
  private java.util.List<WorkspaceItem> items = new java.util.ArrayList<WorkspaceItem>();

  @JsonProperty("parentFolders")
  private java.util.List<WorkspaceItem> parentFolders = new java.util.ArrayList<WorkspaceItem>();

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  @JsonProperty("workspaceId")
  private String workspaceId = null;

  public WorkspaceFolderContents endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * The last position in the result set. 
   * @return endPosition
  **/
  @ApiModelProperty(example = "null", value = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  public WorkspaceFolderContents folder(WorkspaceItem folder) {
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @ApiModelProperty(example = "null", value = "")
  public WorkspaceItem getFolder() {
    return folder;
  }

  public void setFolder(WorkspaceItem folder) {
    this.folder = folder;
  }

  public WorkspaceFolderContents items(java.util.List<WorkspaceItem> items) {
    this.items = items;
    return this;
  }

  public WorkspaceFolderContents addItemsItem(WorkspaceItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<WorkspaceItem> getItems() {
    return items;
  }

  public void setItems(java.util.List<WorkspaceItem> items) {
    this.items = items;
  }

  public WorkspaceFolderContents parentFolders(java.util.List<WorkspaceItem> parentFolders) {
    this.parentFolders = parentFolders;
    return this;
  }

  public WorkspaceFolderContents addParentFoldersItem(WorkspaceItem parentFoldersItem) {
    this.parentFolders.add(parentFoldersItem);
    return this;
  }

   /**
   * 
   * @return parentFolders
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<WorkspaceItem> getParentFolders() {
    return parentFolders;
  }

  public void setParentFolders(java.util.List<WorkspaceItem> parentFolders) {
    this.parentFolders = parentFolders;
  }

  public WorkspaceFolderContents resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * The number of results returned in this response. 
   * @return resultSetSize
  **/
  @ApiModelProperty(example = "null", value = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public WorkspaceFolderContents startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Starting position of the current result set.
   * @return startPosition
  **/
  @ApiModelProperty(example = "null", value = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public WorkspaceFolderContents totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

   /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   * @return totalSetSize
  **/
  @ApiModelProperty(example = "null", value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  public WorkspaceFolderContents workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * The id of the workspace, always populated.
   * @return workspaceId
  **/
  @ApiModelProperty(example = "null", value = "The id of the workspace, always populated.")
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceFolderContents workspaceFolderContents = (WorkspaceFolderContents) o;
    return Objects.equals(this.endPosition, workspaceFolderContents.endPosition) &&
        Objects.equals(this.folder, workspaceFolderContents.folder) &&
        Objects.equals(this.items, workspaceFolderContents.items) &&
        Objects.equals(this.parentFolders, workspaceFolderContents.parentFolders) &&
        Objects.equals(this.resultSetSize, workspaceFolderContents.resultSetSize) &&
        Objects.equals(this.startPosition, workspaceFolderContents.startPosition) &&
        Objects.equals(this.totalSetSize, workspaceFolderContents.totalSetSize) &&
        Objects.equals(this.workspaceId, workspaceFolderContents.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, folder, items, parentFolders, resultSetSize, startPosition, totalSetSize, workspaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceFolderContents {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    parentFolders: ").append(toIndentedString(parentFolders)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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

