package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
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
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactionIds")
  public java.util.List<String> getTransactionIds() {
    return transactionIds;
  }
  public void setTransactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeIdsRequest envelopeIdsRequest = (EnvelopeIdsRequest) o;
    return Objects.equals(envelopeIds, envelopeIdsRequest.envelopeIds) &&
        Objects.equals(transactionIds, envelopeIdsRequest.transactionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, transactionIds);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeIdsRequest {\n");
    
    sb.append("    envelopeIds: ").append(StringUtil.toIndentedString(envelopeIds)).append("\n");
    sb.append("    transactionIds: ").append(StringUtil.toIndentedString(transactionIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
