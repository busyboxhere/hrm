package com.busybox.hrm.dao.impl;

import org.springframework.stereotype.Repository;

import com.busybox.hrm.dao.EmployeeDetailsDAO;
import com.busybox.hrm.entity.EmployeeDetails;

import jakarta.persistence.EntityManager;

/**
 * 
 */
@Repository
public class EmployeeDetailsDAOImpl implements EmployeeDetailsDAO {

	private final EntityManager entityManager;

	/**
	 * @param entityManager
	 */
	public EmployeeDetailsDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails) {
		return entityManager.merge(employeeDetails);
	}

}
