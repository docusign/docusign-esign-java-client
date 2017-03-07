package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.WorkspaceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Provides properties that describe the contents of a workspace folder.
 **/

@ApiModel(description = "Provides properties that describe the contents of a workspace folder.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class WorkspaceFolderContents   {
  
  private String endPosition = null;
  private WorkspaceItem folder = null;
  private java.util.List<WorkspaceItem> items = new java.util.ArrayList<WorkspaceItem>();
  private java.util.List<WorkspaceItem> parentFolders = new java.util.ArrayList<WorkspaceItem>();
  private String resultSetSize = null;
  private String startPosition = null;
  private String totalSetSize = null;
  private String workspaceId = null;

  
  /**
   * The last position in the result set.
   **/
  
  @ApiModelProperty(value = "The last position in the result set.")
  @JsonProperty("endPosition")
  public String getEndPosition() {
    return endPosition;
  }
  public void setEndPosition(String endPosition) {
    this.endPosition = endPosition;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("folder")
  public WorkspaceItem getFolder() {
    return folder;
  }
  public void setFolder(WorkspaceItem folder) {
    this.folder = folder;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public java.util.List<WorkspaceItem> getItems() {
    return items;
  }
  public void setItems(java.util.List<WorkspaceItem> items) {
    this.items = items;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentFolders")
  public java.util.List<WorkspaceItem> getParentFolders() {
    return parentFolders;
  }
  public void setParentFolders(java.util.List<WorkspaceItem> parentFolders) {
    this.parentFolders = parentFolders;
  }

  
  /**
   * The number of results returned in this response.
   **/
  
  @ApiModelProperty(value = "The number of results returned in this response.")
  @JsonProperty("resultSetSize")
  public String getResultSetSize() {
    return resultSetSize;
  }
  public void setResultSetSize(String resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  
  /**
   * Starting position of the current result set.
   **/
  
  @ApiModelProperty(value = "Starting position of the current result set.")
  @JsonProperty("startPosition")
  public String getStartPosition() {
    return startPosition;
  }
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  
  /**
   * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
   **/
  
  @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
  @JsonProperty("totalSetSize")
  public String getTotalSetSize() {
    return totalSetSize;
  }
  public void setTotalSetSize(String totalSetSize) {
    this.totalSetSize = totalSetSize;
  }

  
  /**
   * The id of the workspace, always populated.
   **/
  
  @ApiModelProperty(value = "The id of the workspace, always populated.")
  @JsonProperty("workspaceId")
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

    return true && Objects.equals(endPosition, workspaceFolderContents.endPosition) &&
        Objects.equals(folder, workspaceFolderContents.folder) &&
        Objects.equals(items, workspaceFolderContents.items) &&
        Objects.equals(parentFolders, workspaceFolderContents.parentFolders) &&
        Objects.equals(resultSetSize, workspaceFolderContents.resultSetSize) &&
        Objects.equals(startPosition, workspaceFolderContents.startPosition) &&
        Objects.equals(totalSetSize, workspaceFolderContents.totalSetSize) &&
        Objects.equals(workspaceId, workspaceFolderContents.workspaceId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, folder, items, parentFolders, resultSetSize, startPosition, totalSetSize, workspaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceFolderContents {\n");
    
    if (endPosition != null)
      sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    if (folder != null)
      sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    if (items != null)
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
    if (parentFolders != null)
      sb.append("    parentFolders: ").append(toIndentedString(parentFolders)).append("\n");
    if (resultSetSize != null)
      sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    if (startPosition != null)
      sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    if (totalSetSize != null)
      sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    if (workspaceId != null)
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

