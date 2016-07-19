package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class FileType   {
  
  private String fileExtension = null;
  private String mimeType = null;

  
  /**
   * 
   **/
  public FileType fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileExtension")
  public String getFileExtension() {
    return fileExtension;
  }
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  
  /**
   * The mime-type of a file type listed in a fileTypes collection.
   **/
  public FileType mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mime-type of a file type listed in a fileTypes collection.")
  @JsonProperty("mimeType")
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

