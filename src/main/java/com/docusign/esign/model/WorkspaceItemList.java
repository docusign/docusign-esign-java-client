package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.WorkspaceItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Provides properties that describe the items contained in a workspace..
 *
 */
@ApiModel(description = "Provides properties that describe the items contained in a workspace.")

public class WorkspaceItemList {
  @JsonProperty("items")
  private java.util.List<WorkspaceItem> items = null;


  /**
   * items.
   *
   * @return WorkspaceItemList
   **/
  public WorkspaceItemList items(java.util.List<WorkspaceItem> items) {
    this.items = items;
    return this;
  }
  
  /**
   * addItemsItem.
   *
   * @return WorkspaceItemList
   **/
  public WorkspaceItemList addItemsItem(WorkspaceItem itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<WorkspaceItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * .
   * @return items
   **/
  @ApiModelProperty(value = "")
  public java.util.List<WorkspaceItem> getItems() {
    return items;
  }

  /**
   * setItems.
   **/
  public void setItems(java.util.List<WorkspaceItem> items) {
    this.items = items;
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
    WorkspaceItemList workspaceItemList = (WorkspaceItemList) o;
    return Objects.equals(this.items, workspaceItemList.items);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceItemList {\n");
    
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

