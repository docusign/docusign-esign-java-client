package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.DocGenFormField;
import com.docusign.esign.model.DocumentHtmlDefinition;
import com.docusign.esign.model.MatchBox;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopeGenAndSendProperties.
 *
 */

public class EnvelopeGenAndSendProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("applyAnchorTabs")
  private String applyAnchorTabs = null;

  @JsonProperty("archiveDocumentType")
  private String archiveDocumentType = null;

  @JsonProperty("assignTabsToRecipientId")
  private String assignTabsToRecipientId = null;

  @JsonProperty("authoritativeCopy")
  private String authoritativeCopy = null;

  @JsonProperty("base64DataJson")
  private String base64DataJson = null;

  @JsonProperty("base64GenerateTemplateDocument")
  private String base64GenerateTemplateDocument = null;

  @JsonProperty("dataJson")
  private String dataJson = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("docGenDocumentStatus")
  private String docGenDocumentStatus = null;

  @JsonProperty("docGenFormFields")
  private java.util.List<DocGenFormField> docGenFormFields = null;

  @JsonProperty("documentBase64")
  private String documentBase64 = null;

  @JsonProperty("documentFields")
  private java.util.List<NameValue> documentFields = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("documentSequence")
  private String documentSequence = null;

  @JsonProperty("documentTemplateId")
  private String documentTemplateId = null;

  @JsonProperty("encryptedWithKeyManager")
  private String encryptedWithKeyManager = null;

  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("fileFormatHint")
  private String fileFormatHint = null;

  @JsonProperty("generateDocumentTemplateKind")
  private String generateDocumentTemplateKind = null;

  @JsonProperty("generateDocumentTemplateSource")
  private String generateDocumentTemplateSource = null;

  @JsonProperty("generateTemplateDocumentId")
  private String generateTemplateDocumentId = null;

  @JsonProperty("htmlDefinition")
  private DocumentHtmlDefinition htmlDefinition = null;

  @JsonProperty("includeInDownload")
  private String includeInDownload = null;

  @JsonProperty("isDocGenDocument")
  private String isDocGenDocument = null;

  @JsonProperty("matchBoxes")
  private java.util.List<MatchBox> matchBoxes = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("pages")
  private String pages = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("pdfFormFieldOption")
  private String pdfFormFieldOption = null;

  @JsonProperty("remoteUrl")
  private String remoteUrl = null;

  @JsonProperty("signerMustAcknowledge")
  private String signerMustAcknowledge = null;

  @JsonProperty("signerMustAcknowledgeUseAccountDefault")
  private Boolean signerMustAcknowledgeUseAccountDefault = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("transformPdfFields")
  private String transformPdfFields = null;

  @JsonProperty("uri")
  private String uri = null;


  /**
   * applyAnchorTabs.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties applyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
    return this;
  }

  /**
   * .
   * @return applyAnchorTabs
   **/
  @Schema(description = "")
  public String getApplyAnchorTabs() {
    return applyAnchorTabs;
  }

  /**
   * setApplyAnchorTabs.
   **/
  public void setApplyAnchorTabs(String applyAnchorTabs) {
    this.applyAnchorTabs = applyAnchorTabs;
  }


  /**
   * archiveDocumentType.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties archiveDocumentType(String archiveDocumentType) {
    this.archiveDocumentType = archiveDocumentType;
    return this;
  }

  /**
   * .
   * @return archiveDocumentType
   **/
  @Schema(description = "")
  public String getArchiveDocumentType() {
    return archiveDocumentType;
  }

  /**
   * setArchiveDocumentType.
   **/
  public void setArchiveDocumentType(String archiveDocumentType) {
    this.archiveDocumentType = archiveDocumentType;
  }


  /**
   * assignTabsToRecipientId.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties assignTabsToRecipientId(String assignTabsToRecipientId) {
    this.assignTabsToRecipientId = assignTabsToRecipientId;
    return this;
  }

  /**
   * .
   * @return assignTabsToRecipientId
   **/
  @Schema(description = "")
  public String getAssignTabsToRecipientId() {
    return assignTabsToRecipientId;
  }

  /**
   * setAssignTabsToRecipientId.
   **/
  public void setAssignTabsToRecipientId(String assignTabsToRecipientId) {
    this.assignTabsToRecipientId = assignTabsToRecipientId;
  }


  /**
   * authoritativeCopy.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties authoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
    return this;
  }

  /**
   * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled..
   * @return authoritativeCopy
   **/
  @Schema(description = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
  public String getAuthoritativeCopy() {
    return authoritativeCopy;
  }

  /**
   * setAuthoritativeCopy.
   **/
  public void setAuthoritativeCopy(String authoritativeCopy) {
    this.authoritativeCopy = authoritativeCopy;
  }


  /**
   * base64DataJson.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties base64DataJson(String base64DataJson) {
    this.base64DataJson = base64DataJson;
    return this;
  }

  /**
   * .
   * @return base64DataJson
   **/
  @Schema(description = "")
  public String getBase64DataJson() {
    return base64DataJson;
  }

  /**
   * setBase64DataJson.
   **/
  public void setBase64DataJson(String base64DataJson) {
    this.base64DataJson = base64DataJson;
  }


  /**
   * base64GenerateTemplateDocument.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties base64GenerateTemplateDocument(String base64GenerateTemplateDocument) {
    this.base64GenerateTemplateDocument = base64GenerateTemplateDocument;
    return this;
  }

  /**
   * .
   * @return base64GenerateTemplateDocument
   **/
  @Schema(description = "")
  public String getBase64GenerateTemplateDocument() {
    return base64GenerateTemplateDocument;
  }

  /**
   * setBase64GenerateTemplateDocument.
   **/
  public void setBase64GenerateTemplateDocument(String base64GenerateTemplateDocument) {
    this.base64GenerateTemplateDocument = base64GenerateTemplateDocument;
  }


  /**
   * dataJson.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties dataJson(String dataJson) {
    this.dataJson = dataJson;
    return this;
  }

  /**
   * .
   * @return dataJson
   **/
  @Schema(description = "")
  public String getDataJson() {
    return dataJson;
  }

  /**
   * setDataJson.
   **/
  public void setDataJson(String dataJson) {
    this.dataJson = dataJson;
  }


  /**
   * display.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties display(String display) {
    this.display = display;
    return this;
  }

  /**
   * .
   * @return display
   **/
  @Schema(description = "")
  public String getDisplay() {
    return display;
  }

  /**
   * setDisplay.
   **/
  public void setDisplay(String display) {
    this.display = display;
  }


  /**
   * docGenDocumentStatus.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties docGenDocumentStatus(String docGenDocumentStatus) {
    this.docGenDocumentStatus = docGenDocumentStatus;
    return this;
  }

  /**
   * .
   * @return docGenDocumentStatus
   **/
  @Schema(description = "")
  public String getDocGenDocumentStatus() {
    return docGenDocumentStatus;
  }

  /**
   * setDocGenDocumentStatus.
   **/
  public void setDocGenDocumentStatus(String docGenDocumentStatus) {
    this.docGenDocumentStatus = docGenDocumentStatus;
  }


  /**
   * docGenFormFields.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties docGenFormFields(java.util.List<DocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
    return this;
  }
  
  /**
   * addDocGenFormFieldsItem.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties addDocGenFormFieldsItem(DocGenFormField docGenFormFieldsItem) {
    if (this.docGenFormFields == null) {
      this.docGenFormFields = new java.util.ArrayList<>();
    }
    this.docGenFormFields.add(docGenFormFieldsItem);
    return this;
  }

  /**
   * .
   * @return docGenFormFields
   **/
  @Schema(description = "")
  public java.util.List<DocGenFormField> getDocGenFormFields() {
    return docGenFormFields;
  }

  /**
   * setDocGenFormFields.
   **/
  public void setDocGenFormFields(java.util.List<DocGenFormField> docGenFormFields) {
    this.docGenFormFields = docGenFormFields;
  }


  /**
   * documentBase64.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }

  /**
   * .
   * @return documentBase64
   **/
  @Schema(description = "")
  public String getDocumentBase64() {
    return documentBase64;
  }

  /**
   * setDocumentBase64.
   **/
  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }


  /**
   * documentFields.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties documentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
    return this;
  }
  
  /**
   * addDocumentFieldsItem.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties addDocumentFieldsItem(NameValue documentFieldsItem) {
    if (this.documentFields == null) {
      this.documentFields = new java.util.ArrayList<>();
    }
    this.documentFields.add(documentFieldsItem);
    return this;
  }

  /**
   * .
   * @return documentFields
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getDocumentFields() {
    return documentFields;
  }

  /**
   * setDocumentFields.
   **/
  public void setDocumentFields(java.util.List<NameValue> documentFields) {
    this.documentFields = documentFields;
  }


  /**
   * documentId.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute..
   * @return documentId
   **/
  @Schema(description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * documentName.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * .
   * @return documentName
   **/
  @Schema(description = "")
  public String getDocumentName() {
    return documentName;
  }

  /**
   * setDocumentName.
   **/
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  /**
   * documentSequence.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties documentSequence(String documentSequence) {
    this.documentSequence = documentSequence;
    return this;
  }

  /**
   * .
   * @return documentSequence
   **/
  @Schema(description = "")
  public String getDocumentSequence() {
    return documentSequence;
  }

  /**
   * setDocumentSequence.
   **/
  public void setDocumentSequence(String documentSequence) {
    this.documentSequence = documentSequence;
  }


  /**
   * documentTemplateId.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties documentTemplateId(String documentTemplateId) {
    this.documentTemplateId = documentTemplateId;
    return this;
  }

  /**
   * .
   * @return documentTemplateId
   **/
  @Schema(description = "")
  public String getDocumentTemplateId() {
    return documentTemplateId;
  }

  /**
   * setDocumentTemplateId.
   **/
  public void setDocumentTemplateId(String documentTemplateId) {
    this.documentTemplateId = documentTemplateId;
  }


  /**
   * encryptedWithKeyManager.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties encryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
    return this;
  }

  /**
   * .
   * @return encryptedWithKeyManager
   **/
  @Schema(description = "")
  public String getEncryptedWithKeyManager() {
    return encryptedWithKeyManager;
  }

  /**
   * setEncryptedWithKeyManager.
   **/
  public void setEncryptedWithKeyManager(String encryptedWithKeyManager) {
    this.encryptedWithKeyManager = encryptedWithKeyManager;
  }


  /**
   * fileExtension.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * .
   * @return fileExtension
   **/
  @Schema(description = "")
  public String getFileExtension() {
    return fileExtension;
  }

  /**
   * setFileExtension.
   **/
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }


  /**
   * fileFormatHint.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties fileFormatHint(String fileFormatHint) {
    this.fileFormatHint = fileFormatHint;
    return this;
  }

  /**
   * .
   * @return fileFormatHint
   **/
  @Schema(description = "")
  public String getFileFormatHint() {
    return fileFormatHint;
  }

  /**
   * setFileFormatHint.
   **/
  public void setFileFormatHint(String fileFormatHint) {
    this.fileFormatHint = fileFormatHint;
  }


  /**
   * generateDocumentTemplateKind.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties generateDocumentTemplateKind(String generateDocumentTemplateKind) {
    this.generateDocumentTemplateKind = generateDocumentTemplateKind;
    return this;
  }

  /**
   * .
   * @return generateDocumentTemplateKind
   **/
  @Schema(description = "")
  public String getGenerateDocumentTemplateKind() {
    return generateDocumentTemplateKind;
  }

  /**
   * setGenerateDocumentTemplateKind.
   **/
  public void setGenerateDocumentTemplateKind(String generateDocumentTemplateKind) {
    this.generateDocumentTemplateKind = generateDocumentTemplateKind;
  }


  /**
   * generateDocumentTemplateSource.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties generateDocumentTemplateSource(String generateDocumentTemplateSource) {
    this.generateDocumentTemplateSource = generateDocumentTemplateSource;
    return this;
  }

  /**
   * .
   * @return generateDocumentTemplateSource
   **/
  @Schema(description = "")
  public String getGenerateDocumentTemplateSource() {
    return generateDocumentTemplateSource;
  }

  /**
   * setGenerateDocumentTemplateSource.
   **/
  public void setGenerateDocumentTemplateSource(String generateDocumentTemplateSource) {
    this.generateDocumentTemplateSource = generateDocumentTemplateSource;
  }


  /**
   * generateTemplateDocumentId.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties generateTemplateDocumentId(String generateTemplateDocumentId) {
    this.generateTemplateDocumentId = generateTemplateDocumentId;
    return this;
  }

  /**
   * .
   * @return generateTemplateDocumentId
   **/
  @Schema(description = "")
  public String getGenerateTemplateDocumentId() {
    return generateTemplateDocumentId;
  }

  /**
   * setGenerateTemplateDocumentId.
   **/
  public void setGenerateTemplateDocumentId(String generateTemplateDocumentId) {
    this.generateTemplateDocumentId = generateTemplateDocumentId;
  }


  /**
   * htmlDefinition.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties htmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
    return this;
  }

  /**
   * .
   * @return htmlDefinition
   **/
  @Schema(description = "")
  public DocumentHtmlDefinition getHtmlDefinition() {
    return htmlDefinition;
  }

  /**
   * setHtmlDefinition.
   **/
  public void setHtmlDefinition(DocumentHtmlDefinition htmlDefinition) {
    this.htmlDefinition = htmlDefinition;
  }


  /**
   * includeInDownload.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties includeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
    return this;
  }

  /**
   * .
   * @return includeInDownload
   **/
  @Schema(description = "")
  public String getIncludeInDownload() {
    return includeInDownload;
  }

  /**
   * setIncludeInDownload.
   **/
  public void setIncludeInDownload(String includeInDownload) {
    this.includeInDownload = includeInDownload;
  }


  /**
   * isDocGenDocument.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties isDocGenDocument(String isDocGenDocument) {
    this.isDocGenDocument = isDocGenDocument;
    return this;
  }

  /**
   * .
   * @return isDocGenDocument
   **/
  @Schema(description = "")
  public String getIsDocGenDocument() {
    return isDocGenDocument;
  }

  /**
   * setIsDocGenDocument.
   **/
  public void setIsDocGenDocument(String isDocGenDocument) {
    this.isDocGenDocument = isDocGenDocument;
  }


  /**
   * matchBoxes.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties matchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
    return this;
  }
  
  /**
   * addMatchBoxesItem.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties addMatchBoxesItem(MatchBox matchBoxesItem) {
    if (this.matchBoxes == null) {
      this.matchBoxes = new java.util.ArrayList<>();
    }
    this.matchBoxes.add(matchBoxesItem);
    return this;
  }

  /**
   * .
   * @return matchBoxes
   **/
  @Schema(description = "")
  public java.util.List<MatchBox> getMatchBoxes() {
    return matchBoxes;
  }

  /**
   * setMatchBoxes.
   **/
  public void setMatchBoxes(java.util.List<MatchBox> matchBoxes) {
    this.matchBoxes = matchBoxes;
  }


  /**
   * name.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * order.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties order(String order) {
    this.order = order;
    return this;
  }

  /**
   * .
   * @return order
   **/
  @Schema(description = "")
  public String getOrder() {
    return order;
  }

  /**
   * setOrder.
   **/
  public void setOrder(String order) {
    this.order = order;
  }


  /**
   * pages.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties pages(String pages) {
    this.pages = pages;
    return this;
  }

  /**
   * .
   * @return pages
   **/
  @Schema(description = "")
  public String getPages() {
    return pages;
  }

  /**
   * setPages.
   **/
  public void setPages(String pages) {
    this.pages = pages;
  }


  /**
   * password.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties password(String password) {
    this.password = password;
    return this;
  }

  /**
   * .
   * @return password
   **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  /**
   * setPassword.
   **/
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * pdfFormFieldOption.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties pdfFormFieldOption(String pdfFormFieldOption) {
    this.pdfFormFieldOption = pdfFormFieldOption;
    return this;
  }

  /**
   * .
   * @return pdfFormFieldOption
   **/
  @Schema(description = "")
  public String getPdfFormFieldOption() {
    return pdfFormFieldOption;
  }

  /**
   * setPdfFormFieldOption.
   **/
  public void setPdfFormFieldOption(String pdfFormFieldOption) {
    this.pdfFormFieldOption = pdfFormFieldOption;
  }


  /**
   * remoteUrl.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

  /**
   * .
   * @return remoteUrl
   **/
  @Schema(description = "")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  /**
   * setRemoteUrl.
   **/
  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }


  /**
   * signerMustAcknowledge.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties signerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
    return this;
  }

  /**
   * .
   * @return signerMustAcknowledge
   **/
  @Schema(description = "")
  public String getSignerMustAcknowledge() {
    return signerMustAcknowledge;
  }

  /**
   * setSignerMustAcknowledge.
   **/
  public void setSignerMustAcknowledge(String signerMustAcknowledge) {
    this.signerMustAcknowledge = signerMustAcknowledge;
  }


  /**
   * signerMustAcknowledgeUseAccountDefault.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties signerMustAcknowledgeUseAccountDefault(Boolean signerMustAcknowledgeUseAccountDefault) {
    this.signerMustAcknowledgeUseAccountDefault = signerMustAcknowledgeUseAccountDefault;
    return this;
  }

  /**
   * .
   * @return signerMustAcknowledgeUseAccountDefault
   **/
  @Schema(description = "")
  public Boolean isSignerMustAcknowledgeUseAccountDefault() {
    return signerMustAcknowledgeUseAccountDefault;
  }

  /**
   * setSignerMustAcknowledgeUseAccountDefault.
   **/
  public void setSignerMustAcknowledgeUseAccountDefault(Boolean signerMustAcknowledgeUseAccountDefault) {
    this.signerMustAcknowledgeUseAccountDefault = signerMustAcknowledgeUseAccountDefault;
  }


  /**
   * tabs.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

  /**
   * .
   * @return tabs
   **/
  @Schema(description = "")
  public Tabs getTabs() {
    return tabs;
  }

  /**
   * setTabs.
   **/
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }


  /**
   * templateLocked.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. .
   * @return templateLocked
   **/
  @Schema(description = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }


  /**
   * templateRequired.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients..
   * @return templateRequired
   **/
  @Schema(description = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }


  /**
   * transformPdfFields.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties transformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
    return this;
  }

  /**
   * .
   * @return transformPdfFields
   **/
  @Schema(description = "")
  public String getTransformPdfFields() {
    return transformPdfFields;
  }

  /**
   * setTransformPdfFields.
   **/
  public void setTransformPdfFields(String transformPdfFields) {
    this.transformPdfFields = transformPdfFields;
  }


  /**
   * uri.
   *
   * @return EnvelopeGenAndSendProperties
   **/
  public EnvelopeGenAndSendProperties uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * .
   * @return uri
   **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  /**
   * setUri.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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
    EnvelopeGenAndSendProperties envelopeGenAndSendProperties = (EnvelopeGenAndSendProperties) o;
    return Objects.equals(this.applyAnchorTabs, envelopeGenAndSendProperties.applyAnchorTabs) &&
        Objects.equals(this.archiveDocumentType, envelopeGenAndSendProperties.archiveDocumentType) &&
        Objects.equals(this.assignTabsToRecipientId, envelopeGenAndSendProperties.assignTabsToRecipientId) &&
        Objects.equals(this.authoritativeCopy, envelopeGenAndSendProperties.authoritativeCopy) &&
        Objects.equals(this.base64DataJson, envelopeGenAndSendProperties.base64DataJson) &&
        Objects.equals(this.base64GenerateTemplateDocument, envelopeGenAndSendProperties.base64GenerateTemplateDocument) &&
        Objects.equals(this.dataJson, envelopeGenAndSendProperties.dataJson) &&
        Objects.equals(this.display, envelopeGenAndSendProperties.display) &&
        Objects.equals(this.docGenDocumentStatus, envelopeGenAndSendProperties.docGenDocumentStatus) &&
        Objects.equals(this.docGenFormFields, envelopeGenAndSendProperties.docGenFormFields) &&
        Objects.equals(this.documentBase64, envelopeGenAndSendProperties.documentBase64) &&
        Objects.equals(this.documentFields, envelopeGenAndSendProperties.documentFields) &&
        Objects.equals(this.documentId, envelopeGenAndSendProperties.documentId) &&
        Objects.equals(this.documentName, envelopeGenAndSendProperties.documentName) &&
        Objects.equals(this.documentSequence, envelopeGenAndSendProperties.documentSequence) &&
        Objects.equals(this.documentTemplateId, envelopeGenAndSendProperties.documentTemplateId) &&
        Objects.equals(this.encryptedWithKeyManager, envelopeGenAndSendProperties.encryptedWithKeyManager) &&
        Objects.equals(this.fileExtension, envelopeGenAndSendProperties.fileExtension) &&
        Objects.equals(this.fileFormatHint, envelopeGenAndSendProperties.fileFormatHint) &&
        Objects.equals(this.generateDocumentTemplateKind, envelopeGenAndSendProperties.generateDocumentTemplateKind) &&
        Objects.equals(this.generateDocumentTemplateSource, envelopeGenAndSendProperties.generateDocumentTemplateSource) &&
        Objects.equals(this.generateTemplateDocumentId, envelopeGenAndSendProperties.generateTemplateDocumentId) &&
        Objects.equals(this.htmlDefinition, envelopeGenAndSendProperties.htmlDefinition) &&
        Objects.equals(this.includeInDownload, envelopeGenAndSendProperties.includeInDownload) &&
        Objects.equals(this.isDocGenDocument, envelopeGenAndSendProperties.isDocGenDocument) &&
        Objects.equals(this.matchBoxes, envelopeGenAndSendProperties.matchBoxes) &&
        Objects.equals(this.name, envelopeGenAndSendProperties.name) &&
        Objects.equals(this.order, envelopeGenAndSendProperties.order) &&
        Objects.equals(this.pages, envelopeGenAndSendProperties.pages) &&
        Objects.equals(this.password, envelopeGenAndSendProperties.password) &&
        Objects.equals(this.pdfFormFieldOption, envelopeGenAndSendProperties.pdfFormFieldOption) &&
        Objects.equals(this.remoteUrl, envelopeGenAndSendProperties.remoteUrl) &&
        Objects.equals(this.signerMustAcknowledge, envelopeGenAndSendProperties.signerMustAcknowledge) &&
        Objects.equals(this.signerMustAcknowledgeUseAccountDefault, envelopeGenAndSendProperties.signerMustAcknowledgeUseAccountDefault) &&
        Objects.equals(this.tabs, envelopeGenAndSendProperties.tabs) &&
        Objects.equals(this.templateLocked, envelopeGenAndSendProperties.templateLocked) &&
        Objects.equals(this.templateRequired, envelopeGenAndSendProperties.templateRequired) &&
        Objects.equals(this.transformPdfFields, envelopeGenAndSendProperties.transformPdfFields) &&
        Objects.equals(this.uri, envelopeGenAndSendProperties.uri);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(applyAnchorTabs, archiveDocumentType, assignTabsToRecipientId, authoritativeCopy, base64DataJson, base64GenerateTemplateDocument, dataJson, display, docGenDocumentStatus, docGenFormFields, documentBase64, documentFields, documentId, documentName, documentSequence, documentTemplateId, encryptedWithKeyManager, fileExtension, fileFormatHint, generateDocumentTemplateKind, generateDocumentTemplateSource, generateTemplateDocumentId, htmlDefinition, includeInDownload, isDocGenDocument, matchBoxes, name, order, pages, password, pdfFormFieldOption, remoteUrl, signerMustAcknowledge, signerMustAcknowledgeUseAccountDefault, tabs, templateLocked, templateRequired, transformPdfFields, uri);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeGenAndSendProperties {\n");
    
    sb.append("    applyAnchorTabs: ").append(toIndentedString(applyAnchorTabs)).append("\n");
    sb.append("    archiveDocumentType: ").append(toIndentedString(archiveDocumentType)).append("\n");
    sb.append("    assignTabsToRecipientId: ").append(toIndentedString(assignTabsToRecipientId)).append("\n");
    sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
    sb.append("    base64DataJson: ").append(toIndentedString(base64DataJson)).append("\n");
    sb.append("    base64GenerateTemplateDocument: ").append(toIndentedString(base64GenerateTemplateDocument)).append("\n");
    sb.append("    dataJson: ").append(toIndentedString(dataJson)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    docGenDocumentStatus: ").append(toIndentedString(docGenDocumentStatus)).append("\n");
    sb.append("    docGenFormFields: ").append(toIndentedString(docGenFormFields)).append("\n");
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentSequence: ").append(toIndentedString(documentSequence)).append("\n");
    sb.append("    documentTemplateId: ").append(toIndentedString(documentTemplateId)).append("\n");
    sb.append("    encryptedWithKeyManager: ").append(toIndentedString(encryptedWithKeyManager)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    fileFormatHint: ").append(toIndentedString(fileFormatHint)).append("\n");
    sb.append("    generateDocumentTemplateKind: ").append(toIndentedString(generateDocumentTemplateKind)).append("\n");
    sb.append("    generateDocumentTemplateSource: ").append(toIndentedString(generateDocumentTemplateSource)).append("\n");
    sb.append("    generateTemplateDocumentId: ").append(toIndentedString(generateTemplateDocumentId)).append("\n");
    sb.append("    htmlDefinition: ").append(toIndentedString(htmlDefinition)).append("\n");
    sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
    sb.append("    isDocGenDocument: ").append(toIndentedString(isDocGenDocument)).append("\n");
    sb.append("    matchBoxes: ").append(toIndentedString(matchBoxes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pdfFormFieldOption: ").append(toIndentedString(pdfFormFieldOption)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
    sb.append("    signerMustAcknowledgeUseAccountDefault: ").append(toIndentedString(signerMustAcknowledgeUseAccountDefault)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    transformPdfFields: ").append(toIndentedString(transformPdfFields)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

