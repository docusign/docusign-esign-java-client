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
 * This response object is returned after you upload a chunked upload..
 *
 */
@ApiModel(description = "This response object is returned after you upload a chunked upload.")

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


  /**
   * checksum.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * .
   * @return checksum
   **/
  @ApiModelProperty(value = "")
  public String getChecksum() {
    return checksum;
  }

  /**
   * setChecksum.
   **/
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  /**
   * chunkedUploadId.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse chunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
    return this;
  }

  /**
   * .
   * @return chunkedUploadId
   **/
  @ApiModelProperty(value = "")
  public String getChunkedUploadId() {
    return chunkedUploadId;
  }

  /**
   * setChunkedUploadId.
   **/
  public void setChunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
  }


  /**
   * chunkedUploadParts.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse chunkedUploadParts(java.util.List<ChunkedUploadPart> chunkedUploadParts) {
    this.chunkedUploadParts = chunkedUploadParts;
    return this;
  }
  
  /**
   * addChunkedUploadPartsItem.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse addChunkedUploadPartsItem(ChunkedUploadPart chunkedUploadPartsItem) {
    if (this.chunkedUploadParts == null) {
      this.chunkedUploadParts = new java.util.ArrayList<>();
    }
    this.chunkedUploadParts.add(chunkedUploadPartsItem);
    return this;
  }

  /**
   * .
   * @return chunkedUploadParts
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ChunkedUploadPart> getChunkedUploadParts() {
    return chunkedUploadParts;
  }

  /**
   * setChunkedUploadParts.
   **/
  public void setChunkedUploadParts(java.util.List<ChunkedUploadPart> chunkedUploadParts) {
    this.chunkedUploadParts = chunkedUploadParts;
  }


  /**
   * chunkedUploadUri.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse chunkedUploadUri(String chunkedUploadUri) {
    this.chunkedUploadUri = chunkedUploadUri;
    return this;
  }

  /**
   * .
   * @return chunkedUploadUri
   **/
  @ApiModelProperty(value = "")
  public String getChunkedUploadUri() {
    return chunkedUploadUri;
  }

  /**
   * setChunkedUploadUri.
   **/
  public void setChunkedUploadUri(String chunkedUploadUri) {
    this.chunkedUploadUri = chunkedUploadUri;
  }


  /**
   * committed.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse committed(String committed) {
    this.committed = committed;
    return this;
  }

  /**
   * .
   * @return committed
   **/
  @ApiModelProperty(value = "")
  public String getCommitted() {
    return committed;
  }

  /**
   * setCommitted.
   **/
  public void setCommitted(String committed) {
    this.committed = committed;
  }


  /**
   * expirationDateTime.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * .
   * @return expirationDateTime
   **/
  @ApiModelProperty(value = "")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * setExpirationDateTime.
   **/
  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  /**
   * maxChunkedUploadParts.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse maxChunkedUploadParts(String maxChunkedUploadParts) {
    this.maxChunkedUploadParts = maxChunkedUploadParts;
    return this;
  }

  /**
   * .
   * @return maxChunkedUploadParts
   **/
  @ApiModelProperty(value = "")
  public String getMaxChunkedUploadParts() {
    return maxChunkedUploadParts;
  }

  /**
   * setMaxChunkedUploadParts.
   **/
  public void setMaxChunkedUploadParts(String maxChunkedUploadParts) {
    this.maxChunkedUploadParts = maxChunkedUploadParts;
  }


  /**
   * maxTotalSize.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse maxTotalSize(String maxTotalSize) {
    this.maxTotalSize = maxTotalSize;
    return this;
  }

  /**
   * .
   * @return maxTotalSize
   **/
  @ApiModelProperty(value = "")
  public String getMaxTotalSize() {
    return maxTotalSize;
  }

  /**
   * setMaxTotalSize.
   **/
  public void setMaxTotalSize(String maxTotalSize) {
    this.maxTotalSize = maxTotalSize;
  }


  /**
   * totalSize.
   *
   * @return ChunkedUploadResponse
   **/
  public ChunkedUploadResponse totalSize(String totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * .
   * @return totalSize
   **/
  @ApiModelProperty(value = "")
  public String getTotalSize() {
    return totalSize;
  }

  /**
   * setTotalSize.
   **/
  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(checksum, chunkedUploadId, chunkedUploadParts, chunkedUploadUri, committed, expirationDateTime, maxChunkedUploadParts, maxTotalSize, totalSize);
  }


  /**
   * Converts the given object to string.
   */
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

