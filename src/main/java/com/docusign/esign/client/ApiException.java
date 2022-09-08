

package com.docusign.esign.client;

import java.util.Map;
import java.util.List;



/**
 * ApiException class.
 */
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

   /**
    * ApiException constructor.
    */
    public ApiException() {}

   /**
    * ApiException constructor.
    *
    * @param throwable The Throwable type
    */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

   /**
    * ApiException constructor.
    *
    * @param message The string message
    */
    public ApiException(String message) {
        super(message);
    }

   /**
    * ApiException constructor.
    *
    * @param message The string message
    * @param throwable The Throwable type
    * @param code The error code
    * @param responseHeaders The response headers
    * @param responseBody The body of response
    */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

   /**
    * ApiException constructor.
    *
    * @param message The string message
    * @param code The error code
    * @param responseHeaders The response headers
    * @param responseBody The body of response
    */
    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

   /**
    * ApiException constructor.
    *
    * @param message The string message
    * @param throwable The Throwable type
    * @param code The error code
    * @param responseHeaders The response headers
    */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

   /**
    * ApiException constructor.
    *
    * @param code The error code
    * @param responseHeaders The response headers
    * @param responseBody The body of response
    */
    public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

   /**
    * ApiException constructor.
    *
    * @param code The error code
    * @param message The string message
    */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

   /**
    * ApiException constructor.
    *
    * @param code The error code
    * @param message The string message
    * @param responseHeaders The response headers
    * @param responseBody The body of response
    */
    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }
}
