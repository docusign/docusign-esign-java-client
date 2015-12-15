package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.FileType;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FileTypeList   {
  
  private java.util.List<FileType> fileTypes = new java.util.ArrayList<FileType>();

  
  /**
   * A collection of file types.
   **/
  @ApiModelProperty(value = "A collection of file types.")
  @JsonProperty("fileTypes")
  public java.util.List<FileType> getFileTypes() {
    return fileTypes;
  }
  public void setFileTypes(java.util.List<FileType> fileTypes) {
    this.fileTypes = fileTypes;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileTypeList fileTypeList = (FileTypeList) o;
    return Objects.equals(fileTypes, fileTypeList.fileTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTypes);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTypeList {\n");
    
    sb.append("    fileTypes: ").append(StringUtil.toIndentedString(fileTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
