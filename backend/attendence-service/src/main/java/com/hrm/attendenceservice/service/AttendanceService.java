package com.hrm.attendenceservice.service;

import java.util.List;
import java.util.Optional;

import com.hrm.attendenceservice.dto.AttendanceDetailsDTO;
import com.hrm.attendenceservice.entity.Attendence;

public interface AttendanceService {
	List<Attendence> findAll();

	Optional<Attendence> findAttendanceById(String employeeId);

	Attendence save(AttendanceDetailsDTO attendanceDetailsDTO);
}
