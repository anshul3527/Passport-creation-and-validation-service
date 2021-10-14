package com.triconinfotech.passportPortal.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triconinfotech.passportPortal.exceptions.ResourceNotFoundException;
import com.triconinfotech.passportPortal.models.Application;
import com.triconinfotech.passportPortal.models.OfficerDetails;
import com.triconinfotech.passportPortal.models.ValidatedApplication;
import com.triconinfotech.passportPortal.repository.ApplicationRepository;
import com.triconinfotech.passportPortal.repository.OfficerRepository;
import com.triconinfotech.passportPortal.repository.ValidatedApplicationRepository;

@RestController
@RequestMapping("/officer")
public class PassportOfficerController {
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private OfficerRepository officerRepository;
	
	@Autowired
	private ValidatedApplicationRepository validatedApplicationRepository;
	
	@GetMapping("/applications")
	public List<Application> getAllApplications() {
		return applicationRepository.findAll();
	}
	
	@GetMapping("/applications/{id}")
	public ValidatedApplication getEmployeeById(@PathVariable (value = "id") UUID applicationId) throws ResourceNotFoundException {
	 
		Application receivedApplication = this.applicationRepository.findById(applicationId)
		.orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + applicationId));	
	    ValidatedApplication application = new ValidatedApplication(receivedApplication.getApplicationId(), receivedApplication.firstName, receivedApplication.lastName, receivedApplication.getEmail(), receivedApplication.getDateOfBirth(), receivedApplication.getNationality());
	    ValidatedApplication validatedApplication = this.validatedApplicationRepository.save(application);
	    applicationRepository.deleteById(application.getApplicationId());
		return validatedApplication;
	}
	
	// get user by id
		@GetMapping("/{id}")
		public ResponseEntity<Optional<OfficerDetails>> getUserById(@PathVariable (value = "id") String username)  {
			System.out.println("I got called");
			System.out.println(username);
			Optional<OfficerDetails> details = officerRepository.findById(username);
			return ResponseEntity.ok().body(details);
		}
	
}
