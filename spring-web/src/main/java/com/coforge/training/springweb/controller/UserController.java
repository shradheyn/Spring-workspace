package com.coforge.training.springweb.controller;
/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 29, 2025
* Time     : 10:29:54 AM
* Project  : spring-web
*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
	public String userInfo(ModelMap model) {
		model.addAttribute("user" , "Rod Johnson");
		model.addAttribute("d" , new java.util.Date() );
		return "user";
	}
	
	@RequestMapping("/spring")
	public String showSecond() {
		return "second";  //returns Views
	}
}
