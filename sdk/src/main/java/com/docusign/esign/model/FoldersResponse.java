package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Folder;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FoldersResponse   {
  
  private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("folders")
  public java.util.List<Folder> getFolders() {
    return folders;
  }
  public void setFolders(java.util.List<Folder> folders) {
    this.folders = folders;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoldersResponse foldersResponse = (FoldersResponse) o;
    return Objects.equals(folders, foldersResponse.folders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folders);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersResponse {\n");
    
    sb.append("    folders: ").append(StringUtil.toIndentedString(folders)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
