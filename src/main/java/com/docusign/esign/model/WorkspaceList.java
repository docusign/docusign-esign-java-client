package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Workspace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Provides properties that describe the workspaces avaialble..
 *
 */
@Schema(description = "Provides properties that describe the workspaces avaialble.")

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
  private java.util.List<Workspace> workspaces = null;


  /**
   * endPosition.
   *
   * @return WorkspaceList
   **/
  public WorkspaceList endPosition(String endPosition) {
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
   * resultSetSize.
   *
   * @return WorkspaceList
   **/
  public WorkspaceList resultSetSize(String resultSetSize) {
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
   * @return WorkspaceList
   **/
  public WorkspaceList startPosition(String startPosition) {
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
   * @return WorkspaceList
   **/
  public WorkspaceList totalSetSize(String totalSetSize) {
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
   * workspaces.
   *
   * @return WorkspaceList
   **/
  public WorkspaceList workspaces(java.util.List<Workspace> workspaces) {
    this.workspaces = workspaces;
    return this;
  }
  
  /**
   * addWorkspacesItem.
   *
   * @return WorkspaceList
   **/
  public WorkspaceList addWorkspacesItem(Workspace workspacesItem) {
    if (this.workspaces == null) {
      this.workspaces = new java.util.ArrayList<>();
    }
    this.workspaces.add(workspacesItem);
    return this;
  }

  /**
   * A list of workspaces..
   * @return workspaces
   **/
  @Schema(description = "A list of workspaces.")
  public java.util.List<Workspace> getWorkspaces() {
    return workspaces;
  }

  /**
   * setWorkspaces.
   **/
  public void setWorkspaces(java.util.List<Workspace> workspaces) {
    this.workspaces = workspaces;
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
    WorkspaceList workspaceList = (WorkspaceList) o;
    return Objects.equals(this.endPosition, workspaceList.endPosition) &&
        Objects.equals(this.resultSetSize, workspaceList.resultSetSize) &&
        Objects.equals(this.startPosition, workspaceList.startPosition) &&
        Objects.equals(this.totalSetSize, workspaceList.totalSetSize) &&
        Objects.equals(this.workspaces, workspaceList.workspaces);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(endPosition, resultSetSize, startPosition, totalSetSize, workspaces);
  }


  /**
   * Converts the given object to string.
   */
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

