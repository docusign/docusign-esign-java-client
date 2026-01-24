# The Official Docusign eSignature Java Client SDK

[![Build status][travis-image]][travis-url]
[![Maven Central status][maven-image]][maven-url]

The Docusign SDK makes integrating Docusign into your apps and websites a seamless experience.

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
	* [Version Information](#versionInformation)
	* [Requirements](#requirements)
	* [Compatibility](#compatibility)
	* [Maven](#maven)	
- [Dependencies](#dependencies)
- [API Reference](#apiReference)
- [Code Examples](#codeExamples)
- [OAuth Implementations](#oauthImplementations)
- [Changelog](#changeLog)
- [Support](#support)
- [License](#license)
- [Additional Resources](#additionalResources)

<a id="introduction"></a>
## Introduction
Integrate eSignatures into your application in minutes. The secure and award-winning Docusign eSignature API makes requesting signatures, automating forms, and tracking documents directly from your app easy.

<a id="installation"></a>
## Installation
This client SDK is provided as open source, which enables you to customize its functionality to suit your particular use case. To do so, download or clone the repository. If the SDK’s given functionality meets your integration needs, or if you’re working through our [code examples](https://developers.docusign.com/docs/esign-rest-api/how-to/) from the [Docusign Developer Center](https://developers.docusign.com/), you merely need to install it by following the instructions below.

<a id="versionInformation"></a>
### Version Information
- **API version**: v2.1
- **Latest SDK version (Including prerelease)**: 

<a id="requirements"></a>
## Requirements
*   Java 1.9+
*   Free [developer account](https://go.docusign.com/o/sandbox/?postActivateUrl=https://developers.docusign.com/)

<a id="compatibility"></a>
## Compatibility
*   Java 1.9+

<a id="maven"></a>
**Note:** Docusign uses Eclipse with Maven for testing purposes.
### Maven:
1. In Eclipse, create a new project by selecting **File > New > Project**.
2. In the New Project Wizard, expand **Maven,** then select **Maven Project.**
3. Leave **Create a simple project** unchecked.
4. Select **Next,** then provide a unique **groupId** and **artifactId.**
5. In the directory where you've saved your project, open the pom.xml file.
6. In the pom.xml file, locate the `dependencies` node.
7. Add:  
    ```
    <dependency>
      <groupId>com.docusign</groupId>
      <artifactId>docusign-esign-java</artifactId>
      <version>6.5.0</version>
    </dependency>
    ```
8. If your project is still open, restart Eclipse.

<a id="dependencies"></a>
## SDK Dependencies
This client has the following external dependencies:
*   io.swagger.core.v3:swagger-annotations:2.2.8
*   org.glassfish.jersey.core:jersey-client:3.1.6
*   org.glassfish.jersey.media:jersey-media-multipart:3.1.6
*   org.glassfish.jersey.media:jersey-media-json-jackson:3.1.6
*   org.glassfish.jersey.inject:jersey-hk2:3.1.6
*   com.fasterxml.jackson.jakarta.rs:jackson-jakarta-rs-base:2.14.2
*   com.auth0:java-jwt:3.4.1
*   org.bouncycastle:bcprov-jdk18on:1.78.1
*   com.fasterxml.jackson.dataformat:jackson-dataformat-csv:2.14.2
*   com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2
*   com.fasterxml.jackson.core:jackson-core:2.17.1


<a id="apiReference"></a>
## API Reference
You can refer to the API reference [here](https://developers.docusign.com/docs/esign-rest-api/reference/).

<a id="codeExamples"></a>
## Code examples
Explore our GitHub repository for the [Launcher](https://github.com/docusign/code-examples-java/), a self-executing package housing code examples for the eSignature Java SDK. This package showcases several common use cases and their respective source files. Additionally, you can download a version preconfigured for your Docusign developer account from [Quickstart](https://developers.docusign.com/docs/esign-rest-api/quickstart/). These examples support both the [Authorization Code Grant](https://developers.docusign.com/platform/auth/authcode/) and [JSON Web Token (JWT)](https://developers.docusign.com/platform/auth/jwt/) authentication workflows.

<a id="oauthImplementations"></a>
## OAuth implementations
For details regarding which type of OAuth grant will work best for your Docusign integration, see [Choose OAuth Type](https://developers.docusign.com/platform/auth/choose/) in the [Docusign Developer Center](https://developers.docusign.com/).

For security purposes, Docusign recommends using the [Authorization Code Grant](https://developers.docusign.com/platform/auth/authcode/) flow.

<a id="changeLog"></a>
## Changelog
You can refer to the complete changelog [here](https://github.com/docusign/docusign-esign-java-client/blob/master/CHANGELOG.md).

<a id="support"></a>
## Support
Log issues against this client SDK through GitHub. You can also reach out to us through [Docusign Community](https://community.docusign.com/developer-59) and [Stack Overflow](https://stackoverflow.com/questions/tagged/docusignapi).

<a id="license"></a>
## License
The Docusign eSignature Java Client SDK is licensed under the [MIT License](https://github.com/docusign/docusign-esign-java-client/blob/master/LICENSE).

<a id="additionalResources"></a>
### Additional resources
*   [Docusign Developer Center](https://developers.docusign.com/)
*   [Docusign API on Twitter](https://twitter.com/docusignapi)
*   [Docusign For Developers on LinkedIn](https://www.linkedin.com/showcase/docusign-for-developers/)
*   [Docusign For Developers on YouTube](https://www.youtube.com/channel/UCJSJ2kMs_qeQotmw4-lX2NQ)

[travis-image]: https://api.travis-ci.com/docusign/docusign-esign-java-client.svg?branch=master
[travis-url]: https://app.travis-ci.com/github/docusign/docusign-esign-java-client
[maven-image]: https://img.shields.io/maven-central/v/com.docusign/.svg?style=flat
[maven-url]: https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.docusign%22
