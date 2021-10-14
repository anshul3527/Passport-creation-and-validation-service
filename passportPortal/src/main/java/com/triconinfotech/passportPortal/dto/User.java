package com.triconinfotech.passportPortal.dto;

import java.util.UUID;

public class User {
	public UUID applicationId;
	public String firstName;
	public String lastName;
	public String email;
	public String dateOfBirth;
	public String nationality;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(UUID applicationId, String firstName, String lastName, String email, String dateOfBirth,
			String nationality) {
		super();
		this.applicationId = applicationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
	}

	public User(String firstName, String lastName, String email, String dateOfBirth, String nationality) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
	}
	
	
	public UUID getApplicationId() {
		return applicationId;
	}


	public void setApplicationId(UUID applicationId) {
		this.applicationId = applicationId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "User [applicationId=" + applicationId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality + "]";
	}
	
	
}
