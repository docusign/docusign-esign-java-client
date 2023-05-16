package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The proof file of the recipient. [ID Evidence](/docs/idevidence-api/) uses proof files to store the identification data that recipients submit when verifying their ID with [ID Verification](/docs/esign-rest-api/esign101/concepts/documents/).
 *
 */
@Schema(description = "The proof file of the recipient. [ID Evidence](/docs/idevidence-api/) uses proof files to store the identification data that recipients submit when verifying their ID with [ID Verification](/docs/esign-rest-api/esign101/concepts/documents/)")

public class RecipientProofFile {
  @JsonProperty("hasIdentityAttempts")
  private String hasIdentityAttempts = null;

  @JsonProperty("isInProofFile")
  private String isInProofFile = null;


  /**
   * hasIdentityAttempts.
   *
   * @return RecipientProofFile
   **/
  public RecipientProofFile hasIdentityAttempts(String hasIdentityAttempts) {
    this.hasIdentityAttempts = hasIdentityAttempts;
    return this;
  }

  /**
   * .
   * @return hasIdentityAttempts
   **/
  @Schema(description = "")
  public String getHasIdentityAttempts() {
    return hasIdentityAttempts;
  }

  /**
   * setHasIdentityAttempts.
   **/
  public void setHasIdentityAttempts(String hasIdentityAttempts) {
    this.hasIdentityAttempts = hasIdentityAttempts;
  }


  /**
   * isInProofFile.
   *
   * @return RecipientProofFile
   **/
  public RecipientProofFile isInProofFile(String isInProofFile) {
    this.isInProofFile = isInProofFile;
    return this;
  }

  /**
   * .
   * @return isInProofFile
   **/
  @Schema(description = "")
  public String getIsInProofFile() {
    return isInProofFile;
  }

  /**
   * setIsInProofFile.
   **/
  public void setIsInProofFile(String isInProofFile) {
    this.isInProofFile = isInProofFile;
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
    RecipientProofFile recipientProofFile = (RecipientProofFile) o;
    return Objects.equals(this.hasIdentityAttempts, recipientProofFile.hasIdentityAttempts) &&
        Objects.equals(this.isInProofFile, recipientProofFile.isInProofFile);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(hasIdentityAttempts, isInProofFile);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientProofFile {\n");
    
    sb.append("    hasIdentityAttempts: ").append(toIndentedString(hasIdentityAttempts)).append("\n");
    sb.append("    isInProofFile: ").append(toIndentedString(isInProofFile)).append("\n");
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

