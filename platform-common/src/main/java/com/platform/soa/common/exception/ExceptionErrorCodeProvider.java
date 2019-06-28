package com.platform.soa.common.exception;

public interface ExceptionErrorCodeProvider extends ErrorCoded {
	boolean support(Exception e);
}
