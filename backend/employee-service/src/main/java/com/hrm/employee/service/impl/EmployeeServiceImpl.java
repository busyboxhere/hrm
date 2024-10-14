package com.hrm.employee.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.employee.dao.EmployeeDAO;
import com.hrm.employee.dao.EmployeeDetailsDAO;
import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.EmployeeDetails;
import com.hrm.employee.service.EmployeeService;

import jakarta.transaction.Transactional;

/**
 * 
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO;
	EmployeeDetailsDAO employeeDetailsDAO;

	/**
	 * @param employeeDAO
	 */
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO, EmployeeDetailsDAO employeeDetailsDAO) {
		this.employeeDAO = employeeDAO;
		this.employeeDetailsDAO = employeeDetailsDAO;
	}

	@Override
	@Transactional
	public Employee saveEmployee(Employee employee) {
		return employeeDAO.saveEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(String employeeId) {
		employeeDAO.deleteEmployee(employeeId);
	}

	@Override
	public Employee findEmployeeById(String employeeId) {
		return employeeDAO.findEmployeeById(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAO.findAllEmployees();
	}

	@Override
	public String generateEmployeeId() {
		String employeeId = "EMP-" + UUID.randomUUID().toString();
		return employeeId;
	}

	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails) {

		return employeeDetailsDAO.saveEmployeeDetails(employeeDetails);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.saveEmployee(employee);
	}

}
