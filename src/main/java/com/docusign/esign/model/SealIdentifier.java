package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SealIdentifier. */
public class SealIdentifier {
  @JsonProperty("sealDisplayName")
  private String sealDisplayName = null;

  @JsonProperty("sealName")
  private String sealName = null;

  /**
   * sealDisplayName.
   *
   * @return SealIdentifier
   */
  public SealIdentifier sealDisplayName(String sealDisplayName) {
    this.sealDisplayName = sealDisplayName;
    return this;
  }

  /**
   * .
   *
   * @return sealDisplayName
   */
  @ApiModelProperty(value = "")
  public String getSealDisplayName() {
    return sealDisplayName;
  }

  /** setSealDisplayName. */
  public void setSealDisplayName(String sealDisplayName) {
    this.sealDisplayName = sealDisplayName;
  }

  /**
   * sealName.
   *
   * @return SealIdentifier
   */
  public SealIdentifier sealName(String sealName) {
    this.sealName = sealName;
    return this;
  }

  /**
   * .
   *
   * @return sealName
   */
  @ApiModelProperty(value = "")
  public String getSealName() {
    return sealName;
  }

  /** setSealName. */
  public void setSealName(String sealName) {
    this.sealName = sealName;
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
    SealIdentifier sealIdentifier = (SealIdentifier) o;
    return Objects.equals(this.sealDisplayName, sealIdentifier.sealDisplayName)
        && Objects.equals(this.sealName, sealIdentifier.sealName);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(sealDisplayName, sealName);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SealIdentifier {\n");

    sb.append("    sealDisplayName: ").append(toIndentedString(sealDisplayName)).append("\n");
    sb.append("    sealName: ").append(toIndentedString(sealName)).append("\n");
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
