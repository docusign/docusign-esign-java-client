package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientProofFile
 */

public class RecipientProofFile {
  @JsonProperty("isInProofFile")
  private String isInProofFile = null;

  public RecipientProofFile isInProofFile(String isInProofFile) {
    this.isInProofFile = isInProofFile;
    return this;
  }

   /**
   * 
   * @return isInProofFile
  **/
  @ApiModelProperty(value = "")
  public String getIsInProofFile() {
    return isInProofFile;
  }

  public void setIsInProofFile(String isInProofFile) {
    this.isInProofFile = isInProofFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientProofFile recipientProofFile = (RecipientProofFile) o;
    return Objects.equals(this.isInProofFile, recipientProofFile.isInProofFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInProofFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientProofFile {\n");
    
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

