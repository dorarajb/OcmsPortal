package com.ocms.studentregistration;

public enum RegistrationAutoCharge {
	AUTOCHARGE("Auto Charge"), CALL("Call"), OTHER("Other");
	
	private String autoCharge;
	
	private RegistrationAutoCharge(String autoCharge) {
		this.autoCharge = autoCharge;
	}
	
	public String getAutoCharge() {
		return autoCharge;
	}
}
