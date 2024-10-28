package com.hrm.attendenceservice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendence extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_id")
	private Integer attendanceId;

	@Column(name = "employee_id")
	private String employeeId;

	@Column(name = "total_work_hours")
	private Float totalWorkHours;

//	@OneToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "shift_id")
//	private Shifts shiftId;

	@OneToOne(cascade = { CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "attendance_details_id")
	private AttendanceDetails attendanceDetailsId;

	public Attendence() {
		super();
	}

	public Attendence(String employeeId, Float totalWorkHours,
			/* Shifts shiftId, */ AttendanceDetails attendanceDetailsId) {
		super();
		this.employeeId = employeeId;
		this.totalWorkHours = totalWorkHours;
//		this.shiftId = shiftId;
		this.attendanceDetailsId = attendanceDetailsId;
	}

	public Integer getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Float getTotalWorkHours() {
		return this.totalWorkHours;
	}

	public void setTotalWorkHours(Float totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}

	/*
	 * public Shifts getShiftId() { return this.shiftId; }
	 * 
	 * public void setShiftId(Shifts shiftId) { this.shiftId = shiftId; }
	 */
	public AttendanceDetails getAttendanceDetailsId() {
		return this.attendanceDetailsId;
	}

	public void setAttendanceDetailsId(AttendanceDetails attendanceDetailsId) {
		this.attendanceDetailsId = attendanceDetailsId;
	}

	@Override
	public String toString() {
		return "Attendence [attendanceId=" + this.attendanceId + ", employeeId=" + this.employeeId + ", totalWorkHours="
				+ this.totalWorkHours + /* ", shiftId=" + this.shiftId + */ ", attendanceDetailsId="
				+ this.attendanceDetailsId + "]";
	}

}
