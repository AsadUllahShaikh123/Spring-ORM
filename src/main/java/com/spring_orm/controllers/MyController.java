package com.spring_orm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_orm.model.Student;

@Controller
public class MyController {
	
	@RequestMapping("/register")
	public String register() {
		
		
		return "register";
	}
	
	@RequestMapping("login")
	public String login(@ModelAttribute Student student) {
		
		System.out.println("Name : "  + student.getName() + "Email : " + student.getEmail() );
		return "login";
	}
	@RequestMapping("success")
	public String success() {
		return "success";
	}

}
