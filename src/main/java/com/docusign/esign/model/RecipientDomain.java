package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-02T23:49:11.300-08:00")
public class RecipientDomain   {
  
  private String active = null;
  private String domainCode = null;
  private String domainName = null;
  private String recipientDomainId = null;

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public String getActive() {
    return active;
  }
  public void setActive(String active) {
    this.active = active;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("domainCode")
  public String getDomainCode() {
    return domainCode;
  }
  public void setDomainCode(String domainCode) {
    this.domainCode = domainCode;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recipientDomainId")
  public String getRecipientDomainId() {
    return recipientDomainId;
  }
  public void setRecipientDomainId(String recipientDomainId) {
    this.recipientDomainId = recipientDomainId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientDomain recipientDomain = (RecipientDomain) o;

    return true && Objects.equals(active, recipientDomain.active) &&
        Objects.equals(domainCode, recipientDomain.domainCode) &&
        Objects.equals(domainName, recipientDomain.domainName) &&
        Objects.equals(recipientDomainId, recipientDomain.recipientDomainId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, domainCode, domainName, recipientDomainId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientDomain {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    domainCode: ").append(toIndentedString(domainCode)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    recipientDomainId: ").append(toIndentedString(recipientDomainId)).append("\n");
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

