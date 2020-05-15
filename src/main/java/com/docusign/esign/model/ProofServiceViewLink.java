package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProofServiceViewLink
 */

public class ProofServiceViewLink {
  @JsonProperty("ViewLink")
  private String viewLink = null;

  public ProofServiceViewLink viewLink(String viewLink) {
    this.viewLink = viewLink;
    return this;
  }

   /**
   * 
   * @return viewLink
  **/
  @ApiModelProperty(value = "")
  public String getViewLink() {
    return viewLink;
  }

  public void setViewLink(String viewLink) {
    this.viewLink = viewLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProofServiceViewLink proofServiceViewLink = (ProofServiceViewLink) o;
    return Objects.equals(this.viewLink, proofServiceViewLink.viewLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofServiceViewLink {\n");
    
    sb.append("    viewLink: ").append(toIndentedString(viewLink)).append("\n");
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

