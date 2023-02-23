package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ViewLinkRequest */
public class ViewLinkRequest {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;

  public ViewLinkRequest email(String email) {
    this.email = email;
    return this;
  }

  /** @return email */
  @Schema(example = "null", description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ViewLinkRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /** @return returnUrl */
  @Schema(example = "null", description = "")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewLinkRequest viewLinkRequest = (ViewLinkRequest) o;
    return Objects.equals(this.email, viewLinkRequest.email)
        && Objects.equals(this.returnUrl, viewLinkRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewLinkRequest {\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
