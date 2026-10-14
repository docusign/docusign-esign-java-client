package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.EnvelopesShareResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * EnvelopesSharesResponse.
 *
 */

public class EnvelopesSharesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("shares")
  private java.util.List<EnvelopesShareResponse> shares = null;


  /**
   * shares.
   *
   * @return EnvelopesSharesResponse
   **/
  public EnvelopesSharesResponse shares(java.util.List<EnvelopesShareResponse> shares) {
    this.shares = shares;
    return this;
  }
  
  /**
   * addSharesItem.
   *
   * @return EnvelopesSharesResponse
   **/
  public EnvelopesSharesResponse addSharesItem(EnvelopesShareResponse sharesItem) {
    if (this.shares == null) {
      this.shares = new java.util.ArrayList<>();
    }
    this.shares.add(sharesItem);
    return this;
  }

  /**
   * .
   * @return shares
   **/
  @Schema(description = "")
  public java.util.List<EnvelopesShareResponse> getShares() {
    return shares;
  }

  /**
   * setShares.
   **/
  public void setShares(java.util.List<EnvelopesShareResponse> shares) {
    this.shares = shares;
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
    EnvelopesSharesResponse envelopesSharesResponse = (EnvelopesSharesResponse) o;
    return Objects.equals(this.shares, envelopesSharesResponse.shares);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(shares);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopesSharesResponse {\n");
    
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

