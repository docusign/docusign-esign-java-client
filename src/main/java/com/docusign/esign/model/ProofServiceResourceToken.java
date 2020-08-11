package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProofServiceResourceToken
 */

public class ProofServiceResourceToken {
  @JsonProperty("proofBaseURI")
  private String proofBaseURI = null;

  @JsonProperty("resourceToken")
  private String resourceToken = null;

  public ProofServiceResourceToken proofBaseURI(String proofBaseURI) {
    this.proofBaseURI = proofBaseURI;
    return this;
  }

   /**
   * 
   * @return proofBaseURI
  **/
  @ApiModelProperty(value = "")
  public String getProofBaseURI() {
    return proofBaseURI;
  }

  public void setProofBaseURI(String proofBaseURI) {
    this.proofBaseURI = proofBaseURI;
  }

  public ProofServiceResourceToken resourceToken(String resourceToken) {
    this.resourceToken = resourceToken;
    return this;
  }

   /**
   * 
   * @return resourceToken
  **/
  @ApiModelProperty(value = "")
  public String getResourceToken() {
    return resourceToken;
  }

  public void setResourceToken(String resourceToken) {
    this.resourceToken = resourceToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProofServiceResourceToken proofServiceResourceToken = (ProofServiceResourceToken) o;
    return Objects.equals(this.proofBaseURI, proofServiceResourceToken.proofBaseURI) &&
        Objects.equals(this.resourceToken, proofServiceResourceToken.resourceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proofBaseURI, resourceToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofServiceResourceToken {\n");
    
    sb.append("    proofBaseURI: ").append(toIndentedString(proofBaseURI)).append("\n");
    sb.append("    resourceToken: ").append(toIndentedString(resourceToken)).append("\n");
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

