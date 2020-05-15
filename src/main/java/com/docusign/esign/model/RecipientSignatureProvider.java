package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.RecipientSignatureProviderOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientSignatureProvider
 */

public class RecipientSignatureProvider {
  @JsonProperty("sealDocumentsWithTabsOnly")
  private String sealDocumentsWithTabsOnly = null;

  @JsonProperty("sealName")
  private String sealName = null;

  @JsonProperty("signatureProviderName")
  private String signatureProviderName = null;

  @JsonProperty("signatureProviderOptions")
  private RecipientSignatureProviderOptions signatureProviderOptions = null;

  public RecipientSignatureProvider sealDocumentsWithTabsOnly(String sealDocumentsWithTabsOnly) {
    this.sealDocumentsWithTabsOnly = sealDocumentsWithTabsOnly;
    return this;
  }

   /**
   * 
   * @return sealDocumentsWithTabsOnly
  **/
  @ApiModelProperty(value = "")
  public String getSealDocumentsWithTabsOnly() {
    return sealDocumentsWithTabsOnly;
  }

  public void setSealDocumentsWithTabsOnly(String sealDocumentsWithTabsOnly) {
    this.sealDocumentsWithTabsOnly = sealDocumentsWithTabsOnly;
  }

  public RecipientSignatureProvider sealName(String sealName) {
    this.sealName = sealName;
    return this;
  }

   /**
   * 
   * @return sealName
  **/
  @ApiModelProperty(value = "")
  public String getSealName() {
    return sealName;
  }

  public void setSealName(String sealName) {
    this.sealName = sealName;
  }

  public RecipientSignatureProvider signatureProviderName(String signatureProviderName) {
    this.signatureProviderName = signatureProviderName;
    return this;
  }

   /**
   * 
   * @return signatureProviderName
  **/
  @ApiModelProperty(value = "")
  public String getSignatureProviderName() {
    return signatureProviderName;
  }

  public void setSignatureProviderName(String signatureProviderName) {
    this.signatureProviderName = signatureProviderName;
  }

  public RecipientSignatureProvider signatureProviderOptions(RecipientSignatureProviderOptions signatureProviderOptions) {
    this.signatureProviderOptions = signatureProviderOptions;
    return this;
  }

   /**
   * Get signatureProviderOptions
   * @return signatureProviderOptions
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.sealDocumentsWithTabsOnly, recipientSignatureProvider.sealDocumentsWithTabsOnly) &&
        Objects.equals(this.sealName, recipientSignatureProvider.sealName) &&
        Objects.equals(this.signatureProviderName, recipientSignatureProvider.signatureProviderName) &&
        Objects.equals(this.signatureProviderOptions, recipientSignatureProvider.signatureProviderOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sealDocumentsWithTabsOnly, sealName, signatureProviderName, signatureProviderOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSignatureProvider {\n");
    
    sb.append("    sealDocumentsWithTabsOnly: ").append(toIndentedString(sealDocumentsWithTabsOnly)).append("\n");
    sb.append("    sealName: ").append(toIndentedString(sealName)).append("\n");
    sb.append("    signatureProviderName: ").append(toIndentedString(signatureProviderName)).append("\n");
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

