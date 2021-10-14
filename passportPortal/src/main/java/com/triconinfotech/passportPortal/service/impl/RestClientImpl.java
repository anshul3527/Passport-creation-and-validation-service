package com.triconinfotech.passportPortal.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.triconinfotech.passportPortal.dto.OfficerDetails;
import com.triconinfotech.passportPortal.dto.User;
import com.triconinfotech.passportPortal.service.RestClient;
import com.triconinfotech.passportPortal.urls.ApiUrls;

@Service
public class RestClientImpl implements RestClient {
	
	private static RestTemplate restTemplate = new RestTemplate();

	@Transactional
	public User submitApplication(User user) {
	ResponseEntity<User> submitteduser = restTemplate.postForEntity(ApiUrls.SUBMIT_APPLICATION_API, user, User.class);
	System.out.println(submitteduser.getBody());
		return submitteduser.getBody();
	}

	@Transactional
	public boolean authenticateOfficer(OfficerDetails officerDetails) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("id", officerDetails.getUsername());
		System.out.println("abt to call for officer");
		OfficerDetails receivedOfficer = restTemplate.getForObject(ApiUrls.GET_OFFICER_DETAILS_API, OfficerDetails.class, param);
		System.out.println("officer calleds");
		System.out.println(receivedOfficer);
		if(receivedOfficer == null) {
			return false;
		}else {
			if(receivedOfficer.getPassword() == officerDetails.getPassword()) {
				return true;
			}else {
				return false;
			}
		}
	
		
	}

	public List<User> getAllApplications() {
//		Object[] result = restTemplate.getForObject(ApiUrls.GET_ALL_APPLICATIONS_API, Object[].class);
//		System.out.println(result);
//		return Arrays.asList(result);
		
		ResponseEntity<User[]> response = restTemplate.getForEntity(ApiUrls.GET_ALL_APPLICATIONS_API, User[].class);
		User[] users = response.getBody();
		List<User> userslist = Arrays.asList(users);
		return userslist;
	}

	public void validateApplication(String applicationId) {
		Map<String,String> param = new HashMap<String, String>();
		param.put("id", applicationId);
		String userStr = restTemplate.getForObject(ApiUrls.VALIDATE_APPLICATION_API, String.class, param);
	}
	


	
 
}
