package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.SamlAssertionAttribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains the name/value pair information for the SAML assertion attributes:  * name - The name of the SAML assertion attribute. * value - The value associated with the named SAML assertion attribute.   Your account must be set up to use SSO to use this..
 *
 */
@ApiModel(description = "Contains the name/value pair information for the SAML assertion attributes:  * name - The name of the SAML assertion attribute. * value - The value associated with the named SAML assertion attribute.   Your account must be set up to use SSO to use this.")

public class RecipientSAMLAuthentication {
  @JsonProperty("samlAssertionAttributes")
  private java.util.List<SamlAssertionAttribute> samlAssertionAttributes = null;


  /**
   * samlAssertionAttributes.
   *
   * @return RecipientSAMLAuthentication
   **/
  public RecipientSAMLAuthentication samlAssertionAttributes(java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
    return this;
  }
  
  /**
   * addSamlAssertionAttributesItem.
   *
   * @return RecipientSAMLAuthentication
   **/
  public RecipientSAMLAuthentication addSamlAssertionAttributesItem(SamlAssertionAttribute samlAssertionAttributesItem) {
    if (this.samlAssertionAttributes == null) {
      this.samlAssertionAttributes = new java.util.ArrayList<SamlAssertionAttribute>();
    }
    this.samlAssertionAttributes.add(samlAssertionAttributesItem);
    return this;
  }

  /**
   * .
   * @return samlAssertionAttributes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SamlAssertionAttribute> getSamlAssertionAttributes() {
    return samlAssertionAttributes;
  }

  /**
   * setSamlAssertionAttributes.
   **/
  public void setSamlAssertionAttributes(java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
    this.samlAssertionAttributes = samlAssertionAttributes;
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
    RecipientSAMLAuthentication recipientSAMLAuthentication = (RecipientSAMLAuthentication) o;
    return Objects.equals(this.samlAssertionAttributes, recipientSAMLAuthentication.samlAssertionAttributes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(samlAssertionAttributes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientSAMLAuthentication {\n");
    
    sb.append("    samlAssertionAttributes: ").append(toIndentedString(samlAssertionAttributes)).append("\n");
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

