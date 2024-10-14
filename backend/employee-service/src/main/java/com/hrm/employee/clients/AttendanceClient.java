package com.hrm.employee.clients;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "attendence-service")
public interface AttendanceClient {
	@GetMapping("/attendances/{employeeId}")
	Optional<Object> findAttendanceByEmployeeId(@PathVariable String employeeId);
}
