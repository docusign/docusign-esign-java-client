package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingCopy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendingList
 */

public class BulkSendingList {
  @JsonProperty("bulkCopies")
  private java.util.List<BulkSendingCopy> bulkCopies = null;

  @JsonProperty("listId")
  private String listId = null;

  @JsonProperty("name")
  private String name = null;

  public BulkSendingList bulkCopies(java.util.List<BulkSendingCopy> bulkCopies) {
    this.bulkCopies = bulkCopies;
    return this;
  }

  public BulkSendingList addBulkCopiesItem(BulkSendingCopy bulkCopiesItem) {
    if (this.bulkCopies == null) {
      this.bulkCopies = new java.util.ArrayList<BulkSendingCopy>();
    }
    this.bulkCopies.add(bulkCopiesItem);
    return this;
  }

   /**
   * 
   * @return bulkCopies
  **/
  @ApiModelProperty(value = "")
  public java.util.List<BulkSendingCopy> getBulkCopies() {
    return bulkCopies;
  }

  public void setBulkCopies(java.util.List<BulkSendingCopy> bulkCopies) {
    this.bulkCopies = bulkCopies;
  }

  public BulkSendingList listId(String listId) {
    this.listId = listId;
    return this;
  }

   /**
   * 
   * @return listId
  **/
  @ApiModelProperty(value = "")
  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public BulkSendingList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendingList bulkSendingList = (BulkSendingList) o;
    return Objects.equals(this.bulkCopies, bulkSendingList.bulkCopies) &&
        Objects.equals(this.listId, bulkSendingList.listId) &&
        Objects.equals(this.name, bulkSendingList.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkCopies, listId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingList {\n");
    
    sb.append("    bulkCopies: ").append(toIndentedString(bulkCopies)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

