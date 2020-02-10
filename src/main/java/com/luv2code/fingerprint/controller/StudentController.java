package com.luv2code.fingerprint.controller;

import com.luv2code.fingerprint.entity.PersonalDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	// create a mapping for "/hello"
	
	@GetMapping("/register")
	public String sayHello(Model theModel) {

		theModel.addAttribute("personal", new PersonalDetails());
		return "register-user";
	}

	@GetMapping("/save")
	public String save(@ModelAttribute("personal")PersonalDetails personalDetails){

		System.out.println(personalDetails);

		return "saved";
	}

}








