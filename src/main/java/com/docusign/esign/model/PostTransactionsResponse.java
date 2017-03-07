package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PostTransactionsResponse   {
  
  private String documentData = null;
  private String transactionSid = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("documentData")
  public String getDocumentData() {
    return documentData;
  }
  public void setDocumentData(String documentData) {
    this.documentData = documentData;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionSid")
  public String getTransactionSid() {
    return transactionSid;
  }
  public void setTransactionSid(String transactionSid) {
    this.transactionSid = transactionSid;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTransactionsResponse postTransactionsResponse = (PostTransactionsResponse) o;

    return true && Objects.equals(documentData, postTransactionsResponse.documentData) &&
        Objects.equals(transactionSid, postTransactionsResponse.transactionSid)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentData, transactionSid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTransactionsResponse {\n");
    
    if (documentData != null)
      sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    if (transactionSid != null)
      sb.append("    transactionSid: ").append(toIndentedString(transactionSid)).append("\n");
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

