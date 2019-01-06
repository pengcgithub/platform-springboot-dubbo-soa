package com.platform.soa.user.config.exception;


public abstract class ApiException extends RuntimeException implements ErrorCoded {

	public static final String DEFAULT_ERROR_CODE = "serverEx";

	private Object[] args;

	public ApiException(Object... args) {
		this.args = args;
	}

	public Object[] getArgs() {
		return args;
	}

	@Override
	public String getMessage() {
		String customMessage = getCustomMessage();
		return customMessage == null ? super.getMessage() : customMessage;
	}

	protected String getCustomMessage() {
		return null;
	}

}
