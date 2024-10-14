package com.hrm.employee.service;

import java.util.List;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.EmployeeDetails;

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

	/**
	 * 
	 * @param employee
	 * @return
	 */
	Employee updateEmployee(Employee employee);
}
