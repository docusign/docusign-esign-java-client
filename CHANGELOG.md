# DocuSign Java Client Changelog
See [DocuSign Support Center](https://support.docusign.com/en/releasenotes/) for Product Release Notes.

## [v2.9.0-RC1] - eSignature API v18.4.02 - 2019-02-15
### Added
- Support for the **latest DocuSign API** (18.4.02.00).
- Ability to upload a brand logo through updateBrandLogoByType
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
