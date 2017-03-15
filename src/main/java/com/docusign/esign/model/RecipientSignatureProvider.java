package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.RecipientSignatureProviderOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class RecipientSignatureProvider   {
  
  private String signatureProviderName = null;
  private RecipientSignatureProviderOptions signatureProviderOptions = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderName")
  public String getSignatureProviderName() {
    return signatureProviderName;
  }
  public void setSignatureProviderName(String signatureProviderName) {
    this.signatureProviderName = signatureProviderName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderOptions")
  public RecipientSignatureProviderOptions getSignatureProviderOptions() {
    return signatureProviderOptions;
  }
  public void setSignatureProviderOptions(RecipientSignatureProviderOptions signatureProviderOptions) {
    this.signatureProviderOptions = signatureProviderOptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSignatureProvider recipientSignatureProvider = (RecipientSignatureProvider) o;

    return true && Objects.equals(signatureProviderName, recipientSignatureProvider.signatureProviderName) &&
        Objects.equals(signatureProviderOptions, recipientSignatureProvider.signatureProviderOptions)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureProviderName, signatureProviderOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureProvider {\n");
    
    if (signatureProviderName != null)
      sb.append("    signatureProviderName: ").append(toIndentedString(signatureProviderName)).append("\n");
    if (signatureProviderOptions != null)
      sb.append("    signatureProviderOptions: ").append(toIndentedString(signatureProviderOptions)).append("\n");
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

