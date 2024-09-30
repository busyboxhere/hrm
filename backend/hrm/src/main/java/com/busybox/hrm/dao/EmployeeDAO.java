package com.busybox.hrm.dao;

import java.util.List;

import com.busybox.hrm.entity.Employee;

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
