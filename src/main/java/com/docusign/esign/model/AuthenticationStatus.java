package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EventResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class AuthenticationStatus   {
  
  private EventResult accessCodeResult = null;
  private EventResult phoneAuthResult = null;
  private EventResult idLookupResult = null;
  private EventResult idQuestionsResult = null;
  private EventResult ageVerifyResult = null;
  private EventResult sTANPinResult = null;
  private EventResult ofacResult = null;
  private EventResult liveIDResult = null;
  private EventResult facebookResult = null;
  private EventResult googleResult = null;
  private EventResult linkedinResult = null;
  private EventResult salesforceResult = null;
  private EventResult twitterResult = null;
  private EventResult openIDResult = null;
  private EventResult anySocialIDResult = null;
  private EventResult yahooResult = null;
  private EventResult smsAuthResult = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accessCodeResult")
  public EventResult getAccessCodeResult() {
    return accessCodeResult;
  }
  public void setAccessCodeResult(EventResult accessCodeResult) {
    this.accessCodeResult = accessCodeResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phoneAuthResult")
  public EventResult getPhoneAuthResult() {
    return phoneAuthResult;
  }
  public void setPhoneAuthResult(EventResult phoneAuthResult) {
    this.phoneAuthResult = phoneAuthResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idLookupResult")
  public EventResult getIdLookupResult() {
    return idLookupResult;
  }
  public void setIdLookupResult(EventResult idLookupResult) {
    this.idLookupResult = idLookupResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idQuestionsResult")
  public EventResult getIdQuestionsResult() {
    return idQuestionsResult;
  }
  public void setIdQuestionsResult(EventResult idQuestionsResult) {
    this.idQuestionsResult = idQuestionsResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ageVerifyResult")
  public EventResult getAgeVerifyResult() {
    return ageVerifyResult;
  }
  public void setAgeVerifyResult(EventResult ageVerifyResult) {
    this.ageVerifyResult = ageVerifyResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sTANPinResult")
  public EventResult getSTANPinResult() {
    return sTANPinResult;
  }
  public void setSTANPinResult(EventResult sTANPinResult) {
    this.sTANPinResult = sTANPinResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ofacResult")
  public EventResult getOfacResult() {
    return ofacResult;
  }
  public void setOfacResult(EventResult ofacResult) {
    this.ofacResult = ofacResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("liveIDResult")
  public EventResult getLiveIDResult() {
    return liveIDResult;
  }
  public void setLiveIDResult(EventResult liveIDResult) {
    this.liveIDResult = liveIDResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("facebookResult")
  public EventResult getFacebookResult() {
    return facebookResult;
  }
  public void setFacebookResult(EventResult facebookResult) {
    this.facebookResult = facebookResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("googleResult")
  public EventResult getGoogleResult() {
    return googleResult;
  }
  public void setGoogleResult(EventResult googleResult) {
    this.googleResult = googleResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("linkedinResult")
  public EventResult getLinkedinResult() {
    return linkedinResult;
  }
  public void setLinkedinResult(EventResult linkedinResult) {
    this.linkedinResult = linkedinResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("salesforceResult")
  public EventResult getSalesforceResult() {
    return salesforceResult;
  }
  public void setSalesforceResult(EventResult salesforceResult) {
    this.salesforceResult = salesforceResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("twitterResult")
  public EventResult getTwitterResult() {
    return twitterResult;
  }
  public void setTwitterResult(EventResult twitterResult) {
    this.twitterResult = twitterResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("openIDResult")
  public EventResult getOpenIDResult() {
    return openIDResult;
  }
  public void setOpenIDResult(EventResult openIDResult) {
    this.openIDResult = openIDResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("anySocialIDResult")
  public EventResult getAnySocialIDResult() {
    return anySocialIDResult;
  }
  public void setAnySocialIDResult(EventResult anySocialIDResult) {
    this.anySocialIDResult = anySocialIDResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("yahooResult")
  public EventResult getYahooResult() {
    return yahooResult;
  }
  public void setYahooResult(EventResult yahooResult) {
    this.yahooResult = yahooResult;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smsAuthResult")
  public EventResult getSmsAuthResult() {
    return smsAuthResult;
  }
  public void setSmsAuthResult(EventResult smsAuthResult) {
    this.smsAuthResult = smsAuthResult;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationStatus authenticationStatus = (AuthenticationStatus) o;

    return true && Objects.equals(accessCodeResult, authenticationStatus.accessCodeResult) &&
        Objects.equals(phoneAuthResult, authenticationStatus.phoneAuthResult) &&
        Objects.equals(idLookupResult, authenticationStatus.idLookupResult) &&
        Objects.equals(idQuestionsResult, authenticationStatus.idQuestionsResult) &&
        Objects.equals(ageVerifyResult, authenticationStatus.ageVerifyResult) &&
        Objects.equals(sTANPinResult, authenticationStatus.sTANPinResult) &&
        Objects.equals(ofacResult, authenticationStatus.ofacResult) &&
        Objects.equals(liveIDResult, authenticationStatus.liveIDResult) &&
        Objects.equals(facebookResult, authenticationStatus.facebookResult) &&
        Objects.equals(googleResult, authenticationStatus.googleResult) &&
        Objects.equals(linkedinResult, authenticationStatus.linkedinResult) &&
        Objects.equals(salesforceResult, authenticationStatus.salesforceResult) &&
        Objects.equals(twitterResult, authenticationStatus.twitterResult) &&
        Objects.equals(openIDResult, authenticationStatus.openIDResult) &&
        Objects.equals(anySocialIDResult, authenticationStatus.anySocialIDResult) &&
        Objects.equals(yahooResult, authenticationStatus.yahooResult) &&
        Objects.equals(smsAuthResult, authenticationStatus.smsAuthResult)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCodeResult, phoneAuthResult, idLookupResult, idQuestionsResult, ageVerifyResult, sTANPinResult, ofacResult, liveIDResult, facebookResult, googleResult, linkedinResult, salesforceResult, twitterResult, openIDResult, anySocialIDResult, yahooResult, smsAuthResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationStatus {\n");
    
    sb.append("    accessCodeResult: ").append(toIndentedString(accessCodeResult)).append("\n");
    sb.append("    phoneAuthResult: ").append(toIndentedString(phoneAuthResult)).append("\n");
    sb.append("    idLookupResult: ").append(toIndentedString(idLookupResult)).append("\n");
    sb.append("    idQuestionsResult: ").append(toIndentedString(idQuestionsResult)).append("\n");
    sb.append("    ageVerifyResult: ").append(toIndentedString(ageVerifyResult)).append("\n");
    sb.append("    sTANPinResult: ").append(toIndentedString(sTANPinResult)).append("\n");
    sb.append("    ofacResult: ").append(toIndentedString(ofacResult)).append("\n");
    sb.append("    liveIDResult: ").append(toIndentedString(liveIDResult)).append("\n");
    sb.append("    facebookResult: ").append(toIndentedString(facebookResult)).append("\n");
    sb.append("    googleResult: ").append(toIndentedString(googleResult)).append("\n");
    sb.append("    linkedinResult: ").append(toIndentedString(linkedinResult)).append("\n");
    sb.append("    salesforceResult: ").append(toIndentedString(salesforceResult)).append("\n");
    sb.append("    twitterResult: ").append(toIndentedString(twitterResult)).append("\n");
    sb.append("    openIDResult: ").append(toIndentedString(openIDResult)).append("\n");
    sb.append("    anySocialIDResult: ").append(toIndentedString(anySocialIDResult)).append("\n");
    sb.append("    yahooResult: ").append(toIndentedString(yahooResult)).append("\n");
    sb.append("    smsAuthResult: ").append(toIndentedString(smsAuthResult)).append("\n");
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

