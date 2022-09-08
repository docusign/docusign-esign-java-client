package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientDomain.
 *
 */

public class RecipientDomain {
  @JsonProperty("active")
  private String active = null;

  @JsonProperty("domainCode")
  private String domainCode = null;

  @JsonProperty("domainName")
  private String domainName = null;

  @JsonProperty("recipientDomainId")
  private String recipientDomainId = null;


  /**
   * active.
   *
   * @return RecipientDomain
   **/
  public RecipientDomain active(String active) {
    this.active = active;
    return this;
  }

  /**
   * .
   * @return active
   **/
  @ApiModelProperty(value = "")
  public String getActive() {
    return active;
  }

  /**
   * setActive.
   **/
  public void setActive(String active) {
    this.active = active;
  }


  /**
   * domainCode.
   *
   * @return RecipientDomain
   **/
  public RecipientDomain domainCode(String domainCode) {
    this.domainCode = domainCode;
    return this;
  }

  /**
   * .
   * @return domainCode
   **/
  @ApiModelProperty(value = "")
  public String getDomainCode() {
    return domainCode;
  }

  /**
   * setDomainCode.
   **/
  public void setDomainCode(String domainCode) {
    this.domainCode = domainCode;
  }


  /**
   * domainName.
   *
   * @return RecipientDomain
   **/
  public RecipientDomain domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * .
   * @return domainName
   **/
  @ApiModelProperty(value = "")
  public String getDomainName() {
    return domainName;
  }

  /**
   * setDomainName.
   **/
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  /**
   * recipientDomainId.
   *
   * @return RecipientDomain
   **/
  public RecipientDomain recipientDomainId(String recipientDomainId) {
    this.recipientDomainId = recipientDomainId;
    return this;
  }

  /**
   * .
   * @return recipientDomainId
   **/
  @ApiModelProperty(value = "")
  public String getRecipientDomainId() {
    return recipientDomainId;
  }

  /**
   * setRecipientDomainId.
   **/
  public void setRecipientDomainId(String recipientDomainId) {
    this.recipientDomainId = recipientDomainId;
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
    RecipientDomain recipientDomain = (RecipientDomain) o;
    return Objects.equals(this.active, recipientDomain.active) &&
        Objects.equals(this.domainCode, recipientDomain.domainCode) &&
        Objects.equals(this.domainName, recipientDomain.domainName) &&
        Objects.equals(this.recipientDomainId, recipientDomain.recipientDomainId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(active, domainCode, domainName, recipientDomainId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientDomain {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    domainCode: ").append(toIndentedString(domainCode)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    recipientDomainId: ").append(toIndentedString(recipientDomainId)).append("\n");
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

