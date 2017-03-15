package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.WorkspaceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Provides properties that describe the items contained in a workspace.
 **/

@ApiModel(description = "Provides properties that describe the items contained in a workspace.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class WorkspaceItemList   {
  
  private java.util.List<WorkspaceItem> items = new java.util.ArrayList<WorkspaceItem>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public java.util.List<WorkspaceItem> getItems() {
    return items;
  }
  public void setItems(java.util.List<WorkspaceItem> items) {
    this.items = items;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceItemList workspaceItemList = (WorkspaceItemList) o;

    return true && Objects.equals(items, workspaceItemList.items)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceItemList {\n");
    
    if (items != null)
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

