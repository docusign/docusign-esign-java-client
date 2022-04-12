import com.docusign.esign.api.*;
import com.docusign.esign.client.*;
import com.docusign.esign.model.*;
import com.docusign.esign.client.auth.OAuth;
import com.docusign.esign.client.auth.OAuth.UserInfo;
import java.io.File;

import java.time.LocalDate;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.migcomponents.migbase64.Base64;

/**
 *
 * @author majid.mallis
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SdkUnitTests {

	private static final String UserName = System.getenv("USER_NAME");
	private static final String UserId = System.getenv("USER_ID");
	private static final String IntegratorKey = System.getenv("INTEGRATOR_KEY_JWT");

	private static final String BaseUrl = "https://demo.docusign.net/restapi";
    private static final byte[] privateKeyBytes = Base64.decode(System.getenv("PRIVATE_KEY"));
	private static final String brandLogoFullPath = System.getProperty("user.dir") + "/src/test/docs/DS.png";
	private static final String brandFullPath = System.getProperty("user.dir") + "/src/test/docs/brand.xml";

	private static final String SignTest1File = "/src/test/docs/SignTest1.pdf";
	private static final String TemplateId = System.getenv("TEMPLATE_ID");
	private static final String BrandId = System.getenv("BRAND_ID");
	private String[] envelopeIds = new String[0];
	// JUnit 4.12 runs test cases in parallel, so the envelope ID needs to be initiated as well.
	private String AccountId = "";

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
		if (envelopeIds.length == 0) {
			envelopeIds = getLastTenEnvelopeIds();
		}

		if (AccountId.isEmpty()) {
			AccountId = initApiClient();
		}
	}

	@After
	public void tearDown() {
	}

	@Test
	public void JWTLoginTest() {
		System.out.println("\nJWTLoginTest:\n" + "===========================================");
		ApiClient apiClient = new ApiClient(BaseUrl);

		try {
			java.util.List<String> scopes = new ArrayList<>();
			scopes.add(OAuth.Scope_SIGNATURE);
			scopes.add(OAuth.Scope_IMPERSONATION);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotNull(oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotNull(userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			System.out.println("UserInfo: " + userInfo);
			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}


	@Test
	public void RequestASignatureTest() {
		System.out.println("\nRequestASignatureTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
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
		//doc.setAssignTabsToRecipientId("false");

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");
		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();

			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());
			Assert.assertEquals("sent", envelopeSummary.getStatus());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
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
		List<TemplateRole> templateRolesList = new ArrayList<>();
		templateRolesList.add(tRole);

		// assign template role(s) to the envelope
		envDef.setTemplateRoles(templateRolesList);

		// send the envelope by setting |status| to "sent". To save as a draft
		// set to "created"
		envDef.setStatus("sent");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();

			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());
			Assert.assertEquals("sent", envelopeSummary.getStatus());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void EmbeddedSigningTest() {
		System.out.println("\nEmbeddedSigningTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
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

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

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

			ViewUrl viewUrl = envelopesApi.createRecipientView(AccountId, envelopeSummary.getEnvelopeId(), recipientView);

			Assert.assertNotNull(viewUrl);
			Assert.assertNotNull(viewUrl.getUrl());
			// This Url should work in an Iframe or browser to allow signing
			System.out.println("ViewUrl is " + viewUrl);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}

	}

	@Test
	public void EmbeddedSendingTest() {
		System.out.println("\nEmbeddedSendingTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
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

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			ViewUrl viewUrl = envelopesApi.createSenderView(AccountId, envelopeSummary.getEnvelopeId(), null);

			Assert.assertNotNull(viewUrl);
			Assert.assertNotNull(viewUrl.getUrl());
			// This Url should work in an Iframe or browser to allow signing
			System.out.println("ViewUrl is " + viewUrl);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}

	}

	@Test
	public void CreateTemplateTest() {
		System.out.println("\nCreateTemplateTest:\n" + "===========================================");
		byte[] fileBytes = null;
		File f;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);

			f = new File(path.toString());
			Assert.assertTrue(f.length() > 0);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
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

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		templateDef.setRecipients(new Recipients());
		templateDef.getRecipients().setSigners(new ArrayList<>());
		templateDef.getRecipients().getSigners().add(signer);

		templateDef.setName("myTemplate");

		try {
			TemplatesApi templatesApi = new TemplatesApi();
			TemplateSummary templateSummary = templatesApi.createTemplate(AccountId, templateDef);

			Assert.assertNotNull(templateSummary);

			System.out.println("TemplateSummary: " + templateSummary);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void DownLoadEnvelopeDocumentsTest() {
		System.out.println("\nDownLoadEnvelopeDocumentsTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
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

		List<Document> docs = new ArrayList<>();
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

		List<Text> textTabs = new ArrayList<>();
		textTabs.add(text);
		Tabs tabs = new Tabs();
		tabs.setTextTabs(textTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			byte[] pdfBytes = envelopesApi.getDocument(AccountId, envelopeSummary.getEnvelopeId(), "combined");
			Assert.assertTrue(pdfBytes.length > 0);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}

	}

	@Test
	public void ListDocumentsTest() {
		System.out.println("\nListDocumentsTest:\n" + "===========================================");
		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();

			EnvelopeDocumentsResult docsList = envelopesApi.listDocuments(AccountId, envelopeIds[0]);
			Assert.assertNotNull(docsList);
			Assert.assertEquals(envelopeIds[0], docsList.getEnvelopeId());

			System.out.println("EnvelopeDocumentsResult: " + docsList);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
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
			Assert.assertNull(ioExcp);
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

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		Recipients recipients = new Recipients();
		recipients.setSigners(new ArrayList<>());
		recipients.getSigners().add(signer);
		envDef.setRecipients(recipients);

		envDef.setStatus("sent");
		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			EnvelopesApi.UpdateRecipientsOptions updateRecipientsOptions = envelopesApi.new UpdateRecipientsOptions();
			updateRecipientsOptions.setResendEnvelope("true");

			RecipientsUpdateSummary recipientsUpdateSummary = envelopesApi.updateRecipients(AccountId,
					envelopeSummary.getEnvelopeId(), recipients, updateRecipientsOptions);
			Assert.assertNotNull(recipientsUpdateSummary);
			Assert.assertTrue(recipientsUpdateSummary.getRecipientUpdateResults().size() > 0);
			System.out.println("RecipientsUpdateSummary: " + recipientsUpdateSummary);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void GetDiagnosticLogsTest() {
		System.out.println("\nGetDiagnosticLogsTest:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
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

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

			byte[] pdfBytes = envelopesApi.getDocument(AccountId, envelopeSummary.getEnvelopeId(), "combined");
			Assert.assertTrue(pdfBytes.length > 0);

			DiagnosticsApi diagApi = new DiagnosticsApi();

			ApiRequestLogsResult logsList = diagApi.listRequestLogs();
			String requestLogId = logsList.getApiRequestLogs().get(0).getRequestLogId();
			byte[] diagBytes = diagApi.getRequestLog(requestLogId);
			Assert.assertTrue(diagBytes.length > 0);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}

	}

	@Test
	public void ListStatusChangesTest() {
		System.out.println("\nListStatusChangesTest:\n" + "===========================================");
		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();

			String envelopeIdsStr = StringUtil.join(envelopeIds, ",");
			// set a filter for the envelopes we want returned using the envelopeIds property in the query parameter
			EnvelopesApi.ListStatusChangesOptions listStatusChangesOptions = envelopesApi.new ListStatusChangesOptions();
			listStatusChangesOptions.setEnvelopeIds(envelopeIdsStr);

			EnvelopesInformation envelopesInformation = envelopesApi.listStatusChanges(AccountId, listStatusChangesOptions);
			Assert.assertNotNull(envelopesInformation);
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0));
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0).getEnvelopeId());
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0).getStatus());

			System.out.println("EnvelopesInformation: " + envelopesInformation);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void ListStatusTest() {
		System.out.println("\nListStatusTest:\n" + "===========================================");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();

			// set a filter for the envelopes we want returned using the envelopeIds property in the body
			EnvelopeIdsRequest envelopeIdsRequest =  new EnvelopeIdsRequest();
			envelopeIdsRequest.setEnvelopeIds(Arrays.asList(envelopeIds));

			EnvelopesApi.ListStatusOptions listStatusOptions = envelopesApi.new ListStatusOptions();
			listStatusOptions.setEnvelopeIds("request_body");

			EnvelopesInformation envelopesInformation = envelopesApi.listStatus(AccountId, envelopeIdsRequest, listStatusOptions);
			Assert.assertNotNull(envelopesInformation);
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0));
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0).getEnvelopeId());
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0).getStatus());

			System.out.println("EnvelopesInformation: " + envelopesInformation);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void UpdateChunkedUpload() {
		System.out.println("\nUpdateChunkedUpload:\n" + "===========================================");
		byte[] fileBytes = null;
		try {
			String currentDir = System.getProperty("user.dir");

			Path path = Paths.get(currentDir + SignTest1File);
			fileBytes = Files.readAllBytes(path);
		} catch (IOException ioExcp) {
			Assert.assertNull(ioExcp);
		}

		// create an envelope to be signed
		EnvelopeDefinition envDef = new EnvelopeDefinition();
		envDef.setEmailSubject("Please Sign my Java SDK Envelope");
		envDef.setEmailBlurb("Hello, Please sign my Java SDK Envelope.");

		// add a document to the envelope
		Document doc = new Document();
		doc.setName("TestFile.pdf");
		doc.setDocumentId("1");

		List<Document> docs = new ArrayList<>();
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

		List<SignHere> signHereTabs = new ArrayList<>();
		signHereTabs.add(signHere);
		Tabs tabs = new Tabs();
		tabs.setSignHereTabs(signHereTabs);
		signer.setTabs(tabs);

		// Above causes issue
		envDef.setRecipients(new Recipients());
		envDef.getRecipients().setSigners(new ArrayList<>());
		envDef.getRecipients().getSigners().add(signer);

		// send the envelope (otherwise it will be "created" in the Draft folder
		envDef.setStatus("sent");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();

			// upload 2 chunks
			ChunkedUploadRequest chunkedUploadRequest1 = new ChunkedUploadRequest();
			chunkedUploadRequest1.setData(Base64.encodeToString(Arrays.copyOfRange(fileBytes, 0, fileBytes.length / 2), false));
			ChunkedUploadResponse chunkedUploadResponse1 = envelopesApi.createChunkedUpload(AccountId, chunkedUploadRequest1);

			final String chunkedUploadId = chunkedUploadResponse1.getChunkedUploadId();
			final String chunkedUploadUri = chunkedUploadResponse1.getChunkedUploadUri();

			ChunkedUploadRequest chunkedUploadRequest2 = new ChunkedUploadRequest();
			chunkedUploadRequest2.setData(Base64.encodeToString(Arrays.copyOfRange(fileBytes, fileBytes.length / 2, fileBytes.length), false));
			envelopesApi.updateChunkedUploadPart(AccountId, chunkedUploadId, "1", chunkedUploadRequest2);

			ChunkedUploadResponse updateChunkedUploadResponse = envelopesApi.updateChunkedUpload(AccountId, chunkedUploadId);

			//refer to the chuck
			envDef.getDocuments().get(0).setRemoteUrl(chunkedUploadUri);
			EnvelopeSummary envelopeSummary = envelopesApi.createEnvelope(AccountId, envDef);

			System.out.println("UpdateChunkedUploadResponse: " + updateChunkedUploadResponse);

			Assert.assertNotNull(envelopeSummary);
			Assert.assertNotNull(envelopeSummary.getEnvelopeId());
			Assert.assertEquals("sent", envelopeSummary.getStatus());

			System.out.println("EnvelopeSummary: " + envelopeSummary);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}

	@Test
	public void UpdateBrandLogoByTypeTest() {
		System.out.println("\nUpdateBrandLogoByTypeTest:\n" + "===========================================");

		try {
			String logoType = "primary";
			byte[] brandLogoBytes = null;
			try {
				brandLogoBytes = Files.readAllBytes(Paths.get(brandLogoFullPath));
			} catch (IOException ioExcp) {
				Assert.assertNull(ioExcp);
			}

			AccountsApi accountsApi = new AccountsApi();
			accountsApi.updateBrandLogoByType(AccountId, BrandId, logoType, brandLogoBytes);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}
    
	@Test
	public void UpdateBrandResourcesByContentTypeTest() {
		System.out.println("\nUpdateBrandResourcesByContentTypeTest:\n" + "===========================================");

		try {
			String resourceContentType = "email";
			byte[] brandBytes = null;
			try {
				brandBytes = Files.readAllBytes(Paths.get(brandFullPath));
			} catch (IOException ioExcp) {
				Assert.assertNull(ioExcp);
			}

			AccountsApi accountsApi = new AccountsApi();
			accountsApi.updateBrandResourcesByContentType(AccountId, BrandId, resourceContentType, brandBytes);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}
    
    @Test
	public void DeleteSigningGroupUserTest()
	{
		System.out.println("\nDeleteSigningGroupUserTest:\n" + "===========================================");

		try {
			SigningGroupsApi signingGroupsApi = new SigningGroupsApi();
			
			SigningGroupUser sgUser = new SigningGroupUser();
			sgUser.setEmail(UserName);
			sgUser.setUserName("Pat Developer");
			
			// create new signing group with this user
			SigningGroupInformation signingGroupInformation = new SigningGroupInformation();
			SigningGroup signingGroup = new SigningGroup();
			signingGroup.setGroupName("temp");
			signingGroup.setGroupType("sharedSigningGroup");
			java.util.List<SigningGroupUser> users = new ArrayList<>();
			users.add(sgUser);
			signingGroup.setUsers(users);
			signingGroupInformation.addGroupsItem(signingGroup);
			SigningGroupInformation retvalSGInformation = signingGroupsApi.createList(AccountId,
					signingGroupInformation);
			
			System.out.println("SigningGroupInformation: " + retvalSGInformation);
			Assert.assertNotNull(retvalSGInformation);

			// delete the same user from the new signing group
			java.util.List<SigningGroup> retvalSGs = retvalSGInformation.getGroups();
			String signingGroupId = null;
			for (SigningGroup sg: retvalSGs) {
				if ("temp".equals(sg.getGroupName())) {
					signingGroupId = sg.getSigningGroupId();
				}
			}
			
			SigningGroupUsers signingGroupUsers = new SigningGroupUsers();
			signingGroupUsers.addUsersItem(sgUser);
			SigningGroupUsers retvalSGroupUsers = signingGroupsApi.deleteUsers(AccountId, signingGroupId,
					signingGroupUsers);
			
			System.out.println("SigningGroupUsers: " + retvalSGroupUsers);
			Assert.assertNotNull(retvalSGroupUsers);
			
			// delete the new signing group altogether
			retvalSGInformation = signingGroupsApi.deleteList(AccountId, retvalSGInformation);
			
			System.out.println("SigningGroupInformation: " + retvalSGInformation);
			Assert.assertNotNull(retvalSGInformation);

		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}	
	}

	@Test
	public void GetFormDataTest() {
		System.out.println("\nGetFormDataTest:\n" + "===========================================");

		try {
			EnvelopesApi envelopesApi = new EnvelopesApi();
			String envelopeId = envelopeIds[0];
			EnvelopeFormData envelopeFormData = envelopesApi.getFormData(AccountId, envelopeId);
			Assert.assertNotNull(envelopeFormData);
			Assert.assertEquals(envelopeFormData.getEnvelopeId(), envelopeId);

			System.out.println("EnvelopeFormData: " + envelopeFormData);
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}
	}
    @Test
    public void ListRecipientsTest() {
        System.out.println("\nListRecipientsTest:\n" + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();
            Recipients recipients = envelopesApi.listRecipients(AccountId, envelopeIds[0]);

            Assert.assertNotNull(recipients);
            Assert.assertNotNull(recipients.getRecipientCount());

            System.out.println("Recipients: " + recipients);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void GetAccountInformationTest() {
        System.out.println("\nGetAccountInformationTest:\n" + "===========================================");

        try {
            AccountsApi accountsApi = new AccountsApi();
            AccountInformation accountInformation = accountsApi.getAccountInformation(AccountId);

            Assert.assertNotNull(accountInformation);
            Assert.assertNotNull(accountInformation.getAccountName());

            System.out.println("AccountInformation: " + accountInformation);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void ListUsersTest() {
        System.out.println("\nListUsersTest:\n" + "===========================================");

        try {
            UsersApi usersApi = new UsersApi();
            UserInformationList users = usersApi.callList(AccountId);

            Assert.assertNotNull(users);
            Assert.assertNotNull(users.getUsers());

            System.out.println("Users: " + users);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void GetAuditEventsTest() {
        System.out.println("\nGetAuditEventsTest:\n" + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();
            EnvelopeAuditEventResponse auditEventsResponse =
                    envelopesApi.listAuditEvents(AccountId, envelopeIds[0]);

            Assert.assertNotNull(auditEventsResponse);
            Assert.assertNotNull(auditEventsResponse.getAuditEvents());

            System.out.println("AuditEventsResponse: " + auditEventsResponse);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void ListEnvelopeRecipientTabsTest() {
        System.out.println("\nListEnvelopeRecipientTabsTest:\n" + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();
            Recipients recipients = envelopesApi.listRecipients(AccountId, envelopeIds[0]);
            String recipientId = "";

            if (!recipients.getSigners().isEmpty())
                recipientId = recipients.getSigners().get(0).getRecipientId();

            Tabs envelopeRecipientTabs = envelopesApi.listTabs(AccountId, envelopeIds[0], recipientId);

            Assert.assertNotNull(envelopeRecipientTabs);

            System.out.println("Envelope recipient tabs: " + envelopeRecipientTabs);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void CorrectEnvelopeTest() {
        System.out.println("\nCorrectEnvelopeTest:\n"
                + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();
            Envelope envelope = new Envelope();
            envelope.setEnvelopeId(envelopeIds[0]);
            envelope.setEmailSubject("new email subject");
            envelope.setEmailBlurb("new email message");

            Thread.sleep(2000);

            EnvelopeUpdateSummary envelopeUpdateSummary = envelopesApi.update(AccountId, envelopeIds[0], envelope);

            Assert.assertNotNull(envelopeUpdateSummary);
            Assert.assertNotNull(envelopeUpdateSummary.getEnvelopeId());
            System.out.println("Envelope update summary: " + envelopeUpdateSummary);

            Thread.sleep(2000);

            Envelope renewedEnvelope = envelopesApi.getEnvelope(AccountId, envelopeIds[0]);
            Assert.assertEquals(renewedEnvelope.getEmailSubject(), envelope.getEmailSubject());
            Assert.assertEquals(renewedEnvelope.getEmailBlurb(), envelope.getEmailBlurb());

            System.out.println("Updated envelope: " + envelopeUpdateSummary);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void UpdateRecipientsTest() {
        System.out.println("\nUpdateRecipientsTest:\n" + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();

            SignHere signHere = new SignHere();
            signHere.setName("SignHereTab");
            signHere.setXPosition("75");
            signHere.setYPosition("572");
            signHere.setTabLabel("SignHereTab");
            signHere.setPageNumber("1");
            signHere.setDocumentId("1");
            signHere.setRecipientId("1");

            Tabs signerTabs = new Tabs();
            signerTabs.setSignHereTabs(Collections.singletonList(signHere));

            Signer newSigner = new Signer();
            newSigner.setName("Test name");
            newSigner.setEmail(UserName);
            newSigner.routingOrder("1");
            newSigner.setStatus("sent");
            newSigner.setDeliveryMethod("email");
            newSigner.setRecipientId("1");
            newSigner.setTabs(signerTabs);
            newSigner.setIdCheckConfigurationName("ID Check");

            Recipients recipients = new Recipients();
            recipients.setSigners(Collections.singletonList(newSigner));

            RecipientsUpdateSummary updatedRecipients = envelopesApi.updateRecipients(
                    AccountId,
                    envelopeIds[0],
                    recipients);
            Assert.assertNotNull(updatedRecipients);
            System.out.println("Updated recipients: " + updatedRecipients);

            Recipients renewedRecipients = envelopesApi.listRecipients(AccountId, envelopeIds[0]);
            List<Signer> updatesRecipient = renewedRecipients.getSigners();
			Optional createdSigner = updatesRecipient.stream()
					.filter(x -> x.getName().equals(newSigner.getName())
                                    && x.getEmail().equals(newSigner.getEmail())).findFirst();
            Assert.assertNotNull(createdSigner);

            if(createdSigner.isPresent()) {
                Signer signer = (Signer) createdSigner.get();
                Assert.assertEquals(signer.getName(), newSigner.getName());
                Assert.assertEquals(signer.getEmail(), newSigner.getEmail());
                Assert.assertEquals(signer.getRoutingOrder(), newSigner.getRoutingOrder());
                Assert.assertEquals(signer.getStatus(), newSigner.getStatus());
                Assert.assertEquals(signer.getDeliveryMethod(), newSigner.getDeliveryMethod());
                Assert.assertEquals(signer.getRecipientId(), newSigner.getRecipientId());
                Assert.assertEquals(signer.getIdCheckConfigurationName(), newSigner.getIdCheckConfigurationName());
            }
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void UpdateDocumentsTest() {
        System.out.println("\nUpdateDocumentsTest:\n" + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();

            String currentDir = System.getProperty("user.dir");
            Path path = Paths.get(currentDir + SignTest1File);
            Document document = new Document();
            document.setDocumentBase64(Base64.encodeToString(Files.readAllBytes(path), false));
            document.setName("SignTest1.docx");
            document.setDocumentId("1");

            EnvelopeDefinition envelopeDefinition = new EnvelopeDefinition();
            envelopeDefinition.setDocuments(Collections.singletonList(document));

            Thread.sleep(2000);
            EnvelopeDocumentsResult envelopeDocumentsResult = envelopesApi.updateDocuments(
                    AccountId,
                    envelopeIds[1],
                    envelopeDefinition);

            List<EnvelopeDocument> envelopeDocuments = envelopeDocumentsResult.getEnvelopeDocuments();
            Assert.assertNotNull(envelopeDocumentsResult);
            Optional updatedDocument = envelopeDocuments.stream()
                    .filter(x -> x.getName().equals(document.getName()))
                    .findFirst();
            Assert.assertNotNull(updatedDocument);

            if(updatedDocument.isPresent()) {
                EnvelopeDocument envelopeDocument = (EnvelopeDocument) updatedDocument.get();
                Assert.assertEquals(envelopeDocument.getDocumentId(), document.getDocumentId());
                Assert.assertEquals(envelopeDocument.getName(), document.getName());
            }

            Thread.sleep(2000);
            byte[] addedDocument = envelopesApi.getDocument(AccountId, envelopeIds[0], document.getDocumentId());
            Assert.assertNotNull(addedDocument);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void CreateRecipientTabsTest() {
        System.out.println("\nCreateRecipientTabsTest:\n" + "===========================================");

        try {
            EnvelopesApi envelopesApi = new EnvelopesApi();
            Thread.sleep(2000);
            Recipients recipients = envelopesApi.listRecipients(AccountId, envelopeIds[0]);

            List<Signer> signers = recipients.getSigners();
            String recipientId = "";

            if (!signers.isEmpty())
                recipientId = signers.get(0).getRecipientId();

            SignHere signHere = new SignHere();
            signHere.setName("CustomSignHereTab");
            signHere.setAnchorUnits("pixels");
            signHere.setAnchorYOffset("123");
            signHere.setAnchorXOffset("234");
            signHere.setDocumentId("1");
            signHere.setPageNumber("1");
            signHere.setRecipientId("1");

            Tabs tabs = new Tabs();
            tabs.setSignHereTabs(Collections.singletonList(signHere));

            Thread.sleep(2000);
            Tabs createdTabs = envelopesApi.createTabs(AccountId, envelopeIds[0], recipientId, tabs);
            Assert.assertNotNull(createdTabs);

            Thread.sleep(2000);
            Tabs updatedTabs = envelopesApi.listTabs(AccountId, envelopeIds[0], recipientId);
            List<SignHere> signHereOfUpdatedTabs = updatedTabs.getSignHereTabs();
            SignHere lastTabKey = signHereOfUpdatedTabs.get(signHereOfUpdatedTabs.size() - 1);
            Assert.assertEquals(lastTabKey.getName(), signHere.getName());
            Assert.assertEquals(lastTabKey.getDocumentId(), signHere.getDocumentId());
            Assert.assertEquals(lastTabKey.getRecipientId(), signHere.getRecipientId());
            Assert.assertEquals(lastTabKey.getPageNumber(), signHere.getPageNumber());
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void CreateUserTest() {
        System.out.println("\nCreateUserTest:\n" + "===========================================");

        try {
            UsersApi usersApi = new UsersApi();

            UserInformation userInformation = new UserInformation();
            userInformation.setEmail(UserName);
            userInformation.setUserName("Test User");

            NewUsersDefinition newUsersDefinition = new NewUsersDefinition();
            newUsersDefinition.newUsers(Collections.singletonList(userInformation));

            NewUsersSummary userSummary = usersApi.create(AccountId, newUsersDefinition);
            Assert.assertNotNull(userSummary);
            Assert.assertEquals(userSummary.getNewUsers().get(0).getEmail(), userInformation.getEmail());
            Assert.assertEquals(userSummary.getNewUsers().get(0).getUserName(), userInformation.getUserName());
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void CustomApiClientTest() {
        System.out.println("\nCustomApiClientTest:\n" + "===========================================");

        class CustomApiClient extends ApiClient {
        	private CustomApiClient(String basePath) {
        		super(basePath);
        		// your ApiClient customizations go here
			}
		}

        try {
        	CustomApiClient customApiClient = new CustomApiClient(BaseUrl);
			List<String> scopes = new ArrayList<>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = customApiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			customApiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());

			EnvelopesApi envelopesApi = new EnvelopesApi(customApiClient);
			EnvelopeDocumentsResult docsList = envelopesApi.listDocuments(AccountId, envelopeIds[0]);
			Assert.assertNotNull(docsList);
			Assert.assertEquals(envelopeIds[0], docsList.getEnvelopeId());

			System.out.println("EnvelopeDocumentsResult: " + docsList);
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
    }

	private String[] getLastTenEnvelopeIds() {
		String [] envelopeIds = new String[0];

		ApiClient apiClient = new ApiClient(BaseUrl);
		try {
			java.util.List<String> scopes = new ArrayList<>();
			scopes.add(OAuth.Scope_SIGNATURE);

			OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
			Assert.assertNotNull(oAuthToken);
			// now that the API client has an OAuth token, let's use it in all
			// DocuSign APIs
			apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
			UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
			Assert.assertNotNull(userInfo);
			Assert.assertNotNull(userInfo.getAccounts());
			Assert.assertTrue(userInfo.getAccounts().size() > 0);

			// parse first account's baseUrl
			// below code required for production, no effect in demo (same
			// domain)
			apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
			Configuration.setDefaultApiClient(apiClient);
			String accountId = userInfo.getAccounts().get(0).getAccountId();

			// This example gets statuses of all envelopes in your account going back 1 full month...
			LocalDate fromDate = LocalDate.now();
			fromDate = fromDate.minusDays(30);
			String fromDateStr = fromDate.toString();

			// set a filter for the envelopes we want returned using the fromDate and count properties
			EnvelopesApi envelopesApi = new EnvelopesApi();
			EnvelopesApi.ListStatusChangesOptions listStatusChangesOptions = envelopesApi.new ListStatusChangesOptions();
			listStatusChangesOptions.setCount("10");
			listStatusChangesOptions.setFromDate(fromDateStr);
            listStatusChangesOptions.setStatus("sent");

			// |EnvelopesApi| contains methods related to envelopes and envelope recipients
			EnvelopesInformation envelopesInformation = envelopesApi.listStatusChanges(accountId, listStatusChangesOptions);

			Assert.assertNotNull(envelopesInformation);
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0));
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0).getEnvelopeId());
			Assert.assertNotNull(envelopesInformation.getEnvelopes().get(0).getStatus());

			List<Envelope> envelopes = envelopesInformation.getEnvelopes();
			envelopeIds = new String[envelopes.size()];
			for (int i = 0; i < envelopes.size(); i++){
				envelopeIds[i] = envelopes.get(i).getEnvelopeId();
			}
		} catch (ApiException ex) {
			Assert.fail("Exception: " + ex);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception: " + e.getLocalizedMessage());
		}

		return envelopeIds;
	}

    private String initApiClient() {
        ApiClient apiClient = new ApiClient(BaseUrl);
        String accountId = "";

        try {
            List<String> scopes = new ArrayList<>();
            scopes.add(OAuth.Scope_SIGNATURE);

            OAuth.OAuthToken oAuthToken = apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
            Assert.assertNotNull(oAuthToken);
            // now that the API client has an OAuth token, let's use it in all
            // DocuSign APIs
            apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
            UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
            Assert.assertNotNull(userInfo);
            Assert.assertNotNull(userInfo.getAccounts());
            Assert.assertTrue(userInfo.getAccounts().size() > 0);

            // parse first account's baseUrl
            // below code required for production, no effect in demo (same
            // domain)
            apiClient.setBasePath(userInfo.getAccounts().get(0).getBaseUri() + "/restapi");
            Configuration.setDefaultApiClient(apiClient);
            accountId = userInfo.getAccounts().get(0).getAccountId();
        } catch (ApiException ex) {
            Assert.fail("Exception: " + ex);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception: " + e.getLocalizedMessage());
        }
        return accountId;
    }
}