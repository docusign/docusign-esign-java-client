package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OauthAccess.
 *
 */

public class OauthAccess {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("data")
  private java.util.List<NameValue> data = null;

  @JsonProperty("expires_in")
  private String expiresIn = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("token_type")
  private String tokenType = null;


  /**
   * accessToken.
   *
   * @return OauthAccess
   **/
  public OauthAccess accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Access token information..
   * @return accessToken
   **/
  @Schema(description = "Access token information.")
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * setAccessToken.
   **/
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  /**
   * data.
   *
   * @return OauthAccess
   **/
  public OauthAccess data(java.util.List<NameValue> data) {
    this.data = data;
    return this;
  }
  
  /**
   * addDataItem.
   *
   * @return OauthAccess
   **/
  public OauthAccess addDataItem(NameValue dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * .
   * @return data
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getData() {
    return data;
  }

  /**
   * setData.
   **/
  public void setData(java.util.List<NameValue> data) {
    this.data = data;
  }


  /**
   * expiresIn.
   *
   * @return OauthAccess
   **/
  public OauthAccess expiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * .
   * @return expiresIn
   **/
  @Schema(description = "")
  public String getExpiresIn() {
    return expiresIn;
  }

  /**
   * setExpiresIn.
   **/
  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  /**
   * refreshToken.
   *
   * @return OauthAccess
   **/
  public OauthAccess refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * .
   * @return refreshToken
   **/
  @Schema(description = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * setRefreshToken.
   **/
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   * scope.
   *
   * @return OauthAccess
   **/
  public OauthAccess scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Must be set to \"api\"..
   * @return scope
   **/
  @Schema(description = "Must be set to \"api\".")
  public String getScope() {
    return scope;
  }

  /**
   * setScope.
   **/
  public void setScope(String scope) {
    this.scope = scope;
  }


  /**
   * tokenType.
   *
   * @return OauthAccess
   **/
  public OauthAccess tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * .
   * @return tokenType
   **/
  @Schema(description = "")
  public String getTokenType() {
    return tokenType;
  }

  /**
   * setTokenType.
   **/
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
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
    OauthAccess oauthAccess = (OauthAccess) o;
    return Objects.equals(this.accessToken, oauthAccess.accessToken) &&
        Objects.equals(this.data, oauthAccess.data) &&
        Objects.equals(this.expiresIn, oauthAccess.expiresIn) &&
        Objects.equals(this.refreshToken, oauthAccess.refreshToken) &&
        Objects.equals(this.scope, oauthAccess.scope) &&
        Objects.equals(this.tokenType, oauthAccess.tokenType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessToken, data, expiresIn, refreshToken, scope, tokenType);
  }


  /**
   * Converts the given object to string.
   */
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

