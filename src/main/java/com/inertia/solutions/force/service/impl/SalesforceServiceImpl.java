package com.inertia.solutions.force.service.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.inertia.solutions.force.beans.SOContainer;
import com.inertia.solutions.force.beans.SObject;
import com.inertia.solutions.force.beans.SalesforceOAuthBean;
import com.inertia.solutions.force.client.SalesforceClient;
import com.inertia.solutions.force.service.SalesforceService;

/**
 * The Class SalesforceServiceImpl.
 */
@Service
public class SalesforceServiceImpl implements SalesforceService {
	private static Logger log = Logger.getLogger(SalesforceServiceImpl.class);

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
		SalesforceOAuthBean bean = this.client.initiateAuth(token, clientId, userName, secret, loginUri);
		log.debug(bean.toString());
		SOContainer test = this.client.getListOfObjects(bean);
		log.debug("Number of SOObject ---> " + test.getSobjects().length + " <------------");
		for(SObject so : test.getSobjects()) {
			log.debug(so.getName());
		}
		
		String objectResult = this.client.getAllObjectsOfType(bean, test.getSobjects()[0].getUrls().getSobject());
		
		log.debug(objectResult);
		
	}	

}
