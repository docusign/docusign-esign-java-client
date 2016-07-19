package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RecipientEmailNotification   {
  
  private String emailSubject = null;
  private String emailBody = null;
  private String supportedLanguage = null;

  
  /**
   * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   **/
  public RecipientEmailNotification emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
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
  public RecipientEmailNotification emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters. ")
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
  public RecipientEmailNotification supportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A simple type enumeration of the language used. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bahasa Indonesia (id), Bahasa Melayu (ms) Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro),Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).")
  @JsonProperty("supportedLanguage")
  public String getSupportedLanguage() {
    return supportedLanguage;
  }
  public void setSupportedLanguage(String supportedLanguage) {
    this.supportedLanguage = supportedLanguage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientEmailNotification recipientEmailNotification = (RecipientEmailNotification) o;
    return Objects.equals(this.emailSubject, recipientEmailNotification.emailSubject) &&
        Objects.equals(this.emailBody, recipientEmailNotification.emailBody) &&
        Objects.equals(this.supportedLanguage, recipientEmailNotification.supportedLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, emailBody, supportedLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientEmailNotification {\n");
    
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
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

