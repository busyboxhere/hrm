package com.hrm.attendenceservice.dto;

import java.time.LocalDateTime;

import com.hrm.attendenceservice.entity.EventType;

public class AttendanceDetailsDTO {

	private String employeeId;
	private EventType eventType;
	private LocalDateTime eventTimeStamp;
	private String remarks;

	public AttendanceDetailsDTO() {
		super();
	}

	public AttendanceDetailsDTO(String employeeId, EventType eventType, LocalDateTime eventTimeStamp, String remarks) {
		super();
		this.employeeId = employeeId;

		this.eventType = eventType;
		this.eventTimeStamp = eventTimeStamp;

		this.remarks = remarks;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public EventType getEventType() {
		return this.eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
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
		return "AttendanceDetailsDTO [employeeId=" + this.employeeId + ", eventType=" + this.eventType
				+ ", eventTimeStamp=" + this.eventTimeStamp + ", remarks=" + this.remarks + "]";
	}

}
