package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EventResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about the authentication status..
 *
 */
@ApiModel(description = "Contains information about the authentication status.")

public class AuthenticationStatus {
  @JsonProperty("accessCodeResult")
  private EventResult accessCodeResult = null;

  @JsonProperty("ageVerifyResult")
  private EventResult ageVerifyResult = null;

  @JsonProperty("anySocialIDResult")
  private EventResult anySocialIDResult = null;

  @JsonProperty("facebookResult")
  private EventResult facebookResult = null;

  @JsonProperty("googleResult")
  private EventResult googleResult = null;

  @JsonProperty("identityVerificationResult")
  private EventResult identityVerificationResult = null;

  @JsonProperty("idLookupResult")
  private EventResult idLookupResult = null;

  @JsonProperty("idQuestionsResult")
  private EventResult idQuestionsResult = null;

  @JsonProperty("linkedinResult")
  private EventResult linkedinResult = null;

  @JsonProperty("liveIDResult")
  private EventResult liveIDResult = null;

  @JsonProperty("ofacResult")
  private EventResult ofacResult = null;

  @JsonProperty("openIDResult")
  private EventResult openIDResult = null;

  @JsonProperty("phoneAuthResult")
  private EventResult phoneAuthResult = null;

  @JsonProperty("salesforceResult")
  private EventResult salesforceResult = null;

  @JsonProperty("signatureProviderResult")
  private EventResult signatureProviderResult = null;

  @JsonProperty("smsAuthResult")
  private EventResult smsAuthResult = null;

  @JsonProperty("sTANPinResult")
  private EventResult sTANPinResult = null;

  @JsonProperty("twitterResult")
  private EventResult twitterResult = null;

  @JsonProperty("yahooResult")
  private EventResult yahooResult = null;


  /**
   * accessCodeResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus accessCodeResult(EventResult accessCodeResult) {
    this.accessCodeResult = accessCodeResult;
    return this;
  }

  /**
   * The result of a user's attempt to authenticate by using an access code. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return accessCodeResult
   **/
  @ApiModelProperty(value = "The result of a user's attempt to authenticate by using an access code. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getAccessCodeResult() {
    return accessCodeResult;
  }

  /**
   * setAccessCodeResult.
   **/
  public void setAccessCodeResult(EventResult accessCodeResult) {
    this.accessCodeResult = accessCodeResult;
  }


  /**
   * ageVerifyResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus ageVerifyResult(EventResult ageVerifyResult) {
    this.ageVerifyResult = ageVerifyResult;
    return this;
  }

  /**
   * The result of an age verification check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return ageVerifyResult
   **/
  @ApiModelProperty(value = "The result of an age verification check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getAgeVerifyResult() {
    return ageVerifyResult;
  }

  /**
   * setAgeVerifyResult.
   **/
  public void setAgeVerifyResult(EventResult ageVerifyResult) {
    this.ageVerifyResult = ageVerifyResult;
  }


  /**
   * anySocialIDResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus anySocialIDResult(EventResult anySocialIDResult) {
    this.anySocialIDResult = anySocialIDResult;
    return this;
  }

  /**
   * Deprecated..
   * @return anySocialIDResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getAnySocialIDResult() {
    return anySocialIDResult;
  }

  /**
   * setAnySocialIDResult.
   **/
  public void setAnySocialIDResult(EventResult anySocialIDResult) {
    this.anySocialIDResult = anySocialIDResult;
  }


  /**
   * facebookResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus facebookResult(EventResult facebookResult) {
    this.facebookResult = facebookResult;
    return this;
  }

  /**
   * Deprecated..
   * @return facebookResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getFacebookResult() {
    return facebookResult;
  }

  /**
   * setFacebookResult.
   **/
  public void setFacebookResult(EventResult facebookResult) {
    this.facebookResult = facebookResult;
  }


  /**
   * googleResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus googleResult(EventResult googleResult) {
    this.googleResult = googleResult;
    return this;
  }

  /**
   * Deprecated..
   * @return googleResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getGoogleResult() {
    return googleResult;
  }

  /**
   * setGoogleResult.
   **/
  public void setGoogleResult(EventResult googleResult) {
    this.googleResult = googleResult;
  }


  /**
   * identityVerificationResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus identityVerificationResult(EventResult identityVerificationResult) {
    this.identityVerificationResult = identityVerificationResult;
    return this;
  }

  /**
   * The result of an [Identity Verification][IDV] workflow.  [IDV]: /docs/esign-rest-api/reference/accounts/identityverifications/.
   * @return identityVerificationResult
   **/
  @ApiModelProperty(value = "The result of an [Identity Verification][IDV] workflow.  [IDV]: /docs/esign-rest-api/reference/accounts/identityverifications/")
  public EventResult getIdentityVerificationResult() {
    return identityVerificationResult;
  }

  /**
   * setIdentityVerificationResult.
   **/
  public void setIdentityVerificationResult(EventResult identityVerificationResult) {
    this.identityVerificationResult = identityVerificationResult;
  }


  /**
   * idLookupResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus idLookupResult(EventResult idLookupResult) {
    this.idLookupResult = idLookupResult;
    return this;
  }

  /**
   * The result of an ID lookup authentication check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return idLookupResult
   **/
  @ApiModelProperty(value = "The result of an ID lookup authentication check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getIdLookupResult() {
    return idLookupResult;
  }

  /**
   * setIdLookupResult.
   **/
  public void setIdLookupResult(EventResult idLookupResult) {
    this.idLookupResult = idLookupResult;
  }


  /**
   * idQuestionsResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus idQuestionsResult(EventResult idQuestionsResult) {
    this.idQuestionsResult = idQuestionsResult;
    return this;
  }

  /**
   * The result of the user's answers to ID challenge questions. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return idQuestionsResult
   **/
  @ApiModelProperty(value = "The result of the user's answers to ID challenge questions. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getIdQuestionsResult() {
    return idQuestionsResult;
  }

  /**
   * setIdQuestionsResult.
   **/
  public void setIdQuestionsResult(EventResult idQuestionsResult) {
    this.idQuestionsResult = idQuestionsResult;
  }


  /**
   * linkedinResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus linkedinResult(EventResult linkedinResult) {
    this.linkedinResult = linkedinResult;
    return this;
  }

  /**
   * Deprecated..
   * @return linkedinResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getLinkedinResult() {
    return linkedinResult;
  }

  /**
   * setLinkedinResult.
   **/
  public void setLinkedinResult(EventResult linkedinResult) {
    this.linkedinResult = linkedinResult;
  }


  /**
   * liveIDResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus liveIDResult(EventResult liveIDResult) {
    this.liveIDResult = liveIDResult;
    return this;
  }

  /**
   * Deprecated..
   * @return liveIDResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getLiveIDResult() {
    return liveIDResult;
  }

  /**
   * setLiveIDResult.
   **/
  public void setLiveIDResult(EventResult liveIDResult) {
    this.liveIDResult = liveIDResult;
  }


  /**
   * ofacResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus ofacResult(EventResult ofacResult) {
    this.ofacResult = ofacResult;
    return this;
  }

  /**
   * The result of an Office of Foreign Asset Control (OFAC) check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return ofacResult
   **/
  @ApiModelProperty(value = "The result of an Office of Foreign Asset Control (OFAC) check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getOfacResult() {
    return ofacResult;
  }

  /**
   * setOfacResult.
   **/
  public void setOfacResult(EventResult ofacResult) {
    this.ofacResult = ofacResult;
  }


  /**
   * openIDResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus openIDResult(EventResult openIDResult) {
    this.openIDResult = openIDResult;
    return this;
  }

  /**
   * Deprecated..
   * @return openIDResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getOpenIDResult() {
    return openIDResult;
  }

  /**
   * setOpenIDResult.
   **/
  public void setOpenIDResult(EventResult openIDResult) {
    this.openIDResult = openIDResult;
  }


  /**
   * phoneAuthResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus phoneAuthResult(EventResult phoneAuthResult) {
    this.phoneAuthResult = phoneAuthResult;
    return this;
  }

  /**
   * The result of the user's attempt to authenticate by using two-factor authentication (2FA) through phone messaging. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return phoneAuthResult
   **/
  @ApiModelProperty(value = "The result of the user's attempt to authenticate by using two-factor authentication (2FA) through phone messaging. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getPhoneAuthResult() {
    return phoneAuthResult;
  }

  /**
   * setPhoneAuthResult.
   **/
  public void setPhoneAuthResult(EventResult phoneAuthResult) {
    this.phoneAuthResult = phoneAuthResult;
  }


  /**
   * salesforceResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus salesforceResult(EventResult salesforceResult) {
    this.salesforceResult = salesforceResult;
    return this;
  }

  /**
   * Success/failure result of authentication using sign-in with a Salesforce account. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return salesforceResult
   **/
  @ApiModelProperty(value = "Success/failure result of authentication using sign-in with a Salesforce account. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getSalesforceResult() {
    return salesforceResult;
  }

  /**
   * setSalesforceResult.
   **/
  public void setSalesforceResult(EventResult salesforceResult) {
    this.salesforceResult = salesforceResult;
  }


  /**
   * signatureProviderResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus signatureProviderResult(EventResult signatureProviderResult) {
    this.signatureProviderResult = signatureProviderResult;
    return this;
  }

  /**
   * The result of the user's attempt to authenticate by using a signature provider..
   * @return signatureProviderResult
   **/
  @ApiModelProperty(value = "The result of the user's attempt to authenticate by using a signature provider.")
  public EventResult getSignatureProviderResult() {
    return signatureProviderResult;
  }

  /**
   * setSignatureProviderResult.
   **/
  public void setSignatureProviderResult(EventResult signatureProviderResult) {
    this.signatureProviderResult = signatureProviderResult;
  }


  /**
   * smsAuthResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus smsAuthResult(EventResult smsAuthResult) {
    this.smsAuthResult = smsAuthResult;
    return this;
  }

  /**
   * The result of the user's attempt to authenticate by using two-factor authentication (2FA) through SMS messaging on a mobile phone..
   * @return smsAuthResult
   **/
  @ApiModelProperty(value = "The result of the user's attempt to authenticate by using two-factor authentication (2FA) through SMS messaging on a mobile phone.")
  public EventResult getSmsAuthResult() {
    return smsAuthResult;
  }

  /**
   * setSmsAuthResult.
   **/
  public void setSmsAuthResult(EventResult smsAuthResult) {
    this.smsAuthResult = smsAuthResult;
  }


  /**
   * sTANPinResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus sTANPinResult(EventResult sTANPinResult) {
    this.sTANPinResult = sTANPinResult;
    return this;
  }

  /**
   * The result of a Student Authentication Network (STAN) authentication check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. .
   * @return sTANPinResult
   **/
  @ApiModelProperty(value = "The result of a Student Authentication Network (STAN) authentication check. It returns:  - `Status`: `Pass` or `Fail`. - `dateTime`: The date and time that the event occurred. - `FailureDescription`: A string containing the details about a failed authentication. - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication. ")
  public EventResult getSTANPinResult() {
    return sTANPinResult;
  }

  /**
   * setSTANPinResult.
   **/
  public void setSTANPinResult(EventResult sTANPinResult) {
    this.sTANPinResult = sTANPinResult;
  }


  /**
   * twitterResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus twitterResult(EventResult twitterResult) {
    this.twitterResult = twitterResult;
    return this;
  }

  /**
   * Deprecated..
   * @return twitterResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getTwitterResult() {
    return twitterResult;
  }

  /**
   * setTwitterResult.
   **/
  public void setTwitterResult(EventResult twitterResult) {
    this.twitterResult = twitterResult;
  }


  /**
   * yahooResult.
   *
   * @return AuthenticationStatus
   **/
  public AuthenticationStatus yahooResult(EventResult yahooResult) {
    this.yahooResult = yahooResult;
    return this;
  }

  /**
   * Deprecated..
   * @return yahooResult
   **/
  @ApiModelProperty(value = "Deprecated.")
  public EventResult getYahooResult() {
    return yahooResult;
  }

  /**
   * setYahooResult.
   **/
  public void setYahooResult(EventResult yahooResult) {
    this.yahooResult = yahooResult;
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
    AuthenticationStatus authenticationStatus = (AuthenticationStatus) o;
    return Objects.equals(this.accessCodeResult, authenticationStatus.accessCodeResult) &&
        Objects.equals(this.ageVerifyResult, authenticationStatus.ageVerifyResult) &&
        Objects.equals(this.anySocialIDResult, authenticationStatus.anySocialIDResult) &&
        Objects.equals(this.facebookResult, authenticationStatus.facebookResult) &&
        Objects.equals(this.googleResult, authenticationStatus.googleResult) &&
        Objects.equals(this.identityVerificationResult, authenticationStatus.identityVerificationResult) &&
        Objects.equals(this.idLookupResult, authenticationStatus.idLookupResult) &&
        Objects.equals(this.idQuestionsResult, authenticationStatus.idQuestionsResult) &&
        Objects.equals(this.linkedinResult, authenticationStatus.linkedinResult) &&
        Objects.equals(this.liveIDResult, authenticationStatus.liveIDResult) &&
        Objects.equals(this.ofacResult, authenticationStatus.ofacResult) &&
        Objects.equals(this.openIDResult, authenticationStatus.openIDResult) &&
        Objects.equals(this.phoneAuthResult, authenticationStatus.phoneAuthResult) &&
        Objects.equals(this.salesforceResult, authenticationStatus.salesforceResult) &&
        Objects.equals(this.signatureProviderResult, authenticationStatus.signatureProviderResult) &&
        Objects.equals(this.smsAuthResult, authenticationStatus.smsAuthResult) &&
        Objects.equals(this.sTANPinResult, authenticationStatus.sTANPinResult) &&
        Objects.equals(this.twitterResult, authenticationStatus.twitterResult) &&
        Objects.equals(this.yahooResult, authenticationStatus.yahooResult);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessCodeResult, ageVerifyResult, anySocialIDResult, facebookResult, googleResult, identityVerificationResult, idLookupResult, idQuestionsResult, linkedinResult, liveIDResult, ofacResult, openIDResult, phoneAuthResult, salesforceResult, signatureProviderResult, smsAuthResult, sTANPinResult, twitterResult, yahooResult);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationStatus {\n");
    
    sb.append("    accessCodeResult: ").append(toIndentedString(accessCodeResult)).append("\n");
    sb.append("    ageVerifyResult: ").append(toIndentedString(ageVerifyResult)).append("\n");
    sb.append("    anySocialIDResult: ").append(toIndentedString(anySocialIDResult)).append("\n");
    sb.append("    facebookResult: ").append(toIndentedString(facebookResult)).append("\n");
    sb.append("    googleResult: ").append(toIndentedString(googleResult)).append("\n");
    sb.append("    identityVerificationResult: ").append(toIndentedString(identityVerificationResult)).append("\n");
    sb.append("    idLookupResult: ").append(toIndentedString(idLookupResult)).append("\n");
    sb.append("    idQuestionsResult: ").append(toIndentedString(idQuestionsResult)).append("\n");
    sb.append("    linkedinResult: ").append(toIndentedString(linkedinResult)).append("\n");
    sb.append("    liveIDResult: ").append(toIndentedString(liveIDResult)).append("\n");
    sb.append("    ofacResult: ").append(toIndentedString(ofacResult)).append("\n");
    sb.append("    openIDResult: ").append(toIndentedString(openIDResult)).append("\n");
    sb.append("    phoneAuthResult: ").append(toIndentedString(phoneAuthResult)).append("\n");
    sb.append("    salesforceResult: ").append(toIndentedString(salesforceResult)).append("\n");
    sb.append("    signatureProviderResult: ").append(toIndentedString(signatureProviderResult)).append("\n");
    sb.append("    smsAuthResult: ").append(toIndentedString(smsAuthResult)).append("\n");
    sb.append("    sTANPinResult: ").append(toIndentedString(sTANPinResult)).append("\n");
    sb.append("    twitterResult: ").append(toIndentedString(twitterResult)).append("\n");
    sb.append("    yahooResult: ").append(toIndentedString(yahooResult)).append("\n");
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

