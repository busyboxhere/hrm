package com.hrm.employee.dto;

import java.time.LocalDate;

public class EmployeeDTO {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String gender;
	private boolean isMarried;
	private String phoneNumber1;
	private String phoneNumber2;
	private LocalDate dateOfBirth; // Use LocalDate for date representation
	private String avatar;
	private String address;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(String firstName, String lastName, String emailAddress, String gender, boolean isMarried,
			String phoneNumber1, String phoneNumber2, LocalDate dateOfBirth, String avatar, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.gender = gender;
		this.isMarried = isMarried;
		this.phoneNumber1 = phoneNumber1;
		this.phoneNumber2 = phoneNumber2;
		this.dateOfBirth = dateOfBirth;
		this.avatar = avatar;
		this.address = address;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isMarried() {
		return this.isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getPhoneNumber1() {
		return this.phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return this.phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress="
				+ this.emailAddress + ", gender=" + this.gender + ", isMarried=" + this.isMarried + ", phoneNumber1="
				+ this.phoneNumber1 + ", phoneNumber2=" + this.phoneNumber2 + ", dateOfBirth=" + this.dateOfBirth
				+ ", avatar=" + this.avatar + ", address=" + this.address + "]";
	}

}
