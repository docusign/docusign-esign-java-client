package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountSignatureProviderOption   {
  
  private String signatureProviderOptionDisplayName = null;
  private String signatureProviderOptionId = null;
  private String signatureProviderOptionName = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderOptionDisplayName")
  public String getSignatureProviderOptionDisplayName() {
    return signatureProviderOptionDisplayName;
  }
  public void setSignatureProviderOptionDisplayName(String signatureProviderOptionDisplayName) {
    this.signatureProviderOptionDisplayName = signatureProviderOptionDisplayName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderOptionId")
  public String getSignatureProviderOptionId() {
    return signatureProviderOptionId;
  }
  public void setSignatureProviderOptionId(String signatureProviderOptionId) {
    this.signatureProviderOptionId = signatureProviderOptionId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderOptionName")
  public String getSignatureProviderOptionName() {
    return signatureProviderOptionName;
  }
  public void setSignatureProviderOptionName(String signatureProviderOptionName) {
    this.signatureProviderOptionName = signatureProviderOptionName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSignatureProviderOption accountSignatureProviderOption = (AccountSignatureProviderOption) o;

    return true && Objects.equals(signatureProviderOptionDisplayName, accountSignatureProviderOption.signatureProviderOptionDisplayName) &&
        Objects.equals(signatureProviderOptionId, accountSignatureProviderOption.signatureProviderOptionId) &&
        Objects.equals(signatureProviderOptionName, accountSignatureProviderOption.signatureProviderOptionName)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureProviderOptionDisplayName, signatureProviderOptionId, signatureProviderOptionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProviderOption {\n");
    
    if (signatureProviderOptionDisplayName != null)
      sb.append("    signatureProviderOptionDisplayName: ").append(toIndentedString(signatureProviderOptionDisplayName)).append("\n");
    if (signatureProviderOptionId != null)
      sb.append("    signatureProviderOptionId: ").append(toIndentedString(signatureProviderOptionId)).append("\n");
    if (signatureProviderOptionName != null)
      sb.append("    signatureProviderOptionName: ").append(toIndentedString(signatureProviderOptionName)).append("\n");
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

