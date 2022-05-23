package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** FileTypeList. */
public class FileTypeList {
  @JsonProperty("fileTypes")
  private java.util.List<FileType> fileTypes = null;

  /**
   * fileTypes.
   *
   * @return FileTypeList
   */
  public FileTypeList fileTypes(java.util.List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
    return this;
  }

  /**
   * addFileTypesItem.
   *
   * @return FileTypeList
   */
  public FileTypeList addFileTypesItem(FileType fileTypesItem) {
    if (this.fileTypes == null) {
      this.fileTypes = new java.util.ArrayList<>();
    }
    this.fileTypes.add(fileTypesItem);
    return this;
  }

  /**
   * A collection of file types..
   *
   * @return fileTypes
   */
  @ApiModelProperty(value = "A collection of file types.")
  public java.util.List<FileType> getFileTypes() {
    return fileTypes;
  }

  /** setFileTypes. */
  public void setFileTypes(java.util.List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
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
    FileTypeList fileTypeList = (FileTypeList) o;
    return Objects.equals(this.fileTypes, fileTypeList.fileTypes);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(fileTypes);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTypeList {\n");

    sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
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
