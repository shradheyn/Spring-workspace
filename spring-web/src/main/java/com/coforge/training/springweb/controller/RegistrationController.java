package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.User;

/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 27, 2025
* Time     : 3:47:48 PM
* Project  : spring-web
*/
@Controller
public class RegistrationController {
	
	@GetMapping("/register")
	public String showRegisterForm(Model theModel) {
		
		theModel.addAttribute("user",new User());
		return "register";//return view+model
	}
	
	@PostMapping("/saveUser")
		public String submitForm(@ModelAttribute("user") User user, Model model) {
			model.addAttribute("user", user);
			return "success";
	}

}
