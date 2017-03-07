package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PowerFormFormDataEnvelope;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class PowerFormsFormDataResponse   {
  
  private java.util.List<PowerFormFormDataEnvelope> envelopes = new java.util.ArrayList<PowerFormFormDataEnvelope>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("envelopes")
  public java.util.List<PowerFormFormDataEnvelope> getEnvelopes() {
    return envelopes;
  }
  public void setEnvelopes(java.util.List<PowerFormFormDataEnvelope> envelopes) {
    this.envelopes = envelopes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerFormsFormDataResponse powerFormsFormDataResponse = (PowerFormsFormDataResponse) o;

    return true && Objects.equals(envelopes, powerFormsFormDataResponse.envelopes)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormsFormDataResponse {\n");
    
    if (envelopes != null)
      sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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

