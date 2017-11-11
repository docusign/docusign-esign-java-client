package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChunkedUploadPart
 */

public class ChunkedUploadPart {
  @JsonProperty("sequence")
  private String sequence = null;

  @JsonProperty("size")
  private String size = null;

  public ChunkedUploadPart sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * 
   * @return sequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public ChunkedUploadPart size(String size) {
    this.size = size;
    return this;
  }

   /**
   * 
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkedUploadPart chunkedUploadPart = (ChunkedUploadPart) o;
    return Objects.equals(this.sequence, chunkedUploadPart.sequence) &&
        Objects.equals(this.size, chunkedUploadPart.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkedUploadPart {\n");
    
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

