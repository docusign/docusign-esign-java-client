package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientPreviewRequest
 */

public class RecipientPreviewRequest {
  @JsonProperty("assertionId")
  private String assertionId = null;

  @JsonProperty("authenticationInstant")
  private String authenticationInstant = null;

  @JsonProperty("authenticationMethod")
  private String authenticationMethod = null;

  @JsonProperty("pingFrequency")
  private String pingFrequency = null;

  @JsonProperty("pingUrl")
  private String pingUrl = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("securityDomain")
  private String securityDomain = null;

  @JsonProperty("xFrameOptions")
  private String xFrameOptions = null;

  @JsonProperty("xFrameOptionsAllowFromUrl")
  private String xFrameOptionsAllowFromUrl = null;

  public RecipientPreviewRequest assertionId(String assertionId) {
    this.assertionId = assertionId;
    return this;
  }

   /**
   * 
   * @return assertionId
  **/
  @ApiModelProperty(value = "")
  public String getAssertionId() {
    return assertionId;
  }

  public void setAssertionId(String assertionId) {
    this.assertionId = assertionId;
  }

  public RecipientPreviewRequest authenticationInstant(String authenticationInstant) {
    this.authenticationInstant = authenticationInstant;
    return this;
  }

   /**
   * 
   * @return authenticationInstant
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationInstant() {
    return authenticationInstant;
  }

  public void setAuthenticationInstant(String authenticationInstant) {
    this.authenticationInstant = authenticationInstant;
  }

  public RecipientPreviewRequest authenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * 
   * @return authenticationMethod
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public RecipientPreviewRequest pingFrequency(String pingFrequency) {
    this.pingFrequency = pingFrequency;
    return this;
  }

   /**
   * 
   * @return pingFrequency
  **/
  @ApiModelProperty(value = "")
  public String getPingFrequency() {
    return pingFrequency;
  }

  public void setPingFrequency(String pingFrequency) {
    this.pingFrequency = pingFrequency;
  }

  public RecipientPreviewRequest pingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
    return this;
  }

   /**
   * 
   * @return pingUrl
  **/
  @ApiModelProperty(value = "")
  public String getPingUrl() {
    return pingUrl;
  }

  public void setPingUrl(String pingUrl) {
    this.pingUrl = pingUrl;
  }

  public RecipientPreviewRequest recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public RecipientPreviewRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * 
   * @return returnUrl
  **/
  @ApiModelProperty(value = "")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public RecipientPreviewRequest securityDomain(String securityDomain) {
    this.securityDomain = securityDomain;
    return this;
  }

   /**
   * 
   * @return securityDomain
  **/
  @ApiModelProperty(value = "")
  public String getSecurityDomain() {
    return securityDomain;
  }

  public void setSecurityDomain(String securityDomain) {
    this.securityDomain = securityDomain;
  }

  public RecipientPreviewRequest xFrameOptions(String xFrameOptions) {
    this.xFrameOptions = xFrameOptions;
    return this;
  }

   /**
   * 
   * @return xFrameOptions
  **/
  @ApiModelProperty(value = "")
  public String getXFrameOptions() {
    return xFrameOptions;
  }

  public void setXFrameOptions(String xFrameOptions) {
    this.xFrameOptions = xFrameOptions;
  }

  public RecipientPreviewRequest xFrameOptionsAllowFromUrl(String xFrameOptionsAllowFromUrl) {
    this.xFrameOptionsAllowFromUrl = xFrameOptionsAllowFromUrl;
    return this;
  }

   /**
   * 
   * @return xFrameOptionsAllowFromUrl
  **/
  @ApiModelProperty(value = "")
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
    RecipientPreviewRequest recipientPreviewRequest = (RecipientPreviewRequest) o;
    return Objects.equals(this.assertionId, recipientPreviewRequest.assertionId) &&
        Objects.equals(this.authenticationInstant, recipientPreviewRequest.authenticationInstant) &&
        Objects.equals(this.authenticationMethod, recipientPreviewRequest.authenticationMethod) &&
        Objects.equals(this.pingFrequency, recipientPreviewRequest.pingFrequency) &&
        Objects.equals(this.pingUrl, recipientPreviewRequest.pingUrl) &&
        Objects.equals(this.recipientId, recipientPreviewRequest.recipientId) &&
        Objects.equals(this.returnUrl, recipientPreviewRequest.returnUrl) &&
        Objects.equals(this.securityDomain, recipientPreviewRequest.securityDomain) &&
        Objects.equals(this.xFrameOptions, recipientPreviewRequest.xFrameOptions) &&
        Objects.equals(this.xFrameOptionsAllowFromUrl, recipientPreviewRequest.xFrameOptionsAllowFromUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assertionId, authenticationInstant, authenticationMethod, pingFrequency, pingUrl, recipientId, returnUrl, securityDomain, xFrameOptions, xFrameOptionsAllowFromUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPreviewRequest {\n");
    
    sb.append("    assertionId: ").append(toIndentedString(assertionId)).append("\n");
    sb.append("    authenticationInstant: ").append(toIndentedString(authenticationInstant)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    pingFrequency: ").append(toIndentedString(pingFrequency)).append("\n");
    sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

