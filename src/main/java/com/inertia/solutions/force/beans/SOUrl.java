package com.inertia.solutions.force.beans;

import java.io.Serializable;

public class SOUrl implements Serializable {
	private static final long serialVersionUID = 4814416239246990898L;
	
	private String sobject;
	
	private String describe;
	
	private String rowTemplate;

	public String getSobject() {
		return sobject;
	}

	public void setSobject(String sobject) {
		this.sobject = sobject;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getRowTemplate() {
		return rowTemplate;
	}

	public void setRowTemplate(String rowTemplate) {
		this.rowTemplate = rowTemplate;
	}

}
