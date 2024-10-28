package com.hrm.employee.service;

import java.util.List;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.exception.EmployeeNotFoundException;

public interface EmployeeService {
	/**
	 * @param employee
	 */
	Employee saveEmployee(Employee employee);

	/**
	 * 
	 * @param id
	 */
	void deleteEmployee(int id);

	/**
	 * 
	 * @param id
	 * @param employeeId
	 * @return
	 * @throws EmployeeNotFoundException
	 */
	Employee findEmployeeById(int id) throws EmployeeNotFoundException;

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
