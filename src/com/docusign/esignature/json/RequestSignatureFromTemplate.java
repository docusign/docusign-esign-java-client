
package com.docusign.esignature.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "emailSubject",
    "emailBlurb",
    "templateId",
    "templateRoles",
    "status"
})
public class RequestSignatureFromTemplate {

    @JsonProperty("emailSubject")
    private String emailSubject;
    @JsonProperty("emailBlurb")
    private String emailBlurb;
    @JsonProperty("templateId")
    private String templateId;
    @JsonProperty("templateRoles")
    private List<TemplateRole> templateRoles = new ArrayList<TemplateRole>();
    @JsonProperty("status")
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("emailSubject")
    public String getEmailSubject() {
        return emailSubject;
    }

    @JsonProperty("emailSubject")
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public RequestSignatureFromTemplate withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    @JsonProperty("emailBlurb")
    public String getEmailBlurb() {
        return emailBlurb;
    }

    @JsonProperty("emailBlurb")
    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    public RequestSignatureFromTemplate withEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
        return this;
    }

    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public RequestSignatureFromTemplate withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    @JsonProperty("templateRoles")
    public List<TemplateRole> getTemplateRoles() {
        return templateRoles;
    }

    @JsonProperty("templateRoles")
    public void setTemplateRoles(List<TemplateRole> templateRoles) {
        this.templateRoles = templateRoles;
    }

    public RequestSignatureFromTemplate withTemplateRoles(List<TemplateRole> templateRoles) {
        this.templateRoles = templateRoles;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public RequestSignatureFromTemplate withStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
