package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignSessionInfoRequest
 */

public class SignSessionInfoRequest {
  @JsonProperty("certificate")
  private String certificate = null;

  @JsonProperty("returnFormat")
  private String returnFormat = null;

  public SignSessionInfoRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * 
   * @return certificate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public SignSessionInfoRequest returnFormat(String returnFormat) {
    this.returnFormat = returnFormat;
    return this;
  }

   /**
   * 
   * @return returnFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnFormat() {
    return returnFormat;
  }

  public void setReturnFormat(String returnFormat) {
    this.returnFormat = returnFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignSessionInfoRequest signSessionInfoRequest = (SignSessionInfoRequest) o;
    return Objects.equals(this.certificate, signSessionInfoRequest.certificate) &&
        Objects.equals(this.returnFormat, signSessionInfoRequest.returnFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, returnFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignSessionInfoRequest {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    returnFormat: ").append(toIndentedString(returnFormat)).append("\n");
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

