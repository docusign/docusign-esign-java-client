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

public class ClientTests {
	DocuSignClient client;

	@Before
	public void setUp() throws Exception {
		client = new DocuSignClient(TestSettings.TEST_EMAIL,
				TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void loginTest() throws Exception {
		boolean result = client.login();
		Assert.assertEquals(true, result);
	}
}
