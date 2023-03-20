package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes a recipient who is a member of a conditional group..
 *
 */
@Schema(description = "Describes a recipient who is a member of a conditional group.")

public class RecipientOption {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recipientLabel")
  private String recipientLabel = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;


  /**
   * email.
   *
   * @return RecipientOption
   **/
  public RecipientOption email(String email) {
    this.email = email;
    return this;
  }

  /**
   * .
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * name.
   *
   * @return RecipientOption
   **/
  public RecipientOption name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * recipientLabel.
   *
   * @return RecipientOption
   **/
  public RecipientOption recipientLabel(String recipientLabel) {
    this.recipientLabel = recipientLabel;
    return this;
  }

  /**
   * .
   * @return recipientLabel
   **/
  @Schema(description = "")
  public String getRecipientLabel() {
    return recipientLabel;
  }

  /**
   * setRecipientLabel.
   **/
  public void setRecipientLabel(String recipientLabel) {
    this.recipientLabel = recipientLabel;
  }


  /**
   * roleName.
   *
   * @return RecipientOption
   **/
  public RecipientOption roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients..
   * @return roleName
   **/
  @Schema(description = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  /**
   * setRoleName.
   **/
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  /**
   * signingGroupId.
   *
   * @return RecipientOption
   **/
  public RecipientOption signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once)..
   * @return signingGroupId
   **/
  @Schema(description = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  /**
   * setSigningGroupId.
   **/
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
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
    RecipientOption recipientOption = (RecipientOption) o;
    return Objects.equals(this.email, recipientOption.email) &&
        Objects.equals(this.name, recipientOption.name) &&
        Objects.equals(this.recipientLabel, recipientOption.recipientLabel) &&
        Objects.equals(this.roleName, recipientOption.roleName) &&
        Objects.equals(this.signingGroupId, recipientOption.signingGroupId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, name, recipientLabel, roleName, signingGroupId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientOption {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientLabel: ").append(toIndentedString(recipientLabel)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
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

