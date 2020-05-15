package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Signer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkRecipientsUpdateResponse
 */

public class BulkRecipientsUpdateResponse {
  @JsonProperty("signer")
  private Signer signer = null;

  public BulkRecipientsUpdateResponse signer(Signer signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Get signer
   * @return signer
  **/
  @ApiModelProperty(value = "")
  public Signer getSigner() {
    return signer;
  }

  public void setSigner(Signer signer) {
    this.signer = signer;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(signer);
  }


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

