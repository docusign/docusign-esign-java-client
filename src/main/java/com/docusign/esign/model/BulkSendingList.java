package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BulkSendingCopy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This object contains the details for the bulk send list..
 *
 */
@Schema(description = "This object contains the details for the bulk send list.")

public class BulkSendingList {
  @JsonProperty("bulkCopies")
  private java.util.List<BulkSendingCopy> bulkCopies = null;

  @JsonProperty("listId")
  private String listId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * bulkCopies.
   *
   * @return BulkSendingList
   **/
  public BulkSendingList bulkCopies(java.util.List<BulkSendingCopy> bulkCopies) {
    this.bulkCopies = bulkCopies;
    return this;
  }
  
  /**
   * addBulkCopiesItem.
   *
   * @return BulkSendingList
   **/
  public BulkSendingList addBulkCopiesItem(BulkSendingCopy bulkCopiesItem) {
    if (this.bulkCopies == null) {
      this.bulkCopies = new java.util.ArrayList<>();
    }
    this.bulkCopies.add(bulkCopiesItem);
    return this;
  }

  /**
   * .
   * @return bulkCopies
   **/
  @Schema(description = "")
  public java.util.List<BulkSendingCopy> getBulkCopies() {
    return bulkCopies;
  }

  /**
   * setBulkCopies.
   **/
  public void setBulkCopies(java.util.List<BulkSendingCopy> bulkCopies) {
    this.bulkCopies = bulkCopies;
  }


  /**
   * listId.
   *
   * @return BulkSendingList
   **/
  public BulkSendingList listId(String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * .
   * @return listId
   **/
  @Schema(description = "")
  public String getListId() {
    return listId;
  }

  /**
   * setListId.
   **/
  public void setListId(String listId) {
    this.listId = listId;
  }


  /**
   * name.
   *
   * @return BulkSendingList
   **/
  public BulkSendingList name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
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
    BulkSendingList bulkSendingList = (BulkSendingList) o;
    return Objects.equals(this.bulkCopies, bulkSendingList.bulkCopies) &&
        Objects.equals(this.listId, bulkSendingList.listId) &&
        Objects.equals(this.name, bulkSendingList.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(bulkCopies, listId, name);
  }


  /**
   * Converts the given object to string.
   */
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

