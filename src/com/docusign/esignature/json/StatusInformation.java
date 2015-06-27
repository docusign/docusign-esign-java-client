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
 
package com.docusign.esignature.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "resultSetSize",
    "totalSetSize",
    "startPosition",
    "endPosition",
    "nextUri",
    "previousUri",
    "envelopes"
})
public class StatusInformation {

    @JsonProperty("resultSetSize")
    private String resultSetSize;
    @JsonProperty("totalSetSize")
    private String totalSetSize;
    @JsonProperty("startPosition")
    private String startPosition;
    @JsonProperty("endPosition")
    private String endPosition;
    @JsonProperty("nextUri")
    private String nextUri;
    @JsonProperty("previousUri")
    private String previousUri;
    @JsonProperty("envelopes")
    private List<EnvelopeInformation> envelopes = new ArrayList<EnvelopeInformation>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getResultSetSize() {
		return resultSetSize;
	}

	public void setResultSetSize(String resultSetSize) {
		this.resultSetSize = resultSetSize;
	}

	public String getTotalSetSize() {
		return totalSetSize;
	}

	public void setTotalSetSize(String totalSetSize) {
		this.totalSetSize = totalSetSize;
	}

	public String getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}

	public String getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(String endPosition) {
		this.endPosition = endPosition;
	}

	public String getNextUri() {
		return nextUri;
	}

	public void setNextUri(String nextUri) {
		this.nextUri = nextUri;
	}

	public String getPreviousUri() {
		return previousUri;
	}

	public void setPreviousUri(String previousUri) {
		this.previousUri = previousUri;
	}

	public List<EnvelopeInformation> getEnvelopes() {
		return envelopes;
	}

	public void setEnvelopes(List<EnvelopeInformation> envelopes) {
		this.envelopes = envelopes;
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
