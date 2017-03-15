package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountSignatureProviderOption;
import com.docusign.esign.model.SignatureProviderRequiredOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AccountSignatureProvider   {
  
  private String isRequired = null;
  private String priority = null;
  private String signatureProviderDisplayName = null;
  private String signatureProviderId = null;
  private String signatureProviderName = null;
  private java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata = new java.util.ArrayList<AccountSignatureProviderOption>();
  private java.util.List<SignatureProviderRequiredOption> signatureProviderRequiredOptions = new java.util.ArrayList<SignatureProviderRequiredOption>();

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isRequired")
  public String getIsRequired() {
    return isRequired;
  }
  public void setIsRequired(String isRequired) {
    this.isRequired = isRequired;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }
  public void setPriority(String priority) {
    this.priority = priority;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderDisplayName")
  public String getSignatureProviderDisplayName() {
    return signatureProviderDisplayName;
  }
  public void setSignatureProviderDisplayName(String signatureProviderDisplayName) {
    this.signatureProviderDisplayName = signatureProviderDisplayName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderId")
  public String getSignatureProviderId() {
    return signatureProviderId;
  }
  public void setSignatureProviderId(String signatureProviderId) {
    this.signatureProviderId = signatureProviderId;
  }

  
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
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderOptionsMetadata")
  public java.util.List<AccountSignatureProviderOption> getSignatureProviderOptionsMetadata() {
    return signatureProviderOptionsMetadata;
  }
  public void setSignatureProviderOptionsMetadata(java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata) {
    this.signatureProviderOptionsMetadata = signatureProviderOptionsMetadata;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureProviderRequiredOptions")
  public java.util.List<SignatureProviderRequiredOption> getSignatureProviderRequiredOptions() {
    return signatureProviderRequiredOptions;
  }
  public void setSignatureProviderRequiredOptions(java.util.List<SignatureProviderRequiredOption> signatureProviderRequiredOptions) {
    this.signatureProviderRequiredOptions = signatureProviderRequiredOptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSignatureProvider accountSignatureProvider = (AccountSignatureProvider) o;

    return true && Objects.equals(isRequired, accountSignatureProvider.isRequired) &&
        Objects.equals(priority, accountSignatureProvider.priority) &&
        Objects.equals(signatureProviderDisplayName, accountSignatureProvider.signatureProviderDisplayName) &&
        Objects.equals(signatureProviderId, accountSignatureProvider.signatureProviderId) &&
        Objects.equals(signatureProviderName, accountSignatureProvider.signatureProviderName) &&
        Objects.equals(signatureProviderOptionsMetadata, accountSignatureProvider.signatureProviderOptionsMetadata) &&
        Objects.equals(signatureProviderRequiredOptions, accountSignatureProvider.signatureProviderRequiredOptions)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRequired, priority, signatureProviderDisplayName, signatureProviderId, signatureProviderName, signatureProviderOptionsMetadata, signatureProviderRequiredOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProvider {\n");
    
    if (isRequired != null)
      sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    if (priority != null)
      sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    if (signatureProviderDisplayName != null)
      sb.append("    signatureProviderDisplayName: ").append(toIndentedString(signatureProviderDisplayName)).append("\n");
    if (signatureProviderId != null)
      sb.append("    signatureProviderId: ").append(toIndentedString(signatureProviderId)).append("\n");
    if (signatureProviderName != null)
      sb.append("    signatureProviderName: ").append(toIndentedString(signatureProviderName)).append("\n");
    if (signatureProviderOptionsMetadata != null)
      sb.append("    signatureProviderOptionsMetadata: ").append(toIndentedString(signatureProviderOptionsMetadata)).append("\n");
    if (signatureProviderRequiredOptions != null)
      sb.append("    signatureProviderRequiredOptions: ").append(toIndentedString(signatureProviderRequiredOptions)).append("\n");
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

