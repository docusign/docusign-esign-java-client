package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientEmailNotification.
 *
 */

public class RecipientEmailNotification {
  @JsonProperty("emailBody")
  private String emailBody = null;

  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("supportedLanguage")
  private String supportedLanguage = null;


  /**
   * emailBody.
   *
   * @return RecipientEmailNotification
   **/
  public RecipientEmailNotification emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }

  /**
   * Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. .
   * @return emailBody
   **/
  @ApiModelProperty(value = "Specifies the email body of the message sent to the recipient.   Maximum length: 10000 characters. ")
  public String getEmailBody() {
    return emailBody;
  }

  /**
   * setEmailBody.
   **/
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }


  /**
   * emailSubject.
   *
   * @return RecipientEmailNotification
   **/
  public RecipientEmailNotification emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

  /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject..
   * @return emailSubject
   **/
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  /**
   * setEmailSubject.
   **/
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  /**
   * supportedLanguage.
   *
   * @return RecipientEmailNotification
   **/
  public RecipientEmailNotification supportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
    return this;
  }

  /**
   * A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Armenian (hy), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi)..
   * @return supportedLanguage
   **/
  @ApiModelProperty(value = "A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Armenian (hy), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).")
  public String getSupportedLanguage() {
    return supportedLanguage;
  }

  /**
   * setSupportedLanguage.
   **/
  public void setSupportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
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
    return Objects.equals(this.emailBody, recipientEmailNotification.emailBody) &&
        Objects.equals(this.emailSubject, recipientEmailNotification.emailSubject) &&
        Objects.equals(this.supportedLanguage, recipientEmailNotification.supportedLanguage);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(emailBody, emailSubject, supportedLanguage);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEmailNotification {\n");
    
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    supportedLanguage: ").append(toIndentedString(supportedLanguage)).append("\n");
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

