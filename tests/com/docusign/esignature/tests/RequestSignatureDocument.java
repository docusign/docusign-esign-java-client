/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
 */
package com.docusign.esignature.tests;


import org.junit.*;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.docusign.esignature.DocuSignClient;
import com.docusign.esignature.json.*;

public class RequestSignatureDocument
{	
    @Rule
    public ExpectedException thrown= ExpectedException.none();
    
	@Test
	public void requestSignatureNullFiles() throws Exception
	{		
        thrown.expect(IllegalArgumentException.class);

		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		// 
		// STEP 2 - Create an envelope with one recipient, document, and tab and send
		// 
		RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
		String envelopeId = client.requestSignatureFromDocuments(request, new File[0]);
		Assert.assertNotNull(envelopeId);
		Assert.assertTrue(envelopeId.length() > 0);
		
		//--- display results
		System.out.println("Document sent!  envelopeId is " + envelopeId );
	}
	
	@Test
	public void requestSignatureNoFiles() throws Exception
	{		
        thrown.expect(IllegalArgumentException.class);

		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		// 
		// STEP 2 - Create an envelope with one recipient, document, and tab and send
		// 
		RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
		String envelopeId = client.requestSignatureFromDocuments(request, new File[0]);
		Assert.assertNotNull(envelopeId);
		Assert.assertTrue(envelopeId.length() > 0);
		
		//--- display results
		System.out.println("Document sent!  envelopeId is " + envelopeId );
	}
	
	@Test
	public void requestSignature() throws Exception
	{		
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		// 
		// STEP 2 - Create an envelope with one recipient, document, and tab and send
		// 
		RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
		
		request.setEmailSubject("Sending one doc from unit test");
		request.setStatus("sent");

		Recipients recipients = new Recipients();
		List<Signer> signers = new ArrayList<Signer>();
		Signer signer = new Signer();
		signer.setEmail(TestSettings.SAMPLE_EMAIL);
		signer.setName("Mike Borozdin");
		signer.setRecipientId("1");
		signers.add(signer);
		recipients.setSigners(signers);
		request.setRecipients(recipients);
		
		List<Document> documents = new ArrayList<Document>();
		Document document = new Document();
		document.setName("test1.pdf");
		document.setDocumentId("1");
		documents.add(document);
		request.setDocuments(documents);
		
		URL url = this.getClass().getResource("/picturePdf.pdf");
		File testFile = new File(url.getFile());
		File[] files = new File[1];
		files[0] = testFile;
		
		String envelopeId = client.requestSignatureFromDocuments(request, files );
		Assert.assertNotNull(envelopeId);
		Assert.assertTrue(envelopeId.length() > 0);
		
		//--- display results
		System.out.println("Document sent!  envelopeId is " + envelopeId );
	}
	
	
	@Test
	public void requestSignatureAnchors() throws Exception
	{		
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		// 
		// STEP 2 - Create an envelope with one recipient, document, and tab and send
		// 
		RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
		
		request.setEmailSubject("Sending one doc with anchors from unit test");
		request.setStatus("sent");
		
		Tabs tabs = new Tabs();
		SignHereTab signHereTab = new SignHereTab();
		signHereTab.setDocumentId("1");
		signHereTab.setAnchorString("Testing");
		List<SignHereTab> signHereTabs = new ArrayList<SignHereTab>();
		signHereTabs.add(signHereTab);
		tabs.setSignHereTabs(signHereTabs);
		
		Recipients recipients = new Recipients();
		List<Signer> signers = new ArrayList<Signer>();
		Signer signer = new Signer();
		signer.setEmail(TestSettings.SAMPLE_EMAIL);
		signer.setName("Mike Borozdin");
		signer.setRecipientId("1");
		signer.setTabs(tabs);
		signers.add(signer);
		recipients.setSigners(signers);
		request.setRecipients(recipients);
		
		List<Document> documents = new ArrayList<Document>();
		Document document = new Document();
		document.setName("test1.pdf");
		document.setDocumentId("1");
		documents.add(document);
		request.setDocuments(documents);
		
		URL url = this.getClass().getResource("/picturePdf.pdf");
		File testFile = new File(url.getFile());
		File[] files = new File[1];
		files[0] = testFile;
		
		String envelopeId = client.requestSignatureFromDocuments(request, files );
		Assert.assertNotNull(envelopeId);
		Assert.assertTrue(envelopeId.length() > 0);
		
		//--- display results
		System.out.println("Document with anchors sent sent!  envelopeId is " + envelopeId );
	}
	
	
	@Test
	public void requestSignatureTwoDocs() throws Exception
	{		
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		// 
		// STEP 2 - Create an envelope with two documents
		// 
		RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
		
		request.setEmailSubject("Sending 2 Docs from Unit Test");
		request.setStatus("sent");

		Recipients recipients = new Recipients();
		List<Signer> signers = new ArrayList<Signer>();
		Signer signer = new Signer();
		signer.setEmail(TestSettings.SAMPLE_EMAIL);
		signer.setName("Mike Borozdin");
		signer.setRecipientId("1");
		signers.add(signer);
		recipients.setSigners(signers);
		request.setRecipients(recipients);
		
		List<Document> documents = new ArrayList<Document>();
		
		Document document = new Document();
		document.setName("test1.pdf");
		document.setDocumentId("1");
		
		Document document2 = new Document();
		document2.setName("test2.pdf");
		document2.setDocumentId("2");
		
		documents.add(document);
		documents.add(document2);
		request.setDocuments(documents);
		
		URL url = this.getClass().getResource("/picturePdf.pdf");
		File testFile = new File(url.getFile());
		File[] files = new File[2];
		files[0] = testFile;
		files[1] = testFile;
		
		String envelopeId = client.requestSignatureFromDocuments(request, files );
		Assert.assertNotNull(envelopeId);
		Assert.assertTrue(envelopeId.length() > 0);
		
		//--- display results
		System.out.println("Documents sent!  envelopeId is " + envelopeId );
	}
	
	@Test
	public void requestSignatureMultipleDocFormats() throws Exception
	{		
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		// 
		// STEP 2 - Create an envelope with one pdf and two Word (.docx) docs
		// 
		RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
		
		request.setEmailSubject("Sending multiple doc formats from Unit Test");
		request.setStatus("sent");

		Recipients recipients = new Recipients();
		List<Signer> signers = new ArrayList<Signer>();
		Signer signer = new Signer();
		signer.setEmail(TestSettings.SAMPLE_EMAIL);
		signer.setName("Mike Borozdin");
		signer.setRecipientId("1");
		signers.add(signer);
		recipients.setSigners(signers);
		request.setRecipients(recipients);
		
		List<Document> documents = new ArrayList<Document>();
		
		Document document = new Document();
		document.setName("test1.pdf");
		document.setDocumentId("1");
		
		Document document2 = new Document();
		document2.setName("test2.docx");
		document2.setDocumentId("2");
		
		Document document3 = new Document();
		document3.setName("test3.docx");
		document3.setDocumentId("3");
		
		documents.add(document);
		documents.add(document2);
		documents.add(document3);
		request.setDocuments(documents);
		
		URL url = this.getClass().getResource("/picturePdf.pdf");
		URL url2 = this.getClass().getResource("/WordTest.docx");
		File testFile = new File(url.getFile());
		File testFile2 = new File(url2.getFile());
		File[] files = new File[3];
		files[0] = testFile;
		files[1] = testFile2;
		files[2] = testFile2;
		
		String envelopeId = client.requestSignatureFromDocuments(request, files );
		Assert.assertNotNull(envelopeId);
		Assert.assertTrue(envelopeId.length() > 0);
		
		//--- display results
		System.out.println("Documents sent!  envelopeId is " + envelopeId );
	}
} // end class