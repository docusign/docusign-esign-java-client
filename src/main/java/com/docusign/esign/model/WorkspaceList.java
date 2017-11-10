package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Workspace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides properties that describe the workspaces avaialble.
 */
@ApiModel(description = "Provides properties that describe the workspaces avaialble.")

public class WorkspaceList {
  @JsonProperty("endPosition")
  private String endPosition = null;

  @JsonProperty("resultSetSize")
  private String resultSetSize = null;

  @JsonProperty("startPosition")
  private String startPosition = null;

  @JsonProperty("totalSetSize")
  private String totalSetSize = null;

  @JsonProperty("workspaces")
  private java.util.List<Workspace> workspaces = new java.util.ArrayList<Workspace>();

  public WorkspaceList endPosition(String endPosition) {
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

  public WorkspaceList resultSetSize(String resultSetSize) {
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

  public WorkspaceList startPosition(String startPosition) {
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

  public WorkspaceList totalSetSize(String totalSetSize) {
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

  public WorkspaceList workspaces(java.util.List<Workspace> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  public WorkspaceList addWorkspacesItem(Workspace workspacesItem) {
    this.workspaces.add(workspacesItem);
    return this;
  }

   /**
   * A list of workspaces.
   * @return workspaces
  **/
  @ApiModelProperty(example = "null", value = "A list of workspaces.")
  public java.util.List<Workspace> getWorkspaces() {
    return workspaces;
  }

  public void setWorkspaces(java.util.List<Workspace> workspaces) {
    this.workspaces = workspaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceList workspaceList = (WorkspaceList) o;
    return Objects.equals(this.endPosition, workspaceList.endPosition) &&
        Objects.equals(this.resultSetSize, workspaceList.resultSetSize) &&
        Objects.equals(this.startPosition, workspaceList.startPosition) &&
        Objects.equals(this.totalSetSize, workspaceList.totalSetSize) &&
        Objects.equals(this.workspaces, workspaceList.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, resultSetSize, startPosition, totalSetSize, workspaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceList {\n");
    
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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

