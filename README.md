# The Official DocuSign eSignature Java Client SDK

[![Build status][travis-image]][travis-url]
[![Maven Central status][maven-image]][maven-url]

## Requirements
*   Java 1.9+
*   Free [developer account](https://go.docusign.com/sandbox/productshot/?elqCampaignId=16531)

## Compatibility
*   Java 1.9+

## Installation
This SDK is provided as open source, which enables you to customize its functionality to suit your particular use case. To do so, download or clone the repository. If the SDK’s given functionality meets your integration needs, or if you’re working through our [code examples](https://developers.docusign.com/docs/esign-rest-api/how-to/) from the [DocuSign Developer Center](https://developers.docusign.com/), you merely need to install it by following the instructions below.

**Note:** DocuSign uses Eclipse with Maven for testing purposes.

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
      <version>3.15.0</version>
    </dependency>
    ```
8. If your project is still open, restart Eclipse.

## Dependencies
This client has the following external dependencies:
*   io.swagger:swagger-annotations:jar:1.5.17
*   org.glassfish.jersey.core:jersey-client:jar:2.29.1
*   org.glassfish.jersey.media:jersey-media-multipart:jar:2.29.1
*   org.glassfish.jersey.media:jersey-media-json-jackson:2.29.1
*   com.fasterxml.jackson.core:jackson-core:jar:2.12.1
*   com.fasterxml.jackson.core:jackson-annotations:jar:2.12.1
*   com.fasterxml.jackson.core:jackson-databind:2.12.1
*   com.brsanthu:migbase64:2.2
*   junit:junit:jar:4.13.1
*   com.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.2
*   com.auth0:java-jwt:3.4.1
*   org.bouncycastle:bcprov-jdk15on:1.60

## Code examples
You can find on our GitHub a self-executing package of code examples for the eSignature Java SDK, called a [Launcher](https://github.com/docusign/code-examples-java/blob/master/README.md), that demonstrates common use cases. You can also download a version preconfigured for your DocuSign developer account from [Quickstart](https://developers.docusign.com/docs/esign-rest-api/quickstart/). These examples can use either the [Authorization Code Grant](https://developers.docusign.com/esign-rest-api/guides/authentication/oauth2-code-grant) or [JSON Web Token (JWT)](https://developers.docusign.com/esign-rest-api/guides/authentication/oauth2-jsonwebtoken) authentication workflows.

## OAuth implementations
For details regarding which type of OAuth grant will work best for your DocuSign integration, see [Choose OAuth Type](https://developers.docusign.com/platform/auth/choose/) in the [DocuSign Developer Center](https://developers.docusign.com/).

For security purposes, DocuSign recommends using the [Authorization Code Grant](https://developers.docusign.com/esign-rest-api/guides/authentication/oauth2-code-grant) flow.

## Support
Log issues against this client through GitHub. We also have an [active developer community on Stack Overflow](https://stackoverflow.com/questions/tagged/docusignapi).

## License
The DocuSign eSignature Java Client SDK is licensed under the [MIT License](https://github.com/docusign/docusign-java-client/blob/master/LICENSE).

### Additional resources
*   [DocuSign Developer Center](https://developers.docusign.com/)
*   [DocuSign API on Twitter](https://twitter.com/docusignapi)
*   [DocuSign For Developers on LinkedIn](https://www.linkedin.com/showcase/docusign-for-developers/)
*   [DocuSign For Developers on YouTube](https://www.youtube.com/channel/UCJSJ2kMs_qeQotmw4-lX2NQ)

[travis-image]: https://img.shields.io/travis/docusign/docusign-java-client.svg?style=flat
[travis-url]: https://travis-ci.org/docusign/docusign-java-client
[maven-image]: https://img.shields.io/maven-central/v/com.docusign/docusign-esign-java.svg?style=flat
[maven-url]: https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.docusign%22
