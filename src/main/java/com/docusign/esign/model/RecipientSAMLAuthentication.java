package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/**
 * Contains the name/value pair information for the SAML assertion attributes: *
 * name - The name of
 * the SAML assertion attribute. * value - The value associated with the named
 * SAML assertion
 * attribute. Your account must be set up to use SSO to use this.
 */
@Schema(description = "Contains the name/value pair information for the SAML assertion attributes:  * name - The name of the SAML assertion attribute. * value - The value associated with the named SAML assertion attribute.   Your account must be set up to use SSO to use this.")
public class RecipientSAMLAuthentication {
  @JsonProperty("samlAssertionAttributes")
  private java.util.List<SamlAssertionAttribute> samlAssertionAttributes = new java.util.ArrayList<SamlAssertionAttribute>();

  public RecipientSAMLAuthentication samlAssertionAttributes(
      java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
    return this;
  }

  public RecipientSAMLAuthentication addSamlAssertionAttributesItem(
      SamlAssertionAttribute samlAssertionAttributesItem) {
    this.samlAssertionAttributes.add(samlAssertionAttributesItem);
    return this;
  }

  /** @return samlAssertionAttributes */
  @Schema(example = "null", description = "")
  public java.util.List<SamlAssertionAttribute> getSamlAssertionAttributes() {
    return samlAssertionAttributes;
  }

  public void setSamlAssertionAttributes(
      java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientSAMLAuthentication recipientSAMLAuthentication = (RecipientSAMLAuthentication) o;
    return Objects.equals(
        this.samlAssertionAttributes, recipientSAMLAuthentication.samlAssertionAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlAssertionAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSAMLAuthentication {\n");

    sb.append("    samlAssertionAttributes: ")
        .append(toIndentedString(samlAssertionAttributes))
        .append("\n");
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
