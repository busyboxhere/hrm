package com.hrm.attendenceservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class AttendanceDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotNull(message = "Event type cannot be blank")
	@Enumerated(EnumType.STRING)
	@Column(name = "event_type")
	private EventType eventType;

	@NotNull(message = "Event time cannot be null")
	@Column(name = "event_time_stamp")
	private LocalDateTime eventTimeStamp;

	@Min(value = 0, message = "Overtime hours cannot be negative")
	@Column(name = "overtime_hours")
	private int overTimeHours;

	@Size(max = 200, message = "Remarks should not exceed 200 characters")
	@Column(name = "remarks")
	private String remarks;

	public AttendanceDetails() {
		super();
	}

	public AttendanceDetails(EventType eventType, LocalDateTime eventTimeStamp, int overTimeHours, String remarks) {
		super();
		this.eventType = eventType;
		this.eventTimeStamp = eventTimeStamp;
		this.overTimeHours = overTimeHours;
		this.remarks = remarks;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getOverTimeHours() {
		return this.overTimeHours;
	}

	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
