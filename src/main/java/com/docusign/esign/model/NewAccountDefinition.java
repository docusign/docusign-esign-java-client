package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.PlanInformation;
import com.docusign.esign.model.ReferralInformation;
import com.docusign.esign.model.SocialAccountInformation;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class NewAccountDefinition   {
  
  private String accountName = null;
  private java.util.List<NameValue> accountSettings = new java.util.ArrayList<NameValue>();
  private AccountAddress addressInformation = null;
  private CreditCardInformation creditCardInformation = null;
  private String distributorCode = null;
  private String distributorPassword = null;
  private UserInformation initialUser = null;
  private PlanInformation planInformation = null;
  private ReferralInformation referralInformation = null;
  private SocialAccountInformation socialAccountInformation = null;

  
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
   * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.
   **/
  
  @ApiModelProperty(value = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
  @JsonProperty("accountSettings")
  public java.util.List<NameValue> getAccountSettings() {
    return accountSettings;
  }
  public void setAccountSettings(java.util.List<NameValue> accountSettings) {
    this.accountSettings = accountSettings;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addressInformation")
  public AccountAddress getAddressInformation() {
    return addressInformation;
  }
  public void setAddressInformation(AccountAddress addressInformation) {
    this.addressInformation = addressInformation;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creditCardInformation")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }
  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  
  /**
   * The code that identifies the billing plan groups and plans for the new account.
   **/
  
  @ApiModelProperty(value = "The code that identifies the billing plan groups and plans for the new account.")
  @JsonProperty("distributorCode")
  public String getDistributorCode() {
    return distributorCode;
  }
  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  
  /**
   * The password for the distributorCode.
   **/
  
  @ApiModelProperty(value = "The password for the distributorCode.")
  @JsonProperty("distributorPassword")
  public String getDistributorPassword() {
    return distributorPassword;
  }
  public void setDistributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("initialUser")
  public UserInformation getInitialUser() {
    return initialUser;
  }
  public void setInitialUser(UserInformation initialUser) {
    this.initialUser = initialUser;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("planInformation")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }
  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referralInformation")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }
  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("socialAccountInformation")
  public SocialAccountInformation getSocialAccountInformation() {
    return socialAccountInformation;
  }
  public void setSocialAccountInformation(SocialAccountInformation socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAccountDefinition newAccountDefinition = (NewAccountDefinition) o;

    return true && Objects.equals(accountName, newAccountDefinition.accountName) &&
        Objects.equals(accountSettings, newAccountDefinition.accountSettings) &&
        Objects.equals(addressInformation, newAccountDefinition.addressInformation) &&
        Objects.equals(creditCardInformation, newAccountDefinition.creditCardInformation) &&
        Objects.equals(distributorCode, newAccountDefinition.distributorCode) &&
        Objects.equals(distributorPassword, newAccountDefinition.distributorPassword) &&
        Objects.equals(initialUser, newAccountDefinition.initialUser) &&
        Objects.equals(planInformation, newAccountDefinition.planInformation) &&
        Objects.equals(referralInformation, newAccountDefinition.referralInformation) &&
        Objects.equals(socialAccountInformation, newAccountDefinition.socialAccountInformation)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountSettings, addressInformation, creditCardInformation, distributorCode, distributorPassword, initialUser, planInformation, referralInformation, socialAccountInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountDefinition {\n");
    
    if (accountName != null)
      sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    if (accountSettings != null)
      sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
    if (addressInformation != null)
      sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    if (creditCardInformation != null)
      sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    if (distributorCode != null)
      sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    if (distributorPassword != null)
      sb.append("    distributorPassword: ").append(toIndentedString(distributorPassword)).append("\n");
    if (initialUser != null)
      sb.append("    initialUser: ").append(toIndentedString(initialUser)).append("\n");
    if (planInformation != null)
      sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    if (referralInformation != null)
      sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
    if (socialAccountInformation != null)
      sb.append("    socialAccountInformation: ").append(toIndentedString(socialAccountInformation)).append("\n");
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

