package com.triconinfotech.passportPortal.service;

import java.util.List;
import java.util.Objects;

import com.triconinfotech.passportPortal.dto.OfficerDetails;
import com.triconinfotech.passportPortal.dto.User;

public interface RestClient {
	
	public User submitApplication(User user);

	public boolean authenticateOfficer(OfficerDetails officerDetails);

	public List<User> getAllApplications();

	public void validateApplication(String applicationId);

}
