package com.busybox.hrm.service;

import java.util.List;

import com.busybox.hrm.entity.Employee;
import com.busybox.hrm.entity.EmployeeDetails;

public interface EmployeeService {
	/**
	 * @param employee
	 */
	Employee saveEmployee(Employee employee);

	/**
	 * 
	 * @param employeeDetails
	 * @return
	 */
	EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails);

	/**
	 * 
	 * @param employeeId
	 */
	void deleteEmployee(String employeeId);

	/**
	 * 
	 * @param employeeId
	 * @return
	 */
	Employee findEmployeeById(String employeeId);

	/**
	 * 
	 * @return
	 */
	List<Employee> findAllEmployees();

	/**
	 * 
	 * @return
	 */
	String generateEmployeeId();
}
