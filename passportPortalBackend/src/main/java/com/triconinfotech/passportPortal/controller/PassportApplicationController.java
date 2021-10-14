package com.triconinfotech.passportPortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.triconinfotech.passportPortal.models.Application;
import com.triconinfotech.passportPortal.repository.ApplicationRepository;

@RestController
public class PassportApplicationController {
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@PostMapping("/applications")
	public ResponseEntity<Application> submitApplication(@RequestBody Application application) {
			Application submittedApplication = this.applicationRepository.save(application);
			System.out.println(submittedApplication);
			return new ResponseEntity<Application>(submittedApplication, HttpStatus.OK);
//		return this.applicationRepository.save(application);
	}

}
