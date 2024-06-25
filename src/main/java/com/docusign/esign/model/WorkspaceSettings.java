package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * This object provides information about the settings for the workspace..
 *
 */
@Schema(description = "This object provides information about the settings for the workspace.")

public class WorkspaceSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("commentsAllowed")
  private String commentsAllowed = null;


  /**
   * commentsAllowed.
   *
   * @return WorkspaceSettings
   **/
  public WorkspaceSettings commentsAllowed(String commentsAllowed) {
    this.commentsAllowed = commentsAllowed;
    return this;
  }

  /**
   * .
   * @return commentsAllowed
   **/
  @Schema(description = "")
  public String getCommentsAllowed() {
    return commentsAllowed;
  }

  /**
   * setCommentsAllowed.
   **/
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(commentsAllowed);
  }


  /**
   * Converts the given object to string.
   */
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

