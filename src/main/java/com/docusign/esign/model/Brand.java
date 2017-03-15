package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BrandEmailContent;
import com.docusign.esign.model.BrandLink;
import com.docusign.esign.model.BrandLogos;
import com.docusign.esign.model.BrandResourceUrls;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class Brand   {
  
  private String brandCompany = null;
  private String brandId = null;
  private String brandName = null;
  private java.util.List<NameValue> colors = new java.util.ArrayList<NameValue>();
  private java.util.List<BrandEmailContent> emailContent = new java.util.ArrayList<BrandEmailContent>();
  private ErrorDetails errorDetails = null;
  private String isOverridingCompanyName = null;
  private String isSendingDefault = null;
  private String isSigningDefault = null;
  private java.util.List<NameValue> landingPages = new java.util.ArrayList<NameValue>();
  private java.util.List<BrandLink> links = new java.util.ArrayList<BrandLink>();
  private BrandLogos logos = null;
  private BrandResourceUrls resources = null;

  
  /**
   * The name of the company associated with this brand.
   **/
  
  @ApiModelProperty(value = "The name of the company associated with this brand.")
  @JsonProperty("brandCompany")
  public String getBrandCompany() {
    return brandCompany;
  }
  public void setBrandCompany(String brandCompany) {
    this.brandCompany = brandCompany;
  }

  
  /**
   * The ID used to identify a specific brand in API calls.
   **/
  
  @ApiModelProperty(value = "The ID used to identify a specific brand in API calls.")
  @JsonProperty("brandId")
  public String getBrandId() {
    return brandId;
  }
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  
  /**
   * The name of the brand.
   **/
  
  @ApiModelProperty(value = "The name of the brand.")
  @JsonProperty("brandName")
  public String getBrandName() {
    return brandName;
  }
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("colors")
  public java.util.List<NameValue> getColors() {
    return colors;
  }
  public void setColors(java.util.List<NameValue> colors) {
    this.colors = colors;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailContent")
  public java.util.List<BrandEmailContent> getEmailContent() {
    return emailContent;
  }
  public void setEmailContent(java.util.List<BrandEmailContent> emailContent) {
    this.emailContent = emailContent;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isOverridingCompanyName")
  public String getIsOverridingCompanyName() {
    return isOverridingCompanyName;
  }
  public void setIsOverridingCompanyName(String isOverridingCompanyName) {
    this.isOverridingCompanyName = isOverridingCompanyName;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isSendingDefault")
  public String getIsSendingDefault() {
    return isSendingDefault;
  }
  public void setIsSendingDefault(String isSendingDefault) {
    this.isSendingDefault = isSendingDefault;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isSigningDefault")
  public String getIsSigningDefault() {
    return isSigningDefault;
  }
  public void setIsSigningDefault(String isSigningDefault) {
    this.isSigningDefault = isSigningDefault;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("landingPages")
  public java.util.List<NameValue> getLandingPages() {
    return landingPages;
  }
  public void setLandingPages(java.util.List<NameValue> landingPages) {
    this.landingPages = landingPages;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("links")
  public java.util.List<BrandLink> getLinks() {
    return links;
  }
  public void setLinks(java.util.List<BrandLink> links) {
    this.links = links;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("logos")
  public BrandLogos getLogos() {
    return logos;
  }
  public void setLogos(BrandLogos logos) {
    this.logos = logos;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resources")
  public BrandResourceUrls getResources() {
    return resources;
  }
  public void setResources(BrandResourceUrls resources) {
    this.resources = resources;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;

    return true && Objects.equals(brandCompany, brand.brandCompany) &&
        Objects.equals(brandId, brand.brandId) &&
        Objects.equals(brandName, brand.brandName) &&
        Objects.equals(colors, brand.colors) &&
        Objects.equals(emailContent, brand.emailContent) &&
        Objects.equals(errorDetails, brand.errorDetails) &&
        Objects.equals(isOverridingCompanyName, brand.isOverridingCompanyName) &&
        Objects.equals(isSendingDefault, brand.isSendingDefault) &&
        Objects.equals(isSigningDefault, brand.isSigningDefault) &&
        Objects.equals(landingPages, brand.landingPages) &&
        Objects.equals(links, brand.links) &&
        Objects.equals(logos, brand.logos) &&
        Objects.equals(resources, brand.resources)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandCompany, brandId, brandName, colors, emailContent, errorDetails, isOverridingCompanyName, isSendingDefault, isSigningDefault, landingPages, links, logos, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    
    if (brandCompany != null)
      sb.append("    brandCompany: ").append(toIndentedString(brandCompany)).append("\n");
    if (brandId != null)
      sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    if (brandName != null)
      sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    if (colors != null)
      sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    if (emailContent != null)
      sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (isOverridingCompanyName != null)
      sb.append("    isOverridingCompanyName: ").append(toIndentedString(isOverridingCompanyName)).append("\n");
    if (isSendingDefault != null)
      sb.append("    isSendingDefault: ").append(toIndentedString(isSendingDefault)).append("\n");
    if (isSigningDefault != null)
      sb.append("    isSigningDefault: ").append(toIndentedString(isSigningDefault)).append("\n");
    if (landingPages != null)
      sb.append("    landingPages: ").append(toIndentedString(landingPages)).append("\n");
    if (links != null)
      sb.append("    links: ").append(toIndentedString(links)).append("\n");
    if (logos != null)
      sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
    if (resources != null)
      sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

