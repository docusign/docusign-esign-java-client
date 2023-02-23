package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** SignHashSessionInfoResponse */
public class SignHashSessionInfoResponse {
  @JsonProperty("documents")
  private java.util.List<SignHashDocument> documents = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("redirectionUrl")
  private String redirectionUrl = null;

  @JsonProperty("remainingSignatureRequests")
  private Long remainingSignatureRequests = null;

  @JsonProperty("seal")
  private Seal seal = null;

  @JsonProperty("sender")
  private Sender sender = null;

  @JsonProperty("user")
  private User user = null;

  public SignHashSessionInfoResponse documents(java.util.List<SignHashDocument> documents) {
    this.documents = documents;
    return this;
  }

  public SignHashSessionInfoResponse addDocumentsItem(SignHashDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<SignHashDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Complex element contains the details on the documents in the envelope.
   *
   * @return documents
   */
  @Schema(description = "Complex element contains the details on the documents in the envelope.")
  public java.util.List<SignHashDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<SignHashDocument> documents) {
    this.documents = documents;
  }

  public SignHashSessionInfoResponse envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

  /**
   * The envelope ID of the envelope status that failed to post.
   *
   * @return envelopeId
   */
  @Schema(description = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public SignHashSessionInfoResponse language(String language) {
    this.language = language;
    return this;
  }

  /** @return language */
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public SignHashSessionInfoResponse redirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
    return this;
  }

  /** @return redirectionUrl */
  @Schema(description = "")
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  public void setRedirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
  }

  public SignHashSessionInfoResponse remainingSignatureRequests(Long remainingSignatureRequests) {
    this.remainingSignatureRequests = remainingSignatureRequests;
    return this;
  }

  /** @return remainingSignatureRequests */
  @Schema(description = "")
  public Long getRemainingSignatureRequests() {
    return remainingSignatureRequests;
  }

  public void setRemainingSignatureRequests(Long remainingSignatureRequests) {
    this.remainingSignatureRequests = remainingSignatureRequests;
  }

  public SignHashSessionInfoResponse seal(Seal seal) {
    this.seal = seal;
    return this;
  }

  /**
   * Get seal
   *
   * @return seal
   */
  @Schema(description = "")
  public Seal getSeal() {
    return seal;
  }

  public void setSeal(Seal seal) {
    this.seal = seal;
  }

  public SignHashSessionInfoResponse sender(Sender sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   *
   * @return sender
   */
  @Schema(description = "")
  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  public SignHashSessionInfoResponse user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @Schema(description = "")
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
    SignHashSessionInfoResponse signHashSessionInfoResponse = (SignHashSessionInfoResponse) o;
    return Objects.equals(this.documents, signHashSessionInfoResponse.documents)
        && Objects.equals(this.envelopeId, signHashSessionInfoResponse.envelopeId)
        && Objects.equals(this.language, signHashSessionInfoResponse.language)
        && Objects.equals(this.redirectionUrl, signHashSessionInfoResponse.redirectionUrl)
        && Objects.equals(
            this.remainingSignatureRequests, signHashSessionInfoResponse.remainingSignatureRequests)
        && Objects.equals(this.seal, signHashSessionInfoResponse.seal)
        && Objects.equals(this.sender, signHashSessionInfoResponse.sender)
        && Objects.equals(this.user, signHashSessionInfoResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        documents,
        envelopeId,
        language,
        redirectionUrl,
        remainingSignatureRequests,
        seal,
        sender,
        user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignHashSessionInfoResponse {\n");

    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
    sb.append("    remainingSignatureRequests: ")
        .append(toIndentedString(remainingSignatureRequests))
        .append("\n");
    sb.append("    seal: ").append(toIndentedString(seal)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
