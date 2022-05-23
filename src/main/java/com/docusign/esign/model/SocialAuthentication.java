package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SocialAuthentication. */
public class SocialAuthentication {
  @JsonProperty("authentication")
  private String authentication = null;

  /**
   * authentication.
   *
   * @return SocialAuthentication
   */
  public SocialAuthentication authentication(String authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Reserved: TBD.
   *
   * @return authentication
   */
  @ApiModelProperty(value = "Reserved: TBD")
  public String getAuthentication() {
    return authentication;
  }

  /** setAuthentication. */
  public void setAuthentication(String authentication) {
    this.authentication = authentication;
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
    SocialAuthentication socialAuthentication = (SocialAuthentication) o;
    return Objects.equals(this.authentication, socialAuthentication.authentication);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(authentication);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAuthentication {\n");

    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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
