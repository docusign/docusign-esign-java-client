package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingPlanPreview;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class NewAccountSummary   {
  
  private String accountId = null;
  private String accountIdGuid = null;
  private String accountName = null;
  private String apiPassword = null;
  private String baseUrl = null;
  private BillingPlanPreview billingPlanPreview = null;
  private String userId = null;

  
  /**
   * The account ID associated with the envelope.
   **/
  
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   * The GUID associated with the account ID.
   **/
  
  @ApiModelProperty(value = "The GUID associated with the account ID.")
  @JsonProperty("accountIdGuid")
  public String getAccountIdGuid() {
    return accountIdGuid;
  }
  public void setAccountIdGuid(String accountIdGuid) {
    this.accountIdGuid = accountIdGuid;
  }

  
  /**
   * The account name for the new account.
   **/
  
  @ApiModelProperty(value = "The account name for the new account.")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  
  /**
   * Contains a token that can be used for authentication in API calls instead of using the user name and password.
   **/
  
  @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
  @JsonProperty("apiPassword")
  public String getApiPassword() {
    return apiPassword;
  }
  public void setApiPassword(String apiPassword) {
    this.apiPassword = apiPassword;
  }

  
  /**
   * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
   **/
  
  @ApiModelProperty(value = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
  @JsonProperty("baseUrl")
  public String getBaseUrl() {
    return baseUrl;
  }
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billingPlanPreview")
  public BillingPlanPreview getBillingPlanPreview() {
    return billingPlanPreview;
  }
  public void setBillingPlanPreview(BillingPlanPreview billingPlanPreview) {
    this.billingPlanPreview = billingPlanPreview;
  }

  
  /**
   * Specifies the user ID of the new user.
   **/
  
  @ApiModelProperty(value = "Specifies the user ID of the new user.")
  @JsonProperty("userId")
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

    return true && Objects.equals(accountId, newAccountSummary.accountId) &&
        Objects.equals(accountIdGuid, newAccountSummary.accountIdGuid) &&
        Objects.equals(accountName, newAccountSummary.accountName) &&
        Objects.equals(apiPassword, newAccountSummary.apiPassword) &&
        Objects.equals(baseUrl, newAccountSummary.baseUrl) &&
        Objects.equals(billingPlanPreview, newAccountSummary.billingPlanPreview) &&
        Objects.equals(userId, newAccountSummary.userId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIdGuid, accountName, apiPassword, baseUrl, billingPlanPreview, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountSummary {\n");
    
    if (accountId != null)
      sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    if (accountIdGuid != null)
      sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
    if (accountName != null)
      sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    if (apiPassword != null)
      sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
    if (baseUrl != null)
      sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    if (billingPlanPreview != null)
      sb.append("    billingPlanPreview: ").append(toIndentedString(billingPlanPreview)).append("\n");
    if (userId != null)
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

