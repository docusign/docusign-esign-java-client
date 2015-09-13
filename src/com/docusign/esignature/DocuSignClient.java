/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * 
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */

package com.docusign.esignature;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.IOUtils;
import org.xml.sax.InputSource;

import com.docusign.esignature.json.Document;
import com.docusign.esignature.json.EnvelopeInformation;
import com.docusign.esignature.json.LoginAccount;
import com.docusign.esignature.json.LoginResult;
import com.docusign.esignature.json.RecipientInformation;
import com.docusign.esignature.json.RequestSignatureFromDocuments;
import com.docusign.esignature.json.RequestSignatureFromTemplate;
import com.docusign.esignature.json.RequestSignatureResponse;
import com.docusign.esignature.json.StatusInformation;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This is a client library to help you get started with DocuSign eSignature API
 * 
 * 
 * NOTE: it does not and will not have the full functionality of the DocuSign service.
 * Feel free to update the proxy classes yourself and contribute functions.
 * Alternatively you can get the raw HTTP connection and send over your own JSON.
 * For full functionality and documentation visit www.docusign.com/devcenter and iodocs.docusign.com
 *
 */
public class DocuSignClient {
	private String email;
	private String password;
	private List<LoginAccount> loginAccounts = new ArrayList<LoginAccount>();
	private String accountId;
	private String integratorKey;
	// this defaults to demo, 
	// for production you will need to update the default or set it to www.docusign.net
	private String serverUrl = "https://demo.docusign.net";  
	private String baseUrl = "";
	private String lastResponse;
	private String lastRequest;
	private String lastError;
	private String accessToken;
	
	
	//
	// constructors
	//
	public DocuSignClient(String email, String password, String integratorKey) {
		this.email = email;
		this.password = password;
		this.integratorKey = integratorKey;
	}
	
	public DocuSignClient(String email, String password, String accountId, String integratorKey) {
		this.email = email;
		this.password = password;
		this.accountId = accountId;
		this.integratorKey = integratorKey;
	}
	
	public DocuSignClient(String integratorKey) {
		this(integratorKey, null);
	}
	
	public DocuSignClient(String integratorKey, String accessToken) {
		this.integratorKey = integratorKey;
		this.accessToken = accessToken;
	}
	
	/**
	 * login will set the baseUrl and accountId to the default account.  
	 * you can retrieve logged in accounts and use other accounts if you wish.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public boolean login() throws MalformedURLException, IOException {
		String loginUrl = serverUrl + "/restapi/v2/login_information";
		HttpURLConnection conn = null;
		
		try {

			conn = getRestConnection(loginUrl);
			int status = conn.getResponseCode(); // triggers the request
			if( status != 200 )	// 200 = OK
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return false;
			}

			BufferedInputStream bufferStream = extractAndSaveOutput(conn);
			
			ObjectMapper mapper = new ObjectMapper();
			LoginResult loginResult = mapper.readValue( bufferStream, LoginResult.class );
			loginAccounts = loginResult.getLoginAccounts();
			
			// NOTE: there should never be a time when we get a positive result and less than one account.
			accountId = loginAccounts.get(0).getAccountId();
			baseUrl = loginAccounts.get(0).getBaseUrl();
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}

		return true;
	}


	/**
	 * this is the easiest way to send documents for signature.  It allows you to 
	 * set up the signature workflow in DocuSign through WYSIWYG way -
	 * just log into DocuSign, create a template and remember the role name
	 * and the template ID.  Once you have that you can use this function
	 * @param request
	 * @return envelopeId string if successful, empty string if not.
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public String requestSignatureFromTemplate( RequestSignatureFromTemplate request ) throws MalformedURLException, IOException {
		HttpURLConnection conn = null;

		try 
		{
			// append "/envelopes" to the baseUrl and use in the request
			conn = getRestConnection(baseUrl + "/envelopes");

			ObjectMapper mapper = new ObjectMapper();
			lastRequest = mapper.writeValueAsString(request);
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length", Integer.toString(lastRequest.length()));

			// Write body of the POST request 
			DataOutputStream dos = new DataOutputStream( conn.getOutputStream() );
			dos.writeBytes(lastRequest); dos.flush(); dos.close();
			int status = conn.getResponseCode(); // triggers the request
			if( status != 201 )	// 201 = Created
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return "";
			}

			// Read the response
			RequestSignatureResponse response = mapper.readValue(conn.getInputStream(), RequestSignatureResponse.class);
			return response.getEnvelopeId();
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
	public String requestSignatureFromDocuments(RequestSignatureFromDocuments request, InputStream[] stream)
			throws MalformedURLException, IOException {
		
		// TODO: lastRequest is not properly logged here
		
		if( stream == null || stream.length == 0 )
			throw new IllegalArgumentException("You need to pass in at least one file");
		
		if( stream.length != request.getDocuments().size() )
			throw new IllegalArgumentException("The number of file bytes should be equal to the number of documents in the request. Got " + stream.length + " byte arrays, and " + request.getDocuments().size() + " file definitions.");

		HttpURLConnection conn  = null;

		try {
			// append "/envelopes" to the baseUrl and use in the request
			conn = getRestConnection(baseUrl + "/envelopes");
			ObjectMapper mapper = new ObjectMapper();
			String jsonBody = mapper.writeValueAsString(request);

			String startRequest = "\r\n\r\n--BOUNDARY\r\n" + 
			"Content-Type: application/json\r\n" + 
			"Content-Disposition: form-data\r\n" + 
			"\r\n" + jsonBody;

			// we break this up into two string since the PDF doc bytes go here and are not in string format.
			// see further below where we write to the outputstream...
			String endBoundary = "\r\n" + "--BOUNDARY--\r\n\r\n";

			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=BOUNDARY");

			// write the body of the request...
			DataOutputStream dos = new DataOutputStream( conn.getOutputStream() );
			dos.writeBytes(startRequest.toString()); 
			
			for( int i = 0; i < stream.length; ++i) {
				Document next = request.getDocuments().get(i);
				
				String contentType = next.getContentType();
				if(contentType == null){
					contentType = "application/pdf";
				}
				
				String boundary = "\r\n--BOUNDARY\r\n" + 	// opening boundary for next document
				"Content-Type: " + contentType + "\r\n" + 
				"Content-Disposition: file; filename=\"" + next.getName() + "\"; documentId=" + next.getDocumentId() + "\r\n" + 
				"\r\n";
				
				dos.writeBytes(boundary);
				
				byte[] buffer = new byte[1024];
				int len;
				while ((len = stream[i].read(buffer)) != -1) {
					dos.write(buffer, 0, len);
				}
			}
			
			dos.writeBytes(endBoundary); 
			dos.flush(); 
			dos.close();
			
			int status = conn.getResponseCode(); // triggers the request
			if( status != 201 )	// 201 = Created
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return "";
			}
			// Read the response
			RequestSignatureResponse response = mapper.readValue(conn.getInputStream(), RequestSignatureResponse.class);
			return response.getEnvelopeId();
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
	public String reqeustSignatureFromDocuments(RequestSignatureFromDocuments request, File[] files) throws MalformedURLException, IOException 
	{
		// Convert the files to input streams
		List<InputStream> streams = new ArrayList<InputStream>();
		for (int i=0; i<files.length; i++){
			streams.add(new FileInputStream(files[i]));
		}
		
		return requestSignatureFromDocuments(request, streams.toArray(new InputStream[streams.size()]));
	}

	
	/**
	 * You can use this function after login() to get a URL with an authenticated view
	 * into DocuSign.  It is useful for SSO-like functionality where your app
	 * authenticates DocuSign and then allows users to just get into their
	 * console with one click.
	 * @return URL to the authenticated DocuSign console.
	 * @throws IOException
	 */
	public String requestConsoleView() throws IOException {
		HttpURLConnection conn = null;
		
		// construct an outgoing xml request body
		lastRequest = "<consoleViewRequest xmlns=\"http://www.docusign.com/restapi\">" + 
				"<accountId>" + getAccountId() + "</accountId>" + 
				"</consoleViewRequest>";
		
		// append "/views/console" to the baseUrl and use in the request
		try {
			conn = getRestConnection(getBaseUrl() + "/views/console");

			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/xml");
			conn.setRequestProperty("Accept", "application/xml");
			conn.setRequestProperty("Content-Length", Integer.toString(lastRequest.length()));

			// write the body of the request...
			DataOutputStream dos = new DataOutputStream( conn.getOutputStream() );
			dos.writeBytes(lastRequest); dos.flush(); dos.close();
			int status = conn.getResponseCode();
			if( status != 201 )	// 201 = Created
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return "";
			}
			// Read the response
			String line;
			InputStreamReader isr = new InputStreamReader( extractAndSaveOutput(conn) );
			BufferedReader br = new BufferedReader(isr);
			StringBuilder response2 = new StringBuilder();
			while ( (line = br.readLine()) != null)
				response2.append(line);
			String token1 = "//*[1]/*[local-name()='url']";
			XPath xPath = XPathFactory.newInstance().newXPath();
			String viewUrl = xPath.evaluate(token1, new InputSource(new StringReader(response2.toString())));
			return viewUrl;
		} catch (ProtocolException e) {
			e.printStackTrace();
			return "";
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return "";
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
	/**
	 * Use this function to get an authenticated sending view.  This is useful
	 * if you have document or recipient information in your application but
	 * you want your users to review or finish defining the workflow before the
	 * envelope is sent out.
	 * @param envelopeId identifies pre-created envelope
	 * @param returnUrl is where the user is going to be sent once they are done sending
	 * @return a URL to the authenticated sending session
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public String requestSendingView(String envelopeId,  String returnUrl) throws MalformedURLException, IOException {
		HttpURLConnection conn = null;
		try 
		{
			lastRequest = "{\"returnUrl\": \"" + returnUrl + "\"}";

			conn = getRestConnection(getBaseUrl() + "/envelopes/" + envelopeId + "/views/sender");
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(lastRequest.length()));
			conn.setRequestProperty("Accept", "application/xml"); 

			// write the body of the request...
			DataOutputStream dos = new DataOutputStream( conn.getOutputStream() );
			dos.writeBytes(lastRequest); dos.flush(); dos.close();
			int status = conn.getResponseCode(); // triggers the request
			if( status != 201 )	// 201 = Created
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return "";
			}

			// Read the response
			String line;
			InputStreamReader isr = new InputStreamReader( extractAndSaveOutput(conn) );
			BufferedReader br = new BufferedReader(isr);
			StringBuilder response3 = new StringBuilder();
			while ( (line = br.readLine()) != null)
				response3.append(line);
			String token1 = "//*[1]/*[local-name()='url']";
			XPath xPath = XPathFactory.newInstance().newXPath();
			String viewUrl;
			try {
				viewUrl = xPath.evaluate(token1, new InputSource(new StringReader(response3.toString())));
			} catch (XPathExpressionException e) {
				e.printStackTrace();
				return "";
			}
			return viewUrl;
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
	/**
	 * If you sent documents and defined one of the recipients as "embedded", meaning
	 * you will be in charge of presenting the signing to that person you can use this function
	 * to get the authenticated URL to present.
	 * @param envelopeId is the envelope that you have previously created
	 * @param userName of the recipient who is going to be presented with signing
	 * @param email of the recipient who is going to be presented with signing
	 * @param clientUserId is your internal ID of the recipient who is going to be presented with signing
	 * @param returnUrl is where the recipient is going to be sent once they are done signing
	 * @param authenticationMethod is a way for you to flag how you authenticated this session.  This goes into the secure audit log.
	 * @return an authenticated URL that you can embedd in your application
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public String requestRecipientView(String envelopeId, String userName, String email, String clientUserId, String returnUrl, String authenticationMethod) throws MalformedURLException, IOException {
		HttpURLConnection conn = null;
		try 
		{

			lastRequest = "{\"authenticationMethod\": \"" + authenticationMethod 
			+ "\",\"email\": \"" + email 
			+ "\",\"returnUrl\": \"" + returnUrl 
			+ "\",\"userName\": \"" + userName 
			+ "\",\"clientUserId\": \"" + clientUserId + "\"}";


			conn = getRestConnection(getBaseUrl() + "/envelopes/" + envelopeId + "/views/recipient");
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(lastRequest.length()));
			conn.setRequestProperty("Accept", "application/xml"); 

			// write the body of the request...
			DataOutputStream dos = new DataOutputStream( conn.getOutputStream() );
			dos.writeBytes(lastRequest); dos.flush(); dos.close();
			int status = conn.getResponseCode(); // triggers the request
			if( status != 201 )	// 201 = Created
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return "";
			}

			// Read the response
			String line;
			InputStreamReader isr = new InputStreamReader( extractAndSaveOutput(conn) );
			BufferedReader br = new BufferedReader(isr);
			StringBuilder response3 = new StringBuilder();
			while ( (line = br.readLine()) != null)
				response3.append(line);
			String token1 = "//*[1]/*[local-name()='url']";
			XPath xPath = XPathFactory.newInstance().newXPath();
			String viewUrl;
			try {
				viewUrl = xPath.evaluate(token1, new InputSource(new StringReader(response3.toString())));
			} catch (XPathExpressionException e) {
				e.printStackTrace();
				return "";
			}
			return viewUrl;
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
		/**
	 * a way to get status of all envelopes
	 * @param accountId
	 * @param fromDate
	 * @param fromToStatus
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public StatusInformation requestStatusInformation(Date fromDate, String fromToStatus) throws MalformedURLException, IOException {
		String fromDateStr = new SimpleDateFormat("MM/dd/yyyy").format(fromDate);
		String envelopeUrl = baseUrl + "/envelopes?from_date=" + URLEncoder.encode(fromDateStr, "UTF-8") + "&from_to_status=" + fromToStatus;
		HttpURLConnection conn = null;
		
		try {

			conn = getRestConnection(envelopeUrl);
			int status = conn.getResponseCode(); // triggers the request
			if( status != 200 )	// 200 = OK
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return null;
			}

			BufferedInputStream bufferStream = extractAndSaveOutput(conn);
			
			ObjectMapper mapper = new ObjectMapper();
			StatusInformation statusInformation = mapper.readValue( bufferStream, StatusInformation.class );
			
			return statusInformation;
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
	
	/**
	 * a way to get envelope properties such as status, date signed and many more
	 * @param envelopeId is the identifier of the envelope you are interested in
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public EnvelopeInformation requestEnvelopeInformation(String envelopeId) throws MalformedURLException, IOException {
		String envelopeUrl = baseUrl + "/envelopes/" + envelopeId;
		HttpURLConnection conn = null;
		
		try {

			conn = getRestConnection(envelopeUrl);
			int status = conn.getResponseCode(); // triggers the request
			if( status != 200 )	// 200 = OK
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return null;
			}

			BufferedInputStream bufferStream = extractAndSaveOutput(conn);
			
			ObjectMapper mapper = new ObjectMapper();
			EnvelopeInformation envelopeInformation = mapper.readValue( bufferStream, EnvelopeInformation.class );
			
			return envelopeInformation;
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}
	
	/**
	 * this function will get you a combined document of all the the files in an envelope that were sent out together
	 * @param envelopeId is the identifier of the envelope you'd like to get a copy of
	 * @param output stream that you can write out to a location of your choice
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public void requestCombinedDocument(String envelopeId, OutputStream stream ) throws MalformedURLException, IOException {
		String envelopeUrl = baseUrl + "/envelopes/" + envelopeId + "/documents/combined";
		HttpURLConnection conn = null;
		
		try 
		{
			conn = getRestConnection(envelopeUrl);
			conn.setRequestProperty("Accept", "application/pdf");
			int status = conn.getResponseCode();
			if( status != 200 )	// 200 = OK
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
			} else {
				IOUtils.copy(conn.getInputStream(), stream);				
			}
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}

	/**
	 * call this function to get the status and information of the recipients
	 * in an envelope.  You can get the information like whether or not they signed
	 * the envelope and also the data fields they sent out.
	 * @param envelopeId
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public RecipientInformation requestRecipientInformation(String envelopeId) throws MalformedURLException, IOException 
	{
		String envelopeUrl = baseUrl + "/envelopes/" + envelopeId + "/recipients";
		HttpURLConnection conn = null;
		
		try 
		{
			conn = getRestConnection(envelopeUrl);
			int status = conn.getResponseCode(); // triggers the request
			if( status != 200 )	// 200 = OK
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return null;
			}

			BufferedInputStream bufferStream = extractAndSaveOutput(conn);
			ObjectMapper mapper = new ObjectMapper();
			RecipientInformation info = mapper.readValue( bufferStream, RecipientInformation.class );
			return info;
		}
		finally
		{
			if( conn != null )
				conn.disconnect();
		}
	}

	/**
	 * you can call this function to get a HTTP connection
	 * which you can then use to make other REST calls that don't have wrappers in this class
	 * @param url
	 * @return
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public HttpURLConnection getRestConnection(String url) throws IOException, MalformedURLException {
		HttpURLConnection conn;
		conn = (HttpURLConnection)new URL(url).openConnection();
		if(this.accessToken != null){
			conn.setRequestProperty("Authorization", "bearer "+this.accessToken);
		}else{
			conn.setRequestProperty("X-DocuSign-Authentication", getAuthHeader());
		}
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Accept", "application/json");
		conn.setDoOutput(true);
		
		return conn;
	}
	
	public String getLastError(){
		return lastError;
	}
	
	public void setLastError(String str){
		String lastError = str;
	}

	private String getErrorDetails(HttpURLConnection conn) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( conn.getErrorStream()));
		StringBuilder responseText = new StringBuilder();
		String line = null;
		while ( (line = br.readLine()) != null)
			responseText.append(line);
		lastError = responseText.toString();
		return lastError;
	}
	
	private BufferedInputStream extractAndSaveOutput(HttpURLConnection conn) throws IOException {
		BufferedInputStream bufferStream = new BufferedInputStream(conn.getInputStream(), 1024*1024);
		bufferStream.mark(0);
		BufferedReader br = new BufferedReader( new InputStreamReader( bufferStream ) );
		String line = null;
		StringBuilder responseText = new StringBuilder();
		while ( (line = br.readLine()) != null)
			responseText.append(line);

		lastResponse = responseText.toString();
		bufferStream.reset();
		return bufferStream;
	}
	
	public String getAuthHeader() {
		String authenticateStr = 
			"<DocuSignCredentials>" + 
			"<Username>" + email + "</Username>" +
			"<Password>" + password + "</Password>" + 
			"<IntegratorKey>" + integratorKey + "</IntegratorKey>" + 
			"</DocuSignCredentials>";
		return authenticateStr;
	}

	//
	// getters and setters
	// 
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId() {
		return accountId;
	}
	
	public String getIntegratorKey() {
		return integratorKey;
	}
	
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	public String getServerUrl() {
		return serverUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getBaseUrl() {
		return baseUrl;
	}
	
	public String getLastResponseText() {
		return lastResponse;
	}
	
	public String getLastRequestText() {
		return lastRequest;
	}
	
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * you can call this after calling login to see if other accounts have been returned
	 * @return the list of accounts that were retrieved
	 */
	public List<LoginAccount> getLoginAccounts() {
		return this.loginAccounts;
	}


}
