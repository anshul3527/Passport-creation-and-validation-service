package com.triconinfotech.passportPortal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="officerDetails")
public class OfficerDetails {
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name="password")
	private String password;
	public OfficerDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "OfficerDetails [username=" + username + ", password=" + password + "]";
	}
	
	
	

}
