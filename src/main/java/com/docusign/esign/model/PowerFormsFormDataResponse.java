package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.PowerFormFormDataEnvelope;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PowerFormsFormDataResponse
 */

public class PowerFormsFormDataResponse {
  @JsonProperty("envelopes")
  private java.util.List<PowerFormFormDataEnvelope> envelopes = new java.util.ArrayList<PowerFormFormDataEnvelope>();

  public PowerFormsFormDataResponse envelopes(java.util.List<PowerFormFormDataEnvelope> envelopes) {
    this.envelopes = envelopes;
    return this;
  }

  public PowerFormsFormDataResponse addEnvelopesItem(PowerFormFormDataEnvelope envelopesItem) {
    this.envelopes.add(envelopesItem);
    return this;
  }

   /**
   * 
   * @return envelopes
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.envelopes, powerFormsFormDataResponse.envelopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerFormsFormDataResponse {\n");
    
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

