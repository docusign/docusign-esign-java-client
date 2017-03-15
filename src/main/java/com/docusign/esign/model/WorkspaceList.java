package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Workspace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Provides properties that describe the workspaces avaialble.
 **/

@ApiModel(description = "Provides properties that describe the workspaces avaialble.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class WorkspaceList   {
  
  private String endPosition = null;
  private String resultSetSize = null;
  private String startPosition = null;
  private String totalSetSize = null;
  private java.util.List<Workspace> workspaces = new java.util.ArrayList<Workspace>();

  
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
   * A list of workspaces.
   **/
  
  @ApiModelProperty(value = "A list of workspaces.")
  @JsonProperty("workspaces")
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

    return true && Objects.equals(endPosition, workspaceList.endPosition) &&
        Objects.equals(resultSetSize, workspaceList.resultSetSize) &&
        Objects.equals(startPosition, workspaceList.startPosition) &&
        Objects.equals(totalSetSize, workspaceList.totalSetSize) &&
        Objects.equals(workspaces, workspaceList.workspaces)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPosition, resultSetSize, startPosition, totalSetSize, workspaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceList {\n");
    
    if (endPosition != null)
      sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    if (resultSetSize != null)
      sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    if (startPosition != null)
      sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    if (totalSetSize != null)
      sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    if (workspaces != null)
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

