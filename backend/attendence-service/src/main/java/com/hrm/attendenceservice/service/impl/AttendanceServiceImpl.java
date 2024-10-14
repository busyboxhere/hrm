package com.hrm.attendenceservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.attendenceservice.dao.AttendenceDAO;
import com.hrm.attendenceservice.dto.AttendanceDetailsDTO;
import com.hrm.attendenceservice.entity.AttendanceDetails;
import com.hrm.attendenceservice.entity.Attendence;
import com.hrm.attendenceservice.service.AttendanceService;

import jakarta.transaction.Transactional;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	AttendenceDAO attendenceDAO;

	@Autowired
	public AttendanceServiceImpl(AttendenceDAO attendenceDAO) {
		super();
		this.attendenceDAO = attendenceDAO;
	}

	@Override
	public List<Attendence> findAll() {
		return this.attendenceDAO.findAll();
	}

	@Override
	public Optional<Attendence> findAttendanceById(String employeeId) {
		return this.attendenceDAO.findByEmployeeId(employeeId);
	}

	@Override
	@Transactional
	public Attendence save(AttendanceDetailsDTO attendanceDetailsDTO) {

		AttendanceDetails attendanceDetails = new AttendanceDetails();
		attendanceDetails.setOverTimeHours(0);
		attendanceDetails.setRemarks(attendanceDetailsDTO.getRemarks());
		attendanceDetails.setEventTimeStamp(attendanceDetailsDTO.getEventTimeStamp());
		attendanceDetails.setEventType(attendanceDetailsDTO.getEventType());

		Attendence attendence = new Attendence();

//		attendence.setShiftId(new Shifts());
		attendence.setTotalWorkHours(0);
		attendence.setAttendanceDetailsId(attendanceDetails);
		attendence.setEmployeeId(attendanceDetailsDTO.getEmployeeId());

		return attendenceDAO.save(attendence);
	}

}
