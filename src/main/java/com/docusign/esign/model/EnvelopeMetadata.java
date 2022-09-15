package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeMetadata.
 *
 */

public class EnvelopeMetadata {
  @JsonProperty("allowAdvancedCorrect")
  private String allowAdvancedCorrect = null;

  @JsonProperty("allowCorrect")
  private String allowCorrect = null;

  @JsonProperty("enableSignWithNotary")
  private String enableSignWithNotary = null;


  /**
   * allowAdvancedCorrect.
   *
   * @return EnvelopeMetadata
   **/
  public EnvelopeMetadata allowAdvancedCorrect(String allowAdvancedCorrect) {
    this.allowAdvancedCorrect = allowAdvancedCorrect;
    return this;
  }

  /**
   * .
   * @return allowAdvancedCorrect
   **/
  @ApiModelProperty(value = "")
  public String getAllowAdvancedCorrect() {
    return allowAdvancedCorrect;
  }

  /**
   * setAllowAdvancedCorrect.
   **/
  public void setAllowAdvancedCorrect(String allowAdvancedCorrect) {
    this.allowAdvancedCorrect = allowAdvancedCorrect;
  }


  /**
   * allowCorrect.
   *
   * @return EnvelopeMetadata
   **/
  public EnvelopeMetadata allowCorrect(String allowCorrect) {
    this.allowCorrect = allowCorrect;
    return this;
  }

  /**
   * .
   * @return allowCorrect
   **/
  @ApiModelProperty(value = "")
  public String getAllowCorrect() {
    return allowCorrect;
  }

  /**
   * setAllowCorrect.
   **/
  public void setAllowCorrect(String allowCorrect) {
    this.allowCorrect = allowCorrect;
  }


  /**
   * enableSignWithNotary.
   *
   * @return EnvelopeMetadata
   **/
  public EnvelopeMetadata enableSignWithNotary(String enableSignWithNotary) {
    this.enableSignWithNotary = enableSignWithNotary;
    return this;
  }

  /**
   * .
   * @return enableSignWithNotary
   **/
  @ApiModelProperty(value = "")
  public String getEnableSignWithNotary() {
    return enableSignWithNotary;
  }

  /**
   * setEnableSignWithNotary.
   **/
  public void setEnableSignWithNotary(String enableSignWithNotary) {
    this.enableSignWithNotary = enableSignWithNotary;
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
    EnvelopeMetadata envelopeMetadata = (EnvelopeMetadata) o;
    return Objects.equals(this.allowAdvancedCorrect, envelopeMetadata.allowAdvancedCorrect) &&
        Objects.equals(this.allowCorrect, envelopeMetadata.allowCorrect) &&
        Objects.equals(this.enableSignWithNotary, envelopeMetadata.enableSignWithNotary);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(allowAdvancedCorrect, allowCorrect, enableSignWithNotary);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeMetadata {\n");
    
    sb.append("    allowAdvancedCorrect: ").append(toIndentedString(allowAdvancedCorrect)).append("\n");
    sb.append("    allowCorrect: ").append(toIndentedString(allowCorrect)).append("\n");
    sb.append("    enableSignWithNotary: ").append(toIndentedString(enableSignWithNotary)).append("\n");
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

