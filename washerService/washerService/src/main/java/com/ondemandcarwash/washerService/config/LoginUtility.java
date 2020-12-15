package com.ondemandcarwash.washerService.config;

public class LoginUtility {

	private String errorMessage;

	public LoginUtility(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
