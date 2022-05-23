package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RecipientEmailNotification. */
public class RecipientEmailNotification {
  @JsonProperty("emailBody")
  private String emailBody = null;

  @JsonProperty("emailBodyMetadata")
  private PropertyMetadata emailBodyMetadata = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("emailSubjectMetadata")
  private PropertyMetadata emailSubjectMetadata = null;

  @JsonProperty("supportedLanguage")
  private String supportedLanguage = null;

  @JsonProperty("supportedLanguageMetadata")
  private PropertyMetadata supportedLanguageMetadata = null;

  /**
   * emailBody.
   *
   * @return RecipientEmailNotification
   */
  public RecipientEmailNotification emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }

  /**
   * Specifies the email body of the message sent to the recipient. Maximum length: 10000
   * characters. .
   *
   * @return emailBody
   */
  @ApiModelProperty(
      value =
          "Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. ")
  public String getEmailBody() {
    return emailBody;
  }

  /** setEmailBody. */
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  /**
   * emailBodyMetadata.
   *
   * @return RecipientEmailNotification
   */
  public RecipientEmailNotification emailBodyMetadata(PropertyMetadata emailBodyMetadata) {
    this.emailBodyMetadata = emailBodyMetadata;
    return this;
  }

  /**
   * Get emailBodyMetadata.
   *
   * @return emailBodyMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getEmailBodyMetadata() {
    return emailBodyMetadata;
  }

  /** setEmailBodyMetadata. */
  public void setEmailBodyMetadata(PropertyMetadata emailBodyMetadata) {
    this.emailBodyMetadata = emailBodyMetadata;
  }

  /**
   * emailSubject.
   *
   * @return RecipientEmailNotification
   */
  public RecipientEmailNotification emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Specifies the subject of the email that is sent to all recipients. See [ML:Template Email
   * Subject Merge Fields] for information about adding merge field information to the email
   * subject..
   *
   * @return emailSubject
   */
  @ApiModelProperty(
      value =
          "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  /** setEmailSubject. */
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  /**
   * emailSubjectMetadata.
   *
   * @return RecipientEmailNotification
   */
  public RecipientEmailNotification emailSubjectMetadata(PropertyMetadata emailSubjectMetadata) {
    this.emailSubjectMetadata = emailSubjectMetadata;
    return this;
  }

  /**
   * Get emailSubjectMetadata.
   *
   * @return emailSubjectMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getEmailSubjectMetadata() {
    return emailSubjectMetadata;
  }

  /** setEmailSubjectMetadata. */
  public void setEmailSubjectMetadata(PropertyMetadata emailSubjectMetadata) {
    this.emailSubjectMetadata = emailSubjectMetadata;
  }

  /**
   * supportedLanguage.
   *
   * @return RecipientEmailNotification
   */
  public RecipientEmailNotification supportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
    return this;
  }

  /**
   * A simple type enumeration of the language used. The supported languages, with the language
   * value shown in parenthesis, are: Arabic (ar), Armenian (hy), Bahasa Indonesia (id), Bahasa
   * Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional
   * (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian
   * (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el),
   * Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian
   * (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR),
   * Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish
   * Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese
   * (vi)..
   *
   * @return supportedLanguage
   */
  @ApiModelProperty(
      value =
          "A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Armenian (hy), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).")
  public String getSupportedLanguage() {
    return supportedLanguage;
  }

  /** setSupportedLanguage. */
  public void setSupportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
  }

  /**
   * supportedLanguageMetadata.
   *
   * @return RecipientEmailNotification
   */
  public RecipientEmailNotification supportedLanguageMetadata(
      PropertyMetadata supportedLanguageMetadata) {
    this.supportedLanguageMetadata = supportedLanguageMetadata;
    return this;
  }

  /**
   * Get supportedLanguageMetadata.
   *
   * @return supportedLanguageMetadata
   */
  @ApiModelProperty(value = "")
  public PropertyMetadata getSupportedLanguageMetadata() {
    return supportedLanguageMetadata;
  }

  /** setSupportedLanguageMetadata. */
  public void setSupportedLanguageMetadata(PropertyMetadata supportedLanguageMetadata) {
    this.supportedLanguageMetadata = supportedLanguageMetadata;
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
    RecipientEmailNotification recipientEmailNotification = (RecipientEmailNotification) o;
    return Objects.equals(this.emailBody, recipientEmailNotification.emailBody)
        && Objects.equals(this.emailBodyMetadata, recipientEmailNotification.emailBodyMetadata)
        && Objects.equals(this.emailSubject, recipientEmailNotification.emailSubject)
        && Objects.equals(
            this.emailSubjectMetadata, recipientEmailNotification.emailSubjectMetadata)
        && Objects.equals(this.supportedLanguage, recipientEmailNotification.supportedLanguage)
        && Objects.equals(
            this.supportedLanguageMetadata, recipientEmailNotification.supportedLanguageMetadata);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        emailBody,
        emailBodyMetadata,
        emailSubject,
        emailSubjectMetadata,
        supportedLanguage,
        supportedLanguageMetadata);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEmailNotification {\n");

    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    emailBodyMetadata: ").append(toIndentedString(emailBodyMetadata)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailSubjectMetadata: ")
        .append(toIndentedString(emailSubjectMetadata))
        .append("\n");
    sb.append("    supportedLanguage: ").append(toIndentedString(supportedLanguage)).append("\n");
    sb.append("    supportedLanguageMetadata: ")
        .append(toIndentedString(supportedLanguageMetadata))
        .append("\n");
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
