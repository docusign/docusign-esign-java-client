

package com.docusign.esign.client.auth;

import com.docusign.esign.client.Pair;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

import java.util.Map;
import java.util.List;




/**
 * HttpBasicAuth class.
 *
 */
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

 /**
  * getUsername method.
  *
  * @return String
  */
  public String getUsername() {
    return username;
  }

 /**
  * setUsername method.
  *
  * @param username Sets username
  */
  public void setUsername(String username) {
    this.username = username;
  }

 /**
  * getPassword method.
  *
  * @return String
  */
  public String getPassword() {
    return password;
  }

 /**
  * setPassword method.
  *
  * @param password Sets password
  */
  public void setPassword(String password) {
    this.password = password;
  }

 /**
  * applyToParams method.
  *
  * @param queryParams The query params
  * @param headerParams The header params
  */
  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    headerParams.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8)));
  }
}
