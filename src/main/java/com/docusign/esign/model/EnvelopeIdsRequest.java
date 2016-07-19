package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class EnvelopeIdsRequest   {
  
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();
  private java.util.List<String> transactionIds = new java.util.ArrayList<String>();

  
  /**
   * 
   **/
  public EnvelopeIdsRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("envelopeIds")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }
  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  
  /**
   *  A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.
   **/
  public EnvelopeIdsRequest transactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.")
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
    return Objects.equals(this.envelopeIds, envelopeIdsRequest.envelopeIds) &&
        Objects.equals(this.transactionIds, envelopeIdsRequest.transactionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, transactionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeIdsRequest {\n");
    
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
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

