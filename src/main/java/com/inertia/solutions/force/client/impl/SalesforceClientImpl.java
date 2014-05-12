package com.inertia.solutions.force.client.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.springframework.stereotype.Component;

import com.inertia.solutions.force.client.SalesforceClient;

@Component
public class SalesforceClientImpl implements SalesforceClient {
	
	HttpClient client;
	PostMethod method;

	public void initiateAuth(String token, String clientId, String userName, String secret,
			String logintUri) throws HttpException, IOException {
		
		method = new PostMethod(logintUri);
		
		StringBuilder content = new StringBuilder();
		content.append("grant_type=password");
		content.append("&client_id=" + clientId);
		content.append("&client_secret=" + secret);
		content.append("&username=" + userName);
		content.append("&password=" + token);

		method.setRequestEntity(new StringRequestEntity(content.toString(), "text/plain", "UTF-8"));
		method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

		client = new HttpClient();
		client.executeMethod(method);
		
	}

	public void destroyClient() {
		method.releaseConnection();		
	}

}
