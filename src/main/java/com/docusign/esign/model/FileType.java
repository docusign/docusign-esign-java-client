package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FileType.
 *
 */

public class FileType {
  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("mimeType")
  private String mimeType = null;


  /**
   * fileExtension.
   *
   * @return FileType
   **/
  public FileType fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * .
   * @return fileExtension
   **/
  @Schema(description = "")
  public String getFileExtension() {
    return fileExtension;
  }

  /**
   * setFileExtension.
   **/
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }


  /**
   * mimeType.
   *
   * @return FileType
   **/
  public FileType mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The mime-type of a file type listed in a fileTypes collection..
   * @return mimeType
   **/
  @Schema(description = "The mime-type of a file type listed in a fileTypes collection.")
  public String getMimeType() {
    return mimeType;
  }

  /**
   * setMimeType.
   **/
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
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
    FileType fileType = (FileType) o;
    return Objects.equals(this.fileExtension, fileType.fileExtension) &&
        Objects.equals(this.mimeType, fileType.mimeType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(fileExtension, mimeType);
  }


  /**
   * Converts the given object to string.
   */
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

