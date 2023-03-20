package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Contains details about a specific cloud storage provider..
 *
 */
@Schema(description = "Contains details about a specific cloud storage provider.")

public class CloudStorageProvider {
  @JsonProperty("authenticationUrl")
  private String authenticationUrl = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("redirectUrl")
  private String redirectUrl = null;

  @JsonProperty("service")
  private String service = null;

  @JsonProperty("serviceId")
  private String serviceId = null;


  /**
   * authenticationUrl.
   *
   * @return CloudStorageProvider
   **/
  public CloudStorageProvider authenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
    return this;
  }

  /**
   * The authentication URL used for the cloud storage provider. This information is only included in the response if the user has not passed authentication for the cloud storage provider. If the redirectUrl query string is provided, the returnUrl is appended to the authenticationUrl. .
   * @return authenticationUrl
   **/
  @Schema(description = "The authentication URL used for the cloud storage provider. This information is only included in the response if the user has not passed authentication for the cloud storage provider. If the redirectUrl query string is provided, the returnUrl is appended to the authenticationUrl. ")
  public String getAuthenticationUrl() {
    return authenticationUrl;
  }

  /**
   * setAuthenticationUrl.
   **/
  public void setAuthenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
  }


  /**
   * errorDetails.
   *
   * @return CloudStorageProvider
   **/
  public CloudStorageProvider errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * redirectUrl.
   *
   * @return CloudStorageProvider
   **/
  public CloudStorageProvider redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.  The redirectUrl is restricted to URLs in the docusign.com or docusign.net domains..
   * @return redirectUrl
   **/
  @Schema(description = "The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.  The redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  /**
   * setRedirectUrl.
   **/
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  /**
   * service.
   *
   * @return CloudStorageProvider
   **/
  public CloudStorageProvider service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service name for the cloud storage provider..
   * @return service
   **/
  @Schema(description = "The service name for the cloud storage provider.")
  public String getService() {
    return service;
  }

  /**
   * setService.
   **/
  public void setService(String service) {
    this.service = service;
  }


  /**
   * serviceId.
   *
   * @return CloudStorageProvider
   **/
  public CloudStorageProvider serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The DocuSign generated ID for the cloud storage provider.
   * @return serviceId
   **/
  @Schema(description = "The DocuSign generated ID for the cloud storage provider")
  public String getServiceId() {
    return serviceId;
  }

  /**
   * setServiceId.
   **/
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
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
    CloudStorageProvider cloudStorageProvider = (CloudStorageProvider) o;
    return Objects.equals(this.authenticationUrl, cloudStorageProvider.authenticationUrl) &&
        Objects.equals(this.errorDetails, cloudStorageProvider.errorDetails) &&
        Objects.equals(this.redirectUrl, cloudStorageProvider.redirectUrl) &&
        Objects.equals(this.service, cloudStorageProvider.service) &&
        Objects.equals(this.serviceId, cloudStorageProvider.serviceId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authenticationUrl, errorDetails, redirectUrl, service, serviceId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageProvider {\n");
    
    sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

