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

import java.io.*;
import java.net.URL;

import org.junit.*;

import com.docusign.esignature.json.LoginResult;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonTests {
	
	@Test
	public void loadFileTest() throws IOException {
		
		URL url = this.getClass().getResource("/loginResult.json");
		File testFile = new File(url.getFile());
        Assert.assertTrue(testFile.exists());
	}
	
	@Test 
	public void testParseLoginResult() throws JsonParseException, JsonMappingException, IOException {
		URL url = this.getClass().getResource("/loginResult.json");
		File testFile = new File(url.getFile());
        Assert.assertTrue(testFile.exists());
        
		ObjectMapper mapper = new ObjectMapper();
		LoginResult result = mapper.readValue(testFile, LoginResult.class);
		
		Assert.assertFalse( result.getLoginAccounts().isEmpty());
	}
}
