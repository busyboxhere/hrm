package com.busybox.hrm.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busybox.hrm.dao.EmployeeDAO;
import com.busybox.hrm.dao.EmployeeDetailsDAO;
import com.busybox.hrm.entity.Employee;
import com.busybox.hrm.entity.EmployeeDetails;
import com.busybox.hrm.service.EmployeeService;

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
