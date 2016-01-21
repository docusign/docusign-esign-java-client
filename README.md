# DocuSign Java Client

The official DocuSign eSignature JAVA client is based on version 2 of the DocuSign REST API and provides libraries for JAVA application integration. It is recommended that you use this version of the library for new development.  

## Obtaining the Client Libraries

The library is available in the DocuSign GitHub repository. You can download it from https://github.com/docusign/docusign-java-client. You can download it as a zip file or clone the repository.

The master branch contains the newest release.

### Repository Organization

* `\sdk`:  Source code for the client 
* `\test`:  Unit tests and sample code
   * `\test\Recipes\`: Source code for the DocuSign recpies. CoreRecipes.java contains the sample code for our core recipes.
   * `\test\dkTests\SdkTests\test\SdkUnitTests.java`: Unit tests for the library.

## Installing the Client Libraries

You have a number of options when getting and installing the client libraries.
You can download the libraries from: 

- GitHub. You can download the library as a zip file or use `git clone` to clone the repository.
- [Nexus Repository Manager](https://oss.sonatype.org/#nexus-search;quick~docusign-esign-java) (oss.sonatype.org). You can search for com.docusign or docusign-esign-java. The current version is 2.0.0.
- [JFrog Bintray](https://bintray.com/search?query=docusign-esign-java) (bintray.com). You can search for com.docusign or docusign-esign-java. The current version is 2.0.0.

If you downloaded the  Open the zip file you downloaded and extract the contents:

•	Add the  com.docusign.esign-<version number> jar file to your project through your project’s build settings.
•	Copy the source folders directly into your Java project's /src directories and add import statements accordingly.
- If you are using Apache Maven, add the following dependency declaration to your pom.xml file:
   ```
   <dependency>
   <groupId>com.docusign</groupId>
   <artifactId>docusign-esign-java</artifactId>
   <version>2.0.0</version>
   </dependency>
   ```

- If you are using Gradle, add the following to your build.gradle module :

   `compile 'com.docusign:docusign-esign-java:2.0`
   
### Android Developers 

If you encounter build errors due to duplicate definitions, include the following in your build.gradle module:

```
android {
   packagingOptions {
      pickFirst 'META-INF/services/javax.ws.rs.ext.MessageBodyReader’
      pickFirst 'META-INF/services/javax.ws.rs.ext.MessageBodyWriter’
      pickFirst 'META-INF/services/com.sun.jersey.spi.inject.InjectableProvider’
      pickFirst 'META-INF/jersey-module-version' pickFirst 'META-INF/NOTICE’
      pickFirst 'META-INF/LICENSE’
      pickFirst 'META-INF/services/com.fasterxml.jackson.databind.Module’
      pickFirst 'META-INF/services/com.fasterxml.jackson.core.ObjectCodec’
      pickFirst 'META-INF/services/com.fasterxml.jackson.core.JsonFactory’
   }
}
```

## About the Client Library

The client library implements a subset of the REST API methods. The library is auto-generated using Swagger-codegen and some customized Swagger templates.  As such, the client is a proxy and set of models that are used to call the DocuSign REST API. Using the client library provides JAVA developers with a more familiar interface than using REST directly, and eliminates the need to create custom JAVA models of the REST request and response types. 

## Differences between the Client Libraries and the REST API

This version of the client library does not implement all of the DocuSign REST API methods. The current client omits methods in the Accounts, Billing, Cloud Storage, Connect, Groups (Branding), and Templates (Bulk Recipients) categories. The client's methods support the core set of use cases that developers new to DocuSign integration will encounter. 

For a complete list of omitted endpoints, see the [Omitted Endpoints](./omitted_endpoints.md) topic.

## Next steps 

To use the client library, create a free [developer account](https://secure.docusign.com/signup/developer) and obtain an integrator key. 

You will use your login email, password, and integrator key to authenticate with the DocuSign platform using the AuthenticationApi.login function. 

This call, and other examples are demonstrated in the [DocuSign integration recipes](https://www.docusign.com/developer-center/recipes). 

## Notes:

While the developer site gives you access to a full range of platform capabilities, the features that you can use in your application will depend on the type of production account you or your customers select.

Many of the API functions have an overloaded version that provides an "options" object. These are generally optional parameters that correspond to the query string parameters in the REST API, and are used to modify the requests being made.

### Checking the status of submitted envelopes

When the status of an envelope or recipient changes, your app can receive notifications using a webhook call from the DocuSign platform to your app or it can poll for envelope status.

Webhook: Use the `eventNotification` element in the request body of the Create Envelope call to register your callback webhook. This feature is supported for all account types and is recommended by DocuSign in preference to polling the platform. 

Polling: The EnvelopesApi.listStatusChanges() method has a required parameter in its options list called `fromDate`. This parameter must be set for the call to succeed. It is recommended that you set this to retrieve documents over the shortest time span possible; we recommend 24 or 48 hours. In addition, DocuSign does not allow apps to poll more often than once every 15 minutes. See the [status polling recipe](https://www.docusign.com/developer-center/recipes/polling-for-envelope-status) for more information.

### Submitting documents

The REST API supports multi-part form data input for submitting requests to create a DocuSign envelope containing documents for signature. This format requires a section containing JSON, followed by one or more sections of the multi-part request that contain the binary bytes of the documents along with header information that provides document IDs and file names. 

In the client library, this has been simplified by allowing the documents to be specified as part of the JSON requests as base64 strings. Please see the [Request a signature via email](https://www.docusign.com/developer-center/recipes/request-a-signature-via-email) recipe for an example. 

### “Hello World” Examples

See the [DocuSign Developer Center Quick Start](https://www.docusign.com/developer-center/quick-start/request-signatures) and the [API Recipes](https://www.docusign.com/developer-center/recipes) for “Hello World” examples. 

Questions? Please ask via StackOverflow, tag “[docusignapi](http://stackoverflow.com/questions/tagged/docusignapi).” DocuSign Professional Services and our partners are also available for assistance.
