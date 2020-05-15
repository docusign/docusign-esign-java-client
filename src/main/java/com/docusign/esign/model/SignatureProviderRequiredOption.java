package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignatureProviderRequiredOption
 */

public class SignatureProviderRequiredOption {
  @JsonProperty("requiredSignatureProviderOptionIds")
  private java.util.List<String> requiredSignatureProviderOptionIds = null;

  @JsonProperty("signerType")
  private String signerType = null;

  public SignatureProviderRequiredOption requiredSignatureProviderOptionIds(java.util.List<String> requiredSignatureProviderOptionIds) {
    this.requiredSignatureProviderOptionIds = requiredSignatureProviderOptionIds;
    return this;
  }

  public SignatureProviderRequiredOption addRequiredSignatureProviderOptionIdsItem(String requiredSignatureProviderOptionIdsItem) {
    if (this.requiredSignatureProviderOptionIds == null) {
      this.requiredSignatureProviderOptionIds = new java.util.ArrayList<String>();
    }
    this.requiredSignatureProviderOptionIds.add(requiredSignatureProviderOptionIdsItem);
    return this;
  }

   /**
   * 
   * @return requiredSignatureProviderOptionIds
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getRequiredSignatureProviderOptionIds() {
    return requiredSignatureProviderOptionIds;
  }

  public void setRequiredSignatureProviderOptionIds(java.util.List<String> requiredSignatureProviderOptionIds) {
    this.requiredSignatureProviderOptionIds = requiredSignatureProviderOptionIds;
  }

  public SignatureProviderRequiredOption signerType(String signerType) {
    this.signerType = signerType;
    return this;
  }

   /**
   * 
   * @return signerType
  **/
  @ApiModelProperty(value = "")
  public String getSignerType() {
    return signerType;
  }

  public void setSignerType(String signerType) {
    this.signerType = signerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureProviderRequiredOption signatureProviderRequiredOption = (SignatureProviderRequiredOption) o;
    return Objects.equals(this.requiredSignatureProviderOptionIds, signatureProviderRequiredOption.requiredSignatureProviderOptionIds) &&
        Objects.equals(this.signerType, signatureProviderRequiredOption.signerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredSignatureProviderOptionIds, signerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureProviderRequiredOption {\n");
    
    sb.append("    requiredSignatureProviderOptionIds: ").append(toIndentedString(requiredSignatureProviderOptionIds)).append("\n");
    sb.append("    signerType: ").append(toIndentedString(signerType)).append("\n");
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

