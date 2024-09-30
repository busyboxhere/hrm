package com.busybox.hrm.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "employeeDetails")
public class EmployeeDetails extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "gender")
	private String gender;

	@Column(name = "isMarried")
	private byte isMarried;

	@Column(name = "phone_number_1")
	private String phoneNumber1;

	@Column(name = "phone_number_2")
	private String phoneNumber2;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "avatar")
	private String avatar;

	@Column(name = "address")
	private String address;

	/**
	 * 
	 */
	public EmployeeDetails() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param gender
	 * @param isMarried
	 * @param phoneNumner1
	 * @param phoneNumner2
	 * @param dateOfBirth
	 * @param avatar
	 * @param address
	 */
	public EmployeeDetails(String firstName, String lastName, String emailAddress, String gender, byte isMarried,
			String phoneNumner1, String phoneNumner2, Date dateOfBirth, String avatar, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.gender = gender;
		this.isMarried = isMarried;
		this.phoneNumber1 = phoneNumner1;
		this.phoneNumber2 = phoneNumner2;
		this.dateOfBirth = dateOfBirth;
		this.avatar = avatar;
		this.address = address;
	}

	/**
	 * @return
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmailAddress() {
		return this.emailAddress;
	}

	/**
	 * 
	 * @param emailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * 
	 * @return
	 */
	public String getGender() {
		return this.gender;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return
	 */
	public byte getIsMarried() {
		return this.isMarried;
	}

	/**
	 * @param isMarried
	 */
	public void setIsMarried(byte isMarried) {
		this.isMarried = isMarried;
	}

	/**
	 * @return
	 */
	public String getPhoneNumber1() {
		return this.phoneNumber1;
	}

	/**
	 * @param phoneNumner1
	 */
	public void setPhoneNumber1(String phoneNumner1) {
		this.phoneNumber1 = phoneNumner1;
	}

	/**
	 * @return
	 */
	public String getPhoneNumber2() {
		return this.phoneNumber2;
	}

	/**
	 * @param phoneNumner2
	 */
	public void setPhoneNumber2(String phoneNumner2) {
		this.phoneNumber2 = phoneNumner2;
	}

	/**
	 * @return
	 */
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return
	 */
	public String getAvatar() {
		return this.avatar;
	}

	/**
	 * @param avatar
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", emailAddress=" + this.emailAddress + ", gender=" + this.gender + ", isMarried=" + this.isMarried
				+ ", phoneNumner1=" + this.phoneNumber1 + ", phoneNumner2=" + this.phoneNumber2 + ", dateOfBirth="
				+ this.dateOfBirth + ", avatar=" + this.avatar + ", address=" + this.address + "]";
	}

}
