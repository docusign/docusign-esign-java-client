# DocuSign Java Client

You can sign up for a free [developer sandbox](https://www.docusign.com/developer-center).

Requirements
============

Java 1.6 or later.  

Installation
============

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
   <groupId>com.docusign</groupId>
   <artifactId>docusign-esign-java</artifactId>
   <version>2.0.2</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.docusign:docusign-esign-java:2.0.2"
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

- [Nexus Repository Manager](https://oss.sonatype.org/#nexus-search;quick~docusign-esign-java) (oss.sonatype.org). You can search for com.docusign or docusign-esign-java. The current version is 2.0.2.
- [JFrog Bintray](https://bintray.com/search?query=docusign-esign-java) (bintray.com). You can search for com.docusign or docusign-esign-java. The current version is 2.0.2.

### Others

Or you can manually download and add the following JARs to your project:

* The [docusign-esign-java-2.0.2](/target/docusign-esign-java-2.0.2.jar) JAR.
* The [Dependency JARs](/target/lib) in /lib folder.


Usage
=====

To send a signature request from a Template:

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
		
		// configure 'X-DocuSign-Authentication' authentication header
        String authHeader = "{\"Username\":\"" +  username + "\",\"Password\":\"" +  password + "\",\"IntegratorKey\":\"" +  integratorKey + "\"}";
        apiClient.addDefaultHeader("X-DocuSign-Authentication", authHeader);
        Configuration.setDefaultApiClient(apiClient);
        try
        {
            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////
            // STEP 1: LOGIN API        
            /////////////////////////////////////////////////////////////////////////////////////////////////////////
            AuthenticationApi authApi = new AuthenticationApi();
            LoginInformation loginInfo = authApi.login();
            
            // parse first account ID (user might belong to multiple accounts)
            String accountId = loginInfo.getLoginAccounts().get(0).getAccountId(); 
            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////
            // *** STEP 2: CREATE ENVELOPE FROM TEMPLATE       
            /////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            // create a new envelope to manage the signature request
            EnvelopeDefinition envDef = new EnvelopeDefinition();
            envDef.setEmailSubject("DocuSign Java SDK - Sample Signature Request");
            
            // assign template information including ID and role(s)
            envDef.setTemplateId("[TEMPLATE_ID]");
            
            // create a template role with a valid templateId and roleName and assign signer info
            TemplateRole tRole = new TemplateRole();
            tRole.setRoleName("[ROLE_NAME]");
            tRole.setName("[SIGNER_NAME]");
            tRole.setEmail("[SIGNER_EMAIL]");
          
            // create a list of template roles and add our newly created role
            List<TemplateRole> templateRolesList = new ArrayList<TemplateRole>();
            templateRolesList.add(tRole);
          
            // assign template role(s) to the envelope 
            envDef.setTemplateRoles(templateRolesList);
            
            // send the envelope by setting |status| to "sent". To save as a draft set to "created"
            envDef.setStatus("sent");
          
            // instantiate a new EnvelopesApi object
            EnvelopesApi envelopesApi = new EnvelopesApi();
          
            // call the createEnvelope() API
            EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);
        }
        catch (com.docusign.esign.client.ApiException ex)
        {
            System.out.println("Exception: " + ex);
        }
	}
} 
```

See [SdkUnitTests.java](https://github.com/docusign/docusign-java-client/blob/master/src/test/java/SdkUnitTests.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests:

    mvn test

Support
=======

Feel free to log issues against this client through GitHub.  We also have an active developer community on Stack Overflow, search the [DocuSignAPI](http://stackoverflow.com/questions/tagged/docusignapi) tag.

License
=======

The DocuSign Java Client is licensed under the following [License](LICENSE).

Notes
=======

This version of the client library does not implement all of the DocuSign REST API methods. The current client omits methods in the Accounts, Billing, Cloud Storage, Connect, Groups (Branding), and Templates (Bulk Recipients) categories. The client's methods support the core set of use cases that most integrations will encounter. For a complete list of omitted endpoints, see [Omitted Endpoints](./omitted_endpoints.md).