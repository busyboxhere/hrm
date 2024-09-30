package com.busybox.hrm.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "Employee")
public class Employee extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "employee_id")
	private String employeeId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_details_id")
	private EmployeeDetails employeeDetailsId;

	public Employee() {
		super();
	}

	public Employee(String employeeId, EmployeeDetails employeeDetailsId) {
		super();
		this.employeeId = employeeId;
		this.employeeDetailsId = employeeDetailsId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeDetails getEmployeeDetailsId() {
		return this.employeeDetailsId;
	}

	public void setEmployeeDetailsId(EmployeeDetails employeeDetailsId) {
		this.employeeDetailsId = employeeDetailsId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", employeeId=" + this.employeeId + ", employeeDetailsId="
				+ this.employeeDetailsId + "]";
	}

}
