package com.ocms.studentregistration;

public enum RegistrationMemo {

	SALE("Sale"), TRANSFER("Transfer"), ADJUSTMENT("Adjustment"), PAYMENT("Payment");
	
	private String memo;
	
	private RegistrationMemo(String memo) {
		this.memo = memo;
	}
	
	public String getMemo() {
		return memo;
	}
}