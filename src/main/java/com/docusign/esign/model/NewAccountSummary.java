package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingPlanPreview;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewAccountSummary
 */

public class NewAccountSummary {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountIdGuid")
  private String accountIdGuid = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("apiPassword")
  private String apiPassword = null;

  @JsonProperty("baseUrl")
  private String baseUrl = null;

  @JsonProperty("billingPlanPreview")
  private BillingPlanPreview billingPlanPreview = null;

  @JsonProperty("userId")
  private String userId = null;

  public NewAccountSummary accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID associated with the envelope.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public NewAccountSummary accountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
    return this;
  }

   /**
   * The GUID associated with the account ID.
   * @return accountIdGuid
  **/
  @ApiModelProperty(value = "The GUID associated with the account ID.")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }

  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  public NewAccountSummary accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * The account name for the new account.
   * @return accountName
  **/
  @ApiModelProperty(value = "The account name for the new account.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public NewAccountSummary apiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
    return this;
  }

   /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password.
   * @return apiPassword
  **/
  @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
  public String getApiPassword() {
    return apiPassword;
  }

  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  public NewAccountSummary baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
   * @return baseUrl
  **/
  @ApiModelProperty(value = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public NewAccountSummary billingPlanPreview(BillingPlanPreview billingPlanPreview) {
    this.billingPlanPreview = billingPlanPreview;
    return this;
  }

   /**
   * Get billingPlanPreview
   * @return billingPlanPreview
  **/
  @ApiModelProperty(value = "")
  public BillingPlanPreview getBillingPlanPreview() {
    return billingPlanPreview;
  }

  public void setBillingPlanPreview(BillingPlanPreview billingPlanPreview) {
    this.billingPlanPreview = billingPlanPreview;
  }

  public NewAccountSummary userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the user ID of the new user.
   * @return userId
  **/
  @ApiModelProperty(value = "Specifies the user ID of the new user.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAccountSummary newAccountSummary = (NewAccountSummary) o;
    return Objects.equals(this.accountId, newAccountSummary.accountId) &&
        Objects.equals(this.accountIdGuid, newAccountSummary.accountIdGuid) &&
        Objects.equals(this.accountName, newAccountSummary.accountName) &&
        Objects.equals(this.apiPassword, newAccountSummary.apiPassword) &&
        Objects.equals(this.baseUrl, newAccountSummary.baseUrl) &&
        Objects.equals(this.billingPlanPreview, newAccountSummary.billingPlanPreview) &&
        Objects.equals(this.userId, newAccountSummary.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIdGuid, accountName, apiPassword, baseUrl, billingPlanPreview, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountSummary {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    billingPlanPreview: ").append(toIndentedString(billingPlanPreview)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

