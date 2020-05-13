package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WorkspaceSettings
 */

public class WorkspaceSettings {
  @JsonProperty("commentsAllowed")
  private String commentsAllowed = null;

  public WorkspaceSettings commentsAllowed(String commentsAllowed) {
    this.commentsAllowed = commentsAllowed;
    return this;
  }

   /**
   * 
   * @return commentsAllowed
  **/
  @ApiModelProperty(value = "")
  public String getCommentsAllowed() {
    return commentsAllowed;
  }

  public void setCommentsAllowed(String commentsAllowed) {
    this.commentsAllowed = commentsAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSettings workspaceSettings = (WorkspaceSettings) o;
    return Objects.equals(this.commentsAllowed, workspaceSettings.commentsAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentsAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSettings {\n");
    
    sb.append("    commentsAllowed: ").append(toIndentedString(commentsAllowed)).append("\n");
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

