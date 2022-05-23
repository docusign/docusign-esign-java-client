package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** WorkspaceSettings. */
public class WorkspaceSettings {
  @JsonProperty("commentsAllowed")
  private String commentsAllowed = null;

  /**
   * commentsAllowed.
   *
   * @return WorkspaceSettings
   */
  public WorkspaceSettings commentsAllowed(String commentsAllowed) {
    this.commentsAllowed = commentsAllowed;
    return this;
  }

  /**
   * .
   *
   * @return commentsAllowed
   */
  @ApiModelProperty(value = "")
  public String getCommentsAllowed() {
    return commentsAllowed;
  }

  /** setCommentsAllowed. */
  public void setCommentsAllowed(String commentsAllowed) {
    this.commentsAllowed = commentsAllowed;
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
    WorkspaceSettings workspaceSettings = (WorkspaceSettings) o;
    return Objects.equals(this.commentsAllowed, workspaceSettings.commentsAllowed);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(commentsAllowed);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSettings {\n");

    sb.append("    commentsAllowed: ").append(toIndentedString(commentsAllowed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
