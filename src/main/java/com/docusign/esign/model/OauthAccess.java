package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OauthAccess
 */

public class OauthAccess {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("data")
  private java.util.List<NameValue> data = new java.util.ArrayList<NameValue>();

  @JsonProperty("expires_in")
  private String expiresIn = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  public OauthAccess accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token information.
   * @return accessToken
  **/
  @ApiModelProperty(example = "null", value = "Access token information.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccess data(java.util.List<NameValue> data) {
    this.data = data;
    return this;
  }

  public OauthAccess addDataItem(NameValue dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * 
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<NameValue> getData() {
    return data;
  }

  public void setData(java.util.List<NameValue> data) {
    this.data = data;
  }

  public OauthAccess expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 
   * @return expiresIn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccess refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 
   * @return refreshToken
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccess scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Must be set to \"api\".
   * @return scope
  **/
  @ApiModelProperty(example = "null", value = "Must be set to \"api\".")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthAccess tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * 
   * @return tokenType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccess oauthAccess = (OauthAccess) o;
    return Objects.equals(this.accessToken, oauthAccess.accessToken) &&
        Objects.equals(this.data, oauthAccess.data) &&
        Objects.equals(this.expiresIn, oauthAccess.expiresIn) &&
        Objects.equals(this.refreshToken, oauthAccess.refreshToken) &&
        Objects.equals(this.scope, oauthAccess.scope) &&
        Objects.equals(this.tokenType, oauthAccess.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, data, expiresIn, refreshToken, scope, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccess {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

