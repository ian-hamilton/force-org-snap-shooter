/**
 * 
 */
package com.inertia.solutions.force.client;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import com.inertia.solutions.force.beans.SOContainer;
import com.inertia.solutions.force.beans.SalesforceOAuthBean;

/**
 * @author devl
 *
 */
public interface SalesforceClient {

	SalesforceOAuthBean initiateAuth(String token, String clientId, String username, String secret, String loginUri)
			throws HttpException, IOException ;
	
	SOContainer getListOfObjects(SalesforceOAuthBean authBean) throws HttpException, IOException;
	
	String getAllObjectsOfType(SalesforceOAuthBean authBean, String objectUri) throws HttpException, IOException;
	
}
