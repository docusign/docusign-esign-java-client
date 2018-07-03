# DocuSign Java Client Changelog
See [DocuSign Support Center](https://support.docusign.com/en/releasenotes/) for Product Release Notes.

## [v2.6.2] - eSignature API v18.1.02 - 7/3/2018
### Fixed
* Fixed a problem that could cause the getUserInfo method to generate an exception when returning information about a user who was part of an organization. The method now returns same set of organization data as the [oauth/userinfo](https://developers.docusign.com/esign-rest-api/guides/authentication/user-info-endpoints) API endpoint method.

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

