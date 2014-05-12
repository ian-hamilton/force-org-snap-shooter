package com.inertia.solutions.force.beans;

import java.io.Serializable;

public class SOContainer implements Serializable {
	private static final long serialVersionUID = -5208044899803981621L;
	
	private String encoding;
	
	private String maxBatchSize;
	
	private SObject[] sobjects;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getMaxBatchSize() {
		return maxBatchSize;
	}

	public void setMaxBatchSize(String maxBatchSize) {
		this.maxBatchSize = maxBatchSize;
	}

	public SObject[] getSobjects() {
		return sobjects;
	}

	public void setSobjects(SObject[] sobjects) {
		this.sobjects = sobjects;
	}

}
