package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class ConsumerDisclosure   {
  
  private String accountEsignId = null;
  private String allowCDWithdraw = null;
  private String changeEmail = null;
  private String changeEmailOther = null;
  private String companyName = null;
  private String companyPhone = null;
  private String copyCostPerPage = null;
  private String copyFeeCollectionMethod = null;
  private String copyRequestEmail = null;
  private String custom = null;
  private String enableEsign = null;
  private String esignAgreement = null;
  private String esignText = null;
  private String languageCode = null;
  private String mustAgreeToEsign = null;
  private String pdfId = null;
  private String useBrand = null;
  private String useConsumerDisclosureWithinAccount = null;
  private String withdrawAddressLine1 = null;
  private String withdrawAddressLine2 = null;
  private String withdrawByEmail = null;
  private String withdrawByMail = null;
  private String withdrawByPhone = null;
  private String withdrawCity = null;
  private String withdrawConsequences = null;
  private String withdrawEmail = null;
  private String withdrawOther = null;
  private String withdrawPhone = null;
  private String withdrawPostalCode = null;
  private String withdrawState = null;

  
  /**
   * A GUID identifying the account associated with the consumer disclosure
   **/
  
  @ApiModelProperty(value = "A GUID identifying the account associated with the consumer disclosure")
  @JsonProperty("accountEsignId")
  public String getAccountEsignId() {
    return accountEsignId;
  }
  public void setAccountEsignId(String accountEsignId) {
    this.accountEsignId = accountEsignId;
  }

  
  /**
   * Indicates whether the customer can withdraw their acceptance of the consumer disclosure.
   **/
  
  @ApiModelProperty(value = "Indicates whether the customer can withdraw their acceptance of the consumer disclosure.")
  @JsonProperty("allowCDWithdraw")
  public String getAllowCDWithdraw() {
    return allowCDWithdraw;
  }
  public void setAllowCDWithdraw(String allowCDWithdraw) {
    this.allowCDWithdraw = allowCDWithdraw;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("changeEmail")
  public String getChangeEmail() {
    return changeEmail;
  }
  public void setChangeEmail(String changeEmail) {
    this.changeEmail = changeEmail;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("changeEmailOther")
  public String getChangeEmailOther() {
    return changeEmailOther;
  }
  public void setChangeEmailOther(String changeEmailOther) {
    this.changeEmailOther = changeEmailOther;
  }

  
  /**
   * The name of the company associated with the consumer disclosure.
   **/
  
  @ApiModelProperty(value = "The name of the company associated with the consumer disclosure.")
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  /**
   * The phone number of the company associated with the consumer disclosure.
   **/
  
  @ApiModelProperty(value = "The phone number of the company associated with the consumer disclosure.")
  @JsonProperty("companyPhone")
  public String getCompanyPhone() {
    return companyPhone;
  }
  public void setCompanyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("copyCostPerPage")
  public String getCopyCostPerPage() {
    return copyCostPerPage;
  }
  public void setCopyCostPerPage(String copyCostPerPage) {
    this.copyCostPerPage = copyCostPerPage;
  }

  
  /**
   * Specifies the fee collection method for cases in which the customer requires paper copies of the document.\n\nMaximum Length: 255 characters
   **/
  
  @ApiModelProperty(value = "Specifies the fee collection method for cases in which the customer requires paper copies of the document.\n\nMaximum Length: 255 characters")
  @JsonProperty("copyFeeCollectionMethod")
  public String getCopyFeeCollectionMethod() {
    return copyFeeCollectionMethod;
  }
  public void setCopyFeeCollectionMethod(String copyFeeCollectionMethod) {
    this.copyFeeCollectionMethod = copyFeeCollectionMethod;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("copyRequestEmail")
  public String getCopyRequestEmail() {
    return copyRequestEmail;
  }
  public void setCopyRequestEmail(String copyRequestEmail) {
    this.copyRequestEmail = copyRequestEmail;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("custom")
  public String getCustom() {
    return custom;
  }
  public void setCustom(String custom) {
    this.custom = custom;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableEsign")
  public String getEnableEsign() {
    return enableEsign;
  }
  public void setEnableEsign(String enableEsign) {
    this.enableEsign = enableEsign;
  }

  
  /**
   * The Electronic Record and Signature Disclosure text. The disclosure text includes the html formatting.
   **/
  
  @ApiModelProperty(value = "The Electronic Record and Signature Disclosure text. The disclosure text includes the html formatting.")
  @JsonProperty("esignAgreement")
  public String getEsignAgreement() {
    return esignAgreement;
  }
  public void setEsignAgreement(String esignAgreement) {
    this.esignAgreement = esignAgreement;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("esignText")
  public String getEsignText() {
    return esignText;
  }
  public void setEsignText(String esignText) {
    this.esignText = esignText;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mustAgreeToEsign")
  public String getMustAgreeToEsign() {
    return mustAgreeToEsign;
  }
  public void setMustAgreeToEsign(String mustAgreeToEsign) {
    this.mustAgreeToEsign = mustAgreeToEsign;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pdfId")
  public String getPdfId() {
    return pdfId;
  }
  public void setPdfId(String pdfId) {
    this.pdfId = pdfId;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useBrand")
  public String getUseBrand() {
    return useBrand;
  }
  public void setUseBrand(String useBrand) {
    this.useBrand = useBrand;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useConsumerDisclosureWithinAccount")
  public String getUseConsumerDisclosureWithinAccount() {
    return useConsumerDisclosureWithinAccount;
  }
  public void setUseConsumerDisclosureWithinAccount(String useConsumerDisclosureWithinAccount) {
    this.useConsumerDisclosureWithinAccount = useConsumerDisclosureWithinAccount;
  }

  
  /**
   * Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.")
  @JsonProperty("withdrawAddressLine1")
  public String getWithdrawAddressLine1() {
    return withdrawAddressLine1;
  }
  public void setWithdrawAddressLine1(String withdrawAddressLine1) {
    this.withdrawAddressLine1 = withdrawAddressLine1;
  }

  
  /**
   * Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.")
  @JsonProperty("withdrawAddressLine2")
  public String getWithdrawAddressLine2() {
    return withdrawAddressLine2;
  }
  public void setWithdrawAddressLine2(String withdrawAddressLine2) {
    this.withdrawAddressLine2 = withdrawAddressLine2;
  }

  
  /**
   * Indicates whether the customer can withdraw consent by email.
   **/
  
  @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by email.")
  @JsonProperty("withdrawByEmail")
  public String getWithdrawByEmail() {
    return withdrawByEmail;
  }
  public void setWithdrawByEmail(String withdrawByEmail) {
    this.withdrawByEmail = withdrawByEmail;
  }

  
  /**
   * Indicates whether the customer can withdraw consent by postal mail.
   **/
  
  @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by postal mail.")
  @JsonProperty("withdrawByMail")
  public String getWithdrawByMail() {
    return withdrawByMail;
  }
  public void setWithdrawByMail(String withdrawByMail) {
    this.withdrawByMail = withdrawByMail;
  }

  
  /**
   * Indicates whether the customer can withdraw consent by phone.
   **/
  
  @ApiModelProperty(value = "Indicates whether the customer can withdraw consent by phone.")
  @JsonProperty("withdrawByPhone")
  public String getWithdrawByPhone() {
    return withdrawByPhone;
  }
  public void setWithdrawByPhone(String withdrawByPhone) {
    this.withdrawByPhone = withdrawByPhone;
  }

  
  /**
   * Contains the city of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 50 characters.
   **/
  
  @ApiModelProperty(value = "Contains the city of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 50 characters.")
  @JsonProperty("withdrawCity")
  public String getWithdrawCity() {
    return withdrawCity;
  }
  public void setWithdrawCity(String withdrawCity) {
    this.withdrawCity = withdrawCity;
  }

  
  /**
   * Indicates the consequences of withdrawing consent.
   **/
  
  @ApiModelProperty(value = "Indicates the consequences of withdrawing consent.")
  @JsonProperty("withdrawConsequences")
  public String getWithdrawConsequences() {
    return withdrawConsequences;
  }
  public void setWithdrawConsequences(String withdrawConsequences) {
    this.withdrawConsequences = withdrawConsequences;
  }

  
  /**
   * Contains the email address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.
   **/
  
  @ApiModelProperty(value = "Contains the email address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 100 characters.")
  @JsonProperty("withdrawEmail")
  public String getWithdrawEmail() {
    return withdrawEmail;
  }
  public void setWithdrawEmail(String withdrawEmail) {
    this.withdrawEmail = withdrawEmail;
  }

  
  /**
   * Indicates other information need to withdraw consent.\n\nMaximum length: 255 characters.
   **/
  
  @ApiModelProperty(value = "Indicates other information need to withdraw consent.\n\nMaximum length: 255 characters.")
  @JsonProperty("withdrawOther")
  public String getWithdrawOther() {
    return withdrawOther;
  }
  public void setWithdrawOther(String withdrawOther) {
    this.withdrawOther = withdrawOther;
  }

  
  /**
   * Contains the phone number which a customer can call to register consent withdrawal notification.\n\nMaximum length: 20 characters.
   **/
  
  @ApiModelProperty(value = "Contains the phone number which a customer can call to register consent withdrawal notification.\n\nMaximum length: 20 characters.")
  @JsonProperty("withdrawPhone")
  public String getWithdrawPhone() {
    return withdrawPhone;
  }
  public void setWithdrawPhone(String withdrawPhone) {
    this.withdrawPhone = withdrawPhone;
  }

  
  /**
   * Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 20 characters.
   **/
  
  @ApiModelProperty(value = "Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.\n\nMaximum length: 20 characters.")
  @JsonProperty("withdrawPostalCode")
  public String getWithdrawPostalCode() {
    return withdrawPostalCode;
  }
  public void setWithdrawPostalCode(String withdrawPostalCode) {
    this.withdrawPostalCode = withdrawPostalCode;
  }

  
  /**
   * Contains the state of the postal address to which a customer can send a consent withdrawal notification.
   **/
  
  @ApiModelProperty(value = "Contains the state of the postal address to which a customer can send a consent withdrawal notification.")
  @JsonProperty("withdrawState")
  public String getWithdrawState() {
    return withdrawState;
  }
  public void setWithdrawState(String withdrawState) {
    this.withdrawState = withdrawState;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerDisclosure consumerDisclosure = (ConsumerDisclosure) o;

    return true && Objects.equals(accountEsignId, consumerDisclosure.accountEsignId) &&
        Objects.equals(allowCDWithdraw, consumerDisclosure.allowCDWithdraw) &&
        Objects.equals(changeEmail, consumerDisclosure.changeEmail) &&
        Objects.equals(changeEmailOther, consumerDisclosure.changeEmailOther) &&
        Objects.equals(companyName, consumerDisclosure.companyName) &&
        Objects.equals(companyPhone, consumerDisclosure.companyPhone) &&
        Objects.equals(copyCostPerPage, consumerDisclosure.copyCostPerPage) &&
        Objects.equals(copyFeeCollectionMethod, consumerDisclosure.copyFeeCollectionMethod) &&
        Objects.equals(copyRequestEmail, consumerDisclosure.copyRequestEmail) &&
        Objects.equals(custom, consumerDisclosure.custom) &&
        Objects.equals(enableEsign, consumerDisclosure.enableEsign) &&
        Objects.equals(esignAgreement, consumerDisclosure.esignAgreement) &&
        Objects.equals(esignText, consumerDisclosure.esignText) &&
        Objects.equals(languageCode, consumerDisclosure.languageCode) &&
        Objects.equals(mustAgreeToEsign, consumerDisclosure.mustAgreeToEsign) &&
        Objects.equals(pdfId, consumerDisclosure.pdfId) &&
        Objects.equals(useBrand, consumerDisclosure.useBrand) &&
        Objects.equals(useConsumerDisclosureWithinAccount, consumerDisclosure.useConsumerDisclosureWithinAccount) &&
        Objects.equals(withdrawAddressLine1, consumerDisclosure.withdrawAddressLine1) &&
        Objects.equals(withdrawAddressLine2, consumerDisclosure.withdrawAddressLine2) &&
        Objects.equals(withdrawByEmail, consumerDisclosure.withdrawByEmail) &&
        Objects.equals(withdrawByMail, consumerDisclosure.withdrawByMail) &&
        Objects.equals(withdrawByPhone, consumerDisclosure.withdrawByPhone) &&
        Objects.equals(withdrawCity, consumerDisclosure.withdrawCity) &&
        Objects.equals(withdrawConsequences, consumerDisclosure.withdrawConsequences) &&
        Objects.equals(withdrawEmail, consumerDisclosure.withdrawEmail) &&
        Objects.equals(withdrawOther, consumerDisclosure.withdrawOther) &&
        Objects.equals(withdrawPhone, consumerDisclosure.withdrawPhone) &&
        Objects.equals(withdrawPostalCode, consumerDisclosure.withdrawPostalCode) &&
        Objects.equals(withdrawState, consumerDisclosure.withdrawState)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountEsignId, allowCDWithdraw, changeEmail, changeEmailOther, companyName, companyPhone, copyCostPerPage, copyFeeCollectionMethod, copyRequestEmail, custom, enableEsign, esignAgreement, esignText, languageCode, mustAgreeToEsign, pdfId, useBrand, useConsumerDisclosureWithinAccount, withdrawAddressLine1, withdrawAddressLine2, withdrawByEmail, withdrawByMail, withdrawByPhone, withdrawCity, withdrawConsequences, withdrawEmail, withdrawOther, withdrawPhone, withdrawPostalCode, withdrawState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerDisclosure {\n");
    
    if (accountEsignId != null)
      sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
    if (allowCDWithdraw != null)
      sb.append("    allowCDWithdraw: ").append(toIndentedString(allowCDWithdraw)).append("\n");
    if (changeEmail != null)
      sb.append("    changeEmail: ").append(toIndentedString(changeEmail)).append("\n");
    if (changeEmailOther != null)
      sb.append("    changeEmailOther: ").append(toIndentedString(changeEmailOther)).append("\n");
    if (companyName != null)
      sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    if (companyPhone != null)
      sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
    if (copyCostPerPage != null)
      sb.append("    copyCostPerPage: ").append(toIndentedString(copyCostPerPage)).append("\n");
    if (copyFeeCollectionMethod != null)
      sb.append("    copyFeeCollectionMethod: ").append(toIndentedString(copyFeeCollectionMethod)).append("\n");
    if (copyRequestEmail != null)
      sb.append("    copyRequestEmail: ").append(toIndentedString(copyRequestEmail)).append("\n");
    if (custom != null)
      sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    if (enableEsign != null)
      sb.append("    enableEsign: ").append(toIndentedString(enableEsign)).append("\n");
    if (esignAgreement != null)
      sb.append("    esignAgreement: ").append(toIndentedString(esignAgreement)).append("\n");
    if (esignText != null)
      sb.append("    esignText: ").append(toIndentedString(esignText)).append("\n");
    if (languageCode != null)
      sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    if (mustAgreeToEsign != null)
      sb.append("    mustAgreeToEsign: ").append(toIndentedString(mustAgreeToEsign)).append("\n");
    if (pdfId != null)
      sb.append("    pdfId: ").append(toIndentedString(pdfId)).append("\n");
    if (useBrand != null)
      sb.append("    useBrand: ").append(toIndentedString(useBrand)).append("\n");
    if (useConsumerDisclosureWithinAccount != null)
      sb.append("    useConsumerDisclosureWithinAccount: ").append(toIndentedString(useConsumerDisclosureWithinAccount)).append("\n");
    if (withdrawAddressLine1 != null)
      sb.append("    withdrawAddressLine1: ").append(toIndentedString(withdrawAddressLine1)).append("\n");
    if (withdrawAddressLine2 != null)
      sb.append("    withdrawAddressLine2: ").append(toIndentedString(withdrawAddressLine2)).append("\n");
    if (withdrawByEmail != null)
      sb.append("    withdrawByEmail: ").append(toIndentedString(withdrawByEmail)).append("\n");
    if (withdrawByMail != null)
      sb.append("    withdrawByMail: ").append(toIndentedString(withdrawByMail)).append("\n");
    if (withdrawByPhone != null)
      sb.append("    withdrawByPhone: ").append(toIndentedString(withdrawByPhone)).append("\n");
    if (withdrawCity != null)
      sb.append("    withdrawCity: ").append(toIndentedString(withdrawCity)).append("\n");
    if (withdrawConsequences != null)
      sb.append("    withdrawConsequences: ").append(toIndentedString(withdrawConsequences)).append("\n");
    if (withdrawEmail != null)
      sb.append("    withdrawEmail: ").append(toIndentedString(withdrawEmail)).append("\n");
    if (withdrawOther != null)
      sb.append("    withdrawOther: ").append(toIndentedString(withdrawOther)).append("\n");
    if (withdrawPhone != null)
      sb.append("    withdrawPhone: ").append(toIndentedString(withdrawPhone)).append("\n");
    if (withdrawPostalCode != null)
      sb.append("    withdrawPostalCode: ").append(toIndentedString(withdrawPostalCode)).append("\n");
    if (withdrawState != null)
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

