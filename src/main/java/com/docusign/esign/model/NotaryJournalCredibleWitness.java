package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * NotaryJournalCredibleWitness.
 *
 */

public class NotaryJournalCredibleWitness {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("signatureImage")
  private String signatureImage = null;

  /**
   * address.
   *
   * @return NotaryJournalCredibleWitness
   **/
  public NotaryJournalCredibleWitness address(String address) {
    this.address = address;
    return this;
  }

  /**
   * .
   * 
   * @return address
   **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  /**
   * setAddress.
   **/
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * name.
   *
   * @return NotaryJournalCredibleWitness
   **/
  public NotaryJournalCredibleWitness name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * 
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * signatureImage.
   *
   * @return NotaryJournalCredibleWitness
   **/
  public NotaryJournalCredibleWitness signatureImage(String signatureImage) {
    this.signatureImage = signatureImage;
    return this;
  }

  /**
   * .
   * 
   * @return signatureImage
   **/
  @Schema(description = "")
  public String getSignatureImage() {
    return signatureImage;
  }

  /**
   * setSignatureImage.
   **/
  public void setSignatureImage(String signatureImage) {
    this.signatureImage = signatureImage;
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
    NotaryJournalCredibleWitness notaryJournalCredibleWitness = (NotaryJournalCredibleWitness) o;
    return Objects.equals(this.address, notaryJournalCredibleWitness.address) &&
        Objects.equals(this.name, notaryJournalCredibleWitness.name) &&
        Objects.equals(this.signatureImage, notaryJournalCredibleWitness.signatureImage);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(address, name, signatureImage);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotaryJournalCredibleWitness {\n");

    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signatureImage: ").append(toIndentedString(signatureImage)).append("\n");
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
