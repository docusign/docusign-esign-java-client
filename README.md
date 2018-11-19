# The Official DocuSign Java Client

[![Build status][travis-image]][travis-url]
[![Maven Central status][maven-image]][maven-url]

You can sign up for a free [developer sandbox](https://developers.docusign.com/).

Requirements
============

Java 1.7 or later.  

Installation
============

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
   <groupId>com.docusign</groupId>
   <artifactId>docusign-esign-java</artifactId>
   <version>2.8.0-RC1</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.docusign:docusign-esign-java:2.8.0-RC1"
```

#### Dependencies

This client has the following external dependencies:

* io.swagger:swagger-annotations:jar:1.5.8
* com.sun.jersey:jersey-client:jar:1.19.1
* com.sun.jersey.contribs:jersey-multipart:jar:1.19.1
* com.fasterxml.jackson.core:jackson-core:jar:2.9.5
* com.fasterxml.jackson.core:jackson-annotations:jar:2.9.5
* com.fasterxml.jackson.core:jackson-databind:jar:2.9.5
* com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:jar:2.9.5
* com.fasterxml.jackson.datatype:jackson-datatype-joda:jar:2.1.5
* joda-time:joda-time:jar:2.9.3
* com.brsanthu:migbase64:jar:2.2
* org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.2
* junit:junit:jar:4.12

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

- [Nexus Repository Manager](https://oss.sonatype.org/#nexus-search;quick~docusign-esign-java) (oss.sonatype.org). You can search for com.docusign or docusign-esign-java. The current version is 2.8.0-RC1.
- [JFrog Bintray](https://bintray.com/dsdevcenter/maven/docusign-esign-java) (bintray.com). You can search for com.docusign or docusign-esign-java. The current version is 2.8.0-RC1.


Usage
=====

To send a signature request from a Template using OAuth Authorization Code Grant:

```java
import com.docusign.esign.api.*;
import com.docusign.esign.client.*;
import com.docusign.esign.model.*;
import com.docusign.esign.client.auth.OAuth;
import com.docusign.esign.client.auth.OAuth.UserInfo;
import java.awt.Desktop;

import java.io.IOException;

public class DocuSignExample {
  public static void main(String[] args) {
    String RedirectURI = "[REDIRECT_URI]";
    String ClientSecret = "[CLIENT_SECRET]";
    String IntegratorKey = "[INTEGRATOR_KEY]";
    String BaseUrl = "https://demo.docusign.net/restapi";
    
    ApiClient apiClient = new ApiClient(BaseUrl);
    try
    {
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        // STEP 1: AUTHENTICATE TO RETRIEVE ACCOUNTID & BASEURL         
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
                      
        String randomState = "[random_string]";
        java.util.List<String> scopes = new java.util.ArrayList<String>();
        scopes.add(OAuth.Scope_SIGNATURE);
        // get DocuSign OAuth authorization url
        URI oauthLoginUrl = apiClient.getAuthorizationUri(IntegratorKey, scopes, RedirectURI, OAuth.CODE, randomState);
        // open DocuSign OAuth login in the browser
		Desktop.getDesktop().browse(oauthLoginUrl);
        // IMPORTANT: after the login, DocuSign will send back a fresh
        // authorization code as a query param of the redirect URI.
        // You should set up a route that handles the redirect call to get
        // that code and pass it to token endpoint as shown in the next
        // lines:
        /*String code = "[once_you_get_the_oauth_code_put_it_here]";
        OAuth.OAuthToken oAuthToken = apiClient.generateAccessToken(IntegratorKey, ClientSecret, code);

        System.out.println("OAuthToken: " + oAuthToken);

        // now that the API client has an OAuth token, let's use it in all
        // DocuSign APIs
        UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());

        System.out.println("UserInfo: " + userInfo);
        // parse first account's baseUrl
        // below code required for production, no effect in demo (same
        // domain)
        apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
        Configuration.setDefaultApiClient(apiClient);
		String accountId = userInfo.getAccounts().get(0).getAccountId();*/
          
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
          EnvelopesApi envelopesApi = new EnvelopesApi(apiClient);
        
          // call the createEnvelope() API
          EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);
        }
        catch (ApiException ex)
        {
          System.out.println("Exception: " + ex);
        }
        catch (Exception e)
        {
          System.out.println("Exception: " + e.getLocalizedMessage());
        }
  }
} 
```

To send a signature request from a Template using JWT Auth (for service integrations):

```java
import com.docusign.esign.api.*;
import com.docusign.esign.client.*;
import com.docusign.esign.model.*;
import com.docusign.esign.client.auth.OAuth;
import com.docusign.esign.client.auth.OAuth.UserInfo;

import java.io.IOException;

public class DocuSignExample {
  public static void main(String[] args) {
    String OAuthBaseUrl = "account-d.docusign.com";
    String BaseUrl = "https://demo.docusign.net/restapi";
    String RedirectURI = "[OAUTH_REDIRECT_URI]";
    String IntegratorKey = "[INTEGRATOR_KEY]";
    String UserId = "[USER_ID_TO_SEND_ON_BEHALF]";
    String publicKeyFilename = "[PATH_TO_RSA265_PUBLIC_KEY]";
    String privateKeyFilename = "[PATH_TO_RSA265_PRIVATE_KEY]";
    
    ApiClient apiClient = new ApiClient(BaseUrl);
    
    try {
      /////////////////////////////////////////////////////////////////////////////////////////////////////////
      // STEP 1: AUTHENTICATE TO RETRIEVE ACCOUNTID & BASEURL         
      /////////////////////////////////////////////////////////////////////////////////////////////////////////

      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the following call
      // get DocuSign OAuth authorization url:
      //String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      //Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE
      
      apiClient.configureJWTAuthorizationFlow(publicKeyFilename, privateKeyFilename, OAuthBaseUrl, IntegratorKey, UserId, 3600); // request for a fresh JWT token valid for 1 hour
      
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIs
      UserInfo userInfo = apiClient.getUserInfo(apiClient.getAccessToken());

      System.out.println("UserInfo: " + userInfo);
      // parse first account's baseUrl
      // below code required for production, no effect in demo (same
      // domain)
      apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
      Configuration.setDefaultApiClient(apiClient);
	  String accountId = userInfo.getAccounts().get(0).getAccountId();
      
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
    } catch (ApiException ex) {
      System.out.println("Exception: " + ex);
    } catch (Exception e) {
      System.out.println("Exception: " + e.getLocalizedMessage());
    }
  }
} 
```

See [SdkUnitTests.java](https://github.com/docusign/docusign-java-client/blob/master/src/test/java/SdkUnitTests.java) for more examples.

# Authentication

## User Applications that use OAuth Authentication
1. After obtaining a Bearer token, call the [OAuth: Userinfo method](https://docs.docusign.com/esign/guide/authentication/userinfo.html). Obtain the selected account's `base_uri` (server name) field.
The url for the Userinfo method is account-d.docusign.com for the demo/developer environment, and account.docusign.com for the production environment.
1. Combine the base_uri with "/restapi" to create the basePath. The base_uri will start with na1, na2, na3, eu1, or something else. Use the basePath for your subsequent API calls.
4. Instantiate the SDK using the basePath. Eg `ApiClient apiClient = new ApiClient(basePath);`
5. Create the `authentication_value` by combining the `token_type` and `access_token` fields you receive from either an [Authorization Code Grant](https://docs.docusign.com/esign/guide/authentication/oa2_auth_code.html) or [Implicit Grant](https://docs.docusign.com/esign/guide/authentication/oa2_implicit.html) OAuth flow. 
5. Set the authentication header by using `Configuration.Default.AddDefaultHeader('Authorization', authentication_value)`

## Service Integrations that use the Deprecated Header Authentication

([Deprecated Header Authentication](https://docs.docusign.com/esign/guide/authentication/legacy_auth.html) uses the X-DocuSign-Authentication header. Please switch to OAuth ASAP.)

1. Use the [Authentication: login method](https://docs.docusign.com/esign/restapi/Authentication/Authentication/login/) to retrieve the account number **and the baseUrl** for the account.
The url for the login method is www.docusign.net for production and demo.docusign.net for the developer sandbox.
The `baseUrl` field is part of the `loginAccount` object. See the [docs and the loginAccount object](https://docs.docusign.com/esign/restapi/Authentication/Authentication/login/#/definitions/loginAccount)
2. The baseUrl for the selected account, in production, will start with na1, na2, na3, eu1, or something else. Use the baseUrl that is returned to create the *basePath* (see the next step.) Use the basePath for all of your subsequent API calls.
3. As returned by login method, the baseUrl includes the API version and account id. Split the string to obtain the *basePath*, just the server name and api name. Eg, you will receive `https://na1.docusign.net/restapi/v2/accounts/123123123`. You want just `https://na1.docusign.net/restapi` 
4. Instantiate the SDK using the basePath. Eg `ApiClient apiClient = new ApiClient(basePath);`
5. Set the authentication header as shown in the examples by using `Configuration.Default.AddDefaultHeader`


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


[travis-image]: https://img.shields.io/travis/docusign/docusign-java-client.svg?style=flat
[travis-url]: https://travis-ci.org/docusign/docusign-java-client
[maven-image]: https://img.shields.io/maven-central/v/com.docusign/docusign-esign-java.svg?style=flat
[maven-url]: https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.docusign%22
