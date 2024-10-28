package com.hrm.attendenceservice.dto;

import java.time.LocalDateTime;

public class PunchDetailsDTO {

	private String employeeId;
	private LocalDateTime eventTimeStamp;
	private String remarks;

	public PunchDetailsDTO() {
		super();
	}

	public PunchDetailsDTO(String employeeId, LocalDateTime eventTimeStamp, String remarks) {
		super();
		this.employeeId = employeeId;
		this.eventTimeStamp = eventTimeStamp;
		this.remarks = remarks;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public LocalDateTime getEventTimeStamp() {
		return this.eventTimeStamp;
	}

	public void setEventTimeStamp(LocalDateTime eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AttendanceDetailsDTO [employeeId=" + this.employeeId + ", eventTimeStamp=" + this.eventTimeStamp
				+ ", remarks=" + this.remarks + "]";
	}

}
