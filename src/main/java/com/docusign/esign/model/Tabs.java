package com.docusign.esign.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tabs.
 *
 */

public class Tabs {
  @JsonProperty("approveTabs")
  private java.util.List<Approve> approveTabs = null;

  @JsonProperty("checkboxTabs")
  private java.util.List<Checkbox> checkboxTabs = null;

  @JsonProperty("commentThreadTabs")
  private java.util.List<CommentThread> commentThreadTabs = null;

  @JsonProperty("commissionCountyTabs")
  private java.util.List<CommissionCounty> commissionCountyTabs = null;

  @JsonProperty("commissionExpirationTabs")
  private java.util.List<CommissionExpiration> commissionExpirationTabs = null;

  @JsonProperty("commissionNumberTabs")
  private java.util.List<CommissionNumber> commissionNumberTabs = null;

  @JsonProperty("commissionStateTabs")
  private java.util.List<CommissionState> commissionStateTabs = null;

  @JsonProperty("companyTabs")
  private java.util.List<Company> companyTabs = null;

  @JsonProperty("currencyTabs")
  private java.util.List<Currency> currencyTabs = null;

  @JsonProperty("dateSignedTabs")
  private java.util.List<DateSigned> dateSignedTabs = null;

  @JsonProperty("dateTabs")
  private java.util.List<com.docusign.esign.model.Date> dateTabs = null;

  @JsonProperty("declineTabs")
  private java.util.List<Decline> declineTabs = null;

  @JsonProperty("drawTabs")
  private java.util.List<Draw> drawTabs = null;

  @JsonProperty("emailAddressTabs")
  private java.util.List<EmailAddress> emailAddressTabs = null;

  @JsonProperty("emailTabs")
  private java.util.List<Email> emailTabs = null;

  @JsonProperty("envelopeIdTabs")
  private java.util.List<EnvelopeId> envelopeIdTabs = null;

  @JsonProperty("firstNameTabs")
  private java.util.List<FirstName> firstNameTabs = null;

  @JsonProperty("formulaTabs")
  private java.util.List<FormulaTab> formulaTabs = null;

  @JsonProperty("fullNameTabs")
  private java.util.List<FullName> fullNameTabs = null;

  @JsonProperty("initialHereTabs")
  private java.util.List<InitialHere> initialHereTabs = null;

  @JsonProperty("lastNameTabs")
  private java.util.List<LastName> lastNameTabs = null;

  @JsonProperty("listTabs")
  private java.util.List<List> listTabs = null;

  @JsonProperty("notarizeTabs")
  private java.util.List<Notarize> notarizeTabs = null;

  @JsonProperty("notarySealTabs")
  private java.util.List<NotarySeal> notarySealTabs = null;

  @JsonProperty("noteTabs")
  private java.util.List<Note> noteTabs = null;

  @JsonProperty("numberTabs")
  private java.util.List<Number> numberTabs = null;

  @JsonProperty("phoneNumberTabs")
  private java.util.List<PhoneNumber> phoneNumberTabs = null;

  @JsonProperty("polyLineOverlayTabs")
  private java.util.List<PolyLineOverlay> polyLineOverlayTabs = null;

  @JsonProperty("prefillTabs")
  private PrefillTabs prefillTabs = null;

  @JsonProperty("radioGroupTabs")
  private java.util.List<RadioGroup> radioGroupTabs = null;

  @JsonProperty("signerAttachmentTabs")
  private java.util.List<SignerAttachment> signerAttachmentTabs = null;

  @JsonProperty("signHereTabs")
  private java.util.List<SignHere> signHereTabs = null;

  @JsonProperty("smartSectionTabs")
  private java.util.List<SmartSection> smartSectionTabs = null;

  @JsonProperty("ssnTabs")
  private java.util.List<Ssn> ssnTabs = null;

  @JsonProperty("tabGroups")
  private java.util.List<TabGroup> tabGroups = null;

  @JsonProperty("textTabs")
  private java.util.List<Text> textTabs = null;

  @JsonProperty("titleTabs")
  private java.util.List<Title> titleTabs = null;

  @JsonProperty("viewTabs")
  private java.util.List<View> viewTabs = null;

  @JsonProperty("zipTabs")
  private java.util.List<Zip> zipTabs = null;


  /**
   * approveTabs.
   *
   * @return Tabs
   **/
  public Tabs approveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
    return this;
  }

  /**
   * addApproveTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addApproveTabsItem(Approve approveTabsItem) {
    if (this.approveTabs == null) {
      this.approveTabs = new java.util.ArrayList<Approve>();
    }
    this.approveTabs.add(approveTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history..
   * @return approveTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.")
  public java.util.List<Approve> getApproveTabs() {
    return approveTabs;
  }

  /**
   * setApproveTabs.
   **/
  public void setApproveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
  }


  /**
   * checkboxTabs.
   *
   * @return Tabs
   **/
  public Tabs checkboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
    return this;
  }

  /**
   * addCheckboxTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCheckboxTabsItem(Checkbox checkboxTabsItem) {
    if (this.checkboxTabs == null) {
      this.checkboxTabs = new java.util.ArrayList<Checkbox>();
    }
    this.checkboxTabs.add(checkboxTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document in a location where the recipient can select an option..
   * @return checkboxTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select an option.")
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
   * commentThreadTabs.
   *
   * @return Tabs
   **/
  public Tabs commentThreadTabs(java.util.List<CommentThread> commentThreadTabs) {
    this.commentThreadTabs = commentThreadTabs;
    return this;
  }

  /**
   * addCommentThreadTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCommentThreadTabsItem(CommentThread commentThreadTabsItem) {
    if (this.commentThreadTabs == null) {
      this.commentThreadTabs = new java.util.ArrayList<CommentThread>();
    }
    this.commentThreadTabs.add(commentThreadTabsItem);
    return this;
  }

  /**
   * .
   * @return commentThreadTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<CommentThread> getCommentThreadTabs() {
    return commentThreadTabs;
  }

  /**
   * setCommentThreadTabs.
   **/
  public void setCommentThreadTabs(java.util.List<CommentThread> commentThreadTabs) {
    this.commentThreadTabs = commentThreadTabs;
  }


  /**
   * commissionCountyTabs.
   *
   * @return Tabs
   **/
  public Tabs commissionCountyTabs(java.util.List<CommissionCounty> commissionCountyTabs) {
    this.commissionCountyTabs = commissionCountyTabs;
    return this;
  }

  /**
   * addCommissionCountyTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCommissionCountyTabsItem(CommissionCounty commissionCountyTabsItem) {
    if (this.commissionCountyTabs == null) {
      this.commissionCountyTabs = new java.util.ArrayList<CommissionCounty>();
    }
    this.commissionCountyTabs.add(commissionCountyTabsItem);
    return this;
  }

  /**
   * .
   * @return commissionCountyTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionCounty> getCommissionCountyTabs() {
    return commissionCountyTabs;
  }

  /**
   * setCommissionCountyTabs.
   **/
  public void setCommissionCountyTabs(java.util.List<CommissionCounty> commissionCountyTabs) {
    this.commissionCountyTabs = commissionCountyTabs;
  }


  /**
   * commissionExpirationTabs.
   *
   * @return Tabs
   **/
  public Tabs commissionExpirationTabs(java.util.List<CommissionExpiration> commissionExpirationTabs) {
    this.commissionExpirationTabs = commissionExpirationTabs;
    return this;
  }

  /**
   * addCommissionExpirationTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCommissionExpirationTabsItem(CommissionExpiration commissionExpirationTabsItem) {
    if (this.commissionExpirationTabs == null) {
      this.commissionExpirationTabs = new java.util.ArrayList<CommissionExpiration>();
    }
    this.commissionExpirationTabs.add(commissionExpirationTabsItem);
    return this;
  }

  /**
   * .
   * @return commissionExpirationTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionExpiration> getCommissionExpirationTabs() {
    return commissionExpirationTabs;
  }

  /**
   * setCommissionExpirationTabs.
   **/
  public void setCommissionExpirationTabs(java.util.List<CommissionExpiration> commissionExpirationTabs) {
    this.commissionExpirationTabs = commissionExpirationTabs;
  }


  /**
   * commissionNumberTabs.
   *
   * @return Tabs
   **/
  public Tabs commissionNumberTabs(java.util.List<CommissionNumber> commissionNumberTabs) {
    this.commissionNumberTabs = commissionNumberTabs;
    return this;
  }

  /**
   * addCommissionNumberTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCommissionNumberTabsItem(CommissionNumber commissionNumberTabsItem) {
    if (this.commissionNumberTabs == null) {
      this.commissionNumberTabs = new java.util.ArrayList<CommissionNumber>();
    }
    this.commissionNumberTabs.add(commissionNumberTabsItem);
    return this;
  }

  /**
   * .
   * @return commissionNumberTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionNumber> getCommissionNumberTabs() {
    return commissionNumberTabs;
  }

  /**
   * setCommissionNumberTabs.
   **/
  public void setCommissionNumberTabs(java.util.List<CommissionNumber> commissionNumberTabs) {
    this.commissionNumberTabs = commissionNumberTabs;
  }


  /**
   * commissionStateTabs.
   *
   * @return Tabs
   **/
  public Tabs commissionStateTabs(java.util.List<CommissionState> commissionStateTabs) {
    this.commissionStateTabs = commissionStateTabs;
    return this;
  }

  /**
   * addCommissionStateTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCommissionStateTabsItem(CommissionState commissionStateTabsItem) {
    if (this.commissionStateTabs == null) {
      this.commissionStateTabs = new java.util.ArrayList<CommissionState>();
    }
    this.commissionStateTabs.add(commissionStateTabsItem);
    return this;
  }

  /**
   * .
   * @return commissionStateTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionState> getCommissionStateTabs() {
    return commissionStateTabs;
  }

  /**
   * setCommissionStateTabs.
   **/
  public void setCommissionStateTabs(java.util.List<CommissionState> commissionStateTabs) {
    this.commissionStateTabs = commissionStateTabs;
  }


  /**
   * companyTabs.
   *
   * @return Tabs
   **/
  public Tabs companyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
    return this;
  }

  /**
   * addCompanyTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCompanyTabsItem(Company companyTabsItem) {
    if (this.companyTabs == null) {
      this.companyTabs = new java.util.ArrayList<Company>();
    }
    this.companyTabs.add(companyTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient's company name to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return companyTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's company name to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Company> getCompanyTabs() {
    return companyTabs;
  }

  /**
   * setCompanyTabs.
   **/
  public void setCompanyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
  }


  /**
   * currencyTabs.
   *
   * @return Tabs
   **/
  public Tabs currencyTabs(java.util.List<Currency> currencyTabs) {
    this.currencyTabs = currencyTabs;
    return this;
  }

  /**
   * addCurrencyTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addCurrencyTabsItem(Currency currencyTabsItem) {
    if (this.currencyTabs == null) {
      this.currencyTabs = new java.util.ArrayList<Currency>();
    }
    this.currencyTabs.add(currencyTabsItem);
    return this;
  }

  /**
   * .
   * @return currencyTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Currency> getCurrencyTabs() {
    return currencyTabs;
  }

  /**
   * setCurrencyTabs.
   **/
  public void setCurrencyTabs(java.util.List<Currency> currencyTabs) {
    this.currencyTabs = currencyTabs;
  }


  /**
   * dateSignedTabs.
   *
   * @return Tabs
   **/
  public Tabs dateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
    return this;
  }

  /**
   * addDateSignedTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addDateSignedTabsItem(DateSigned dateSignedTabsItem) {
    if (this.dateSignedTabs == null) {
      this.dateSignedTabs = new java.util.ArrayList<DateSigned>();
    }
    this.dateSignedTabs.add(dateSignedTabsItem);
    return this;
  }

  /**
   * Specifies a tab on the document where the date the document was signed will automatically appear..
   * @return dateSignedTabs
   **/
  @ApiModelProperty(value = "Specifies a tab on the document where the date the document was signed will automatically appear.")
  public java.util.List<DateSigned> getDateSignedTabs() {
    return dateSignedTabs;
  }

  /**
   * setDateSignedTabs.
   **/
  public void setDateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
  }


  /**
   * dateTabs.
   *
   * @return Tabs
   **/
  public Tabs dateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
    return this;
  }

  /**
   * addDateTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addDateTabsItem(com.docusign.esign.model.Date dateTabsItem) {
    if (this.dateTabs == null) {
      this.dateTabs = new java.util.ArrayList<com.docusign.esign.model.Date>();
    }
    this.dateTabs.add(dateTabsItem);
    return this;
  }

  /**
   * Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format..
   * @return dateTabs
   **/
  @ApiModelProperty(value = "Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.")
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
   * declineTabs.
   *
   * @return Tabs
   **/
  public Tabs declineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
    return this;
  }

  /**
   * addDeclineTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addDeclineTabsItem(Decline declineTabsItem) {
    if (this.declineTabs == null) {
      this.declineTabs = new java.util.ArrayList<Decline>();
    }
    this.declineTabs.add(declineTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided..
   * @return declineTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.")
  public java.util.List<Decline> getDeclineTabs() {
    return declineTabs;
  }

  /**
   * setDeclineTabs.
   **/
  public void setDeclineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
  }


  /**
   * drawTabs.
   *
   * @return Tabs
   **/
  public Tabs drawTabs(java.util.List<Draw> drawTabs) {
    this.drawTabs = drawTabs;
    return this;
  }

  /**
   * addDrawTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addDrawTabsItem(Draw drawTabsItem) {
    if (this.drawTabs == null) {
      this.drawTabs = new java.util.ArrayList<Draw>();
    }
    this.drawTabs.add(drawTabsItem);
    return this;
  }

  /**
   * .
   * @return drawTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Draw> getDrawTabs() {
    return drawTabs;
  }

  /**
   * setDrawTabs.
   **/
  public void setDrawTabs(java.util.List<Draw> drawTabs) {
    this.drawTabs = drawTabs;
  }


  /**
   * emailAddressTabs.
   *
   * @return Tabs
   **/
  public Tabs emailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
    return this;
  }

  /**
   * addEmailAddressTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addEmailAddressTabsItem(EmailAddress emailAddressTabsItem) {
    if (this.emailAddressTabs == null) {
      this.emailAddressTabs = new java.util.ArrayList<EmailAddress>();
    }
    this.emailAddressTabs.add(emailAddressTabsItem);
    return this;
  }

  /**
   * Specifies a location on the document where you want where you want the recipient's email, as entered in the recipient information, to display..
   * @return emailAddressTabs
   **/
  @ApiModelProperty(value = "Specifies a location on the document where you want where you want the recipient's email, as entered in the recipient information, to display.")
  public java.util.List<EmailAddress> getEmailAddressTabs() {
    return emailAddressTabs;
  }

  /**
   * setEmailAddressTabs.
   **/
  public void setEmailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
  }


  /**
   * emailTabs.
   *
   * @return Tabs
   **/
  public Tabs emailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
    return this;
  }

  /**
   * addEmailTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addEmailTabsItem(Email emailTabsItem) {
    if (this.emailTabs == null) {
      this.emailTabs = new java.util.ArrayList<Email>();
    }
    this.emailTabs.add(emailTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return emailTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
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
   * envelopeIdTabs.
   *
   * @return Tabs
   **/
  public Tabs envelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
    return this;
  }

  /**
   * addEnvelopeIdTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addEnvelopeIdTabsItem(EnvelopeId envelopeIdTabsItem) {
    if (this.envelopeIdTabs == null) {
      this.envelopeIdTabs = new java.util.ArrayList<EnvelopeId>();
    }
    this.envelopeIdTabs.add(envelopeIdTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only..
   * @return envelopeIdTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.")
  public java.util.List<EnvelopeId> getEnvelopeIdTabs() {
    return envelopeIdTabs;
  }

  /**
   * setEnvelopeIdTabs.
   **/
  public void setEnvelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
  }


  /**
   * firstNameTabs.
   *
   * @return Tabs
   **/
  public Tabs firstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
    return this;
  }

  /**
   * addFirstNameTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addFirstNameTabsItem(FirstName firstNameTabsItem) {
    if (this.firstNameTabs == null) {
      this.firstNameTabs = new java.util.ArrayList<FirstName>();
    }
    this.firstNameTabs.add(firstNameTabsItem);
    return this;
  }

  /**
   * Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name..
   * @return firstNameTabs
   **/
  @ApiModelProperty(value = "Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.")
  public java.util.List<FirstName> getFirstNameTabs() {
    return firstNameTabs;
  }

  /**
   * setFirstNameTabs.
   **/
  public void setFirstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
  }


  /**
   * formulaTabs.
   *
   * @return Tabs
   **/
  public Tabs formulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
    return this;
  }

  /**
   * addFormulaTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addFormulaTabsItem(FormulaTab formulaTabsItem) {
    if (this.formulaTabs == null) {
      this.formulaTabs = new java.util.ArrayList<FormulaTab>();
    }
    this.formulaTabs.add(formulaTabsItem);
    return this;
  }

  /**
   * Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas..
   * @return formulaTabs
   **/
  @ApiModelProperty(value = "Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.")
  public java.util.List<FormulaTab> getFormulaTabs() {
    return formulaTabs;
  }

  /**
   * setFormulaTabs.
   **/
  public void setFormulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
  }


  /**
   * fullNameTabs.
   *
   * @return Tabs
   **/
  public Tabs fullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
    return this;
  }

  /**
   * addFullNameTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addFullNameTabsItem(FullName fullNameTabsItem) {
    if (this.fullNameTabs == null) {
      this.fullNameTabs = new java.util.ArrayList<FullName>();
    }
    this.fullNameTabs.add(fullNameTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient's name to appear..
   * @return fullNameTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's name to appear.")
  public java.util.List<FullName> getFullNameTabs() {
    return fullNameTabs;
  }

  /**
   * setFullNameTabs.
   **/
  public void setFullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
  }


  /**
   * initialHereTabs.
   *
   * @return Tabs
   **/
  public Tabs initialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
    return this;
  }

  /**
   * addInitialHereTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addInitialHereTabsItem(InitialHere initialHereTabsItem) {
    if (this.initialHereTabs == null) {
      this.initialHereTabs = new java.util.ArrayList<InitialHere>();
    }
    this.initialHereTabs.add(initialHereTabsItem);
    return this;
  }

  /**
   * Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional..
   * @return initialHereTabs
   **/
  @ApiModelProperty(value = "Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.")
  public java.util.List<InitialHere> getInitialHereTabs() {
    return initialHereTabs;
  }

  /**
   * setInitialHereTabs.
   **/
  public void setInitialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
  }


  /**
   * lastNameTabs.
   *
   * @return Tabs
   **/
  public Tabs lastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
    return this;
  }

  /**
   * addLastNameTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addLastNameTabsItem(LastName lastNameTabsItem) {
    if (this.lastNameTabs == null) {
      this.lastNameTabs = new java.util.ArrayList<LastName>();
    }
    this.lastNameTabs.add(lastNameTabsItem);
    return this;
  }

  /**
   * Specifies a tag on a document where you want the recipient's last name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name..
   * @return lastNameTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on a document where you want the recipient's last name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.")
  public java.util.List<LastName> getLastNameTabs() {
    return lastNameTabs;
  }

  /**
   * setLastNameTabs.
   **/
  public void setLastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
  }


  /**
   * listTabs.
   *
   * @return Tabs
   **/
  public Tabs listTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
    return this;
  }

  /**
   * addListTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addListTabsItem(List listTabsItem) {
    if (this.listTabs == null) {
      this.listTabs = new java.util.ArrayList<List>();
    }
    this.listTabs.add(listTabsItem);
    return this;
  }

  /**
   * Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select..
   * @return listTabs
   **/
  @ApiModelProperty(value = "Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.")
  public java.util.List<List> getListTabs() {
    return listTabs;
  }

  /**
   * setListTabs.
   **/
  public void setListTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
  }


  /**
   * notarizeTabs.
   *
   * @return Tabs
   **/
  public Tabs notarizeTabs(java.util.List<Notarize> notarizeTabs) {
    this.notarizeTabs = notarizeTabs;
    return this;
  }

  /**
   * addNotarizeTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addNotarizeTabsItem(Notarize notarizeTabsItem) {
    if (this.notarizeTabs == null) {
      this.notarizeTabs = new java.util.ArrayList<Notarize>();
    }
    this.notarizeTabs.add(notarizeTabsItem);
    return this;
  }

  /**
   * .
   * @return notarizeTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Notarize> getNotarizeTabs() {
    return notarizeTabs;
  }

  /**
   * setNotarizeTabs.
   **/
  public void setNotarizeTabs(java.util.List<Notarize> notarizeTabs) {
    this.notarizeTabs = notarizeTabs;
  }


  /**
   * notarySealTabs.
   *
   * @return Tabs
   **/
  public Tabs notarySealTabs(java.util.List<NotarySeal> notarySealTabs) {
    this.notarySealTabs = notarySealTabs;
    return this;
  }

  /**
   * addNotarySealTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addNotarySealTabsItem(NotarySeal notarySealTabsItem) {
    if (this.notarySealTabs == null) {
      this.notarySealTabs = new java.util.ArrayList<NotarySeal>();
    }
    this.notarySealTabs.add(notarySealTabsItem);
    return this;
  }

  /**
   * .
   * @return notarySealTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<NotarySeal> getNotarySealTabs() {
    return notarySealTabs;
  }

  /**
   * setNotarySealTabs.
   **/
  public void setNotarySealTabs(java.util.List<NotarySeal> notarySealTabs) {
    this.notarySealTabs = notarySealTabs;
  }


  /**
   * noteTabs.
   *
   * @return Tabs
   **/
  public Tabs noteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
    return this;
  }

  /**
   * addNoteTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addNoteTabsItem(Note noteTabsItem) {
    if (this.noteTabs == null) {
      this.noteTabs = new java.util.ArrayList<Note>();
    }
    this.noteTabs.add(noteTabsItem);
    return this;
  }

  /**
   * Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient..
   * @return noteTabs
   **/
  @ApiModelProperty(value = "Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.")
  public java.util.List<Note> getNoteTabs() {
    return noteTabs;
  }

  /**
   * setNoteTabs.
   **/
  public void setNoteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
  }


  /**
   * numberTabs.
   *
   * @return Tabs
   **/
  public Tabs numberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
    return this;
  }

  /**
   * addNumberTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addNumberTabsItem(Number numberTabsItem) {
    if (this.numberTabs == null) {
      this.numberTabs = new java.util.ArrayList<Number>();
    }
    this.numberTabs.add(numberTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. .
   * @return numberTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. ")
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
   * phoneNumberTabs.
   *
   * @return Tabs
   **/
  public Tabs phoneNumberTabs(java.util.List<PhoneNumber> phoneNumberTabs) {
    this.phoneNumberTabs = phoneNumberTabs;
    return this;
  }

  /**
   * addPhoneNumberTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addPhoneNumberTabsItem(PhoneNumber phoneNumberTabsItem) {
    if (this.phoneNumberTabs == null) {
      this.phoneNumberTabs = new java.util.ArrayList<PhoneNumber>();
    }
    this.phoneNumberTabs.add(phoneNumberTabsItem);
    return this;
  }

  /**
   * .
   * @return phoneNumberTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<PhoneNumber> getPhoneNumberTabs() {
    return phoneNumberTabs;
  }

  /**
   * setPhoneNumberTabs.
   **/
  public void setPhoneNumberTabs(java.util.List<PhoneNumber> phoneNumberTabs) {
    this.phoneNumberTabs = phoneNumberTabs;
  }


  /**
   * polyLineOverlayTabs.
   *
   * @return Tabs
   **/
  public Tabs polyLineOverlayTabs(java.util.List<PolyLineOverlay> polyLineOverlayTabs) {
    this.polyLineOverlayTabs = polyLineOverlayTabs;
    return this;
  }

  /**
   * addPolyLineOverlayTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addPolyLineOverlayTabsItem(PolyLineOverlay polyLineOverlayTabsItem) {
    if (this.polyLineOverlayTabs == null) {
      this.polyLineOverlayTabs = new java.util.ArrayList<PolyLineOverlay>();
    }
    this.polyLineOverlayTabs.add(polyLineOverlayTabsItem);
    return this;
  }

  /**
   * .
   * @return polyLineOverlayTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<PolyLineOverlay> getPolyLineOverlayTabs() {
    return polyLineOverlayTabs;
  }

  /**
   * setPolyLineOverlayTabs.
   **/
  public void setPolyLineOverlayTabs(java.util.List<PolyLineOverlay> polyLineOverlayTabs) {
    this.polyLineOverlayTabs = polyLineOverlayTabs;
  }


  /**
   * prefillTabs.
   *
   * @return Tabs
   **/
  public Tabs prefillTabs(PrefillTabs prefillTabs) {
    this.prefillTabs = prefillTabs;
    return this;
  }

  /**
   * Get prefillTabs.
   * @return prefillTabs
   **/
  @ApiModelProperty(value = "")
  public PrefillTabs getPrefillTabs() {
    return prefillTabs;
  }

  /**
   * setPrefillTabs.
   **/
  public void setPrefillTabs(PrefillTabs prefillTabs) {
    this.prefillTabs = prefillTabs;
  }


  /**
   * radioGroupTabs.
   *
   * @return Tabs
   **/
  public Tabs radioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
    return this;
  }

  /**
   * addRadioGroupTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addRadioGroupTabsItem(RadioGroup radioGroupTabsItem) {
    if (this.radioGroupTabs == null) {
      this.radioGroupTabs = new java.util.ArrayList<RadioGroup>();
    }
    this.radioGroupTabs.add(radioGroupTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document..
   * @return radioGroupTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
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
   * signerAttachmentTabs.
   *
   * @return Tabs
   **/
  public Tabs signerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
    return this;
  }

  /**
   * addSignerAttachmentTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addSignerAttachmentTabsItem(SignerAttachment signerAttachmentTabsItem) {
    if (this.signerAttachmentTabs == null) {
      this.signerAttachmentTabs = new java.util.ArrayList<SignerAttachment>();
    }
    this.signerAttachmentTabs.add(signerAttachmentTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document when you want the recipient to add supporting documents to an envelope..
   * @return signerAttachmentTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.")
  public java.util.List<SignerAttachment> getSignerAttachmentTabs() {
    return signerAttachmentTabs;
  }

  /**
   * setSignerAttachmentTabs.
   **/
  public void setSignerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
  }


  /**
   * signHereTabs.
   *
   * @return Tabs
   **/
  public Tabs signHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
    return this;
  }

  /**
   * addSignHereTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addSignHereTabsItem(SignHere signHereTabsItem) {
    if (this.signHereTabs == null) {
      this.signHereTabs = new java.util.ArrayList<SignHere>();
    }
    this.signHereTabs.add(signHereTabsItem);
    return this;
  }

  /**
   * A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional. .
   * @return signHereTabs
   **/
  @ApiModelProperty(value = "A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional. ")
  public java.util.List<SignHere> getSignHereTabs() {
    return signHereTabs;
  }

  /**
   * setSignHereTabs.
   **/
  public void setSignHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }


  /**
   * smartSectionTabs.
   *
   * @return Tabs
   **/
  public Tabs smartSectionTabs(java.util.List<SmartSection> smartSectionTabs) {
    this.smartSectionTabs = smartSectionTabs;
    return this;
  }

  /**
   * addSmartSectionTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addSmartSectionTabsItem(SmartSection smartSectionTabsItem) {
    if (this.smartSectionTabs == null) {
      this.smartSectionTabs = new java.util.ArrayList<SmartSection>();
    }
    this.smartSectionTabs.add(smartSectionTabsItem);
    return this;
  }

  /**
   * .
   * @return smartSectionTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SmartSection> getSmartSectionTabs() {
    return smartSectionTabs;
  }

  /**
   * setSmartSectionTabs.
   **/
  public void setSmartSectionTabs(java.util.List<SmartSection> smartSectionTabs) {
    this.smartSectionTabs = smartSectionTabs;
  }


  /**
   * ssnTabs.
   *
   * @return Tabs
   **/
  public Tabs ssnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
    return this;
  }

  /**
   * addSsnTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addSsnTabsItem(Ssn ssnTabsItem) {
    if (this.ssnTabs == null) {
      this.ssnTabs = new java.util.ArrayList<Ssn>();
    }
    this.ssnTabs.add(ssnTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return ssnTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
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
   * @return Tabs
   **/
  public Tabs tabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
    return this;
  }

  /**
   * addTabGroupsItem.
   *
   * @return Tabs
   **/
  public Tabs addTabGroupsItem(TabGroup tabGroupsItem) {
    if (this.tabGroups == null) {
      this.tabGroups = new java.util.ArrayList<TabGroup>();
    }
    this.tabGroups.add(tabGroupsItem);
    return this;
  }

  /**
   * .
   * @return tabGroups
   **/
  @ApiModelProperty(value = "")
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
   * @return Tabs
   **/
  public Tabs textTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
    return this;
  }

  /**
   * addTextTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addTextTabsItem(Text textTabsItem) {
    if (this.textTabs == null) {
      this.textTabs = new java.util.ArrayList<Text>();
    }
    this.textTabs.add(textTabsItem);
    return this;
  }

  /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return textTabs
   **/
  @ApiModelProperty(value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
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
   * titleTabs.
   *
   * @return Tabs
   **/
  public Tabs titleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
    return this;
  }

  /**
   * addTitleTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addTitleTabsItem(Title titleTabsItem) {
    if (this.titleTabs == null) {
      this.titleTabs = new java.util.ArrayList<Title>();
    }
    this.titleTabs.add(titleTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient's title to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return titleTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's title to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Title> getTitleTabs() {
    return titleTabs;
  }

  /**
   * setTitleTabs.
   **/
  public void setTitleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
  }


  /**
   * viewTabs.
   *
   * @return Tabs
   **/
  public Tabs viewTabs(java.util.List<View> viewTabs) {
    this.viewTabs = viewTabs;
    return this;
  }

  /**
   * addViewTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addViewTabsItem(View viewTabsItem) {
    if (this.viewTabs == null) {
      this.viewTabs = new java.util.ArrayList<View>();
    }
    this.viewTabs.add(viewTabsItem);
    return this;
  }

  /**
   * .
   * @return viewTabs
   **/
  @ApiModelProperty(value = "")
  public java.util.List<View> getViewTabs() {
    return viewTabs;
  }

  /**
   * setViewTabs.
   **/
  public void setViewTabs(java.util.List<View> viewTabs) {
    this.viewTabs = viewTabs;
  }


  /**
   * zipTabs.
   *
   * @return Tabs
   **/
  public Tabs zipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
    return this;
  }

  /**
   * addZipTabsItem.
   *
   * @return Tabs
   **/
  public Tabs addZipTabsItem(Zip zipTabsItem) {
    if (this.zipTabs == null) {
      this.zipTabs = new java.util.ArrayList<Zip>();
    }
    this.zipTabs.add(zipTabsItem);
    return this;
  }

  /**
   * Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response..
   * @return zipTabs
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
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
    Tabs tabs = (Tabs) o;
    return Objects.equals(this.approveTabs, tabs.approveTabs) &&
        Objects.equals(this.checkboxTabs, tabs.checkboxTabs) &&
        Objects.equals(this.commentThreadTabs, tabs.commentThreadTabs) &&
        Objects.equals(this.commissionCountyTabs, tabs.commissionCountyTabs) &&
        Objects.equals(this.commissionExpirationTabs, tabs.commissionExpirationTabs) &&
        Objects.equals(this.commissionNumberTabs, tabs.commissionNumberTabs) &&
        Objects.equals(this.commissionStateTabs, tabs.commissionStateTabs) &&
        Objects.equals(this.companyTabs, tabs.companyTabs) &&
        Objects.equals(this.currencyTabs, tabs.currencyTabs) &&
        Objects.equals(this.dateSignedTabs, tabs.dateSignedTabs) &&
        Objects.equals(this.dateTabs, tabs.dateTabs) &&
        Objects.equals(this.declineTabs, tabs.declineTabs) &&
        Objects.equals(this.drawTabs, tabs.drawTabs) &&
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
        Objects.equals(this.notarySealTabs, tabs.notarySealTabs) &&
        Objects.equals(this.noteTabs, tabs.noteTabs) &&
        Objects.equals(this.numberTabs, tabs.numberTabs) &&
        Objects.equals(this.phoneNumberTabs, tabs.phoneNumberTabs) &&
        Objects.equals(this.polyLineOverlayTabs, tabs.polyLineOverlayTabs) &&
        Objects.equals(this.prefillTabs, tabs.prefillTabs) &&
        Objects.equals(this.radioGroupTabs, tabs.radioGroupTabs) &&
        Objects.equals(this.signerAttachmentTabs, tabs.signerAttachmentTabs) &&
        Objects.equals(this.signHereTabs, tabs.signHereTabs) &&
        Objects.equals(this.smartSectionTabs, tabs.smartSectionTabs) &&
        Objects.equals(this.ssnTabs, tabs.ssnTabs) &&
        Objects.equals(this.tabGroups, tabs.tabGroups) &&
        Objects.equals(this.textTabs, tabs.textTabs) &&
        Objects.equals(this.titleTabs, tabs.titleTabs) &&
        Objects.equals(this.viewTabs, tabs.viewTabs) &&
        Objects.equals(this.zipTabs, tabs.zipTabs);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(approveTabs, checkboxTabs, commentThreadTabs, commissionCountyTabs, commissionExpirationTabs, commissionNumberTabs, commissionStateTabs, companyTabs, currencyTabs, dateSignedTabs, dateTabs, declineTabs, drawTabs, emailAddressTabs, emailTabs, envelopeIdTabs, firstNameTabs, formulaTabs, fullNameTabs, initialHereTabs, lastNameTabs, listTabs, notarizeTabs, notarySealTabs, noteTabs, numberTabs, phoneNumberTabs, polyLineOverlayTabs, prefillTabs, radioGroupTabs, signerAttachmentTabs, signHereTabs, smartSectionTabs, ssnTabs, tabGroups, textTabs, titleTabs, viewTabs, zipTabs);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tabs {\n");

    sb.append("    approveTabs: ").append(toIndentedString(approveTabs)).append("\n");
    sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
    sb.append("    commentThreadTabs: ").append(toIndentedString(commentThreadTabs)).append("\n");
    sb.append("    commissionCountyTabs: ").append(toIndentedString(commissionCountyTabs)).append("\n");
    sb.append("    commissionExpirationTabs: ").append(toIndentedString(commissionExpirationTabs)).append("\n");
    sb.append("    commissionNumberTabs: ").append(toIndentedString(commissionNumberTabs)).append("\n");
    sb.append("    commissionStateTabs: ").append(toIndentedString(commissionStateTabs)).append("\n");
    sb.append("    companyTabs: ").append(toIndentedString(companyTabs)).append("\n");
    sb.append("    currencyTabs: ").append(toIndentedString(currencyTabs)).append("\n");
    sb.append("    dateSignedTabs: ").append(toIndentedString(dateSignedTabs)).append("\n");
    sb.append("    dateTabs: ").append(toIndentedString(dateTabs)).append("\n");
    sb.append("    declineTabs: ").append(toIndentedString(declineTabs)).append("\n");
    sb.append("    drawTabs: ").append(toIndentedString(drawTabs)).append("\n");
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
    sb.append("    notarySealTabs: ").append(toIndentedString(notarySealTabs)).append("\n");
    sb.append("    noteTabs: ").append(toIndentedString(noteTabs)).append("\n");
    sb.append("    numberTabs: ").append(toIndentedString(numberTabs)).append("\n");
    sb.append("    phoneNumberTabs: ").append(toIndentedString(phoneNumberTabs)).append("\n");
    sb.append("    polyLineOverlayTabs: ").append(toIndentedString(polyLineOverlayTabs)).append("\n");
    sb.append("    prefillTabs: ").append(toIndentedString(prefillTabs)).append("\n");
    sb.append("    radioGroupTabs: ").append(toIndentedString(radioGroupTabs)).append("\n");
    sb.append("    signerAttachmentTabs: ").append(toIndentedString(signerAttachmentTabs)).append("\n");
    sb.append("    signHereTabs: ").append(toIndentedString(signHereTabs)).append("\n");
    sb.append("    smartSectionTabs: ").append(toIndentedString(smartSectionTabs)).append("\n");
    sb.append("    ssnTabs: ").append(toIndentedString(ssnTabs)).append("\n");
    sb.append("    tabGroups: ").append(toIndentedString(tabGroups)).append("\n");
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

