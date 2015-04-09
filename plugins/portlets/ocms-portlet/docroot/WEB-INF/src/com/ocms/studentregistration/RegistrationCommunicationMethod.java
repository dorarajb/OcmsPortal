package com.ocms.studentregistration;

public enum RegistrationCommunicationMethod {
	TELEPHONE("Telephone"), FAX("Fax"), EMAIL("Email"), WEBSITE("Website"), VOICEMAIL("Voice Mail"), INPERSON("In Person"), ATCOURSE("At Course");
	
	private String method;
	
	private RegistrationCommunicationMethod(String method) {
		this.method = method;
	}
	
	public String getMethod() {
		return method;
	}
}
