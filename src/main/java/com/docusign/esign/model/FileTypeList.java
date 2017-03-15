package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.FileType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileTypeList fileTypeList = (FileTypeList) o;

    return true && Objects.equals(fileTypes, fileTypeList.fileTypes)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTypeList {\n");
    
    if (fileTypes != null)
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

