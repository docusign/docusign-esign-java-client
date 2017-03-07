package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class OauthAccess   {
  
  private String accessToken = null;
  private java.util.List<NameValue> data = new java.util.ArrayList<NameValue>();
  private String expiresIn = null;
  private String refreshToken = null;
  private String scope = null;
  private String tokenType = null;

  
  /**
   * Access token information.
   **/
  
  @ApiModelProperty(value = "Access token information.")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public java.util.List<NameValue> getData() {
    return data;
  }
  public void setData(java.util.List<NameValue> data) {
    this.data = data;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expires_in")
  public String getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  
  /**
   * Must be set to \"api\".
   **/
  
  @ApiModelProperty(value = "Must be set to \"api\".")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("token_type")
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

    return true && Objects.equals(accessToken, oauthAccess.accessToken) &&
        Objects.equals(data, oauthAccess.data) &&
        Objects.equals(expiresIn, oauthAccess.expiresIn) &&
        Objects.equals(refreshToken, oauthAccess.refreshToken) &&
        Objects.equals(scope, oauthAccess.scope) &&
        Objects.equals(tokenType, oauthAccess.tokenType)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, data, expiresIn, refreshToken, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccess {\n");
    
    if (accessToken != null)
      sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    if (data != null)
      sb.append("    data: ").append(toIndentedString(data)).append("\n");
    if (expiresIn != null)
      sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    if (refreshToken != null)
      sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    if (scope != null)
      sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    if (tokenType != null)
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

