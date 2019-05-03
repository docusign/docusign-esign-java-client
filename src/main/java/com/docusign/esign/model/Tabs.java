package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Approve;
import com.docusign.esign.model.Checkbox;
import com.docusign.esign.model.Company;
import com.docusign.esign.model.DateSigned;
import com.docusign.esign.model.Decline;
import com.docusign.esign.model.Email;
import com.docusign.esign.model.EmailAddress;
import com.docusign.esign.model.EnvelopeId;
import com.docusign.esign.model.FirstName;
import com.docusign.esign.model.FormulaTab;
import com.docusign.esign.model.FullName;
import com.docusign.esign.model.InitialHere;
import com.docusign.esign.model.LastName;
import com.docusign.esign.model.List;
import com.docusign.esign.model.Notarize;
import com.docusign.esign.model.Note;
import com.docusign.esign.model.Number;
import com.docusign.esign.model.RadioGroup;
import com.docusign.esign.model.SignHere;
import com.docusign.esign.model.SignerAttachment;
import com.docusign.esign.model.SmartSection;
import com.docusign.esign.model.Ssn;
import com.docusign.esign.model.Text;
import com.docusign.esign.model.Title;
import com.docusign.esign.model.View;
import com.docusign.esign.model.Zip;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

/**
 * Tabs
 */

public class Tabs {
  @JsonProperty("approveTabs")
  private java.util.List<Approve> approveTabs = new java.util.ArrayList<Approve>();

  @JsonProperty("checkboxTabs")
  private java.util.List<Checkbox> checkboxTabs = new java.util.ArrayList<Checkbox>();

  @JsonProperty("companyTabs")
  private java.util.List<Company> companyTabs = new java.util.ArrayList<Company>();

  @JsonProperty("dateSignedTabs")
  private java.util.List<DateSigned> dateSignedTabs = new java.util.ArrayList<DateSigned>();

  @JsonProperty("dateTabs")
  private java.util.List<com.docusign.esign.model.Date> dateTabs = new java.util.ArrayList<com.docusign.esign.model.Date>();

  @JsonProperty("declineTabs")
  private java.util.List<Decline> declineTabs = new java.util.ArrayList<Decline>();

  @JsonProperty("emailAddressTabs")
  private java.util.List<EmailAddress> emailAddressTabs = new java.util.ArrayList<EmailAddress>();

  @JsonProperty("emailTabs")
  private java.util.List<Email> emailTabs = new java.util.ArrayList<Email>();

  @JsonProperty("envelopeIdTabs")
  private java.util.List<EnvelopeId> envelopeIdTabs = new java.util.ArrayList<EnvelopeId>();

  @JsonProperty("firstNameTabs")
  private java.util.List<FirstName> firstNameTabs = new java.util.ArrayList<FirstName>();

  @JsonProperty("formulaTabs")
  private java.util.List<FormulaTab> formulaTabs = new java.util.ArrayList<FormulaTab>();

  @JsonProperty("fullNameTabs")
  private java.util.List<FullName> fullNameTabs = new java.util.ArrayList<FullName>();

  @JsonProperty("initialHereTabs")
  private java.util.List<InitialHere> initialHereTabs = new java.util.ArrayList<InitialHere>();

  @JsonProperty("lastNameTabs")
  private java.util.List<LastName> lastNameTabs = new java.util.ArrayList<LastName>();

  @JsonProperty("listTabs")
  private java.util.List<List> listTabs = new java.util.ArrayList<List>();

  @JsonProperty("notarizeTabs")
  private java.util.List<Notarize> notarizeTabs = new java.util.ArrayList<Notarize>();

  @JsonProperty("noteTabs")
  private java.util.List<Note> noteTabs = new java.util.ArrayList<Note>();

  @JsonProperty("numberTabs")
  private java.util.List<Number> numberTabs = new java.util.ArrayList<Number>();

  @JsonProperty("radioGroupTabs")
  private java.util.List<RadioGroup> radioGroupTabs = new java.util.ArrayList<RadioGroup>();

  @JsonProperty("signerAttachmentTabs")
  private java.util.List<SignerAttachment> signerAttachmentTabs = new java.util.ArrayList<SignerAttachment>();

  @JsonProperty("signHereTabs")
  private java.util.List<SignHere> signHereTabs = new java.util.ArrayList<SignHere>();

  @JsonProperty("smartSectionTabs")
  private java.util.List<SmartSection> smartSectionTabs = new java.util.ArrayList<SmartSection>();

  @JsonProperty("ssnTabs")
  private java.util.List<Ssn> ssnTabs = new java.util.ArrayList<Ssn>();

  @JsonProperty("textTabs")
  private java.util.List<Text> textTabs = new java.util.ArrayList<Text>();

  @JsonProperty("titleTabs")
  private java.util.List<Title> titleTabs = new java.util.ArrayList<Title>();

  @JsonProperty("viewTabs")
  private java.util.List<View> viewTabs = new java.util.ArrayList<View>();

  @JsonProperty("zipTabs")
  private java.util.List<Zip> zipTabs = new java.util.ArrayList<Zip>();

  public Tabs approveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
    return this;
  }

  public Tabs addApproveTabsItem(Approve approveTabsItem) {
    this.approveTabs.add(approveTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.
   * @return approveTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.")
  public java.util.List<Approve> getApproveTabs() {
    return approveTabs;
  }

  public void setApproveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
  }

  public Tabs checkboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
    return this;
  }

  public Tabs addCheckboxTabsItem(Checkbox checkboxTabsItem) {
    this.checkboxTabs.add(checkboxTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document in a location where the recipient can select an option.
   * @return checkboxTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document in a location where the recipient can select an option.")
  public java.util.List<Checkbox> getCheckboxTabs() {
    return checkboxTabs;
  }

  public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
  }

  public Tabs companyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
    return this;
  }

  public Tabs addCompanyTabsItem(Company companyTabsItem) {
    this.companyTabs.add(companyTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient's company name to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return companyTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient's company name to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Company> getCompanyTabs() {
    return companyTabs;
  }

  public void setCompanyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
  }

  public Tabs dateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
    return this;
  }

  public Tabs addDateSignedTabsItem(DateSigned dateSignedTabsItem) {
    this.dateSignedTabs.add(dateSignedTabsItem);
    return this;
  }

   /**
   * Specifies a tab on the document where the date the document was signed will automatically appear.
   * @return dateSignedTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tab on the document where the date the document was signed will automatically appear.")
  public java.util.List<DateSigned> getDateSignedTabs() {
    return dateSignedTabs;
  }

  public void setDateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
  }

  public Tabs dateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
    return this;
  }

  public Tabs addDateTabsItem(com.docusign.esign.model.Date dateTabsItem) {
    this.dateTabs.add(dateTabsItem);
    return this;
  }

   /**
   * Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.
   * @return dateTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.")
  public java.util.List<com.docusign.esign.model.Date> getDateTabs() {
    return dateTabs;
  }

  public void setDateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
  }

  public Tabs declineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
    return this;
  }

  public Tabs addDeclineTabsItem(Decline declineTabsItem) {
    this.declineTabs.add(declineTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.
   * @return declineTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.")
  public java.util.List<Decline> getDeclineTabs() {
    return declineTabs;
  }

  public void setDeclineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
  }

  public Tabs emailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
    return this;
  }

  public Tabs addEmailAddressTabsItem(EmailAddress emailAddressTabsItem) {
    this.emailAddressTabs.add(emailAddressTabsItem);
    return this;
  }

   /**
   * Specifies a location on the document where you want where you want the recipient's email, as entered in the recipient information, to display.
   * @return emailAddressTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a location on the document where you want where you want the recipient's email, as entered in the recipient information, to display.")
  public java.util.List<EmailAddress> getEmailAddressTabs() {
    return emailAddressTabs;
  }

  public void setEmailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
  }

  public Tabs emailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
    return this;
  }

  public Tabs addEmailTabsItem(Email emailTabsItem) {
    this.emailTabs.add(emailTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return emailTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Email> getEmailTabs() {
    return emailTabs;
  }

  public void setEmailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
  }

  public Tabs envelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
    return this;
  }

  public Tabs addEnvelopeIdTabsItem(EnvelopeId envelopeIdTabsItem) {
    this.envelopeIdTabs.add(envelopeIdTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.
   * @return envelopeIdTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.")
  public java.util.List<EnvelopeId> getEnvelopeIdTabs() {
    return envelopeIdTabs;
  }

  public void setEnvelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
  }

  public Tabs firstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
    return this;
  }

  public Tabs addFirstNameTabsItem(FirstName firstNameTabsItem) {
    this.firstNameTabs.add(firstNameTabsItem);
    return this;
  }

   /**
   * Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.
   * @return firstNameTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.")
  public java.util.List<FirstName> getFirstNameTabs() {
    return firstNameTabs;
  }

  public void setFirstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
  }

  public Tabs formulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
    return this;
  }

  public Tabs addFormulaTabsItem(FormulaTab formulaTabsItem) {
    this.formulaTabs.add(formulaTabsItem);
    return this;
  }

   /**
   * Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.
   * @return formulaTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.")
  public java.util.List<FormulaTab> getFormulaTabs() {
    return formulaTabs;
  }

  public void setFormulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
  }

  public Tabs fullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
    return this;
  }

  public Tabs addFullNameTabsItem(FullName fullNameTabsItem) {
    this.fullNameTabs.add(fullNameTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient's name to appear.
   * @return fullNameTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient's name to appear.")
  public java.util.List<FullName> getFullNameTabs() {
    return fullNameTabs;
  }

  public void setFullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
  }

  public Tabs initialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
    return this;
  }

  public Tabs addInitialHereTabsItem(InitialHere initialHereTabsItem) {
    this.initialHereTabs.add(initialHereTabsItem);
    return this;
  }

   /**
   * Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.
   * @return initialHereTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.")
  public java.util.List<InitialHere> getInitialHereTabs() {
    return initialHereTabs;
  }

  public void setInitialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
  }

  public Tabs lastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
    return this;
  }

  public Tabs addLastNameTabsItem(LastName lastNameTabsItem) {
    this.lastNameTabs.add(lastNameTabsItem);
    return this;
  }

   /**
   * Specifies a tag on a document where you want the recipient's last name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.
   * @return lastNameTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on a document where you want the recipient's last name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.")
  public java.util.List<LastName> getLastNameTabs() {
    return lastNameTabs;
  }

  public void setLastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
  }

  public Tabs listTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
    return this;
  }

  public Tabs addListTabsItem(List listTabsItem) {
    this.listTabs.add(listTabsItem);
    return this;
  }

   /**
   * Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.
   * @return listTabs
  **/
  @ApiModelProperty(example = "null", value = "Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.")
  public java.util.List<List> getListTabs() {
    return listTabs;
  }

  public void setListTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
  }

  public Tabs notarizeTabs(java.util.List<Notarize> notarizeTabs) {
    this.notarizeTabs = notarizeTabs;
    return this;
  }

  public Tabs addNotarizeTabsItem(Notarize notarizeTabsItem) {
    this.notarizeTabs.add(notarizeTabsItem);
    return this;
  }

   /**
   * 
   * @return notarizeTabs
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Notarize> getNotarizeTabs() {
    return notarizeTabs;
  }

  public void setNotarizeTabs(java.util.List<Notarize> notarizeTabs) {
    this.notarizeTabs = notarizeTabs;
  }

  public Tabs noteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
    return this;
  }

  public Tabs addNoteTabsItem(Note noteTabsItem) {
    this.noteTabs.add(noteTabsItem);
    return this;
  }

   /**
   * Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.
   * @return noteTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.")
  public java.util.List<Note> getNoteTabs() {
    return noteTabs;
  }

  public void setNoteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
  }

  public Tabs numberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
    return this;
  }

  public Tabs addNumberTabsItem(Number numberTabsItem) {
    this.numberTabs.add(numberTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. 
   * @return numberTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. ")
  public java.util.List<Number> getNumberTabs() {
    return numberTabs;
  }

  public void setNumberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
  }

  public Tabs radioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
    return this;
  }

  public Tabs addRadioGroupTabsItem(RadioGroup radioGroupTabsItem) {
    this.radioGroupTabs.add(radioGroupTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.
   * @return radioGroupTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
  public java.util.List<RadioGroup> getRadioGroupTabs() {
    return radioGroupTabs;
  }

  public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
  }

  public Tabs signerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
    return this;
  }

  public Tabs addSignerAttachmentTabsItem(SignerAttachment signerAttachmentTabsItem) {
    this.signerAttachmentTabs.add(signerAttachmentTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.
   * @return signerAttachmentTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.")
  public java.util.List<SignerAttachment> getSignerAttachmentTabs() {
    return signerAttachmentTabs;
  }

  public void setSignerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
  }

  public Tabs signHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
    return this;
  }

  public Tabs addSignHereTabsItem(SignHere signHereTabsItem) {
    this.signHereTabs.add(signHereTabsItem);
    return this;
  }

   /**
   * A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional. 
   * @return signHereTabs
  **/
  @ApiModelProperty(example = "null", value = "A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional. ")
  public java.util.List<SignHere> getSignHereTabs() {
    return signHereTabs;
  }

  public void setSignHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }

  public Tabs smartSectionTabs(java.util.List<SmartSection> smartSectionTabs) {
    this.smartSectionTabs = smartSectionTabs;
    return this;
  }

  public Tabs addSmartSectionTabsItem(SmartSection smartSectionTabsItem) {
    this.smartSectionTabs.add(smartSectionTabsItem);
    return this;
  }

   /**
   * 
   * @return smartSectionTabs
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<SmartSection> getSmartSectionTabs() {
    return smartSectionTabs;
  }

  public void setSmartSectionTabs(java.util.List<SmartSection> smartSectionTabs) {
    this.smartSectionTabs = smartSectionTabs;
  }

  public Tabs ssnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
    return this;
  }

  public Tabs addSsnTabsItem(Ssn ssnTabsItem) {
    this.ssnTabs.add(ssnTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return ssnTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Ssn> getSsnTabs() {
    return ssnTabs;
  }

  public void setSsnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
  }

  public Tabs textTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
    return this;
  }

  public Tabs addTextTabsItem(Text textTabsItem) {
    this.textTabs.add(textTabsItem);
    return this;
  }

   /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return textTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Text> getTextTabs() {
    return textTabs;
  }

  public void setTextTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
  }

  public Tabs titleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
    return this;
  }

  public Tabs addTitleTabsItem(Title titleTabsItem) {
    this.titleTabs.add(titleTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient's title to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return titleTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient's title to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Title> getTitleTabs() {
    return titleTabs;
  }

  public void setTitleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
  }

  public Tabs viewTabs(java.util.List<View> viewTabs) {
    this.viewTabs = viewTabs;
    return this;
  }

  public Tabs addViewTabsItem(View viewTabsItem) {
    this.viewTabs.add(viewTabsItem);
    return this;
  }

   /**
   * 
   * @return viewTabs
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<View> getViewTabs() {
    return viewTabs;
  }

  public void setViewTabs(java.util.List<View> viewTabs) {
    this.viewTabs = viewTabs;
  }

  public Tabs zipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
    return this;
  }

  public Tabs addZipTabsItem(Zip zipTabsItem) {
    this.zipTabs.add(zipTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return zipTabs
  **/
  @ApiModelProperty(example = "null", value = "Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Zip> getZipTabs() {
    return zipTabs;
  }

  public void setZipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tabs tabs = (Tabs) o;
    return Objects.equals(this.approveTabs, tabs.approveTabs) &&
        Objects.equals(this.checkboxTabs, tabs.checkboxTabs) &&
        Objects.equals(this.companyTabs, tabs.companyTabs) &&
        Objects.equals(this.dateSignedTabs, tabs.dateSignedTabs) &&
        Objects.equals(this.dateTabs, tabs.dateTabs) &&
        Objects.equals(this.declineTabs, tabs.declineTabs) &&
        Objects.equals(this.emailAddressTabs, tabs.emailAddressTabs) &&
        Objects.equals(this.emailTabs, tabs.emailTabs) &&
        Objects.equals(this.envelopeIdTabs, tabs.envelopeIdTabs) &&
        Objects.equals(this.firstNameTabs, tabs.firstNameTabs) &&
        Objects.equals(this.formulaTabs, tabs.formulaTabs) &&
        Objects.equals(this.fullNameTabs, tabs.fullNameTabs) &&
        Objects.equals(this.initialHereTabs, tabs.initialHereTabs) &&
        Objects.equals(this.lastNameTabs, tabs.lastNameTabs) &&
        Objects.equals(this.listTabs, tabs.listTabs) &&
        Objects.equals(this.notarizeTabs, tabs.notarizeTabs) &&
        Objects.equals(this.noteTabs, tabs.noteTabs) &&
        Objects.equals(this.numberTabs, tabs.numberTabs) &&
        Objects.equals(this.radioGroupTabs, tabs.radioGroupTabs) &&
        Objects.equals(this.signerAttachmentTabs, tabs.signerAttachmentTabs) &&
        Objects.equals(this.signHereTabs, tabs.signHereTabs) &&
        Objects.equals(this.smartSectionTabs, tabs.smartSectionTabs) &&
        Objects.equals(this.ssnTabs, tabs.ssnTabs) &&
        Objects.equals(this.textTabs, tabs.textTabs) &&
        Objects.equals(this.titleTabs, tabs.titleTabs) &&
        Objects.equals(this.viewTabs, tabs.viewTabs) &&
        Objects.equals(this.zipTabs, tabs.zipTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approveTabs, checkboxTabs, companyTabs, dateSignedTabs, dateTabs, declineTabs, emailAddressTabs, emailTabs, envelopeIdTabs, firstNameTabs, formulaTabs, fullNameTabs, initialHereTabs, lastNameTabs, listTabs, notarizeTabs, noteTabs, numberTabs, radioGroupTabs, signerAttachmentTabs, signHereTabs, smartSectionTabs, ssnTabs, textTabs, titleTabs, viewTabs, zipTabs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tabs {\n");
    
    sb.append("    approveTabs: ").append(toIndentedString(approveTabs)).append("\n");
    sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
    sb.append("    companyTabs: ").append(toIndentedString(companyTabs)).append("\n");
    sb.append("    dateSignedTabs: ").append(toIndentedString(dateSignedTabs)).append("\n");
    sb.append("    dateTabs: ").append(toIndentedString(dateTabs)).append("\n");
    sb.append("    declineTabs: ").append(toIndentedString(declineTabs)).append("\n");
    sb.append("    emailAddressTabs: ").append(toIndentedString(emailAddressTabs)).append("\n");
    sb.append("    emailTabs: ").append(toIndentedString(emailTabs)).append("\n");
    sb.append("    envelopeIdTabs: ").append(toIndentedString(envelopeIdTabs)).append("\n");
    sb.append("    firstNameTabs: ").append(toIndentedString(firstNameTabs)).append("\n");
    sb.append("    formulaTabs: ").append(toIndentedString(formulaTabs)).append("\n");
    sb.append("    fullNameTabs: ").append(toIndentedString(fullNameTabs)).append("\n");
    sb.append("    initialHereTabs: ").append(toIndentedString(initialHereTabs)).append("\n");
    sb.append("    lastNameTabs: ").append(toIndentedString(lastNameTabs)).append("\n");
    sb.append("    listTabs: ").append(toIndentedString(listTabs)).append("\n");
    sb.append("    notarizeTabs: ").append(toIndentedString(notarizeTabs)).append("\n");
    sb.append("    noteTabs: ").append(toIndentedString(noteTabs)).append("\n");
    sb.append("    numberTabs: ").append(toIndentedString(numberTabs)).append("\n");
    sb.append("    radioGroupTabs: ").append(toIndentedString(radioGroupTabs)).append("\n");
    sb.append("    signerAttachmentTabs: ").append(toIndentedString(signerAttachmentTabs)).append("\n");
    sb.append("    signHereTabs: ").append(toIndentedString(signHereTabs)).append("\n");
    sb.append("    smartSectionTabs: ").append(toIndentedString(smartSectionTabs)).append("\n");
    sb.append("    ssnTabs: ").append(toIndentedString(ssnTabs)).append("\n");
    sb.append("    textTabs: ").append(toIndentedString(textTabs)).append("\n");
    sb.append("    titleTabs: ").append(toIndentedString(titleTabs)).append("\n");
    sb.append("    viewTabs: ").append(toIndentedString(viewTabs)).append("\n");
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

