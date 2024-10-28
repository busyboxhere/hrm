package com.hrm.attendenceservice.service;

import java.util.List;
import java.util.Optional;

import com.hrm.attendenceservice.dto.PunchDetailsDTO;
import com.hrm.attendenceservice.entity.Attendence;

public interface AttendanceService {
	List<Attendence> findAll();

	Optional<Attendence> findAttendanceById(String employeeId);

	Attendence registerPunch(PunchDetailsDTO attendanceDetailsDTO);

	Optional<String> getLastAttendanceEventType(PunchDetailsDTO punchDetailsDTO);

	Attendence registerCheckIn(PunchDetailsDTO attendanceDetailsDTO);

	Attendence registerCheckOut(PunchDetailsDTO punchDetailsDTO);

	Attendence registerBreakEnd(PunchDetailsDTO punchDetailsDTO);

	Attendence registerBreakStart(PunchDetailsDTO punchDetailsDTO);

}
