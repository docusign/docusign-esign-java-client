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
import com.docusign.esignature.json.RecipientInformation;

public class GetRecipientStatus
{	
	public static void getRecipientStatusTest() throws Exception
	{		
		//
		// Step 1 - login
		//
		DocuSignClient client = new DocuSignClient(TestSettings.TEST_EMAIL, TestSettings.TEST_PASSWORD, TestSettings.TEST_INTEGRATOR_KEY);
		boolean result = client.login();
		Assert.assertTrue("login should work", result);
		
		//
		// STEP 2 - Request Envelope Info
		//
		RecipientInformation recipientInfo = client.requestRecipientInformation(TestSettings.SENT_ENVELOPE);
		Assert.assertNotNull(recipientInfo);
		Assert.assertTrue(Integer.parseInt(recipientInfo.getRecipientCount()) > 0);
		Assert.assertNotNull(recipientInfo.getSigners());
		Assert.assertNotNull(recipientInfo.getSigners().get(0));
		
		System.out.println("got the envelope recipients count: " + recipientInfo.getRecipientCount() + ", status = " + recipientInfo.getSigners().get(0).getStatus());
	}
}