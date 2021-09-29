package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FoldersResponse.
 *
 */

public class FoldersResponse {
  @JsonProperty("folders")
  private java.util.List<Folder> folders = null;


  /**
   * folders.
   *
   * @return FoldersResponse
   **/
  public FoldersResponse folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }
  
  /**
   * addFoldersItem.
   *
   * @return FoldersResponse
   **/
  public FoldersResponse addFoldersItem(Folder foldersItem) {
    if (this.folders == null) {
      this.folders = new java.util.ArrayList<Folder>();
    }
    this.folders.add(foldersItem);
    return this;
  }

  /**
   * .
   * @return folders
   **/
  @ApiModelProperty(value = "")
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
    FoldersResponse foldersResponse = (FoldersResponse) o;
    return Objects.equals(this.folders, foldersResponse.folders);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(folders);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersResponse {\n");
    
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
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

