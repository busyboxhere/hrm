package com.hrm.attendenceservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.attendenceservice.dao.AttendenceDAO;
import com.hrm.attendenceservice.dto.PunchDetailsDTO;
import com.hrm.attendenceservice.entity.AttendanceDetails;
import com.hrm.attendenceservice.entity.Attendence;
import com.hrm.attendenceservice.entity.EventType;
import com.hrm.attendenceservice.service.AttendanceService;

import jakarta.transaction.Transactional;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	private static final Logger logger = LoggerFactory.getLogger(AttendanceServiceImpl.class);

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
	public Attendence registerPunch(PunchDetailsDTO punchDetailsDTO) {

		logger.debug("registerPunch() punchDetailsDTO :: {}", punchDetailsDTO);

		// derive the nature of event
		String lastAttendanceEventType = getLastAttendanceEventType(punchDetailsDTO).orElse("");

		logger.info("found event type " + lastAttendanceEventType);

		if (lastAttendanceEventType.equals(EventType.CHECK_IN.name())) {
			// take actions for break start
			return registerBreakStart(punchDetailsDTO);
		} else if (lastAttendanceEventType.equals(EventType.BREAK_START.name())) {
			// take actions for break end
			return registerBreakEnd(punchDetailsDTO);
		} else if (lastAttendanceEventType.equals(EventType.BREAK_END.name())) {
			// take actions for checkout
			return registerCheckOut(punchDetailsDTO);
		} else if (lastAttendanceEventType.equals(EventType.CHECK_OUT.name())
				|| lastAttendanceEventType.length() == 0) {
			// take actions for check in
			return registerCheckIn(punchDetailsDTO);
		}

		// throw an exception here if event type is not consistent
		return null;
	}

	@Override
	public Attendence registerCheckOut(PunchDetailsDTO punchDetailsDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attendence registerBreakEnd(PunchDetailsDTO punchDetailsDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attendence registerBreakStart(PunchDetailsDTO punchDetailsDTO) {
		logger.info("registerBreakStart()");
		return null;
	}

	@Override
	public Optional<String> getLastAttendanceEventType(PunchDetailsDTO punchDetailsDTO) {
		return attendenceDAO.getLastAttendanceEventType(punchDetailsDTO.getEmployeeId());
	}

	@Override
	public Attendence registerCheckIn(PunchDetailsDTO punchDetailsDTO) {
		logger.info("registerCheckIn()");
		AttendanceDetails attendanceDetails = new AttendanceDetails();
		attendanceDetails.setId(null);
		attendanceDetails.setOverTimeHours(null);
		attendanceDetails.setRemarks(punchDetailsDTO.getRemarks());
		attendanceDetails.setEventTimeStamp(punchDetailsDTO.getEventTimeStamp());
		attendanceDetails.setEventType(EventType.CHECK_IN);

		Attendence attendence = new Attendence();

//		attendence.setShiftId(new Shifts());
		attendence.setAttendanceId(null);
		attendence.setTotalWorkHours(null);
		attendence.setAttendanceDetailsId(attendanceDetails);
		attendence.setEmployeeId(punchDetailsDTO.getEmployeeId());

		return attendenceDAO.save(attendence);
	}

}
