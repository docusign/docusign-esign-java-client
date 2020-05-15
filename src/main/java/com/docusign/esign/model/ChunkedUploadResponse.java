package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ChunkedUploadPart;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChunkedUploadResponse
 */

public class ChunkedUploadResponse {
  @JsonProperty("checksum")
  private String checksum = null;

  @JsonProperty("chunkedUploadId")
  private String chunkedUploadId = null;

  @JsonProperty("chunkedUploadParts")
  private java.util.List<ChunkedUploadPart> chunkedUploadParts = null;

  @JsonProperty("chunkedUploadUri")
  private String chunkedUploadUri = null;

  @JsonProperty("committed")
  private String committed = null;

  @JsonProperty("expirationDateTime")
  private String expirationDateTime = null;

  @JsonProperty("maxChunkedUploadParts")
  private String maxChunkedUploadParts = null;

  @JsonProperty("maxTotalSize")
  private String maxTotalSize = null;

  @JsonProperty("totalSize")
  private String totalSize = null;

  public ChunkedUploadResponse checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * 
   * @return checksum
  **/
  @ApiModelProperty(value = "")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public ChunkedUploadResponse chunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
    return this;
  }

   /**
   * 
   * @return chunkedUploadId
  **/
  @ApiModelProperty(value = "")
  public String getChunkedUploadId() {
    return chunkedUploadId;
  }

  public void setChunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
  }

  public ChunkedUploadResponse chunkedUploadParts(java.util.List<ChunkedUploadPart> chunkedUploadParts) {
    this.chunkedUploadParts = chunkedUploadParts;
    return this;
  }

  public ChunkedUploadResponse addChunkedUploadPartsItem(ChunkedUploadPart chunkedUploadPartsItem) {
    if (this.chunkedUploadParts == null) {
      this.chunkedUploadParts = new java.util.ArrayList<ChunkedUploadPart>();
    }
    this.chunkedUploadParts.add(chunkedUploadPartsItem);
    return this;
  }

   /**
   * 
   * @return chunkedUploadParts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ChunkedUploadPart> getChunkedUploadParts() {
    return chunkedUploadParts;
  }

  public void setChunkedUploadParts(java.util.List<ChunkedUploadPart> chunkedUploadParts) {
    this.chunkedUploadParts = chunkedUploadParts;
  }

  public ChunkedUploadResponse chunkedUploadUri(String chunkedUploadUri) {
    this.chunkedUploadUri = chunkedUploadUri;
    return this;
  }

   /**
   * 
   * @return chunkedUploadUri
  **/
  @ApiModelProperty(value = "")
  public String getChunkedUploadUri() {
    return chunkedUploadUri;
  }

  public void setChunkedUploadUri(String chunkedUploadUri) {
    this.chunkedUploadUri = chunkedUploadUri;
  }

  public ChunkedUploadResponse committed(String committed) {
    this.committed = committed;
    return this;
  }

   /**
   * 
   * @return committed
  **/
  @ApiModelProperty(value = "")
  public String getCommitted() {
    return committed;
  }

  public void setCommitted(String committed) {
    this.committed = committed;
  }

  public ChunkedUploadResponse expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * 
   * @return expirationDateTime
  **/
  @ApiModelProperty(value = "")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public ChunkedUploadResponse maxChunkedUploadParts(String maxChunkedUploadParts) {
    this.maxChunkedUploadParts = maxChunkedUploadParts;
    return this;
  }

   /**
   * 
   * @return maxChunkedUploadParts
  **/
  @ApiModelProperty(value = "")
  public String getMaxChunkedUploadParts() {
    return maxChunkedUploadParts;
  }

  public void setMaxChunkedUploadParts(String maxChunkedUploadParts) {
    this.maxChunkedUploadParts = maxChunkedUploadParts;
  }

  public ChunkedUploadResponse maxTotalSize(String maxTotalSize) {
    this.maxTotalSize = maxTotalSize;
    return this;
  }

   /**
   * 
   * @return maxTotalSize
  **/
  @ApiModelProperty(value = "")
  public String getMaxTotalSize() {
    return maxTotalSize;
  }

  public void setMaxTotalSize(String maxTotalSize) {
    this.maxTotalSize = maxTotalSize;
  }

  public ChunkedUploadResponse totalSize(String totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 
   * @return totalSize
  **/
  @ApiModelProperty(value = "")
  public String getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkedUploadResponse chunkedUploadResponse = (ChunkedUploadResponse) o;
    return Objects.equals(this.checksum, chunkedUploadResponse.checksum) &&
        Objects.equals(this.chunkedUploadId, chunkedUploadResponse.chunkedUploadId) &&
        Objects.equals(this.chunkedUploadParts, chunkedUploadResponse.chunkedUploadParts) &&
        Objects.equals(this.chunkedUploadUri, chunkedUploadResponse.chunkedUploadUri) &&
        Objects.equals(this.committed, chunkedUploadResponse.committed) &&
        Objects.equals(this.expirationDateTime, chunkedUploadResponse.expirationDateTime) &&
        Objects.equals(this.maxChunkedUploadParts, chunkedUploadResponse.maxChunkedUploadParts) &&
        Objects.equals(this.maxTotalSize, chunkedUploadResponse.maxTotalSize) &&
        Objects.equals(this.totalSize, chunkedUploadResponse.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksum, chunkedUploadId, chunkedUploadParts, chunkedUploadUri, committed, expirationDateTime, maxChunkedUploadParts, maxTotalSize, totalSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkedUploadResponse {\n");
    
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    chunkedUploadId: ").append(toIndentedString(chunkedUploadId)).append("\n");
    sb.append("    chunkedUploadParts: ").append(toIndentedString(chunkedUploadParts)).append("\n");
    sb.append("    chunkedUploadUri: ").append(toIndentedString(chunkedUploadUri)).append("\n");
    sb.append("    committed: ").append(toIndentedString(committed)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    maxChunkedUploadParts: ").append(toIndentedString(maxChunkedUploadParts)).append("\n");
    sb.append("    maxTotalSize: ").append(toIndentedString(maxTotalSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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

