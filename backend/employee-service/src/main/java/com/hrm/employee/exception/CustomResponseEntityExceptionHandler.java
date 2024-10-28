package com.hrm.employee.exception;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Custom exception handler for the HRM application.
 */
@ControllerAdvice
public class CustomResponseEntityExceptionHandler {

	private ResponseEntity<ErrorResponse> buildResponseEntity(HttpStatus status, String message, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setTimestamp(LocalDateTime.now());
		errorResponse.setStatus(status.value());
		errorResponse.setError(status.getReasonPhrase());
		errorResponse.setMessage(message);
		errorResponse.setDetails(request.getDescription(true));
		errorResponse.setTraceId(UUID.randomUUID().toString());

		return new ResponseEntity<>(errorResponse, status);
	}

	@ExceptionHandler(InvalidEmployeeDataException.class)
	protected ResponseEntity<ErrorResponse> handleInvalidEmployeeDataException(InvalidEmployeeDataException ex,
			WebRequest request) {
		return buildResponseEntity(HttpStatus.BAD_REQUEST, ex.getMessage(), request);
	}

	@ExceptionHandler(DuplicateEmployeeException.class)
	protected ResponseEntity<ErrorResponse> handleDuplicateEmployeeException(DuplicateEmployeeException ex,
			WebRequest request) {
		return buildResponseEntity(HttpStatus.CONFLICT, ex.getMessage(), request);
	}

	@ExceptionHandler(EmployeeNotFoundException.class)
	protected ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException ex,
			WebRequest request) {
		ex.printStackTrace();
		return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage(), request);
	}

	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex, WebRequest request) {
		return buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), request);
	}
}
