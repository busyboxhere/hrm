package com.busybox.hrm.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

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
	@NotBlank(message = "First name is mandatory")
	@Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
	private String firstName;

	@NotBlank(message = "Last name is mandatory")
	@Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
	@Column(name = "last_name")
	private String lastName;

	@NotBlank(message = "Email address is mandatory")
	@Email(message = "Email should be valid")
	@Column(name = "email_address")
	private String emailAddress;

	@NotBlank(message = "Gender is mandatory")
	@Pattern(regexp = "Male|Female|Other", message = "Gender must be Male, Female, or Other")
	@Column(name = "gender")
	private String gender;

	@NotNull(message = "Marital status is mandatory")
	@Column(name = "isMarried")
	private boolean isMarried;

	@NotBlank(message = "Primary phone number is mandatory")
	@Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Primary phone number is invalid")
	@Column(name = "phone_number_1")
	private String phoneNumber1;

	@Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Secondary phone number is invalid")
	@Column(name = "phone_number_2")
	private String phoneNumber2;

	@NotNull(message = "Date of birth is mandatory")
	@Past(message = "Date of birth must be a past date")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Size(max = 255, message = "Avatar URL length must be less than 255 characters")
	@Column(name = "avatar")
	private String avatar;

	@Column(name = "address")
	@NotBlank(message = "Address is mandatory")
	@Size(min = 3, max = 255, message = "Address must be between 10 and 255 characters")
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
	public EmployeeDetails(String firstName, String lastName, String emailAddress, String gender, boolean isMarried,
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
	public boolean getIsMarried() {
		return this.isMarried;
	}

	/**
	 * @param isMarried
	 */
	public void setIsMarried(boolean isMarried) {
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
