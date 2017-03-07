package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ChunkedUploadPart;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ChunkedUploadResponse   {
  
  private String checksum = null;
  private String chunkedUploadId = null;
  private java.util.List<ChunkedUploadPart> chunkedUploadParts = new java.util.ArrayList<ChunkedUploadPart>();
  private String chunkedUploadUri = null;
  private String committed = null;
  private String expirationDateTime = null;
  private String totalSize = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("checksum")
  public String getChecksum() {
    return checksum;
  }
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  
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
  @JsonProperty("chunkedUploadParts")
  public java.util.List<ChunkedUploadPart> getChunkedUploadParts() {
    return chunkedUploadParts;
  }
  public void setChunkedUploadParts(java.util.List<ChunkedUploadPart> chunkedUploadParts) {
    this.chunkedUploadParts = chunkedUploadParts;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chunkedUploadUri")
  public String getChunkedUploadUri() {
    return chunkedUploadUri;
  }
  public void setChunkedUploadUri(String chunkedUploadUri) {
    this.chunkedUploadUri = chunkedUploadUri;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("committed")
  public String getCommitted() {
    return committed;
  }
  public void setCommitted(String committed) {
    this.committed = committed;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expirationDateTime")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }
  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalSize")
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

    return true && Objects.equals(checksum, chunkedUploadResponse.checksum) &&
        Objects.equals(chunkedUploadId, chunkedUploadResponse.chunkedUploadId) &&
        Objects.equals(chunkedUploadParts, chunkedUploadResponse.chunkedUploadParts) &&
        Objects.equals(chunkedUploadUri, chunkedUploadResponse.chunkedUploadUri) &&
        Objects.equals(committed, chunkedUploadResponse.committed) &&
        Objects.equals(expirationDateTime, chunkedUploadResponse.expirationDateTime) &&
        Objects.equals(totalSize, chunkedUploadResponse.totalSize)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksum, chunkedUploadId, chunkedUploadParts, chunkedUploadUri, committed, expirationDateTime, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkedUploadResponse {\n");
    
    if (checksum != null)
      sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    if (chunkedUploadId != null)
      sb.append("    chunkedUploadId: ").append(toIndentedString(chunkedUploadId)).append("\n");
    if (chunkedUploadParts != null)
      sb.append("    chunkedUploadParts: ").append(toIndentedString(chunkedUploadParts)).append("\n");
    if (chunkedUploadUri != null)
      sb.append("    chunkedUploadUri: ").append(toIndentedString(chunkedUploadUri)).append("\n");
    if (committed != null)
      sb.append("    committed: ").append(toIndentedString(committed)).append("\n");
    if (expirationDateTime != null)
      sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    if (totalSize != null)
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

