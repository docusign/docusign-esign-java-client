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


System Requirements
-------------------------

The client library was tested with 
Eclipse 3.2
JDK 1.6

It could very well be that your version of IDE and Java will work
without modifications, but there is a reason why this library
is provided without warranty of any kind.


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

To authenticate a given user against DocuSign's API service make the **Login API** call: 

    // Instantiate a new DocuSignClient 
    DocuSignClient dsClient = new DocuSignClient("username", "password", "integratorKey");

    // make the Login API call (boolean return value)
    if( dsClient.login() )
    {
        // getLastResponseText() will print most recent API response text to stdout
        System.out.println( dsClient.getLastResponseText() );
    }

To create a signature request from a template:

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
