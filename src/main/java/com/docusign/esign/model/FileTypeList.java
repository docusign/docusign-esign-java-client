package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.FileType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileTypeList
 */

public class FileTypeList {
  @JsonProperty("fileTypes")
  private java.util.List<FileType> fileTypes = new java.util.ArrayList<FileType>();

  public FileTypeList fileTypes(java.util.List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }

  public FileTypeList addFileTypesItem(FileType fileTypesItem) {
    this.fileTypes.add(fileTypesItem);
    return this;
  }

   /**
   * A collection of file types.
   * @return fileTypes
  **/
  @ApiModelProperty(example = "null", value = "A collection of file types.")
  public java.util.List<FileType> getFileTypes() {
    return fileTypes;
  }

  public void setFileTypes(java.util.List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileTypeList fileTypeList = (FileTypeList) o;
    return Objects.equals(this.fileTypes, fileTypeList.fileTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTypeList {\n");
    
    sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
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

