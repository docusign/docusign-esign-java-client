package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** DisplayApplianceRecipient */
public class DisplayApplianceRecipient {
  @JsonProperty("cfrPart11")
  private Boolean cfrPart11 = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("digitalSignatureBase64")
  private String digitalSignatureBase64 = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("initialsBase64")
  private String initialsBase64 = null;

  @JsonProperty("inPersonEmail")
  private String inPersonEmail = null;

  @JsonProperty("isNotary")
  private Boolean isNotary = null;

  @JsonProperty("notarySealBase64")
  private String notarySealBase64 = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("recipientCompleteCount")
  private Integer recipientCompleteCount = null;

  @JsonProperty("recipientGuidId")
  private String recipientGuidId = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientStatus")
  private String recipientStatus = null;

  @JsonProperty("recipientType")
  private String recipientType = null;

  @JsonProperty("rowState")
  private String rowState = null;

  @JsonProperty("signatureBase64")
  private String signatureBase64 = null;

  @JsonProperty("signed")
  private Boolean signed = null;

  @JsonProperty("signerApplyTabs")
  private Boolean signerApplyTabs = null;

  @JsonProperty("signerAttachmentBase64")
  private String signerAttachmentBase64 = null;

  @JsonProperty("userName")
  private String userName = null;

  public DisplayApplianceRecipient cfrPart11(Boolean cfrPart11) {
    this.cfrPart11 = cfrPart11;
    return this;
  }

  /** @return cfrPart11 */
  @Schema(example = "null", description = "")
  public Boolean getCfrPart11() {
    return cfrPart11;
  }

  public void setCfrPart11(Boolean cfrPart11) {
    this.cfrPart11 = cfrPart11;
  }

  public DisplayApplianceRecipient company(String company) {
    this.company = company;
    return this;
  }

  /** @return company */
  @Schema(example = "null", description = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public DisplayApplianceRecipient digitalSignatureBase64(String digitalSignatureBase64) {
    this.digitalSignatureBase64 = digitalSignatureBase64;
    return this;
  }

  /** @return digitalSignatureBase64 */
  @Schema(example = "null", description = "")
  public String getDigitalSignatureBase64() {
    return digitalSignatureBase64;
  }

  public void setDigitalSignatureBase64(String digitalSignatureBase64) {
    this.digitalSignatureBase64 = digitalSignatureBase64;
  }

  public DisplayApplianceRecipient email(String email) {
    this.email = email;
    return this;
  }

  /** @return email */
  @Schema(example = "null", description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DisplayApplianceRecipient fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /** @return fullName */
  @Schema(example = "null", description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public DisplayApplianceRecipient initialsBase64(String initialsBase64) {
    this.initialsBase64 = initialsBase64;
    return this;
  }

  /** @return initialsBase64 */
  @Schema(example = "null", description = "")
  public String getInitialsBase64() {
    return initialsBase64;
  }

  public void setInitialsBase64(String initialsBase64) {
    this.initialsBase64 = initialsBase64;
  }

  public DisplayApplianceRecipient inPersonEmail(String inPersonEmail) {
    this.inPersonEmail = inPersonEmail;
    return this;
  }

  /** @return inPersonEmail */
  @Schema(example = "null", description = "")
  public String getInPersonEmail() {
    return inPersonEmail;
  }

  public void setInPersonEmail(String inPersonEmail) {
    this.inPersonEmail = inPersonEmail;
  }

  public DisplayApplianceRecipient isNotary(Boolean isNotary) {
    this.isNotary = isNotary;
    return this;
  }

  /** @return isNotary */
  @Schema(example = "null", description = "")
  public Boolean getIsNotary() {
    return isNotary;
  }

  public void setIsNotary(Boolean isNotary) {
    this.isNotary = isNotary;
  }

  public DisplayApplianceRecipient notarySealBase64(String notarySealBase64) {
    this.notarySealBase64 = notarySealBase64;
    return this;
  }

  /** @return notarySealBase64 */
  @Schema(example = "null", description = "")
  public String getNotarySealBase64() {
    return notarySealBase64;
  }

  public void setNotarySealBase64(String notarySealBase64) {
    this.notarySealBase64 = notarySealBase64;
  }

  public DisplayApplianceRecipient phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /** @return phoneNumber */
  @Schema(example = "null", description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public DisplayApplianceRecipient recipientCompleteCount(Integer recipientCompleteCount) {
    this.recipientCompleteCount = recipientCompleteCount;
    return this;
  }

  /** @return recipientCompleteCount */
  @Schema(example = "null", description = "")
  public Integer getRecipientCompleteCount() {
    return recipientCompleteCount;
  }

  public void setRecipientCompleteCount(Integer recipientCompleteCount) {
    this.recipientCompleteCount = recipientCompleteCount;
  }

  public DisplayApplianceRecipient recipientGuidId(String recipientGuidId) {
    this.recipientGuidId = recipientGuidId;
    return this;
  }

  /** @return recipientGuidId */
  @Schema(example = "null", description = "")
  public String getRecipientGuidId() {
    return recipientGuidId;
  }

  public void setRecipientGuidId(String recipientGuidId) {
    this.recipientGuidId = recipientGuidId;
  }

  public DisplayApplianceRecipient recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which
   * recipient is to sign
   * the Document.
   *
   * @return recipientId
   */
  @Schema(example = "null", description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public DisplayApplianceRecipient recipientStatus(String recipientStatus) {
    this.recipientStatus = recipientStatus;
    return this;
  }

  /** @return recipientStatus */
  @Schema(example = "null", description = "")
  public String getRecipientStatus() {
    return recipientStatus;
  }

  public void setRecipientStatus(String recipientStatus) {
    this.recipientStatus = recipientStatus;
  }

  public DisplayApplianceRecipient recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /** @return recipientType */
  @Schema(example = "null", description = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public DisplayApplianceRecipient rowState(String rowState) {
    this.rowState = rowState;
    return this;
  }

  /** @return rowState */
  @Schema(example = "null", description = "")
  public String getRowState() {
    return rowState;
  }

  public void setRowState(String rowState) {
    this.rowState = rowState;
  }

  public DisplayApplianceRecipient signatureBase64(String signatureBase64) {
    this.signatureBase64 = signatureBase64;
    return this;
  }

  /** @return signatureBase64 */
  @Schema(example = "null", description = "")
  public String getSignatureBase64() {
    return signatureBase64;
  }

  public void setSignatureBase64(String signatureBase64) {
    this.signatureBase64 = signatureBase64;
  }

  public DisplayApplianceRecipient signed(Boolean signed) {
    this.signed = signed;
    return this;
  }

  /** @return signed */
  @Schema(example = "null", description = "")
  public Boolean getSigned() {
    return signed;
  }

  public void setSigned(Boolean signed) {
    this.signed = signed;
  }

  public DisplayApplianceRecipient signerApplyTabs(Boolean signerApplyTabs) {
    this.signerApplyTabs = signerApplyTabs;
    return this;
  }

  /** @return signerApplyTabs */
  @Schema(example = "null", description = "")
  public Boolean getSignerApplyTabs() {
    return signerApplyTabs;
  }

  public void setSignerApplyTabs(Boolean signerApplyTabs) {
    this.signerApplyTabs = signerApplyTabs;
  }

  public DisplayApplianceRecipient signerAttachmentBase64(String signerAttachmentBase64) {
    this.signerAttachmentBase64 = signerAttachmentBase64;
    return this;
  }

  /** @return signerAttachmentBase64 */
  @Schema(example = "null", description = "")
  public String getSignerAttachmentBase64() {
    return signerAttachmentBase64;
  }

  public void setSignerAttachmentBase64(String signerAttachmentBase64) {
    this.signerAttachmentBase64 = signerAttachmentBase64;
  }

  public DisplayApplianceRecipient userName(String userName) {
    this.userName = userName;
    return this;
  }

  /** @return userName */
  @Schema(example = "null", description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceRecipient displayApplianceRecipient = (DisplayApplianceRecipient) o;
    return Objects.equals(this.cfrPart11, displayApplianceRecipient.cfrPart11)
        && Objects.equals(this.company, displayApplianceRecipient.company)
        && Objects.equals(
            this.digitalSignatureBase64, displayApplianceRecipient.digitalSignatureBase64)
        && Objects.equals(this.email, displayApplianceRecipient.email)
        && Objects.equals(this.fullName, displayApplianceRecipient.fullName)
        && Objects.equals(this.initialsBase64, displayApplianceRecipient.initialsBase64)
        && Objects.equals(this.inPersonEmail, displayApplianceRecipient.inPersonEmail)
        && Objects.equals(this.isNotary, displayApplianceRecipient.isNotary)
        && Objects.equals(this.notarySealBase64, displayApplianceRecipient.notarySealBase64)
        && Objects.equals(this.phoneNumber, displayApplianceRecipient.phoneNumber)
        && Objects.equals(
            this.recipientCompleteCount, displayApplianceRecipient.recipientCompleteCount)
        && Objects.equals(this.recipientGuidId, displayApplianceRecipient.recipientGuidId)
        && Objects.equals(this.recipientId, displayApplianceRecipient.recipientId)
        && Objects.equals(this.recipientStatus, displayApplianceRecipient.recipientStatus)
        && Objects.equals(this.recipientType, displayApplianceRecipient.recipientType)
        && Objects.equals(this.rowState, displayApplianceRecipient.rowState)
        && Objects.equals(this.signatureBase64, displayApplianceRecipient.signatureBase64)
        && Objects.equals(this.signed, displayApplianceRecipient.signed)
        && Objects.equals(this.signerApplyTabs, displayApplianceRecipient.signerApplyTabs)
        && Objects.equals(
            this.signerAttachmentBase64, displayApplianceRecipient.signerAttachmentBase64)
        && Objects.equals(this.userName, displayApplianceRecipient.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cfrPart11,
        company,
        digitalSignatureBase64,
        email,
        fullName,
        initialsBase64,
        inPersonEmail,
        isNotary,
        notarySealBase64,
        phoneNumber,
        recipientCompleteCount,
        recipientGuidId,
        recipientId,
        recipientStatus,
        recipientType,
        rowState,
        signatureBase64,
        signed,
        signerApplyTabs,
        signerAttachmentBase64,
        userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceRecipient {\n");

    sb.append("    cfrPart11: ").append(toIndentedString(cfrPart11)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    digitalSignatureBase64: ")
        .append(toIndentedString(digitalSignatureBase64))
        .append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    initialsBase64: ").append(toIndentedString(initialsBase64)).append("\n");
    sb.append("    inPersonEmail: ").append(toIndentedString(inPersonEmail)).append("\n");
    sb.append("    isNotary: ").append(toIndentedString(isNotary)).append("\n");
    sb.append("    notarySealBase64: ").append(toIndentedString(notarySealBase64)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    recipientCompleteCount: ")
        .append(toIndentedString(recipientCompleteCount))
        .append("\n");
    sb.append("    recipientGuidId: ").append(toIndentedString(recipientGuidId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientStatus: ").append(toIndentedString(recipientStatus)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    rowState: ").append(toIndentedString(rowState)).append("\n");
    sb.append("    signatureBase64: ").append(toIndentedString(signatureBase64)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    signerApplyTabs: ").append(toIndentedString(signerApplyTabs)).append("\n");
    sb.append("    signerAttachmentBase64: ")
        .append(toIndentedString(signerAttachmentBase64))
        .append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
