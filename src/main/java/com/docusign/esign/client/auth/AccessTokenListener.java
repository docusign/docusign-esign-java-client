package com.docusign.esign.client.auth;

import com.docusign.esign.client.auth.OAuth.OAuthToken;

public interface AccessTokenListener {
  void notify(OAuthToken token);
}