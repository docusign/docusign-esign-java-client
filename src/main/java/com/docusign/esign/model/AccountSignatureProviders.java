package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountSignatureProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountSignatureProviders   {
  
  private java.util.List<AccountSignatureProvider> signatureProviders = new java.util.ArrayList<AccountSignatureProvider>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviders")
  public java.util.List<AccountSignatureProvider> getSignatureProviders() {
    return signatureProviders;
  }
  public void setSignatureProviders(java.util.List<AccountSignatureProvider> signatureProviders) {
    this.signatureProviders = signatureProviders;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSignatureProviders accountSignatureProviders = (AccountSignatureProviders) o;

    return true && Objects.equals(signatureProviders, accountSignatureProviders.signatureProviders)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureProviders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProviders {\n");
    
    if (signatureProviders != null)
      sb.append("    signatureProviders: ").append(toIndentedString(signatureProviders)).append("\n");
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

