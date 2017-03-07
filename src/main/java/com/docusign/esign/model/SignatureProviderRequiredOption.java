package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class SignatureProviderRequiredOption   {
  
  private java.util.List<String> requiredSignatureProviderOptionIds = new java.util.ArrayList<String>();
  private String signerType = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requiredSignatureProviderOptionIds")
  public java.util.List<String> getRequiredSignatureProviderOptionIds() {
    return requiredSignatureProviderOptionIds;
  }
  public void setRequiredSignatureProviderOptionIds(java.util.List<String> requiredSignatureProviderOptionIds) {
    this.requiredSignatureProviderOptionIds = requiredSignatureProviderOptionIds;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signerType")
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

    return true && Objects.equals(requiredSignatureProviderOptionIds, signatureProviderRequiredOption.requiredSignatureProviderOptionIds) &&
        Objects.equals(signerType, signatureProviderRequiredOption.signerType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredSignatureProviderOptionIds, signerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureProviderRequiredOption {\n");
    
    if (requiredSignatureProviderOptionIds != null)
      sb.append("    requiredSignatureProviderOptionIds: ").append(toIndentedString(requiredSignatureProviderOptionIds)).append("\n");
    if (signerType != null)
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

