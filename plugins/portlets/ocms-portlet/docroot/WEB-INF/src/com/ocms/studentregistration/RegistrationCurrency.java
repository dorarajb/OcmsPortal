package com.ocms.studentregistration;

public enum RegistrationCurrency {
	USD("USD"), GBP("GBP"), EURO("EURO");
	
	private String currency;
	
	private RegistrationCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getCurrency() {
		return currency;
	}
}
