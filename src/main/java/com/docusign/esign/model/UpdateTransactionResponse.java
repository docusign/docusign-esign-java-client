package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateTransactionResponse
 */

public class UpdateTransactionResponse {
  @JsonProperty("redirectionUrl")
  private String redirectionUrl = null;

  public UpdateTransactionResponse redirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
    return this;
  }

   /**
   * 
   * @return redirectionUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  public void setRedirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTransactionResponse updateTransactionResponse = (UpdateTransactionResponse) o;
    return Objects.equals(this.redirectionUrl, updateTransactionResponse.redirectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectionUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTransactionResponse {\n");
    
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
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

