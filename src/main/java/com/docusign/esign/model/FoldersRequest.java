package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FoldersRequest.
 *
 */

public class FoldersRequest {
  @JsonProperty("envelopeIds")
  private java.util.List<String> envelopeIds = null;

  @JsonProperty("fromFolderId")
  private String fromFolderId = null;


  /**
   * envelopeIds.
   *
   * @return FoldersRequest
   **/
  public FoldersRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }
  
  /**
   * addEnvelopeIdsItem.
   *
   * @return FoldersRequest
   **/
  public FoldersRequest addEnvelopeIdsItem(String envelopeIdsItem) {
    if (this.envelopeIds == null) {
      this.envelopeIds = new java.util.ArrayList<String>();
    }
    this.envelopeIds.add(envelopeIdsItem);
    return this;
  }

  /**
   * .
   * @return envelopeIds
   **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }

  /**
   * setEnvelopeIds.
   **/
  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }


  /**
   * fromFolderId.
   *
   * @return FoldersRequest
   **/
  public FoldersRequest fromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
    return this;
  }

  /**
   *  The folder ID the envelope is being moved from..
   * @return fromFolderId
   **/
  @ApiModelProperty(value = " The folder ID the envelope is being moved from.")
  public String getFromFolderId() {
    return fromFolderId;
  }

  /**
   * setFromFolderId.
   **/
  public void setFromFolderId(String fromFolderId) {
    this.fromFolderId = fromFolderId;
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
    FoldersRequest foldersRequest = (FoldersRequest) o;
    return Objects.equals(this.envelopeIds, foldersRequest.envelopeIds) &&
        Objects.equals(this.fromFolderId, foldersRequest.fromFolderId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, fromFolderId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoldersRequest {\n");
    
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    fromFolderId: ").append(toIndentedString(fromFolderId)).append("\n");
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

