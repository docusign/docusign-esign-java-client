package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Signer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class BulkRecipientsUpdateResponse   {
  
  private Signer signer = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signer")
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

    return true && Objects.equals(signer, bulkRecipientsUpdateResponse.signer)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(signer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRecipientsUpdateResponse {\n");
    
    if (signer != null)
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

