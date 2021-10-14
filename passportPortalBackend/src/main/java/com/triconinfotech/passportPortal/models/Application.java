package com.triconinfotech.passportPortal.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Application")
public class Application {
	
	@Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID applicationId;
	
	@Column(name="FirstName")
	public String firstName;
	
	@Column(name="LastName")
	public String lastName;
	
	@Column(name="Email")
	public String email;
	
	@Column(name="DateofBirth")
	public String dateOfBirth;
	
	@Column(name="Nationality")
	public String nationality;
	
	

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(UUID applicationId, String firstName, String lastName, String email, String dateOfBirth,
			String nationality) {
		super();
		this.applicationId = applicationId;
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
		return "Application [applicationId=" + applicationId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality + "]";
	}
}
