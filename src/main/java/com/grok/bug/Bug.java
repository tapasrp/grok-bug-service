package com.grok.bug;


public class Bug {
	
	private String name;
	private String severity;
	
	
	public Bug(String name, String severity) {
		super();
		this.name = name;
		this.severity = severity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	

}
