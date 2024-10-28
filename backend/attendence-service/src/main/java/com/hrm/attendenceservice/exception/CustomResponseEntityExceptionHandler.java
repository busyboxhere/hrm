package com.hrm.attendenceservice.exception;

import java.time.LocalDateTime;
import java.util.UUID;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * 
 */
@ControllerAdvice
public class CustomResponseEntityExceptionHandler {


	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex, WebRequest request) {

		ErrorResponse errorResponse = new ErrorResponse();

		errorResponse.setTimestamp(LocalDateTime.now());
		errorResponse.setStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR);
		errorResponse.setError("Internal Server Error");
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setDetails(request.getDescription(true));
		errorResponse.setTraceId(UUID.randomUUID().toString());

		return new ResponseEntity<ErrorResponse>(errorResponse,
				HttpStatusCode.valueOf(HttpStatus.SC_INTERNAL_SERVER_ERROR));
	}

}
