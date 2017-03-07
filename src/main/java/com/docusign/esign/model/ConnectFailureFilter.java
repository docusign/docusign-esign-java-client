package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConnectFailureFilter   {
  
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();
  private String synchronous = null;

  
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
  @JsonProperty("synchronous")
  public String getSynchronous() {
    return synchronous;
  }
  public void setSynchronous(String synchronous) {
    this.synchronous = synchronous;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectFailureFilter connectFailureFilter = (ConnectFailureFilter) o;

    return true && Objects.equals(envelopeIds, connectFailureFilter.envelopeIds) &&
        Objects.equals(synchronous, connectFailureFilter.synchronous)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, synchronous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectFailureFilter {\n");
    
    if (envelopeIds != null)
      sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    if (synchronous != null)
      sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
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

