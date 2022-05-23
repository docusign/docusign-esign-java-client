package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ProofServiceViewLink. */
public class ProofServiceViewLink {
  @JsonProperty("ViewLink")
  private String viewLink = null;

  /**
   * viewLink.
   *
   * @return ProofServiceViewLink
   */
  public ProofServiceViewLink viewLink(String viewLink) {
    this.viewLink = viewLink;
    return this;
  }

  /**
   * .
   *
   * @return viewLink
   */
  @ApiModelProperty(value = "")
  public String getViewLink() {
    return viewLink;
  }

  /** setViewLink. */
  public void setViewLink(String viewLink) {
    this.viewLink = viewLink;
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
    ProofServiceViewLink proofServiceViewLink = (ProofServiceViewLink) o;
    return Objects.equals(this.viewLink, proofServiceViewLink.viewLink);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(viewLink);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProofServiceViewLink {\n");

    sb.append("    viewLink: ").append(toIndentedString(viewLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
