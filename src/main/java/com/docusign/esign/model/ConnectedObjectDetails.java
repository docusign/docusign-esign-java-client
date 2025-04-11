package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectedObjectDetails.
 *
 */

public class ConnectedObjectDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("recordId")
  private String recordId = null;


  /**
   * recordId.
   *
   * @return ConnectedObjectDetails
   **/
  public ConnectedObjectDetails recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * .
   * @return recordId
   **/
  @Schema(description = "")
  public String getRecordId() {
    return recordId;
  }

  /**
   * setRecordId.
   **/
  public void setRecordId(String recordId) {
    this.recordId = recordId;
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
    ConnectedObjectDetails connectedObjectDetails = (ConnectedObjectDetails) o;
    return Objects.equals(this.recordId, connectedObjectDetails.recordId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recordId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedObjectDetails {\n");
    
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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

