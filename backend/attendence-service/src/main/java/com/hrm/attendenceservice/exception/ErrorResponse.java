package com.hrm.attendenceservice.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
	private LocalDateTime timestamp;
	private int status;
	private String error;
	private String message;
	private String details;
	private String traceId;

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(LocalDateTime timestamp, int status, String error, String message, String details,
			String traceId) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.details = details;
		this.traceId = traceId;
	}

	public LocalDateTime getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String toString() {
		return "ErrorResponse [timestamp=" + this.timestamp + ", status=" + this.status + ", error=" + this.error
				+ ", message=" + this.message + ", details=" + this.details + ", traceId=" + this.traceId + "]";
	}

}
