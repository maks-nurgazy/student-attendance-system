package com.luv2code.fingerprint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class DemoController {

	// create a mapping for "/hello"
	
	@GetMapping("/register")
	public String sayHello(Model theModel) {

		theModel.addAttribute("name", "Maksatbek");

		return "register-user";
	}
}








