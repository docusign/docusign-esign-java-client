package com.docusign.esign.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** DocumentSecurityStore */
public class DocumentSecurityStore {
  @JsonProperty("certificates")
  private java.util.List<String> certificates = null;

  @JsonProperty("crls")
  private java.util.List<String> crls = null;

  @JsonProperty("ocsps")
  private java.util.List<String> ocsps = null;

  public DocumentSecurityStore certificates(java.util.List<String> certificates) {
    this.certificates = certificates;
    return this;
  }

  public DocumentSecurityStore addCertificatesItem(String certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new java.util.ArrayList<String>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

  /** @return certificates */
  @Schema(description = "")
  public java.util.List<String> getCertificates() {
    return certificates;
  }

  public void setCertificates(java.util.List<String> certificates) {
    this.certificates = certificates;
  }

  public DocumentSecurityStore crls(java.util.List<String> crls) {
    this.crls = crls;
    return this;
  }

  public DocumentSecurityStore addCrlsItem(String crlsItem) {
    if (this.crls == null) {
      this.crls = new java.util.ArrayList<String>();
    }
    this.crls.add(crlsItem);
    return this;
  }

  /** @return crls */
  @Schema(description = "")
  public java.util.List<String> getCrls() {
    return crls;
  }

  public void setCrls(java.util.List<String> crls) {
    this.crls = crls;
  }

  public DocumentSecurityStore ocsps(java.util.List<String> ocsps) {
    this.ocsps = ocsps;
    return this;
  }

  public DocumentSecurityStore addOcspsItem(String ocspsItem) {
    if (this.ocsps == null) {
      this.ocsps = new java.util.ArrayList<String>();
    }
    this.ocsps.add(ocspsItem);
    return this;
  }

  /** @return ocsps */
  @Schema(description = "")
  public java.util.List<String> getOcsps() {
    return ocsps;
  }

  public void setOcsps(java.util.List<String> ocsps) {
    this.ocsps = ocsps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSecurityStore documentSecurityStore = (DocumentSecurityStore) o;
    return Objects.equals(this.certificates, documentSecurityStore.certificates)
        && Objects.equals(this.crls, documentSecurityStore.crls)
        && Objects.equals(this.ocsps, documentSecurityStore.ocsps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, crls, ocsps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSecurityStore {\n");

    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    crls: ").append(toIndentedString(crls)).append("\n");
    sb.append("    ocsps: ").append(toIndentedString(ocsps)).append("\n");
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
