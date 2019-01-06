package com.platform.soa.user.config.exception;

public interface ExceptionErrorCodeProvider extends ErrorCoded {
	boolean support(Exception e);
}
