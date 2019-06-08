package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BrandEmailContent;
import com.docusign.esign.model.BrandLink;
import com.docusign.esign.model.BrandLogos;
import com.docusign.esign.model.BrandResourceUrls;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Brand
 */

public class Brand {
  @JsonProperty("brandCompany")
  private String brandCompany = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("brandLanguages")
  private java.util.List<String> brandLanguages = new java.util.ArrayList<String>();

  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("colors")
  private java.util.List<NameValue> colors = new java.util.ArrayList<NameValue>();

  @JsonProperty("defaultBrandLanguage")
  private String defaultBrandLanguage = null;

  @JsonProperty("emailContent")
  private java.util.List<BrandEmailContent> emailContent = new java.util.ArrayList<BrandEmailContent>();

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("isOverridingCompanyName")
  private Boolean isOverridingCompanyName = null;

  @JsonProperty("isSendingDefault")
  private Boolean isSendingDefault = null;

  @JsonProperty("isSigningDefault")
  private Boolean isSigningDefault = null;

  @JsonProperty("landingPages")
  private java.util.List<NameValue> landingPages = new java.util.ArrayList<NameValue>();

  @JsonProperty("links")
  private java.util.List<BrandLink> links = new java.util.ArrayList<BrandLink>();

  @JsonProperty("logos")
  private BrandLogos logos = null;

  @JsonProperty("resources")
  private BrandResourceUrls resources = null;

  public Brand brandCompany(String brandCompany) {
    this.brandCompany = brandCompany;
    return this;
  }

   /**
   * The name of the company associated with this brand.
   * @return brandCompany
  **/
  @ApiModelProperty(example = "null", value = "The name of the company associated with this brand.")
  public String getBrandCompany() {
    return brandCompany;
  }

  public void setBrandCompany(String brandCompany) {
    this.brandCompany = brandCompany;
  }

  public Brand brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * The ID used to identify a specific brand in API calls.
   * @return brandId
  **/
  @ApiModelProperty(example = "null", value = "The ID used to identify a specific brand in API calls.")
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public Brand brandLanguages(java.util.List<String> brandLanguages) {
    this.brandLanguages = brandLanguages;
    return this;
  }

  public Brand addBrandLanguagesItem(String brandLanguagesItem) {
    this.brandLanguages.add(brandLanguagesItem);
    return this;
  }

   /**
   * 
   * @return brandLanguages
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getBrandLanguages() {
    return brandLanguages;
  }

  public void setBrandLanguages(java.util.List<String> brandLanguages) {
    this.brandLanguages = brandLanguages;
  }

  public Brand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * The name of the brand.
   * @return brandName
  **/
  @ApiModelProperty(example = "null", value = "The name of the brand.")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public Brand colors(java.util.List<NameValue> colors) {
    this.colors = colors;
    return this;
  }

  public Brand addColorsItem(NameValue colorsItem) {
    this.colors.add(colorsItem);
    return this;
  }

   /**
   * 
   * @return colors
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<NameValue> getColors() {
    return colors;
  }

  public void setColors(java.util.List<NameValue> colors) {
    this.colors = colors;
  }

  public Brand defaultBrandLanguage(String defaultBrandLanguage) {
    this.defaultBrandLanguage = defaultBrandLanguage;
    return this;
  }

   /**
   * 
   * @return defaultBrandLanguage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultBrandLanguage() {
    return defaultBrandLanguage;
  }

  public void setDefaultBrandLanguage(String defaultBrandLanguage) {
    this.defaultBrandLanguage = defaultBrandLanguage;
  }

  public Brand emailContent(java.util.List<BrandEmailContent> emailContent) {
    this.emailContent = emailContent;
    return this;
  }

  public Brand addEmailContentItem(BrandEmailContent emailContentItem) {
    this.emailContent.add(emailContentItem);
    return this;
  }

   /**
   * 
   * @return emailContent
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<BrandEmailContent> getEmailContent() {
    return emailContent;
  }

  public void setEmailContent(java.util.List<BrandEmailContent> emailContent) {
    this.emailContent = emailContent;
  }

  public Brand errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Brand isOverridingCompanyName(Boolean isOverridingCompanyName) {
    this.isOverridingCompanyName = isOverridingCompanyName;
    return this;
  }

   /**
   * 
   * @return isOverridingCompanyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsOverridingCompanyName() {
    return isOverridingCompanyName;
  }

  public void setIsOverridingCompanyName(Boolean isOverridingCompanyName) {
    this.isOverridingCompanyName = isOverridingCompanyName;
  }

  public Brand isSendingDefault(Boolean isSendingDefault) {
    this.isSendingDefault = isSendingDefault;
    return this;
  }

   /**
   * 
   * @return isSendingDefault
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsSendingDefault() {
    return isSendingDefault;
  }

  public void setIsSendingDefault(Boolean isSendingDefault) {
    this.isSendingDefault = isSendingDefault;
  }

  public Brand isSigningDefault(Boolean isSigningDefault) {
    this.isSigningDefault = isSigningDefault;
    return this;
  }

   /**
   * 
   * @return isSigningDefault
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsSigningDefault() {
    return isSigningDefault;
  }

  public void setIsSigningDefault(Boolean isSigningDefault) {
    this.isSigningDefault = isSigningDefault;
  }

  public Brand landingPages(java.util.List<NameValue> landingPages) {
    this.landingPages = landingPages;
    return this;
  }

  public Brand addLandingPagesItem(NameValue landingPagesItem) {
    this.landingPages.add(landingPagesItem);
    return this;
  }

   /**
   * 
   * @return landingPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<NameValue> getLandingPages() {
    return landingPages;
  }

  public void setLandingPages(java.util.List<NameValue> landingPages) {
    this.landingPages = landingPages;
  }

  public Brand links(java.util.List<BrandLink> links) {
    this.links = links;
    return this;
  }

  public Brand addLinksItem(BrandLink linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * 
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<BrandLink> getLinks() {
    return links;
  }

  public void setLinks(java.util.List<BrandLink> links) {
    this.links = links;
  }

  public Brand logos(BrandLogos logos) {
    this.logos = logos;
    return this;
  }

   /**
   * Get logos
   * @return logos
  **/
  @ApiModelProperty(example = "null", value = "")
  public BrandLogos getLogos() {
    return logos;
  }

  public void setLogos(BrandLogos logos) {
    this.logos = logos;
  }

  public Brand resources(BrandResourceUrls resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(example = "null", value = "")
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
    return Objects.equals(this.brandCompany, brand.brandCompany) &&
        Objects.equals(this.brandId, brand.brandId) &&
        Objects.equals(this.brandLanguages, brand.brandLanguages) &&
        Objects.equals(this.brandName, brand.brandName) &&
        Objects.equals(this.colors, brand.colors) &&
        Objects.equals(this.defaultBrandLanguage, brand.defaultBrandLanguage) &&
        Objects.equals(this.emailContent, brand.emailContent) &&
        Objects.equals(this.errorDetails, brand.errorDetails) &&
        Objects.equals(this.isOverridingCompanyName, brand.isOverridingCompanyName) &&
        Objects.equals(this.isSendingDefault, brand.isSendingDefault) &&
        Objects.equals(this.isSigningDefault, brand.isSigningDefault) &&
        Objects.equals(this.landingPages, brand.landingPages) &&
        Objects.equals(this.links, brand.links) &&
        Objects.equals(this.logos, brand.logos) &&
        Objects.equals(this.resources, brand.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandCompany, brandId, brandLanguages, brandName, colors, defaultBrandLanguage, emailContent, errorDetails, isOverridingCompanyName, isSendingDefault, isSigningDefault, landingPages, links, logos, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    
    sb.append("    brandCompany: ").append(toIndentedString(brandCompany)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandLanguages: ").append(toIndentedString(brandLanguages)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    defaultBrandLanguage: ").append(toIndentedString(defaultBrandLanguage)).append("\n");
    sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    isOverridingCompanyName: ").append(toIndentedString(isOverridingCompanyName)).append("\n");
    sb.append("    isSendingDefault: ").append(toIndentedString(isSendingDefault)).append("\n");
    sb.append("    isSigningDefault: ").append(toIndentedString(isSigningDefault)).append("\n");
    sb.append("    landingPages: ").append(toIndentedString(landingPages)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
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

