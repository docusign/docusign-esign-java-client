package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.AccountIdentityVerificationWorkflow;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountIdentityVerificationResponse
 */

public class AccountIdentityVerificationResponse {
  @JsonProperty("identityVerification")
  private java.util.List<AccountIdentityVerificationWorkflow> identityVerification = null;

  public AccountIdentityVerificationResponse identityVerification(java.util.List<AccountIdentityVerificationWorkflow> identityVerification) {
    this.identityVerification = identityVerification;
    return this;
  }

  public AccountIdentityVerificationResponse addIdentityVerificationItem(AccountIdentityVerificationWorkflow identityVerificationItem) {
    if (this.identityVerification == null) {
      this.identityVerification = new java.util.ArrayList<AccountIdentityVerificationWorkflow>();
    }
    this.identityVerification.add(identityVerificationItem);
    return this;
  }

   /**
   * 
   * @return identityVerification
  **/
  @ApiModelProperty(value = "")
  public java.util.List<AccountIdentityVerificationWorkflow> getIdentityVerification() {
    return identityVerification;
  }

  public void setIdentityVerification(java.util.List<AccountIdentityVerificationWorkflow> identityVerification) {
    this.identityVerification = identityVerification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentityVerificationResponse accountIdentityVerificationResponse = (AccountIdentityVerificationResponse) o;
    return Objects.equals(this.identityVerification, accountIdentityVerificationResponse.identityVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityVerification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityVerificationResponse {\n");
    
    sb.append("    identityVerification: ").append(toIndentedString(identityVerification)).append("\n");
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

