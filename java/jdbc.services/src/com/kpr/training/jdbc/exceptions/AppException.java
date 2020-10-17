package com.kpr.training.jdbc.exceptions;

public class AppException extends Exception {
	
	private static final long serialVersionUID = -1307493420921168255L;
	private int errorCode;
	private String errorMessage;

	public AppException(ExceptionCode code) {
		this.errorMessage = code.getErrorMessage();
		this.errorCode = code.getId();
		System.out.println(this.errorCode + ": " + this.errorMessage);
	}
	
	public AppException(ExceptionCode code, String message) {
		this.errorMessage = message;
		this.errorCode = code.getId();
		System.out.println(this.errorCode + ": " + this.errorMessage);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
