package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Signer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * BulkRecipientsUpdateResponse.
 *
 */

public class BulkRecipientsUpdateResponse {
  @JsonProperty("signer")
  private Signer signer = null;

  /**
   * signer.
   *
   * @return BulkRecipientsUpdateResponse
   **/
  public BulkRecipientsUpdateResponse signer(Signer signer) {
    this.signer = signer;
    return this;
  }

  /**
   * .
   * 
   * @return signer
   **/
  @Schema(description = "")
  public Signer getSigner() {
    return signer;
  }

  /**
   * setSigner.
   **/
  public void setSigner(Signer signer) {
    this.signer = signer;
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
    BulkRecipientsUpdateResponse bulkRecipientsUpdateResponse = (BulkRecipientsUpdateResponse) o;
    return Objects.equals(this.signer, bulkRecipientsUpdateResponse.signer);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(signer);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsUpdateResponse {\n");

    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
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
