package com.inertia.solutions.force.service.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.inertia.solutions.force.client.SalesforceClient;
import com.inertia.solutions.force.service.SalesforceService;

/**
 * The Class SalesforceServiceImpl.
 */
@Service
public class SalesforceServiceImpl implements SalesforceService {

	@Autowired
	SalesforceClient client;

	@Value("${client.client.id}")
	String clientId;

	@Value("${client.username}")
	String userName;

	@Value("${client.user.token}")
	String token;

	@Value("${client.login.uri}")
	String loginUri;

	@Value("${client.secret}")
	String secret;

	public void openConnection() throws HttpException, IOException {
		this.client.initiateAuth(token, clientId, userName, secret, loginUri);
	}
	
	public void closeConnection() {
		client.destroyClient();
	}

}
