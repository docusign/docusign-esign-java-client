package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordMinimumPasswordAgeDays
 */

public class AccountPasswordMinimumPasswordAgeDays {
  @JsonProperty("maximumAge")
  private String maximumAge = null;

  @JsonProperty("minimumAge")
  private String minimumAge = null;

  public AccountPasswordMinimumPasswordAgeDays maximumAge(String maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

   /**
   * 
   * @return maximumAge
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(String maximumAge) {
    this.maximumAge = maximumAge;
  }

  public AccountPasswordMinimumPasswordAgeDays minimumAge(String minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

   /**
   * 
   * @return minimumAge
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(String minimumAge) {
    this.minimumAge = minimumAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordMinimumPasswordAgeDays accountPasswordMinimumPasswordAgeDays = (AccountPasswordMinimumPasswordAgeDays) o;
    return Objects.equals(this.maximumAge, accountPasswordMinimumPasswordAgeDays.maximumAge) &&
        Objects.equals(this.minimumAge, accountPasswordMinimumPasswordAgeDays.minimumAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumAge, minimumAge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordMinimumPasswordAgeDays {\n");
    
    sb.append("    maximumAge: ").append(toIndentedString(maximumAge)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
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

