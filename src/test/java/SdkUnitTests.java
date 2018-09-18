
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.docusign.esign.api.*;
import com.docusign.esign.client.*;
import com.docusign.esign.model.*;
import com.docusign.esign.client.auth.OAuth;
import com.docusign.esign.client.auth.OAuth.UserInfo;
import java.io.File;
import java.awt.Desktop;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.migcomponents.migbase64.Base64;

import javax.ws.rs.core.UriBuilderException;

/**
 *
 * @author majid.mallis
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SdkUnitTests {

	private static final String UserName = "node_sdk@mailinator.com";
	private static final String UserId = "fcc5726c-cd73-4844-b580-40bbbe6ca126";
	private static final String IntegratorKey = "ae30ea4e-3959-4d1c-b867-fcb57d2dc4df";
	private static final String IntegratorKeyImplicit = "68c1711f-8b19-47b1-888f-b49b4211d831";
	private static final String ClientSecret = "b4dccdbe-232f-46cc-96c5-b2f0f7448f8f";
	private static final String RedirectURI = "https://www.docusign.com/api";

	private static final String BaseUrl = "https://demo.docusign.net/restapi";
	private static final String OAuthBaseUrl = "account-d.docusign.com";
	private static final String privateKeyFullPath = System.getProperty("user.dir") + "/src/test/keys/docusign_private_key.txt";

	private static final String SignTest1File = "/src/test/docs/SignTest1.pdf";
	private static final String TemplateId = "cf2a46c2-8d6e-4258-9d62-752547b1a419";
	private String EnvelopeId = "a80d8c60-e81e-4354-a1ed-2a0a6a8365ff";
	// JUnit 4.12 runs test cases in parallel, so the envelope ID needs to be initiated as well.

	// private JSON json = new JSON();

	public SdkUnitTests() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void JWTLoginTest() {
		System.out.println("\nJWTLoginTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);
			scopes.add(OAuth.Scope_IMPERSONATION);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void AuthorizationCodeLoginTest() {
		System.out.println("\nAuthorizationCodeLoginTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		try {
			// after successful login you should compare the value of URI decoded "state" query param
			// with the one you create here; they should match.
			String randomState = "*^.$DGj*)+}Jk";
			java.util.List<String> scopes = new ArrayList<String>();
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
			/*String code = "<once_you_get_the_oauth_code_put_it_here>";
			OAuth.OAuthToken oAuthToken = apiClient.generateAccessToken(IntegratorKey, ClientSecret, code);
			Assert.assertNotSame(null, oAuthToken);
			Assert.assertNotNull(oAuthToken.getAccessToken());
			Assert.assertTrue(oAuthToken.getExpiresIn() > 0L);

			System.out.println("OAuthToken: " + oAuthToken);

			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);*/
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void ImplicitLoginTest() {
		System.out.println("\nImplicitLoginTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		try {
			// after successful login you should compare the value of URI decoded "state" query param
			// with the one you create here; they should match.
			String randomState = "*^.$DGj*)+}Jk";
			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);
			// get DocuSign OAuth authorization url
			URI oAuthLoginUri = apiClient.getAuthorizationUri(IntegratorKeyImplicit, scopes, RedirectURI, OAuth.TOKEN, randomState);
			// open DocuSign OAuth login in the browser
			Desktop.getDesktop().browse(oAuthLoginUri);
			// IMPORTANT: after the login, DocuSign will send back a new
			// access token in the hash fragment of the redirect URI.
			// You should set up a client-side handler that handles window.location change to get
			// that token and pass it to the ApiClient object as shown in the next
			// lines:
			String token = "<once_you_get_the_oauth_token_put_it_here>";
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			/*apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(token);
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);
			
			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);*/
		} catch (UriBuilderException ex) {
			System.out.println("UriBuilderException: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}


	@Test
	public void RequestASignatureTest() {
		System.out.println("\nRequestASignatureTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			// String currentDir = new java.io.File(".").getCononicalPath();

			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertEquals(null, ioExcp);
		}

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		String base64Doc = Base64.encodeToString(fileBytes, false);
		doc.setDocumentBase64(base64Doc);
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<Document>();
		docs.add(doc);
		envDef.setDocuments(docs);

		// Add a recipient to sign the document
		Signer signer = new Signer();
		signer.setEmail(UserName);
		signer.setName("Pat Developer");
		signer.setRecipientId("1");

		// Create a SignHere tab somewhere on the document for the signer to
		// sign
		SignHere signHere = new SignHere();
		signHere.setDocumentId("1");
		signHere.setPageNumber("1");
		signHere.setRecipientId("1");
		signHere.setXPosition("100");
		signHere.setYPosition("100");
		signHere.setScaleValue("0.5");

		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<Signer>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();

			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());
			Assert.assertEquals("sent", envelopeSummary.getStatus());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void RequestSignatureFromTemplate() {
		System.out.println("\nRequestSignatureFromTemplate:\n" + "===========================================");
		String templateRoleName = "Needs to sign";

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		/// assign template information including ID and role(s)
		envDef.setTemplateId(TemplateId);

		// create a template role with a valid templateId and roleName and
		// assign signer info
		TemplateRole tRole = new TemplateRole();
		tRole.setRoleName(templateRoleName);
		tRole.setName("Pat Developer");
		tRole.setEmail(UserName);

		// create a list of template roles and add our newly created role
		List<TemplateRole> templateRolesList = new ArrayList<TemplateRole>();
		templateRolesList.add(tRole);

		// assign template role(s) to the envelope
		envDef.setTemplateRoles(templateRolesList);

		// send the envelope by setting |status| to "sent". To save as a draft
		// set to "created"
		envDef.setStatus("sent");

		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();

			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());
			Assert.assertEquals("sent", envelopeSummary.getStatus());

			System.out.println("EnvelopeSummary: " + envelopeSummary);
			EnvelopeId = envelopeSummary.getEnvelopeId();

		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void EmbeddedSigningTest() {
		System.out.println("\nEmbeddedSigningTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			// String currentDir = new java.io.File(".").getCononicalPath();

			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertEquals(null, ioExcp);
		}

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope (Embedded Signer)");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		String base64Doc = Base64.encodeToString(fileBytes, false);
		doc.setDocumentBase64(base64Doc);
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<Document>();
		docs.add(doc);
		envDef.setDocuments(docs);

		// Add a recipient to sign the document
		Signer signer = new Signer();
		signer.setEmail(UserName);
		String name = "Pat Developer";
		signer.setName(name);
		signer.setRecipientId("1");

		// this value represents the client's unique identifier for the signer
		String clientUserId = "2939";
		signer.setClientUserId(clientUserId);

		// Create a SignHere tab somewhere on the document for the signer to
		// sign
		SignHere signHere = new SignHere();
		signHere.setDocumentId("1");
		signHere.setPageNumber("1");
		signHere.setRecipientId("1");
		signHere.setXPosition("100");
		signHere.setYPosition("100");
		signHere.setScaleValue("0.5");

		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<Signer>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			String returnUrl = "http://www.docusign.com/developer-center";
			RecipientViewRequest recipientView = new RecipientViewRequest();
			recipientView.setReturnUrl(returnUrl);
			recipientView.setClientUserId(clientUserId);
			recipientView.setAuthenticationMethod("email");
			recipientView.setUserName(name);
			recipientView.setEmail(UserName);

			ViewUrl viewUrl = envelopesApi.createRecipientView(accountId, envelopeSummary.getEnvelopeId(), recipientView);

			Assert.assertNotNull(viewUrl);
			Assert.assertNotNull(viewUrl.getUrl());
			Desktop.getDesktop().browse(URI.create(viewUrl.getUrl()));
			// This Url should work in an Iframe or browser to allow signing
			System.out.println("ViewUrl is " + viewUrl);

		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}

	}

	@Test
	public void CreateTemplateTest() {
		System.out.println("\nCreateTemplateTest:\n" + "===========================================");
		byte[] fileBytes = null;
		File f;
		try {
			// String currentDir = new java.io.File(".").getCononicalPath();

			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);

			f = new File(path.toString());
			Assert.assertTrue(f.length() > 0);
		} catch (IOException ioExcp) {
			Assert.assertEquals(null, ioExcp);
		}

		// create an envelope to be signed

		EnvelopeTemplate templateDef = new EnvelopeTemplate();
		templateDef.setEmailSubject("Please Sign my Java SDK Envelope");
		templateDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		String base64Doc = Base64.encodeToString(fileBytes, false);
		doc.setDocumentBase64(base64Doc);
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<Document>();
		docs.add(doc);
		templateDef.setDocuments(docs);

		// Add a recipient to sign the document
		Signer signer = new Signer();
		signer.setRoleName("Signer1");
		signer.setRecipientId("1");

		// Create a SignHere tab somewhere on the document for the signer to
		// sign
		SignHere signHere = new SignHere();
		signHere.setDocumentId("1");
		signHere.setPageNumber("1");
		signHere.setRecipientId("1");
		signHere.setXPosition("100");
		signHere.setYPosition("100");
		signHere.setScaleValue("0.5");

		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		templateDef.setRecipients(new Recipients());
		templateDef.getRecipients().setSigners(new ArrayList<Signer>());
		templateDef.getRecipients().getSigners().add(signer);

		EnvelopeTemplateDefinition envTemplateDef = new EnvelopeTemplateDefinition();
		envTemplateDef.setName("myTemplate");
		templateDef.setEnvelopeTemplateDefinition(envTemplateDef);

		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			TemplatesApi templatesApi = new TemplatesApi();
			TemplateSummary templateSummary = templatesApi.createTemplate(accountId, templateDef);

			Assert.assertNotNull(templateSummary);
			Assert.assertNotNull(templateSummary.getTemplateId());

			System.out.println("TemplateSummary: " + templateSummary);

		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void DownLoadEnvelopeDocumentsTest() {
		System.out.println("\nDownLoadEnvelopeDocumentsTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			// String currentDir = new java.io.File(".").getCononicalPath();

			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertEquals(null, ioExcp);
		}

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		String base64Doc = Base64.encodeToString(fileBytes, false);
		doc.setDocumentBase64(base64Doc);
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<Document>();
		docs.add(doc);
		envDef.setDocuments(docs);

		// Add a recipient to sign the document
		Signer signer = new Signer();
		signer.setEmail(UserName);
		String name = "Pat Developer";
		signer.setName(name);
		signer.setRecipientId("1");

		// this value represents the client's unique identifier for the signer
		String clientUserId = "2939";
		signer.setClientUserId(clientUserId);

		// Create a SignHere tab somewhere on the document for the signer to
		// sign
		Text text = new Text();
		text.setDocumentId("1");
		text.setPageNumber("1");
		text.setRecipientId("1");
		text.setXPosition("100");
		text.setYPosition("100");

		List<Text> textTabs = new ArrayList<Text>();
		textTabs.add(text);
		Tabs tabs = new Tabs();
		tabs.setTextTabs(textTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<Signer>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		String currentDir = System.getProperty("user.dir");
		try {

			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(BaseUrl);

			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());
			EnvelopeId = envelopeSummary.getEnvelopeId();

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			byte[] pdfBytes = envelopesApi.getDocument(accountId, envelopeSummary.getEnvelopeId(), "combined");
			Assert.assertTrue(pdfBytes.length > 0);
			/*
			 * try {
			 * 
			 * File pdfFile = File.createTempFile("ds_", "pdf", null);
			 * FileOutputStream fos = new FileOutputStream(pdfFile);
			 * fos.write(pdfBytes);
			 * 
			 * // show the PDF Desktop.getDesktop().open(pdfFile);
			 * 
			 * 
			 * } catch (Exception ex) {
			 * Assert.fail("Could not create pdf File");
			 * 
			 * }
			 */

		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}

	}

	@Test
	public void ListDocumentsTest() {
		System.out.println("\nListDocumentsTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();

			EnvelopeDocumentsResult docsList = envelopesApi.listDocuments(accountId, EnvelopeId);
			Assert.assertNotNull(docsList);
			Assert.assertEquals(EnvelopeId, docsList.getEnvelopeId());

			System.out.println("EnvelopeDocumentsResult: " + docsList);
		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void ResendEnvelopeTest() {
		System.out.println("\nResendEnvelopeTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			// String currentDir = new java.io.File(".").getCononicalPath();

			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertEquals(null, ioExcp);
		}

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		String base64Doc = Base64.encodeToString(fileBytes, false);
		doc.setDocumentBase64(base64Doc);
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<Document>();
		docs.add(doc);
		envDef.setDocuments(docs);

		// Add a recipient to sign the document
		Signer signer = new Signer();
		signer.setEmail(UserName);
		String name = "Pat Developer";
		signer.setName(name);
		signer.setRecipientId("1");

		// this value represents the client's unique identifier for the signer
		String clientUserId = "2939";
		signer.setClientUserId(clientUserId);

		// Create a SignHere tab somewhere on the document for the signer to
		// sign
		SignHere signHere = new SignHere();
		signHere.setDocumentId("1");
		signHere.setPageNumber("1");
		signHere.setRecipientId("1");
		signHere.setXPosition("100");
		signHere.setYPosition("100");
		signHere.setScaleValue("0.5");

		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		Recipients recipients = new Recipients();
		recipients.setSigners(new ArrayList<Signer>());
		recipients.getSigners().add(signer);
		envDef.setRecipients(recipients);

		envDef.setStatus("sent");

		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			EnvelopesApi.UpdateRecipientsOptions updateRecipientsOptions = envelopesApi.new UpdateRecipientsOptions();
			updateRecipientsOptions.setResendEnvelope("true");

			RecipientsUpdateSummary recipientsUpdateSummary = envelopesApi.updateRecipients(accountId,
					envelopeSummary.getEnvelopeId(), recipients, updateRecipientsOptions);
			Assert.assertNotNull(recipientsUpdateSummary);
			Assert.assertTrue(recipientsUpdateSummary.getRecipientUpdateResults().size() > 0);
			Assert.assertEquals("SUCCESS",
					recipientsUpdateSummary.getRecipientUpdateResults().get(0).getErrorDetails().getErrorCode());
			System.out.println("RecipientsUpdateSummary: " + recipientsUpdateSummary);
		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void GetDiagnosticLogsTest() {
		System.out.println("\nGetDiagnosticLogsTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			// String currentDir = new java.io.File(".").getCononicalPath();

			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertEquals(null, ioExcp);
		}

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		String base64Doc = Base64.encodeToString(fileBytes, false);
		doc.setDocumentBase64(base64Doc);
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<Document>();
		docs.add(doc);
		envDef.setDocuments(docs);

		// Add a recipient to sign the document
		Signer signer = new Signer();
		signer.setEmail(UserName);
		String name = "Pat Developer";
		signer.setName(name);
		signer.setRecipientId("1");

		// this value represents the client's unique identifier for the signer
		String clientUserId = "2939";
		signer.setClientUserId(clientUserId);

		// Create a SignHere tab somewhere on the document for the signer to
		// sign
		SignHere signHere = new SignHere();
		signHere.setDocumentId("1");
		signHere.setPageNumber("1");
		signHere.setRecipientId("1");
		signHere.setXPosition("100");
		signHere.setYPosition("100");
		signHere.setScaleValue("0.5");

		List<SignHere> signHereTabs = new ArrayList<SignHere>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<Signer>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		ApiClient apiClient = new ApiClient(BaseUrl);
		String currentDir = System.getProperty("user.dir");
		
		try {
			// IMPORTANT NOTE:
			// the first time you ask for a JWT access token, you should grant access by making the following call
			// get DocuSign OAuth authorization url:
			//String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
			// open DocuSign OAuth authorization url in the browser, login and grant access
			//Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
			// END OF NOTE

			byte[] privateKeyBytes = null;
			try {
				privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyFullPath));
			} catch (IOException ioExcp) {
				Assert.assertEquals(null, ioExcp);
			}
			if (privateKeyBytes == null) return;

			java.util.List<String> scopes = new ArrayList<String>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotSame(null, oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotSame(null, userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(accountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			byte[] pdfBytes = envelopesApi.getDocument(accountId, envelopeSummary.getEnvelopeId(), "combined");
			Assert.assertTrue(pdfBytes.length > 0);

			/*
			 * try {
			 * 
			 * File pdfFile = File.createTempFile("ds_", "pdf", null);
			 * FileOutputStream fos = new FileOutputStream(pdfFile);
			 * fos.write(pdfBytes);
			 * 
			 * // show the PDF Desktop.getDesktop().open(pdfFile);
			 * 
			 * 
			 * } catch (Exception ex) {
			 * Assert.fail("Could not create pdf File");
			 * 
			 * }
			 */

			DiagnosticsApi diagApi = new DiagnosticsApi();

			ApiRequestLogsResult logsList = diagApi.listRequestLogs();
			String requestLogId = logsList.getApiRequestLogs().get(0).getRequestLogId();
			byte[] diagBytes = diagApi.getRequestLog(requestLogId);
			Assert.assertTrue(diagBytes.length > 0);

			/*
			 * try {
			 * 
			 * File diagFile = File.createTempFile("ds_", "txt", null);
			 * FileOutputStream fos = new FileOutputStream(diagFile);
			 * fos.write(diagBytes);
			 * 
			 * // show the PDF Desktop.getDesktop().open(diagFile);
			 * 
			 * 
			 * } catch (Exception ex) {
			 * Assert.fail("Could not create diag log File");
			 * 
			 * }
			 */

		} catch (ApiException ex) {
			System.out.println("Exception: " + ex);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getLocalizedMessage());
		}

	}

}
