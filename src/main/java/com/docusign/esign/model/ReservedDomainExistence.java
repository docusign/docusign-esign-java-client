package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReservedDomainExistence. */
public class ReservedDomainExistence {
  @JsonProperty("emailDomain")
  private String emailDomain = null;

  @JsonProperty("isReserved")
  private String isReserved = null;

  /**
   * emailDomain.
   *
   * @return ReservedDomainExistence
   */
  public ReservedDomainExistence emailDomain(String emailDomain) {
    this.emailDomain = emailDomain;
    return this;
  }

  /**
   * .
   *
   * @return emailDomain
   */
  @ApiModelProperty(value = "")
  public String getEmailDomain() {
    return emailDomain;
  }

  /** setEmailDomain. */
  public void setEmailDomain(String emailDomain) {
    this.emailDomain = emailDomain;
  }

  /**
   * isReserved.
   *
   * @return ReservedDomainExistence
   */
  public ReservedDomainExistence isReserved(String isReserved) {
    this.isReserved = isReserved;
    return this;
  }

  /**
   * .
   *
   * @return isReserved
   */
  @ApiModelProperty(value = "")
  public String getIsReserved() {
    return isReserved;
  }

  /** setIsReserved. */
  public void setIsReserved(String isReserved) {
    this.isReserved = isReserved;
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
    ReservedDomainExistence reservedDomainExistence = (ReservedDomainExistence) o;
    return Objects.equals(this.emailDomain, reservedDomainExistence.emailDomain)
        && Objects.equals(this.isReserved, reservedDomainExistence.isReserved);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(emailDomain, isReserved);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedDomainExistence {\n");

    sb.append("    emailDomain: ").append(toIndentedString(emailDomain)).append("\n");
    sb.append("    isReserved: ").append(toIndentedString(isReserved)).append("\n");
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
