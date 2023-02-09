package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IdEvidenceViewLink.
 *
 */

public class IdEvidenceViewLink {
  @JsonProperty("viewLink")
  private String viewLink = null;


  /**
   * viewLink.
   *
   * @return IdEvidenceViewLink
   **/
  public IdEvidenceViewLink viewLink(String viewLink) {
    this.viewLink = viewLink;
    return this;
  }

  /**
   * .
   * @return viewLink
   **/
  @ApiModelProperty(value = "")
  public String getViewLink() {
    return viewLink;
  }

  /**
   * setViewLink.
   **/
  public void setViewLink(String viewLink) {
    this.viewLink = viewLink;
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
    IdEvidenceViewLink idEvidenceViewLink = (IdEvidenceViewLink) o;
    return Objects.equals(this.viewLink, idEvidenceViewLink.viewLink);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(viewLink);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdEvidenceViewLink {\n");
    
    sb.append("    viewLink: ").append(toIndentedString(viewLink)).append("\n");
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

