package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SignatureGroupDef.
 *
 */

public class SignatureGroupDef implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("rights")
  private String rights = null;


  /**
   * groupId.
   *
   * @return SignatureGroupDef
   **/
  public SignatureGroupDef groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * .
   * @return groupId
   **/
  @Schema(description = "")
  public String getGroupId() {
    return groupId;
  }

  /**
   * setGroupId.
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * rights.
   *
   * @return SignatureGroupDef
   **/
  public SignatureGroupDef rights(String rights) {
    this.rights = rights;
    return this;
  }

  /**
   * .
   * @return rights
   **/
  @Schema(description = "")
  public String getRights() {
    return rights;
  }

  /**
   * setRights.
   **/
  public void setRights(String rights) {
    this.rights = rights;
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
    SignatureGroupDef signatureGroupDef = (SignatureGroupDef) o;
    return Objects.equals(this.groupId, signatureGroupDef.groupId) &&
        Objects.equals(this.rights, signatureGroupDef.rights);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(groupId, rights);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureGroupDef {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

