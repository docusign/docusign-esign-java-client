package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BulkSendRequest
 */

public class BulkSendRequest {
  @JsonProperty("envelopeOrTemplateId")
  private String envelopeOrTemplateId = null;

  public BulkSendRequest envelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
    return this;
  }

   /**
   * 
   * @return envelopeOrTemplateId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEnvelopeOrTemplateId() {
    return envelopeOrTemplateId;
  }

  public void setEnvelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendRequest bulkSendRequest = (BulkSendRequest) o;
    return Objects.equals(this.envelopeOrTemplateId, bulkSendRequest.envelopeOrTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeOrTemplateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendRequest {\n");
    
    sb.append("    envelopeOrTemplateId: ").append(toIndentedString(envelopeOrTemplateId)).append("\n");
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

