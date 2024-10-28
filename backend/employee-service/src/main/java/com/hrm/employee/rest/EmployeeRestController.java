package com.hrm.employee.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.EmployeeDetails;
import com.hrm.employee.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);

	EmployeeService employeeService;

	/**
	 * 
	 * @param employeeService
	 */
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * @param param
	 * @return
	 */
	@GetMapping("/employee")
	public List<Employee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}

	/**
	 * @param employeeDetails
	 * @param employee
	 * @return
	 */
	@PostMapping("/employee")
	public Employee saveEmployee(@Valid @RequestBody EmployeeDetails employeeDetails) {
		logger.info("save employee payload {}", employeeDetails);

		EmployeeDetails empDetails = new EmployeeDetails();

		empDetails.setAddress(employeeDetails.getAddress());
		empDetails.setAvatar(employeeDetails.getAvatar());
		empDetails.setDateOfBirth(employeeDetails.getDateOfBirth());
		empDetails.setEmailAddress(employeeDetails.getEmailAddress());
		empDetails.setFirstName(employeeDetails.getFirstName());
		empDetails.setGender(employeeDetails.getGender());
		empDetails.setId(0);
		empDetails.setIsMarried(employeeDetails.getIsMarried());
		empDetails.setLastName(employeeDetails.getLastName());
		empDetails.setPhoneNumber1(employeeDetails.getPhoneNumber1());
		empDetails.setPhoneNumber2(employeeDetails.getPhoneNumber2());

		Employee employee = new Employee();

		employee.setEmployeeId(employeeService.generateEmployeeId());
		employee.setEmployeeDetailsId(employeeDetails);
		return employeeService.saveEmployee(employee);
	}

	/**
	 * @param employeeId
	 * @return
	 */
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		logger.info("Finding employee with id " + id);
		return employeeService.findEmployeeById(id);
	}

	/**
	 * @param employeeId
	 * @return
	 */
	@PutMapping("/employee")
	public Employee updateEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	/**
	 * @param employeeId
	 */
	@DeleteMapping("/employee/{id}")
	public void deleteEmployeeById(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}
