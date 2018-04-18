package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SealIdentifier
 */

public class SealIdentifier {
  @JsonProperty("sealDisplayName")
  private String sealDisplayName = null;

  @JsonProperty("sealName")
  private String sealName = null;

  public SealIdentifier sealDisplayName(String sealDisplayName) {
    this.sealDisplayName = sealDisplayName;
    return this;
  }

   /**
   * 
   * @return sealDisplayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSealDisplayName() {
    return sealDisplayName;
  }

  public void setSealDisplayName(String sealDisplayName) {
    this.sealDisplayName = sealDisplayName;
  }

  public SealIdentifier sealName(String sealName) {
    this.sealName = sealName;
    return this;
  }

   /**
   * 
   * @return sealName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSealName() {
    return sealName;
  }

  public void setSealName(String sealName) {
    this.sealName = sealName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SealIdentifier sealIdentifier = (SealIdentifier) o;
    return Objects.equals(this.sealDisplayName, sealIdentifier.sealDisplayName) &&
        Objects.equals(this.sealName, sealIdentifier.sealName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sealDisplayName, sealName);
  }


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

