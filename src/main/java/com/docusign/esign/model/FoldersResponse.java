package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoldersResponse foldersResponse = (FoldersResponse) o;

    return true && Objects.equals(folders, foldersResponse.folders)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(folders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersResponse {\n");
    
    if (folders != null)
      sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
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

