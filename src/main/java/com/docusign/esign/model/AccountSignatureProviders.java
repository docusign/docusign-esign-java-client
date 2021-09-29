package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountSignatureProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSignatureProviders.
 *
 */

public class AccountSignatureProviders {
  @JsonProperty("signatureProviders")
  private java.util.List<AccountSignatureProvider> signatureProviders = null;


  /**
   * signatureProviders.
   *
   * @return AccountSignatureProviders
   **/
  public AccountSignatureProviders signatureProviders(java.util.List<AccountSignatureProvider> signatureProviders) {
    this.signatureProviders = signatureProviders;
    return this;
  }
  
  /**
   * addSignatureProvidersItem.
   *
   * @return AccountSignatureProviders
   **/
  public AccountSignatureProviders addSignatureProvidersItem(AccountSignatureProvider signatureProvidersItem) {
    if (this.signatureProviders == null) {
      this.signatureProviders = new java.util.ArrayList<AccountSignatureProvider>();
    }
    this.signatureProviders.add(signatureProvidersItem);
    return this;
  }

  /**
   * .
   * @return signatureProviders
   **/
  @ApiModelProperty(value = "")
  public java.util.List<AccountSignatureProvider> getSignatureProviders() {
    return signatureProviders;
  }

  /**
   * setSignatureProviders.
   **/
  public void setSignatureProviders(java.util.List<AccountSignatureProvider> signatureProviders) {
    this.signatureProviders = signatureProviders;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSignatureProviders accountSignatureProviders = (AccountSignatureProviders) o;
    return Objects.equals(this.signatureProviders, accountSignatureProviders.signatureProviders);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(signatureProviders);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProviders {\n");
    
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

