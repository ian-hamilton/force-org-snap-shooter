/**
 * 
 */
package com.inertia.solutions.force.client;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

/**
 * @author devl
 *
 */
public interface SalesforceClient {

	public void initiateAuth(String token, String clientId, String username, String secret, String loginUri)
			throws HttpException, IOException ;
	
	public void destroyClient();
	
}
