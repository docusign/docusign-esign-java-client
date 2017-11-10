package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountSignatureProviderOption;
import com.docusign.esign.model.SignatureProviderRequiredOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSignatureProvider
 */

public class AccountSignatureProvider {
  @JsonProperty("isRequired")
  private String isRequired = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("signatureProviderDisplayName")
  private String signatureProviderDisplayName = null;

  @JsonProperty("signatureProviderId")
  private String signatureProviderId = null;

  @JsonProperty("signatureProviderName")
  private String signatureProviderName = null;

  @JsonProperty("signatureProviderOptionsMetadata")
  private java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata = new java.util.ArrayList<AccountSignatureProviderOption>();

  @JsonProperty("signatureProviderRequiredOptions")
  private java.util.List<SignatureProviderRequiredOption> signatureProviderRequiredOptions = new java.util.ArrayList<SignatureProviderRequiredOption>();

  public AccountSignatureProvider isRequired(String isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * 
   * @return isRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(String isRequired) {
    this.isRequired = isRequired;
  }

  public AccountSignatureProvider priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * 
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public AccountSignatureProvider signatureProviderDisplayName(String signatureProviderDisplayName) {
    this.signatureProviderDisplayName = signatureProviderDisplayName;
    return this;
  }

   /**
   * 
   * @return signatureProviderDisplayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureProviderDisplayName() {
    return signatureProviderDisplayName;
  }

  public void setSignatureProviderDisplayName(String signatureProviderDisplayName) {
    this.signatureProviderDisplayName = signatureProviderDisplayName;
  }

  public AccountSignatureProvider signatureProviderId(String signatureProviderId) {
    this.signatureProviderId = signatureProviderId;
    return this;
  }

   /**
   * 
   * @return signatureProviderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureProviderId() {
    return signatureProviderId;
  }

  public void setSignatureProviderId(String signatureProviderId) {
    this.signatureProviderId = signatureProviderId;
  }

  public AccountSignatureProvider signatureProviderName(String signatureProviderName) {
    this.signatureProviderName = signatureProviderName;
    return this;
  }

   /**
   * 
   * @return signatureProviderName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureProviderName() {
    return signatureProviderName;
  }

  public void setSignatureProviderName(String signatureProviderName) {
    this.signatureProviderName = signatureProviderName;
  }

  public AccountSignatureProvider signatureProviderOptionsMetadata(java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata) {
    this.signatureProviderOptionsMetadata = signatureProviderOptionsMetadata;
    return this;
  }

  public AccountSignatureProvider addSignatureProviderOptionsMetadataItem(AccountSignatureProviderOption signatureProviderOptionsMetadataItem) {
    this.signatureProviderOptionsMetadata.add(signatureProviderOptionsMetadataItem);
    return this;
  }

   /**
   * 
   * @return signatureProviderOptionsMetadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<AccountSignatureProviderOption> getSignatureProviderOptionsMetadata() {
    return signatureProviderOptionsMetadata;
  }

  public void setSignatureProviderOptionsMetadata(java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata) {
    this.signatureProviderOptionsMetadata = signatureProviderOptionsMetadata;
  }

  public AccountSignatureProvider signatureProviderRequiredOptions(java.util.List<SignatureProviderRequiredOption> signatureProviderRequiredOptions) {
    this.signatureProviderRequiredOptions = signatureProviderRequiredOptions;
    return this;
  }

  public AccountSignatureProvider addSignatureProviderRequiredOptionsItem(SignatureProviderRequiredOption signatureProviderRequiredOptionsItem) {
    this.signatureProviderRequiredOptions.add(signatureProviderRequiredOptionsItem);
    return this;
  }

   /**
   * 
   * @return signatureProviderRequiredOptions
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.isRequired, accountSignatureProvider.isRequired) &&
        Objects.equals(this.priority, accountSignatureProvider.priority) &&
        Objects.equals(this.signatureProviderDisplayName, accountSignatureProvider.signatureProviderDisplayName) &&
        Objects.equals(this.signatureProviderId, accountSignatureProvider.signatureProviderId) &&
        Objects.equals(this.signatureProviderName, accountSignatureProvider.signatureProviderName) &&
        Objects.equals(this.signatureProviderOptionsMetadata, accountSignatureProvider.signatureProviderOptionsMetadata) &&
        Objects.equals(this.signatureProviderRequiredOptions, accountSignatureProvider.signatureProviderRequiredOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRequired, priority, signatureProviderDisplayName, signatureProviderId, signatureProviderName, signatureProviderOptionsMetadata, signatureProviderRequiredOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProvider {\n");
    
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    signatureProviderDisplayName: ").append(toIndentedString(signatureProviderDisplayName)).append("\n");
    sb.append("    signatureProviderId: ").append(toIndentedString(signatureProviderId)).append("\n");
    sb.append("    signatureProviderName: ").append(toIndentedString(signatureProviderName)).append("\n");
    sb.append("    signatureProviderOptionsMetadata: ").append(toIndentedString(signatureProviderOptionsMetadata)).append("\n");
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

