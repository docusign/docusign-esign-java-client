package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AccountSeals. */
public class AccountSeals {
  @JsonProperty("seals")
  private java.util.List<SealIdentifier> seals = null;

  /**
   * seals.
   *
   * @return AccountSeals
   */
  public AccountSeals seals(java.util.List<SealIdentifier> seals) {
    this.seals = seals;
    return this;
  }

  /**
   * addSealsItem.
   *
   * @return AccountSeals
   */
  public AccountSeals addSealsItem(SealIdentifier sealsItem) {
    if (this.seals == null) {
      this.seals = new java.util.ArrayList<>();
    }
    this.seals.add(sealsItem);
    return this;
  }

  /**
   * .
   *
   * @return seals
   */
  @ApiModelProperty(value = "")
  public java.util.List<SealIdentifier> getSeals() {
    return seals;
  }

  /** setSeals. */
  public void setSeals(java.util.List<SealIdentifier> seals) {
    this.seals = seals;
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
    AccountSeals accountSeals = (AccountSeals) o;
    return Objects.equals(this.seals, accountSeals.seals);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(seals);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSeals {\n");

    sb.append("    seals: ").append(toIndentedString(seals)).append("\n");
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
