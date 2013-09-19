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

import java.util.*;
import org.junit.*;
import com.docusign.esignature.DocuSignClient;
import com.docusign.esignature.json.*;

public class RequestSignatureTemplate {

	@Test
	public void requestSignatureTest() throws Exception
	{		
		String envelopeId = "";	// will retrieve

		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		//
		// STEP 2 - Send signature request from template 
		//
		RequestSignatureFromTemplate request = new RequestSignatureFromTemplate();
		request.setEmailSubject("From a Unit Test");
		request.setEmailBlurb("Blurb from a Unit Test");
		request.setTemplateId(TestSettings.TEMPLATE_ID);
		request.setStatus("sent");

		// need to fill out who signs this
		TemplateRole role = new TemplateRole();
		role.setName("Mike Borozdin");
		role.setEmail(TestSettings.SAMPLE_EMAIL);
		role.setRoleName("Signer1");
		List<TemplateRole> roles = new ArrayList<TemplateRole>(1);
		roles.add(role);
		request.setTemplateRoles(roles);
		
		envelopeId = client.requestSignatureFromTemplate(request);
		Assert.assertTrue( envelopeId.length() > 0 );
		
		System.out.println("envelopeId = " + envelopeId );
	} 
}