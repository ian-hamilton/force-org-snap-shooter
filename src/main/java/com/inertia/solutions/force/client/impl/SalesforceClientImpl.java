package com.inertia.solutions.force.client.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.inertia.solutions.force.beans.SOContainer;
import com.inertia.solutions.force.beans.SalesforceOAuthBean;
import com.inertia.solutions.force.client.SalesforceClient;

@Component
public class SalesforceClientImpl implements SalesforceClient {
	private static Logger log = Logger.getLogger(SalesforceClientImpl.class);
	
	private final static String GET_SO_OBJECT = "/services/data/v26.0/sobjects/";
	
	
	public SalesforceOAuthBean initiateAuth(String token, String clientId, String userName, String secret,
			String logintUri) throws HttpException, IOException {
		
		PostMethod method = new PostMethod(logintUri);
		
		StringBuilder content = new StringBuilder();
		content.append("grant_type=password");
		content.append("&client_id=" + clientId);
		content.append("&client_secret=" + secret);
		content.append("&username=" + userName);
		content.append("&password=" + token);

		method.setRequestEntity(new StringRequestEntity(content.toString(), "text/plain", "UTF-8"));
		method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

		HttpClient client = new HttpClient();
		client.executeMethod(method);
		String response = method.getResponseBodyAsString();
		method.releaseConnection();	
		return new Gson().fromJson(response, SalesforceOAuthBean.class);
		
	}

	public SOContainer getListOfObjects(SalesforceOAuthBean authBean) throws HttpException, IOException {

		HttpClient httpclient = new HttpClient();
		GetMethod gm = new GetMethod(authBean.getInstance_url() + GET_SO_OBJECT);

		gm.setRequestHeader("Authorization", "Bearer " + authBean.getAccess_token());

		httpclient.executeMethod(gm);
//		log.debug("RESPONSE -> " + gm.getResponseBodyAsString());
		return new Gson().fromJson(gm.getResponseBodyAsString(), SOContainer.class);
		
	}
	
	public String getAllObjectsOfType(SalesforceOAuthBean authBean, String objectUri) throws HttpException, IOException {
		HttpClient httpclient = new HttpClient();
		GetMethod gm = new GetMethod(authBean.getInstance_url() + objectUri);

		gm.setRequestHeader("Authorization", "Bearer " + authBean.getAccess_token());

		httpclient.executeMethod(gm);
//		log.debug("RESPONSE -> " + gm.getResponseBodyAsString());
		return gm.getResponseBodyAsString();
	}

}
