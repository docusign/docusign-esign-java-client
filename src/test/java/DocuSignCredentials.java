/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author mike.roseleip
 */
public class DocuSignCredentials {
    
    private String Username = null;
    
    private String Password = null;
    
    private String IntegratorKey = null;
    
    
    public DocuSignCredentials() {}
    
    public DocuSignCredentials(String userName, String password, String integratorKey) {
        Username = userName;
        Password = password;
        IntegratorKey = integratorKey;
        
    }
    

    @JsonProperty("Username")
    public String getUsername() {
        return Username;
    }
    
    public void setUsername(String userName) {
        Username = userName;
    }
    
    @JsonProperty("Password")
    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String password) {
        Password = password;
    }
    
    @JsonProperty("IntegratorKey")
    public String getIntegratorKey() {
        return IntegratorKey;
    }
    
    public void setIntegratorKey(String integratorKey) {
        IntegratorKey = integratorKey;
    }
    
    
}
