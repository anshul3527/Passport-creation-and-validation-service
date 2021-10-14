package com.triconinfotech.passportPortal.controller;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.triconinfotech.passportPortal.dto.User;
import com.triconinfotech.passportPortal.service.RestClient;


@Controller

public class OfficerController {
	
	@Autowired
	private RestClient restClient;
	
	@GetMapping("/officer")
	public String showApplications(Model model) {
		List<User> applications = restClient.getAllApplications();

		model.addAttribute("applications", applications);
		return "UsersApplications";
	}
	
	@GetMapping("/validatePassport")
	public String editpage(HttpServletRequest request, Model model) {
		String applicationId = request.getParameter("id");
		System.out.println(applicationId);
		restClient.validateApplication(applicationId);
		return "redirect:/officer";
	
//	@GetMapping("/officer")
//	public String officerLogin() {
//		return "OfficerLogin";
//	}
//	
//	@PostMapping("/login")
//	public ModelAndView login(@ModelAttribute OfficerDetails officerDetails,ModelAndView model, HttpServletRequest request) {
//		if(restClient.authenticateOfficer(officerDetails)) {
//			request.getSession().setAttribute("officer", officerDetails);
//			request.getSession().setAttribute("isAuthorized", "true");
//			return new ModelAndView("redirect:/UsersApplications");
//		}else {
//			model.addObject("isAuthorized", "false");
//			model.setViewName("OfficerLogin");
//			return model;
//		}
//	}
	}
}
