package com.hrm.attendenceservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import com.hrm.attendenceservice.entity.Attendence;

public interface AttendenceDAO extends ListCrudRepository<Attendence, Integer> {

	@Query("Select a from Attendence a where a.employeeId=:employeeId")
	Optional<Attendence> findByEmployeeId(@Param("employeeId") String employeeId);
}
