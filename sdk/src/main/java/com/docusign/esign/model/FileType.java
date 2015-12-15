package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FileType   {
  
  private String fileExtension = null;
  private String mimeType = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "The mime-type of a file type listed in a fileTypes collection.")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileType fileType = (FileType) o;
    return Objects.equals(fileExtension, fileType.fileExtension) &&
        Objects.equals(mimeType, fileType.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileExtension, mimeType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileType {\n");
    
    sb.append("    fileExtension: ").append(StringUtil.toIndentedString(fileExtension)).append("\n");
    sb.append("    mimeType: ").append(StringUtil.toIndentedString(mimeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
