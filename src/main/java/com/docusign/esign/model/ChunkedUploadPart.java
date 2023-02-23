package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * An object that contains information about the chunked upload part..
 *
 */
@Schema(description = "An object that contains information about the chunked upload part.")

public class ChunkedUploadPart {
  @JsonProperty("sequence")
  private String sequence = null;

  @JsonProperty("size")
  private String size = null;

  /**
   * sequence.
   *
   * @return ChunkedUploadPart
   **/
  public ChunkedUploadPart sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * .
   * 
   * @return sequence
   **/
  @Schema(description = "")
  public String getSequence() {
    return sequence;
  }

  /**
   * setSequence.
   **/
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  /**
   * size.
   *
   * @return ChunkedUploadPart
   **/
  public ChunkedUploadPart size(String size) {
    this.size = size;
    return this;
  }

  /**
   * .
   * 
   * @return size
   **/
  @Schema(description = "")
  public String getSize() {
    return size;
  }

  /**
   * setSize.
   **/
  public void setSize(String size) {
    this.size = size;
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
    ChunkedUploadPart chunkedUploadPart = (ChunkedUploadPart) o;
    return Objects.equals(this.sequence, chunkedUploadPart.sequence) &&
        Objects.equals(this.size, chunkedUploadPart.size);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(sequence, size);
  }

  /**
   * Converts the given object to string.
   */
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
