# DocuSign Java Client

You can sign up for a free [developer sandbox](https://secure.docusign.com/signup/developer).

Requirements
============

Java 1.7 and later.  

Installation
============

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
   <groupId>com.docusign</groupId>
   <artifactId>docusign-esign-java</artifactId>
   <version>2.0.0</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.docusign:docusign-esign-java:2.0"
```

#### Note for Android Developers 

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

### Package Managers

This client is available through the following Java package managers:

- [Nexus Repository Manager](https://oss.sonatype.org/#nexus-search;quick~docusign-esign-java) (oss.sonatype.org). You can search for com.docusign or docusign-esign-java. The current version is 2.0.0.
- [JFrog Bintray](https://bintray.com/search?query=docusign-esign-java) (bintray.com). You can search for com.docusign or docusign-esign-java. The current version is 2.0.0.

### Others

You'll need to manually install the following JARs:

* The DocuSign JAR from https://github.com/docusign/docusign-java-client/tree/master/sdk/target
* Dependency JARs from the /lib folder https://github.com/docusign/docusign-java-client/tree/master/sdk/target/lib


Usage
=====

To initialize the client and make the Login API Call:

```java
import com.docusign.esign.api.*;
import com.docusign.esign.client.*;
import com.docusign.esign.model.*;

public class DocuSignExample {
	public static void main(String[] args) {
		String username = "[EMAIL]";
		String password = "[PASSWORD]";
		String integratorKey = "[INTEGRATOR_KEY]";
		
		// initialize client for desired environment and add X-DocuSign-Authentication header
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("https://demo.docusign.net/restapi");
		
		// configure custom authentication header
        String authHeader = "{\"Username\":\"" +  username + "\",\"Password\":\"" +  password + "\",\"IntegratorKey\":\"" +  integratorKey + "\"}";
        apiClient.addDefaultHeader("X-DocuSign-Authentication", authHeader);
        Configuration.setDefaultApiClient(apiClient);
        try
        {
            AuthenticationApi authApi = new AuthenticationApi();
            LoginInformation loginInfo = authApi.login();
            String accountId = loginInfo.getLoginAccounts().get(0).getAccountId(); 
        }
        catch (com.docusign.esign.client.ApiException ex)
        {
            System.out.println("Exception: " + ex);
        }
	}
} 
```

See [CoreRecipes.java](https://github.com/docusign/docusign-java-client/blob/master/test/Recipes/CoreRecipes.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests:

    mvn test

Notes
=======

This version of the client library does not implement all of the DocuSign REST API methods. The current client omits methods in the Accounts, Billing, Cloud Storage, Connect, Groups (Branding), and Templates (Bulk Recipients) categories. The client's methods support the core set of use cases that developers new to DocuSign integration will encounter. 

For a complete list of omitted endpoints, see the [Omitted Endpoints](./omitted_endpoints.md) topic.
