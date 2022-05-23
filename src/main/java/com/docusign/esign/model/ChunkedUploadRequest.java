package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ChunkedUploadRequest. */
public class ChunkedUploadRequest {
  @JsonProperty("chunkedUploadId")
  private String chunkedUploadId = null;

  @JsonProperty("data")
  private String data = null;

  /**
   * chunkedUploadId.
   *
   * @return ChunkedUploadRequest
   */
  public ChunkedUploadRequest chunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
    return this;
  }

  /**
   * .
   *
   * @return chunkedUploadId
   */
  @ApiModelProperty(value = "")
  public String getChunkedUploadId() {
    return chunkedUploadId;
  }

  /** setChunkedUploadId. */
  public void setChunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
  }

  /**
   * data.
   *
   * @return ChunkedUploadRequest
   */
  public ChunkedUploadRequest data(String data) {
    this.data = data;
    return this;
  }

  /**
   * .
   *
   * @return data
   */
  @ApiModelProperty(value = "")
  public String getData() {
    return data;
  }

  /** setData. */
  public void setData(String data) {
    this.data = data;
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
    ChunkedUploadRequest chunkedUploadRequest = (ChunkedUploadRequest) o;
    return Objects.equals(this.chunkedUploadId, chunkedUploadRequest.chunkedUploadId)
        && Objects.equals(this.data, chunkedUploadRequest.data);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(chunkedUploadId, data);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkedUploadRequest {\n");

    sb.append("    chunkedUploadId: ").append(toIndentedString(chunkedUploadId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
