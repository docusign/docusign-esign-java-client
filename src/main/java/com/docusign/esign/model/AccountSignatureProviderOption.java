package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSignatureProviderOption
 */

public class AccountSignatureProviderOption {
  @JsonProperty("signatureProviderOptionDisplayName")
  private String signatureProviderOptionDisplayName = null;

  @JsonProperty("signatureProviderOptionId")
  private String signatureProviderOptionId = null;

  @JsonProperty("signatureProviderOptionName")
  private String signatureProviderOptionName = null;

  public AccountSignatureProviderOption signatureProviderOptionDisplayName(String signatureProviderOptionDisplayName) {
    this.signatureProviderOptionDisplayName = signatureProviderOptionDisplayName;
    return this;
  }

   /**
   * 
   * @return signatureProviderOptionDisplayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureProviderOptionDisplayName() {
    return signatureProviderOptionDisplayName;
  }

  public void setSignatureProviderOptionDisplayName(String signatureProviderOptionDisplayName) {
    this.signatureProviderOptionDisplayName = signatureProviderOptionDisplayName;
  }

  public AccountSignatureProviderOption signatureProviderOptionId(String signatureProviderOptionId) {
    this.signatureProviderOptionId = signatureProviderOptionId;
    return this;
  }

   /**
   * 
   * @return signatureProviderOptionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureProviderOptionId() {
    return signatureProviderOptionId;
  }

  public void setSignatureProviderOptionId(String signatureProviderOptionId) {
    this.signatureProviderOptionId = signatureProviderOptionId;
  }

  public AccountSignatureProviderOption signatureProviderOptionName(String signatureProviderOptionName) {
    this.signatureProviderOptionName = signatureProviderOptionName;
    return this;
  }

   /**
   * 
   * @return signatureProviderOptionName
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.signatureProviderOptionDisplayName, accountSignatureProviderOption.signatureProviderOptionDisplayName) &&
        Objects.equals(this.signatureProviderOptionId, accountSignatureProviderOption.signatureProviderOptionId) &&
        Objects.equals(this.signatureProviderOptionName, accountSignatureProviderOption.signatureProviderOptionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureProviderOptionDisplayName, signatureProviderOptionId, signatureProviderOptionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProviderOption {\n");
    
    sb.append("    signatureProviderOptionDisplayName: ").append(toIndentedString(signatureProviderOptionDisplayName)).append("\n");
    sb.append("    signatureProviderOptionId: ").append(toIndentedString(signatureProviderOptionId)).append("\n");
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

