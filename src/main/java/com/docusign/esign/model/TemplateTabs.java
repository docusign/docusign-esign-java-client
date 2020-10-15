package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.Approve;
import com.docusign.esign.model.Checkbox;
import com.docusign.esign.model.CommentThread;
import com.docusign.esign.model.CommissionCounty;
import com.docusign.esign.model.CommissionExpiration;
import com.docusign.esign.model.CommissionNumber;
import com.docusign.esign.model.CommissionState;
import com.docusign.esign.model.Company;
import com.docusign.esign.model.DateSigned;
import com.docusign.esign.model.Decline;
import com.docusign.esign.model.Draw;
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
import com.docusign.esign.model.NotarySeal;
import com.docusign.esign.model.Note;
import com.docusign.esign.model.Number;
import com.docusign.esign.model.PhoneNumber;
import com.docusign.esign.model.PolyLineOverlay;
import com.docusign.esign.model.RadioGroup;
import com.docusign.esign.model.SignHere;
import com.docusign.esign.model.SignerAttachment;
import com.docusign.esign.model.SmartSection;
import com.docusign.esign.model.Ssn;
import com.docusign.esign.model.TabGroup;
import com.docusign.esign.model.Text;
import com.docusign.esign.model.Title;
import com.docusign.esign.model.View;
import com.docusign.esign.model.Zip;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

/**
 * TemplateTabs
 */

public class TemplateTabs {
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

  public TemplateTabs approveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
    return this;
  }

  public TemplateTabs addApproveTabsItem(Approve approveTabsItem) {
    if (this.approveTabs == null) {
      this.approveTabs = new java.util.ArrayList<Approve>();
    }
    this.approveTabs.add(approveTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.
   * @return approveTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.")
  public java.util.List<Approve> getApproveTabs() {
    return approveTabs;
  }

  public void setApproveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
  }

  public TemplateTabs checkboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
    return this;
  }

  public TemplateTabs addCheckboxTabsItem(Checkbox checkboxTabsItem) {
    if (this.checkboxTabs == null) {
      this.checkboxTabs = new java.util.ArrayList<Checkbox>();
    }
    this.checkboxTabs.add(checkboxTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document in a location where the recipient can select an option.
   * @return checkboxTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select an option.")
  public java.util.List<Checkbox> getCheckboxTabs() {
    return checkboxTabs;
  }

  public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
  }

  public TemplateTabs commentThreadTabs(java.util.List<CommentThread> commentThreadTabs) {
    this.commentThreadTabs = commentThreadTabs;
    return this;
  }

  public TemplateTabs addCommentThreadTabsItem(CommentThread commentThreadTabsItem) {
    if (this.commentThreadTabs == null) {
      this.commentThreadTabs = new java.util.ArrayList<CommentThread>();
    }
    this.commentThreadTabs.add(commentThreadTabsItem);
    return this;
  }

   /**
   * 
   * @return commentThreadTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CommentThread> getCommentThreadTabs() {
    return commentThreadTabs;
  }

  public void setCommentThreadTabs(java.util.List<CommentThread> commentThreadTabs) {
    this.commentThreadTabs = commentThreadTabs;
  }

  public TemplateTabs commissionCountyTabs(java.util.List<CommissionCounty> commissionCountyTabs) {
    this.commissionCountyTabs = commissionCountyTabs;
    return this;
  }

  public TemplateTabs addCommissionCountyTabsItem(CommissionCounty commissionCountyTabsItem) {
    if (this.commissionCountyTabs == null) {
      this.commissionCountyTabs = new java.util.ArrayList<CommissionCounty>();
    }
    this.commissionCountyTabs.add(commissionCountyTabsItem);
    return this;
  }

   /**
   * 
   * @return commissionCountyTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionCounty> getCommissionCountyTabs() {
    return commissionCountyTabs;
  }

  public void setCommissionCountyTabs(java.util.List<CommissionCounty> commissionCountyTabs) {
    this.commissionCountyTabs = commissionCountyTabs;
  }

  public TemplateTabs commissionExpirationTabs(java.util.List<CommissionExpiration> commissionExpirationTabs) {
    this.commissionExpirationTabs = commissionExpirationTabs;
    return this;
  }

  public TemplateTabs addCommissionExpirationTabsItem(CommissionExpiration commissionExpirationTabsItem) {
    if (this.commissionExpirationTabs == null) {
      this.commissionExpirationTabs = new java.util.ArrayList<CommissionExpiration>();
    }
    this.commissionExpirationTabs.add(commissionExpirationTabsItem);
    return this;
  }

   /**
   * 
   * @return commissionExpirationTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionExpiration> getCommissionExpirationTabs() {
    return commissionExpirationTabs;
  }

  public void setCommissionExpirationTabs(java.util.List<CommissionExpiration> commissionExpirationTabs) {
    this.commissionExpirationTabs = commissionExpirationTabs;
  }

  public TemplateTabs commissionNumberTabs(java.util.List<CommissionNumber> commissionNumberTabs) {
    this.commissionNumberTabs = commissionNumberTabs;
    return this;
  }

  public TemplateTabs addCommissionNumberTabsItem(CommissionNumber commissionNumberTabsItem) {
    if (this.commissionNumberTabs == null) {
      this.commissionNumberTabs = new java.util.ArrayList<CommissionNumber>();
    }
    this.commissionNumberTabs.add(commissionNumberTabsItem);
    return this;
  }

   /**
   * 
   * @return commissionNumberTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionNumber> getCommissionNumberTabs() {
    return commissionNumberTabs;
  }

  public void setCommissionNumberTabs(java.util.List<CommissionNumber> commissionNumberTabs) {
    this.commissionNumberTabs = commissionNumberTabs;
  }

  public TemplateTabs commissionStateTabs(java.util.List<CommissionState> commissionStateTabs) {
    this.commissionStateTabs = commissionStateTabs;
    return this;
  }

  public TemplateTabs addCommissionStateTabsItem(CommissionState commissionStateTabsItem) {
    if (this.commissionStateTabs == null) {
      this.commissionStateTabs = new java.util.ArrayList<CommissionState>();
    }
    this.commissionStateTabs.add(commissionStateTabsItem);
    return this;
  }

   /**
   * 
   * @return commissionStateTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CommissionState> getCommissionStateTabs() {
    return commissionStateTabs;
  }

  public void setCommissionStateTabs(java.util.List<CommissionState> commissionStateTabs) {
    this.commissionStateTabs = commissionStateTabs;
  }

  public TemplateTabs companyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
    return this;
  }

  public TemplateTabs addCompanyTabsItem(Company companyTabsItem) {
    if (this.companyTabs == null) {
      this.companyTabs = new java.util.ArrayList<Company>();
    }
    this.companyTabs.add(companyTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient's company name to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return companyTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's company name to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Company> getCompanyTabs() {
    return companyTabs;
  }

  public void setCompanyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
  }

  public TemplateTabs dateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
    return this;
  }

  public TemplateTabs addDateSignedTabsItem(DateSigned dateSignedTabsItem) {
    if (this.dateSignedTabs == null) {
      this.dateSignedTabs = new java.util.ArrayList<DateSigned>();
    }
    this.dateSignedTabs.add(dateSignedTabsItem);
    return this;
  }

   /**
   * Specifies a tab on the document where the date the document was signed will automatically appear.
   * @return dateSignedTabs
  **/
  @ApiModelProperty(value = "Specifies a tab on the document where the date the document was signed will automatically appear.")
  public java.util.List<DateSigned> getDateSignedTabs() {
    return dateSignedTabs;
  }

  public void setDateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
  }

  public TemplateTabs dateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
    return this;
  }

  public TemplateTabs addDateTabsItem(com.docusign.esign.model.Date dateTabsItem) {
    if (this.dateTabs == null) {
      this.dateTabs = new java.util.ArrayList<com.docusign.esign.model.Date>();
    }
    this.dateTabs.add(dateTabsItem);
    return this;
  }

   /**
   * Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.
   * @return dateTabs
  **/
  @ApiModelProperty(value = "Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained.   If you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.")
  public java.util.List<com.docusign.esign.model.Date> getDateTabs() {
    return dateTabs;
  }

  public void setDateTabs(java.util.List<com.docusign.esign.model.Date> dateTabs) {
    this.dateTabs = dateTabs;
  }

  public TemplateTabs declineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
    return this;
  }

  public TemplateTabs addDeclineTabsItem(Decline declineTabsItem) {
    if (this.declineTabs == null) {
      this.declineTabs = new java.util.ArrayList<Decline>();
    }
    this.declineTabs.add(declineTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.
   * @return declineTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.")
  public java.util.List<Decline> getDeclineTabs() {
    return declineTabs;
  }

  public void setDeclineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
  }

  public TemplateTabs drawTabs(java.util.List<Draw> drawTabs) {
    this.drawTabs = drawTabs;
    return this;
  }

  public TemplateTabs addDrawTabsItem(Draw drawTabsItem) {
    if (this.drawTabs == null) {
      this.drawTabs = new java.util.ArrayList<Draw>();
    }
    this.drawTabs.add(drawTabsItem);
    return this;
  }

   /**
   * 
   * @return drawTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Draw> getDrawTabs() {
    return drawTabs;
  }

  public void setDrawTabs(java.util.List<Draw> drawTabs) {
    this.drawTabs = drawTabs;
  }

  public TemplateTabs emailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
    return this;
  }

  public TemplateTabs addEmailAddressTabsItem(EmailAddress emailAddressTabsItem) {
    if (this.emailAddressTabs == null) {
      this.emailAddressTabs = new java.util.ArrayList<EmailAddress>();
    }
    this.emailAddressTabs.add(emailAddressTabsItem);
    return this;
  }

   /**
   * Specifies a location on the document where you want where you want the recipient's email, as entered in the recipient information, to display.
   * @return emailAddressTabs
  **/
  @ApiModelProperty(value = "Specifies a location on the document where you want where you want the recipient's email, as entered in the recipient information, to display.")
  public java.util.List<EmailAddress> getEmailAddressTabs() {
    return emailAddressTabs;
  }

  public void setEmailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
  }

  public TemplateTabs emailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
    return this;
  }

  public TemplateTabs addEmailTabsItem(Email emailTabsItem) {
    if (this.emailTabs == null) {
      this.emailTabs = new java.util.ArrayList<Email>();
    }
    this.emailTabs.add(emailTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return emailTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Email> getEmailTabs() {
    return emailTabs;
  }

  public void setEmailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
  }

  public TemplateTabs envelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
    return this;
  }

  public TemplateTabs addEnvelopeIdTabsItem(EnvelopeId envelopeIdTabsItem) {
    if (this.envelopeIdTabs == null) {
      this.envelopeIdTabs = new java.util.ArrayList<EnvelopeId>();
    }
    this.envelopeIdTabs.add(envelopeIdTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.
   * @return envelopeIdTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.")
  public java.util.List<EnvelopeId> getEnvelopeIdTabs() {
    return envelopeIdTabs;
  }

  public void setEnvelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
  }

  public TemplateTabs firstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
    return this;
  }

  public TemplateTabs addFirstNameTabsItem(FirstName firstNameTabsItem) {
    if (this.firstNameTabs == null) {
      this.firstNameTabs = new java.util.ArrayList<FirstName>();
    }
    this.firstNameTabs.add(firstNameTabsItem);
    return this;
  }

   /**
   * Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.
   * @return firstNameTabs
  **/
  @ApiModelProperty(value = "Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.")
  public java.util.List<FirstName> getFirstNameTabs() {
    return firstNameTabs;
  }

  public void setFirstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
  }

  public TemplateTabs formulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
    return this;
  }

  public TemplateTabs addFormulaTabsItem(FormulaTab formulaTabsItem) {
    if (this.formulaTabs == null) {
      this.formulaTabs = new java.util.ArrayList<FormulaTab>();
    }
    this.formulaTabs.add(formulaTabsItem);
    return this;
  }

   /**
   * Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.
   * @return formulaTabs
  **/
  @ApiModelProperty(value = "Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.")
  public java.util.List<FormulaTab> getFormulaTabs() {
    return formulaTabs;
  }

  public void setFormulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
  }

  public TemplateTabs fullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
    return this;
  }

  public TemplateTabs addFullNameTabsItem(FullName fullNameTabsItem) {
    if (this.fullNameTabs == null) {
      this.fullNameTabs = new java.util.ArrayList<FullName>();
    }
    this.fullNameTabs.add(fullNameTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient's name to appear.
   * @return fullNameTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's name to appear.")
  public java.util.List<FullName> getFullNameTabs() {
    return fullNameTabs;
  }

  public void setFullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
  }

  public TemplateTabs initialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
    return this;
  }

  public TemplateTabs addInitialHereTabsItem(InitialHere initialHereTabsItem) {
    if (this.initialHereTabs == null) {
      this.initialHereTabs = new java.util.ArrayList<InitialHere>();
    }
    this.initialHereTabs.add(initialHereTabsItem);
    return this;
  }

   /**
   * Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.
   * @return initialHereTabs
  **/
  @ApiModelProperty(value = "Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.")
  public java.util.List<InitialHere> getInitialHereTabs() {
    return initialHereTabs;
  }

  public void setInitialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
  }

  public TemplateTabs lastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
    return this;
  }

  public TemplateTabs addLastNameTabsItem(LastName lastNameTabsItem) {
    if (this.lastNameTabs == null) {
      this.lastNameTabs = new java.util.ArrayList<LastName>();
    }
    this.lastNameTabs.add(lastNameTabsItem);
    return this;
  }

   /**
   * Specifies a tag on a document where you want the recipient's last name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.
   * @return lastNameTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on a document where you want the recipient's last name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.")
  public java.util.List<LastName> getLastNameTabs() {
    return lastNameTabs;
  }

  public void setLastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
  }

  public TemplateTabs listTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
    return this;
  }

  public TemplateTabs addListTabsItem(List listTabsItem) {
    if (this.listTabs == null) {
      this.listTabs = new java.util.ArrayList<List>();
    }
    this.listTabs.add(listTabsItem);
    return this;
  }

   /**
   * Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.
   * @return listTabs
  **/
  @ApiModelProperty(value = "Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.")
  public java.util.List<List> getListTabs() {
    return listTabs;
  }

  public void setListTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
  }

  public TemplateTabs notarizeTabs(java.util.List<Notarize> notarizeTabs) {
    this.notarizeTabs = notarizeTabs;
    return this;
  }

  public TemplateTabs addNotarizeTabsItem(Notarize notarizeTabsItem) {
    if (this.notarizeTabs == null) {
      this.notarizeTabs = new java.util.ArrayList<Notarize>();
    }
    this.notarizeTabs.add(notarizeTabsItem);
    return this;
  }

   /**
   * 
   * @return notarizeTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Notarize> getNotarizeTabs() {
    return notarizeTabs;
  }

  public void setNotarizeTabs(java.util.List<Notarize> notarizeTabs) {
    this.notarizeTabs = notarizeTabs;
  }

  public TemplateTabs notarySealTabs(java.util.List<NotarySeal> notarySealTabs) {
    this.notarySealTabs = notarySealTabs;
    return this;
  }

  public TemplateTabs addNotarySealTabsItem(NotarySeal notarySealTabsItem) {
    if (this.notarySealTabs == null) {
      this.notarySealTabs = new java.util.ArrayList<NotarySeal>();
    }
    this.notarySealTabs.add(notarySealTabsItem);
    return this;
  }

   /**
   * 
   * @return notarySealTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NotarySeal> getNotarySealTabs() {
    return notarySealTabs;
  }

  public void setNotarySealTabs(java.util.List<NotarySeal> notarySealTabs) {
    this.notarySealTabs = notarySealTabs;
  }

  public TemplateTabs noteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
    return this;
  }

  public TemplateTabs addNoteTabsItem(Note noteTabsItem) {
    if (this.noteTabs == null) {
      this.noteTabs = new java.util.ArrayList<Note>();
    }
    this.noteTabs.add(noteTabsItem);
    return this;
  }

   /**
   * Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.
   * @return noteTabs
  **/
  @ApiModelProperty(value = "Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.")
  public java.util.List<Note> getNoteTabs() {
    return noteTabs;
  }

  public void setNoteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
  }

  public TemplateTabs numberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
    return this;
  }

  public TemplateTabs addNumberTabsItem(Number numberTabsItem) {
    if (this.numberTabs == null) {
      this.numberTabs = new java.util.ArrayList<Number>();
    }
    this.numberTabs.add(numberTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. 
   * @return numberTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. ")
  public java.util.List<Number> getNumberTabs() {
    return numberTabs;
  }

  public void setNumberTabs(java.util.List<Number> numberTabs) {
    this.numberTabs = numberTabs;
  }

  public TemplateTabs phoneNumberTabs(java.util.List<PhoneNumber> phoneNumberTabs) {
    this.phoneNumberTabs = phoneNumberTabs;
    return this;
  }

  public TemplateTabs addPhoneNumberTabsItem(PhoneNumber phoneNumberTabsItem) {
    if (this.phoneNumberTabs == null) {
      this.phoneNumberTabs = new java.util.ArrayList<PhoneNumber>();
    }
    this.phoneNumberTabs.add(phoneNumberTabsItem);
    return this;
  }

   /**
   * 
   * @return phoneNumberTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PhoneNumber> getPhoneNumberTabs() {
    return phoneNumberTabs;
  }

  public void setPhoneNumberTabs(java.util.List<PhoneNumber> phoneNumberTabs) {
    this.phoneNumberTabs = phoneNumberTabs;
  }

  public TemplateTabs polyLineOverlayTabs(java.util.List<PolyLineOverlay> polyLineOverlayTabs) {
    this.polyLineOverlayTabs = polyLineOverlayTabs;
    return this;
  }

  public TemplateTabs addPolyLineOverlayTabsItem(PolyLineOverlay polyLineOverlayTabsItem) {
    if (this.polyLineOverlayTabs == null) {
      this.polyLineOverlayTabs = new java.util.ArrayList<PolyLineOverlay>();
    }
    this.polyLineOverlayTabs.add(polyLineOverlayTabsItem);
    return this;
  }

   /**
   * 
   * @return polyLineOverlayTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PolyLineOverlay> getPolyLineOverlayTabs() {
    return polyLineOverlayTabs;
  }

  public void setPolyLineOverlayTabs(java.util.List<PolyLineOverlay> polyLineOverlayTabs) {
    this.polyLineOverlayTabs = polyLineOverlayTabs;
  }

  public TemplateTabs radioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
    return this;
  }

  public TemplateTabs addRadioGroupTabsItem(RadioGroup radioGroupTabsItem) {
    if (this.radioGroupTabs == null) {
      this.radioGroupTabs = new java.util.ArrayList<RadioGroup>();
    }
    this.radioGroupTabs.add(radioGroupTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.
   * @return radioGroupTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
  public java.util.List<RadioGroup> getRadioGroupTabs() {
    return radioGroupTabs;
  }

  public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
  }

  public TemplateTabs signerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
    return this;
  }

  public TemplateTabs addSignerAttachmentTabsItem(SignerAttachment signerAttachmentTabsItem) {
    if (this.signerAttachmentTabs == null) {
      this.signerAttachmentTabs = new java.util.ArrayList<SignerAttachment>();
    }
    this.signerAttachmentTabs.add(signerAttachmentTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.
   * @return signerAttachmentTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.")
  public java.util.List<SignerAttachment> getSignerAttachmentTabs() {
    return signerAttachmentTabs;
  }

  public void setSignerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
  }

  public TemplateTabs signHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
    return this;
  }

  public TemplateTabs addSignHereTabsItem(SignHere signHereTabsItem) {
    if (this.signHereTabs == null) {
      this.signHereTabs = new java.util.ArrayList<SignHere>();
    }
    this.signHereTabs.add(signHereTabsItem);
    return this;
  }

   /**
   * A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional. 
   * @return signHereTabs
  **/
  @ApiModelProperty(value = "A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional. ")
  public java.util.List<SignHere> getSignHereTabs() {
    return signHereTabs;
  }

  public void setSignHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }

  public TemplateTabs smartSectionTabs(java.util.List<SmartSection> smartSectionTabs) {
    this.smartSectionTabs = smartSectionTabs;
    return this;
  }

  public TemplateTabs addSmartSectionTabsItem(SmartSection smartSectionTabsItem) {
    if (this.smartSectionTabs == null) {
      this.smartSectionTabs = new java.util.ArrayList<SmartSection>();
    }
    this.smartSectionTabs.add(smartSectionTabsItem);
    return this;
  }

   /**
   * 
   * @return smartSectionTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SmartSection> getSmartSectionTabs() {
    return smartSectionTabs;
  }

  public void setSmartSectionTabs(java.util.List<SmartSection> smartSectionTabs) {
    this.smartSectionTabs = smartSectionTabs;
  }

  public TemplateTabs ssnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
    return this;
  }

  public TemplateTabs addSsnTabsItem(Ssn ssnTabsItem) {
    if (this.ssnTabs == null) {
      this.ssnTabs = new java.util.ArrayList<Ssn>();
    }
    this.ssnTabs.add(ssnTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return ssnTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Ssn> getSsnTabs() {
    return ssnTabs;
  }

  public void setSsnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
  }

  public TemplateTabs tabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
    return this;
  }

  public TemplateTabs addTabGroupsItem(TabGroup tabGroupsItem) {
    if (this.tabGroups == null) {
      this.tabGroups = new java.util.ArrayList<TabGroup>();
    }
    this.tabGroups.add(tabGroupsItem);
    return this;
  }

   /**
   * 
   * @return tabGroups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TabGroup> getTabGroups() {
    return tabGroups;
  }

  public void setTabGroups(java.util.List<TabGroup> tabGroups) {
    this.tabGroups = tabGroups;
  }

  public TemplateTabs textTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
    return this;
  }

  public TemplateTabs addTextTabsItem(Text textTabsItem) {
    if (this.textTabs == null) {
      this.textTabs = new java.util.ArrayList<Text>();
    }
    this.textTabs.add(textTabsItem);
    return this;
  }

   /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return textTabs
  **/
  @ApiModelProperty(value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Text> getTextTabs() {
    return textTabs;
  }

  public void setTextTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
  }

  public TemplateTabs titleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
    return this;
  }

  public TemplateTabs addTitleTabsItem(Title titleTabsItem) {
    if (this.titleTabs == null) {
      this.titleTabs = new java.util.ArrayList<Title>();
    }
    this.titleTabs.add(titleTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient's title to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return titleTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's title to appear.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  public java.util.List<Title> getTitleTabs() {
    return titleTabs;
  }

  public void setTitleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
  }

  public TemplateTabs viewTabs(java.util.List<View> viewTabs) {
    this.viewTabs = viewTabs;
    return this;
  }

  public TemplateTabs addViewTabsItem(View viewTabsItem) {
    if (this.viewTabs == null) {
      this.viewTabs = new java.util.ArrayList<View>();
    }
    this.viewTabs.add(viewTabsItem);
    return this;
  }

   /**
   * 
   * @return viewTabs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<View> getViewTabs() {
    return viewTabs;
  }

  public void setViewTabs(java.util.List<View> viewTabs) {
    this.viewTabs = viewTabs;
  }

  public TemplateTabs zipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
    return this;
  }

  public TemplateTabs addZipTabsItem(Zip zipTabsItem) {
    if (this.zipTabs == null) {
      this.zipTabs = new java.util.ArrayList<Zip>();
    }
    this.zipTabs.add(zipTabsItem);
    return this;
  }

   /**
   * Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   * @return zipTabs
  **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.  When getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
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
    TemplateTabs templateTabs = (TemplateTabs) o;
    return Objects.equals(this.approveTabs, templateTabs.approveTabs) &&
        Objects.equals(this.checkboxTabs, templateTabs.checkboxTabs) &&
        Objects.equals(this.commentThreadTabs, templateTabs.commentThreadTabs) &&
        Objects.equals(this.commissionCountyTabs, templateTabs.commissionCountyTabs) &&
        Objects.equals(this.commissionExpirationTabs, templateTabs.commissionExpirationTabs) &&
        Objects.equals(this.commissionNumberTabs, templateTabs.commissionNumberTabs) &&
        Objects.equals(this.commissionStateTabs, templateTabs.commissionStateTabs) &&
        Objects.equals(this.companyTabs, templateTabs.companyTabs) &&
        Objects.equals(this.dateSignedTabs, templateTabs.dateSignedTabs) &&
        Objects.equals(this.dateTabs, templateTabs.dateTabs) &&
        Objects.equals(this.declineTabs, templateTabs.declineTabs) &&
        Objects.equals(this.drawTabs, templateTabs.drawTabs) &&
        Objects.equals(this.emailAddressTabs, templateTabs.emailAddressTabs) &&
        Objects.equals(this.emailTabs, templateTabs.emailTabs) &&
        Objects.equals(this.envelopeIdTabs, templateTabs.envelopeIdTabs) &&
        Objects.equals(this.firstNameTabs, templateTabs.firstNameTabs) &&
        Objects.equals(this.formulaTabs, templateTabs.formulaTabs) &&
        Objects.equals(this.fullNameTabs, templateTabs.fullNameTabs) &&
        Objects.equals(this.initialHereTabs, templateTabs.initialHereTabs) &&
        Objects.equals(this.lastNameTabs, templateTabs.lastNameTabs) &&
        Objects.equals(this.listTabs, templateTabs.listTabs) &&
        Objects.equals(this.notarizeTabs, templateTabs.notarizeTabs) &&
        Objects.equals(this.notarySealTabs, templateTabs.notarySealTabs) &&
        Objects.equals(this.noteTabs, templateTabs.noteTabs) &&
        Objects.equals(this.numberTabs, templateTabs.numberTabs) &&
        Objects.equals(this.phoneNumberTabs, templateTabs.phoneNumberTabs) &&
        Objects.equals(this.polyLineOverlayTabs, templateTabs.polyLineOverlayTabs) &&
        Objects.equals(this.radioGroupTabs, templateTabs.radioGroupTabs) &&
        Objects.equals(this.signerAttachmentTabs, templateTabs.signerAttachmentTabs) &&
        Objects.equals(this.signHereTabs, templateTabs.signHereTabs) &&
        Objects.equals(this.smartSectionTabs, templateTabs.smartSectionTabs) &&
        Objects.equals(this.ssnTabs, templateTabs.ssnTabs) &&
        Objects.equals(this.tabGroups, templateTabs.tabGroups) &&
        Objects.equals(this.textTabs, templateTabs.textTabs) &&
        Objects.equals(this.titleTabs, templateTabs.titleTabs) &&
        Objects.equals(this.viewTabs, templateTabs.viewTabs) &&
        Objects.equals(this.zipTabs, templateTabs.zipTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approveTabs, checkboxTabs, commentThreadTabs, commissionCountyTabs, commissionExpirationTabs, commissionNumberTabs, commissionStateTabs, companyTabs, dateSignedTabs, dateTabs, declineTabs, drawTabs, emailAddressTabs, emailTabs, envelopeIdTabs, firstNameTabs, formulaTabs, fullNameTabs, initialHereTabs, lastNameTabs, listTabs, notarizeTabs, notarySealTabs, noteTabs, numberTabs, phoneNumberTabs, polyLineOverlayTabs, radioGroupTabs, signerAttachmentTabs, signHereTabs, smartSectionTabs, ssnTabs, tabGroups, textTabs, titleTabs, viewTabs, zipTabs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateTabs {\n");
    
    sb.append("    approveTabs: ").append(toIndentedString(approveTabs)).append("\n");
    sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
    sb.append("    commentThreadTabs: ").append(toIndentedString(commentThreadTabs)).append("\n");
    sb.append("    commissionCountyTabs: ").append(toIndentedString(commissionCountyTabs)).append("\n");
    sb.append("    commissionExpirationTabs: ").append(toIndentedString(commissionExpirationTabs)).append("\n");
    sb.append("    commissionNumberTabs: ").append(toIndentedString(commissionNumberTabs)).append("\n");
    sb.append("    commissionStateTabs: ").append(toIndentedString(commissionStateTabs)).append("\n");
    sb.append("    companyTabs: ").append(toIndentedString(companyTabs)).append("\n");
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

