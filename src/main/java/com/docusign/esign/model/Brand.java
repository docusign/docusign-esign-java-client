package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BrandEmailContent;
import com.docusign.esign.model.BrandLogos;
import com.docusign.esign.model.BrandResourceUrls;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope..
 *
 */
@Schema(description = "Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope.")

public class Brand implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("brandCompany")
  private String brandCompany = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("brandLanguages")
  private java.util.List<String> brandLanguages = null;

  @JsonProperty("brandName")
  private String brandName = null;

  @JsonProperty("colors")
  private java.util.List<NameValue> colors = null;

  @JsonProperty("defaultBrandLanguage")
  private String defaultBrandLanguage = null;

  @JsonProperty("emailContent")
  private java.util.List<BrandEmailContent> emailContent = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("isOrganizationBrand")
  private String isOrganizationBrand = null;

  @JsonProperty("isOverridingCompanyName")
  private Boolean isOverridingCompanyName = null;

  @JsonProperty("isSendingDefault")
  private Boolean isSendingDefault = null;

  @JsonProperty("isSigningDefault")
  private Boolean isSigningDefault = null;

  @JsonProperty("landingPages")
  private java.util.List<NameValue> landingPages = null;

  @JsonProperty("links")
  private String links = null;

  @JsonProperty("logos")
  private BrandLogos logos = null;

  @JsonProperty("organizationBrandLogo")
  private String organizationBrandLogo = null;

  @JsonProperty("resources")
  private BrandResourceUrls resources = null;


  /**
   * brandCompany.
   *
   * @return Brand
   **/
  public Brand brandCompany(String brandCompany) {
    this.brandCompany = brandCompany;
    return this;
  }

  /**
   * The name of the company associated with this brand..
   * @return brandCompany
   **/
  @Schema(description = "The name of the company associated with this brand.")
  public String getBrandCompany() {
    return brandCompany;
  }

  /**
   * setBrandCompany.
   **/
  public void setBrandCompany(String brandCompany) {
    this.brandCompany = brandCompany;
  }


  /**
   * brandId.
   *
   * @return Brand
   **/
  public Brand brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * The ID used to identify a specific brand in API calls..
   * @return brandId
   **/
  @Schema(description = "The ID used to identify a specific brand in API calls.")
  public String getBrandId() {
    return brandId;
  }

  /**
   * setBrandId.
   **/
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  /**
   * brandLanguages.
   *
   * @return Brand
   **/
  public Brand brandLanguages(java.util.List<String> brandLanguages) {
    this.brandLanguages = brandLanguages;
    return this;
  }
  
  /**
   * addBrandLanguagesItem.
   *
   * @return Brand
   **/
  public Brand addBrandLanguagesItem(String brandLanguagesItem) {
    if (this.brandLanguages == null) {
      this.brandLanguages = new java.util.ArrayList<>();
    }
    this.brandLanguages.add(brandLanguagesItem);
    return this;
  }

  /**
   * .
   * @return brandLanguages
   **/
  @Schema(description = "")
  public java.util.List<String> getBrandLanguages() {
    return brandLanguages;
  }

  /**
   * setBrandLanguages.
   **/
  public void setBrandLanguages(java.util.List<String> brandLanguages) {
    this.brandLanguages = brandLanguages;
  }


  /**
   * brandName.
   *
   * @return Brand
   **/
  public Brand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * The name of the brand..
   * @return brandName
   **/
  @Schema(description = "The name of the brand.")
  public String getBrandName() {
    return brandName;
  }

  /**
   * setBrandName.
   **/
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  /**
   * colors.
   *
   * @return Brand
   **/
  public Brand colors(java.util.List<NameValue> colors) {
    this.colors = colors;
    return this;
  }
  
  /**
   * addColorsItem.
   *
   * @return Brand
   **/
  public Brand addColorsItem(NameValue colorsItem) {
    if (this.colors == null) {
      this.colors = new java.util.ArrayList<>();
    }
    this.colors.add(colorsItem);
    return this;
  }

  /**
   * .
   * @return colors
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getColors() {
    return colors;
  }

  /**
   * setColors.
   **/
  public void setColors(java.util.List<NameValue> colors) {
    this.colors = colors;
  }


  /**
   * defaultBrandLanguage.
   *
   * @return Brand
   **/
  public Brand defaultBrandLanguage(String defaultBrandLanguage) {
    this.defaultBrandLanguage = defaultBrandLanguage;
    return this;
  }

  /**
   * .
   * @return defaultBrandLanguage
   **/
  @Schema(description = "")
  public String getDefaultBrandLanguage() {
    return defaultBrandLanguage;
  }

  /**
   * setDefaultBrandLanguage.
   **/
  public void setDefaultBrandLanguage(String defaultBrandLanguage) {
    this.defaultBrandLanguage = defaultBrandLanguage;
  }


  /**
   * emailContent.
   *
   * @return Brand
   **/
  public Brand emailContent(java.util.List<BrandEmailContent> emailContent) {
    this.emailContent = emailContent;
    return this;
  }
  
  /**
   * addEmailContentItem.
   *
   * @return Brand
   **/
  public Brand addEmailContentItem(BrandEmailContent emailContentItem) {
    if (this.emailContent == null) {
      this.emailContent = new java.util.ArrayList<>();
    }
    this.emailContent.add(emailContentItem);
    return this;
  }

  /**
   * .
   * @return emailContent
   **/
  @Schema(description = "")
  public java.util.List<BrandEmailContent> getEmailContent() {
    return emailContent;
  }

  /**
   * setEmailContent.
   **/
  public void setEmailContent(java.util.List<BrandEmailContent> emailContent) {
    this.emailContent = emailContent;
  }


  /**
   * errorDetails.
   *
   * @return Brand
   **/
  public Brand errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Array or errors..
   * @return errorDetails
   **/
  @Schema(description = "Array or errors.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * isOrganizationBrand.
   *
   * @return Brand
   **/
  public Brand isOrganizationBrand(String isOrganizationBrand) {
    this.isOrganizationBrand = isOrganizationBrand;
    return this;
  }

  /**
   * .
   * @return isOrganizationBrand
   **/
  @Schema(description = "")
  public String getIsOrganizationBrand() {
    return isOrganizationBrand;
  }

  /**
   * setIsOrganizationBrand.
   **/
  public void setIsOrganizationBrand(String isOrganizationBrand) {
    this.isOrganizationBrand = isOrganizationBrand;
  }


  /**
   * isOverridingCompanyName.
   *
   * @return Brand
   **/
  public Brand isOverridingCompanyName(Boolean isOverridingCompanyName) {
    this.isOverridingCompanyName = isOverridingCompanyName;
    return this;
  }

  /**
   * .
   * @return isOverridingCompanyName
   **/
  @Schema(description = "")
  public Boolean isIsOverridingCompanyName() {
    return isOverridingCompanyName;
  }

  /**
   * setIsOverridingCompanyName.
   **/
  public void setIsOverridingCompanyName(Boolean isOverridingCompanyName) {
    this.isOverridingCompanyName = isOverridingCompanyName;
  }


  /**
   * isSendingDefault.
   *
   * @return Brand
   **/
  public Brand isSendingDefault(Boolean isSendingDefault) {
    this.isSendingDefault = isSendingDefault;
    return this;
  }

  /**
   * .
   * @return isSendingDefault
   **/
  @Schema(description = "")
  public Boolean isIsSendingDefault() {
    return isSendingDefault;
  }

  /**
   * setIsSendingDefault.
   **/
  public void setIsSendingDefault(Boolean isSendingDefault) {
    this.isSendingDefault = isSendingDefault;
  }


  /**
   * isSigningDefault.
   *
   * @return Brand
   **/
  public Brand isSigningDefault(Boolean isSigningDefault) {
    this.isSigningDefault = isSigningDefault;
    return this;
  }

  /**
   * .
   * @return isSigningDefault
   **/
  @Schema(description = "")
  public Boolean isIsSigningDefault() {
    return isSigningDefault;
  }

  /**
   * setIsSigningDefault.
   **/
  public void setIsSigningDefault(Boolean isSigningDefault) {
    this.isSigningDefault = isSigningDefault;
  }


  /**
   * landingPages.
   *
   * @return Brand
   **/
  public Brand landingPages(java.util.List<NameValue> landingPages) {
    this.landingPages = landingPages;
    return this;
  }
  
  /**
   * addLandingPagesItem.
   *
   * @return Brand
   **/
  public Brand addLandingPagesItem(NameValue landingPagesItem) {
    if (this.landingPages == null) {
      this.landingPages = new java.util.ArrayList<>();
    }
    this.landingPages.add(landingPagesItem);
    return this;
  }

  /**
   * .
   * @return landingPages
   **/
  @Schema(description = "")
  public java.util.List<NameValue> getLandingPages() {
    return landingPages;
  }

  /**
   * setLandingPages.
   **/
  public void setLandingPages(java.util.List<NameValue> landingPages) {
    this.landingPages = landingPages;
  }


  /**
   * links.
   *
   * @return Brand
   **/
  public Brand links(String links) {
    this.links = links;
    return this;
  }

  /**
   * .
   * @return links
   **/
  @Schema(description = "")
  public String getLinks() {
    return links;
  }

  /**
   * setLinks.
   **/
  public void setLinks(String links) {
    this.links = links;
  }


  /**
   * logos.
   *
   * @return Brand
   **/
  public Brand logos(BrandLogos logos) {
    this.logos = logos;
    return this;
  }

  /**
   * The URIs for retrieving the logos that are associated with the brand..
   * @return logos
   **/
  @Schema(description = "The URIs for retrieving the logos that are associated with the brand.")
  public BrandLogos getLogos() {
    return logos;
  }

  /**
   * setLogos.
   **/
  public void setLogos(BrandLogos logos) {
    this.logos = logos;
  }


  /**
   * organizationBrandLogo.
   *
   * @return Brand
   **/
  public Brand organizationBrandLogo(String organizationBrandLogo) {
    this.organizationBrandLogo = organizationBrandLogo;
    return this;
  }

  /**
   * .
   * @return organizationBrandLogo
   **/
  @Schema(description = "")
  public String getOrganizationBrandLogo() {
    return organizationBrandLogo;
  }

  /**
   * setOrganizationBrandLogo.
   **/
  public void setOrganizationBrandLogo(String organizationBrandLogo) {
    this.organizationBrandLogo = organizationBrandLogo;
  }


  /**
   * resources.
   *
   * @return Brand
   **/
  public Brand resources(BrandResourceUrls resources) {
    this.resources = resources;
    return this;
  }

  /**
   * An object containing the URLs for the four DocuSign master resource files that the brand uses for sending, signing, email messages, and captive (embedded) signing. You can modify the default email messages and formats in these file to customize the user experience.  **Note:** This object is returned only when the `resourceContentType` is `sending`, `signing`, `email`, or `signing_captive`..
   * @return resources
   **/
  @Schema(description = "An object containing the URLs for the four DocuSign master resource files that the brand uses for sending, signing, email messages, and captive (embedded) signing. You can modify the default email messages and formats in these file to customize the user experience.  **Note:** This object is returned only when the `resourceContentType` is `sending`, `signing`, `email`, or `signing_captive`.")
  public BrandResourceUrls getResources() {
    return resources;
  }

  /**
   * setResources.
   **/
  public void setResources(BrandResourceUrls resources) {
    this.resources = resources;
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
    Brand brand = (Brand) o;
    return Objects.equals(this.brandCompany, brand.brandCompany) &&
        Objects.equals(this.brandId, brand.brandId) &&
        Objects.equals(this.brandLanguages, brand.brandLanguages) &&
        Objects.equals(this.brandName, brand.brandName) &&
        Objects.equals(this.colors, brand.colors) &&
        Objects.equals(this.defaultBrandLanguage, brand.defaultBrandLanguage) &&
        Objects.equals(this.emailContent, brand.emailContent) &&
        Objects.equals(this.errorDetails, brand.errorDetails) &&
        Objects.equals(this.isOrganizationBrand, brand.isOrganizationBrand) &&
        Objects.equals(this.isOverridingCompanyName, brand.isOverridingCompanyName) &&
        Objects.equals(this.isSendingDefault, brand.isSendingDefault) &&
        Objects.equals(this.isSigningDefault, brand.isSigningDefault) &&
        Objects.equals(this.landingPages, brand.landingPages) &&
        Objects.equals(this.links, brand.links) &&
        Objects.equals(this.logos, brand.logos) &&
        Objects.equals(this.organizationBrandLogo, brand.organizationBrandLogo) &&
        Objects.equals(this.resources, brand.resources);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(brandCompany, brandId, brandLanguages, brandName, colors, defaultBrandLanguage, emailContent, errorDetails, isOrganizationBrand, isOverridingCompanyName, isSendingDefault, isSigningDefault, landingPages, links, logos, organizationBrandLogo, resources);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    isOrganizationBrand: ").append(toIndentedString(isOrganizationBrand)).append("\n");
    sb.append("    isOverridingCompanyName: ").append(toIndentedString(isOverridingCompanyName)).append("\n");
    sb.append("    isSendingDefault: ").append(toIndentedString(isSendingDefault)).append("\n");
    sb.append("    isSigningDefault: ").append(toIndentedString(isSigningDefault)).append("\n");
    sb.append("    landingPages: ").append(toIndentedString(landingPages)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
    sb.append("    organizationBrandLogo: ").append(toIndentedString(organizationBrandLogo)).append("\n");
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

