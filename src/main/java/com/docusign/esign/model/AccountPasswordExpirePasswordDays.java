package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AccountPasswordExpirePasswordDays. */
public class AccountPasswordExpirePasswordDays {
  @JsonProperty("maximumDays")
  private String maximumDays = null;

  @JsonProperty("minimumDays")
  private String minimumDays = null;

  /**
   * maximumDays.
   *
   * @return AccountPasswordExpirePasswordDays
   */
  public AccountPasswordExpirePasswordDays maximumDays(String maximumDays) {
    this.maximumDays = maximumDays;
    return this;
  }

  /**
   * .
   *
   * @return maximumDays
   */
  @ApiModelProperty(value = "")
  public String getMaximumDays() {
    return maximumDays;
  }

  /** setMaximumDays. */
  public void setMaximumDays(String maximumDays) {
    this.maximumDays = maximumDays;
  }

  /**
   * minimumDays.
   *
   * @return AccountPasswordExpirePasswordDays
   */
  public AccountPasswordExpirePasswordDays minimumDays(String minimumDays) {
    this.minimumDays = minimumDays;
    return this;
  }

  /**
   * .
   *
   * @return minimumDays
   */
  @ApiModelProperty(value = "")
  public String getMinimumDays() {
    return minimumDays;
  }

  /** setMinimumDays. */
  public void setMinimumDays(String minimumDays) {
    this.minimumDays = minimumDays;
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
    AccountPasswordExpirePasswordDays accountPasswordExpirePasswordDays =
        (AccountPasswordExpirePasswordDays) o;
    return Objects.equals(this.maximumDays, accountPasswordExpirePasswordDays.maximumDays)
        && Objects.equals(this.minimumDays, accountPasswordExpirePasswordDays.minimumDays);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(maximumDays, minimumDays);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordExpirePasswordDays {\n");

    sb.append("    maximumDays: ").append(toIndentedString(maximumDays)).append("\n");
    sb.append("    minimumDays: ").append(toIndentedString(minimumDays)).append("\n");
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
