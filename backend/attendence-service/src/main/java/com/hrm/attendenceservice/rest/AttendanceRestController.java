package com.hrm.attendenceservice.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.attendenceservice.dto.AttendanceDetailsDTO;
import com.hrm.attendenceservice.entity.Attendence;
import com.hrm.attendenceservice.service.AttendanceService;

@RestController
@RequestMapping("/api")
public class AttendanceRestController {
	private AttendanceService attendanceService;

	@Autowired
	public AttendanceRestController(AttendanceService attendanceService) {
		super();
		this.attendanceService = attendanceService;
	}

	@GetMapping("/attendances/{employeeId}")
	public Optional<Attendence> findAttendanceByEmployeeId(@PathVariable String employeeId) {
		return attendanceService.findAttendanceById(employeeId);
	}

	@PostMapping("/attendances")
	public Attendence save(@RequestBody AttendanceDetailsDTO attendanceDetailsDTO) {
		return attendanceService.save(attendanceDetailsDTO);
	}

}
