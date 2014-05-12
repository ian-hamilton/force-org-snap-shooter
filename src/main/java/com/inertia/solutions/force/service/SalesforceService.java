/**
 * 
 */
package com.inertia.solutions.force.service;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;


/**
 * The Interface SalesforceService.
 */
public interface SalesforceService {

	/**
	 * Open connection.
	 * @throws IOException 
	 * @throws HttpException 
	 */
	public void openConnection() throws HttpException, IOException;
	
}
