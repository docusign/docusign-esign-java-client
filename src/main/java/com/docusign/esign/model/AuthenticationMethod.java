package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains information about the method used for authentication.
 **/

@ApiModel(description = "Contains information about the method used for authentication.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class AuthenticationMethod   {
  
  private String authenticationType = null;
  private String lastProvider = null;
  private String lastTimestamp = null;
  private Integer totalCount = null;

  
  /**
   * Indicates the type of authentication. Valid values are: PhoneAuth, STAN, ISCheck, OFAC, AccessCode, AgeVerify, or SSOAuth.
   **/
  
  @ApiModelProperty(value = "Indicates the type of authentication. Valid values are: PhoneAuth, STAN, ISCheck, OFAC, AccessCode, AgeVerify, or SSOAuth.")
  @JsonProperty("authenticationType")
  public String getAuthenticationType() {
    return authenticationType;
  }
  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  
  /**
   * The last provider that authenticated the user.
   **/
  
  @ApiModelProperty(value = "The last provider that authenticated the user.")
  @JsonProperty("lastProvider")
  public String getLastProvider() {
    return lastProvider;
  }
  public void setLastProvider(String lastProvider) {
    this.lastProvider = lastProvider;
  }

  
  /**
   * The data and time the user last used the authentication method.
   **/
  
  @ApiModelProperty(value = "The data and time the user last used the authentication method.")
  @JsonProperty("lastTimestamp")
  public String getLastTimestamp() {
    return lastTimestamp;
  }
  public void setLastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  
  /**
   * The number of times the authentication method was used.
   **/
  
  @ApiModelProperty(value = "The number of times the authentication method was used.")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationMethod authenticationMethod = (AuthenticationMethod) o;

    return true && Objects.equals(authenticationType, authenticationMethod.authenticationType) &&
        Objects.equals(lastProvider, authenticationMethod.lastProvider) &&
        Objects.equals(lastTimestamp, authenticationMethod.lastTimestamp) &&
        Objects.equals(totalCount, authenticationMethod.totalCount)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, lastProvider, lastTimestamp, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationMethod {\n");
    
    if (authenticationType != null)
      sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    if (lastProvider != null)
      sb.append("    lastProvider: ").append(toIndentedString(lastProvider)).append("\n");
    if (lastTimestamp != null)
      sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    if (totalCount != null)
      sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

