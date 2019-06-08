package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountAddress;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.CreditCardInformation;
import com.docusign.esign.model.DirectDebitProcessorInformation;
import com.docusign.esign.model.PaymentProcessorInformation;
import com.docusign.esign.model.PlanInformation;
import com.docusign.esign.model.ReferralInformation;
import com.docusign.esign.model.SocialAccountInformation;
import com.docusign.esign.model.UserInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewAccountDefinition
 */

public class NewAccountDefinition {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountSettings")
  private AccountSettingsInformation accountSettings = null;

  @JsonProperty("addressInformation")
  private AccountAddress addressInformation = null;

  @JsonProperty("creditCardInformation")
  private CreditCardInformation creditCardInformation = null;

  @JsonProperty("directDebitProcessorInformation")
  private DirectDebitProcessorInformation directDebitProcessorInformation = null;

  @JsonProperty("distributorCode")
  private String distributorCode = null;

  @JsonProperty("distributorPassword")
  private String distributorPassword = null;

  @JsonProperty("initialUser")
  private UserInformation initialUser = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("paymentProcessorInformation")
  private PaymentProcessorInformation paymentProcessorInformation = null;

  @JsonProperty("planInformation")
  private PlanInformation planInformation = null;

  @JsonProperty("referralInformation")
  private ReferralInformation referralInformation = null;

  @JsonProperty("socialAccountInformation")
  private SocialAccountInformation socialAccountInformation = null;

  public NewAccountDefinition accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * The account name for the new account.
   * @return accountName
  **/
  @ApiModelProperty(example = "null", value = "The account name for the new account.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public NewAccountDefinition accountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
    return this;
  }

   /**
   * Get accountSettings
   * @return accountSettings
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountSettingsInformation getAccountSettings() {
    return accountSettings;
  }

  public void setAccountSettings(AccountSettingsInformation accountSettings) {
    this.accountSettings = accountSettings;
  }

  public NewAccountDefinition addressInformation(AccountAddress addressInformation) {
    this.addressInformation = addressInformation;
    return this;
  }

   /**
   * Get addressInformation
   * @return addressInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountAddress getAddressInformation() {
    return addressInformation;
  }

  public void setAddressInformation(AccountAddress addressInformation) {
    this.addressInformation = addressInformation;
  }

  public NewAccountDefinition creditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
    return this;
  }

   /**
   * Get creditCardInformation
   * @return creditCardInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public CreditCardInformation getCreditCardInformation() {
    return creditCardInformation;
  }

  public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  public NewAccountDefinition directDebitProcessorInformation(DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
    return this;
  }

   /**
   * Get directDebitProcessorInformation
   * @return directDebitProcessorInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public DirectDebitProcessorInformation getDirectDebitProcessorInformation() {
    return directDebitProcessorInformation;
  }

  public void setDirectDebitProcessorInformation(DirectDebitProcessorInformation directDebitProcessorInformation) {
    this.directDebitProcessorInformation = directDebitProcessorInformation;
  }

  public NewAccountDefinition distributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
    return this;
  }

   /**
   * The code that identifies the billing plan groups and plans for the new account.
   * @return distributorCode
  **/
  @ApiModelProperty(example = "null", value = "The code that identifies the billing plan groups and plans for the new account.")
  public String getDistributorCode() {
    return distributorCode;
  }

  public void setDistributorCode(String distributorCode) {
    this.distributorCode = distributorCode;
  }

  public NewAccountDefinition distributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
    return this;
  }

   /**
   * The password for the distributorCode.
   * @return distributorPassword
  **/
  @ApiModelProperty(example = "null", value = "The password for the distributorCode.")
  public String getDistributorPassword() {
    return distributorPassword;
  }

  public void setDistributorPassword(String distributorPassword) {
    this.distributorPassword = distributorPassword;
  }

  public NewAccountDefinition initialUser(UserInformation initialUser) {
    this.initialUser = initialUser;
    return this;
  }

   /**
   * Get initialUser
   * @return initialUser
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInformation getInitialUser() {
    return initialUser;
  }

  public void setInitialUser(UserInformation initialUser) {
    this.initialUser = initialUser;
  }

  public NewAccountDefinition paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * 
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public NewAccountDefinition paymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
    return this;
  }

   /**
   * Get paymentProcessorInformation
   * @return paymentProcessorInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public PaymentProcessorInformation getPaymentProcessorInformation() {
    return paymentProcessorInformation;
  }

  public void setPaymentProcessorInformation(PaymentProcessorInformation paymentProcessorInformation) {
    this.paymentProcessorInformation = paymentProcessorInformation;
  }

  public NewAccountDefinition planInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
    return this;
  }

   /**
   * Get planInformation
   * @return planInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public PlanInformation getPlanInformation() {
    return planInformation;
  }

  public void setPlanInformation(PlanInformation planInformation) {
    this.planInformation = planInformation;
  }

  public NewAccountDefinition referralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
    return this;
  }

   /**
   * Get referralInformation
   * @return referralInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReferralInformation getReferralInformation() {
    return referralInformation;
  }

  public void setReferralInformation(ReferralInformation referralInformation) {
    this.referralInformation = referralInformation;
  }

  public NewAccountDefinition socialAccountInformation(SocialAccountInformation socialAccountInformation) {
    this.socialAccountInformation = socialAccountInformation;
    return this;
  }

   /**
   * Get socialAccountInformation
   * @return socialAccountInformation
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.accountName, newAccountDefinition.accountName) &&
        Objects.equals(this.accountSettings, newAccountDefinition.accountSettings) &&
        Objects.equals(this.addressInformation, newAccountDefinition.addressInformation) &&
        Objects.equals(this.creditCardInformation, newAccountDefinition.creditCardInformation) &&
        Objects.equals(this.directDebitProcessorInformation, newAccountDefinition.directDebitProcessorInformation) &&
        Objects.equals(this.distributorCode, newAccountDefinition.distributorCode) &&
        Objects.equals(this.distributorPassword, newAccountDefinition.distributorPassword) &&
        Objects.equals(this.initialUser, newAccountDefinition.initialUser) &&
        Objects.equals(this.paymentMethod, newAccountDefinition.paymentMethod) &&
        Objects.equals(this.paymentProcessorInformation, newAccountDefinition.paymentProcessorInformation) &&
        Objects.equals(this.planInformation, newAccountDefinition.planInformation) &&
        Objects.equals(this.referralInformation, newAccountDefinition.referralInformation) &&
        Objects.equals(this.socialAccountInformation, newAccountDefinition.socialAccountInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountSettings, addressInformation, creditCardInformation, directDebitProcessorInformation, distributorCode, distributorPassword, initialUser, paymentMethod, paymentProcessorInformation, planInformation, referralInformation, socialAccountInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountDefinition {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
    sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
    sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    sb.append("    directDebitProcessorInformation: ").append(toIndentedString(directDebitProcessorInformation)).append("\n");
    sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
    sb.append("    distributorPassword: ").append(toIndentedString(distributorPassword)).append("\n");
    sb.append("    initialUser: ").append(toIndentedString(initialUser)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentProcessorInformation: ").append(toIndentedString(paymentProcessorInformation)).append("\n");
    sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
    sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
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

