package com.hrm.employee.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.hrm.employee.entity.EmployeeDetails;

/**
 * 
 */
public interface EmployeeDetailsDAO extends ListCrudRepository<EmployeeDetails, Integer> {
}
