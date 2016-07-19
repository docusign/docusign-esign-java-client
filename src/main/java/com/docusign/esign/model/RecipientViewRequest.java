package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-18T18:11:15.675-07:00")
public class RecipientViewRequest   {
  
  private String clientUserId = null;
  private String userId = null;
  private String userName = null;
  private String email = null;
  private String recipientId = null;
  private String returnUrl = null;
  private String pingUrl = null;
  private String pingFrequency = null;
  private String authenticationMethod = null;
  private String assertionId = null;
  private String authenticationInstant = null;
  private String securityDomain = null;
  private String xFrameOptions = null;
  private String xFrameOptionsAllowFromUrl = null;

  
  /**
   * A sender created value that shows the recipient is embedded (captive). \n\nMaximum length: 100 characters.
   **/
  public RecipientViewRequest clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A sender created value that shows the recipient is embedded (captive). \n\nMaximum length: 100 characters.")
  @JsonProperty("clientUserId")
  public String getClientUserId() {
    return clientUserId;
  }
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  
  /**
   * Specifies the user ID of the recipient. You can use with user ID or email and user name to identify the recipient. If user ID is used and a client user ID is provided, the value in the `userId` property must match a recipient ID (which can be retrieved with a GET recipients call) for the envelope. If a user ID is used and a clientUser ID is not provided, the user ID match the user ID of the authenticating user.
   **/
  public RecipientViewRequest userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the user ID of the recipient. You can use with user ID or email and user name to identify the recipient. If user ID is used and a client user ID is provided, the value in the `userId` property must match a recipient ID (which can be retrieved with a GET recipients call) for the envelope. If a user ID is used and a clientUser ID is not provided, the user ID match the user ID of the authenticating user.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Specifies the username of the recipient. You can use either email and userName or userId to identify the recipient.
   **/
  public RecipientViewRequest userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the username of the recipient. You can use either email and userName or userId to identify the recipient.")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * Specifies the email of the recipient. You can use either email and userName or userId to identify the recipient.
   **/
  public RecipientViewRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the email of the recipient. You can use either email and userName or userId to identify the recipient.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  public RecipientViewRequest recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   * The url the recipient is redirected to after the signing session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your application. Possible event parameter values: \n\n* cancel (recipient canceled the signing operation)\n* decline (recipient declined to sign)\n* exception (an exception occurred)\n* fax_pending (recipient has a fax pending)\n* session_timeout (session timed out)\n* signing_complete (signer completed the signing ceremony)\n* ttl_expired (the TTL, time to live, timer expired)\n* viewing_complete (recipient completed viewing the envelope)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. 
   **/
  public RecipientViewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url the recipient is redirected to after the signing session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your application. Possible event parameter values: \n\n* cancel (recipient canceled the signing operation)\n* decline (recipient declined to sign)\n* exception (an exception occurred)\n* fax_pending (recipient has a fax pending)\n* session_timeout (session timed out)\n* signing_complete (signer completed the signing ceremony)\n* ttl_expired (the TTL, time to live, timer expired)\n* viewing_complete (recipient completed viewing the envelope)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. ")
  @JsonProperty("returnUrl")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  
  /**
   * A client Url to be pinged by the DocuSign Signing experience to indicate to the client that Signing is active. An HTTP Get is executed against the client. The response from the client is ignored. The intent is for the client to reset it's session timer when the request is received.
   **/
  public RecipientViewRequest pingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A client Url to be pinged by the DocuSign Signing experience to indicate to the client that Signing is active. An HTTP Get is executed against the client. The response from the client is ignored. The intent is for the client to reset it's session timer when the request is received.")
  @JsonProperty("pingUrl")
  public String getPingUrl() {
    return pingUrl;
  }
  public void setPingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
  }

  
  /**
   * Only used if pingUrl is specified. This is the interval, in seconds, between pings on the pingUrl.  The default is 300 seconds. Valid values are 60-1200 seconds.
   **/
  public RecipientViewRequest pingFrequency(String pingFrequency) {
    this.pingFrequency = pingFrequency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only used if pingUrl is specified. This is the interval, in seconds, between pings on the pingUrl.  The default is 300 seconds. Valid values are 60-1200 seconds.")
  @JsonProperty("pingFrequency")
  public String getPingFrequency() {
    return pingFrequency;
  }
  public void setPingFrequency(String pingFrequency) {
    this.pingFrequency = pingFrequency;
  }

  
  /**
   * A sender created value that indicates the convention used to authenticate the signer. This information is included in the Certificate of Completion.
   **/
  public RecipientViewRequest authenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A sender created value that indicates the convention used to authenticate the signer. This information is included in the Certificate of Completion.")
  @JsonProperty("authenticationMethod")
  public String getAuthenticationMethod() {
    return authenticationMethod;
  }
  public void setAuthenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  
  /**
   * A unique identifier of the authentication event executed by the client application.
   **/
  public RecipientViewRequest assertionId(String assertionId) {
    this.assertionId = assertionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique identifier of the authentication event executed by the client application.")
  @JsonProperty("assertionId")
  public String getAssertionId() {
    return assertionId;
  }
  public void setAssertionId(String assertionId) {
    this.assertionId = assertionId;
  }

  
  /**
   * A sender generated value that indicates the date/time that the signer was authenticated.
   **/
  public RecipientViewRequest authenticationInstant(String authenticationInstant) {
    this.authenticationInstant = authenticationInstant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A sender generated value that indicates the date/time that the signer was authenticated.")
  @JsonProperty("authenticationInstant")
  public String getAuthenticationInstant() {
    return authenticationInstant;
  }
  public void setAuthenticationInstant(String authenticationInstant) {
    this.authenticationInstant = authenticationInstant;
  }

  
  /**
   * The domain in which the user authenticated.
   **/
  public RecipientViewRequest securityDomain(String securityDomain) {
    this.securityDomain = securityDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The domain in which the user authenticated.")
  @JsonProperty("securityDomain")
  public String getSecurityDomain() {
    return securityDomain;
  }
  public void setSecurityDomain(String securityDomain) {
    this.securityDomain = securityDomain;
  }

  
  /**
   * 
   **/
  public RecipientViewRequest xFrameOptions(String xFrameOptions) {
    this.xFrameOptions = xFrameOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("xFrameOptions")
  public String getXFrameOptions() {
    return xFrameOptions;
  }
  public void setXFrameOptions(String xFrameOptions) {
    this.xFrameOptions = xFrameOptions;
  }

  
  /**
   * 
   **/
  public RecipientViewRequest xFrameOptionsAllowFromUrl(String xFrameOptionsAllowFromUrl) {
    this.xFrameOptionsAllowFromUrl = xFrameOptionsAllowFromUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("xFrameOptionsAllowFromUrl")
  public String getXFrameOptionsAllowFromUrl() {
    return xFrameOptionsAllowFromUrl;
  }
  public void setXFrameOptionsAllowFromUrl(String xFrameOptionsAllowFromUrl) {
    this.xFrameOptionsAllowFromUrl = xFrameOptionsAllowFromUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientViewRequest recipientViewRequest = (RecipientViewRequest) o;
    return Objects.equals(this.clientUserId, recipientViewRequest.clientUserId) &&
        Objects.equals(this.userId, recipientViewRequest.userId) &&
        Objects.equals(this.userName, recipientViewRequest.userName) &&
        Objects.equals(this.email, recipientViewRequest.email) &&
        Objects.equals(this.recipientId, recipientViewRequest.recipientId) &&
        Objects.equals(this.returnUrl, recipientViewRequest.returnUrl) &&
        Objects.equals(this.pingUrl, recipientViewRequest.pingUrl) &&
        Objects.equals(this.pingFrequency, recipientViewRequest.pingFrequency) &&
        Objects.equals(this.authenticationMethod, recipientViewRequest.authenticationMethod) &&
        Objects.equals(this.assertionId, recipientViewRequest.assertionId) &&
        Objects.equals(this.authenticationInstant, recipientViewRequest.authenticationInstant) &&
        Objects.equals(this.securityDomain, recipientViewRequest.securityDomain) &&
        Objects.equals(this.xFrameOptions, recipientViewRequest.xFrameOptions) &&
        Objects.equals(this.xFrameOptionsAllowFromUrl, recipientViewRequest.xFrameOptionsAllowFromUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, userId, userName, email, recipientId, returnUrl, pingUrl, pingFrequency, authenticationMethod, assertionId, authenticationInstant, securityDomain, xFrameOptions, xFrameOptionsAllowFromUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientViewRequest {\n");
    
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    pingFrequency: ").append(toIndentedString(pingFrequency)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    assertionId: ").append(toIndentedString(assertionId)).append("\n");
    sb.append("    authenticationInstant: ").append(toIndentedString(authenticationInstant)).append("\n");
    sb.append("    securityDomain: ").append(toIndentedString(securityDomain)).append("\n");
    sb.append("    xFrameOptions: ").append(toIndentedString(xFrameOptions)).append("\n");
    sb.append("    xFrameOptionsAllowFromUrl: ").append(toIndentedString(xFrameOptionsAllowFromUrl)).append("\n");
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

