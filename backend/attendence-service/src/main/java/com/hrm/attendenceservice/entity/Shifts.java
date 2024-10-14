package com.hrm.attendenceservice.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "shifts")
public class Shifts extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shift_id")
	private int shiftId;

	@NotNull(message = "Shift name cannot be null")
	@Size(min = 2, max = 50, message = "Shift name must be between 2 and 50 characters")
	@Column(name = "shift_name")
	private String shiftName;

	@NotNull(message = "Start time cannot be null")
	@Column(name = "start_time")
	private LocalTime startTime;

	@NotNull(message = "Start time cannot be null")
	@Column(name = "end_time")
	private LocalTime endTime;

	public Shifts() {
		super();
	}

	public Shifts(String shiftName, LocalTime startTime, LocalTime endTime) {
		super();
		this.shiftName = shiftName;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getShiftId() {
		return this.shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public String getShiftName() {
		return this.shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public LocalTime getStartTime() {
		return this.startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Shifts [shiftId=" + this.shiftId + ", shiftName=" + this.shiftName + ", startTime=" + this.startTime
				+ ", endTime=" + this.endTime + "]";
	}

}
