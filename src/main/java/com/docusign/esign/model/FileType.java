package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileType
 */

public class FileType {
  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  public FileType fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

   /**
   * 
   * @return fileExtension
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public FileType mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime-type of a file type listed in a fileTypes collection.
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "The mime-type of a file type listed in a fileTypes collection.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileType fileType = (FileType) o;
    return Objects.equals(this.fileExtension, fileType.fileExtension) &&
        Objects.equals(this.mimeType, fileType.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileExtension, mimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileType {\n");
    
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

