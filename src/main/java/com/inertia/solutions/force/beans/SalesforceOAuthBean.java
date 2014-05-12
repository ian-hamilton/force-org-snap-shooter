package com.inertia.solutions.force.beans;

import java.io.Serializable;

public class SalesforceOAuthBean implements Serializable{
	private static final long serialVersionUID = 6722473606928168382L;

	private String id;
	
	private String issued_at;
	
	private String token_type;
	
	private String instance_url;
	
	private String signature;
	
	private String access_token;

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "SalesforceOAuthBean [id=" + id + ", issued_at=" + issued_at
				+ ", token_type=" + token_type + ", instance_url="
				+ instance_url + ", signature=" + signature + ", access_token="
				+ access_token + "]";
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIssued_at() {
		return issued_at;
	}

	public void setIssued_at(String issued_at) {
		this.issued_at = issued_at;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getInstance_url() {
		return instance_url;
	}

	public void setInstance_url(String instance_url) {
		this.instance_url = instance_url;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	
}
