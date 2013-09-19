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

import com.docusign.esignature.DocuSignClient;

public class EmbeddedDocuSign {
	@Test
	public void embeddedDocuSignTest() throws Exception {
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL,
				TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);

		//
		// Step 2 - get pre-authenticated URL
		//
		String viewUrl = client.requestConsoleView();
		System.out.println("Console View URL:  " + viewUrl);
		Assert.assertTrue(viewUrl.length() > 0);
		Assert.assertTrue(viewUrl.startsWith(client.getServerUrl()));
	}
} // end class