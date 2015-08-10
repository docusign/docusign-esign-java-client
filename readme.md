DocuSign eSign Java Client Library
================================
Designed and developed by @mikebz

This is a client library to help you get started with DocuSign eSignature API.
To get started with using this library go to http://www.docusign.com/devcenter and get
a free development account.  After you get an account and an Integrator Key (App Key) 
you will be able to make test web service calls.

You can use eclipse to get going with it or potentially copy the src files somewhere
else.

The JSON parsing is based on the Jackson library.  To see examples of how the library
can be used for most frequently used scenarios just look in the test directory.  The unit
tests showcase the most frequent usage scenarios.
 
NOTE: it does not and will not have the full functionality of the DocuSign service.
Feel free to update the proxy classes yourself and contribute functions.
Alternatively you can get the raw HTTP connection and send over your own JSON.
For full functionality and documentation visit www.docusign.com/devcenter and iodocs.docusign.com


Important Terms
-------------------------

`Integrator Key`: Identifies a single integration. Every API 
request includes the Integrator Key and a 
username/password combination

`Envelope`: Just like a normal Postal Envelope.It contains 
things like Documents, Recipients, and Tabs

`Document`: The PDF, Doc, Image, or other item you want 
signed. If it is not a PDF, you must include the File 
Extension in the API call

`Tab`: Tied to a position on a Document and defines what 
happens there. For example, you have a SignHere Tab 
wherever you want a Recipient to sign

`Recipient`: The person you want to send the Envelope 
to. Requires a UserName and Email

`Captive Recipient`: Recipient signs in an iframe on your 
website instead of receving an email 

`PowerForm`: A pre-created Envelope that you can launch
instead of writing server-side code


Sample Usage
-------------------------

To authenticate a given user against DocuSign's API service make the Login API call: 

**Login**

To authenticate a given user's credentials against the API and retrieve your baseUrl cal the Login API.  NOTE: You only need to login users who wish to create and send signature request... signing is always free and signers do not need their own DocuSign account.

    import com.docusign.esignature.*;
    import com.docusign.esignature.json*;
    
    // Instantiate a new DocuSignClient 
    DocuSignClient dsClient = new DocuSignClient("username", "password", "integratorKey");

    // make the Login API call (boolean return value)
    if( dsClient.login() )
    {
        // getLastResponseText() will print most recent API response text to stdout
        System.out.println( dsClient.getLastResponseText() );
    }

**Request Signature On A Document**

The following code will request a signature on a document.  This simple example creates an Envelope with one recipient, one document, and one signature tab on that document for the recipient to sign.  The recipient receives an email to initiate the signing flow.  

    // Create new signature request object
    RequestSignatureFromDocuments request = new RequestSignatureFromDocuments();
    
    // create one recipient of type signer
    Signer signer = new Signer();
    signer.setEmail("RECIPIENT_EMAIL");
    signer.setName("RECIPIENT_NAME");
    signer.setRecipientId("1");
    List signers = Arrays.asList(signer);
    Recipients recipients = new Recipients();
    recipients.setSigners(signers);
    
    // place signature tab 100 pixels right and 150 pixels down from top left of page
    SignHereTab tab1 = new SignHereTab();
    tab1.setDocumentId("1"); 
    tab1.setPageNumber("1");
    tab1.setXPosition("100");
    tab1.setYPosition("150");		
    List<SignHereTab> signatureTabs = Arrays.asList(tab1);
    
    // assign the tab to the signer
    Tabs tabs = new Tabs();
    tabs.setSignHereTabs(signatureTabs);
    signer.setTabs(tabs);
    
    // set document info
    Document document = new Document();
    document.setName("TEST.PDF");
    document.setDocumentId("1");
    List documents = Arrays.asList(document);

    // configure the signature request object
    request.setRecipients(recipients);
    request.setDocuments(documents);
    request.setEmailSubject("EMAIL_SUBJECT");

    // "sent" to send request immediately, "created" to save as draft
    request.setStatus("sent");	

    File testFile = new File("/PATH/TO/DOCUMENT/TEST.PDF");
    File[] files = new File[]{testFile};

    //*** Create & send the envelope
    String envelopeId = dsClient.requestSignatureFromDocuments(request, files);
    

**Signature Request from a Template**

To request a signature from a template in your account use the following code.  With templates you can add documents, recipient roles, tabs and other workflow at design-time then when ready request a signature from that server template to any recipient(s).  Assigning a recipient to a template role in turn makes them inherit all the previously configured workflow, tabs, etc that you created at design-time. 

    // create a new |RequestSignatureFromTemplate| object
    RequestSignatureFromTemplate req = new RequestSignatureFromTemplate();
    
    // email subject and template ID are required properties, many others available
    req.setEmailSubject("Sent from a Template");
    req.setTemplateId("Template ID goes here");
    
    // create a |TemplateRole| object and assign values 
    TemplateRole tRole = new TemplateRole();
    tRole.setEmail("recipientEmail@docusign.com");
    tRole.setName("John Doe");
    tRole.setRoleName("Template role name goes here");
    
    // TemplateRoles property takes a list of template roles
    List<TemplateRole> list = new ArrayList<TemplateRole>();
    
    // add our template role to the list and assign to the request
    list.add(tRole);    
    req.setTemplateRoles(list);
    
    // "sent" to immediately send the signature request, "created" to save as draft
    req.setStatus("sent");
    
    // make the signature request from template API call
    dsClient.requestSignatureFromTemplate(req);


System Requirements
-------------------------

Latest version this client was tested with: Eclipse 4.3 JDK 1.7

Dependencies are `jackson-core`, `jackson-annotations`, and `jackson-databind` from FasterXML and `lang` by Apache Commons. You can download the 4 needed JARs or open source through the following links:

+ https://github.com/FasterXML/jackson-annotations/wiki
+ https://github.com/FasterXML/jackson-core/wiki
+ https://github.com/FasterXML/jackson-databind/wiki
+ https://commons.apache.org/proper/commons-lang/

Tested against jackson 2.5, lang 3.4


Rate Limits
-------------------------

Please note: Applications are not allowed to poll for envelope status more
than once every 15 minutes and we discourage integrators from continuously
retrieving status on envelopes that are in a terminal state (Completed, 
Declined, and Voided).  Excessive polling will result in your API access 
being revoked.  
If you need immediate notification of envelope events we encourage you to 
review envelope events or use our Connect Publisher technology, DocuSign 
Connect as an alternative.

More Information
-------------------------

Professional Services is also available to help define and implement your
project fast. 

You can also find a lot of answered questions on StackOverflow by going here:
http://stackoverflow.com/questions/tagged/docusignapi
