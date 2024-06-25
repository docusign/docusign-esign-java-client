package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.WorkspaceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Provides properties that describe the contents of a workspace folder..
 *
 */
@Schema(description = "Provides properties that describe the contents of a workspace folder.")

public class WorkspaceFolderContents implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("folder")
  private WorkspaceItem folder = null;

  @JsonProperty("items")
  private java.util.List<WorkspaceItem> items = null;

  @JsonProperty("parentFolders")
  private java.util.List<WorkspaceItem> parentFolders = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  @JsonProperty("workspaceId")
  private String workspaceId = null;


  /**
   * endPosition.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents endPosition(String endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * The last position in the result set. .
   * @return endPosition
   **/
  @Schema(description = "The last position in the result set. ")
  public String getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * folder.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents folder(WorkspaceItem folder) {
    this.folder = folder;
    return this;
  }

  /**
   * The folder from which to return items. You can enter either the folder name or folder ID..
   * @return folder
   **/
  @Schema(description = "The folder from which to return items. You can enter either the folder name or folder ID.")
  public WorkspaceItem getFolder() {
    return folder;
  }

  /**
   * setFolder.
   **/
  public void setFolder(WorkspaceItem folder) {
    this.folder = folder;
  }


  /**
   * items.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents items(java.util.List<WorkspaceItem> items) {
    this.items = items;
    return this;
  }
  
  /**
   * addItemsItem.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents addItemsItem(WorkspaceItem itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * .
   * @return items
   **/
  @Schema(description = "")
  public java.util.List<WorkspaceItem> getItems() {
    return items;
  }

  /**
   * setItems.
   **/
  public void setItems(java.util.List<WorkspaceItem> items) {
    this.items = items;
  }


  /**
   * parentFolders.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents parentFolders(java.util.List<WorkspaceItem> parentFolders) {
    this.parentFolders = parentFolders;
    return this;
  }
  
  /**
   * addParentFoldersItem.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents addParentFoldersItem(WorkspaceItem parentFoldersItem) {
    if (this.parentFolders == null) {
      this.parentFolders = new java.util.ArrayList<>();
    }
    this.parentFolders.add(parentFoldersItem);
    return this;
  }

  /**
   * .
   * @return parentFolders
   **/
  @Schema(description = "")
  public java.util.List<WorkspaceItem> getParentFolders() {
    return parentFolders;
  }

  /**
   * setParentFolders.
   **/
  public void setParentFolders(java.util.List<WorkspaceItem> parentFolders) {
    this.parentFolders = parentFolders;
  }


  /**
   * resultSetSize.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents resultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * The number of results returned in this response. .
   * @return resultSetSize
   **/
  @Schema(description = "The number of results returned in this response. ")
  public String getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents startPosition(String startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of the current result set..
   * @return startPosition
   **/
  @Schema(description = "Starting position of the current result set.")
  public String getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * totalSetSize.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents totalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response..
   * @return totalSetSize
   **/
  @Schema(description = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  public String getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }


  /**
   * workspaceId.
   *
   * @return WorkspaceFolderContents
   **/
  public WorkspaceFolderContents workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * The id of the workspace, always populated..
   * @return workspaceId
   **/
  @Schema(description = "The id of the workspace, always populated.")
  public String getWorkspaceId() {
    return workspaceId;
  }

  /**
   * setWorkspaceId.
   **/
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endPosition, folder, items, parentFolders, resultSetSize, startPosition, totalSetSize, workspaceId);
  }


  /**
   * Converts the given object to string.
   */
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

