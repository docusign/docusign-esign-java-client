package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignSessionInfoRequest
 */

public class SignSessionInfoRequest {
  @JsonProperty("certificate")
  private String certificate = null;

  @JsonProperty("maxSignatureLength")
  private String maxSignatureLength = null;

  @JsonProperty("returnFormat")
  private String returnFormat = null;

  @JsonProperty("signingLocation")
  private String signingLocation = null;

  public SignSessionInfoRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * 
   * @return certificate
  **/
  @ApiModelProperty(value = "")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public SignSessionInfoRequest maxSignatureLength(String maxSignatureLength) {
    this.maxSignatureLength = maxSignatureLength;
    return this;
  }

   /**
   * 
   * @return maxSignatureLength
  **/
  @ApiModelProperty(value = "")
  public String getMaxSignatureLength() {
    return maxSignatureLength;
  }

  public void setMaxSignatureLength(String maxSignatureLength) {
    this.maxSignatureLength = maxSignatureLength;
  }

  public SignSessionInfoRequest returnFormat(String returnFormat) {
    this.returnFormat = returnFormat;
    return this;
  }

   /**
   * 
   * @return returnFormat
  **/
  @ApiModelProperty(value = "")
  public String getReturnFormat() {
    return returnFormat;
  }

  public void setReturnFormat(String returnFormat) {
    this.returnFormat = returnFormat;
  }

  public SignSessionInfoRequest signingLocation(String signingLocation) {
    this.signingLocation = signingLocation;
    return this;
  }

   /**
   * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.
   * @return signingLocation
  **/
  @ApiModelProperty(value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
  public String getSigningLocation() {
    return signingLocation;
  }

  public void setSigningLocation(String signingLocation) {
    this.signingLocation = signingLocation;
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
        Objects.equals(this.maxSignatureLength, signSessionInfoRequest.maxSignatureLength) &&
        Objects.equals(this.returnFormat, signSessionInfoRequest.returnFormat) &&
        Objects.equals(this.signingLocation, signSessionInfoRequest.signingLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, maxSignatureLength, returnFormat, signingLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignSessionInfoRequest {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    maxSignatureLength: ").append(toIndentedString(maxSignatureLength)).append("\n");
    sb.append("    returnFormat: ").append(toIndentedString(returnFormat)).append("\n");
    sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
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

