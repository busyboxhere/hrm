package com.hrm.employee.dao;

import java.util.List;

import com.hrm.employee.entity.Employee;

/**
 * 
 */
public interface EmployeeDAO {
	/**
	 * @param employee
	 * @return
	 */
	Employee saveEmployee(Employee employee);

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
}
