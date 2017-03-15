package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class EnvelopeIdsRequest   {
  
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();
  private java.util.List<String> transactionIds = new java.util.ArrayList<String>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopeIds")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }
  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  
  /**
   * A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.
   **/
  
  @ApiModelProperty(value = "A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.")
  @JsonProperty("transactionIds")
  public java.util.List<String> getTransactionIds() {
    return transactionIds;
  }
  public void setTransactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeIdsRequest envelopeIdsRequest = (EnvelopeIdsRequest) o;

    return true && Objects.equals(envelopeIds, envelopeIdsRequest.envelopeIds) &&
        Objects.equals(transactionIds, envelopeIdsRequest.transactionIds)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, transactionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeIdsRequest {\n");
    
    if (envelopeIds != null)
      sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    if (transactionIds != null)
      sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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

