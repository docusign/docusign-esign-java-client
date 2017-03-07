package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ChunkedUploadRequest   {
  
  private String chunkedUploadId = null;
  private String data = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chunkedUploadId")
  public String getChunkedUploadId() {
    return chunkedUploadId;
  }
  public void setChunkedUploadId(String chunkedUploadId) {
    this.chunkedUploadId = chunkedUploadId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
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

    return true && Objects.equals(chunkedUploadId, chunkedUploadRequest.chunkedUploadId) &&
        Objects.equals(data, chunkedUploadRequest.data)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkedUploadId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkedUploadRequest {\n");
    
    if (chunkedUploadId != null)
      sb.append("    chunkedUploadId: ").append(toIndentedString(chunkedUploadId)).append("\n");
    if (data != null)
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

