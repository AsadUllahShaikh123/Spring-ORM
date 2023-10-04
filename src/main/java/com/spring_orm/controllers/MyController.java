package com.spring_orm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.spring_orm.model.Student;
import com.spring_orm.service.StudentService;

@Controller
@EnableTransactionManagement
public class MyController {

	@Autowired
	private StudentService service;

	@RequestMapping("/register")
	public String register(@ModelAttribute Student student) {

		service.saveUser(student);

		System.out.println("Name : " + student.getName() + "Email : " + student.getEmail());
		return "redirect:/register";
	}

	@RequestMapping("/login")
	public String login(@ModelAttribute Student student) {
		
		
		return "login";
	}

	@RequestMapping("/success")
	public String success() {
		

		return "redirect:/login";
	}
	
	@RequestMapping("/google")
	public String getGoogleSite() {
		
		return "redirect:https://www.google.com/";
	}
	@RequestMapping("/youtube")
	public RedirectView getYoutubeSite() {
		RedirectView redirect = new RedirectView();
		
		redirect.setUrl("https://www.youtube.com/");
		return redirect;
	}

}
