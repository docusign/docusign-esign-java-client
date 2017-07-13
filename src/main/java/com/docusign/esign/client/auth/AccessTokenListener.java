package com.docusign.esign.client.auth;

import org.apache.oltu.oauth2.common.token.BasicOAuthToken;

public interface AccessTokenListener {
  void notify(BasicOAuthToken token);
}