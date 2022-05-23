package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DisplayApplianceAccount */
public class DisplayApplianceAccount {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("optOutAutoNavTextAndTabColorUpdates")
  private Boolean optOutAutoNavTextAndTabColorUpdates = null;

  @JsonProperty("showInitialConditionalFields")
  private Boolean showInitialConditionalFields = null;

  @JsonProperty("signingVersion")
  private String signingVersion = null;

  @JsonProperty("tagHasSigBlock")
  private Boolean tagHasSigBlock = null;

  public DisplayApplianceAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID associated with the envelope.
   *
   * @return accountId
   */
  @ApiModelProperty(value = "The account ID associated with the envelope.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DisplayApplianceAccount optOutAutoNavTextAndTabColorUpdates(
      Boolean optOutAutoNavTextAndTabColorUpdates) {
    this.optOutAutoNavTextAndTabColorUpdates = optOutAutoNavTextAndTabColorUpdates;
    return this;
  }

  /** @return optOutAutoNavTextAndTabColorUpdates */
  @ApiModelProperty(value = "")
  public Boolean isOptOutAutoNavTextAndTabColorUpdates() {
    return optOutAutoNavTextAndTabColorUpdates;
  }

  public void setOptOutAutoNavTextAndTabColorUpdates(Boolean optOutAutoNavTextAndTabColorUpdates) {
    this.optOutAutoNavTextAndTabColorUpdates = optOutAutoNavTextAndTabColorUpdates;
  }

  public DisplayApplianceAccount showInitialConditionalFields(
      Boolean showInitialConditionalFields) {
    this.showInitialConditionalFields = showInitialConditionalFields;
    return this;
  }

  /** @return showInitialConditionalFields */
  @ApiModelProperty(value = "")
  public Boolean isShowInitialConditionalFields() {
    return showInitialConditionalFields;
  }

  public void setShowInitialConditionalFields(Boolean showInitialConditionalFields) {
    this.showInitialConditionalFields = showInitialConditionalFields;
  }

  public DisplayApplianceAccount signingVersion(String signingVersion) {
    this.signingVersion = signingVersion;
    return this;
  }

  /** @return signingVersion */
  @ApiModelProperty(value = "")
  public String getSigningVersion() {
    return signingVersion;
  }

  public void setSigningVersion(String signingVersion) {
    this.signingVersion = signingVersion;
  }

  public DisplayApplianceAccount tagHasSigBlock(Boolean tagHasSigBlock) {
    this.tagHasSigBlock = tagHasSigBlock;
    return this;
  }

  /** @return tagHasSigBlock */
  @ApiModelProperty(value = "")
  public Boolean isTagHasSigBlock() {
    return tagHasSigBlock;
  }

  public void setTagHasSigBlock(Boolean tagHasSigBlock) {
    this.tagHasSigBlock = tagHasSigBlock;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayApplianceAccount displayApplianceAccount = (DisplayApplianceAccount) o;
    return Objects.equals(this.accountId, displayApplianceAccount.accountId)
        && Objects.equals(
            this.optOutAutoNavTextAndTabColorUpdates,
            displayApplianceAccount.optOutAutoNavTextAndTabColorUpdates)
        && Objects.equals(
            this.showInitialConditionalFields, displayApplianceAccount.showInitialConditionalFields)
        && Objects.equals(this.signingVersion, displayApplianceAccount.signingVersion)
        && Objects.equals(this.tagHasSigBlock, displayApplianceAccount.tagHasSigBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        optOutAutoNavTextAndTabColorUpdates,
        showInitialConditionalFields,
        signingVersion,
        tagHasSigBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayApplianceAccount {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    optOutAutoNavTextAndTabColorUpdates: ")
        .append(toIndentedString(optOutAutoNavTextAndTabColorUpdates))
        .append("\n");
    sb.append("    showInitialConditionalFields: ")
        .append(toIndentedString(showInitialConditionalFields))
        .append("\n");
    sb.append("    signingVersion: ").append(toIndentedString(signingVersion)).append("\n");
    sb.append("    tagHasSigBlock: ").append(toIndentedString(tagHasSigBlock)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
