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

import java.util.List;

public class DocuSignExample {
	public static void main(String[] args) {
		String username = "[EMAIL]";
		String password = "[PASSWORD]";
		String integratorKey = "[INTEGRATOR_KEY]";
		
		// initialize client for desired environment and add X-DocuSign-Authentication header
		ApiClient apiClient = new ApiClient("https://demo.docusign.net/restapi");
		
		// configure 'X-DocuSign-Authentication' authentication header
    String authHeader = "{\"Username\":\"" +  username + "\",\"Password\":\"" +  password + "\",\"IntegratorKey\":\"" +  integratorKey + "\"}";
    // If you have an OAuth access token stored in a variable named 'access_token', let's say, then instead, you can set authHeader as following (notice the extra space after 'Bearer'):
    // String authHeader = "{\"Bearer \":\"" +  access_token + "\"}";
    apiClient.addDefaultHeader("X-DocuSign-Authentication", authHeader);
    Configuration.setDefaultApiClient(apiClient);
    try
    {
      /////////////////////////////////////////////////////////////////////////////////////////////////////////
      // STEP 1: AUTHENTICATE TO RETRIEVE ACCOUNTID & BASEURL         
      /////////////////////////////////////////////////////////////////////////////////////////////////////////

      AuthenticationApi authApi = new AuthenticationApi();
      LoginInformation loginInfo = authApi.login();
      
      // parse first account ID (user might belong to multiple accounts) and baseUrl
      String accountId = loginInfo.getLoginAccounts().get(0).getAccountId(); 
      String baseUrl = loginInfo.getLoginAccounts().get(0).getBaseUrl();
      String[] accountDomain = baseUrl.split("/v2");
      
      // below code required for production, no effect in demo (same domain) 
      apiClient.setBasePath(accountDomain[0]);
      Configuration.setDefaultApiClient(apiClient);
      
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
      java.util.List<TemplateRole> templateRolesList = new java.util.ArrayList<TemplateRole>();
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

# Authentication

## Service Integrations that use Legacy Header Authentication

([Legacy Header Authentication](https://docs.docusign.com/esign/guide/authentication/legacy_auth.html) uses the X-DocuSign-Authentication header.)

1. Use the [Authentication: login method](https://docs.docusign.com/esign/restapi/Authentication/Authentication/login/) to retrieve the account number **and the baseUrl** for the account.
The url for the login method is www.docusign.net for production and demo.docusign.net for the developer sandbox.
The `baseUrl` field is part of the `loginAccount` object. See the [docs and the loginAccount object](https://docs.docusign.com/esign/restapi/Authentication/Authentication/login/#/definitions/loginAccount)
2. The baseUrl for the selected account, in production, will start with na1, na2, na3, eu1, or something else. Use the baseUrl that is returned to create the *basePath* (see the next step.) Use the basePath for all of your subsequent API calls.
3. As returned by login method, the baseUrl includes the API version and account id. Split the string to obtain the *basePath*, just the server name and api name. Eg, you will receive `https://na1.docusign.net/restapi/v2/accounts/123123123`. You want just `https://na1.docusign.net/restapi` 
4. Instantiate the SDK using the basePath. Eg `ApiClient apiClient = new ApiClient(basePath);`
5. Set the authentication header as shown in the examples by using `Configuration.Default.AddDefaultHeader`

## User Applications that use OAuth Authentication
1. After obtaining a Bearer token, call the [OAuth: Userinfo method](https://docs.docusign.com/esign/guide/authentication/userinfo.html). Obtain the selected account's `base_uri` (server name) field.
The url for the Userinfo method is account-d.docusign.com for the demo/developer environment, and account.docusign.com for the production environment.
1. Combine the base_uri with "/restapi" to create the basePath. The base_uri will start with na1, na2, na3, eu1, or something else. Use the basePath for your subsequent API calls.
4. Instantiate the SDK using the basePath. Eg `ApiClient apiClient = new ApiClient(basePath);`
5. Create the `authentication_value` by combining the `token_type` and `access_token` fields you receive from either an [Authorization Code Grant](https://docs.docusign.com/esign/guide/authentication/oa2_auth_code.html) or [Implicit Grant](https://docs.docusign.com/esign/guide/authentication/oa2_implicit.html) OAuth flow. 
5. Set the authentication header by using `Configuration.Default.AddDefaultHeader('Authorization', authentication_value)`


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
