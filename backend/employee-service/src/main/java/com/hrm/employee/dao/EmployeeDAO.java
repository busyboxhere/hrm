package com.hrm.employee.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.hrm.employee.entity.Employee;

/**
 * 
 */
public interface EmployeeDAO extends ListCrudRepository<Employee, Integer> {

}
