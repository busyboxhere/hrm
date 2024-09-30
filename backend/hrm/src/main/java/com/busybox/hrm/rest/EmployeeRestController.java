package com.busybox.hrm.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busybox.hrm.entity.Employee;
import com.busybox.hrm.entity.EmployeeDetails;
import com.busybox.hrm.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);

	EmployeeService employeeService;

	/**
	 * 
	 * @param employeeService
	 */
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
	public Employee saveEmployee(@RequestBody EmployeeDetails employeeDetails) {
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

//		EmployeeDetails savedEmployeeDetails = employeeService.saveEmployeeDetails(empDetails);

		Employee employee = new Employee();

		employee.setEmployeeId(employeeService.generateEmployeeId());
		employee.setEmployeeDetailsId(employeeDetails);
		return employeeService.saveEmployee(employee);
	}

}
