package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Reserved for DocuSign..
 *
 */
@Schema(description = "Reserved for DocuSign.")

public class AccountSignatureProviderOption implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("signatureProviderOptionDisplayName")
  private String signatureProviderOptionDisplayName = null;

  @JsonProperty("signatureProviderOptionId")
  private String signatureProviderOptionId = null;

  @JsonProperty("signatureProviderOptionName")
  private String signatureProviderOptionName = null;


  /**
   * signatureProviderOptionDisplayName.
   *
   * @return AccountSignatureProviderOption
   **/
  public AccountSignatureProviderOption signatureProviderOptionDisplayName(String signatureProviderOptionDisplayName) {
    this.signatureProviderOptionDisplayName = signatureProviderOptionDisplayName;
    return this;
  }

  /**
   * .
   * @return signatureProviderOptionDisplayName
   **/
  @Schema(description = "")
  public String getSignatureProviderOptionDisplayName() {
    return signatureProviderOptionDisplayName;
  }

  /**
   * setSignatureProviderOptionDisplayName.
   **/
  public void setSignatureProviderOptionDisplayName(String signatureProviderOptionDisplayName) {
    this.signatureProviderOptionDisplayName = signatureProviderOptionDisplayName;
  }


  /**
   * signatureProviderOptionId.
   *
   * @return AccountSignatureProviderOption
   **/
  public AccountSignatureProviderOption signatureProviderOptionId(String signatureProviderOptionId) {
    this.signatureProviderOptionId = signatureProviderOptionId;
    return this;
  }

  /**
   * .
   * @return signatureProviderOptionId
   **/
  @Schema(description = "")
  public String getSignatureProviderOptionId() {
    return signatureProviderOptionId;
  }

  /**
   * setSignatureProviderOptionId.
   **/
  public void setSignatureProviderOptionId(String signatureProviderOptionId) {
    this.signatureProviderOptionId = signatureProviderOptionId;
  }


  /**
   * signatureProviderOptionName.
   *
   * @return AccountSignatureProviderOption
   **/
  public AccountSignatureProviderOption signatureProviderOptionName(String signatureProviderOptionName) {
    this.signatureProviderOptionName = signatureProviderOptionName;
    return this;
  }

  /**
   * .
   * @return signatureProviderOptionName
   **/
  @Schema(description = "")
  public String getSignatureProviderOptionName() {
    return signatureProviderOptionName;
  }

  /**
   * setSignatureProviderOptionName.
   **/
  public void setSignatureProviderOptionName(String signatureProviderOptionName) {
    this.signatureProviderOptionName = signatureProviderOptionName;
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
    AccountSignatureProviderOption accountSignatureProviderOption = (AccountSignatureProviderOption) o;
    return Objects.equals(this.signatureProviderOptionDisplayName, accountSignatureProviderOption.signatureProviderOptionDisplayName) &&
        Objects.equals(this.signatureProviderOptionId, accountSignatureProviderOption.signatureProviderOptionId) &&
        Objects.equals(this.signatureProviderOptionName, accountSignatureProviderOption.signatureProviderOptionName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(signatureProviderOptionDisplayName, signatureProviderOptionId, signatureProviderOptionName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSignatureProviderOption {\n");
    
    sb.append("    signatureProviderOptionDisplayName: ").append(toIndentedString(signatureProviderOptionDisplayName)).append("\n");
    sb.append("    signatureProviderOptionId: ").append(toIndentedString(signatureProviderOptionId)).append("\n");
    sb.append("    signatureProviderOptionName: ").append(toIndentedString(signatureProviderOptionName)).append("\n");
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

