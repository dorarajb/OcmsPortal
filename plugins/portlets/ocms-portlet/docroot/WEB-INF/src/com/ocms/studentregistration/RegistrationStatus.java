package com.ocms.studentregistration;

public enum RegistrationStatus {

	STUDENT("Student"), ASSISTANT("Assistant");
	
	private String status;
	
	private RegistrationStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}