package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Checkbox;
import com.docusign.esign.model.Email;
import com.docusign.esign.model.Number;
import com.docusign.esign.model.RadioGroup;
import com.docusign.esign.model.SenderCompany;
import com.docusign.esign.model.SenderName;
import com.docusign.esign.model.Ssn;
import com.docusign.esign.model.TabGroup;
import com.docusign.esign.model.Text;
import com.docusign.esign.model.Zip;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;

/**
 * Prefill tabs are tabs that the sender can fill in before the envelope is sent. They are sometimes called sender tags or pre-fill fields.  Only the following tab types can be prefill tabs:  - text - check boxes - radio buttons    [Pre-Fill Your Own Document Fields][app] describes how prefill tabs work in the web application.   [Customize your envelopes with pre-fill fields][catblog] shows how to use prefill tabs in your application using the eSignature SDKs.  [app]:      https://support.docusign.com/en/guides/ndse-user-guide-prefill-fields [catblog]:  https://www.docusign.com/blog/developers/common-api-tasks-customize-your-envelopes-pre-fill-fields.
 *
 */
@Schema(description = "Prefill tabs are tabs that the sender can fill in before the envelope is sent. They are sometimes called sender tags or pre-fill fields.  Only the following tab types can be prefill tabs:  - text - check boxes - radio buttons    [Pre-Fill Your Own Document Fields][app] describes how prefill tabs work in the web application.   [Customize your envelopes with pre-fill fields][catblog] shows how to use prefill tabs in your application using the eSignature SDKs.  [app]:      https://support.docusign.com/en/guides/ndse-user-guide-prefill-fields [catblog]:  https://www.docusign.com/blog/developers/common-api-tasks-customize-your-envelopes-pre-fill-fields")

public class PrefillTabs {
  @JsonProperty("checkboxTabs")
  private java.util.List<Checkbox> checkboxTabs = null;

  @JsonProperty("dateTabs")
  private java.util.List<com.docusign.esign.model.Date> dateTabs = null;

  @JsonProperty("emailTabs")
  private java.util.List<Email> emailTabs = null;

  @JsonProperty("numberTabs")
  private java.util.List<Number> numberTabs = null;

  @JsonProperty("radioGroupTabs")
  private java.util.List<RadioGroup> radioGroupTabs = null;

  @JsonProperty("senderCompanyTabs")
  private java.util.List<SenderCompany> senderCompanyTabs = null;

  @JsonProperty("senderNameTabs")
  private java.util.List<SenderName> senderNameTabs = null;

  @JsonProperty("ssnTabs")
  private java.util.List<Ssn> ssnTabs = null;

  @JsonProperty("tabGroups")
  private java.util.List<TabGroup> tabGroups = null;

  @JsonProperty("textTabs")
  private java.util.List<Text> textTabs = null;

  @JsonProperty("zipTabs")
  private java.util.List<Zip> zipTabs = null;


  /**
   * checkboxTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs checkboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
    return this;
  }
  
  /**
   * addCheckboxTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addCheckboxTabsItem(Checkbox checkboxTabsItem) {
    if (this.checkboxTabs == null) {
      this.checkboxTabs = new java.util.ArrayList<>();
    }
    this.checkboxTabs.add(checkboxTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document in a location where the recipient can select an option..
   * @return checkboxTabs
   **/
  @Schema(description = "Specifies a tag on the document in a location where the recipient can select an option.")
  public java.util.List<Checkbox> getCheckboxTabs() {
    return checkboxTabs;
  }

  /**
   * setCheckboxTabs.
   **/
  public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
  }


  /**
   * dateTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs dateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
    return this;
  }
  
  /**
   * addDateTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addDateTabsItem(com.docusign.esign.model.Date dateTabsItem) {
    if (this.dateTabs == null) {
      this.dateTabs = new java.util.ArrayList<>();
    }
    this.dateTabs.add(dateTabsItem);
    return this;
  }

  /**
   * Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format..
   * @return dateTabs
   **/
  @Schema(description = "Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.")
  public java.util.List<com.docusign.esign.model.Date> getDateTabs() {
    return dateTabs;
  }

  /**
   * setDateTabs.
   **/
  public void setDateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
  }


  /**
   * emailTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs emailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
    return this;
  }
  
  /**
   * addEmailTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addEmailTabsItem(Email emailTabsItem) {
    if (this.emailTabs == null) {
      this.emailTabs = new java.util.ArrayList<>();
    }
    this.emailTabs.add(emailTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return emailTabs
   **/
  @Schema(description = "Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Email> getEmailTabs() {
    return emailTabs;
  }

  /**
   * setEmailTabs.
   **/
  public void setEmailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
  }


  /**
   * numberTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs numberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
    return this;
  }
  
  /**
   * addNumberTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addNumberTabsItem(Number numberTabsItem) {
    if (this.numberTabs == null) {
      this.numberTabs = new java.util.ArrayList<>();
    }
    this.numberTabs.add(numberTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. .
   * @return numberTabs
   **/
  @Schema(description = "Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. ")
  public java.util.List<Number> getNumberTabs() {
    return numberTabs;
  }

  /**
   * setNumberTabs.
   **/
  public void setNumberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
  }


  /**
   * radioGroupTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs radioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
    return this;
  }
  
  /**
   * addRadioGroupTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addRadioGroupTabsItem(RadioGroup radioGroupTabsItem) {
    if (this.radioGroupTabs == null) {
      this.radioGroupTabs = new java.util.ArrayList<>();
    }
    this.radioGroupTabs.add(radioGroupTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document..
   * @return radioGroupTabs
   **/
  @Schema(description = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
  public java.util.List<RadioGroup> getRadioGroupTabs() {
    return radioGroupTabs;
  }

  /**
   * setRadioGroupTabs.
   **/
  public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
  }


  /**
   * senderCompanyTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs senderCompanyTabs(java.util.List<SenderCompany> senderCompanyTabs) {
    this.senderCompanyTabs = senderCompanyTabs;
    return this;
  }
  
  /**
   * addSenderCompanyTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addSenderCompanyTabsItem(SenderCompany senderCompanyTabsItem) {
    if (this.senderCompanyTabs == null) {
      this.senderCompanyTabs = new java.util.ArrayList<>();
    }
    this.senderCompanyTabs.add(senderCompanyTabsItem);
    return this;
  }

  /**
   * .
   * @return senderCompanyTabs
   **/
  @Schema(description = "")
  public java.util.List<SenderCompany> getSenderCompanyTabs() {
    return senderCompanyTabs;
  }

  /**
   * setSenderCompanyTabs.
   **/
  public void setSenderCompanyTabs(java.util.List<SenderCompany> senderCompanyTabs) {
    this.senderCompanyTabs = senderCompanyTabs;
  }


  /**
   * senderNameTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs senderNameTabs(java.util.List<SenderName> senderNameTabs) {
    this.senderNameTabs = senderNameTabs;
    return this;
  }
  
  /**
   * addSenderNameTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addSenderNameTabsItem(SenderName senderNameTabsItem) {
    if (this.senderNameTabs == null) {
      this.senderNameTabs = new java.util.ArrayList<>();
    }
    this.senderNameTabs.add(senderNameTabsItem);
    return this;
  }

  /**
   * .
   * @return senderNameTabs
   **/
  @Schema(description = "")
  public java.util.List<SenderName> getSenderNameTabs() {
    return senderNameTabs;
  }

  /**
   * setSenderNameTabs.
   **/
  public void setSenderNameTabs(java.util.List<SenderName> senderNameTabs) {
    this.senderNameTabs = senderNameTabs;
  }


  /**
   * ssnTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs ssnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
    return this;
  }
  
  /**
   * addSsnTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addSsnTabsItem(Ssn ssnTabsItem) {
    if (this.ssnTabs == null) {
      this.ssnTabs = new java.util.ArrayList<>();
    }
    this.ssnTabs.add(ssnTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return ssnTabs
   **/
  @Schema(description = "Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Ssn> getSsnTabs() {
    return ssnTabs;
  }

  /**
   * setSsnTabs.
   **/
  public void setSsnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
  }


  /**
   * tabGroups.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs tabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
    return this;
  }
  
  /**
   * addTabGroupsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addTabGroupsItem(TabGroup tabGroupsItem) {
    if (this.tabGroups == null) {
      this.tabGroups = new java.util.ArrayList<>();
    }
    this.tabGroups.add(tabGroupsItem);
    return this;
  }

  /**
   * .
   * @return tabGroups
   **/
  @Schema(description = "")
  public java.util.List<TabGroup> getTabGroups() {
    return tabGroups;
  }

  /**
   * setTabGroups.
   **/
  public void setTabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
  }


  /**
   * textTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs textTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
    return this;
  }
  
  /**
   * addTextTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addTextTabsItem(Text textTabsItem) {
    if (this.textTabs == null) {
      this.textTabs = new java.util.ArrayList<>();
    }
    this.textTabs.add(textTabsItem);
    return this;
  }

  /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return textTabs
   **/
  @Schema(description = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Text> getTextTabs() {
    return textTabs;
  }

  /**
   * setTextTabs.
   **/
  public void setTextTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
  }


  /**
   * zipTabs.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs zipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
    return this;
  }
  
  /**
   * addZipTabsItem.
   *
   * @return PrefillTabs
   **/
  public PrefillTabs addZipTabsItem(Zip zipTabsItem) {
    if (this.zipTabs == null) {
      this.zipTabs = new java.util.ArrayList<>();
    }
    this.zipTabs.add(zipTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return zipTabs
   **/
  @Schema(description = "Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Zip> getZipTabs() {
    return zipTabs;
  }

  /**
   * setZipTabs.
   **/
  public void setZipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
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
    PrefillTabs prefillTabs = (PrefillTabs) o;
    return Objects.equals(this.checkboxTabs, prefillTabs.checkboxTabs) &&
        Objects.equals(this.dateTabs, prefillTabs.dateTabs) &&
        Objects.equals(this.emailTabs, prefillTabs.emailTabs) &&
        Objects.equals(this.numberTabs, prefillTabs.numberTabs) &&
        Objects.equals(this.radioGroupTabs, prefillTabs.radioGroupTabs) &&
        Objects.equals(this.senderCompanyTabs, prefillTabs.senderCompanyTabs) &&
        Objects.equals(this.senderNameTabs, prefillTabs.senderNameTabs) &&
        Objects.equals(this.ssnTabs, prefillTabs.ssnTabs) &&
        Objects.equals(this.tabGroups, prefillTabs.tabGroups) &&
        Objects.equals(this.textTabs, prefillTabs.textTabs) &&
        Objects.equals(this.zipTabs, prefillTabs.zipTabs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(checkboxTabs, dateTabs, emailTabs, numberTabs, radioGroupTabs, senderCompanyTabs, senderNameTabs, ssnTabs, tabGroups, textTabs, zipTabs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefillTabs {\n");
    
    sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
    sb.append("    dateTabs: ").append(toIndentedString(dateTabs)).append("\n");
    sb.append("    emailTabs: ").append(toIndentedString(emailTabs)).append("\n");
    sb.append("    numberTabs: ").append(toIndentedString(numberTabs)).append("\n");
    sb.append("    radioGroupTabs: ").append(toIndentedString(radioGroupTabs)).append("\n");
    sb.append("    senderCompanyTabs: ").append(toIndentedString(senderCompanyTabs)).append("\n");
    sb.append("    senderNameTabs: ").append(toIndentedString(senderNameTabs)).append("\n");
    sb.append("    ssnTabs: ").append(toIndentedString(ssnTabs)).append("\n");
    sb.append("    tabGroups: ").append(toIndentedString(tabGroups)).append("\n");
    sb.append("    textTabs: ").append(toIndentedString(textTabs)).append("\n");
    sb.append("    zipTabs: ").append(toIndentedString(zipTabs)).append("\n");
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

