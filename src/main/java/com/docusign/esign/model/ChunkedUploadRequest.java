package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChunkedUploadRequest
 */

public class ChunkedUploadRequest {
  @JsonProperty("chunkedUploadId")
  private String chunkedUploadId = null;

  @JsonProperty("data")
  private String data = null;

  public ChunkedUploadRequest chunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
    return this;
  }

   /**
   * 
   * @return chunkedUploadId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChunkedUploadId() {
    return chunkedUploadId;
  }

  public void setChunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
  }

  public ChunkedUploadRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * 
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkedUploadRequest chunkedUploadRequest = (ChunkedUploadRequest) o;
    return Objects.equals(this.chunkedUploadId, chunkedUploadRequest.chunkedUploadId) &&
        Objects.equals(this.data, chunkedUploadRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkedUploadId, data);
  }


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

