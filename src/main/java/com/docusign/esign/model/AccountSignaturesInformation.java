package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountSignature;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSignaturesInformation
 */

public class AccountSignaturesInformation {
  @JsonProperty("accountSignatures")
  private java.util.List<AccountSignature> accountSignatures = null;

  public AccountSignaturesInformation accountSignatures(java.util.List<AccountSignature> accountSignatures) {
    this.accountSignatures = accountSignatures;
    return this;
  }

  public AccountSignaturesInformation addAccountSignaturesItem(AccountSignature accountSignaturesItem) {
    if (this.accountSignatures == null) {
      this.accountSignatures = new java.util.ArrayList<AccountSignature>();
    }
    this.accountSignatures.add(accountSignaturesItem);
    return this;
  }

   /**
   * 
   * @return accountSignatures
  **/
  @ApiModelProperty(value = "")
  public java.util.List<AccountSignature> getAccountSignatures() {
    return accountSignatures;
  }

  public void setAccountSignatures(java.util.List<AccountSignature> accountSignatures) {
    this.accountSignatures = accountSignatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSignaturesInformation accountSignaturesInformation = (AccountSignaturesInformation) o;
    return Objects.equals(this.accountSignatures, accountSignaturesInformation.accountSignatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSignatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignaturesInformation {\n");
    
    sb.append("    accountSignatures: ").append(toIndentedString(accountSignatures)).append("\n");
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

