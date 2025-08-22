package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ConnectOAuthConfig.
 *
 */

public class ConnectOAuthConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("authorizationServerUrl")
  private String authorizationServerUrl = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("customParameters")
  private java.util.Map<String, String> customParameters = null;

  @JsonProperty("scope")
  private String scope = null;


  /**
   * authorizationServerUrl.
   *
   * @return ConnectOAuthConfig
   **/
  public ConnectOAuthConfig authorizationServerUrl(String authorizationServerUrl) {
    this.authorizationServerUrl = authorizationServerUrl;
    return this;
  }

  /**
   * .
   * @return authorizationServerUrl
   **/
  @Schema(description = "")
  public String getAuthorizationServerUrl() {
    return authorizationServerUrl;
  }

  /**
   * setAuthorizationServerUrl.
   **/
  public void setAuthorizationServerUrl(String authorizationServerUrl) {
    this.authorizationServerUrl = authorizationServerUrl;
  }


  /**
   * clientId.
   *
   * @return ConnectOAuthConfig
   **/
  public ConnectOAuthConfig clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * .
   * @return clientId
   **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  /**
   * setClientId.
   **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * clientSecret.
   *
   * @return ConnectOAuthConfig
   **/
  public ConnectOAuthConfig clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * .
   * @return clientSecret
   **/
  @Schema(description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * setClientSecret.
   **/
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * customParameters.
   *
   * @return ConnectOAuthConfig
   **/
  public ConnectOAuthConfig customParameters(java.util.Map<String, String> customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * putCustomParametersItem.
   *
   * @return ConnectOAuthConfig
   **/
  public ConnectOAuthConfig putCustomParametersItem(String key, String customParametersItem) {
    if (this.customParameters == null) {
      this.customParameters = new java.util.HashMap<>();
    }
    this.customParameters.put(key, customParametersItem);
    return this;
  }

  /**
   * .
   * @return customParameters
   **/
  @Schema(description = "")
  public java.util.Map<String, String> getCustomParameters() {
    return customParameters;
  }

  /**
   * setCustomParameters.
   **/
  public void setCustomParameters(java.util.Map<String, String> customParameters) {
    this.customParameters = customParameters;
  }


  /**
   * scope.
   *
   * @return ConnectOAuthConfig
   **/
  public ConnectOAuthConfig scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * .
   * @return scope
   **/
  @Schema(description = "")
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
    ConnectOAuthConfig connectOAuthConfig = (ConnectOAuthConfig) o;
    return Objects.equals(this.authorizationServerUrl, connectOAuthConfig.authorizationServerUrl) &&
        Objects.equals(this.clientId, connectOAuthConfig.clientId) &&
        Objects.equals(this.clientSecret, connectOAuthConfig.clientSecret) &&
        Objects.equals(this.customParameters, connectOAuthConfig.customParameters) &&
        Objects.equals(this.scope, connectOAuthConfig.scope);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorizationServerUrl, clientId, clientSecret, customParameters, scope);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectOAuthConfig {\n");
    
    sb.append("    authorizationServerUrl: ").append(toIndentedString(authorizationServerUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

