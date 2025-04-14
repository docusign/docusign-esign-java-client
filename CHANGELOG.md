# DocuSign Java Client Changelog
See [DocuSign Support Center](https://support.docusign.com/en/releasenotes/) for Product Release Notes.

## [v6.1.0-RC1] - eSignature API v2.1-25.1.00.02 - 2025-04-04
### Changed
- Added support for version v2.1-25.1.00.02 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v6.0.0] - eSignature API v2.1-24.2.00.00 - 2024-07-25
### Breaking Changes

<details>
<summary>API Changes (Click to expand)</summary>

<div style="margin-left: 20px;">

<br/>
Added support for version v2.1-24.2.00.00 of the Docusign ESignature API.

  ## Endpoint-Specific Changes

  ### Updated [Envelopes: get](https://developers.docusign.com/docs/esign-rest-api/reference/envelopes/envelopes/get/)
  Added new optional query parameter named `include_anchor_tab_locations` of type string.

  ### Updated [Envelopes: update](https://developers.docusign.com/docs/esign-rest-api/reference/envelopes/envelopes/update/)
  Added new optional query parameter named `recycle_on_void` of type string.

  ### Updated [EnvelopeViews : createCorrect](https://developers.docusign.com/docs/esign-rest-api/reference/envelopes/envelopeviews/createcorrect/)
  Request body object `correctViewRequest` has been changed to `envelopeViewRequest`.

  ## Model Changes

  ### Updated existing models

  ### `accountInformation`

  - **Added fields:**
    - `freeEnvelopeSendsRemainingForAdvancedDocGen`

  ### `accountSettingsInformation`

  - **Added fields:**
    - `defaultSigningResponsiveView`
    - `defaultSigningResponsiveViewMetadata`
    - `dss_SCOREFDN_196_Rebrand_DocuSignIsNotAVerb`
    - `enableAdditionalAdvancedWebFormsFeatures`
    - `enableAdditionalAdvancedWebFormsFeaturesMetadata`

- **Removed fields:**
    - `enableSaveAsEnvelopeCustomFieldInWebForms`
    - `enableSaveAsEnvelopeCustomFieldInWebFormsMetadata`

### `bulksendingCopyDocGenFormField`

- **Added field:**
  - `rowValues`

### `notaryRecipient`

- **Added field:**
  - `canNotaryCorrectEnvelope`

### `tabAccountSettings`

- **Added field:**
  - `enableTabAgreementDetails`
  - `enableTabAgreementDetailsMetadata`


### Newly added Models

- `bulkSendingCopyDocGenFormFieldRowValue`

</div>
</details>
- Deprecation of OLTU library: The OLTU library for handling OAuth is no longer used.

### Other Changes
- Upgradation of OWASP for vulnerability check of dependencies.
- Updated the SDK release version.

## [v6.0.0-RC2] - eSignature API v2.1-24.2.00.00 - 2024-07-12
### Changed
- Deprecation of OLTU library: The OLTU library for handling OAuth is no longer used.
- Upgradation of OWASP for vulnerability check of dependencies.
- Updated the SDK release version.
## [v6.0.0-RC1] - eSignature API v2.1-24.2.00.00 - 2024-06-28
### Changed
- Added support for version v2.1-24.2.00.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v5.1.0] - eSignature API v2.1-24.1.01.00 - 2024-06-25
# Changed

- **Model classes are now serializable.**
- **Resolved an issue** where setting a default SSL socket for the entire JVM caused unintended side effects.
- **Fixed a memory leak** related to the class loader.
- **Addressed dependency vulnerabilities** in the following libraries:
  - `bcprov-jdk18on` updated to version 1.78.1
  - `com.fasterxml.jackson.core` updated to version 2.17.1
  - `org.json` updated to version 20240303
  - `jersey` updated to version 3.1.6
## [v5.0.0] - eSignature API v2.1-24.1.01.00 - 2024-05-22
## Endpoint-Specific Changes

### Updated [EnvelopeRecipients: createRecipientProofFileResourceToken](https://developers.docusign.com/docs/esign-rest-api/reference/envelopes/enveloperecipients/createrecipientprooffileresourcetoken/)
The `"token_scopes"` parameter has been moved from path parameters to query parameters for the above mentioned endpoint.

### Updated [EnvelopeView:CreateSender](https://developers.docusign.com/docs/esign-rest-api/reference/envelopes/envelopeviews/createsender/) and [EnvelopeView:CreateEdit](https://developers.docusign.com/docs/esign-rest-api/reference/envelopes/envelopeviews/createedit/)
The body parameter `returnUrlRequest` has been changed to `envelopeViewRequest`.
`envelopeViewRequest` has the same properties as the previous `returnUrlRequest` but now includes additional `viewAccess` and `settings` properties, where settings is a complex object with several UI controls for the view experience.

### Updated [TemplateViews: createEdit](https://developers.docusign.com/docs/esign-rest-api/reference/templates/templateviews/createedit/)
The body parameter `returnUrlRequest` has been changed to `templateViewRequest`.
`templateViewRequest` has the same properties as the previous `returnUrlRequest` but now includes an additional `viewAccess` string.

## Model Changes

- Updated existing models

### `accountSettingsInformation`

- **Added fields:**
  - `allowConnectEnvelopeRemovedEvent`
  - `allowOrganizationBranding`
  - `allowOrganizationBrandingMetadata`
  - `allowPendingDestinationUrlEdition`
  - `allowPendingDestinationUrlEditionMetadata`
  - `disableBulkSendRecipientLimit`
  - `disableBulkSendRecipientLimitMetaData`
  - `enableAdvancedSearch`
  - `enableAdvancedSearchMetadata`
  - `enableContentSearch`
  - `enableContentSearchMetadata`
  - `enableMultiUserRepositoryFeatures`
  - `enableMultiUserRepositoryFeaturesMetadata`
  - `enablePremiumDataVerificationExtensions`
  - `enablePremiumDataVerificationExtensionsMetadata`
  - `enableSaveAsEnvelopeCustomFieldInWebForms`
  - `enableSaveAsEnvelopeCustomFieldInWebFormsMetadata`
  - `enableScheduledRelease`
  - `enableScheduledReleaseMetadata`
  - `isvOemEmbed`
  - `isvOemEmbedMetaData`

- **Removed fields:**
  - `enableInboxRelevanceSortForRecentAccounts`
  - `enableInboxRelevanceSortForRecentAccountsMetadata`
  - `enableScheduledRelease`
  - `enableScheduledReleaseMetadata`
  - `enableSearch`
  - `enableSearchMetadata`
  - `enableSearchUI`
  - `enableSearchUIMetadata`

### `accountUISettings`

- **Added fields:**
  - `enableEnvelopeTypes`
  - `enableEnvelopeTypesMetadata`

### `envelopDefinitions`

- **Added field:**
  - `uSigState`

### `envelopTemplate`

- **Added field:**
  - `uSigState`

### `group`

- **Added property:**
  - `lastModifiedOn`

### `receipientViewRequest`

- **Added property:**
  - `displayFormat`

### `userSettingsInformation`

- **Added properties:**
  - `accountAgreementsAccessType`
  - `accountAgreementsAccessTypeMetadata`
  - `canBulkUploadAgreements`
  - `canBulkUploadAgreementsMetadata`
  - `canManageAgreementParties`
  - `canManageAgreementPartiesMetadata`

### Newly added Models

- `envelopeViewDocumentSettings`
- `envelopeViewEnvelopeCustomFieldSettings`
- `envelopeViewRecipientSettings`
- `envelopeViewRequest`
- `envelopeViewSettings`
- `envelopeViewTaggerSettings`
- `envelopeViewTemplateSettings`
- `paletteItemSettings`
- `paletteSettings`
- `templateViewRequest`

### Removed Models
- `returnUrlRequest`

## [v5.0.0-RC1] - eSignature API v2.1-24.1.01.00 - 2024-05-02
### Changed
- Added support for version v2.1-24.1.01.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.6.0] - eSignature API v2.1-23.4.02.00 - 2024-04-30
### BREAKING CHANGES
- Modified the default basePath to `DEMO_REST_BASEPATH`.
### OTHER CHANGES
- Revised the logic to determine the `oAuthBasePath` based on the `basePath`.
- Added support for version v2.1-23.4.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.6.0-RC1] - eSignature API v2.1-23.4.02.00 - 2024-03-12
### Changed
- Added support for version v2.1-23.4.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.6.0-ALPHA1] - eSignature API v2.1-23.4.02.00 - 2024-03-07
### BREAKING CHANGES
- Modified the default basePath to `DEMO_REST_BASEPATH`.
### OTHER CHANGES
- Revised the logic to determine the `oAuthBasePath` based on the `basePath`.
- Added support for version v2.1-23.4.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.5.0] - eSignature API v2.1-23.3.01.02 - 2023-10-25
### Changed
- Added support for version v2.1-23.3.01.02 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.4.0] - eSignature API v2.1-23.3.00.01 - 2023-08-30
### Changed
- Added support for version v2.1-23.3.00.01 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.3.0] - eSignature API v2.1-23.2.00.00 - 2023-05-15
### Changed
- Added support for version v2.1-23.2.00.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.2.0] - eSignature API v2.1-23.1.01.01 - 2023-04-05
### Changed
- Added support for version v2.1-23.1.01.01 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.1.0] - eSignature API v2.1-23.1.01.00 - 2023-03-17
### Changed
- Added support for version v2.1-23.1.01.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v4.0.0-RC1] - eSignature API v2.1-22.4.02.00 - 2023-02-23
### Breaking Changes
- Migrated from Java EE to Jakarta
- Updated dependencies to the Jakarta supported versions

### Migration Notes
- In order to use this version of the Java ESign SDK, clients must upgrade to Jakarta
- Clients that are unable to upgrade to Jakarta may reference the Uber JAR in order to maintain backwards compatibility
## [v3.23.0] - eSignature API v2.1-22.4.02.00 - 2023-02-09
### Changed
- Added support for version v2.1-22.4.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.
- Bundled external dependencies into an uber jar. 

## [v3.22.0] - eSignature API v2.1-22.3.01.00 - 2022-12-06
### Changed
- Added support for version v2.1-22.3.01.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v3.21.0] - eSignature API v2.1-22.3.00.00 - 2022-08-30
### Changed
- Added support for version v2.1-1.2.7 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v3.20.0] - eSignature API v2.1-22.2.00.00 - 2022-06-17
### Changed
- Added support for version v2.1-22.2.00.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v3.19.0] - eSignature API v2.1-22.1.02.00 - 2022-05-18
### Changed
- Added support for version v2.1-22.1.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v3.18.0] - eSignature API v2.1-22.1.01.00 - 2022-04-08
### Changed
- Added support for version v2.1-22.1.01.00 of the DocuSign ESignature API.
- Updated the SDK release version.

### Breaking
- Following models are renamed

    - `ScheduledSendingApiModel` is renamed to `ScheduledSending`
    - `DelayedRoutingApiModel` is renamed to `DelayedRouting`

## [v3.17.1] - eSignature API v2.1-21.4.02.00 - 2022-02-12
### Changed
- Added support for version v2.1-21.4.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.
## Fixed
- regression issues with List tabs class wrongly named "ModelList".

## [v3.17.0] - eSignature API v2.1-21.4.02.00 - 2022-02-11
### Changed
- Added support for version v2.1-21.4.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v3.17.0-RC1] - eSignature API v2.1-21.4.01.00 - 2022-01-07
### Changed
- Added support for version v2.1-21.4.01.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [v3.16.1] - eSignature API v2.1-21.4.00.00 - 2021-12-16
### Changed
- Added support for version v2.1-21.4.00.00 of the DocuSign ESignature API.
- Updated the SDK release version.

## [3.16.0-RC1] - ESignature API v2.1-21.3.02.00 - 2021-10-29
### Changed
- Added support for version v2.1-21.3.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.
### Added
- Code linting.

## [v3.15.0] - ESignature API v2.1-21.3.00.00 - 2021-09-29
### Changed
- Added support for version v2-21.3.00.00 of the DocuSign eSignature API.
- Updated the SDK release version.
### Added
- SSL certificate chain-of-trust validation. (DCM-5802)
### Removed
- Removed jackson-datatype-joda dependency.

## [v3.15.0-RC1] - ESignature API v2.1-21.2.02.00 - 2021-08-30
### Changed
- Added support for version v2.1-21.2.02.00 of the DocuSign ESignature API.
- Updated the SDK release version.
### Removed
- Removed Joda dependency.

## [v3.14.0] - eSignature API v2.1-21.2.00.00 - 2021-07-22
### Changed
- Added support for version v2.1-21.2.00.00 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.14.0-RC1] - eSignature API v2.1-21.2.00.00 - 2021-07-09
### Changed
- Added support for version v2.1-21.2.00.00 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.13.1] - eSignature API v2.1-21.1.02.00 - 2021-07-07
### Fixed
- Issue [`#194`](https://github.com/docusign/docusign-java-client/issues/194):  Error Reading Entity from Input Stream. (DCM-5802)

## [v3.13.1-RC1] - eSignature API v2.1-21.1.02.00 - 2021-05-28
### Fixed
- Issue [`#194`](https://github.com/docusign/docusign-java-client/issues/194):  Error Reading Entity from Input Stream. (DCM-5802)

## [v3.13.0-RC1] - eSignature API v2.1-21.1.02.00 - 2021-05-24
### Removed
- Removed methods `getAccountSettingsExport`,`getSealProviders` from Accounts.
- Removed methods `createConnectSecret`,`deleteConnectSecret`,`generateConnectSecret`,`getConnectSecrets` from Connect.
- Removed methods `getDynamicSystemSettings`,`getTemplateInfo`,`getApplianceInfo`,`getAccount`,`getCustomFields`,`deleteCustomFieldsV2`,`getDocumentPages`,`getImage`,`getLocalePolicy`,`updatePageInfo`,`createPageInfo`,`deletePageInfo`,`updatePdf`,`getPdf`,`getPdfBlob`,`updatePdfBlob`,`createPdfBlob`,`updateRecipientDeniedDocumentCopy`,`deleteRecipientDeniedDocumentCopy`,`getSignerAttachment`,`deleteSignerAttachment`, from Envelopes.
- Removed methods `completeSignHash`,`getUserInfo`,`healthCheck`,`signHashSessionInfo`,`updateTransaction` from TrustServiceProviders.
- Removed methods `getUserListExport` from Users.
### Added
- Added new methods `getBulkSendBatchEnvelopes` to BulkEnvelopes.
### Changed
- Added support for version v2.1-21.1.02.00 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.12.0] - eSignature API v2.1-21.1.01.03 - 2021-04-26
### Added
- Added new methods `deleteCustomFieldsV2`, `deletePageInfoV2`, `getApplianceEnvelopeInfo`, `getTemplateInfo` to envelopes.
- Added new method `deleteConnectSecret` to connect.
### Changed
- Added support for version v2.1-21.1.01.03 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.12.0-RC1] - eSignature API v2.1-21.1.01 - 2021-04-13
### Changed
- Added support for version v2.1-21.1.01 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.11.0-RC2] - eSignature API v2.1-20.4.01 - 2021-01-20
### Changed
- Added support for version v2.1-20.4.01 of the DocuSign eSignature API.
- Updated the SDK release version.
### Fixed
- Expected field name for **Group level** brands resource model is `brandOptions` (as opposed to `brands`). The model name has been renamed to `GroupBrands` (instead of `BrandsResponse`). Setter and Getter methods were also updated. (DCM-4463)

## [v3.10.1] - eSignature API v2.1-20.3.01 - 2020-10-29
### Changed
- Added support for version v2.1-20.3.01 of the DocuSign eSignature API.
- Updated the SDK release version.
- Updated ApiClient to use an empty JSON object if the body is null. (DCM-4359)
### Fixed
- AccountBrands::updateBrandResourcesByContentType is missing brand file option. (DCM-3868)

## [v3.10.0-RC1] - eSignature API v2.1-20.3.01 - 2020-10-15
### Changed
- Added support for version v2.1-20.3.01 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.9.0] - eSignature API v2.1-20.3.00 - 2020-09-24
### Changed
- Added support for version v2.1-20.3.00 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.9.0-RC1] - eSignature API v2.1-20.3.00 - 2020-09-14
### Changed
- Added support for version v2.1-20.3.00 of the DocuSign eSignature API.
- Updated the SDK release version.

## [3.8.0] - Jersey2 with support of DELETE request body - 2020-08-21
### Changed
- Upgraded the HTTP client from Jersey1 to Jersey 2. This resulted in a non-breaking change but the dependency list has largely been changed. (DCM-3324)
- Added support for request body in all DELETE methods. (DCM-4454)
- Added support for version v2.1-20.2.02 of the DocuSign eSignature API.
- Updated the SDK release version.

## [3.8.0-BETA] - Jersey2 with support of DELETE request body - 2020-08-11
### Changed
- Upgraded the HTTP client from Jersey1 to Jersey 2. This resulted in a non-breaking change but the dependency list has largely been changed. (DCM-3324)
- Added support for request body in all DELETE methods. (DCM-4454)
- Added support for version v2.1-20.2.02 of the DocuSign eSignature API.
- Updated the SDK release version.

## [3.7.0-BETA] - Upgrade to Jersey2 - 2020-07-02
### Changed
- Upgraded the HTTP client from Jersey1 to Jersey 2. This resulted in a non-breaking change but the dependency list
 has largely been changed. (DCM-3324)
- Added support for version v2.1-20.2.00 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.6.0] - eSignature API v2.1-20.1.02 - 2020-06-02
### Changed
- Added support for version v2.1-20.1.02 of the DocuSign eSignature API.
- Updated the SDK release version.

## [v3.5.0] - eSignature API v2.1-20.1.00 - 2020-03-30
### Changed
- Added support for version v2.1-20.1.00 of the DocuSign eSignature API.
- Updated the SDK release version.
### Fixed
- POST calls fail on some instances of WebLogic server because of strict Content-Length policy (DCM-3939).
### Added
- Added the new property `copyRecipientData` to envelopes. When set to **true**, the information that recipients enter is retained when you clone an envelope. For example, if you resend an envelope that was declined or voided after one or more recipients entered data, that data is retained. Note that the new account UI setting `enableEnvelopeCopyWithData` must be enabled for the account.
- Added `RecipientIdentityInputOption` and `inputOptions` to `RecipientIdentityVerification`: Reserved for DocuSign.

## [v3.4.0-RC1] - 2020-03-03
### Fixed
- POST calls fail on some instances of WebLogic server because of strict Content-Length policy. (DCM-3939)

## [v3.3.0] - eSignature API v2.1-19.4.01 - 2020-02-03
### Changed
- The SDK now supports version 19.4.01 of the DocuSign eSignature v2.1 API.
- SDK Release Version updated.

## [v3.3.0-RC1] - eSignature API v2.1-19.4.01 - 2019-12-31
### Changed
- The SDK now supports version 19.4.01 of the DocuSign eSignature v2.1 API.
- SDK Release Version updated.

## [v3.2.0] - eSignature API v2.1-19.2.02 - 2019-10-08
### Changed
- The SDK now supports version 19.2.02 of the DocuSign eSignature v2.1 API.
- SDK Release Version updated.
- Changed JDK versions for TravisCI as older versions reached EOL.
## Fixed
- Issue [`#55`](https://github.com/docusign/docusign-java-client/issues/55): Unable to revoke OAuth token. (DCM-2926)
- requestJWTUserToken does not give error response in exception. (DCM-3410)

## [v3.2.0-RC2] - eSignature API v2.1-19.2.02 - 2019-08-29
### Changed
- The SDK now supports version 19.2.02 of the DocuSign eSignature v2.1 API.
- SDK Release Version updated.
## Fixed
- Issue [`#55`](https://github.com/docusign/docusign-java-client/issues/55): Unable to revoke OAuth token. (DCM-2926)
- requestJWTUserToken does not give error response in exception. (DCM-3410)

## [v3.1.0] Full support of the Bulk Send API - 2019-06-26
## Fixed
- Issue [`#98`](https://github.com/docusign/docusign-java-client/issues/98): 411 Error thrown from BulkEnvelopesAPI updateRecipients call.

## [v3.0.1] - eSignature API v2.1-19.1.02 - 2019-06-25
### BREAKING
- The SDK now supports version v2.1-19.1.02 of the DocuSign eSignature v2.1 API.
- SDK Release Version updated.
### Removed
- Removed hardcoded test config values from the test cases. Now getting test config values from the environment variables.

## [v3.0.0-RC1] - eSignature API v2.1-19.1.02 - 2019-06-07
### BREAKING
- The SDK now supports version v2.1-19.1.02 of the DocuSign eSignature v2.1 API.
- SDK Release Version updated.

## [v2.10.1] - Jackson library patch - 2019-05-23
### Security
- [CVE-2019-12086](https://nvd.nist.gov/vuln/detail/CVE-2019-12086).

## [v2.10.0] - eSignature API v19.1.02 - 2019-05-16
### Changed
- The SDK now supports version 19.1.02 of the DocuSign eSignature API.
- SDK Release Version updated.
### Added
- Added support for the new http.nonProxyHosts Proxy option, which you can use to indicate hosts that should be accessed without going through a proxy.  (DCM-2850)
- Added new Cache-Control and Pragma headers to OAuth server request calls. (DCM-2242)
- Added a new *tabGroupLabels* field to all Tabs models
- Added a new *Witnesses* field to all Recipients models
- Implemented models for Smart Sections feature
- Implemented initial support of HMAC for DocuSign Connect
### Fixed
- A bug with that could cause the *moveEnvelopes* method call to return a response without a *Content-Type* header. (DCM-1403)
- A bug that could prevent a user from replacing their JWT auth token. (DCM-3209)
- Removed Gradle references to an insecure/outdated Jackson package. (DCM-3267)

## [v2.10.0-RC2] - eSignature API v19.1.02 - 2019-05-09
### Fixed
- A regression bug where the ApiClient authentications member field was locked and prevented writing to it.

## [v2.10.0-RC1] - eSignature API v19.1.02 - 2019-05-03
### Changed
- The SDK now supports version 19.1.02 of the DocuSign eSignature API.
- SDK Release Version updated.
### Added
- Added support for the new http.nonProxyHosts Proxy option, which you can use to indicate hosts that should be accessed without going through a proxy.  (DCM-2850)
- Added new Cache-Control and Pragma headers to OAuth server request calls. (DCM-2242)
- Added a new *tabGroupLabels* field to all Tabs models
- Added a new *Witnesses* field to all Recipients models
- Implemented models for Smart Sections feature
- Implemented initial support of HMAC for DocuSign Connect
### Fixed
- A bug with that could cause the *moveEnvelopes* method call to return a response without a *Content-Type* header. (DCM-1403)
- A bug that could prevent a user from replacing their JWT auth token. (DCM-3209)
- Removed Gradle references to an insecure/outdated Jackson package. (DCM-3267)

## [v2.9.0] - eSignature API v18.4.02 - 2019-02-27
### Added
- Support for the **latest DocuSign API** (18.4.02.00).
- Support for HTTP(S) proxy through System Properties. The supported proxy parameters are:
  - For HTTPS (recommended): https.proxyHost, https.proxyPort, https.proxyUser and https.proxyPassword
  - For HTTP: http.proxyHost, http.proxyPort, http.proxyUser and http.proxyPassword
### Fixed
- Fixed a problem with the AccountsApi.UpdateBrandLogoByType method that prevented it from uploading brand logos.
- Fixed AuthName comparison. (DCM-3160)

## [v2.9.0-RC1] - eSignature API v18.4.02 - 2019-02-15
### Added
- Support for the **latest DocuSign API** (18.4.02.00).
- Fixed a problem with the AccountsApi.UpdateBrandLogoByType method that prevented it from uploading brand logos.
- Support for HTTP(S) proxy through System Properties. The supported proxy parameters are:
  - For HTTPS (recommended): https.proxyHost, https.proxyPort, https.proxyUser and https.proxyPassword
  - For HTTP: http.proxyHost, http.proxyPort, http.proxyUser and http.proxyPassword

## [v2.8.1] - Jackson library patch - 2019-01-04
### Security
- [CVE-2018-19360](https://nvd.nist.gov/vuln/detail/CVE-2018-19360).
- [CVE-2018-19362](https://nvd.nist.gov/vuln/detail/CVE-2018-19362).
- [CVE-2018-19361](https://nvd.nist.gov/vuln/detail/CVE-2018-19361).
- [CVE-2018-14719](https://nvd.nist.gov/vuln/detail/CVE-2018-14719).
- [CVE-2018-14720](https://nvd.nist.gov/vuln/detail/CVE-2018-14720).
- [CVE-2018-14721](https://nvd.nist.gov/vuln/detail/CVE-2018-14721).
- [CVE-2018-14718](https://nvd.nist.gov/vuln/detail/CVE-2018-14718).

## [v2.8.0] - eSignature API v18.3.02 - 2018-11-29
### Fixed
- Fixed a problem with the BulkEnvelopesApi.UpdateRecipients method that could cause it to return a "Value cannot be null.\r\nParameter name: stream" error rather than add bulk recipients to an envelope. (DCM-2137)
- Fixed a problem with the EnvelopesApi.listStatus methods that could cause them to ignore sets of envelope IDs passed in to get statuses for specific envelopes. (DCM-2953)
- Fixed a problem with the EnvelopesApi.updateChunkedUpload method that could cause it to fail and return a 411 error. (DCM-2978)
- Surfaced the authentication error that might be returned by the ApiClient.JWTUserToken method.

### Changed
- The SDK now supports version 18.3.02 of the DocuSign API.
- Fixed a typo in a method name: getPasswordRules_0 has been changed to getAccountPasswordRules.
### Added
- A jackson-dataformat-csv library has been added to the SDK. You can use this library to serialize Lists into CSV format.
- BountyCastle bcprov library explicitly, for a more flexible dependency management.

## [v2.7.0] - eSignature API v18.3.00 - 2018-09-12
### Deprecated
- The ConfigureJwtAuthorizationFlowByKey method is now deprecated. Please use the RequestJWTUserToken method instead, which improves security by accepting the private key as a byte array or stream. (DCM-2763)
### Changed
- The base path for OAuth authentication is now a property of the ApiClient object.
### Added
- Added a new method, RequestJWTUserToken. This method is passed a user's client id, user id, requested scopes, and their private key in byte array format, performs JWT authentication for the specified user, and returns an access token. (DCM-2763)
- Added a new method, RequestJWTApplicationToken. This is a reserved method that is only enabled by partners and resellers, which obtains an access token that makes requests on behalf of an application rather than a user. It is passed a user's client id, requested scopes, and a private key in byte array format, then returns an access token. (DCM-2763)
- SetOauthBasePath, which can be used to set the OAuth base path for your ApiClient.  (DCM-2731)

## [v2.6.2] - eSignature API v18.1.02 - 2018-07-03
### Fixed
- Fixed a problem that could cause the getUserInfo method to generate an exception when returning information about a user who was part of an organization. The method now returns same set of organization data as the [oauth/userinfo](https://developers.docusign.com/esign-rest-api/guides/authentication/user-info-endpoints) API endpoint method.

## [2.6.1] - 2018-06-06
### Security
- Forced support of TLS v1.2. See [this post](https://support.docusign.com/en/articles/End-of-TLS-1-0-and-weak-cipher-support) on the DocuSign Support Center for more information.

## [2.6.0] - 2018-05-16
### Added
- Support for OAuth implicit grant.
- Support for OAuth Get User Info.

## [2.5.1] - 2018-04-21
### Fixed
- PR [`#71`](https://github.com/docusign/docusign-java-client/pull/71): Empty response body in ApiException.
- [CVE-2018-7489](https://www.cvedetails.com/cve/CVE-2018-7489/).

## [2.5.0] - 2018-04-17
### Added
- Electronic Seals API (a.k.a. Advanced Signatures).

## [2.4.2] - 2018-03-22
### Security
- [CVE-2017-7525](https://www.cvedetails.com/cve/CVE-2017-7525/).
- [CVE-2017-15095](https://www.cvedetails.com/cve/CVE-2017-15095/).

### Updated
- jackson library version updated to 2.9.4.

## [2.4.1] - 2018-03-21
### Updated
- README code example description.

### Removed
- README mention of direct binaries download. Users should use Maven or Gradle repos to download binaries. See Issue[`#53`](https://github.com/docusign/docusign-java-client/issues/53).

### Fixed
- PR [`#57`](https://github.com/docusign/docusign-java-client/pull/57): Avoid NPE in OAuth updateAccessToken().
- PR [`#58`](https://github.com/docusign/docusign-java-client/pull/58): Return ClientHandlerException(), for non 200 response codes, in updateAccessToken().
- PR [`#59`](https://github.com/docusign/docusign-java-client/pull/59): Return ApiException(), for non 2xx response codes, in invokeAPI().
- PR [`#60`](https://github.com/docusign/docusign-java-client/pull/60): RFC conform handling for grant_type=refresh_token without code.
- PR [`#61`](https://github.com/docusign/docusign-java-client/pull/61): Check and set refresh_token in body of OAuth request.

## [2.4.0] - 2017-11-06
### Added
- Support for Seals.
- eNotary API.
- Trusted Service Providers (TSP) API.

### Fixed
- 411 error when request body is empty.

## [2.3.0] - 2017-07-27
### Added
- Support for DocuSign JWT OAuth for service integration (2-legged authentication).

## [2.2.1] - 2017-07-13
### Fixed
- Unit tests under Java8 complain about AccessTokenListener being a nested class.

## [2.2.0] - 2017-06-17
### Added
- Support for DocuSign 3-legged OAuth.

## [2.1.0] - 2017-03-09
### Added
- TravisCI automatic tests.
- TravisCI and Maven badges.
- Updated the[`Javadoc`](http://docusign.github.io/docusign-java-client/target/site/apidocs/).
- New test case to validate the `resend_envelope` feature for `EnvelopesApi.updateRecipients` call.

### Changed
- The SDK now supports the**Full and latest DocuSign API support**(17.1.00.00).
- Updated the package with the latest full API release. No omitted endpoints anymore.
- Updated the code snippet in the README file to use the API base url gotten from the login call, instead of using the default one. Required for integrations when they go live.
- Updated the README file with additional Authentication information.

### Fixed
- Issue [`#27`](https://github.com/docusign/docusign-java-client/issues/27): SimpleDateFormat Exception in Java 1.6.
- Issue [`#89`](https://github.com/docusign/docusign-csharp-client/issues/89): resend_envelope functionality for envelopes recipients.

## [2.0.2] - 2016-07-18
### Changed
- Support of newer version of the DocuSign eSignature API.
- Updated the list of omitted endpoints.

### Fixed
- Issue with datetime on such systems such as Android plateform.

## [2.0.1] - 2016-04-27
### Changed
- Updated the package to a newer API release.
- jersey library version updated to 1.19.1.
- jackson library version updated to 2.7.0.

## [2.0.0] - 2016-01-15
### Added
- Initial commit of the new Java SDK for DocuSign API, automatically generated from OpenAPI specification.
- Send-from-template recipe to the README documentation.

### Changed
- Flattened the folder structure of the project page on Github, to look more like standard Java open-source projects.
- Updated NetBeans project file for unit tests.
- Switched to MIT license.
- Updated "core" recipes.
- Updated the list of omitted endpoints.
- Updated the README documentation.

### Fixed
- Several broken links in the README documentation.
