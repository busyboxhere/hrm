package com.busybox.hrm.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.busybox.hrm.dao.EmployeeDAO;
import com.busybox.hrm.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);
	private final EntityManager entityManager;

	/**
	 * @param entityManager
	 */
	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return entityManager.merge(employee);
	}

	@Override
	public void deleteEmployee(String employeeId) {
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e where e.employeeId=:data",
				Employee.class);

		query.setParameter("data", employeeId);

		Employee employee = query.getSingleResult();

		entityManager.remove(employee);
	}

	@Override
	public Employee findEmployeeById(String employeeId) {
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e where e.employeeId = :data",
				Employee.class);

		query.setParameter("data", employeeId);

		Employee employee = query.getSingleResult();

		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = entityManager.createQuery("Select e from Employee e", Employee.class);

		List<Employee> resultList = query.getResultList();
		return resultList;
	}

}
