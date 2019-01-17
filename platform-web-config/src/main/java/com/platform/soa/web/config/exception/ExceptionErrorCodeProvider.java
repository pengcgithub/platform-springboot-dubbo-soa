package com.platform.soa.web.config.exception;

public interface ExceptionErrorCodeProvider extends ErrorCoded {
	boolean support(Exception e);
}
