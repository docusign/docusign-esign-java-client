package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendingListSummary
 */

public class BulkSendingListSummary {
  @JsonProperty("bulkSendListId")
  private String bulkSendListId = null;

  @JsonProperty("createdByUser")
  private String createdByUser = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("name")
  private String name = null;

  public BulkSendingListSummary bulkSendListId(String bulkSendListId) {
    this.bulkSendListId = bulkSendListId;
    return this;
  }

   /**
   * 
   * @return bulkSendListId
  **/
  @ApiModelProperty(value = "")
  public String getBulkSendListId() {
    return bulkSendListId;
  }

  public void setBulkSendListId(String bulkSendListId) {
    this.bulkSendListId = bulkSendListId;
  }

  public BulkSendingListSummary createdByUser(String createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * 
   * @return createdByUser
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(String createdByUser) {
    this.createdByUser = createdByUser;
  }

  public BulkSendingListSummary createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public BulkSendingListSummary name(String name) {
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
    BulkSendingListSummary bulkSendingListSummary = (BulkSendingListSummary) o;
    return Objects.equals(this.bulkSendListId, bulkSendingListSummary.bulkSendListId) &&
        Objects.equals(this.createdByUser, bulkSendingListSummary.createdByUser) &&
        Objects.equals(this.createdDate, bulkSendingListSummary.createdDate) &&
        Objects.equals(this.name, bulkSendingListSummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkSendListId, createdByUser, createdDate, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendingListSummary {\n");
    
    sb.append("    bulkSendListId: ").append(toIndentedString(bulkSendListId)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

