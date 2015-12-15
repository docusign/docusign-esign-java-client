package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class RecipientEmailNotification   {
  
  private String emailSubject = null;
  private String emailBody = null;
  private String supportedLanguage = null;

  
  /**
   * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   **/
  @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  @JsonProperty("emailSubject")
  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  
  /**
   * Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters.
   **/
  @ApiModelProperty(value = "Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters.")
  @JsonProperty("emailBody")
  public String getEmailBody() {
    return emailBody;
  }
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  
  /**
   * A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).
   **/
  @ApiModelProperty(value = "A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).")
  @JsonProperty("supportedLanguage")
  public String getSupportedLanguage() {
    return supportedLanguage;
  }
  public void setSupportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientEmailNotification recipientEmailNotification = (RecipientEmailNotification) o;
    return Objects.equals(emailSubject, recipientEmailNotification.emailSubject) &&
        Objects.equals(emailBody, recipientEmailNotification.emailBody) &&
        Objects.equals(supportedLanguage, recipientEmailNotification.supportedLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, emailBody, supportedLanguage);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEmailNotification {\n");
    
    sb.append("    emailSubject: ").append(StringUtil.toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBody: ").append(StringUtil.toIndentedString(emailBody)).append("\n");
    sb.append("    supportedLanguage: ").append(StringUtil.toIndentedString(supportedLanguage)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
