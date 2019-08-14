package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FoldersRequest
 */

public class FoldersRequest {
  @JsonProperty("envelopeIds")
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

  @JsonProperty("folders")
  private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();

  @JsonProperty("fromFolderId")
  private String fromFolderId = null;

  public FoldersRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }

  public FoldersRequest addEnvelopeIdsItem(String envelopeIdsItem) {
    this.envelopeIds.add(envelopeIdsItem);
    return this;
  }

   /**
   * 
   * @return envelopeIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }

  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  public FoldersRequest folders(java.util.List<Folder> folders) {
    this.folders = folders;
    return this;
  }

  public FoldersRequest addFoldersItem(Folder foldersItem) {
    this.folders.add(foldersItem);
    return this;
  }

   /**
   * 
   * @return folders
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Folder> getFolders() {
    return folders;
  }

  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  public FoldersRequest fromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
    return this;
  }

   /**
   *  The folder ID the envelope is being moved from.
   * @return fromFolderId
  **/
  @ApiModelProperty(example = "null", value = " The folder ID the envelope is being moved from.")
  public String getFromFolderId() {
    return fromFolderId;
  }

  public void setFromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoldersRequest foldersRequest = (FoldersRequest) o;
    return Objects.equals(this.envelopeIds, foldersRequest.envelopeIds) &&
        Objects.equals(this.folders, foldersRequest.folders) &&
        Objects.equals(this.fromFolderId, foldersRequest.fromFolderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, folders, fromFolderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersRequest {\n");
    
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    fromFolderId: ").append(toIndentedString(fromFolderId)).append("\n");
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

