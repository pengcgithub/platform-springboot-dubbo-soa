package com.platform.soa.web.config.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultMessage {
	boolean success = true;
	String code;
	String message;
	Object data;
}
