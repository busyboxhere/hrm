package com.hrm.employee.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.employee.dao.EmployeeDAO;
import com.hrm.employee.dao.EmployeeDetailsDAO;
import com.hrm.employee.entity.Employee;
import com.hrm.employee.exception.EmployeeNotFoundException;
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
		return employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		employeeDAO.deleteById(id);
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {

		return employeeDAO.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("unable to find employee with id " + id));
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAO.findAll();
	}

	@Override
	public String generateEmployeeId() {
		String employeeId = "EMP-" + UUID.randomUUID().toString();
		return employeeId;
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}

}
