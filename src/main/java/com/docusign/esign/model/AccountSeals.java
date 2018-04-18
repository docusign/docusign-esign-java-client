package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SealIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSeals
 */

public class AccountSeals {
  @JsonProperty("seals")
  private java.util.List<SealIdentifier> seals = new java.util.ArrayList<SealIdentifier>();

  public AccountSeals seals(java.util.List<SealIdentifier> seals) {
    this.seals = seals;
    return this;
  }

  public AccountSeals addSealsItem(SealIdentifier sealsItem) {
    this.seals.add(sealsItem);
    return this;
  }

   /**
   * 
   * @return seals
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<SealIdentifier> getSeals() {
    return seals;
  }

  public void setSeals(java.util.List<SealIdentifier> seals) {
    this.seals = seals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSeals accountSeals = (AccountSeals) o;
    return Objects.equals(this.seals, accountSeals.seals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSeals {\n");
    
    sb.append("    seals: ").append(toIndentedString(seals)).append("\n");
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

