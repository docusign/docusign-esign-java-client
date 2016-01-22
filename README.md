# DocuSign Java Client

You can sign up for a free [developer account](https://secure.docusign.com/signup/developer) and generate your Integrator Key (aka API Key) through your account preferences.

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

// Enter your DocuSign credentials
String UserName = "[EMAIL]";
String Password = "[PASSWORD]";    
String IntegratorKey = "[INTEGRATOR_KEY]";

// for production environment update to "www.docusign.net/restapi"
String BaseUrl = "https://demo.docusign.net/restapi";

// initialize the api client for the desired environment
ApiClient apiClient = new ApiClient();
apiClient.setBasePath(BaseUrl);

// create JSON formatted auth header
String creds = "{\"Username\":\"" +  UserName + "\",\"Password\":\"" +  Password + "\",\"IntegratorKey\":\"" +  IntegratorKey + "\"}";
apiClient.addDefaultHeader("X-DocuSign-Authentication", creds);

// assign api client to the Configuration object
Configuration.setDefaultApiClient(apiClient);

try
{
	// login call available off the AuthenticationApi
	AuthenticationApi authApi = new AuthenticationApi();

	// login has some optional parameters we can set
	AuthenticationApi.LoginOptions loginOps = authApi.new LoginOptions();
	loginOps.setApiPassword("true");
	loginOps.setIncludeAccountIdGuid("true");
	LoginInformation loginInfo = authApi.login(loginOps);

	// note that a given user may be a member of multiple accounts
	List<LoginAccount> loginAccounts = loginInfo.getLoginAccounts();

	System.out.println("LoginInformation: " + loginAccounts);
}
catch (com.docusign.esign.client.ApiException ex)
{
	System.out.println("Exception: " + ex);
}
```

To send a signature request from a template:

```java
EnvelopeDefinition envDef = new EnvelopeDefinition();
envDef.setEmailSubject("Sent from Java: Please sign this document");

// assign template information including ID and role(s)
envDef.setTemplateId([TEMPLATE_ID]);

// create a template role with a valid templateId and roleName and assign signer info
TemplateRole tRole = new TemplateRole();
tRole.setRoleName([ROLE_NAME]);
tRole.setName([SIGNER_NAME]);
tRole.setEmail([SIGNER_EMAIL]);

// create a list of template roles and add our newly created role
List<TemplateRole> templateRolesList = new ArrayList<TemplateRole>();
templateRolesList.add(tRole);

// assign template role(s) to the envelope 
envDef.setTemplateRoles(templateRolesList);

// send the envelope by setting |status| to "sent". To save as a draft set to "created"
envDef.setStatus("sent");

try
{
	// use the |accountId| we retrieved through the Login API to create the Envelope
	String accountId = loginAccounts.get(0).getAccountId();
	
	// instantiate a new EnvelopesApi object
	EnvelopesApi envelopesApi = new EnvelopesApi();
	
	// call the createEnvelope() API
	EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);
	
	System.out.println("EnvelopeSummary: " + envelopeSummary);
}
catch (com.docusign.esign.client.ApiException ex)
{
	System.out.println("Exception: " + ex);
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
