package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UserInfoResponse */
public class UserInfoResponse {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("seal")
  private Seal seal = null;

  @JsonProperty("sender")
  private Sender sender = null;

  @JsonProperty("user")
  private User user = null;

  public UserInfoResponse envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post.
   *
   * @return envelopeId
   */
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public UserInfoResponse language(String language) {
    this.language = language;
    return this;
  }

  /** @return language */
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public UserInfoResponse seal(Seal seal) {
    this.seal = seal;
    return this;
  }

  /**
   * Get seal
   *
   * @return seal
   */
  @ApiModelProperty(value = "")
  public Seal getSeal() {
    return seal;
  }

  public void setSeal(Seal seal) {
    this.seal = seal;
  }

  public UserInfoResponse sender(Sender sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   *
   * @return sender
   */
  @ApiModelProperty(value = "")
  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  public UserInfoResponse user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoResponse userInfoResponse = (UserInfoResponse) o;
    return Objects.equals(this.envelopeId, userInfoResponse.envelopeId)
        && Objects.equals(this.language, userInfoResponse.language)
        && Objects.equals(this.seal, userInfoResponse.seal)
        && Objects.equals(this.sender, userInfoResponse.sender)
        && Objects.equals(this.user, userInfoResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, language, seal, sender, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoResponse {\n");

    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    seal: ").append(toIndentedString(seal)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
