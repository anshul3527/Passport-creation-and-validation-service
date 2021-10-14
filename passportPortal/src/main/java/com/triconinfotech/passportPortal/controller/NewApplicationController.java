package com.triconinfotech.passportPortal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.triconinfotech.passportPortal.dto.User;
import com.triconinfotech.passportPortal.service.RestClient;

@Controller
@RequestMapping("/newApplication")
public class NewApplicationController {
	
	@Autowired
	private RestClient restclient;
	
	@GetMapping("")
	public String newApplication() {
		return "newApplication";
	}
	
	@PostMapping("/submit")
	public String submit(@ModelAttribute User user,  HttpServletRequest request) {
		System.out.println(user);
		User submittedUser = restclient.submitApplication(user);
		if(submittedUser != null) {
			request.getSession().setAttribute("Id", submittedUser.applicationId);
		}
		return "ApplicationStatus";
	}
	

}
