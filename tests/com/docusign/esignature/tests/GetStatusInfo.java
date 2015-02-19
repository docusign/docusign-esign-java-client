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

import java.util.Date;

import org.junit.*;

import com.docusign.esignature.DocuSignClient;
import com.docusign.esignature.json.EnvelopeInformation;
import com.docusign.esignature.json.StatusInformation;

public class GetStatusInfo {
	@Test
	public void getStatusInfoTest() throws Exception {
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL,
				TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);

		//
		// STEP 2 - Request Envelopes Info
		//
		
		StatusInformation status = client.requestStatusInformation(new Date(), "delivered");
		Assert.assertNotNull(status);
		Assert.assertNotNull(status.getEnvelopes());

		System.out.println("got " + status.getTotalSetSize() + " envelopes");
		for (EnvelopeInformation envelope : status.getEnvelopes()) {
			System.out.println("Envelope Id: " + envelope.getEnvelopeId() + "\nStatus: " + envelope.getStatus() + "\n\n");
		}
	}
}