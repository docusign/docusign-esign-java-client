package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SettingsMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConsumerDisclosure.
 *
 */

public class ConsumerDisclosure {
  @JsonProperty("accountEsignId")
  private String accountEsignId = null;

  @JsonProperty("allowCDWithdraw")
  private String allowCDWithdraw = null;

  @JsonProperty("allowCDWithdrawMetadata")
  private SettingsMetadata allowCDWithdrawMetadata = null;

  @JsonProperty("changeEmail")
  private String changeEmail = null;

  @JsonProperty("changeEmailOther")
  private String changeEmailOther = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("companyPhone")
  private String companyPhone = null;

  @JsonProperty("copyCostPerPage")
  private String copyCostPerPage = null;

  @JsonProperty("copyFeeCollectionMethod")
  private String copyFeeCollectionMethod = null;

  @JsonProperty("copyRequestEmail")
  private String copyRequestEmail = null;

  @JsonProperty("custom")
  private String custom = null;

  @JsonProperty("enableEsign")
  private String enableEsign = null;

  @JsonProperty("esignAgreement")
  private String esignAgreement = null;

  @JsonProperty("esignText")
  private String esignText = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("mustAgreeToEsign")
  private String mustAgreeToEsign = null;

  @JsonProperty("pdfId")
  private String pdfId = null;

  @JsonProperty("useBrand")
  private String useBrand = null;

  @JsonProperty("useConsumerDisclosureWithinAccount")
  private String useConsumerDisclosureWithinAccount = null;

  @JsonProperty("useConsumerDisclosureWithinAccountMetadata")
  private SettingsMetadata useConsumerDisclosureWithinAccountMetadata = null;

  @JsonProperty("withdrawAddressLine1")
  private String withdrawAddressLine1 = null;

  @JsonProperty("withdrawAddressLine2")
  private String withdrawAddressLine2 = null;

  @JsonProperty("withdrawByEmail")
  private String withdrawByEmail = null;

  @JsonProperty("withdrawByMail")
  private String withdrawByMail = null;

  @JsonProperty("withdrawByPhone")
  private String withdrawByPhone = null;

  @JsonProperty("withdrawCity")
  private String withdrawCity = null;

  @JsonProperty("withdrawConsequences")
  private String withdrawConsequences = null;

  @JsonProperty("withdrawEmail")
  private String withdrawEmail = null;

  @JsonProperty("withdrawOther")
  private String withdrawOther = null;

  @JsonProperty("withdrawPhone")
  private String withdrawPhone = null;

  @JsonProperty("withdrawPostalCode")
  private String withdrawPostalCode = null;

  @JsonProperty("withdrawState")
  private String withdrawState = null;


  /**
   * accountEsignId.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure accountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
    return this;
  }

  /**
   * A GUID identifying the account associated with the consumer disclosure.
   * @return accountEsignId
   **/
  @ApiModelProperty(value = "A GUID identifying the account associated with the consumer disclosure")
  public String getAccountEsignId() {
    return accountEsignId;
  }

  /**
   * setAccountEsignId.
   **/
  public void setAccountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
  }


  /**
   * allowCDWithdraw.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure allowCDWithdraw(String allowCDWithdraw) {
    this.allowCDWithdraw = allowCDWithdraw;
    return this;
  }

  /**
   * Indicates whether the customer can withdraw their acceptance of the consumer disclosure..
   * @return allowCDWithdraw
   **/
  @ApiModelProperty(value = "Indicates whether the customer can withdraw their acceptance of the consumer disclosure.")
  public String getAllowCDWithdraw() {
    return allowCDWithdraw;
  }

  /**
   * setAllowCDWithdraw.
   **/
  public void setAllowCDWithdraw(String allowCDWithdraw) {
    this.allowCDWithdraw = allowCDWithdraw;
  }


  /**
   * allowCDWithdrawMetadata.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure allowCDWithdrawMetadata(SettingsMetadata allowCDWithdrawMetadata) {
    this.allowCDWithdrawMetadata = allowCDWithdrawMetadata;
    return this;
  }

  /**
   * Get allowCDWithdrawMetadata.
   * @return allowCDWithdrawMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getAllowCDWithdrawMetadata() {
    return allowCDWithdrawMetadata;
  }

  /**
   * setAllowCDWithdrawMetadata.
   **/
  public void setAllowCDWithdrawMetadata(SettingsMetadata allowCDWithdrawMetadata) {
    this.allowCDWithdrawMetadata = allowCDWithdrawMetadata;
  }


  /**
   * changeEmail.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure changeEmail(String changeEmail) {
    this.changeEmail = changeEmail;
    return this;
  }

  /**
   * .
   * @return changeEmail
   **/
  @ApiModelProperty(value = "")
  public String getChangeEmail() {
    return changeEmail;
  }

  /**
   * setChangeEmail.
   **/
  public void setChangeEmail(String changeEmail) {
    this.changeEmail = changeEmail;
  }


  /**
   * changeEmailOther.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure changeEmailOther(String changeEmailOther) {
    this.changeEmailOther = changeEmailOther;
    return this;
  }

  /**
   * .
   * @return changeEmailOther
   **/
  @ApiModelProperty(value = "")
  public String getChangeEmailOther() {
    return changeEmailOther;
  }

  /**
   * setChangeEmailOther.
   **/
  public void setChangeEmailOther(String changeEmailOther) {
    this.changeEmailOther = changeEmailOther;
  }


  /**
   * companyName.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The name of the company associated with the consumer disclosure..
   * @return companyName
   **/
  @ApiModelProperty(value = "The name of the company associated with the consumer disclosure.")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * setCompanyName.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  /**
   * companyPhone.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure companyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
    return this;
  }

  /**
   * The phone number of the company associated with the consumer disclosure..
   * @return companyPhone
   **/
  @ApiModelProperty(value = "The phone number of the company associated with the consumer disclosure.")
  public String getCompanyPhone() {
    return companyPhone;
  }

  /**
   * setCompanyPhone.
   **/
  public void setCompanyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
  }


  /**
   * copyCostPerPage.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure copyCostPerPage(String copyCostPerPage) {
    this.copyCostPerPage = copyCostPerPage;
    return this;
  }

  /**
   * .
   * @return copyCostPerPage
   **/
  @ApiModelProperty(value = "")
  public String getCopyCostPerPage() {
    return copyCostPerPage;
  }

  /**
   * setCopyCostPerPage.
   **/
  public void setCopyCostPerPage(String copyCostPerPage) {
    this.copyCostPerPage = copyCostPerPage;
  }


  /**
   * copyFeeCollectionMethod.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure copyFeeCollectionMethod(String copyFeeCollectionMethod) {
    this.copyFeeCollectionMethod = copyFeeCollectionMethod;
    return this;
  }

  /**
   * Specifies the fee collection method for cases in which the customer requires paper copies of the document.  Maximum Length: 255 characters.
   * @return copyFeeCollectionMethod
   **/
  @ApiModelProperty(value = "Specifies the fee collection method for cases in which the customer requires paper copies of the document.  Maximum Length: 255 characters")
  public String getCopyFeeCollectionMethod() {
    return copyFeeCollectionMethod;
  }

  /**
   * setCopyFeeCollectionMethod.
   **/
  public void setCopyFeeCollectionMethod(String copyFeeCollectionMethod) {
    this.copyFeeCollectionMethod = copyFeeCollectionMethod;
  }


  /**
   * copyRequestEmail.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure copyRequestEmail(String copyRequestEmail) {
    this.copyRequestEmail = copyRequestEmail;
    return this;
  }

  /**
   * .
   * @return copyRequestEmail
   **/
  @ApiModelProperty(value = "")
  public String getCopyRequestEmail() {
    return copyRequestEmail;
  }

  /**
   * setCopyRequestEmail.
   **/
  public void setCopyRequestEmail(String copyRequestEmail) {
    this.copyRequestEmail = copyRequestEmail;
  }


  /**
   * custom.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure custom(String custom) {
    this.custom = custom;
    return this;
  }

  /**
   * .
   * @return custom
   **/
  @ApiModelProperty(value = "")
  public String getCustom() {
    return custom;
  }

  /**
   * setCustom.
   **/
  public void setCustom(String custom) {
    this.custom = custom;
  }


  /**
   * enableEsign.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure enableEsign(String enableEsign) {
    this.enableEsign = enableEsign;
    return this;
  }

  /**
   * .
   * @return enableEsign
   **/
  @ApiModelProperty(value = "")
  public String getEnableEsign() {
    return enableEsign;
  }

  /**
   * setEnableEsign.
   **/
  public void setEnableEsign(String enableEsign) {
    this.enableEsign = enableEsign;
  }


  /**
   * esignAgreement.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure esignAgreement(String esignAgreement) {
    this.esignAgreement = esignAgreement;
    return this;
  }

  /**
   * The Electronic Record and Signature Disclosure text. The disclosure text includes the html formatting..
   * @return esignAgreement
   **/
  @ApiModelProperty(value = "The Electronic Record and Signature Disclosure text. The disclosure text includes the html formatting.")
  public String getEsignAgreement() {
    return esignAgreement;
  }

  /**
   * setEsignAgreement.
   **/
  public void setEsignAgreement(String esignAgreement) {
    this.esignAgreement = esignAgreement;
  }


  /**
   * esignText.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure esignText(String esignText) {
    this.esignText = esignText;
    return this;
  }

  /**
   * .
   * @return esignText
   **/
  @ApiModelProperty(value = "")
  public String getEsignText() {
    return esignText;
  }

  /**
   * setEsignText.
   **/
  public void setEsignText(String esignText) {
    this.esignText = esignText;
  }


  /**
   * languageCode.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * .
   * @return languageCode
   **/
  @ApiModelProperty(value = "")
  public String getLanguageCode() {
    return languageCode;
  }

  /**
   * setLanguageCode.
   **/
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  /**
   * mustAgreeToEsign.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure mustAgreeToEsign(String mustAgreeToEsign) {
    this.mustAgreeToEsign = mustAgreeToEsign;
    return this;
  }

  /**
   * .
   * @return mustAgreeToEsign
   **/
  @ApiModelProperty(value = "")
  public String getMustAgreeToEsign() {
    return mustAgreeToEsign;
  }

  /**
   * setMustAgreeToEsign.
   **/
  public void setMustAgreeToEsign(String mustAgreeToEsign) {
    this.mustAgreeToEsign = mustAgreeToEsign;
  }


  /**
   * pdfId.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure pdfId(String pdfId) {
    this.pdfId = pdfId;
    return this;
  }

  /**
   * .
   * @return pdfId
   **/
  @ApiModelProperty(value = "")
  public String getPdfId() {
    return pdfId;
  }

  /**
   * setPdfId.
   **/
  public void setPdfId(String pdfId) {
    this.pdfId = pdfId;
  }


  /**
   * useBrand.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure useBrand(String useBrand) {
    this.useBrand = useBrand;
    return this;
  }

  /**
   * .
   * @return useBrand
   **/
  @ApiModelProperty(value = "")
  public String getUseBrand() {
    return useBrand;
  }

  /**
   * setUseBrand.
   **/
  public void setUseBrand(String useBrand) {
    this.useBrand = useBrand;
  }


  /**
   * useConsumerDisclosureWithinAccount.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure useConsumerDisclosureWithinAccount(String useConsumerDisclosureWithinAccount) {
    this.useConsumerDisclosureWithinAccount = useConsumerDisclosureWithinAccount;
    return this;
  }

  /**
   * .
   * @return useConsumerDisclosureWithinAccount
   **/
  @ApiModelProperty(value = "")
  public String getUseConsumerDisclosureWithinAccount() {
    return useConsumerDisclosureWithinAccount;
  }

  /**
   * setUseConsumerDisclosureWithinAccount.
   **/
  public void setUseConsumerDisclosureWithinAccount(String useConsumerDisclosureWithinAccount) {
    this.useConsumerDisclosureWithinAccount = useConsumerDisclosureWithinAccount;
  }


  /**
   * useConsumerDisclosureWithinAccountMetadata.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure useConsumerDisclosureWithinAccountMetadata(SettingsMetadata useConsumerDisclosureWithinAccountMetadata) {
    this.useConsumerDisclosureWithinAccountMetadata = useConsumerDisclosureWithinAccountMetadata;
    return this;
  }

  /**
   * Get useConsumerDisclosureWithinAccountMetadata.
   * @return useConsumerDisclosureWithinAccountMetadata
   **/
  @ApiModelProperty(value = "")
  public SettingsMetadata getUseConsumerDisclosureWithinAccountMetadata() {
    return useConsumerDisclosureWithinAccountMetadata;
  }

  /**
   * setUseConsumerDisclosureWithinAccountMetadata.
   **/
  public void setUseConsumerDisclosureWithinAccountMetadata(SettingsMetadata useConsumerDisclosureWithinAccountMetadata) {
    this.useConsumerDisclosureWithinAccountMetadata = useConsumerDisclosureWithinAccountMetadata;
  }


  /**
   * withdrawAddressLine1.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawAddressLine1(String withdrawAddressLine1) {
    this.withdrawAddressLine1 = withdrawAddressLine1;
    return this;
  }

  /**
   * Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 100 characters. .
   * @return withdrawAddressLine1
   **/
  @ApiModelProperty(value = "Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 100 characters. ")
  public String getWithdrawAddressLine1() {
    return withdrawAddressLine1;
  }

  /**
   * setWithdrawAddressLine1.
   **/
  public void setWithdrawAddressLine1(String withdrawAddressLine1) {
    this.withdrawAddressLine1 = withdrawAddressLine1;
  }


  /**
   * withdrawAddressLine2.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawAddressLine2(String withdrawAddressLine2) {
    this.withdrawAddressLine2 = withdrawAddressLine2;
    return this;
  }

  /**
   * Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 100 characters. .
   * @return withdrawAddressLine2
   **/
  @ApiModelProperty(value = "Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 100 characters. ")
  public String getWithdrawAddressLine2() {
    return withdrawAddressLine2;
  }

  /**
   * setWithdrawAddressLine2.
   **/
  public void setWithdrawAddressLine2(String withdrawAddressLine2) {
    this.withdrawAddressLine2 = withdrawAddressLine2;
  }


  /**
   * withdrawByEmail.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawByEmail(String withdrawByEmail) {
    this.withdrawByEmail = withdrawByEmail;
    return this;
  }

  /**
   * Indicates whether the customer can withdraw consent by email..
   * @return withdrawByEmail
   **/
  @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by email.")
  public String getWithdrawByEmail() {
    return withdrawByEmail;
  }

  /**
   * setWithdrawByEmail.
   **/
  public void setWithdrawByEmail(String withdrawByEmail) {
    this.withdrawByEmail = withdrawByEmail;
  }


  /**
   * withdrawByMail.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawByMail(String withdrawByMail) {
    this.withdrawByMail = withdrawByMail;
    return this;
  }

  /**
   * Indicates whether the customer can withdraw consent by postal mail..
   * @return withdrawByMail
   **/
  @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by postal mail.")
  public String getWithdrawByMail() {
    return withdrawByMail;
  }

  /**
   * setWithdrawByMail.
   **/
  public void setWithdrawByMail(String withdrawByMail) {
    this.withdrawByMail = withdrawByMail;
  }


  /**
   * withdrawByPhone.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawByPhone(String withdrawByPhone) {
    this.withdrawByPhone = withdrawByPhone;
    return this;
  }

  /**
   * Indicates whether the customer can withdraw consent by phone..
   * @return withdrawByPhone
   **/
  @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by phone.")
  public String getWithdrawByPhone() {
    return withdrawByPhone;
  }

  /**
   * setWithdrawByPhone.
   **/
  public void setWithdrawByPhone(String withdrawByPhone) {
    this.withdrawByPhone = withdrawByPhone;
  }


  /**
   * withdrawCity.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawCity(String withdrawCity) {
    this.withdrawCity = withdrawCity;
    return this;
  }

  /**
   * Contains the city of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 50 characters. .
   * @return withdrawCity
   **/
  @ApiModelProperty(value = "Contains the city of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 50 characters. ")
  public String getWithdrawCity() {
    return withdrawCity;
  }

  /**
   * setWithdrawCity.
   **/
  public void setWithdrawCity(String withdrawCity) {
    this.withdrawCity = withdrawCity;
  }


  /**
   * withdrawConsequences.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawConsequences(String withdrawConsequences) {
    this.withdrawConsequences = withdrawConsequences;
    return this;
  }

  /**
   * Indicates the consequences of withdrawing consent..
   * @return withdrawConsequences
   **/
  @ApiModelProperty(value = "Indicates the consequences of withdrawing consent.")
  public String getWithdrawConsequences() {
    return withdrawConsequences;
  }

  /**
   * setWithdrawConsequences.
   **/
  public void setWithdrawConsequences(String withdrawConsequences) {
    this.withdrawConsequences = withdrawConsequences;
  }


  /**
   * withdrawEmail.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawEmail(String withdrawEmail) {
    this.withdrawEmail = withdrawEmail;
    return this;
  }

  /**
   * Contains the email address to which a customer can send a consent withdrawal notification.  Maximum length: 100 characters. .
   * @return withdrawEmail
   **/
  @ApiModelProperty(value = "Contains the email address to which a customer can send a consent withdrawal notification.  Maximum length: 100 characters. ")
  public String getWithdrawEmail() {
    return withdrawEmail;
  }

  /**
   * setWithdrawEmail.
   **/
  public void setWithdrawEmail(String withdrawEmail) {
    this.withdrawEmail = withdrawEmail;
  }


  /**
   * withdrawOther.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawOther(String withdrawOther) {
    this.withdrawOther = withdrawOther;
    return this;
  }

  /**
   * Indicates other information need to withdraw consent.  Maximum length: 255 characters..
   * @return withdrawOther
   **/
  @ApiModelProperty(value = "Indicates other information need to withdraw consent.  Maximum length: 255 characters.")
  public String getWithdrawOther() {
    return withdrawOther;
  }

  /**
   * setWithdrawOther.
   **/
  public void setWithdrawOther(String withdrawOther) {
    this.withdrawOther = withdrawOther;
  }


  /**
   * withdrawPhone.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawPhone(String withdrawPhone) {
    this.withdrawPhone = withdrawPhone;
    return this;
  }

  /**
   * Contains the phone number which a customer can call to register consent withdrawal notification.  Maximum length: 20 characters. .
   * @return withdrawPhone
   **/
  @ApiModelProperty(value = "Contains the phone number which a customer can call to register consent withdrawal notification.  Maximum length: 20 characters. ")
  public String getWithdrawPhone() {
    return withdrawPhone;
  }

  /**
   * setWithdrawPhone.
   **/
  public void setWithdrawPhone(String withdrawPhone) {
    this.withdrawPhone = withdrawPhone;
  }


  /**
   * withdrawPostalCode.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawPostalCode(String withdrawPostalCode) {
    this.withdrawPostalCode = withdrawPostalCode;
    return this;
  }

  /**
   * Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 20 characters. .
   * @return withdrawPostalCode
   **/
  @ApiModelProperty(value = "Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.  Maximum length: 20 characters. ")
  public String getWithdrawPostalCode() {
    return withdrawPostalCode;
  }

  /**
   * setWithdrawPostalCode.
   **/
  public void setWithdrawPostalCode(String withdrawPostalCode) {
    this.withdrawPostalCode = withdrawPostalCode;
  }


  /**
   * withdrawState.
   *
   * @return ConsumerDisclosure
   **/
  public ConsumerDisclosure withdrawState(String withdrawState) {
    this.withdrawState = withdrawState;
    return this;
  }

  /**
   * Contains the state of the postal address to which a customer can send a consent withdrawal notification..
   * @return withdrawState
   **/
  @ApiModelProperty(value = "Contains the state of the postal address to which a customer can send a consent withdrawal notification.")
  public String getWithdrawState() {
    return withdrawState;
  }

  /**
   * setWithdrawState.
   **/
  public void setWithdrawState(String withdrawState) {
    this.withdrawState = withdrawState;
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
    ConsumerDisclosure consumerDisclosure = (ConsumerDisclosure) o;
    return Objects.equals(this.accountEsignId, consumerDisclosure.accountEsignId) &&
        Objects.equals(this.allowCDWithdraw, consumerDisclosure.allowCDWithdraw) &&
        Objects.equals(this.allowCDWithdrawMetadata, consumerDisclosure.allowCDWithdrawMetadata) &&
        Objects.equals(this.changeEmail, consumerDisclosure.changeEmail) &&
        Objects.equals(this.changeEmailOther, consumerDisclosure.changeEmailOther) &&
        Objects.equals(this.companyName, consumerDisclosure.companyName) &&
        Objects.equals(this.companyPhone, consumerDisclosure.companyPhone) &&
        Objects.equals(this.copyCostPerPage, consumerDisclosure.copyCostPerPage) &&
        Objects.equals(this.copyFeeCollectionMethod, consumerDisclosure.copyFeeCollectionMethod) &&
        Objects.equals(this.copyRequestEmail, consumerDisclosure.copyRequestEmail) &&
        Objects.equals(this.custom, consumerDisclosure.custom) &&
        Objects.equals(this.enableEsign, consumerDisclosure.enableEsign) &&
        Objects.equals(this.esignAgreement, consumerDisclosure.esignAgreement) &&
        Objects.equals(this.esignText, consumerDisclosure.esignText) &&
        Objects.equals(this.languageCode, consumerDisclosure.languageCode) &&
        Objects.equals(this.mustAgreeToEsign, consumerDisclosure.mustAgreeToEsign) &&
        Objects.equals(this.pdfId, consumerDisclosure.pdfId) &&
        Objects.equals(this.useBrand, consumerDisclosure.useBrand) &&
        Objects.equals(this.useConsumerDisclosureWithinAccount, consumerDisclosure.useConsumerDisclosureWithinAccount) &&
        Objects.equals(this.useConsumerDisclosureWithinAccountMetadata, consumerDisclosure.useConsumerDisclosureWithinAccountMetadata) &&
        Objects.equals(this.withdrawAddressLine1, consumerDisclosure.withdrawAddressLine1) &&
        Objects.equals(this.withdrawAddressLine2, consumerDisclosure.withdrawAddressLine2) &&
        Objects.equals(this.withdrawByEmail, consumerDisclosure.withdrawByEmail) &&
        Objects.equals(this.withdrawByMail, consumerDisclosure.withdrawByMail) &&
        Objects.equals(this.withdrawByPhone, consumerDisclosure.withdrawByPhone) &&
        Objects.equals(this.withdrawCity, consumerDisclosure.withdrawCity) &&
        Objects.equals(this.withdrawConsequences, consumerDisclosure.withdrawConsequences) &&
        Objects.equals(this.withdrawEmail, consumerDisclosure.withdrawEmail) &&
        Objects.equals(this.withdrawOther, consumerDisclosure.withdrawOther) &&
        Objects.equals(this.withdrawPhone, consumerDisclosure.withdrawPhone) &&
        Objects.equals(this.withdrawPostalCode, consumerDisclosure.withdrawPostalCode) &&
        Objects.equals(this.withdrawState, consumerDisclosure.withdrawState);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountEsignId, allowCDWithdraw, allowCDWithdrawMetadata, changeEmail, changeEmailOther, companyName, companyPhone, copyCostPerPage, copyFeeCollectionMethod, copyRequestEmail, custom, enableEsign, esignAgreement, esignText, languageCode, mustAgreeToEsign, pdfId, useBrand, useConsumerDisclosureWithinAccount, useConsumerDisclosureWithinAccountMetadata, withdrawAddressLine1, withdrawAddressLine2, withdrawByEmail, withdrawByMail, withdrawByPhone, withdrawCity, withdrawConsequences, withdrawEmail, withdrawOther, withdrawPhone, withdrawPostalCode, withdrawState);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerDisclosure {\n");
    
    sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
    sb.append("    allowCDWithdraw: ").append(toIndentedString(allowCDWithdraw)).append("\n");
    sb.append("    allowCDWithdrawMetadata: ").append(toIndentedString(allowCDWithdrawMetadata)).append("\n");
    sb.append("    changeEmail: ").append(toIndentedString(changeEmail)).append("\n");
    sb.append("    changeEmailOther: ").append(toIndentedString(changeEmailOther)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
    sb.append("    copyCostPerPage: ").append(toIndentedString(copyCostPerPage)).append("\n");
    sb.append("    copyFeeCollectionMethod: ").append(toIndentedString(copyFeeCollectionMethod)).append("\n");
    sb.append("    copyRequestEmail: ").append(toIndentedString(copyRequestEmail)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    enableEsign: ").append(toIndentedString(enableEsign)).append("\n");
    sb.append("    esignAgreement: ").append(toIndentedString(esignAgreement)).append("\n");
    sb.append("    esignText: ").append(toIndentedString(esignText)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    mustAgreeToEsign: ").append(toIndentedString(mustAgreeToEsign)).append("\n");
    sb.append("    pdfId: ").append(toIndentedString(pdfId)).append("\n");
    sb.append("    useBrand: ").append(toIndentedString(useBrand)).append("\n");
    sb.append("    useConsumerDisclosureWithinAccount: ").append(toIndentedString(useConsumerDisclosureWithinAccount)).append("\n");
    sb.append("    useConsumerDisclosureWithinAccountMetadata: ").append(toIndentedString(useConsumerDisclosureWithinAccountMetadata)).append("\n");
    sb.append("    withdrawAddressLine1: ").append(toIndentedString(withdrawAddressLine1)).append("\n");
    sb.append("    withdrawAddressLine2: ").append(toIndentedString(withdrawAddressLine2)).append("\n");
    sb.append("    withdrawByEmail: ").append(toIndentedString(withdrawByEmail)).append("\n");
    sb.append("    withdrawByMail: ").append(toIndentedString(withdrawByMail)).append("\n");
    sb.append("    withdrawByPhone: ").append(toIndentedString(withdrawByPhone)).append("\n");
    sb.append("    withdrawCity: ").append(toIndentedString(withdrawCity)).append("\n");
    sb.append("    withdrawConsequences: ").append(toIndentedString(withdrawConsequences)).append("\n");
    sb.append("    withdrawEmail: ").append(toIndentedString(withdrawEmail)).append("\n");
    sb.append("    withdrawOther: ").append(toIndentedString(withdrawOther)).append("\n");
    sb.append("    withdrawPhone: ").append(toIndentedString(withdrawPhone)).append("\n");
    sb.append("    withdrawPostalCode: ").append(toIndentedString(withdrawPostalCode)).append("\n");
    sb.append("    withdrawState: ").append(toIndentedString(withdrawState)).append("\n");
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

